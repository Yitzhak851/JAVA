import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultPlotter {
    private final static int OUTPUT_WIDTH_PX = 1_000;
    private final static int OUTPUT_HEIGHT_PX = 1_000;
    private final static int OUTPUT_SCALE_FACTOR = 2;

    private final Map<String, List<Experiment.Result>> lineData = new HashMap<>();

    /**
     * Given a dataset corresponding to points on various lines, render a graph and save it to a PNG.
     * @param outputPath - location to store PNG
     * @param dataset - points along one or more lines
     * @param title - Title to place at the top of the graph
     * @throws IOException in case writing the PNG to disk fails for any reason
     */
    private static void saveDatasetToPng(File outputPath, DefaultXYDataset dataset, String title) throws IOException {
        JFreeChart lineChart = ChartFactory.createXYLineChart(title, "Array size (n)",
                "Time (ms)", dataset, PlotOrientation.VERTICAL, true, true, false);
        XYPlot plot = lineChart.getXYPlot();

        LogAxis xAxis = new LogAxis("Array size (n)");
        xAxis.setBase(2);
        xAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        plot.setDomainAxis(xAxis);


        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            plot.getRenderer().setSeriesStroke(i, new BasicStroke(2.5f));
        }

        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinePaint(Color.darkGray);

        FileOutputStream outputStream = new FileOutputStream(outputPath);
        ChartUtils.writeScaledChartAsPNG(outputStream, lineChart, OUTPUT_WIDTH_PX, OUTPUT_HEIGHT_PX, OUTPUT_SCALE_FACTOR, OUTPUT_SCALE_FACTOR);
    }

    /**
     * Ingest the data for a new line. Subsequent renders will contain this line data
     * @param lineName - human-friendly name for this data
     * @param results - List of Experiment.Results, each of which corresponds to a single point
     */
    public void addLineData(String lineName, List<Experiment.Result> results) {
        lineData.put(lineName, results);
    }

    /**
     * Render a graph and save the content to a PNG. The data in the graph will be all data provided to the object
     * thus far. Lines are added with the function addLineData.
     * @param outputPath - location to store PNG
     * @param title - Title to place at the top of the graph
     * @throws IOException in case writing the PNG to disk fails for any reason
     */
    public void render(File outputPath, String title) throws IOException {
        DefaultXYDataset dataset = new DefaultXYDataset();

        for (Map.Entry<String, List<Experiment.Result>> entry : lineData.entrySet()) {
            String name = entry.getKey();
            List<Experiment.Result> results = entry.getValue();
            double[][] series = new double[2][results.size()];

            for (int i = 0; i < results.size(); i++) {
                series[0][i] = results.get(i).length();
                series[1][i] = results.get(i).time();
            }

            dataset.addSeries(name, series);
        }

        saveDatasetToPng(outputPath, dataset, title);
    }
}
