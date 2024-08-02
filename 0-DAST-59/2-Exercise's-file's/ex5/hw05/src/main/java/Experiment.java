import java.util.Random;

public class Experiment {

    private static final long RANDOM_SEED = 12345L;

    public static class Result implements Comparable<Result> {

        private final int length;
        private final double milliseconds;

        public Result(int length, double milliseconds) {
            this.length = length;
            this.milliseconds = milliseconds;
            if (milliseconds < 0.0) {
                throw new IllegalArgumentException("Time taken cannot be negative");
            }
        }

        public int length() {
            return length;
        }

        public double time() {
            return milliseconds;
        }

        @Override
        public int compareTo(Result benchmarkResult) {
            return Integer.compare(this.length, benchmarkResult.length);
        }
    }


    public static class Parameters {
        private long minRandomNumber = 0L;
        private long maxRandomNumber = 2047L;
        private int minLengthExponent = 10;
        private int maxLengthExponent = 21;
        private int trialsPerLength = 6;
        private Random generator = null;

        public Parameters() {
        }

        public Parameters minRandomNumber(long lowerBound) {
            if (lowerBound < 0) {
                throw new IllegalArgumentException("Lower bound must be 0 or higher.");
            }
            minRandomNumber = lowerBound;
            return this;
        }

        public Parameters maxRandomLong(long upperBound) {
            maxRandomNumber = upperBound;
            return this;
        }

        public Parameters minLengthExponent(int exponent) {
            minLengthExponent = validateExponent(exponent);
            return this;
        }

        public Parameters maxLengthExponent(int exponent) {
            maxLengthExponent = validateExponent(exponent);
            return this;
        }

        public Parameters trialsPerArrayLength(int numTrials) {
            trialsPerLength = numTrials;
            return this;
        }

        public long getMinRandomNumber() {
            return minRandomNumber;
        }

        public long getMaxRandomNumber() {
            return maxRandomNumber;
        }

        public int getMinLengthExponent() {
            return minLengthExponent;
        }

        public int getMaxLengthExponent() {
            return maxLengthExponent;
        }

        public int getTrialsPerLength() {
            return trialsPerLength;
        }

        public String getTitle() {
            return String.format("Value range: [%,d, %,d)", minRandomNumber, maxRandomNumber);
        }

        public Random randomGenerator() {
            if (generator == null) {
                generator = new Random(RANDOM_SEED);
            }
            return generator;
        }

        public void resetRandomness() {
            generator = null;
        }

        private static int validateExponent(int exponent) {
            if (exponent < 0 || 31 < exponent) {
                throw new IllegalArgumentException("Exponent must be between 0 and 31 (inclusive)");
            }
            return exponent;
        }

    }
}
