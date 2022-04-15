// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.IntegrationRuntimeEdition;
import io.pulumi.azurenative.datafactory.enums.IntegrationRuntimeLicenseType;
import io.pulumi.azurenative.datafactory.inputs.AzPowerShellSetupArgs;
import io.pulumi.azurenative.datafactory.inputs.CmdkeySetupArgs;
import io.pulumi.azurenative.datafactory.inputs.ComponentSetupArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.EnvironmentVariableSetupArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeCustomSetupScriptPropertiesArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeDataProxyPropertiesArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs;
import io.pulumi.azurenative.datafactory.inputs.PackageStoreArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSIS properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeSsisPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeSsisPropertiesArgs Empty = new IntegrationRuntimeSsisPropertiesArgs();

    /**
     * Catalog information for managed dedicated integration runtime.
     * 
     */
    @Import(name="catalogInfo")
      private final @Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo;

    public Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo() {
        return this.catalogInfo == null ? Codegen.empty() : this.catalogInfo;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> credential() {
        return this.credential == null ? Codegen.empty() : this.credential;
    }

    /**
     * Custom setup script properties for a managed dedicated integration runtime.
     * 
     */
    @Import(name="customSetupScriptProperties")
      private final @Nullable Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties;

    public Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties() {
        return this.customSetupScriptProperties == null ? Codegen.empty() : this.customSetupScriptProperties;
    }

    /**
     * Data proxy properties for a managed dedicated integration runtime.
     * 
     */
    @Import(name="dataProxyProperties")
      private final @Nullable Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties;

    public Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties() {
        return this.dataProxyProperties == null ? Codegen.empty() : this.dataProxyProperties;
    }

    /**
     * The edition for the SSIS Integration Runtime
     * 
     */
    @Import(name="edition")
      private final @Nullable Output<Either<String,IntegrationRuntimeEdition>> edition;

    public Output<Either<String,IntegrationRuntimeEdition>> edition() {
        return this.edition == null ? Codegen.empty() : this.edition;
    }

    /**
     * Custom setup without script properties for a SSIS integration runtime.
     * 
     */
    @Import(name="expressCustomSetupProperties")
      private final @Nullable Output<List<Object>> expressCustomSetupProperties;

    public Output<List<Object>> expressCustomSetupProperties() {
        return this.expressCustomSetupProperties == null ? Codegen.empty() : this.expressCustomSetupProperties;
    }

    /**
     * License type for bringing your own license scenario.
     * 
     */
    @Import(name="licenseType")
      private final @Nullable Output<Either<String,IntegrationRuntimeLicenseType>> licenseType;

    public Output<Either<String,IntegrationRuntimeLicenseType>> licenseType() {
        return this.licenseType == null ? Codegen.empty() : this.licenseType;
    }

    /**
     * Package stores for the SSIS Integration Runtime.
     * 
     */
    @Import(name="packageStores")
      private final @Nullable Output<List<PackageStoreArgs>> packageStores;

    public Output<List<PackageStoreArgs>> packageStores() {
        return this.packageStores == null ? Codegen.empty() : this.packageStores;
    }

    public IntegrationRuntimeSsisPropertiesArgs(
        @Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo,
        @Nullable Output<CredentialReferenceArgs> credential,
        @Nullable Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties,
        @Nullable Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties,
        @Nullable Output<Either<String,IntegrationRuntimeEdition>> edition,
        @Nullable Output<List<Object>> expressCustomSetupProperties,
        @Nullable Output<Either<String,IntegrationRuntimeLicenseType>> licenseType,
        @Nullable Output<List<PackageStoreArgs>> packageStores) {
        this.catalogInfo = catalogInfo;
        this.credential = credential;
        this.customSetupScriptProperties = customSetupScriptProperties;
        this.dataProxyProperties = dataProxyProperties;
        this.edition = edition;
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        this.licenseType = licenseType;
        this.packageStores = packageStores;
    }

    private IntegrationRuntimeSsisPropertiesArgs() {
        this.catalogInfo = Codegen.empty();
        this.credential = Codegen.empty();
        this.customSetupScriptProperties = Codegen.empty();
        this.dataProxyProperties = Codegen.empty();
        this.edition = Codegen.empty();
        this.expressCustomSetupProperties = Codegen.empty();
        this.licenseType = Codegen.empty();
        this.packageStores = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private @Nullable Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties;
        private @Nullable Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties;
        private @Nullable Output<Either<String,IntegrationRuntimeEdition>> edition;
        private @Nullable Output<List<Object>> expressCustomSetupProperties;
        private @Nullable Output<Either<String,IntegrationRuntimeLicenseType>> licenseType;
        private @Nullable Output<List<PackageStoreArgs>> packageStores;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisPropertiesArgs defaults) {
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

        public Builder catalogInfo(@Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo) {
            this.catalogInfo = catalogInfo;
            return this;
        }
        public Builder catalogInfo(@Nullable IntegrationRuntimeSsisCatalogInfoArgs catalogInfo) {
            this.catalogInfo = Codegen.ofNullable(catalogInfo);
            return this;
        }
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Codegen.ofNullable(credential);
            return this;
        }
        public Builder customSetupScriptProperties(@Nullable Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties) {
            this.customSetupScriptProperties = customSetupScriptProperties;
            return this;
        }
        public Builder customSetupScriptProperties(@Nullable IntegrationRuntimeCustomSetupScriptPropertiesArgs customSetupScriptProperties) {
            this.customSetupScriptProperties = Codegen.ofNullable(customSetupScriptProperties);
            return this;
        }
        public Builder dataProxyProperties(@Nullable Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties) {
            this.dataProxyProperties = dataProxyProperties;
            return this;
        }
        public Builder dataProxyProperties(@Nullable IntegrationRuntimeDataProxyPropertiesArgs dataProxyProperties) {
            this.dataProxyProperties = Codegen.ofNullable(dataProxyProperties);
            return this;
        }
        public Builder edition(@Nullable Output<Either<String,IntegrationRuntimeEdition>> edition) {
            this.edition = edition;
            return this;
        }
        public Builder edition(@Nullable Either<String,IntegrationRuntimeEdition> edition) {
            this.edition = Codegen.ofNullable(edition);
            return this;
        }
        public Builder expressCustomSetupProperties(@Nullable Output<List<Object>> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = expressCustomSetupProperties;
            return this;
        }
        public Builder expressCustomSetupProperties(@Nullable List<Object> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = Codegen.ofNullable(expressCustomSetupProperties);
            return this;
        }
        public Builder expressCustomSetupProperties(Object... expressCustomSetupProperties) {
            return expressCustomSetupProperties(List.of(expressCustomSetupProperties));
        }
        public Builder licenseType(@Nullable Output<Either<String,IntegrationRuntimeLicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder licenseType(@Nullable Either<String,IntegrationRuntimeLicenseType> licenseType) {
            this.licenseType = Codegen.ofNullable(licenseType);
            return this;
        }
        public Builder packageStores(@Nullable Output<List<PackageStoreArgs>> packageStores) {
            this.packageStores = packageStores;
            return this;
        }
        public Builder packageStores(@Nullable List<PackageStoreArgs> packageStores) {
            this.packageStores = Codegen.ofNullable(packageStores);
            return this;
        }
        public Builder packageStores(PackageStoreArgs... packageStores) {
            return packageStores(List.of(packageStores));
        }        public IntegrationRuntimeSsisPropertiesArgs build() {
            return new IntegrationRuntimeSsisPropertiesArgs(catalogInfo, credential, customSetupScriptProperties, dataProxyProperties, edition, expressCustomSetupProperties, licenseType, packageStores);
        }
    }
}
