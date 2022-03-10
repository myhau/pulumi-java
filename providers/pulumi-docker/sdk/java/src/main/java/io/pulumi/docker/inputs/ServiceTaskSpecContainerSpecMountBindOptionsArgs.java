// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecMountBindOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecMountBindOptionsArgs Empty = new ServiceTaskSpecContainerSpecMountBindOptionsArgs();

    @InputImport(name="propagation")
      private final @Nullable Input<String> propagation;

    public Input<String> getPropagation() {
        return this.propagation == null ? Input.empty() : this.propagation;
    }

    public ServiceTaskSpecContainerSpecMountBindOptionsArgs(@Nullable Input<String> propagation) {
        this.propagation = propagation;
    }

    private ServiceTaskSpecContainerSpecMountBindOptionsArgs() {
        this.propagation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountBindOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> propagation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMountBindOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propagation = defaults.propagation;
        }

        public Builder setPropagation(@Nullable Input<String> propagation) {
            this.propagation = propagation;
            return this;
        }

        public Builder setPropagation(@Nullable String propagation) {
            this.propagation = Input.ofNullable(propagation);
            return this;
        }
        public ServiceTaskSpecContainerSpecMountBindOptionsArgs build() {
            return new ServiceTaskSpecContainerSpecMountBindOptionsArgs(propagation);
        }
    }
}