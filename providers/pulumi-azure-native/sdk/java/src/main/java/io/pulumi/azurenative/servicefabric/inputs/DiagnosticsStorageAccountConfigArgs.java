// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiagnosticsStorageAccountConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticsStorageAccountConfigArgs Empty = new DiagnosticsStorageAccountConfigArgs();

    @InputImport(name="blobEndpoint", required=true)
    private final Input<String> blobEndpoint;

    public Input<String> getBlobEndpoint() {
        return this.blobEndpoint;
    }

    @InputImport(name="protectedAccountKeyName", required=true)
    private final Input<String> protectedAccountKeyName;

    public Input<String> getProtectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }

    @InputImport(name="protectedAccountKeyName2")
    private final @Nullable Input<String> protectedAccountKeyName2;

    public Input<String> getProtectedAccountKeyName2() {
        return this.protectedAccountKeyName2 == null ? Input.empty() : this.protectedAccountKeyName2;
    }

    @InputImport(name="queueEndpoint", required=true)
    private final Input<String> queueEndpoint;

    public Input<String> getQueueEndpoint() {
        return this.queueEndpoint;
    }

    @InputImport(name="storageAccountName", required=true)
    private final Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName;
    }

    @InputImport(name="tableEndpoint", required=true)
    private final Input<String> tableEndpoint;

    public Input<String> getTableEndpoint() {
        return this.tableEndpoint;
    }

    public DiagnosticsStorageAccountConfigArgs(
        Input<String> blobEndpoint,
        Input<String> protectedAccountKeyName,
        @Nullable Input<String> protectedAccountKeyName2,
        Input<String> queueEndpoint,
        Input<String> storageAccountName,
        Input<String> tableEndpoint) {
        this.blobEndpoint = Objects.requireNonNull(blobEndpoint, "expected parameter 'blobEndpoint' to be non-null");
        this.protectedAccountKeyName = Objects.requireNonNull(protectedAccountKeyName, "expected parameter 'protectedAccountKeyName' to be non-null");
        this.protectedAccountKeyName2 = protectedAccountKeyName2;
        this.queueEndpoint = Objects.requireNonNull(queueEndpoint, "expected parameter 'queueEndpoint' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.tableEndpoint = Objects.requireNonNull(tableEndpoint, "expected parameter 'tableEndpoint' to be non-null");
    }

    private DiagnosticsStorageAccountConfigArgs() {
        this.blobEndpoint = Input.empty();
        this.protectedAccountKeyName = Input.empty();
        this.protectedAccountKeyName2 = Input.empty();
        this.queueEndpoint = Input.empty();
        this.storageAccountName = Input.empty();
        this.tableEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsStorageAccountConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> blobEndpoint;
        private Input<String> protectedAccountKeyName;
        private @Nullable Input<String> protectedAccountKeyName2;
        private Input<String> queueEndpoint;
        private Input<String> storageAccountName;
        private Input<String> tableEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsStorageAccountConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobEndpoint = defaults.blobEndpoint;
    	      this.protectedAccountKeyName = defaults.protectedAccountKeyName;
    	      this.protectedAccountKeyName2 = defaults.protectedAccountKeyName2;
    	      this.queueEndpoint = defaults.queueEndpoint;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tableEndpoint = defaults.tableEndpoint;
        }

        public Builder setBlobEndpoint(Input<String> blobEndpoint) {
            this.blobEndpoint = Objects.requireNonNull(blobEndpoint);
            return this;
        }

        public Builder setBlobEndpoint(String blobEndpoint) {
            this.blobEndpoint = Input.of(Objects.requireNonNull(blobEndpoint));
            return this;
        }

        public Builder setProtectedAccountKeyName(Input<String> protectedAccountKeyName) {
            this.protectedAccountKeyName = Objects.requireNonNull(protectedAccountKeyName);
            return this;
        }

        public Builder setProtectedAccountKeyName(String protectedAccountKeyName) {
            this.protectedAccountKeyName = Input.of(Objects.requireNonNull(protectedAccountKeyName));
            return this;
        }

        public Builder setProtectedAccountKeyName2(@Nullable Input<String> protectedAccountKeyName2) {
            this.protectedAccountKeyName2 = protectedAccountKeyName2;
            return this;
        }

        public Builder setProtectedAccountKeyName2(@Nullable String protectedAccountKeyName2) {
            this.protectedAccountKeyName2 = Input.ofNullable(protectedAccountKeyName2);
            return this;
        }

        public Builder setQueueEndpoint(Input<String> queueEndpoint) {
            this.queueEndpoint = Objects.requireNonNull(queueEndpoint);
            return this;
        }

        public Builder setQueueEndpoint(String queueEndpoint) {
            this.queueEndpoint = Input.of(Objects.requireNonNull(queueEndpoint));
            return this;
        }

        public Builder setStorageAccountName(Input<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Input.of(Objects.requireNonNull(storageAccountName));
            return this;
        }

        public Builder setTableEndpoint(Input<String> tableEndpoint) {
            this.tableEndpoint = Objects.requireNonNull(tableEndpoint);
            return this;
        }

        public Builder setTableEndpoint(String tableEndpoint) {
            this.tableEndpoint = Input.of(Objects.requireNonNull(tableEndpoint));
            return this;
        }

        public DiagnosticsStorageAccountConfigArgs build() {
            return new DiagnosticsStorageAccountConfigArgs(blobEndpoint, protectedAccountKeyName, protectedAccountKeyName2, queueEndpoint, storageAccountName, tableEndpoint);
        }
    }
}