// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
     * 
     */
    @EnumType
    public enum AggregationCrossSeriesReducer {
        /**
         * No cross-time series reduction. The output of the Aligner is returned.
         * 
         */
        ReduceNone("REDUCE_NONE"),
        /**
         * Reduce by computing the mean value across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics with numeric or distribution values. The value_type of the output is DOUBLE.
         * 
         */
        ReduceMean("REDUCE_MEAN"),
        /**
         * Reduce by computing the minimum value across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics with numeric values. The value_type of the output is the same as the value_type of the input.
         * 
         */
        ReduceMin("REDUCE_MIN"),
        /**
         * Reduce by computing the maximum value across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics with numeric values. The value_type of the output is the same as the value_type of the input.
         * 
         */
        ReduceMax("REDUCE_MAX"),
        /**
         * Reduce by computing the sum across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics with numeric and distribution values. The value_type of the output is the same as the value_type of the input.
         * 
         */
        ReduceSum("REDUCE_SUM"),
        /**
         * Reduce by computing the standard deviation across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics with numeric or distribution values. The value_type of the output is DOUBLE.
         * 
         */
        ReduceStddev("REDUCE_STDDEV"),
        /**
         * Reduce by computing the number of data points across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics of numeric, Boolean, distribution, and string value_type. The value_type of the output is INT64.
         * 
         */
        ReduceCount("REDUCE_COUNT"),
        /**
         * Reduce by computing the number of True-valued data points across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics of Boolean value_type. The value_type of the output is INT64.
         * 
         */
        ReduceCountTrue("REDUCE_COUNT_TRUE"),
        /**
         * Reduce by computing the number of False-valued data points across time series for each alignment period. This reducer is valid for DELTA and GAUGE metrics of Boolean value_type. The value_type of the output is INT64.
         * 
         */
        ReduceCountFalse("REDUCE_COUNT_FALSE"),
        /**
         * Reduce by computing the ratio of the number of True-valued data points to the total number of data points for each alignment period. This reducer is valid for DELTA and GAUGE metrics of Boolean value_type. The output value is in the range 0.0, 1.0 and has value_type DOUBLE.
         * 
         */
        ReduceFractionTrue("REDUCE_FRACTION_TRUE"),
        /**
         * Reduce by computing the 99th percentile (https://en.wikipedia.org/wiki/Percentile) of data points across time series for each alignment period. This reducer is valid for GAUGE and DELTA metrics of numeric and distribution type. The value of the output is DOUBLE.
         * 
         */
        ReducePercentile99("REDUCE_PERCENTILE_99"),
        /**
         * Reduce by computing the 95th percentile (https://en.wikipedia.org/wiki/Percentile) of data points across time series for each alignment period. This reducer is valid for GAUGE and DELTA metrics of numeric and distribution type. The value of the output is DOUBLE.
         * 
         */
        ReducePercentile95("REDUCE_PERCENTILE_95"),
        /**
         * Reduce by computing the 50th percentile (https://en.wikipedia.org/wiki/Percentile) of data points across time series for each alignment period. This reducer is valid for GAUGE and DELTA metrics of numeric and distribution type. The value of the output is DOUBLE.
         * 
         */
        ReducePercentile50("REDUCE_PERCENTILE_50"),
        /**
         * Reduce by computing the 5th percentile (https://en.wikipedia.org/wiki/Percentile) of data points across time series for each alignment period. This reducer is valid for GAUGE and DELTA metrics of numeric and distribution type. The value of the output is DOUBLE.
         * 
         */
        ReducePercentile05("REDUCE_PERCENTILE_05");

        private final String value;

        AggregationCrossSeriesReducer(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AggregationCrossSeriesReducer[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
