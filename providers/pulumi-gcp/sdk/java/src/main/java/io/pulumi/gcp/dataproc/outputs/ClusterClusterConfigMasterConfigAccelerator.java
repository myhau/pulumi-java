// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterClusterConfigMasterConfigAccelerator {
    /**
     * The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
     * 
     */
    private final Integer acceleratorCount;
    /**
     * The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
     * 
     */
    private final String acceleratorType;

    @OutputCustomType.Constructor({"acceleratorCount","acceleratorType"})
    private ClusterClusterConfigMasterConfigAccelerator(
        Integer acceleratorCount,
        String acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    /**
     * The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
     * 
    */
    public Integer getAcceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigMasterConfigAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acceleratorCount;
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigMasterConfigAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public ClusterClusterConfigMasterConfigAccelerator build() {
            return new ClusterClusterConfigMasterConfigAccelerator(acceleratorCount, acceleratorType);
        }
    }
}
