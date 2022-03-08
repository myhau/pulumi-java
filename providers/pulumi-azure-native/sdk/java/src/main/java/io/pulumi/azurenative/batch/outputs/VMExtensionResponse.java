// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VMExtensionResponse {
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    private final String name;
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    private final @Nullable Object protectedSettings;
    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    private final @Nullable List<String> provisionAfterExtensions;
    private final String publisher;
    private final @Nullable Object settings;
    private final String type;
    private final @Nullable String typeHandlerVersion;

    @OutputCustomType.Constructor({"autoUpgradeMinorVersion","name","protectedSettings","provisionAfterExtensions","publisher","settings","type","typeHandlerVersion"})
    private VMExtensionResponse(
        @Nullable Boolean autoUpgradeMinorVersion,
        String name,
        @Nullable Object protectedSettings,
        @Nullable List<String> provisionAfterExtensions,
        String publisher,
        @Nullable Object settings,
        String type,
        @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.publisher = publisher;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
    */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    public String getName() {
        return this.name;
    }
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
    */
    public Optional<Object> getProtectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
    */
    public List<String> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }
    public String getPublisher() {
        return this.publisher;
    }
    public Optional<Object> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private String name;
        private @Nullable Object protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String publisher;
        private @Nullable Object settings;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VMExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProvisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public VMExtensionResponse build() {
            return new VMExtensionResponse(autoUpgradeMinorVersion, name, protectedSettings, provisionAfterExtensions, publisher, settings, type, typeHandlerVersion);
        }
    }
}
