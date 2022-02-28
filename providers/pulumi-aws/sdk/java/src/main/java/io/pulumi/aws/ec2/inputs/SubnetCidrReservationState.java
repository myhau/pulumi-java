// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetCidrReservationState extends io.pulumi.resources.ResourceArgs {

    public static final SubnetCidrReservationState Empty = new SubnetCidrReservationState();

    /**
     * The CIDR block for the reservation.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * A brief description of the reservation.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * ID of the AWS account that owns this CIDR reservation.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * The type of reservation to create. Valid values: `explicit`, `prefix`
     * 
     */
    @InputImport(name="reservationType")
      private final @Nullable Input<String> reservationType;

    public Input<String> getReservationType() {
        return this.reservationType == null ? Input.empty() : this.reservationType;
    }

    /**
     * The ID of the subnet to create the reservation for.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public SubnetCidrReservationState(
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> description,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> reservationType,
        @Nullable Input<String> subnetId) {
        this.cidrBlock = cidrBlock;
        this.description = description;
        this.ownerId = ownerId;
        this.reservationType = reservationType;
        this.subnetId = subnetId;
    }

    private SubnetCidrReservationState() {
        this.cidrBlock = Input.empty();
        this.description = Input.empty();
        this.ownerId = Input.empty();
        this.reservationType = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetCidrReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> description;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> reservationType;
        private @Nullable Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetCidrReservationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.description = defaults.description;
    	      this.ownerId = defaults.ownerId;
    	      this.reservationType = defaults.reservationType;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setReservationType(@Nullable Input<String> reservationType) {
            this.reservationType = reservationType;
            return this;
        }

        public Builder setReservationType(@Nullable String reservationType) {
            this.reservationType = Input.ofNullable(reservationType);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }
        public SubnetCidrReservationState build() {
            return new SubnetCidrReservationState(cidrBlock, description, ownerId, reservationType, subnetId);
        }
    }
}
