// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies set of extensions that should be installed onto the virtual machines.
 * 
 */
public final class VMSSExtensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMSSExtensionResponse Empty = new VMSSExtensionResponse();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
      private final @Nullable Boolean autoUpgradeMinorVersion;

    public Optional<Boolean> autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Optional.empty() : Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
      private final @Nullable String forceUpdateTag;

    public Optional<String> forceUpdateTag() {
        return this.forceUpdateTag == null ? Optional.empty() : Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * The name of the extension.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @Import(name="protectedSettings")
      private final @Nullable Object protectedSettings;

    public Optional<Object> protectedSettings() {
        return this.protectedSettings == null ? Optional.empty() : Optional.ofNullable(this.protectedSettings);
    }

    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    @Import(name="provisionAfterExtensions")
      private final @Nullable List<String> provisionAfterExtensions;

    public List<String> provisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }

    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @Import(name="publisher", required=true)
      private final String publisher;

    public String publisher() {
        return this.publisher;
    }

    /**
     * Json formatted public settings for the extension.
     * 
     */
    @Import(name="settings")
      private final @Nullable Object settings;

    public Optional<Object> settings() {
        return this.settings == null ? Optional.empty() : Optional.ofNullable(this.settings);
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @Import(name="typeHandlerVersion", required=true)
      private final String typeHandlerVersion;

    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public VMSSExtensionResponse(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable String forceUpdateTag,
        String name,
        @Nullable Object protectedSettings,
        @Nullable List<String> provisionAfterExtensions,
        String provisioningState,
        String publisher,
        @Nullable Object settings,
        String type,
        String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.settings = settings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion, "expected parameter 'typeHandlerVersion' to be non-null");
    }

    private VMSSExtensionResponse() {
        this.autoUpgradeMinorVersion = null;
        this.forceUpdateTag = null;
        this.name = null;
        this.protectedSettings = null;
        this.provisionAfterExtensions = List.of();
        this.provisioningState = null;
        this.publisher = null;
        this.settings = null;
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMSSExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String forceUpdateTag;
        private String name;
        private @Nullable Object protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String provisioningState;
        private String publisher;
        private @Nullable Object settings;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VMSSExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        public Builder provisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder settings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }        public VMSSExtensionResponse build() {
            return new VMSSExtensionResponse(autoUpgradeMinorVersion, forceUpdateTag, name, protectedSettings, provisionAfterExtensions, provisioningState, publisher, settings, type, typeHandlerVersion);
        }
    }
}
