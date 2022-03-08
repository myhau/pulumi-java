// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StorageAccountDetailsResponse {
    /**
     * Account Type of the data to be transferred.
     * Expected value is 'StorageAccount'.
     * 
     */
    private final String dataAccountType;
    /**
     * Storage Account Resource Id.
     * 
     */
    private final String storageAccountId;

    @OutputCustomType.Constructor({"dataAccountType","storageAccountId"})
    private StorageAccountDetailsResponse(
        String dataAccountType,
        String storageAccountId) {
        this.dataAccountType = dataAccountType;
        this.storageAccountId = storageAccountId;
    }

    /**
     * Account Type of the data to be transferred.
     * Expected value is 'StorageAccount'.
     * 
    */
    public String getDataAccountType() {
        return this.dataAccountType;
    }
    /**
     * Storage Account Resource Id.
     * 
    */
    public String getStorageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataAccountType;
        private String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setStorageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public StorageAccountDetailsResponse build() {
            return new StorageAccountDetailsResponse(dataAccountType, storageAccountId);
        }
    }
}
