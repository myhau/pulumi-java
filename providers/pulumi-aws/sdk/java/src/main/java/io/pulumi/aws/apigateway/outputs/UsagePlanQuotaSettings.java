// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UsagePlanQuotaSettings {
    /**
     * The maximum number of requests that can be made in a given time period.
     * 
     */
    private final Integer limit;
    /**
     * The number of requests subtracted from the given limit in the initial time period.
     * 
     */
    private final @Nullable Integer offset;
    /**
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * 
     */
    private final String period;

    @OutputCustomType.Constructor({"limit","offset","period"})
    private UsagePlanQuotaSettings(
        Integer limit,
        @Nullable Integer offset,
        String period) {
        this.limit = limit;
        this.offset = offset;
        this.period = period;
    }

    /**
     * The maximum number of requests that can be made in a given time period.
     * 
    */
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * The number of requests subtracted from the given limit in the initial time period.
     * 
    */
    public Optional<Integer> getOffset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * 
    */
    public String getPeriod() {
        return this.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer limit;
        private @Nullable Integer offset;
        private String period;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanQuotaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        public Builder setLimit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder setOffset(@Nullable Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder setPeriod(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public UsagePlanQuotaSettings build() {
            return new UsagePlanQuotaSettings(limit, offset, period);
        }
    }
}
