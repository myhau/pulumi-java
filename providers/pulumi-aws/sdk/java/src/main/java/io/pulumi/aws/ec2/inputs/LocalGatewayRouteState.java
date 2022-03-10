// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalGatewayRouteState extends io.pulumi.resources.ResourceArgs {

    public static final LocalGatewayRouteState Empty = new LocalGatewayRouteState();

    /**
     * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @InputImport(name="destinationCidrBlock")
      private final @Nullable Input<String> destinationCidrBlock;

    public Input<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock == null ? Input.empty() : this.destinationCidrBlock;
    }

    /**
     * Identifier of EC2 Local Gateway Route Table.
     * 
     */
    @InputImport(name="localGatewayRouteTableId")
      private final @Nullable Input<String> localGatewayRouteTableId;

    public Input<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId == null ? Input.empty() : this.localGatewayRouteTableId;
    }

    /**
     * Identifier of EC2 Local Gateway Virtual Interface Group.
     * 
     */
    @InputImport(name="localGatewayVirtualInterfaceGroupId")
      private final @Nullable Input<String> localGatewayVirtualInterfaceGroupId;

    public Input<String> getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId == null ? Input.empty() : this.localGatewayVirtualInterfaceGroupId;
    }

    public LocalGatewayRouteState(
        @Nullable Input<String> destinationCidrBlock,
        @Nullable Input<String> localGatewayRouteTableId,
        @Nullable Input<String> localGatewayVirtualInterfaceGroupId) {
        this.destinationCidrBlock = destinationCidrBlock;
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    private LocalGatewayRouteState() {
        this.destinationCidrBlock = Input.empty();
        this.localGatewayRouteTableId = Input.empty();
        this.localGatewayVirtualInterfaceGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalGatewayRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destinationCidrBlock;
        private @Nullable Input<String> localGatewayRouteTableId;
        private @Nullable Input<String> localGatewayVirtualInterfaceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalGatewayRouteState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.localGatewayVirtualInterfaceGroupId = defaults.localGatewayVirtualInterfaceGroupId;
        }

        public Builder setDestinationCidrBlock(@Nullable Input<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        public Builder setDestinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = Input.ofNullable(destinationCidrBlock);
            return this;
        }

        public Builder setLocalGatewayRouteTableId(@Nullable Input<String> localGatewayRouteTableId) {
            this.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        public Builder setLocalGatewayRouteTableId(@Nullable String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Input.ofNullable(localGatewayRouteTableId);
            return this;
        }

        public Builder setLocalGatewayVirtualInterfaceGroupId(@Nullable Input<String> localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
            return this;
        }

        public Builder setLocalGatewayVirtualInterfaceGroupId(@Nullable String localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = Input.ofNullable(localGatewayVirtualInterfaceGroupId);
            return this;
        }
        public LocalGatewayRouteState build() {
            return new LocalGatewayRouteState(destinationCidrBlock, localGatewayRouteTableId, localGatewayVirtualInterfaceGroupId);
        }
    }
}