// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="certificateChain", required=true)
      private final Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="privateKey", required=true)
      private final Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs(
        Input<String> certificateChain,
        Input<String> privateKey) {
        this.certificateChain = Objects.requireNonNull(certificateChain, "expected parameter 'certificateChain' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs() {
        this.certificateChain = Input.empty();
        this.privateKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateChain;
        private Input<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder setCertificateChain(Input<String> certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder setCertificateChain(String certificateChain) {
            this.certificateChain = Input.of(Objects.requireNonNull(certificateChain));
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
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs(certificateChain, privateKey);
        }
    }
}
