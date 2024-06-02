import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortAnalyser {

    final static File OUTPUT_DIRECTORY = new File("output");
    final static int MAX_EXPONENT_LENGTH = 16;

    /**
     * Generate a stream of randomly generated Longs
     * @param numElements - number of elements the stream will contain
     * @param params - Experiment parameters which determine (among other things) the range of numbers randomly chosen
     * @return - Stream of Long objects
     */
    private static Stream<Long> createRandomLongStream(int numElements, Experiment.Parameters params) {
        return params.randomGenerator().longs(numElements, params.getMinRandomNumber(), params.getMaxRandomNumber()).boxed();
    }

    /**
     * Determine if an array of Comparables is in ascending order (least to biggest).
     * @param array - array of elements to check
     * @return - True if array is sorted in ascending order, otherwise false
     * @param <T> - Type of elements in array, must extend comparable.
     */
    private static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Benchmarks a given sorting function against a stream of arrays. The sorting function is called for each array
     * in the stream, and the performance is tracked. For each array, the length of the time (in milliseconds) taken to
     * sort the array are measured.
     * @param sortingFunction - function taking one argument: an array of Comparables. Should sort these objects in ascending order
     * @param arrays - Supplier for a Stream of arrays.
     * @return - List of all benchmarking results (Experiment.Result) ordered by size of the array which generated the result
     * @param <T> - Type of elements in arrays, must extend comparable.
     */
    private static <T extends Comparable<T>> List<Experiment.Result> sorterTest(Consumer<T[]> sortingFunction, Supplier<Stream<T[]>> arrays) {
        return arrays.get().map(
                        array -> {
                            T[] clonedArray = array.clone();
                            long singleSortStartTime = System.currentTimeMillis();
                            sortingFunction.accept(clonedArray);
                            long singleSortTotalTime = System.currentTimeMillis() - singleSortStartTime;

                            if (!isSorted(clonedArray)) {
                                throw new RuntimeException(String.format("Failed to sort array of size %d", array.length));
                            }

                            ensureIsPermutation(array, clonedArray);

                            return new Experiment.Result(array.length, singleSortTotalTime);
                        })
                .collect(Collectors.groupingBy(Experiment.Result::length, Collectors.averagingDouble(Experiment.Result::time)))
                .entrySet().stream().map(e -> new Experiment.Result(e.getKey(), e.getValue()))
                .sorted().collect(Collectors.toList());
    }

    /**
     * Given two arrays, verifies that the arrays are equivalent other than the ordering of the elements.
     * In case this is not so, a RuntimeException is thrown.
     * @param primary - first array
     * @param secondary - second array
     * @param <T> - Type of elements in array, must extend comparable.
     */
    private static <T extends Comparable<T>> void ensureIsPermutation(T[] primary, T[] secondary) {
        if (primary.length != secondary.length) {
            throw new RuntimeException("Lengths differ: arrays are not permutations");
        }
        Arrays.sort(primary);

        for (int i = 0; i < primary.length; i++) {
            if (primary[i].compareTo(secondary[i]) != 0) {
                throw new RuntimeException("Element mismatch: arrays are not permutations");
            }
        }
    }

    /**
     * Generate a stream of arrays, arrays are of type Long.
     * @param params - contains details which determine the size of the returned stream, the possible values in each array, etc.
     * @return - Supplier of Stream of Long[]
     */
    private static Supplier<Stream<Long[]>> streamOfArrays(Experiment.Parameters params) {
        return () -> IntStream.range(params.getMinLengthExponent(), params.getMaxLengthExponent())
                .flatMap(i -> IntStream.of(2 << i, 3 << i))
                .flatMap(i -> IntStream.generate(() -> i).limit(params.getTrialsPerLength())).boxed()
                .map(l -> createRandomLongStream(l, params).toArray(Long[]::new));
    }

    /**
     * Perform benchmarking and generate results. Experiments pertain to arrays with VERY narrow ranges, i.e. very few
     * unique values.
     * @throws IOException - in case the graph cannot be saved as a PNG
     */
    public static void comparisonVeryNarrowRange() throws IOException {
        Experiment.Parameters params = new Experiment.Parameters()
                .minRandomNumber(200)
                .maxRandomLong(300)
                .minLengthExponent(12)
                .maxLengthExponent(MAX_EXPONENT_LENGTH);

        System.out.println("Starting experiment: veryNarrowRangeSmallNumbers");
        performExperiment(params, new File(OUTPUT_DIRECTORY, "veryNarrowRangeSmallNumbers.png"));
        params.minRandomNumber(2 << 20)
                .maxRandomLong((2 << 20) + 50)
                .resetRandomness();

        System.out.println("Starting experiment: veryNarrowRangeLargeNumbers");
        performExperiment(params, new File(OUTPUT_DIRECTORY, "veryNarrowRangeLargeNumbers.png"));
    }

    /**
     * Perform benchmarking and generate results. Experiments pertain to arrays with narrow ranges, i.e. not many
     * unique values.
     * @throws IOException - in case the graph cannot be saved for any reason
     */
    public static void comparisonNarrowRange() throws IOException {
        Experiment.Parameters params = new Experiment.Parameters()
                .minRandomNumber(0)
                .maxRandomLong(255)
                .minLengthExponent(12)
                .maxLengthExponent(MAX_EXPONENT_LENGTH);

        System.out.println("Starting experiment: narrowRangeSmallNumbers");
        performExperiment(params, new File(OUTPUT_DIRECTORY, "narrowRangeSmallNumbers.png"));

        params.minRandomNumber(0)
                .maxRandomLong(Long.MAX_VALUE)
                .resetRandomness();

        System.out.println("Starting experiment: largeNumbers");
        performExperiment(params, new File(OUTPUT_DIRECTORY, "largeNumbers.png"));
    }

    /**
     * Given the parameters of an experiment and a file location, runs the experiment for several sorting functions
     * and saves the resulting graph at the file location.
     * @param params - determines the specifics of the experiment to perform.
     * @param outputPath - PNG of graph will be written to this location
     * @throws IOException in case the graph cannot be saved for any reason
     */
    private static void performExperiment(Experiment.Parameters params, File outputPath) throws IOException {
        Supplier<Stream<Long[]>> numberArraysStream = streamOfArrays(params);
        ResultPlotter plotter = new ResultPlotter();
        List<Integer> digitWidths = List.of(1, 4, 8, 16, 20);

        Map<String, Consumer<Long[]>> sorters = new HashMap<>(Map.of("quicksort", Sorter::quickSort, "mergesort", Sorter::mergeSortNoRecursion));

        for (Integer numBits : digitWidths) {
            sorters.put("radix" + numBits, (arr) -> Sorter.radixSort(arr, numBits));
        }

        for (String sortName : sorters.keySet()) {
            plotter.addLineData(sortName, sorterTest(sorters.get(sortName), numberArraysStream));
        }

        List<Experiment.Result> linearTime = linearTimeApprox(params.trialsPerArrayLength(10));
        plotter.addLineData("O(n)", linearTime);

        List<Experiment.Result> nLogNTimeApprox = linearTime.stream()
                .map(res -> new Experiment.Result(res.length(), res.time() * Math.log(res.length()) / Math.log(2)))
                .collect(Collectors.toList());
        plotter.addLineData("O(nLog(n))", nLogNTimeApprox);

        plotter.render(outputPath, params.getTitle());
    }

    /**
     * This function benchmarks an O(n) function against experiment parameters. This allows us to graph a line which
     * can be considered O(n) in the graph of our sorting experiments.
     * @param params - determines the size of inputs to this function (i.e., n)
     * @return - List of benchmark results ordered by input size (n)
     */
    private static List<Experiment.Result> linearTimeApprox(Experiment.Parameters params) {
        /* Used as a baseline O(n) algorithm */

        final double scalingConstant = 2.0;
        AtomicLong counter = new AtomicLong();
        List<Experiment.Result> results = streamOfArrays(params).get().map(
                (arr) -> {
                    long startTime = System.nanoTime();
                    for (int i = 1; i < arr.length; i++) {
                        arr[i] = arr[i] + arr[i - 1];
                    }
                    counter.updateAndGet(v -> v ^ arr[params.getMinLengthExponent()]);
                    return new Experiment.Result(arr.length, scalingConstant * (System.nanoTime() - startTime) / 1_000_000.0);
                }
        ).collect(Collectors.groupingBy(Experiment.Result::length, Collectors.averagingDouble(Experiment.Result::time)))
                .entrySet().stream().map(e -> new Experiment.Result(e.getKey(), e.getValue()))
                .sorted().collect(Collectors.toList());
        System.out.println(counter.get() & 1);
        return results;
    }

    public static void main(String[] args) throws Exception {
        try {
            if (OUTPUT_DIRECTORY.mkdir()) {
                System.out.printf("Created directory '%s'%n", OUTPUT_DIRECTORY.getAbsolutePath());
            }
        } catch (SecurityException e) {
            System.out.println("Exception occurred while trying to create output directory");
            System.out.println("Program will continue but will crash if folder does not exist");
        }

        comparisonVeryNarrowRange();
        comparisonNarrowRange();
    }
}
