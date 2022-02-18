// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotSnapshotEncryptionKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotSnapshotEncryptionKeyGetArgs Empty = new SnapshotSnapshotEncryptionKeyGetArgs();

    /**
     * The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    @InputImport(name="kmsKeySelfLink")
    private final @Nullable Input<String> kmsKeySelfLink;

    public Input<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Input.empty() : this.kmsKeySelfLink;
    }

    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    @InputImport(name="kmsKeyServiceAccount")
    private final @Nullable Input<String> kmsKeyServiceAccount;

    public Input<String> getKmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount == null ? Input.empty() : this.kmsKeyServiceAccount;
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="rawKey")
    private final @Nullable Input<String> rawKey;

    public Input<String> getRawKey() {
        return this.rawKey == null ? Input.empty() : this.rawKey;
    }

    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    @InputImport(name="sha256")
    private final @Nullable Input<String> sha256;

    public Input<String> getSha256() {
        return this.sha256 == null ? Input.empty() : this.sha256;
    }

    public SnapshotSnapshotEncryptionKeyGetArgs(
        @Nullable Input<String> kmsKeySelfLink,
        @Nullable Input<String> kmsKeyServiceAccount,
        @Nullable Input<String> rawKey,
        @Nullable Input<String> sha256) {
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    private SnapshotSnapshotEncryptionKeyGetArgs() {
        this.kmsKeySelfLink = Input.empty();
        this.kmsKeyServiceAccount = Input.empty();
        this.rawKey = Input.empty();
        this.sha256 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSnapshotEncryptionKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeySelfLink;
        private @Nullable Input<String> kmsKeyServiceAccount;
        private @Nullable Input<String> rawKey;
        private @Nullable Input<String> sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSnapshotEncryptionKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder setKmsKeySelfLink(@Nullable Input<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder setKmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Input.ofNullable(kmsKeySelfLink);
            return this;
        }

        public Builder setKmsKeyServiceAccount(@Nullable Input<String> kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder setKmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Input.ofNullable(kmsKeyServiceAccount);
            return this;
        }

        public Builder setRawKey(@Nullable Input<String> rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder setRawKey(@Nullable String rawKey) {
            this.rawKey = Input.ofNullable(rawKey);
            return this;
        }

        public Builder setSha256(@Nullable Input<String> sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Builder setSha256(@Nullable String sha256) {
            this.sha256 = Input.ofNullable(sha256);
            return this;
        }

        public SnapshotSnapshotEncryptionKeyGetArgs build() {
            return new SnapshotSnapshotEncryptionKeyGetArgs(kmsKeySelfLink, kmsKeyServiceAccount, rawKey, sha256);
        }
    }
}
