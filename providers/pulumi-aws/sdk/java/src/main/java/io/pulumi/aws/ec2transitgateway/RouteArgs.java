// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    @InputImport(name="blackhole")
      private final @Nullable Input<Boolean> blackhole;

    public Input<Boolean> getBlackhole() {
        return this.blackhole == null ? Input.empty() : this.blackhole;
    }

    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @InputImport(name="destinationCidrBlock", required=true)
      private final Input<String> destinationCidrBlock;

    public Input<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    @InputImport(name="transitGatewayAttachmentId")
      private final @Nullable Input<String> transitGatewayAttachmentId;

    public Input<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId == null ? Input.empty() : this.transitGatewayAttachmentId;
    }

    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @InputImport(name="transitGatewayRouteTableId", required=true)
      private final Input<String> transitGatewayRouteTableId;

    public Input<String> getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    public RouteArgs(
        @Nullable Input<Boolean> blackhole,
        Input<String> destinationCidrBlock,
        @Nullable Input<String> transitGatewayAttachmentId,
        Input<String> transitGatewayRouteTableId) {
        this.blackhole = blackhole;
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        this.transitGatewayRouteTableId = Objects.requireNonNull(transitGatewayRouteTableId, "expected parameter 'transitGatewayRouteTableId' to be non-null");
    }

    private RouteArgs() {
        this.blackhole = Input.empty();
        this.destinationCidrBlock = Input.empty();
        this.transitGatewayAttachmentId = Input.empty();
        this.transitGatewayRouteTableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> blackhole;
        private Input<String> destinationCidrBlock;
        private @Nullable Input<String> transitGatewayAttachmentId;
        private Input<String> transitGatewayRouteTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackhole = defaults.blackhole;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayRouteTableId = defaults.transitGatewayRouteTableId;
        }

        public Builder setBlackhole(@Nullable Input<Boolean> blackhole) {
            this.blackhole = blackhole;
            return this;
        }

        public Builder setBlackhole(@Nullable Boolean blackhole) {
            this.blackhole = Input.ofNullable(blackhole);
            return this;
        }

        public Builder setDestinationCidrBlock(Input<String> destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }

        public Builder setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Input.of(Objects.requireNonNull(destinationCidrBlock));
            return this;
        }

        public Builder setTransitGatewayAttachmentId(@Nullable Input<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        public Builder setTransitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Input.ofNullable(transitGatewayAttachmentId);
            return this;
        }

        public Builder setTransitGatewayRouteTableId(Input<String> transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = Objects.requireNonNull(transitGatewayRouteTableId);
            return this;
        }

        public Builder setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = Input.of(Objects.requireNonNull(transitGatewayRouteTableId));
            return this;
        }
        public RouteArgs build() {
            return new RouteArgs(blackhole, destinationCidrBlock, transitGatewayAttachmentId, transitGatewayRouteTableId);
        }
    }
}
