// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouterMd5AuthenticationKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterMd5AuthenticationKeyArgs Empty = new RouterMd5AuthenticationKeyArgs();

    /**
     * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RouterMd5AuthenticationKeyArgs() {}

    private RouterMd5AuthenticationKeyArgs(RouterMd5AuthenticationKeyArgs $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterMd5AuthenticationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterMd5AuthenticationKeyArgs $;

        public Builder() {
            $ = new RouterMd5AuthenticationKeyArgs();
        }

        public Builder(RouterMd5AuthenticationKeyArgs defaults) {
            $ = new RouterMd5AuthenticationKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RouterMd5AuthenticationKeyArgs build() {
            return $;
        }
    }

}
