// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationDistributionAmiDistributionConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDistributionConfigurationDistribution {
    /**
     * Nested list of AMI distribution configuration.
     * 
     */
    private final List<GetDistributionConfigurationDistributionAmiDistributionConfiguration> amiDistributionConfigurations;
    /**
     * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
     * 
     */
    private final List<String> licenseConfigurationArns;
    /**
     * AWS Region of distribution.
     * 
     */
    private final String region;

    @OutputCustomType.Constructor({"amiDistributionConfigurations","licenseConfigurationArns","region"})
    private GetDistributionConfigurationDistribution(
        List<GetDistributionConfigurationDistributionAmiDistributionConfiguration> amiDistributionConfigurations,
        List<String> licenseConfigurationArns,
        String region) {
        this.amiDistributionConfigurations = Objects.requireNonNull(amiDistributionConfigurations);
        this.licenseConfigurationArns = Objects.requireNonNull(licenseConfigurationArns);
        this.region = Objects.requireNonNull(region);
    }

    /**
     * Nested list of AMI distribution configuration.
     * 
     */
    public List<GetDistributionConfigurationDistributionAmiDistributionConfiguration> getAmiDistributionConfigurations() {
        return this.amiDistributionConfigurations;
    }
    /**
     * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
     * 
     */
    public List<String> getLicenseConfigurationArns() {
        return this.licenseConfigurationArns;
    }
    /**
     * AWS Region of distribution.
     * 
     */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationDistribution defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDistributionConfigurationDistributionAmiDistributionConfiguration> amiDistributionConfigurations;
        private List<String> licenseConfigurationArns;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiDistributionConfigurations = defaults.amiDistributionConfigurations;
    	      this.licenseConfigurationArns = defaults.licenseConfigurationArns;
    	      this.region = defaults.region;
        }

        public Builder setAmiDistributionConfigurations(List<GetDistributionConfigurationDistributionAmiDistributionConfiguration> amiDistributionConfigurations) {
            this.amiDistributionConfigurations = Objects.requireNonNull(amiDistributionConfigurations);
            return this;
        }

        public Builder setLicenseConfigurationArns(List<String> licenseConfigurationArns) {
            this.licenseConfigurationArns = Objects.requireNonNull(licenseConfigurationArns);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetDistributionConfigurationDistribution build() {
            return new GetDistributionConfigurationDistribution(amiDistributionConfigurations, licenseConfigurationArns, region);
        }
    }
}
