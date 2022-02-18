// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkPeeringRoutesConfigState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringRoutesConfigState Empty = new NetworkPeeringRoutesConfigState();

    /**
     * Whether to export the custom routes to the peer network.
     * 
     */
    @InputImport(name="exportCustomRoutes")
    private final @Nullable Input<Boolean> exportCustomRoutes;

    public Input<Boolean> getExportCustomRoutes() {
        return this.exportCustomRoutes == null ? Input.empty() : this.exportCustomRoutes;
    }

    /**
     * Whether to import the custom routes to the peer network.
     * 
     */
    @InputImport(name="importCustomRoutes")
    private final @Nullable Input<Boolean> importCustomRoutes;

    public Input<Boolean> getImportCustomRoutes() {
        return this.importCustomRoutes == null ? Input.empty() : this.importCustomRoutes;
    }

    /**
     * The name of the primary network for the peering.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Name of the peering.
     * 
     */
    @InputImport(name="peering")
    private final @Nullable Input<String> peering;

    public Input<String> getPeering() {
        return this.peering == null ? Input.empty() : this.peering;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public NetworkPeeringRoutesConfigState(
        @Nullable Input<Boolean> exportCustomRoutes,
        @Nullable Input<Boolean> importCustomRoutes,
        @Nullable Input<String> network,
        @Nullable Input<String> peering,
        @Nullable Input<String> project) {
        this.exportCustomRoutes = exportCustomRoutes;
        this.importCustomRoutes = importCustomRoutes;
        this.network = network;
        this.peering = peering;
        this.project = project;
    }

    private NetworkPeeringRoutesConfigState() {
        this.exportCustomRoutes = Input.empty();
        this.importCustomRoutes = Input.empty();
        this.network = Input.empty();
        this.peering = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPeeringRoutesConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> exportCustomRoutes;
        private @Nullable Input<Boolean> importCustomRoutes;
        private @Nullable Input<String> network;
        private @Nullable Input<String> peering;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPeeringRoutesConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.network = defaults.network;
    	      this.peering = defaults.peering;
    	      this.project = defaults.project;
        }

        public Builder setExportCustomRoutes(@Nullable Input<Boolean> exportCustomRoutes) {
            this.exportCustomRoutes = exportCustomRoutes;
            return this;
        }

        public Builder setExportCustomRoutes(@Nullable Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Input.ofNullable(exportCustomRoutes);
            return this;
        }

        public Builder setImportCustomRoutes(@Nullable Input<Boolean> importCustomRoutes) {
            this.importCustomRoutes = importCustomRoutes;
            return this;
        }

        public Builder setImportCustomRoutes(@Nullable Boolean importCustomRoutes) {
            this.importCustomRoutes = Input.ofNullable(importCustomRoutes);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPeering(@Nullable Input<String> peering) {
            this.peering = peering;
            return this;
        }

        public Builder setPeering(@Nullable String peering) {
            this.peering = Input.ofNullable(peering);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public NetworkPeeringRoutesConfigState build() {
            return new NetworkPeeringRoutesConfigState(exportCustomRoutes, importCustomRoutes, network, peering, project);
        }
    }
}
