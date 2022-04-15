// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzPowerShellSetupResponse;
import io.pulumi.azurenative.datafactory.outputs.CmdkeySetupResponse;
import io.pulumi.azurenative.datafactory.outputs.ComponentSetupResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.EnvironmentVariableSetupResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeCustomSetupScriptPropertiesResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeDataProxyPropertiesResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeSsisCatalogInfoResponse;
import io.pulumi.azurenative.datafactory.outputs.PackageStoreResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeSsisPropertiesResponse {
    /**
     * Catalog information for managed dedicated integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Custom setup script properties for a managed dedicated integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties;
    /**
     * Data proxy properties for a managed dedicated integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties;
    /**
     * The edition for the SSIS Integration Runtime
     * 
     */
    private final @Nullable String edition;
    /**
     * Custom setup without script properties for a SSIS integration runtime.
     * 
     */
    private final @Nullable List<Object> expressCustomSetupProperties;
    /**
     * License type for bringing your own license scenario.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * Package stores for the SSIS Integration Runtime.
     * 
     */
    private final @Nullable List<PackageStoreResponse> packageStores;

    @CustomType.Constructor
    private IntegrationRuntimeSsisPropertiesResponse(
        @CustomType.Parameter("catalogInfo") @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo,
        @CustomType.Parameter("credential") @Nullable CredentialReferenceResponse credential,
        @CustomType.Parameter("customSetupScriptProperties") @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties,
        @CustomType.Parameter("dataProxyProperties") @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties,
        @CustomType.Parameter("edition") @Nullable String edition,
        @CustomType.Parameter("expressCustomSetupProperties") @Nullable List<Object> expressCustomSetupProperties,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("packageStores") @Nullable List<PackageStoreResponse> packageStores) {
        this.catalogInfo = catalogInfo;
        this.credential = credential;
        this.customSetupScriptProperties = customSetupScriptProperties;
        this.dataProxyProperties = dataProxyProperties;
        this.edition = edition;
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        this.licenseType = licenseType;
        this.packageStores = packageStores;
    }

    /**
     * Catalog information for managed dedicated integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeSsisCatalogInfoResponse> catalogInfo() {
        return Optional.ofNullable(this.catalogInfo);
    }
    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Custom setup script properties for a managed dedicated integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeCustomSetupScriptPropertiesResponse> customSetupScriptProperties() {
        return Optional.ofNullable(this.customSetupScriptProperties);
    }
    /**
     * Data proxy properties for a managed dedicated integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeDataProxyPropertiesResponse> dataProxyProperties() {
        return Optional.ofNullable(this.dataProxyProperties);
    }
    /**
     * The edition for the SSIS Integration Runtime
     * 
    */
    public Optional<String> edition() {
        return Optional.ofNullable(this.edition);
    }
    /**
     * Custom setup without script properties for a SSIS integration runtime.
     * 
    */
    public List<Object> expressCustomSetupProperties() {
        return this.expressCustomSetupProperties == null ? List.of() : this.expressCustomSetupProperties;
    }
    /**
     * License type for bringing your own license scenario.
     * 
    */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * Package stores for the SSIS Integration Runtime.
     * 
    */
    public List<PackageStoreResponse> packageStores() {
        return this.packageStores == null ? List.of() : this.packageStores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties;
        private @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties;
        private @Nullable String edition;
        private @Nullable List<Object> expressCustomSetupProperties;
        private @Nullable String licenseType;
        private @Nullable List<PackageStoreResponse> packageStores;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogInfo = defaults.catalogInfo;
    	      this.credential = defaults.credential;
    	      this.customSetupScriptProperties = defaults.customSetupScriptProperties;
    	      this.dataProxyProperties = defaults.dataProxyProperties;
    	      this.edition = defaults.edition;
    	      this.expressCustomSetupProperties = defaults.expressCustomSetupProperties;
    	      this.licenseType = defaults.licenseType;
    	      this.packageStores = defaults.packageStores;
        }

        public Builder catalogInfo(@Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo) {
            this.catalogInfo = catalogInfo;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }
        public Builder customSetupScriptProperties(@Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties) {
            this.customSetupScriptProperties = customSetupScriptProperties;
            return this;
        }
        public Builder dataProxyProperties(@Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties) {
            this.dataProxyProperties = dataProxyProperties;
            return this;
        }
        public Builder edition(@Nullable String edition) {
            this.edition = edition;
            return this;
        }
        public Builder expressCustomSetupProperties(@Nullable List<Object> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = expressCustomSetupProperties;
            return this;
        }
        public Builder expressCustomSetupProperties(Object... expressCustomSetupProperties) {
            return expressCustomSetupProperties(List.of(expressCustomSetupProperties));
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder packageStores(@Nullable List<PackageStoreResponse> packageStores) {
            this.packageStores = packageStores;
            return this;
        }
        public Builder packageStores(PackageStoreResponse... packageStores) {
            return packageStores(List.of(packageStores));
        }        public IntegrationRuntimeSsisPropertiesResponse build() {
            return new IntegrationRuntimeSsisPropertiesResponse(catalogInfo, credential, customSetupScriptProperties, dataProxyProperties, edition, expressCustomSetupProperties, licenseType, packageStores);
        }
    }
}
