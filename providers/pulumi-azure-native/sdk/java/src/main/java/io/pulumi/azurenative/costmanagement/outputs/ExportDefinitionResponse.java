// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ExportDatasetResponse;
import io.pulumi.azurenative.costmanagement.outputs.ExportTimePeriodResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExportDefinitionResponse {
    /**
     * The definition for data in the export.
     * 
     */
    private final @Nullable ExportDatasetResponse dataSet;
    /**
     * Has time period for pulling data for the export.
     * 
     */
    private final @Nullable ExportTimePeriodResponse timePeriod;
    /**
     * The time frame for pulling data for the export. If custom, then a specific time period must be provided.
     * 
     */
    private final String timeframe;
    /**
     * The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable to exports that do not yet provide data for charges or amortization for service reservations.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ExportDefinitionResponse(
        @CustomType.Parameter("dataSet") @Nullable ExportDatasetResponse dataSet,
        @CustomType.Parameter("timePeriod") @Nullable ExportTimePeriodResponse timePeriod,
        @CustomType.Parameter("timeframe") String timeframe,
        @CustomType.Parameter("type") String type) {
        this.dataSet = dataSet;
        this.timePeriod = timePeriod;
        this.timeframe = timeframe;
        this.type = type;
    }

    /**
     * The definition for data in the export.
     * 
    */
    public Optional<ExportDatasetResponse> dataSet() {
        return Optional.ofNullable(this.dataSet);
    }
    /**
     * Has time period for pulling data for the export.
     * 
    */
    public Optional<ExportTimePeriodResponse> timePeriod() {
        return Optional.ofNullable(this.timePeriod);
    }
    /**
     * The time frame for pulling data for the export. If custom, then a specific time period must be provided.
     * 
    */
    public String timeframe() {
        return this.timeframe;
    }
    /**
     * The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable to exports that do not yet provide data for charges or amortization for service reservations.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExportDatasetResponse dataSet;
        private @Nullable ExportTimePeriodResponse timePeriod;
        private String timeframe;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSet = defaults.dataSet;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
        }

        public Builder dataSet(@Nullable ExportDatasetResponse dataSet) {
            this.dataSet = dataSet;
            return this;
        }
        public Builder timePeriod(@Nullable ExportTimePeriodResponse timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        public Builder timeframe(String timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ExportDefinitionResponse build() {
            return new ExportDefinitionResponse(dataSet, timePeriod, timeframe, type);
        }
    }
}
