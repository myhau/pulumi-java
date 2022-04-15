// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a single certificate reference in a Key Vault, and where the certificate should reside on the VM.
 * 
 */
public final class VaultCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultCertificateArgs Empty = new VaultCertificateArgs();

    /**
     * For Windows VMs, specifies the certificate store on the Virtual Machine to which the certificate should be added. The specified certificate store is implicitly in the LocalMachine account. <br><br>For Linux VMs, the certificate file is placed under the /var/lib/waagent directory, with the file name <UppercaseThumbprint>.crt for the X509 certificate file and <UppercaseThumbprint>.prv for private key. Both of these files are .pem formatted.
     * 
     */
    @Import(name="certificateStore", required=true)
      private final Output<String> certificateStore;

    public Output<String> certificateStore() {
        return this.certificateStore;
    }

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: <br><br> {<br>  "data":"<Base64-encoded-certificate>",<br>  "dataType":"pfx",<br>  "password":"<pfx-file-password>"<br>}
     * 
     */
    @Import(name="certificateUrl", required=true)
      private final Output<String> certificateUrl;

    public Output<String> certificateUrl() {
        return this.certificateUrl;
    }

    public VaultCertificateArgs(
        Output<String> certificateStore,
        Output<String> certificateUrl) {
        this.certificateStore = Objects.requireNonNull(certificateStore, "expected parameter 'certificateStore' to be non-null");
        this.certificateUrl = Objects.requireNonNull(certificateUrl, "expected parameter 'certificateUrl' to be non-null");
    }

    private VaultCertificateArgs() {
        this.certificateStore = Codegen.empty();
        this.certificateUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateStore;
        private Output<String> certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateStore = defaults.certificateStore;
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder certificateStore(Output<String> certificateStore) {
            this.certificateStore = Objects.requireNonNull(certificateStore);
            return this;
        }
        public Builder certificateStore(String certificateStore) {
            this.certificateStore = Output.of(Objects.requireNonNull(certificateStore));
            return this;
        }
        public Builder certificateUrl(Output<String> certificateUrl) {
            this.certificateUrl = Objects.requireNonNull(certificateUrl);
            return this;
        }
        public Builder certificateUrl(String certificateUrl) {
            this.certificateUrl = Output.of(Objects.requireNonNull(certificateUrl));
            return this;
        }        public VaultCertificateArgs build() {
            return new VaultCertificateArgs(certificateStore, certificateUrl);
        }
    }
}
