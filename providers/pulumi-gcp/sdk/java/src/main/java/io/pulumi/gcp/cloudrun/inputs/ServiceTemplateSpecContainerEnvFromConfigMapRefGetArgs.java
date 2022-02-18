// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs Empty = new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="localObjectReference")
    private final @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference;

    public Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Input.empty() : this.localObjectReference;
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @InputImport(name="optional")
    private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs(
        @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference,
        @Nullable Input<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.optional = optional;
    }

    private ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs() {
        this.localObjectReference = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.optional = defaults.optional;
        }

        public Builder setLocalObjectReference(@Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }

        public Builder setLocalObjectReference(@Nullable ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs localObjectReference) {
            this.localObjectReference = Input.ofNullable(localObjectReference);
            return this;
        }

        public Builder setOptional(@Nullable Input<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = Input.ofNullable(optional);
            return this;
        }

        public ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs build() {
            return new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs(localObjectReference, optional);
        }
    }
}
