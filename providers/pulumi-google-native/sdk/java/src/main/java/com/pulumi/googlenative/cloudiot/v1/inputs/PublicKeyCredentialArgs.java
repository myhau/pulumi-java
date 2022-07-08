// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudiot.v1.enums.PublicKeyCredentialFormat;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A public key format and data.
 * 
 */
public final class PublicKeyCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicKeyCredentialArgs Empty = new PublicKeyCredentialArgs();

    /**
     * The format of the key.
     * 
     */
    @Import(name="format")
    private @Nullable Output<PublicKeyCredentialFormat> format;

    /**
     * @return The format of the key.
     * 
     */
    public Optional<Output<PublicKeyCredentialFormat>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The key data.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The key data.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private PublicKeyCredentialArgs() {}

    private PublicKeyCredentialArgs(PublicKeyCredentialArgs $) {
        this.format = $.format;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicKeyCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyCredentialArgs $;

        public Builder() {
            $ = new PublicKeyCredentialArgs();
        }

        public Builder(PublicKeyCredentialArgs defaults) {
            $ = new PublicKeyCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format The format of the key.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<PublicKeyCredentialFormat> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the key.
         * 
         * @return builder
         * 
         */
        public Builder format(PublicKeyCredentialFormat format) {
            return format(Output.of(format));
        }

        /**
         * @param key The key data.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key data.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public PublicKeyCredentialArgs build() {
            return $;
        }
    }

}
