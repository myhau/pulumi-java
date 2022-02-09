// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.PropagatedRouteTableResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.azurenative.network.inputs.VnetRouteResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoutingConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoutingConfigurationResponse Empty = new RoutingConfigurationResponse();

    @InputImport(name="associatedRouteTable")
    private final @Nullable SubResourceResponse associatedRouteTable;

    public Optional<SubResourceResponse> getAssociatedRouteTable() {
        return this.associatedRouteTable == null ? Optional.empty() : Optional.ofNullable(this.associatedRouteTable);
    }

    @InputImport(name="propagatedRouteTables")
    private final @Nullable PropagatedRouteTableResponse propagatedRouteTables;

    public Optional<PropagatedRouteTableResponse> getPropagatedRouteTables() {
        return this.propagatedRouteTables == null ? Optional.empty() : Optional.ofNullable(this.propagatedRouteTables);
    }

    @InputImport(name="vnetRoutes")
    private final @Nullable VnetRouteResponse vnetRoutes;

    public Optional<VnetRouteResponse> getVnetRoutes() {
        return this.vnetRoutes == null ? Optional.empty() : Optional.ofNullable(this.vnetRoutes);
    }

    public RoutingConfigurationResponse(
        @Nullable SubResourceResponse associatedRouteTable,
        @Nullable PropagatedRouteTableResponse propagatedRouteTables,
        @Nullable VnetRouteResponse vnetRoutes) {
        this.associatedRouteTable = associatedRouteTable;
        this.propagatedRouteTables = propagatedRouteTables;
        this.vnetRoutes = vnetRoutes;
    }

    private RoutingConfigurationResponse() {
        this.associatedRouteTable = null;
        this.propagatedRouteTables = null;
        this.vnetRoutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse associatedRouteTable;
        private @Nullable PropagatedRouteTableResponse propagatedRouteTables;
        private @Nullable VnetRouteResponse vnetRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedRouteTable = defaults.associatedRouteTable;
    	      this.propagatedRouteTables = defaults.propagatedRouteTables;
    	      this.vnetRoutes = defaults.vnetRoutes;
        }

        public Builder setAssociatedRouteTable(@Nullable SubResourceResponse associatedRouteTable) {
            this.associatedRouteTable = associatedRouteTable;
            return this;
        }

        public Builder setPropagatedRouteTables(@Nullable PropagatedRouteTableResponse propagatedRouteTables) {
            this.propagatedRouteTables = propagatedRouteTables;
            return this;
        }

        public Builder setVnetRoutes(@Nullable VnetRouteResponse vnetRoutes) {
            this.vnetRoutes = vnetRoutes;
            return this;
        }

        public RoutingConfigurationResponse build() {
            return new RoutingConfigurationResponse(associatedRouteTable, propagatedRouteTables, vnetRoutes);
        }
    }
}