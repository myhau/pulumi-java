// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineScaleSetExtensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetExtensionResponse Empty = new VirtualMachineScaleSetExtensionResponse();

    @InputImport(name="autoUpgradeMinorVersion")
    private final @Nullable Boolean autoUpgradeMinorVersion;

    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Optional.empty() : Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    @InputImport(name="enableAutomaticUpgrade")
    private final @Nullable Boolean enableAutomaticUpgrade;

    public Optional<Boolean> getEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade == null ? Optional.empty() : Optional.ofNullable(this.enableAutomaticUpgrade);
    }

    @InputImport(name="forceUpdateTag")
    private final @Nullable String forceUpdateTag;

    public Optional<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Optional.empty() : Optional.ofNullable(this.forceUpdateTag);
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="protectedSettings")
    private final @Nullable Object protectedSettings;

    public Optional<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Optional.empty() : Optional.ofNullable(this.protectedSettings);
    }

    @InputImport(name="provisionAfterExtensions")
    private final @Nullable List<String> provisionAfterExtensions;

    public List<String> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="publisher")
    private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    @InputImport(name="settings")
    private final @Nullable Object settings;

    public Optional<Object> getSettings() {
        return this.settings == null ? Optional.empty() : Optional.ofNullable(this.settings);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="typeHandlerVersion")
    private final @Nullable String typeHandlerVersion;

    public Optional<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Optional.empty() : Optional.ofNullable(this.typeHandlerVersion);
    }

    public VirtualMachineScaleSetExtensionResponse(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable Boolean enableAutomaticUpgrade,
        @Nullable String forceUpdateTag,
        String id,
        @Nullable String name,
        @Nullable Object protectedSettings,
        @Nullable List<String> provisionAfterExtensions,
        String provisioningState,
        @Nullable String publisher,
        @Nullable Object settings,
        String type,
        @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publisher = publisher;
        this.settings = settings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineScaleSetExtensionResponse() {
        this.autoUpgradeMinorVersion = null;
        this.enableAutomaticUpgrade = null;
        this.forceUpdateTag = null;
        this.id = null;
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

    public static Builder builder(VirtualMachineScaleSetExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable Boolean enableAutomaticUpgrade;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable String name;
        private @Nullable Object protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable Object settings;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.enableAutomaticUpgrade = defaults.enableAutomaticUpgrade;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Boolean enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
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

        public VirtualMachineScaleSetExtensionResponse build() {
            return new VirtualMachineScaleSetExtensionResponse(autoUpgradeMinorVersion, enableAutomaticUpgrade, forceUpdateTag, id, name, protectedSettings, provisionAfterExtensions, provisioningState, publisher, settings, type, typeHandlerVersion);
        }
    }
}