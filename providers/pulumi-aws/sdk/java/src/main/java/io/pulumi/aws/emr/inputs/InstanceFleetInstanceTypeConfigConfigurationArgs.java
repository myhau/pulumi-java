// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetInstanceTypeConfigConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetInstanceTypeConfigConfigurationArgs Empty = new InstanceFleetInstanceTypeConfigConfigurationArgs();

    /**
     * The classification within a configuration.
     * 
     */
    @InputImport(name="classification")
      private final @Nullable Input<String> classification;

    public Input<String> getClassification() {
        return this.classification == null ? Input.empty() : this.classification;
    }

    /**
     * A map of properties specified within a configuration classification
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,Object>> properties;

    public Input<Map<String,Object>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public InstanceFleetInstanceTypeConfigConfigurationArgs(
        @Nullable Input<String> classification,
        @Nullable Input<Map<String,Object>> properties) {
        this.classification = classification;
        this.properties = properties;
    }

    private InstanceFleetInstanceTypeConfigConfigurationArgs() {
        this.classification = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> classification;
        private @Nullable Input<Map<String,Object>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.properties = defaults.properties;
        }

        public Builder setClassification(@Nullable Input<String> classification) {
            this.classification = classification;
            return this;
        }

        public Builder setClassification(@Nullable String classification) {
            this.classification = Input.ofNullable(classification);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,Object>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,Object> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public InstanceFleetInstanceTypeConfigConfigurationArgs build() {
            return new InstanceFleetInstanceTypeConfigConfigurationArgs(classification, properties);
        }
    }
}
