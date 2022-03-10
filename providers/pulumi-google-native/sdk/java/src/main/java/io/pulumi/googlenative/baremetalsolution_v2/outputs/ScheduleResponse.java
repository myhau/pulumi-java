// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduleResponse {
    /**
     * A crontab-like specification that the schedule uses to take snapshots.
     * 
     */
    private final String crontabSpec;
    /**
     * A list of snapshot names created in this schedule.
     * 
     */
    private final String prefix;
    /**
     * The maximum number of snapshots to retain in this schedule.
     * 
     */
    private final Integer retentionCount;

    @OutputCustomType.Constructor
    private ScheduleResponse(
        @OutputCustomType.Parameter("crontabSpec") String crontabSpec,
        @OutputCustomType.Parameter("prefix") String prefix,
        @OutputCustomType.Parameter("retentionCount") Integer retentionCount) {
        this.crontabSpec = crontabSpec;
        this.prefix = prefix;
        this.retentionCount = retentionCount;
    }

    /**
     * A crontab-like specification that the schedule uses to take snapshots.
     * 
    */
    public String getCrontabSpec() {
        return this.crontabSpec;
    }
    /**
     * A list of snapshot names created in this schedule.
     * 
    */
    public String getPrefix() {
        return this.prefix;
    }
    /**
     * The maximum number of snapshots to retain in this schedule.
     * 
    */
    public Integer getRetentionCount() {
        return this.retentionCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String crontabSpec;
        private String prefix;
        private Integer retentionCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crontabSpec = defaults.crontabSpec;
    	      this.prefix = defaults.prefix;
    	      this.retentionCount = defaults.retentionCount;
        }

        public Builder setCrontabSpec(String crontabSpec) {
            this.crontabSpec = Objects.requireNonNull(crontabSpec);
            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }

        public Builder setRetentionCount(Integer retentionCount) {
            this.retentionCount = Objects.requireNonNull(retentionCount);
            return this;
        }
        public ScheduleResponse build() {
            return new ScheduleResponse(crontabSpec, prefix, retentionCount);
        }
    }
}
