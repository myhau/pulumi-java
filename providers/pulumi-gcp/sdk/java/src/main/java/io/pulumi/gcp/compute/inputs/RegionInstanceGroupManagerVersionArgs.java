// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionTargetSizeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerVersionArgs Empty = new RegionInstanceGroupManagerVersionArgs();

    /**
     * - The full URL to an instance template from which all new instances of this version will be created.
     * 
     */
    @InputImport(name="instanceTemplate", required=true)
    private final Input<String> instanceTemplate;

    public Input<String> getInstanceTemplate() {
        return this.instanceTemplate;
    }

    /**
     * - Version name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @InputImport(name="targetSize")
    private final @Nullable Input<RegionInstanceGroupManagerVersionTargetSizeArgs> targetSize;

    public Input<RegionInstanceGroupManagerVersionTargetSizeArgs> getTargetSize() {
        return this.targetSize == null ? Input.empty() : this.targetSize;
    }

    public RegionInstanceGroupManagerVersionArgs(
        Input<String> instanceTemplate,
        @Nullable Input<String> name,
        @Nullable Input<RegionInstanceGroupManagerVersionTargetSizeArgs> targetSize) {
        this.instanceTemplate = Objects.requireNonNull(instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
        this.name = name;
        this.targetSize = targetSize;
    }

    private RegionInstanceGroupManagerVersionArgs() {
        this.instanceTemplate = Input.empty();
        this.name = Input.empty();
        this.targetSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceTemplate;
        private @Nullable Input<String> name;
        private @Nullable Input<RegionInstanceGroupManagerVersionTargetSizeArgs> targetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.targetSize = defaults.targetSize;
        }

        public Builder setInstanceTemplate(Input<String> instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }

        public Builder setInstanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Input.of(Objects.requireNonNull(instanceTemplate));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTargetSize(@Nullable Input<RegionInstanceGroupManagerVersionTargetSizeArgs> targetSize) {
            this.targetSize = targetSize;
            return this;
        }

        public Builder setTargetSize(@Nullable RegionInstanceGroupManagerVersionTargetSizeArgs targetSize) {
            this.targetSize = Input.ofNullable(targetSize);
            return this;
        }

        public RegionInstanceGroupManagerVersionArgs build() {
            return new RegionInstanceGroupManagerVersionArgs(instanceTemplate, name, targetSize);
        }
    }
}
