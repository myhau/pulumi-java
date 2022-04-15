// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.enums.PublicNetworkAccessType;
import io.pulumi.azurenative.operationalinsights.enums.WorkspaceEntityStatus;
import io.pulumi.azurenative.operationalinsights.inputs.WorkspaceCappingArgs;
import io.pulumi.azurenative.operationalinsights.inputs.WorkspaceFeaturesArgs;
import io.pulumi.azurenative.operationalinsights.inputs.WorkspaceSkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The ETag of the workspace.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> eTag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * Workspace features.
     * 
     */
    @Import(name="features")
      private final @Nullable Output<WorkspaceFeaturesArgs> features;

    public Output<WorkspaceFeaturesArgs> features() {
        return this.features == null ? Codegen.empty() : this.features;
    }

    /**
     * Indicates whether customer managed storage is mandatory for query management.
     * 
     */
    @Import(name="forceCmkForQuery")
      private final @Nullable Output<Boolean> forceCmkForQuery;

    public Output<Boolean> forceCmkForQuery() {
        return this.forceCmkForQuery == null ? Codegen.empty() : this.forceCmkForQuery;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The provisioning state of the workspace.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,WorkspaceEntityStatus>> provisioningState;

    public Output<Either<String,WorkspaceEntityStatus>> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    /**
     * The network access type for accessing Log Analytics ingestion.
     * 
     */
    @Import(name="publicNetworkAccessForIngestion")
      private final @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion;

    public Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion() {
        return this.publicNetworkAccessForIngestion == null ? Codegen.empty() : this.publicNetworkAccessForIngestion;
    }

    /**
     * The network access type for accessing Log Analytics query.
     * 
     */
    @Import(name="publicNetworkAccessForQuery")
      private final @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery;

    public Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery() {
        return this.publicNetworkAccessForQuery == null ? Codegen.empty() : this.publicNetworkAccessForQuery;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
     * 
     */
    @Import(name="retentionInDays")
      private final @Nullable Output<Integer> retentionInDays;

    public Output<Integer> retentionInDays() {
        return this.retentionInDays == null ? Codegen.empty() : this.retentionInDays;
    }

    /**
     * The SKU of the workspace.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<WorkspaceSkuArgs> sku;

    public Output<WorkspaceSkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The daily volume cap for ingestion.
     * 
     */
    @Import(name="workspaceCapping")
      private final @Nullable Output<WorkspaceCappingArgs> workspaceCapping;

    public Output<WorkspaceCappingArgs> workspaceCapping() {
        return this.workspaceCapping == null ? Codegen.empty() : this.workspaceCapping;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName")
      private final @Nullable Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName == null ? Codegen.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Output<String> eTag,
        @Nullable Output<WorkspaceFeaturesArgs> features,
        @Nullable Output<Boolean> forceCmkForQuery,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,WorkspaceEntityStatus>> provisioningState,
        @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion,
        @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> retentionInDays,
        @Nullable Output<WorkspaceSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<WorkspaceCappingArgs> workspaceCapping,
        @Nullable Output<String> workspaceName) {
        this.eTag = eTag;
        this.features = features;
        this.forceCmkForQuery = forceCmkForQuery;
        this.location = location;
        this.provisioningState = provisioningState;
        this.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
        this.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionInDays = retentionInDays;
        this.sku = sku;
        this.tags = tags;
        this.workspaceCapping = workspaceCapping;
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.eTag = Codegen.empty();
        this.features = Codegen.empty();
        this.forceCmkForQuery = Codegen.empty();
        this.location = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.publicNetworkAccessForIngestion = Codegen.empty();
        this.publicNetworkAccessForQuery = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.retentionInDays = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
        this.workspaceCapping = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private @Nullable Output<WorkspaceFeaturesArgs> features;
        private @Nullable Output<Boolean> forceCmkForQuery;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,WorkspaceEntityStatus>> provisioningState;
        private @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion;
        private @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> retentionInDays;
        private @Nullable Output<WorkspaceSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<WorkspaceCappingArgs> workspaceCapping;
        private @Nullable Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.features = defaults.features;
    	      this.forceCmkForQuery = defaults.forceCmkForQuery;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccessForIngestion = defaults.publicNetworkAccessForIngestion;
    	      this.publicNetworkAccessForQuery = defaults.publicNetworkAccessForQuery;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.workspaceCapping = defaults.workspaceCapping;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder features(@Nullable Output<WorkspaceFeaturesArgs> features) {
            this.features = features;
            return this;
        }
        public Builder features(@Nullable WorkspaceFeaturesArgs features) {
            this.features = Codegen.ofNullable(features);
            return this;
        }
        public Builder forceCmkForQuery(@Nullable Output<Boolean> forceCmkForQuery) {
            this.forceCmkForQuery = forceCmkForQuery;
            return this;
        }
        public Builder forceCmkForQuery(@Nullable Boolean forceCmkForQuery) {
            this.forceCmkForQuery = Codegen.ofNullable(forceCmkForQuery);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,WorkspaceEntityStatus>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,WorkspaceEntityStatus> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }
        public Builder publicNetworkAccessForIngestion(@Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion) {
            this.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
            return this;
        }
        public Builder publicNetworkAccessForIngestion(@Nullable Either<String,PublicNetworkAccessType> publicNetworkAccessForIngestion) {
            this.publicNetworkAccessForIngestion = Codegen.ofNullable(publicNetworkAccessForIngestion);
            return this;
        }
        public Builder publicNetworkAccessForQuery(@Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery) {
            this.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
            return this;
        }
        public Builder publicNetworkAccessForQuery(@Nullable Either<String,PublicNetworkAccessType> publicNetworkAccessForQuery) {
            this.publicNetworkAccessForQuery = Codegen.ofNullable(publicNetworkAccessForQuery);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Codegen.ofNullable(retentionInDays);
            return this;
        }
        public Builder sku(@Nullable Output<WorkspaceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable WorkspaceSkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder workspaceCapping(@Nullable Output<WorkspaceCappingArgs> workspaceCapping) {
            this.workspaceCapping = workspaceCapping;
            return this;
        }
        public Builder workspaceCapping(@Nullable WorkspaceCappingArgs workspaceCapping) {
            this.workspaceCapping = Codegen.ofNullable(workspaceCapping);
            return this;
        }
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public Builder workspaceName(@Nullable String workspaceName) {
            this.workspaceName = Codegen.ofNullable(workspaceName);
            return this;
        }        public WorkspaceArgs build() {
            return new WorkspaceArgs(eTag, features, forceCmkForQuery, location, provisioningState, publicNetworkAccessForIngestion, publicNetworkAccessForQuery, resourceGroupName, retentionInDays, sku, tags, workspaceCapping, workspaceName);
        }
    }
}
