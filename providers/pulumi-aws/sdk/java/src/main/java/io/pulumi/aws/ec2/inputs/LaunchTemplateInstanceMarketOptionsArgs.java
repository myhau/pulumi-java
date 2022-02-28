// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsSpotOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateInstanceMarketOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateInstanceMarketOptionsArgs Empty = new LaunchTemplateInstanceMarketOptionsArgs();

    /**
     * The market type. Can be `spot`.
     * 
     */
    @InputImport(name="marketType")
      private final @Nullable Input<String> marketType;

    public Input<String> getMarketType() {
        return this.marketType == null ? Input.empty() : this.marketType;
    }

    /**
     * The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
     * 
     */
    @InputImport(name="spotOptions")
      private final @Nullable Input<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> spotOptions;

    public Input<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> getSpotOptions() {
        return this.spotOptions == null ? Input.empty() : this.spotOptions;
    }

    public LaunchTemplateInstanceMarketOptionsArgs(
        @Nullable Input<String> marketType,
        @Nullable Input<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> spotOptions) {
        this.marketType = marketType;
        this.spotOptions = spotOptions;
    }

    private LaunchTemplateInstanceMarketOptionsArgs() {
        this.marketType = Input.empty();
        this.spotOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateInstanceMarketOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> marketType;
        private @Nullable Input<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> spotOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateInstanceMarketOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketType = defaults.marketType;
    	      this.spotOptions = defaults.spotOptions;
        }

        public Builder setMarketType(@Nullable Input<String> marketType) {
            this.marketType = marketType;
            return this;
        }

        public Builder setMarketType(@Nullable String marketType) {
            this.marketType = Input.ofNullable(marketType);
            return this;
        }

        public Builder setSpotOptions(@Nullable Input<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> spotOptions) {
            this.spotOptions = spotOptions;
            return this;
        }

        public Builder setSpotOptions(@Nullable LaunchTemplateInstanceMarketOptionsSpotOptionsArgs spotOptions) {
            this.spotOptions = Input.ofNullable(spotOptions);
            return this;
        }
        public LaunchTemplateInstanceMarketOptionsArgs build() {
            return new LaunchTemplateInstanceMarketOptionsArgs(marketType, spotOptions);
        }
    }
}
