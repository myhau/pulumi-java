// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.InstancePropertiesPatchResponse;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerAllInstancesConfigResponse {
    /**
     * Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
     */
    private final InstancePropertiesPatchResponse properties;

    @OutputCustomType.Constructor
    private InstanceGroupManagerAllInstancesConfigResponse(@OutputCustomType.Parameter("properties") InstancePropertiesPatchResponse properties) {
        this.properties = properties;
    }

    /**
     * Properties for instances that are created using this instances config. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting instances_config, you must update your instances to use it; for example, you can use the applyUpdatesToInstances method.
     * 
    */
    public InstancePropertiesPatchResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePropertiesPatchResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAllInstancesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder setProperties(InstancePropertiesPatchResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public InstanceGroupManagerAllInstancesConfigResponse build() {
            return new InstanceGroupManagerAllInstancesConfigResponse(properties);
        }
    }
}
