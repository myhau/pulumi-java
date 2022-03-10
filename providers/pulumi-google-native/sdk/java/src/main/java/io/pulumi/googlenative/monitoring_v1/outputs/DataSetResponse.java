// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesQueryResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSetResponse {
    /**
     * A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label's value.
     * 
     */
    private final String legendTemplate;
    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
     */
    private final String minAlignmentPeriod;
    /**
     * How this data should be plotted on the chart.
     * 
     */
    private final String plotType;
    /**
     * Optional. The target axis to use for plotting the metric.
     * 
     */
    private final String targetAxis;
    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    private final TimeSeriesQueryResponse timeSeriesQuery;

    @OutputCustomType.Constructor
    private DataSetResponse(
        @OutputCustomType.Parameter("legendTemplate") String legendTemplate,
        @OutputCustomType.Parameter("minAlignmentPeriod") String minAlignmentPeriod,
        @OutputCustomType.Parameter("plotType") String plotType,
        @OutputCustomType.Parameter("targetAxis") String targetAxis,
        @OutputCustomType.Parameter("timeSeriesQuery") TimeSeriesQueryResponse timeSeriesQuery) {
        this.legendTemplate = legendTemplate;
        this.minAlignmentPeriod = minAlignmentPeriod;
        this.plotType = plotType;
        this.targetAxis = targetAxis;
        this.timeSeriesQuery = timeSeriesQuery;
    }

    /**
     * A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label's value.
     * 
    */
    public String getLegendTemplate() {
        return this.legendTemplate;
    }
    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
    */
    public String getMinAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }
    /**
     * How this data should be plotted on the chart.
     * 
    */
    public String getPlotType() {
        return this.plotType;
    }
    /**
     * Optional. The target axis to use for plotting the metric.
     * 
    */
    public String getTargetAxis() {
        return this.targetAxis;
    }
    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
    */
    public TimeSeriesQueryResponse getTimeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String legendTemplate;
        private String minAlignmentPeriod;
        private String plotType;
        private String targetAxis;
        private TimeSeriesQueryResponse timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.legendTemplate = defaults.legendTemplate;
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.plotType = defaults.plotType;
    	      this.targetAxis = defaults.targetAxis;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder setLegendTemplate(String legendTemplate) {
            this.legendTemplate = Objects.requireNonNull(legendTemplate);
            return this;
        }

        public Builder setMinAlignmentPeriod(String minAlignmentPeriod) {
            this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
            return this;
        }

        public Builder setPlotType(String plotType) {
            this.plotType = Objects.requireNonNull(plotType);
            return this;
        }

        public Builder setTargetAxis(String targetAxis) {
            this.targetAxis = Objects.requireNonNull(targetAxis);
            return this;
        }

        public Builder setTimeSeriesQuery(TimeSeriesQueryResponse timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }
        public DataSetResponse build() {
            return new DataSetResponse(legendTemplate, minAlignmentPeriod, plotType, targetAxis, timeSeriesQuery);
        }
    }
}
