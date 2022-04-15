// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.ExpressRoutePeeringState;
import io.pulumi.azurenative.network.enums.ExpressRoutePeeringType;
import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigArgs;
import io.pulumi.azurenative.network.inputs.Ipv6ExpressRouteCircuitPeeringConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteCrossConnectionPeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCrossConnectionPeeringArgs Empty = new ExpressRouteCrossConnectionPeeringArgs();

    /**
     * The name of the ExpressRouteCrossConnection.
     * 
     */
    @Import(name="crossConnectionName", required=true)
      private final Output<String> crossConnectionName;

    public Output<String> crossConnectionName() {
        return this.crossConnectionName;
    }

    /**
     * The GatewayManager Etag.
     * 
     */
    @Import(name="gatewayManagerEtag")
      private final @Nullable Output<String> gatewayManagerEtag;

    public Output<String> gatewayManagerEtag() {
        return this.gatewayManagerEtag == null ? Codegen.empty() : this.gatewayManagerEtag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The IPv6 peering configuration.
     * 
     */
    @Import(name="ipv6PeeringConfig")
      private final @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;

    public Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig() {
        return this.ipv6PeeringConfig == null ? Codegen.empty() : this.ipv6PeeringConfig;
    }

    /**
     * The Microsoft peering configuration.
     * 
     */
    @Import(name="microsoftPeeringConfig")
      private final @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;

    public Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig() {
        return this.microsoftPeeringConfig == null ? Codegen.empty() : this.microsoftPeeringConfig;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The peer ASN.
     * 
     */
    @Import(name="peerASN")
      private final @Nullable Output<Double> peerASN;

    public Output<Double> peerASN() {
        return this.peerASN == null ? Codegen.empty() : this.peerASN;
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName")
      private final @Nullable Output<String> peeringName;

    public Output<String> peeringName() {
        return this.peeringName == null ? Codegen.empty() : this.peeringName;
    }

    /**
     * The peering type.
     * 
     */
    @Import(name="peeringType")
      private final @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType;

    public Output<Either<String,ExpressRoutePeeringType>> peeringType() {
        return this.peeringType == null ? Codegen.empty() : this.peeringType;
    }

    /**
     * The primary address prefix.
     * 
     */
    @Import(name="primaryPeerAddressPrefix")
      private final @Nullable Output<String> primaryPeerAddressPrefix;

    public Output<String> primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix == null ? Codegen.empty() : this.primaryPeerAddressPrefix;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The secondary address prefix.
     * 
     */
    @Import(name="secondaryPeerAddressPrefix")
      private final @Nullable Output<String> secondaryPeerAddressPrefix;

    public Output<String> secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix == null ? Codegen.empty() : this.secondaryPeerAddressPrefix;
    }

    /**
     * The shared key.
     * 
     */
    @Import(name="sharedKey")
      private final @Nullable Output<String> sharedKey;

    public Output<String> sharedKey() {
        return this.sharedKey == null ? Codegen.empty() : this.sharedKey;
    }

    /**
     * The peering state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,ExpressRoutePeeringState>> state;

    public Output<Either<String,ExpressRoutePeeringState>> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlanId")
      private final @Nullable Output<Integer> vlanId;

    public Output<Integer> vlanId() {
        return this.vlanId == null ? Codegen.empty() : this.vlanId;
    }

    public ExpressRouteCrossConnectionPeeringArgs(
        Output<String> crossConnectionName,
        @Nullable Output<String> gatewayManagerEtag,
        @Nullable Output<String> id,
        @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig,
        @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig,
        @Nullable Output<String> name,
        @Nullable Output<Double> peerASN,
        @Nullable Output<String> peeringName,
        @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType,
        @Nullable Output<String> primaryPeerAddressPrefix,
        Output<String> resourceGroupName,
        @Nullable Output<String> secondaryPeerAddressPrefix,
        @Nullable Output<String> sharedKey,
        @Nullable Output<Either<String,ExpressRoutePeeringState>> state,
        @Nullable Output<Integer> vlanId) {
        this.crossConnectionName = Objects.requireNonNull(crossConnectionName, "expected parameter 'crossConnectionName' to be non-null");
        this.gatewayManagerEtag = gatewayManagerEtag;
        this.id = id;
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.name = name;
        this.peerASN = peerASN;
        this.peeringName = peeringName;
        this.peeringType = peeringType;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.sharedKey = sharedKey;
        this.state = state;
        this.vlanId = vlanId;
    }

    private ExpressRouteCrossConnectionPeeringArgs() {
        this.crossConnectionName = Codegen.empty();
        this.gatewayManagerEtag = Codegen.empty();
        this.id = Codegen.empty();
        this.ipv6PeeringConfig = Codegen.empty();
        this.microsoftPeeringConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.peerASN = Codegen.empty();
        this.peeringName = Codegen.empty();
        this.peeringType = Codegen.empty();
        this.primaryPeerAddressPrefix = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.secondaryPeerAddressPrefix = Codegen.empty();
        this.sharedKey = Codegen.empty();
        this.state = Codegen.empty();
        this.vlanId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCrossConnectionPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> crossConnectionName;
        private @Nullable Output<String> gatewayManagerEtag;
        private @Nullable Output<String> id;
        private @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;
        private @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<Double> peerASN;
        private @Nullable Output<String> peeringName;
        private @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType;
        private @Nullable Output<String> primaryPeerAddressPrefix;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> secondaryPeerAddressPrefix;
        private @Nullable Output<String> sharedKey;
        private @Nullable Output<Either<String,ExpressRoutePeeringState>> state;
        private @Nullable Output<Integer> vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCrossConnectionPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossConnectionName = defaults.crossConnectionName;
    	      this.gatewayManagerEtag = defaults.gatewayManagerEtag;
    	      this.id = defaults.id;
    	      this.ipv6PeeringConfig = defaults.ipv6PeeringConfig;
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.name = defaults.name;
    	      this.peerASN = defaults.peerASN;
    	      this.peeringName = defaults.peeringName;
    	      this.peeringType = defaults.peeringType;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.sharedKey = defaults.sharedKey;
    	      this.state = defaults.state;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder crossConnectionName(Output<String> crossConnectionName) {
            this.crossConnectionName = Objects.requireNonNull(crossConnectionName);
            return this;
        }
        public Builder crossConnectionName(String crossConnectionName) {
            this.crossConnectionName = Output.of(Objects.requireNonNull(crossConnectionName));
            return this;
        }
        public Builder gatewayManagerEtag(@Nullable Output<String> gatewayManagerEtag) {
            this.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }
        public Builder gatewayManagerEtag(@Nullable String gatewayManagerEtag) {
            this.gatewayManagerEtag = Codegen.ofNullable(gatewayManagerEtag);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipv6PeeringConfig(@Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig) {
            this.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }
        public Builder ipv6PeeringConfig(@Nullable Ipv6ExpressRouteCircuitPeeringConfigArgs ipv6PeeringConfig) {
            this.ipv6PeeringConfig = Codegen.ofNullable(ipv6PeeringConfig);
            return this;
        }
        public Builder microsoftPeeringConfig(@Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }
        public Builder microsoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigArgs microsoftPeeringConfig) {
            this.microsoftPeeringConfig = Codegen.ofNullable(microsoftPeeringConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder peerASN(@Nullable Output<Double> peerASN) {
            this.peerASN = peerASN;
            return this;
        }
        public Builder peerASN(@Nullable Double peerASN) {
            this.peerASN = Codegen.ofNullable(peerASN);
            return this;
        }
        public Builder peeringName(@Nullable Output<String> peeringName) {
            this.peeringName = peeringName;
            return this;
        }
        public Builder peeringName(@Nullable String peeringName) {
            this.peeringName = Codegen.ofNullable(peeringName);
            return this;
        }
        public Builder peeringType(@Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType) {
            this.peeringType = peeringType;
            return this;
        }
        public Builder peeringType(@Nullable Either<String,ExpressRoutePeeringType> peeringType) {
            this.peeringType = Codegen.ofNullable(peeringType);
            return this;
        }
        public Builder primaryPeerAddressPrefix(@Nullable Output<String> primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }
        public Builder primaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = Codegen.ofNullable(primaryPeerAddressPrefix);
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
        public Builder secondaryPeerAddressPrefix(@Nullable Output<String> secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }
        public Builder secondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = Codegen.ofNullable(secondaryPeerAddressPrefix);
            return this;
        }
        public Builder sharedKey(@Nullable Output<String> sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = Codegen.ofNullable(sharedKey);
            return this;
        }
        public Builder state(@Nullable Output<Either<String,ExpressRoutePeeringState>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,ExpressRoutePeeringState> state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Builder vlanId(@Nullable Integer vlanId) {
            this.vlanId = Codegen.ofNullable(vlanId);
            return this;
        }        public ExpressRouteCrossConnectionPeeringArgs build() {
            return new ExpressRouteCrossConnectionPeeringArgs(crossConnectionName, gatewayManagerEtag, id, ipv6PeeringConfig, microsoftPeeringConfig, name, peerASN, peeringName, peeringType, primaryPeerAddressPrefix, resourceGroupName, secondaryPeerAddressPrefix, sharedKey, state, vlanId);
        }
    }
}
