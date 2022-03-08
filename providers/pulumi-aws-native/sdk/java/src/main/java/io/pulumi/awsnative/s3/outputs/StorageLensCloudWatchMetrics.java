// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class StorageLensCloudWatchMetrics {
    /**
     * Specifies whether CloudWatch metrics are enabled or disabled.
     * 
     */
    private final Boolean isEnabled;

    @OutputCustomType.Constructor({"isEnabled"})
    private StorageLensCloudWatchMetrics(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * Specifies whether CloudWatch metrics are enabled or disabled.
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensCloudWatchMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensCloudWatchMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public StorageLensCloudWatchMetrics build() {
            return new StorageLensCloudWatchMetrics(isEnabled);
        }
    }
}
