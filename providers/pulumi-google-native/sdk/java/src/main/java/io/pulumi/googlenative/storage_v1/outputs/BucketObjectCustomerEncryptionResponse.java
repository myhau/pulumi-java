// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketObjectCustomerEncryptionResponse {
    /**
     * The encryption algorithm.
     * 
     */
    private final String encryptionAlgorithm;
    /**
     * SHA256 hash value of the encryption key.
     * 
     */
    private final String keySha256;

    @OutputCustomType.Constructor
    private BucketObjectCustomerEncryptionResponse(
        @OutputCustomType.Parameter("encryptionAlgorithm") String encryptionAlgorithm,
        @OutputCustomType.Parameter("keySha256") String keySha256) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.keySha256 = keySha256;
    }

    /**
     * The encryption algorithm.
     * 
    */
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    /**
     * SHA256 hash value of the encryption key.
     * 
    */
    public String getKeySha256() {
        return this.keySha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectCustomerEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private String keySha256;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectCustomerEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.keySha256 = defaults.keySha256;
        }

        public Builder setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }

        public Builder setKeySha256(String keySha256) {
            this.keySha256 = Objects.requireNonNull(keySha256);
            return this;
        }
        public BucketObjectCustomerEncryptionResponse build() {
            return new BucketObjectCustomerEncryptionResponse(encryptionAlgorithm, keySha256);
        }
    }
}
