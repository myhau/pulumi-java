// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.X509CertificateNameArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the Service Fabric Type Backend.
 * 
 */
public final class BackendServiceFabricClusterPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceFabricClusterPropertiesArgs Empty = new BackendServiceFabricClusterPropertiesArgs();

    /**
     * The client certificate id for the management endpoint.
     * 
     */
    @Import(name="clientCertificateId")
      private final @Nullable Output<String> clientCertificateId;

    public Output<String> clientCertificateId() {
        return this.clientCertificateId == null ? Codegen.empty() : this.clientCertificateId;
    }

    /**
     * The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
     * 
     */
    @Import(name="clientCertificatethumbprint")
      private final @Nullable Output<String> clientCertificatethumbprint;

    public Output<String> clientCertificatethumbprint() {
        return this.clientCertificatethumbprint == null ? Codegen.empty() : this.clientCertificatethumbprint;
    }

    /**
     * The cluster management endpoint.
     * 
     */
    @Import(name="managementEndpoints", required=true)
      private final Output<List<String>> managementEndpoints;

    public Output<List<String>> managementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Maximum number of retries while attempting resolve the partition.
     * 
     */
    @Import(name="maxPartitionResolutionRetries")
      private final @Nullable Output<Integer> maxPartitionResolutionRetries;

    public Output<Integer> maxPartitionResolutionRetries() {
        return this.maxPartitionResolutionRetries == null ? Codegen.empty() : this.maxPartitionResolutionRetries;
    }

    /**
     * Thumbprints of certificates cluster management service uses for tls communication
     * 
     */
    @Import(name="serverCertificateThumbprints")
      private final @Nullable Output<List<String>> serverCertificateThumbprints;

    public Output<List<String>> serverCertificateThumbprints() {
        return this.serverCertificateThumbprints == null ? Codegen.empty() : this.serverCertificateThumbprints;
    }

    /**
     * Server X509 Certificate Names Collection
     * 
     */
    @Import(name="serverX509Names")
      private final @Nullable Output<List<X509CertificateNameArgs>> serverX509Names;

    public Output<List<X509CertificateNameArgs>> serverX509Names() {
        return this.serverX509Names == null ? Codegen.empty() : this.serverX509Names;
    }

    public BackendServiceFabricClusterPropertiesArgs(
        @Nullable Output<String> clientCertificateId,
        @Nullable Output<String> clientCertificatethumbprint,
        Output<List<String>> managementEndpoints,
        @Nullable Output<Integer> maxPartitionResolutionRetries,
        @Nullable Output<List<String>> serverCertificateThumbprints,
        @Nullable Output<List<X509CertificateNameArgs>> serverX509Names) {
        this.clientCertificateId = clientCertificateId;
        this.clientCertificatethumbprint = clientCertificatethumbprint;
        this.managementEndpoints = Objects.requireNonNull(managementEndpoints, "expected parameter 'managementEndpoints' to be non-null");
        this.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
        this.serverCertificateThumbprints = serverCertificateThumbprints;
        this.serverX509Names = serverX509Names;
    }

    private BackendServiceFabricClusterPropertiesArgs() {
        this.clientCertificateId = Codegen.empty();
        this.clientCertificatethumbprint = Codegen.empty();
        this.managementEndpoints = Codegen.empty();
        this.maxPartitionResolutionRetries = Codegen.empty();
        this.serverCertificateThumbprints = Codegen.empty();
        this.serverX509Names = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceFabricClusterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientCertificateId;
        private @Nullable Output<String> clientCertificatethumbprint;
        private Output<List<String>> managementEndpoints;
        private @Nullable Output<Integer> maxPartitionResolutionRetries;
        private @Nullable Output<List<String>> serverCertificateThumbprints;
        private @Nullable Output<List<X509CertificateNameArgs>> serverX509Names;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceFabricClusterPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.clientCertificatethumbprint = defaults.clientCertificatethumbprint;
    	      this.managementEndpoints = defaults.managementEndpoints;
    	      this.maxPartitionResolutionRetries = defaults.maxPartitionResolutionRetries;
    	      this.serverCertificateThumbprints = defaults.serverCertificateThumbprints;
    	      this.serverX509Names = defaults.serverX509Names;
        }

        public Builder clientCertificateId(@Nullable Output<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }
        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Codegen.ofNullable(clientCertificateId);
            return this;
        }
        public Builder clientCertificatethumbprint(@Nullable Output<String> clientCertificatethumbprint) {
            this.clientCertificatethumbprint = clientCertificatethumbprint;
            return this;
        }
        public Builder clientCertificatethumbprint(@Nullable String clientCertificatethumbprint) {
            this.clientCertificatethumbprint = Codegen.ofNullable(clientCertificatethumbprint);
            return this;
        }
        public Builder managementEndpoints(Output<List<String>> managementEndpoints) {
            this.managementEndpoints = Objects.requireNonNull(managementEndpoints);
            return this;
        }
        public Builder managementEndpoints(List<String> managementEndpoints) {
            this.managementEndpoints = Output.of(Objects.requireNonNull(managementEndpoints));
            return this;
        }
        public Builder managementEndpoints(String... managementEndpoints) {
            return managementEndpoints(List.of(managementEndpoints));
        }
        public Builder maxPartitionResolutionRetries(@Nullable Output<Integer> maxPartitionResolutionRetries) {
            this.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
            return this;
        }
        public Builder maxPartitionResolutionRetries(@Nullable Integer maxPartitionResolutionRetries) {
            this.maxPartitionResolutionRetries = Codegen.ofNullable(maxPartitionResolutionRetries);
            return this;
        }
        public Builder serverCertificateThumbprints(@Nullable Output<List<String>> serverCertificateThumbprints) {
            this.serverCertificateThumbprints = serverCertificateThumbprints;
            return this;
        }
        public Builder serverCertificateThumbprints(@Nullable List<String> serverCertificateThumbprints) {
            this.serverCertificateThumbprints = Codegen.ofNullable(serverCertificateThumbprints);
            return this;
        }
        public Builder serverCertificateThumbprints(String... serverCertificateThumbprints) {
            return serverCertificateThumbprints(List.of(serverCertificateThumbprints));
        }
        public Builder serverX509Names(@Nullable Output<List<X509CertificateNameArgs>> serverX509Names) {
            this.serverX509Names = serverX509Names;
            return this;
        }
        public Builder serverX509Names(@Nullable List<X509CertificateNameArgs> serverX509Names) {
            this.serverX509Names = Codegen.ofNullable(serverX509Names);
            return this;
        }
        public Builder serverX509Names(X509CertificateNameArgs... serverX509Names) {
            return serverX509Names(List.of(serverX509Names));
        }        public BackendServiceFabricClusterPropertiesArgs build() {
            return new BackendServiceFabricClusterPropertiesArgs(clientCertificateId, clientCertificatethumbprint, managementEndpoints, maxPartitionResolutionRetries, serverCertificateThumbprints, serverX509Names);
        }
    }
}
