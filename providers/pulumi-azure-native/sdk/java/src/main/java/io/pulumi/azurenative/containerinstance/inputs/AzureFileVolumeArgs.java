// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the Azure File volume. Azure File shares are mounted as volumes.
 * 
 */
public final class AzureFileVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFileVolumeArgs Empty = new AzureFileVolumeArgs();

    /**
     * The flag indicating whether the Azure File shared mounted as a volume is read-only.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * The name of the Azure File share to be mounted as a volume.
     * 
     */
    @Import(name="shareName", required=true)
      private final Output<String> shareName;

    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * The storage account access key used to access the Azure File share.
     * 
     */
    @Import(name="storageAccountKey")
      private final @Nullable Output<String> storageAccountKey;

    public Output<String> storageAccountKey() {
        return this.storageAccountKey == null ? Codegen.empty() : this.storageAccountKey;
    }

    /**
     * The name of the storage account that contains the Azure File share.
     * 
     */
    @Import(name="storageAccountName", required=true)
      private final Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    public AzureFileVolumeArgs(
        @Nullable Output<Boolean> readOnly,
        Output<String> shareName,
        @Nullable Output<String> storageAccountKey,
        Output<String> storageAccountName) {
        this.readOnly = readOnly;
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.storageAccountKey = storageAccountKey;
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
    }

    private AzureFileVolumeArgs() {
        this.readOnly = Codegen.empty();
        this.shareName = Codegen.empty();
        this.storageAccountKey = Codegen.empty();
        this.storageAccountName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> readOnly;
        private Output<String> shareName;
        private @Nullable Output<String> storageAccountKey;
        private Output<String> storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.shareName = defaults.shareName;
    	      this.storageAccountKey = defaults.storageAccountKey;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Codegen.ofNullable(readOnly);
            return this;
        }
        public Builder shareName(Output<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Output.of(Objects.requireNonNull(shareName));
            return this;
        }
        public Builder storageAccountKey(@Nullable Output<String> storageAccountKey) {
            this.storageAccountKey = storageAccountKey;
            return this;
        }
        public Builder storageAccountKey(@Nullable String storageAccountKey) {
            this.storageAccountKey = Codegen.ofNullable(storageAccountKey);
            return this;
        }
        public Builder storageAccountName(Output<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Output.of(Objects.requireNonNull(storageAccountName));
            return this;
        }        public AzureFileVolumeArgs build() {
            return new AzureFileVolumeArgs(readOnly, shareName, storageAccountKey, storageAccountName);
        }
    }
}
