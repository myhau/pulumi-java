// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure VM disk input details.
 * 
 */
public final class A2AVmDiskInputDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final A2AVmDiskInputDetailsArgs Empty = new A2AVmDiskInputDetailsArgs();

    /**
     * The disk Uri.
     * 
     */
    @Import(name="diskUri")
      private final @Nullable Output<String> diskUri;

    public Output<String> diskUri() {
        return this.diskUri == null ? Codegen.empty() : this.diskUri;
    }

    /**
     * The primary staging storage account Id.
     * 
     */
    @Import(name="primaryStagingAzureStorageAccountId")
      private final @Nullable Output<String> primaryStagingAzureStorageAccountId;

    public Output<String> primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId == null ? Codegen.empty() : this.primaryStagingAzureStorageAccountId;
    }

    /**
     * The recovery VHD storage account Id.
     * 
     */
    @Import(name="recoveryAzureStorageAccountId")
      private final @Nullable Output<String> recoveryAzureStorageAccountId;

    public Output<String> recoveryAzureStorageAccountId() {
        return this.recoveryAzureStorageAccountId == null ? Codegen.empty() : this.recoveryAzureStorageAccountId;
    }

    public A2AVmDiskInputDetailsArgs(
        @Nullable Output<String> diskUri,
        @Nullable Output<String> primaryStagingAzureStorageAccountId,
        @Nullable Output<String> recoveryAzureStorageAccountId) {
        this.diskUri = diskUri;
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
    }

    private A2AVmDiskInputDetailsArgs() {
        this.diskUri = Codegen.empty();
        this.primaryStagingAzureStorageAccountId = Codegen.empty();
        this.recoveryAzureStorageAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AVmDiskInputDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskUri;
        private @Nullable Output<String> primaryStagingAzureStorageAccountId;
        private @Nullable Output<String> recoveryAzureStorageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AVmDiskInputDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskUri = defaults.diskUri;
    	      this.primaryStagingAzureStorageAccountId = defaults.primaryStagingAzureStorageAccountId;
    	      this.recoveryAzureStorageAccountId = defaults.recoveryAzureStorageAccountId;
        }

        public Builder diskUri(@Nullable Output<String> diskUri) {
            this.diskUri = diskUri;
            return this;
        }
        public Builder diskUri(@Nullable String diskUri) {
            this.diskUri = Codegen.ofNullable(diskUri);
            return this;
        }
        public Builder primaryStagingAzureStorageAccountId(@Nullable Output<String> primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
            return this;
        }
        public Builder primaryStagingAzureStorageAccountId(@Nullable String primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = Codegen.ofNullable(primaryStagingAzureStorageAccountId);
            return this;
        }
        public Builder recoveryAzureStorageAccountId(@Nullable Output<String> recoveryAzureStorageAccountId) {
            this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
            return this;
        }
        public Builder recoveryAzureStorageAccountId(@Nullable String recoveryAzureStorageAccountId) {
            this.recoveryAzureStorageAccountId = Codegen.ofNullable(recoveryAzureStorageAccountId);
            return this;
        }        public A2AVmDiskInputDetailsArgs build() {
            return new A2AVmDiskInputDetailsArgs(diskUri, primaryStagingAzureStorageAccountId, recoveryAzureStorageAccountId);
        }
    }
}
