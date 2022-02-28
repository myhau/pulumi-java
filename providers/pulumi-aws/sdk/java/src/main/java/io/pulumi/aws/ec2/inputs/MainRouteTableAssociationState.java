// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MainRouteTableAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final MainRouteTableAssociationState Empty = new MainRouteTableAssociationState();

    /**
     * Used internally, see __Notes__ below
     * 
     */
    @InputImport(name="originalRouteTableId")
      private final @Nullable Input<String> originalRouteTableId;

    public Input<String> getOriginalRouteTableId() {
        return this.originalRouteTableId == null ? Input.empty() : this.originalRouteTableId;
    }

    /**
     * The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    @InputImport(name="routeTableId")
      private final @Nullable Input<String> routeTableId;

    public Input<String> getRouteTableId() {
        return this.routeTableId == null ? Input.empty() : this.routeTableId;
    }

    /**
     * The ID of the VPC whose main route table should be set
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public MainRouteTableAssociationState(
        @Nullable Input<String> originalRouteTableId,
        @Nullable Input<String> routeTableId,
        @Nullable Input<String> vpcId) {
        this.originalRouteTableId = originalRouteTableId;
        this.routeTableId = routeTableId;
        this.vpcId = vpcId;
    }

    private MainRouteTableAssociationState() {
        this.originalRouteTableId = Input.empty();
        this.routeTableId = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MainRouteTableAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> originalRouteTableId;
        private @Nullable Input<String> routeTableId;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(MainRouteTableAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalRouteTableId = defaults.originalRouteTableId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setOriginalRouteTableId(@Nullable Input<String> originalRouteTableId) {
            this.originalRouteTableId = originalRouteTableId;
            return this;
        }

        public Builder setOriginalRouteTableId(@Nullable String originalRouteTableId) {
            this.originalRouteTableId = Input.ofNullable(originalRouteTableId);
            return this;
        }

        public Builder setRouteTableId(@Nullable Input<String> routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        public Builder setRouteTableId(@Nullable String routeTableId) {
            this.routeTableId = Input.ofNullable(routeTableId);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public MainRouteTableAssociationState build() {
            return new MainRouteTableAssociationState(originalRouteTableId, routeTableId, vpcId);
        }
    }
}
