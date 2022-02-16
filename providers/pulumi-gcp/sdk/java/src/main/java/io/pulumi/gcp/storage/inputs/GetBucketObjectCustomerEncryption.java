// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBucketObjectCustomerEncryption extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketObjectCustomerEncryption Empty = new GetBucketObjectCustomerEncryption();

    @InputImport(name="encryptionAlgorithm", required=true)
    private final String encryptionAlgorithm;

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    @InputImport(name="encryptionKey", required=true)
    private final String encryptionKey;

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public GetBucketObjectCustomerEncryption(
        String encryptionAlgorithm,
        String encryptionKey) {
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
        this.encryptionKey = Objects.requireNonNull(encryptionKey, "expected parameter 'encryptionKey' to be non-null");
    }

    private GetBucketObjectCustomerEncryption() {
        this.encryptionAlgorithm = null;
        this.encryptionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectCustomerEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private String encryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectCustomerEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        public Builder setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }

        public Builder setEncryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }

        public GetBucketObjectCustomerEncryption build() {
            return new GetBucketObjectCustomerEncryption(encryptionAlgorithm, encryptionKey);
        }
    }
}