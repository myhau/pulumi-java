// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run ConfigMapEnvSource selects a ConfigMap to populate the environment variables with. The contents of the target ConfigMap&#39;s Data field will represent the key-value pairs as environment variables.
 * 
 */
public final class ConfigMapEnvSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigMapEnvSourceArgs Empty = new ConfigMapEnvSourceArgs();

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    @Import(name="localObjectReference")
    private @Nullable Output<LocalObjectReferenceArgs> localObjectReference;

    /**
     * @return This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    public Optional<Output<LocalObjectReferenceArgs>> localObjectReference() {
        return Optional.ofNullable(this.localObjectReference);
    }

    /**
     * The ConfigMap to select from.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The ConfigMap to select from.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Optional) Specify whether the ConfigMap must be defined
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return (Optional) Specify whether the ConfigMap must be defined
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    private ConfigMapEnvSourceArgs() {}

    private ConfigMapEnvSourceArgs(ConfigMapEnvSourceArgs $) {
        this.localObjectReference = $.localObjectReference;
        this.name = $.name;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigMapEnvSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapEnvSourceArgs $;

        public Builder() {
            $ = new ConfigMapEnvSourceArgs();
        }

        public Builder(ConfigMapEnvSourceArgs defaults) {
            $ = new ConfigMapEnvSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localObjectReference This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
         * 
         * @return builder
         * 
         */
        public Builder localObjectReference(@Nullable Output<LocalObjectReferenceArgs> localObjectReference) {
            $.localObjectReference = localObjectReference;
            return this;
        }

        /**
         * @param localObjectReference This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
         * 
         * @return builder
         * 
         */
        public Builder localObjectReference(LocalObjectReferenceArgs localObjectReference) {
            return localObjectReference(Output.of(localObjectReference));
        }

        /**
         * @param name The ConfigMap to select from.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The ConfigMap to select from.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optional (Optional) Specify whether the ConfigMap must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional (Optional) Specify whether the ConfigMap must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        public ConfigMapEnvSourceArgs build() {
            return $;
        }
    }

}
