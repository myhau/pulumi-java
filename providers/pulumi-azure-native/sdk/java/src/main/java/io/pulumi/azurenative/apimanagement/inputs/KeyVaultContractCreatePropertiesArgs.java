// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyVaultContractCreatePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultContractCreatePropertiesArgs Empty = new KeyVaultContractCreatePropertiesArgs();

    @InputImport(name="identityClientId")
    private final @Nullable Input<String> identityClientId;

    public Input<String> getIdentityClientId() {
        return this.identityClientId == null ? Input.empty() : this.identityClientId;
    }

    @InputImport(name="secretIdentifier")
    private final @Nullable Input<String> secretIdentifier;

    public Input<String> getSecretIdentifier() {
        return this.secretIdentifier == null ? Input.empty() : this.secretIdentifier;
    }

    public KeyVaultContractCreatePropertiesArgs(
        @Nullable Input<String> identityClientId,
        @Nullable Input<String> secretIdentifier) {
        this.identityClientId = identityClientId;
        this.secretIdentifier = secretIdentifier;
    }

    private KeyVaultContractCreatePropertiesArgs() {
        this.identityClientId = Input.empty();
        this.secretIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultContractCreatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityClientId;
        private @Nullable Input<String> secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultContractCreatePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder setIdentityClientId(@Nullable Input<String> identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = Input.ofNullable(identityClientId);
            return this;
        }

        public Builder setSecretIdentifier(@Nullable Input<String> secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }

        public Builder setSecretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = Input.ofNullable(secretIdentifier);
            return this;
        }

        public KeyVaultContractCreatePropertiesArgs build() {
            return new KeyVaultContractCreatePropertiesArgs(identityClientId, secretIdentifier);
        }
    }
}