// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.enums.IntegrationRuntimeSsisCatalogPricingTier;
import io.pulumi.azurenative.synapse.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Catalog information for managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeSsisCatalogInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeSsisCatalogInfoArgs Empty = new IntegrationRuntimeSsisCatalogInfoArgs();

    /**
     * The password of the administrator user account of the catalog database.
     * 
     */
    @Import(name="catalogAdminPassword")
      private final @Nullable Output<SecureStringArgs> catalogAdminPassword;

    public Output<SecureStringArgs> catalogAdminPassword() {
        return this.catalogAdminPassword == null ? Codegen.empty() : this.catalogAdminPassword;
    }

    /**
     * The administrator user name of catalog database.
     * 
     */
    @Import(name="catalogAdminUserName")
      private final @Nullable Output<String> catalogAdminUserName;

    public Output<String> catalogAdminUserName() {
        return this.catalogAdminUserName == null ? Codegen.empty() : this.catalogAdminUserName;
    }

    /**
     * The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    @Import(name="catalogPricingTier")
      private final @Nullable Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier;

    public Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier() {
        return this.catalogPricingTier == null ? Codegen.empty() : this.catalogPricingTier;
    }

    /**
     * The catalog database server URL.
     * 
     */
    @Import(name="catalogServerEndpoint")
      private final @Nullable Output<String> catalogServerEndpoint;

    public Output<String> catalogServerEndpoint() {
        return this.catalogServerEndpoint == null ? Codegen.empty() : this.catalogServerEndpoint;
    }

    public IntegrationRuntimeSsisCatalogInfoArgs(
        @Nullable Output<SecureStringArgs> catalogAdminPassword,
        @Nullable Output<String> catalogAdminUserName,
        @Nullable Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier,
        @Nullable Output<String> catalogServerEndpoint) {
        this.catalogAdminPassword = catalogAdminPassword;
        this.catalogAdminUserName = catalogAdminUserName;
        this.catalogPricingTier = catalogPricingTier;
        this.catalogServerEndpoint = catalogServerEndpoint;
    }

    private IntegrationRuntimeSsisCatalogInfoArgs() {
        this.catalogAdminPassword = Codegen.empty();
        this.catalogAdminUserName = Codegen.empty();
        this.catalogPricingTier = Codegen.empty();
        this.catalogServerEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisCatalogInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecureStringArgs> catalogAdminPassword;
        private @Nullable Output<String> catalogAdminUserName;
        private @Nullable Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier;
        private @Nullable Output<String> catalogServerEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisCatalogInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogAdminPassword = defaults.catalogAdminPassword;
    	      this.catalogAdminUserName = defaults.catalogAdminUserName;
    	      this.catalogPricingTier = defaults.catalogPricingTier;
    	      this.catalogServerEndpoint = defaults.catalogServerEndpoint;
        }

        public Builder catalogAdminPassword(@Nullable Output<SecureStringArgs> catalogAdminPassword) {
            this.catalogAdminPassword = catalogAdminPassword;
            return this;
        }
        public Builder catalogAdminPassword(@Nullable SecureStringArgs catalogAdminPassword) {
            this.catalogAdminPassword = Codegen.ofNullable(catalogAdminPassword);
            return this;
        }
        public Builder catalogAdminUserName(@Nullable Output<String> catalogAdminUserName) {
            this.catalogAdminUserName = catalogAdminUserName;
            return this;
        }
        public Builder catalogAdminUserName(@Nullable String catalogAdminUserName) {
            this.catalogAdminUserName = Codegen.ofNullable(catalogAdminUserName);
            return this;
        }
        public Builder catalogPricingTier(@Nullable Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier) {
            this.catalogPricingTier = catalogPricingTier;
            return this;
        }
        public Builder catalogPricingTier(@Nullable Either<String,IntegrationRuntimeSsisCatalogPricingTier> catalogPricingTier) {
            this.catalogPricingTier = Codegen.ofNullable(catalogPricingTier);
            return this;
        }
        public Builder catalogServerEndpoint(@Nullable Output<String> catalogServerEndpoint) {
            this.catalogServerEndpoint = catalogServerEndpoint;
            return this;
        }
        public Builder catalogServerEndpoint(@Nullable String catalogServerEndpoint) {
            this.catalogServerEndpoint = Codegen.ofNullable(catalogServerEndpoint);
            return this;
        }        public IntegrationRuntimeSsisCatalogInfoArgs build() {
            return new IntegrationRuntimeSsisCatalogInfoArgs(catalogAdminPassword, catalogAdminUserName, catalogPricingTier, catalogServerEndpoint);
        }
    }
}
