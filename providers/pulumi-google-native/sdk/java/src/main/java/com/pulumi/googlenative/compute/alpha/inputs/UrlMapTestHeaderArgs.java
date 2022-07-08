// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HTTP headers used in UrlMapTests.
 * 
 */
public final class UrlMapTestHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlMapTestHeaderArgs Empty = new UrlMapTestHeaderArgs();

    /**
     * Header name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Header name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Header value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Header value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private UrlMapTestHeaderArgs() {}

    private UrlMapTestHeaderArgs(UrlMapTestHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlMapTestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlMapTestHeaderArgs $;

        public Builder() {
            $ = new UrlMapTestHeaderArgs();
        }

        public Builder(UrlMapTestHeaderArgs defaults) {
            $ = new UrlMapTestHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Header name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Header name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Header value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Header value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public UrlMapTestHeaderArgs build() {
            return $;
        }
    }

}
