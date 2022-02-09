// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerEncryptionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerEncryptionKeyArgs Empty = new CustomerEncryptionKeyArgs();

    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    @InputImport(name="kmsKeyServiceAccount")
    private final @Nullable Input<String> kmsKeyServiceAccount;

    public Input<String> getKmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount == null ? Input.empty() : this.kmsKeyServiceAccount;
    }

    @InputImport(name="rawKey")
    private final @Nullable Input<String> rawKey;

    public Input<String> getRawKey() {
        return this.rawKey == null ? Input.empty() : this.rawKey;
    }

    @InputImport(name="rsaEncryptedKey")
    private final @Nullable Input<String> rsaEncryptedKey;

    public Input<String> getRsaEncryptedKey() {
        return this.rsaEncryptedKey == null ? Input.empty() : this.rsaEncryptedKey;
    }

    public CustomerEncryptionKeyArgs(
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<String> kmsKeyServiceAccount,
        @Nullable Input<String> rawKey,
        @Nullable Input<String> rsaEncryptedKey) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.rsaEncryptedKey = rsaEncryptedKey;
    }

    private CustomerEncryptionKeyArgs() {
        this.kmsKeyName = Input.empty();
        this.kmsKeyServiceAccount = Input.empty();
        this.rawKey = Input.empty();
        this.rsaEncryptedKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<String> kmsKeyServiceAccount;
        private @Nullable Input<String> rawKey;
        private @Nullable Input<String> rsaEncryptedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.rsaEncryptedKey = defaults.rsaEncryptedKey;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
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

        public Builder setRsaEncryptedKey(@Nullable Input<String> rsaEncryptedKey) {
            this.rsaEncryptedKey = rsaEncryptedKey;
            return this;
        }

        public Builder setRsaEncryptedKey(@Nullable String rsaEncryptedKey) {
            this.rsaEncryptedKey = Input.ofNullable(rsaEncryptedKey);
            return this;
        }

        public CustomerEncryptionKeyArgs build() {
            return new CustomerEncryptionKeyArgs(kmsKeyName, kmsKeyServiceAccount, rawKey, rsaEncryptedKey);
        }
    }
}