// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceResponse;
import io.pulumi.azurenative.insights.inputs.RuleMetricDataSourceResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule condition based on a certain number of locations failing.
 * 
 */
public final class LocationThresholdRuleConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocationThresholdRuleConditionResponse Empty = new LocationThresholdRuleConditionResponse();

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
      private final @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;

    public Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource() {
        return this.dataSource == null ? null : this.dataSource;
    }

    /**
     * the number of locations that must fail to activate the alert.
     * 
     */
    @Import(name="failedLocationCount", required=true)
      private final Integer failedLocationCount;

    public Integer failedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @Import(name="windowSize")
      private final @Nullable String windowSize;

    public Optional<String> windowSize() {
        return this.windowSize == null ? Optional.empty() : Optional.ofNullable(this.windowSize);
    }

    public LocationThresholdRuleConditionResponse(
        @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource,
        Integer failedLocationCount,
        String odataType,
        @Nullable String windowSize) {
        this.dataSource = dataSource;
        this.failedLocationCount = Objects.requireNonNull(failedLocationCount, "expected parameter 'failedLocationCount' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.windowSize = windowSize;
    }

    private LocationThresholdRuleConditionResponse() {
        this.dataSource = null;
        this.failedLocationCount = null;
        this.odataType = null;
        this.windowSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationThresholdRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
        private Integer failedLocationCount;
        private String odataType;
        private @Nullable String windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationThresholdRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.failedLocationCount = defaults.failedLocationCount;
    	      this.odataType = defaults.odataType;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder failedLocationCount(Integer failedLocationCount) {
            this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = windowSize;
            return this;
        }        public LocationThresholdRuleConditionResponse build() {
            return new LocationThresholdRuleConditionResponse(dataSource, failedLocationCount, odataType, windowSize);
        }
    }
}
