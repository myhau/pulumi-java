// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionKeyDetailsResponse {
    /**
     * The type of kek encryption key
     * 
     */
    private final @Nullable String kekType;
    /**
     * Specifies the url for kek encryption key.
     * 
     */
    private final @Nullable String kekUrl;
    /**
     * Specifies the keyvault resource id for kek encryption key.
     * 
     */
    private final @Nullable String kekVaultResourceID;

    @CustomType.Constructor
    private EncryptionKeyDetailsResponse(
        @CustomType.Parameter("kekType") @Nullable String kekType,
        @CustomType.Parameter("kekUrl") @Nullable String kekUrl,
        @CustomType.Parameter("kekVaultResourceID") @Nullable String kekVaultResourceID) {
        this.kekType = kekType;
        this.kekUrl = kekUrl;
        this.kekVaultResourceID = kekVaultResourceID;
    }

    /**
     * The type of kek encryption key
     * 
    */
    public Optional<String> kekType() {
        return Optional.ofNullable(this.kekType);
    }
    /**
     * Specifies the url for kek encryption key.
     * 
    */
    public Optional<String> kekUrl() {
        return Optional.ofNullable(this.kekUrl);
    }
    /**
     * Specifies the keyvault resource id for kek encryption key.
     * 
    */
    public Optional<String> kekVaultResourceID() {
        return Optional.ofNullable(this.kekVaultResourceID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kekType;
        private @Nullable String kekUrl;
        private @Nullable String kekVaultResourceID;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kekType = defaults.kekType;
    	      this.kekUrl = defaults.kekUrl;
    	      this.kekVaultResourceID = defaults.kekVaultResourceID;
        }

        public Builder kekType(@Nullable String kekType) {
            this.kekType = kekType;
            return this;
        }
        public Builder kekUrl(@Nullable String kekUrl) {
            this.kekUrl = kekUrl;
            return this;
        }
        public Builder kekVaultResourceID(@Nullable String kekVaultResourceID) {
            this.kekVaultResourceID = kekVaultResourceID;
            return this;
        }        public EncryptionKeyDetailsResponse build() {
            return new EncryptionKeyDetailsResponse(kekType, kekUrl, kekVaultResourceID);
        }
    }
}
