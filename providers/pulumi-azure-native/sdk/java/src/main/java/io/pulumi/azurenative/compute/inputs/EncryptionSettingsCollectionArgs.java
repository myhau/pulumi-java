// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.EncryptionSettingsElementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption settings for disk or snapshot
 * 
 */
public final class EncryptionSettingsCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionSettingsCollectionArgs Empty = new EncryptionSettingsCollectionArgs();

    /**
     * Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A collection of encryption settings, one for each disk volume.
     * 
     */
    @Import(name="encryptionSettings")
      private final @Nullable Output<List<EncryptionSettingsElementArgs>> encryptionSettings;

    public Output<List<EncryptionSettingsElementArgs>> encryptionSettings() {
        return this.encryptionSettings == null ? Codegen.empty() : this.encryptionSettings;
    }

    /**
     * Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds to Azure Disk Encryption.
     * 
     */
    @Import(name="encryptionSettingsVersion")
      private final @Nullable Output<String> encryptionSettingsVersion;

    public Output<String> encryptionSettingsVersion() {
        return this.encryptionSettingsVersion == null ? Codegen.empty() : this.encryptionSettingsVersion;
    }

    public EncryptionSettingsCollectionArgs(
        Output<Boolean> enabled,
        @Nullable Output<List<EncryptionSettingsElementArgs>> encryptionSettings,
        @Nullable Output<String> encryptionSettingsVersion) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.encryptionSettings = encryptionSettings;
        this.encryptionSettingsVersion = encryptionSettingsVersion;
    }

    private EncryptionSettingsCollectionArgs() {
        this.enabled = Codegen.empty();
        this.encryptionSettings = Codegen.empty();
        this.encryptionSettingsVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionSettingsCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;
        private @Nullable Output<List<EncryptionSettingsElementArgs>> encryptionSettings;
        private @Nullable Output<String> encryptionSettingsVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionSettingsCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.encryptionSettingsVersion = defaults.encryptionSettingsVersion;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder encryptionSettings(@Nullable Output<List<EncryptionSettingsElementArgs>> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }
        public Builder encryptionSettings(@Nullable List<EncryptionSettingsElementArgs> encryptionSettings) {
            this.encryptionSettings = Codegen.ofNullable(encryptionSettings);
            return this;
        }
        public Builder encryptionSettings(EncryptionSettingsElementArgs... encryptionSettings) {
            return encryptionSettings(List.of(encryptionSettings));
        }
        public Builder encryptionSettingsVersion(@Nullable Output<String> encryptionSettingsVersion) {
            this.encryptionSettingsVersion = encryptionSettingsVersion;
            return this;
        }
        public Builder encryptionSettingsVersion(@Nullable String encryptionSettingsVersion) {
            this.encryptionSettingsVersion = Codegen.ofNullable(encryptionSettingsVersion);
            return this;
        }        public EncryptionSettingsCollectionArgs build() {
            return new EncryptionSettingsCollectionArgs(enabled, encryptionSettings, encryptionSettingsVersion);
        }
    }
}
