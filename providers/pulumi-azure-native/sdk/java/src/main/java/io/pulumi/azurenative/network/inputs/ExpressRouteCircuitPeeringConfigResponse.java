// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the peering configuration.
 * 
 */
public final class ExpressRouteCircuitPeeringConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitPeeringConfigResponse Empty = new ExpressRouteCircuitPeeringConfigResponse();

    /**
     * The communities of bgp peering. Specified for microsoft peering.
     * 
     */
    @Import(name="advertisedCommunities")
      private final @Nullable List<String> advertisedCommunities;

    public List<String> advertisedCommunities() {
        return this.advertisedCommunities == null ? List.of() : this.advertisedCommunities;
    }

    /**
     * The reference to AdvertisedPublicPrefixes.
     * 
     */
    @Import(name="advertisedPublicPrefixes")
      private final @Nullable List<String> advertisedPublicPrefixes;

    public List<String> advertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes == null ? List.of() : this.advertisedPublicPrefixes;
    }

    /**
     * The advertised public prefix state of the Peering resource.
     * 
     */
    @Import(name="advertisedPublicPrefixesState", required=true)
      private final String advertisedPublicPrefixesState;

    public String advertisedPublicPrefixesState() {
        return this.advertisedPublicPrefixesState;
    }

    /**
     * The CustomerASN of the peering.
     * 
     */
    @Import(name="customerASN")
      private final @Nullable Integer customerASN;

    public Optional<Integer> customerASN() {
        return this.customerASN == null ? Optional.empty() : Optional.ofNullable(this.customerASN);
    }

    /**
     * The legacy mode of the peering.
     * 
     */
    @Import(name="legacyMode")
      private final @Nullable Integer legacyMode;

    public Optional<Integer> legacyMode() {
        return this.legacyMode == null ? Optional.empty() : Optional.ofNullable(this.legacyMode);
    }

    /**
     * The RoutingRegistryName of the configuration.
     * 
     */
    @Import(name="routingRegistryName")
      private final @Nullable String routingRegistryName;

    public Optional<String> routingRegistryName() {
        return this.routingRegistryName == null ? Optional.empty() : Optional.ofNullable(this.routingRegistryName);
    }

    public ExpressRouteCircuitPeeringConfigResponse(
        @Nullable List<String> advertisedCommunities,
        @Nullable List<String> advertisedPublicPrefixes,
        String advertisedPublicPrefixesState,
        @Nullable Integer customerASN,
        @Nullable Integer legacyMode,
        @Nullable String routingRegistryName) {
        this.advertisedCommunities = advertisedCommunities;
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        this.advertisedPublicPrefixesState = Objects.requireNonNull(advertisedPublicPrefixesState, "expected parameter 'advertisedPublicPrefixesState' to be non-null");
        this.customerASN = customerASN;
        this.legacyMode = legacyMode;
        this.routingRegistryName = routingRegistryName;
    }

    private ExpressRouteCircuitPeeringConfigResponse() {
        this.advertisedCommunities = List.of();
        this.advertisedPublicPrefixes = List.of();
        this.advertisedPublicPrefixesState = null;
        this.customerASN = null;
        this.legacyMode = null;
        this.routingRegistryName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> advertisedCommunities;
        private @Nullable List<String> advertisedPublicPrefixes;
        private String advertisedPublicPrefixesState;
        private @Nullable Integer customerASN;
        private @Nullable Integer legacyMode;
        private @Nullable String routingRegistryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedCommunities = defaults.advertisedCommunities;
    	      this.advertisedPublicPrefixes = defaults.advertisedPublicPrefixes;
    	      this.advertisedPublicPrefixesState = defaults.advertisedPublicPrefixesState;
    	      this.customerASN = defaults.customerASN;
    	      this.legacyMode = defaults.legacyMode;
    	      this.routingRegistryName = defaults.routingRegistryName;
        }

        public Builder advertisedCommunities(@Nullable List<String> advertisedCommunities) {
            this.advertisedCommunities = advertisedCommunities;
            return this;
        }
        public Builder advertisedCommunities(String... advertisedCommunities) {
            return advertisedCommunities(List.of(advertisedCommunities));
        }
        public Builder advertisedPublicPrefixes(@Nullable List<String> advertisedPublicPrefixes) {
            this.advertisedPublicPrefixes = advertisedPublicPrefixes;
            return this;
        }
        public Builder advertisedPublicPrefixes(String... advertisedPublicPrefixes) {
            return advertisedPublicPrefixes(List.of(advertisedPublicPrefixes));
        }
        public Builder advertisedPublicPrefixesState(String advertisedPublicPrefixesState) {
            this.advertisedPublicPrefixesState = Objects.requireNonNull(advertisedPublicPrefixesState);
            return this;
        }
        public Builder customerASN(@Nullable Integer customerASN) {
            this.customerASN = customerASN;
            return this;
        }
        public Builder legacyMode(@Nullable Integer legacyMode) {
            this.legacyMode = legacyMode;
            return this;
        }
        public Builder routingRegistryName(@Nullable String routingRegistryName) {
            this.routingRegistryName = routingRegistryName;
            return this;
        }        public ExpressRouteCircuitPeeringConfigResponse build() {
            return new ExpressRouteCircuitPeeringConfigResponse(advertisedCommunities, advertisedPublicPrefixes, advertisedPublicPrefixesState, customerASN, legacyMode, routingRegistryName);
        }
    }
}
