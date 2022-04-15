// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Akamai Signature Header authentication key.
 * 
 */
public final class AkamaiSignatureHeaderAuthenticationKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AkamaiSignatureHeaderAuthenticationKeyArgs Empty = new AkamaiSignatureHeaderAuthenticationKeyArgs();

    /**
     * authentication key
     * 
     */
    @Import(name="base64Key")
      private final @Nullable Output<String> base64Key;

    public Output<String> base64Key() {
        return this.base64Key == null ? Codegen.empty() : this.base64Key;
    }

    /**
     * The expiration time of the authentication key.
     * 
     */
    @Import(name="expiration")
      private final @Nullable Output<String> expiration;

    public Output<String> expiration() {
        return this.expiration == null ? Codegen.empty() : this.expiration;
    }

    /**
     * identifier of the key
     * 
     */
    @Import(name="identifier")
      private final @Nullable Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier == null ? Codegen.empty() : this.identifier;
    }

    public AkamaiSignatureHeaderAuthenticationKeyArgs(
        @Nullable Output<String> base64Key,
        @Nullable Output<String> expiration,
        @Nullable Output<String> identifier) {
        this.base64Key = base64Key;
        this.expiration = expiration;
        this.identifier = identifier;
    }

    private AkamaiSignatureHeaderAuthenticationKeyArgs() {
        this.base64Key = Codegen.empty();
        this.expiration = Codegen.empty();
        this.identifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AkamaiSignatureHeaderAuthenticationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> base64Key;
        private @Nullable Output<String> expiration;
        private @Nullable Output<String> identifier;

        public Builder() {
    	      // Empty
        }

        public Builder(AkamaiSignatureHeaderAuthenticationKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64Key = defaults.base64Key;
    	      this.expiration = defaults.expiration;
    	      this.identifier = defaults.identifier;
        }

        public Builder base64Key(@Nullable Output<String> base64Key) {
            this.base64Key = base64Key;
            return this;
        }
        public Builder base64Key(@Nullable String base64Key) {
            this.base64Key = Codegen.ofNullable(base64Key);
            return this;
        }
        public Builder expiration(@Nullable Output<String> expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder expiration(@Nullable String expiration) {
            this.expiration = Codegen.ofNullable(expiration);
            return this;
        }
        public Builder identifier(@Nullable Output<String> identifier) {
            this.identifier = identifier;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = Codegen.ofNullable(identifier);
            return this;
        }        public AkamaiSignatureHeaderAuthenticationKeyArgs build() {
            return new AkamaiSignatureHeaderAuthenticationKeyArgs(base64Key, expiration, identifier);
        }
    }
}
