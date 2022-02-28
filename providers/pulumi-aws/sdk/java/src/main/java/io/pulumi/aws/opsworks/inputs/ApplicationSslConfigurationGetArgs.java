// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationSslConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationSslConfigurationGetArgs Empty = new ApplicationSslConfigurationGetArgs();

    /**
     * The contents of the certificate's domain.crt file.
     * 
     */
    @InputImport(name="certificate", required=true)
      private final Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate;
    }

    /**
     * Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    @InputImport(name="chain")
      private final @Nullable Input<String> chain;

    public Input<String> getChain() {
        return this.chain == null ? Input.empty() : this.chain;
    }

    /**
     * The private key; the contents of the certificate's domain.key file.
     * 
     */
    @InputImport(name="privateKey", required=true)
      private final Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey;
    }

    public ApplicationSslConfigurationGetArgs(
        Input<String> certificate,
        @Nullable Input<String> chain,
        Input<String> privateKey) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.chain = chain;
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private ApplicationSslConfigurationGetArgs() {
        this.certificate = Input.empty();
        this.chain = Input.empty();
        this.privateKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSslConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificate;
        private @Nullable Input<String> chain;
        private Input<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSslConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.chain = defaults.chain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder setCertificate(Input<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Input.of(Objects.requireNonNull(certificate));
            return this;
        }

        public Builder setChain(@Nullable Input<String> chain) {
            this.chain = chain;
            return this;
        }

        public Builder setChain(@Nullable String chain) {
            this.chain = Input.ofNullable(chain);
            return this;
        }

        public Builder setPrivateKey(Input<String> privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Input.of(Objects.requireNonNull(privateKey));
            return this;
        }
        public ApplicationSslConfigurationGetArgs build() {
            return new ApplicationSslConfigurationGetArgs(certificate, chain, privateKey);
        }
    }
}
