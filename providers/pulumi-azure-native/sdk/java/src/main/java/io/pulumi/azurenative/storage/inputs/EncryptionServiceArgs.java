// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.KeyType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A service that allows server-side encryption to be used.
 * 
 */
public final class EncryptionServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionServiceArgs Empty = new EncryptionServiceArgs();

    /**
     * A boolean indicating whether or not the service encrypts the data as it is stored.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Encryption key type to be used for the encryption service. 'Account' key type implies that an account-scoped encryption key will be used. 'Service' key type implies that a default service key is used.
     * 
     */
    @Import(name="keyType")
      private final @Nullable Output<Either<String,KeyType>> keyType;

    public Output<Either<String,KeyType>> keyType() {
        return this.keyType == null ? Codegen.empty() : this.keyType;
    }

    public EncryptionServiceArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Either<String,KeyType>> keyType) {
        this.enabled = enabled;
        this.keyType = keyType;
    }

    private EncryptionServiceArgs() {
        this.enabled = Codegen.empty();
        this.keyType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Either<String,KeyType>> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyType = defaults.keyType;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder keyType(@Nullable Output<Either<String,KeyType>> keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder keyType(@Nullable Either<String,KeyType> keyType) {
            this.keyType = Codegen.ofNullable(keyType);
            return this;
        }        public EncryptionServiceArgs build() {
            return new EncryptionServiceArgs(enabled, keyType);
        }
    }
}
