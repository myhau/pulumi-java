// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes;

import io.pulumi.azurenative.kubernetes.enums.ProvisioningState;
import io.pulumi.azurenative.kubernetes.inputs.ConnectedClusterIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectedClusterArgs Empty = new ConnectedClusterArgs();

    /**
     * Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     * 
     */
    @Import(name="agentPublicKeyCertificate", required=true)
      private final Output<String> agentPublicKeyCertificate;

    public Output<String> agentPublicKeyCertificate() {
        return this.agentPublicKeyCertificate;
    }

    /**
     * The name of the Kubernetes cluster on which get is called.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    /**
     * The Kubernetes distribution running on this connected cluster.
     * 
     */
    @Import(name="distribution")
      private final @Nullable Output<String> distribution;

    public Output<String> distribution() {
        return this.distribution == null ? Codegen.empty() : this.distribution;
    }

    /**
     * The identity of the connected cluster.
     * 
     */
    @Import(name="identity", required=true)
      private final Output<ConnectedClusterIdentityArgs> identity;

    public Output<ConnectedClusterIdentityArgs> identity() {
        return this.identity;
    }

    /**
     * The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     * 
     */
    @Import(name="infrastructure")
      private final @Nullable Output<String> infrastructure;

    public Output<String> infrastructure() {
        return this.infrastructure == null ? Codegen.empty() : this.infrastructure;
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
     * Provisioning state of the connected cluster resource.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Output<Either<String,ProvisioningState>> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ConnectedClusterArgs(
        Output<String> agentPublicKeyCertificate,
        @Nullable Output<String> clusterName,
        @Nullable Output<String> distribution,
        Output<ConnectedClusterIdentityArgs> identity,
        @Nullable Output<String> infrastructure,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,ProvisioningState>> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.agentPublicKeyCertificate = Objects.requireNonNull(agentPublicKeyCertificate, "expected parameter 'agentPublicKeyCertificate' to be non-null");
        this.clusterName = clusterName;
        this.distribution = distribution;
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.infrastructure = infrastructure;
        this.location = location;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ConnectedClusterArgs() {
        this.agentPublicKeyCertificate = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.distribution = Codegen.empty();
        this.identity = Codegen.empty();
        this.infrastructure = Codegen.empty();
        this.location = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agentPublicKeyCertificate;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<String> distribution;
        private Output<ConnectedClusterIdentityArgs> identity;
        private @Nullable Output<String> infrastructure;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,ProvisioningState>> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPublicKeyCertificate = defaults.agentPublicKeyCertificate;
    	      this.clusterName = defaults.clusterName;
    	      this.distribution = defaults.distribution;
    	      this.identity = defaults.identity;
    	      this.infrastructure = defaults.infrastructure;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder agentPublicKeyCertificate(Output<String> agentPublicKeyCertificate) {
            this.agentPublicKeyCertificate = Objects.requireNonNull(agentPublicKeyCertificate);
            return this;
        }
        public Builder agentPublicKeyCertificate(String agentPublicKeyCertificate) {
            this.agentPublicKeyCertificate = Output.of(Objects.requireNonNull(agentPublicKeyCertificate));
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder distribution(@Nullable Output<String> distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder distribution(@Nullable String distribution) {
            this.distribution = Codegen.ofNullable(distribution);
            return this;
        }
        public Builder identity(Output<ConnectedClusterIdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder identity(ConnectedClusterIdentityArgs identity) {
            this.identity = Output.of(Objects.requireNonNull(identity));
            return this;
        }
        public Builder infrastructure(@Nullable Output<String> infrastructure) {
            this.infrastructure = infrastructure;
            return this;
        }
        public Builder infrastructure(@Nullable String infrastructure) {
            this.infrastructure = Codegen.ofNullable(infrastructure);
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
        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ConnectedClusterArgs build() {
            return new ConnectedClusterArgs(agentPublicKeyCertificate, clusterName, distribution, identity, infrastructure, location, provisioningState, resourceGroupName, tags);
        }
    }
}
