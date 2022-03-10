// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationDistribution;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDistributionConfigurationResult {
    private final String arn;
    /**
     * Date the distribution configuration was created.
     * 
     */
    private final String dateCreated;
    /**
     * Date the distribution configuration was updated.
     * 
     */
    private final String dateUpdated;
    /**
     * Description to apply to distributed AMI.
     * 
     */
    private final String description;
    /**
     * Set of distributions.
     * 
     */
    private final List<GetDistributionConfigurationDistribution> distributions;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Name of the distribution configuration.
     * 
     */
    private final String name;
    /**
     * Key-value map of resource tags for the distribution configuration.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","dateCreated","dateUpdated","description","distributions","id","name","tags"})
    private GetDistributionConfigurationResult(
        String arn,
        String dateCreated,
        String dateUpdated,
        String description,
        List<GetDistributionConfigurationDistribution> distributions,
        String id,
        String name,
        Map<String,String> tags) {
        this.arn = arn;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.distributions = distributions;
        this.id = id;
        this.name = name;
        this.tags = tags;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * Date the distribution configuration was created.
     * 
    */
    public String getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Date the distribution configuration was updated.
     * 
    */
    public String getDateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Description to apply to distributed AMI.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Set of distributions.
     * 
    */
    public List<GetDistributionConfigurationDistribution> getDistributions() {
        return this.distributions;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the distribution configuration.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Key-value map of resource tags for the distribution configuration.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String dateCreated;
        private String dateUpdated;
        private String description;
        private List<GetDistributionConfigurationDistribution> distributions;
        private String id;
        private String name;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.dateUpdated = defaults.dateUpdated;
    	      this.description = defaults.description;
    	      this.distributions = defaults.distributions;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }

        public Builder setDateUpdated(String dateUpdated) {
            this.dateUpdated = Objects.requireNonNull(dateUpdated);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDistributions(List<GetDistributionConfigurationDistribution> distributions) {
            this.distributions = Objects.requireNonNull(distributions);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetDistributionConfigurationResult build() {
            return new GetDistributionConfigurationResult(arn, dateCreated, dateUpdated, description, distributions, id, name, tags);
        }
    }
}