// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VMwareCbt provider specific container mapping details.
 * 
 */
public final class VMwareCbtProtectionContainerMappingDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMwareCbtProtectionContainerMappingDetailsResponse Empty = new VMwareCbtProtectionContainerMappingDetailsResponse();

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMwareCbt'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The target key vault ARM Id.
     * 
     */
    @Import(name="keyVaultId", required=true)
      private final String keyVaultId;

    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * The target key vault URI.
     * 
     */
    @Import(name="keyVaultUri", required=true)
      private final String keyVaultUri;

    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The secret name of the service bus connection string.
     * 
     */
    @Import(name="serviceBusConnectionStringSecretName", required=true)
      private final String serviceBusConnectionStringSecretName;

    public String serviceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }

    /**
     * The storage account ARM Id.
     * 
     */
    @Import(name="storageAccountId", required=true)
      private final String storageAccountId;

    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * The secret name of the storage account.
     * 
     */
    @Import(name="storageAccountSasSecretName", required=true)
      private final String storageAccountSasSecretName;

    public String storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * The target location.
     * 
     */
    @Import(name="targetLocation", required=true)
      private final String targetLocation;

    public String targetLocation() {
        return this.targetLocation;
    }

    public VMwareCbtProtectionContainerMappingDetailsResponse(
        String instanceType,
        String keyVaultId,
        String keyVaultUri,
        String serviceBusConnectionStringSecretName,
        String storageAccountId,
        String storageAccountSasSecretName,
        String targetLocation) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.keyVaultId = Objects.requireNonNull(keyVaultId, "expected parameter 'keyVaultId' to be non-null");
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
        this.serviceBusConnectionStringSecretName = Objects.requireNonNull(serviceBusConnectionStringSecretName, "expected parameter 'serviceBusConnectionStringSecretName' to be non-null");
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
        this.storageAccountSasSecretName = Objects.requireNonNull(storageAccountSasSecretName, "expected parameter 'storageAccountSasSecretName' to be non-null");
        this.targetLocation = Objects.requireNonNull(targetLocation, "expected parameter 'targetLocation' to be non-null");
    }

    private VMwareCbtProtectionContainerMappingDetailsResponse() {
        this.instanceType = null;
        this.keyVaultId = null;
        this.keyVaultUri = null;
        this.serviceBusConnectionStringSecretName = null;
        this.storageAccountId = null;
        this.storageAccountSasSecretName = null;
        this.targetLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtProtectionContainerMappingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private String keyVaultId;
        private String keyVaultUri;
        private String serviceBusConnectionStringSecretName;
        private String storageAccountId;
        private String storageAccountSasSecretName;
        private String targetLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtProtectionContainerMappingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.serviceBusConnectionStringSecretName = defaults.serviceBusConnectionStringSecretName;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.storageAccountSasSecretName = defaults.storageAccountSasSecretName;
    	      this.targetLocation = defaults.targetLocation;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        public Builder keyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }
        public Builder serviceBusConnectionStringSecretName(String serviceBusConnectionStringSecretName) {
            this.serviceBusConnectionStringSecretName = Objects.requireNonNull(serviceBusConnectionStringSecretName);
            return this;
        }
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public Builder storageAccountSasSecretName(String storageAccountSasSecretName) {
            this.storageAccountSasSecretName = Objects.requireNonNull(storageAccountSasSecretName);
            return this;
        }
        public Builder targetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }        public VMwareCbtProtectionContainerMappingDetailsResponse build() {
            return new VMwareCbtProtectionContainerMappingDetailsResponse(instanceType, keyVaultId, keyVaultUri, serviceBusConnectionStringSecretName, storageAccountId, storageAccountSasSecretName, targetLocation);
        }
    }
}
