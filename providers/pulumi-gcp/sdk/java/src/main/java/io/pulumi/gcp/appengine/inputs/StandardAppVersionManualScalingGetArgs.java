// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class StandardAppVersionManualScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionManualScalingGetArgs Empty = new StandardAppVersionManualScalingGetArgs();

    /**
     * Number of instances to assign to the service at the start.
     * **Note:** When managing the number of instances at runtime through the App Engine Admin API or the (now deprecated) Python 2
     * Modules API set_num_instances() you must use `lifecycle.ignore_changes = ["manual_scaling"[0].instances]` to prevent drift detection.
     * 
     */
    @InputImport(name="instances", required=true)
    private final Input<Integer> instances;

    public Input<Integer> getInstances() {
        return this.instances;
    }

    public StandardAppVersionManualScalingGetArgs(Input<Integer> instances) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
    }

    private StandardAppVersionManualScalingGetArgs() {
        this.instances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionManualScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> instances;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionManualScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        public Builder setInstances(Input<Integer> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setInstances(Integer instances) {
            this.instances = Input.of(Objects.requireNonNull(instances));
            return this;
        }

        public StandardAppVersionManualScalingGetArgs build() {
            return new StandardAppVersionManualScalingGetArgs(instances);
        }
    }
}
