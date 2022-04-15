// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceVaultAndSecretReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Extension Properties.
 * 
 */
public final class CloudServiceExtensionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceExtensionPropertiesArgs Empty = new CloudServiceExtensionPropertiesArgs();

    /**
     * Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
      private final @Nullable Output<Boolean> autoUpgradeMinorVersion;

    public Output<Boolean> autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Codegen.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * Tag to force apply the provided public and protected settings.
     * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
     * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
     * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
     * it is up to handler implementation whether to re-run it or not
     * 
     */
    @Import(name="forceUpdateTag")
      private final @Nullable Output<String> forceUpdateTag;

    public Output<String> forceUpdateTag() {
        return this.forceUpdateTag == null ? Codegen.empty() : this.forceUpdateTag;
    }

    /**
     * Protected settings for the extension which are encrypted before sent to the role instance.
     * 
     */
    @Import(name="protectedSettings")
      private final @Nullable Output<String> protectedSettings;

    public Output<String> protectedSettings() {
        return this.protectedSettings == null ? Codegen.empty() : this.protectedSettings;
    }

    @Import(name="protectedSettingsFromKeyVault")
      private final @Nullable Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault;

    public Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault() {
        return this.protectedSettingsFromKeyVault == null ? Codegen.empty() : this.protectedSettingsFromKeyVault;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher == null ? Codegen.empty() : this.publisher;
    }

    /**
     * Optional list of roles to apply this extension. If property is not specified or '*' is specified, extension is applied to all roles in the cloud service.
     * 
     */
    @Import(name="rolesAppliedTo")
      private final @Nullable Output<List<String>> rolesAppliedTo;

    public Output<List<String>> rolesAppliedTo() {
        return this.rolesAppliedTo == null ? Codegen.empty() : this.rolesAppliedTo;
    }

    /**
     * Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<String> settings;

    public Output<String> settings() {
        return this.settings == null ? Codegen.empty() : this.settings;
    }

    /**
     * Specifies the type of the extension.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
     * 
     */
    @Import(name="typeHandlerVersion")
      private final @Nullable Output<String> typeHandlerVersion;

    public Output<String> typeHandlerVersion() {
        return this.typeHandlerVersion == null ? Codegen.empty() : this.typeHandlerVersion;
    }

    public CloudServiceExtensionPropertiesArgs(
        @Nullable Output<Boolean> autoUpgradeMinorVersion,
        @Nullable Output<String> forceUpdateTag,
        @Nullable Output<String> protectedSettings,
        @Nullable Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault,
        @Nullable Output<String> publisher,
        @Nullable Output<List<String>> rolesAppliedTo,
        @Nullable Output<String> settings,
        @Nullable Output<String> type,
        @Nullable Output<String> typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.protectedSettings = protectedSettings;
        this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
        this.publisher = publisher;
        this.rolesAppliedTo = rolesAppliedTo;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private CloudServiceExtensionPropertiesArgs() {
        this.autoUpgradeMinorVersion = Codegen.empty();
        this.forceUpdateTag = Codegen.empty();
        this.protectedSettings = Codegen.empty();
        this.protectedSettingsFromKeyVault = Codegen.empty();
        this.publisher = Codegen.empty();
        this.rolesAppliedTo = Codegen.empty();
        this.settings = Codegen.empty();
        this.type = Codegen.empty();
        this.typeHandlerVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceExtensionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoUpgradeMinorVersion;
        private @Nullable Output<String> forceUpdateTag;
        private @Nullable Output<String> protectedSettings;
        private @Nullable Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault;
        private @Nullable Output<String> publisher;
        private @Nullable Output<List<String>> rolesAppliedTo;
        private @Nullable Output<String> settings;
        private @Nullable Output<String> type;
        private @Nullable Output<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceExtensionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.protectedSettingsFromKeyVault = defaults.protectedSettingsFromKeyVault;
    	      this.publisher = defaults.publisher;
    	      this.rolesAppliedTo = defaults.rolesAppliedTo;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Codegen.ofNullable(autoUpgradeMinorVersion);
            return this;
        }
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Codegen.ofNullable(forceUpdateTag);
            return this;
        }
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        public Builder protectedSettings(@Nullable String protectedSettings) {
            this.protectedSettings = Codegen.ofNullable(protectedSettings);
            return this;
        }
        public Builder protectedSettingsFromKeyVault(@Nullable Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault) {
            this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
            return this;
        }
        public Builder protectedSettingsFromKeyVault(@Nullable CloudServiceVaultAndSecretReferenceArgs protectedSettingsFromKeyVault) {
            this.protectedSettingsFromKeyVault = Codegen.ofNullable(protectedSettingsFromKeyVault);
            return this;
        }
        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = Codegen.ofNullable(publisher);
            return this;
        }
        public Builder rolesAppliedTo(@Nullable Output<List<String>> rolesAppliedTo) {
            this.rolesAppliedTo = rolesAppliedTo;
            return this;
        }
        public Builder rolesAppliedTo(@Nullable List<String> rolesAppliedTo) {
            this.rolesAppliedTo = Codegen.ofNullable(rolesAppliedTo);
            return this;
        }
        public Builder rolesAppliedTo(String... rolesAppliedTo) {
            return rolesAppliedTo(List.of(rolesAppliedTo));
        }
        public Builder settings(@Nullable Output<String> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(@Nullable String settings) {
            this.settings = Codegen.ofNullable(settings);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = Codegen.ofNullable(typeHandlerVersion);
            return this;
        }        public CloudServiceExtensionPropertiesArgs build() {
            return new CloudServiceExtensionPropertiesArgs(autoUpgradeMinorVersion, forceUpdateTag, protectedSettings, protectedSettingsFromKeyVault, publisher, rolesAppliedTo, settings, type, typeHandlerVersion);
        }
    }
}
