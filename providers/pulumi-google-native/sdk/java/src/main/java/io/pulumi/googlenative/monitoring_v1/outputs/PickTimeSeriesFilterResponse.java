// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PickTimeSeriesFilterResponse {
    /**
     * How to use the ranking to select time series that pass through the filter.
     * 
     */
    private final String direction;
    /**
     * How many time series to allow to pass through the filter.
     * 
     */
    private final Integer numTimeSeries;
    /**
     * ranking_method is applied to each time series independently to produce the value which will be used to compare the time series to other time series.
     * 
     */
    private final String rankingMethod;

    @OutputCustomType.Constructor({"direction","numTimeSeries","rankingMethod"})
    private PickTimeSeriesFilterResponse(
        String direction,
        Integer numTimeSeries,
        String rankingMethod) {
        this.direction = direction;
        this.numTimeSeries = numTimeSeries;
        this.rankingMethod = rankingMethod;
    }

    /**
     * How to use the ranking to select time series that pass through the filter.
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * How many time series to allow to pass through the filter.
     * 
    */
    public Integer getNumTimeSeries() {
        return this.numTimeSeries;
    }
    /**
     * ranking_method is applied to each time series independently to produce the value which will be used to compare the time series to other time series.
     * 
    */
    public String getRankingMethod() {
        return this.rankingMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PickTimeSeriesFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String direction;
        private Integer numTimeSeries;
        private String rankingMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(PickTimeSeriesFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.numTimeSeries = defaults.numTimeSeries;
    	      this.rankingMethod = defaults.rankingMethod;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setNumTimeSeries(Integer numTimeSeries) {
            this.numTimeSeries = Objects.requireNonNull(numTimeSeries);
            return this;
        }

        public Builder setRankingMethod(String rankingMethod) {
            this.rankingMethod = Objects.requireNonNull(rankingMethod);
            return this;
        }
        public PickTimeSeriesFilterResponse build() {
            return new PickTimeSeriesFilterResponse(direction, numTimeSeries, rankingMethod);
        }
    }
}
