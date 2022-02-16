// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ConfigMapKeySelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.ObjectFieldSelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.ResourceFieldSelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.SecretKeySelectorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvVarSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvVarSourceArgs Empty = new EnvVarSourceArgs();

    @InputImport(name="configMapKeyRef")
    private final @Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef;

    public Input<ConfigMapKeySelectorArgs> getConfigMapKeyRef() {
        return this.configMapKeyRef == null ? Input.empty() : this.configMapKeyRef;
    }

    @InputImport(name="fieldRef")
    private final @Nullable Input<ObjectFieldSelectorArgs> fieldRef;

    public Input<ObjectFieldSelectorArgs> getFieldRef() {
        return this.fieldRef == null ? Input.empty() : this.fieldRef;
    }

    @InputImport(name="resourceFieldRef")
    private final @Nullable Input<ResourceFieldSelectorArgs> resourceFieldRef;

    public Input<ResourceFieldSelectorArgs> getResourceFieldRef() {
        return this.resourceFieldRef == null ? Input.empty() : this.resourceFieldRef;
    }

    @InputImport(name="secretKeyRef")
    private final @Nullable Input<SecretKeySelectorArgs> secretKeyRef;

    public Input<SecretKeySelectorArgs> getSecretKeyRef() {
        return this.secretKeyRef == null ? Input.empty() : this.secretKeyRef;
    }

    public EnvVarSourceArgs(
        @Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef,
        @Nullable Input<ObjectFieldSelectorArgs> fieldRef,
        @Nullable Input<ResourceFieldSelectorArgs> resourceFieldRef,
        @Nullable Input<SecretKeySelectorArgs> secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    private EnvVarSourceArgs() {
        this.configMapKeyRef = Input.empty();
        this.fieldRef = Input.empty();
        this.resourceFieldRef = Input.empty();
        this.secretKeyRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef;
        private @Nullable Input<ObjectFieldSelectorArgs> fieldRef;
        private @Nullable Input<ResourceFieldSelectorArgs> resourceFieldRef;
        private @Nullable Input<SecretKeySelectorArgs> secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.fieldRef = defaults.fieldRef;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder setConfigMapKeyRef(@Nullable Input<ConfigMapKeySelectorArgs> configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        public Builder setConfigMapKeyRef(@Nullable ConfigMapKeySelectorArgs configMapKeyRef) {
            this.configMapKeyRef = Input.ofNullable(configMapKeyRef);
            return this;
        }

        public Builder setFieldRef(@Nullable Input<ObjectFieldSelectorArgs> fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        public Builder setFieldRef(@Nullable ObjectFieldSelectorArgs fieldRef) {
            this.fieldRef = Input.ofNullable(fieldRef);
            return this;
        }

        public Builder setResourceFieldRef(@Nullable Input<ResourceFieldSelectorArgs> resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        public Builder setResourceFieldRef(@Nullable ResourceFieldSelectorArgs resourceFieldRef) {
            this.resourceFieldRef = Input.ofNullable(resourceFieldRef);
            return this;
        }

        public Builder setSecretKeyRef(@Nullable Input<SecretKeySelectorArgs> secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        public Builder setSecretKeyRef(@Nullable SecretKeySelectorArgs secretKeyRef) {
            this.secretKeyRef = Input.ofNullable(secretKeyRef);
            return this;
        }

        public EnvVarSourceArgs build() {
            return new EnvVarSourceArgs(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }
}