// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackupScheduleResponse {
    /**
     * ISO 8601 repeating time interval format
     * 
     */
    private final List<String> repeatingTimeIntervals;

    @CustomType.Constructor
    private BackupScheduleResponse(@CustomType.Parameter("repeatingTimeIntervals") List<String> repeatingTimeIntervals) {
        this.repeatingTimeIntervals = repeatingTimeIntervals;
    }

    /**
     * ISO 8601 repeating time interval format
     * 
    */
    public List<String> repeatingTimeIntervals() {
        return this.repeatingTimeIntervals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> repeatingTimeIntervals;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repeatingTimeIntervals = defaults.repeatingTimeIntervals;
        }

        public Builder repeatingTimeIntervals(List<String> repeatingTimeIntervals) {
            this.repeatingTimeIntervals = Objects.requireNonNull(repeatingTimeIntervals);
            return this;
        }
        public Builder repeatingTimeIntervals(String... repeatingTimeIntervals) {
            return repeatingTimeIntervals(List.of(repeatingTimeIntervals));
        }        public BackupScheduleResponse build() {
            return new BackupScheduleResponse(repeatingTimeIntervals);
        }
    }
}
