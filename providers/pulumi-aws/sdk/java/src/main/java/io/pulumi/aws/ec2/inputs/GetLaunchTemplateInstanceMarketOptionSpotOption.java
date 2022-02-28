// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchTemplateInstanceMarketOptionSpotOption extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateInstanceMarketOptionSpotOption Empty = new GetLaunchTemplateInstanceMarketOptionSpotOption();

    @InputImport(name="blockDurationMinutes", required=true)
      private final Integer blockDurationMinutes;

    public Integer getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    @InputImport(name="instanceInterruptionBehavior", required=true)
      private final String instanceInterruptionBehavior;

    public String getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior;
    }

    @InputImport(name="maxPrice", required=true)
      private final String maxPrice;

    public String getMaxPrice() {
        return this.maxPrice;
    }

    @InputImport(name="spotInstanceType", required=true)
      private final String spotInstanceType;

    public String getSpotInstanceType() {
        return this.spotInstanceType;
    }

    @InputImport(name="validUntil", required=true)
      private final String validUntil;

    public String getValidUntil() {
        return this.validUntil;
    }

    public GetLaunchTemplateInstanceMarketOptionSpotOption(
        Integer blockDurationMinutes,
        String instanceInterruptionBehavior,
        String maxPrice,
        String spotInstanceType,
        String validUntil) {
        this.blockDurationMinutes = Objects.requireNonNull(blockDurationMinutes, "expected parameter 'blockDurationMinutes' to be non-null");
        this.instanceInterruptionBehavior = Objects.requireNonNull(instanceInterruptionBehavior, "expected parameter 'instanceInterruptionBehavior' to be non-null");
        this.maxPrice = Objects.requireNonNull(maxPrice, "expected parameter 'maxPrice' to be non-null");
        this.spotInstanceType = Objects.requireNonNull(spotInstanceType, "expected parameter 'spotInstanceType' to be non-null");
        this.validUntil = Objects.requireNonNull(validUntil, "expected parameter 'validUntil' to be non-null");
    }

    private GetLaunchTemplateInstanceMarketOptionSpotOption() {
        this.blockDurationMinutes = null;
        this.instanceInterruptionBehavior = null;
        this.maxPrice = null;
        this.spotInstanceType = null;
        this.validUntil = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateInstanceMarketOptionSpotOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer blockDurationMinutes;
        private String instanceInterruptionBehavior;
        private String maxPrice;
        private String spotInstanceType;
        private String validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateInstanceMarketOptionSpotOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.maxPrice = defaults.maxPrice;
    	      this.spotInstanceType = defaults.spotInstanceType;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder setBlockDurationMinutes(Integer blockDurationMinutes) {
            this.blockDurationMinutes = Objects.requireNonNull(blockDurationMinutes);
            return this;
        }

        public Builder setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Objects.requireNonNull(instanceInterruptionBehavior);
            return this;
        }

        public Builder setMaxPrice(String maxPrice) {
            this.maxPrice = Objects.requireNonNull(maxPrice);
            return this;
        }

        public Builder setSpotInstanceType(String spotInstanceType) {
            this.spotInstanceType = Objects.requireNonNull(spotInstanceType);
            return this;
        }

        public Builder setValidUntil(String validUntil) {
            this.validUntil = Objects.requireNonNull(validUntil);
            return this;
        }
        public GetLaunchTemplateInstanceMarketOptionSpotOption build() {
            return new GetLaunchTemplateInstanceMarketOptionSpotOption(blockDurationMinutes, instanceInterruptionBehavior, maxPrice, spotInstanceType, validUntil);
        }
    }
}
