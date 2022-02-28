// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrefixListReferenceState extends io.pulumi.resources.ResourceArgs {

    public static final PrefixListReferenceState Empty = new PrefixListReferenceState();

    /**
     * Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
     * 
     */
    @InputImport(name="blackhole")
      private final @Nullable Input<Boolean> blackhole;

    public Input<Boolean> getBlackhole() {
        return this.blackhole == null ? Input.empty() : this.blackhole;
    }

    /**
     * Identifier of EC2 Prefix List.
     * 
     */
    @InputImport(name="prefixListId")
      private final @Nullable Input<String> prefixListId;

    public Input<String> getPrefixListId() {
        return this.prefixListId == null ? Input.empty() : this.prefixListId;
    }

    @InputImport(name="prefixListOwnerId")
      private final @Nullable Input<String> prefixListOwnerId;

    public Input<String> getPrefixListOwnerId() {
        return this.prefixListOwnerId == null ? Input.empty() : this.prefixListOwnerId;
    }

    /**
     * Identifier of EC2 Transit Gateway Attachment.
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
    @InputImport(name="transitGatewayRouteTableId")
      private final @Nullable Input<String> transitGatewayRouteTableId;

    public Input<String> getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId == null ? Input.empty() : this.transitGatewayRouteTableId;
    }

    public PrefixListReferenceState(
        @Nullable Input<Boolean> blackhole,
        @Nullable Input<String> prefixListId,
        @Nullable Input<String> prefixListOwnerId,
        @Nullable Input<String> transitGatewayAttachmentId,
        @Nullable Input<String> transitGatewayRouteTableId) {
        this.blackhole = blackhole;
        this.prefixListId = prefixListId;
        this.prefixListOwnerId = prefixListOwnerId;
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    private PrefixListReferenceState() {
        this.blackhole = Input.empty();
        this.prefixListId = Input.empty();
        this.prefixListOwnerId = Input.empty();
        this.transitGatewayAttachmentId = Input.empty();
        this.transitGatewayRouteTableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixListReferenceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> blackhole;
        private @Nullable Input<String> prefixListId;
        private @Nullable Input<String> prefixListOwnerId;
        private @Nullable Input<String> transitGatewayAttachmentId;
        private @Nullable Input<String> transitGatewayRouteTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixListReferenceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackhole = defaults.blackhole;
    	      this.prefixListId = defaults.prefixListId;
    	      this.prefixListOwnerId = defaults.prefixListOwnerId;
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

        public Builder setPrefixListId(@Nullable Input<String> prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        public Builder setPrefixListId(@Nullable String prefixListId) {
            this.prefixListId = Input.ofNullable(prefixListId);
            return this;
        }

        public Builder setPrefixListOwnerId(@Nullable Input<String> prefixListOwnerId) {
            this.prefixListOwnerId = prefixListOwnerId;
            return this;
        }

        public Builder setPrefixListOwnerId(@Nullable String prefixListOwnerId) {
            this.prefixListOwnerId = Input.ofNullable(prefixListOwnerId);
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

        public Builder setTransitGatewayRouteTableId(@Nullable Input<String> transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = transitGatewayRouteTableId;
            return this;
        }

        public Builder setTransitGatewayRouteTableId(@Nullable String transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = Input.ofNullable(transitGatewayRouteTableId);
            return this;
        }
        public PrefixListReferenceState build() {
            return new PrefixListReferenceState(blackhole, prefixListId, prefixListOwnerId, transitGatewayAttachmentId, transitGatewayRouteTableId);
        }
    }
}
