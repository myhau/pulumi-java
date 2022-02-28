// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnConnectionRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnConnectionRouteGetArgs Empty = new VpnConnectionRouteGetArgs();

    /**
     * The CIDR block associated with the local subnet of the customer data center.
     * 
     */
    @InputImport(name="destinationCidrBlock")
      private final @Nullable Input<String> destinationCidrBlock;

    public Input<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock == null ? Input.empty() : this.destinationCidrBlock;
    }

    /**
     * Indicates how the routes were provided.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The current state of the static route.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public VpnConnectionRouteGetArgs(
        @Nullable Input<String> destinationCidrBlock,
        @Nullable Input<String> source,
        @Nullable Input<String> state) {
        this.destinationCidrBlock = destinationCidrBlock;
        this.source = source;
        this.state = state;
    }

    private VpnConnectionRouteGetArgs() {
        this.destinationCidrBlock = Input.empty();
        this.source = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destinationCidrBlock;
        private @Nullable Input<String> source;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.source = defaults.source;
    	      this.state = defaults.state;
        }

        public Builder setDestinationCidrBlock(@Nullable Input<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        public Builder setDestinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = Input.ofNullable(destinationCidrBlock);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public VpnConnectionRouteGetArgs build() {
            return new VpnConnectionRouteGetArgs(destinationCidrBlock, source, state);
        }
    }
}
