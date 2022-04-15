// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AutoStoragePropertiesResponse {
    /**
     * The UTC time at which storage keys were last synchronized with the Batch account.
     * 
     */
    private final String lastKeySync;
    /**
     * The resource ID of the storage account to be used for auto-storage account.
     * 
     */
    private final String storageAccountId;

    @CustomType.Constructor
    private AutoStoragePropertiesResponse(
        @CustomType.Parameter("lastKeySync") String lastKeySync,
        @CustomType.Parameter("storageAccountId") String storageAccountId) {
        this.lastKeySync = lastKeySync;
        this.storageAccountId = storageAccountId;
    }

    /**
     * The UTC time at which storage keys were last synchronized with the Batch account.
     * 
    */
    public String lastKeySync() {
        return this.lastKeySync;
    }
    /**
     * The resource ID of the storage account to be used for auto-storage account.
     * 
    */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoStoragePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKeySync;
        private String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoStoragePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKeySync = defaults.lastKeySync;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder lastKeySync(String lastKeySync) {
            this.lastKeySync = Objects.requireNonNull(lastKeySync);
            return this;
        }
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }        public AutoStoragePropertiesResponse build() {
            return new AutoStoragePropertiesResponse(lastKeySync, storageAccountId);
        }
    }
}
