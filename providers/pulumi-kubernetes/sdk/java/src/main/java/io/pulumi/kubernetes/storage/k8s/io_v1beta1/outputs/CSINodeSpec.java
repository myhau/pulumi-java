// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs.CSINodeDriver;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CSINodeSpec {
    /**
     * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
     */
    private final List<CSINodeDriver> drivers;

    @OutputCustomType.Constructor({"drivers"})
    private CSINodeSpec(List<CSINodeDriver> drivers) {
        this.drivers = drivers;
    }

    /**
     * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
    */
    public List<CSINodeDriver> getDrivers() {
        return this.drivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CSINodeDriver> drivers;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINodeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drivers = defaults.drivers;
        }

        public Builder setDrivers(List<CSINodeDriver> drivers) {
            this.drivers = Objects.requireNonNull(drivers);
            return this;
        }
        public CSINodeSpec build() {
            return new CSINodeSpec(drivers);
        }
    }
}
