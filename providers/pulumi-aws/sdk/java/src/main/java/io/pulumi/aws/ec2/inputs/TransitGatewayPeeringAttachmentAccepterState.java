// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentAccepterState extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayPeeringAttachmentAccepterState Empty = new TransitGatewayPeeringAttachmentAccepterState();

    /**
     * Identifier of the AWS account that owns the EC2 TGW peering.
     * 
     */
    @InputImport(name="peerAccountId")
      private final @Nullable Input<String> peerAccountId;

    public Input<String> getPeerAccountId() {
        return this.peerAccountId == null ? Input.empty() : this.peerAccountId;
    }

    @InputImport(name="peerRegion")
      private final @Nullable Input<String> peerRegion;

    public Input<String> getPeerRegion() {
        return this.peerRegion == null ? Input.empty() : this.peerRegion;
    }

    /**
     * Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    @InputImport(name="peerTransitGatewayId")
      private final @Nullable Input<String> peerTransitGatewayId;

    public Input<String> getPeerTransitGatewayId() {
        return this.peerTransitGatewayId == null ? Input.empty() : this.peerTransitGatewayId;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    @InputImport(name="transitGatewayAttachmentId")
      private final @Nullable Input<String> transitGatewayAttachmentId;

    public Input<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId == null ? Input.empty() : this.transitGatewayAttachmentId;
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @InputImport(name="transitGatewayId")
      private final @Nullable Input<String> transitGatewayId;

    public Input<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Input.empty() : this.transitGatewayId;
    }

    public TransitGatewayPeeringAttachmentAccepterState(
        @Nullable Input<String> peerAccountId,
        @Nullable Input<String> peerRegion,
        @Nullable Input<String> peerTransitGatewayId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> transitGatewayAttachmentId,
        @Nullable Input<String> transitGatewayId) {
        this.peerAccountId = peerAccountId;
        this.peerRegion = peerRegion;
        this.peerTransitGatewayId = peerTransitGatewayId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        this.transitGatewayId = transitGatewayId;
    }

    private TransitGatewayPeeringAttachmentAccepterState() {
        this.peerAccountId = Input.empty();
        this.peerRegion = Input.empty();
        this.peerTransitGatewayId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.transitGatewayAttachmentId = Input.empty();
        this.transitGatewayId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> peerAccountId;
        private @Nullable Input<String> peerRegion;
        private @Nullable Input<String> peerTransitGatewayId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> transitGatewayAttachmentId;
        private @Nullable Input<String> transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peerAccountId = defaults.peerAccountId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerTransitGatewayId = defaults.peerTransitGatewayId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder setPeerAccountId(@Nullable Input<String> peerAccountId) {
            this.peerAccountId = peerAccountId;
            return this;
        }

        public Builder setPeerAccountId(@Nullable String peerAccountId) {
            this.peerAccountId = Input.ofNullable(peerAccountId);
            return this;
        }

        public Builder setPeerRegion(@Nullable Input<String> peerRegion) {
            this.peerRegion = peerRegion;
            return this;
        }

        public Builder setPeerRegion(@Nullable String peerRegion) {
            this.peerRegion = Input.ofNullable(peerRegion);
            return this;
        }

        public Builder setPeerTransitGatewayId(@Nullable Input<String> peerTransitGatewayId) {
            this.peerTransitGatewayId = peerTransitGatewayId;
            return this;
        }

        public Builder setPeerTransitGatewayId(@Nullable String peerTransitGatewayId) {
            this.peerTransitGatewayId = Input.ofNullable(peerTransitGatewayId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
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

        public Builder setTransitGatewayId(@Nullable Input<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder setTransitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Input.ofNullable(transitGatewayId);
            return this;
        }
        public TransitGatewayPeeringAttachmentAccepterState build() {
            return new TransitGatewayPeeringAttachmentAccepterState(peerAccountId, peerRegion, peerTransitGatewayId, tags, tagsAll, transitGatewayAttachmentId, transitGatewayId);
        }
    }
}
