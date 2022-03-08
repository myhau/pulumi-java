// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultSigningKeyParametersResponse {
    private final String odataType;
    /**
     * Resource group of the user's Key Vault containing the secret
     * 
     */
    private final String resourceGroupName;
    /**
     * The name of secret in Key Vault.
     * 
     */
    private final String secretName;
    /**
     * The version(GUID) of secret in Key Vault.
     * 
     */
    private final String secretVersion;
    /**
     * Subscription Id of the user's Key Vault containing the secret
     * 
     */
    private final String subscriptionId;
    /**
     * The name of the user's Key Vault containing the secret
     * 
     */
    private final String vaultName;

    @OutputCustomType.Constructor({"odataType","resourceGroupName","secretName","secretVersion","subscriptionId","vaultName"})
    private KeyVaultSigningKeyParametersResponse(
        String odataType,
        String resourceGroupName,
        String secretName,
        String secretVersion,
        String subscriptionId,
        String vaultName) {
        this.odataType = odataType;
        this.resourceGroupName = resourceGroupName;
        this.secretName = secretName;
        this.secretVersion = secretVersion;
        this.subscriptionId = subscriptionId;
        this.vaultName = vaultName;
    }

    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Resource group of the user's Key Vault containing the secret
     * 
    */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of secret in Key Vault.
     * 
    */
    public String getSecretName() {
        return this.secretName;
    }
    /**
     * The version(GUID) of secret in Key Vault.
     * 
    */
    public String getSecretVersion() {
        return this.secretVersion;
    }
    /**
     * Subscription Id of the user's Key Vault containing the secret
     * 
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * The name of the user's Key Vault containing the secret
     * 
    */
    public String getVaultName() {
        return this.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultSigningKeyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String resourceGroupName;
        private String secretName;
        private String secretVersion;
        private String subscriptionId;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultSigningKeyParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSecretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public Builder setSecretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public KeyVaultSigningKeyParametersResponse build() {
            return new KeyVaultSigningKeyParametersResponse(odataType, resourceGroupName, secretName, secretVersion, subscriptionId, vaultName);
        }
    }
}
