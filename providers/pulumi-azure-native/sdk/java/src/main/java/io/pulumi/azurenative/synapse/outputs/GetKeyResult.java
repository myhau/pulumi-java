// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeyResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Used to activate the workspace after a customer managed key is provided.
     * 
     */
    private final @Nullable Boolean isActiveCMK;
    /**
     * The Key Vault Url of the workspace key.
     * 
     */
    private final @Nullable String keyVaultUrl;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","isActiveCMK","keyVaultUrl","name","type"})
    private GetKeyResult(
        String id,
        @Nullable Boolean isActiveCMK,
        @Nullable String keyVaultUrl,
        String name,
        String type) {
        this.id = id;
        this.isActiveCMK = isActiveCMK;
        this.keyVaultUrl = keyVaultUrl;
        this.name = name;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Used to activate the workspace after a customer managed key is provided.
     * 
    */
    public Optional<Boolean> getIsActiveCMK() {
        return Optional.ofNullable(this.isActiveCMK);
    }
    /**
     * The Key Vault Url of the workspace key.
     * 
    */
    public Optional<String> getKeyVaultUrl() {
        return Optional.ofNullable(this.keyVaultUrl);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean isActiveCMK;
        private @Nullable String keyVaultUrl;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isActiveCMK = defaults.isActiveCMK;
    	      this.keyVaultUrl = defaults.keyVaultUrl;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsActiveCMK(@Nullable Boolean isActiveCMK) {
            this.isActiveCMK = isActiveCMK;
            return this;
        }

        public Builder setKeyVaultUrl(@Nullable String keyVaultUrl) {
            this.keyVaultUrl = keyVaultUrl;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetKeyResult build() {
            return new GetKeyResult(id, isActiveCMK, keyVaultUrl, name, type);
        }
    }
}
