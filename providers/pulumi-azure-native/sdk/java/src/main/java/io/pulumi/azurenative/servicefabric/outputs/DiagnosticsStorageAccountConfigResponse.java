// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiagnosticsStorageAccountConfigResponse {
    /**
     * The blob endpoint of the azure storage account.
     * 
     */
    private final String blobEndpoint;
    /**
     * The protected diagnostics storage key name.
     * 
     */
    private final String protectedAccountKeyName;
    /**
     * The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
     * 
     */
    private final @Nullable String protectedAccountKeyName2;
    /**
     * The queue endpoint of the azure storage account.
     * 
     */
    private final String queueEndpoint;
    /**
     * The Azure storage account name.
     * 
     */
    private final String storageAccountName;
    /**
     * The table endpoint of the azure storage account.
     * 
     */
    private final String tableEndpoint;

    @OutputCustomType.Constructor({"blobEndpoint","protectedAccountKeyName","protectedAccountKeyName2","queueEndpoint","storageAccountName","tableEndpoint"})
    private DiagnosticsStorageAccountConfigResponse(
        String blobEndpoint,
        String protectedAccountKeyName,
        @Nullable String protectedAccountKeyName2,
        String queueEndpoint,
        String storageAccountName,
        String tableEndpoint) {
        this.blobEndpoint = blobEndpoint;
        this.protectedAccountKeyName = protectedAccountKeyName;
        this.protectedAccountKeyName2 = protectedAccountKeyName2;
        this.queueEndpoint = queueEndpoint;
        this.storageAccountName = storageAccountName;
        this.tableEndpoint = tableEndpoint;
    }

    /**
     * The blob endpoint of the azure storage account.
     * 
    */
    public String getBlobEndpoint() {
        return this.blobEndpoint;
    }
    /**
     * The protected diagnostics storage key name.
     * 
    */
    public String getProtectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }
    /**
     * The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
     * 
    */
    public Optional<String> getProtectedAccountKeyName2() {
        return Optional.ofNullable(this.protectedAccountKeyName2);
    }
    /**
     * The queue endpoint of the azure storage account.
     * 
    */
    public String getQueueEndpoint() {
        return this.queueEndpoint;
    }
    /**
     * The Azure storage account name.
     * 
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * The table endpoint of the azure storage account.
     * 
    */
    public String getTableEndpoint() {
        return this.tableEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsStorageAccountConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobEndpoint;
        private String protectedAccountKeyName;
        private @Nullable String protectedAccountKeyName2;
        private String queueEndpoint;
        private String storageAccountName;
        private String tableEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsStorageAccountConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobEndpoint = defaults.blobEndpoint;
    	      this.protectedAccountKeyName = defaults.protectedAccountKeyName;
    	      this.protectedAccountKeyName2 = defaults.protectedAccountKeyName2;
    	      this.queueEndpoint = defaults.queueEndpoint;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tableEndpoint = defaults.tableEndpoint;
        }

        public Builder setBlobEndpoint(String blobEndpoint) {
            this.blobEndpoint = Objects.requireNonNull(blobEndpoint);
            return this;
        }

        public Builder setProtectedAccountKeyName(String protectedAccountKeyName) {
            this.protectedAccountKeyName = Objects.requireNonNull(protectedAccountKeyName);
            return this;
        }

        public Builder setProtectedAccountKeyName2(@Nullable String protectedAccountKeyName2) {
            this.protectedAccountKeyName2 = protectedAccountKeyName2;
            return this;
        }

        public Builder setQueueEndpoint(String queueEndpoint) {
            this.queueEndpoint = Objects.requireNonNull(queueEndpoint);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setTableEndpoint(String tableEndpoint) {
            this.tableEndpoint = Objects.requireNonNull(tableEndpoint);
            return this;
        }
        public DiagnosticsStorageAccountConfigResponse build() {
            return new DiagnosticsStorageAccountConfigResponse(blobEndpoint, protectedAccountKeyName, protectedAccountKeyName2, queueEndpoint, storageAccountName, tableEndpoint);
        }
    }
}
