// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiskSourceImageEncryptionKey {
    private final @Nullable String kmsKeySelfLink;
    private final @Nullable String kmsKeyServiceAccount;
    private final @Nullable String rawKey;
    private final @Nullable String sha256;

    @OutputCustomType.Constructor({"kmsKeySelfLink","kmsKeyServiceAccount","rawKey","sha256"})
    private DiskSourceImageEncryptionKey(
        @Nullable String kmsKeySelfLink,
        @Nullable String kmsKeyServiceAccount,
        @Nullable String rawKey,
        @Nullable String sha256) {
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    public Optional<String> getKmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }
    public Optional<String> getKmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }
    public Optional<String> getRawKey() {
        return Optional.ofNullable(this.rawKey);
    }
    public Optional<String> getSha256() {
        return Optional.ofNullable(this.sha256);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSourceImageEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeySelfLink;
        private @Nullable String kmsKeyServiceAccount;
        private @Nullable String rawKey;
        private @Nullable String sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSourceImageEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder setKmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder setKmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder setRawKey(@Nullable String rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder setSha256(@Nullable String sha256) {
            this.sha256 = sha256;
            return this;
        }

        public DiskSourceImageEncryptionKey build() {
            return new DiskSourceImageEncryptionKey(kmsKeySelfLink, kmsKeyServiceAccount, rawKey, sha256);
        }
    }
}