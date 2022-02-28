// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class RepositoryImageScanningConfiguration {
    /**
     * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
     * 
     */
    private final Boolean scanOnPush;

    @OutputCustomType.Constructor({"scanOnPush"})
    private RepositoryImageScanningConfiguration(Boolean scanOnPush) {
        this.scanOnPush = Objects.requireNonNull(scanOnPush);
    }

    /**
     * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
     * 
     */
    public Boolean getScanOnPush() {
        return this.scanOnPush;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryImageScanningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryImageScanningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder setScanOnPush(Boolean scanOnPush) {
            this.scanOnPush = Objects.requireNonNull(scanOnPush);
            return this;
        }
        public RepositoryImageScanningConfiguration build() {
            return new RepositoryImageScanningConfiguration(scanOnPush);
        }
    }
}
