// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ApplicationApplicationConfigurationEnvironmentProperties {
    /**
     * Describes the execution property groups.
     * 
     */
    private final List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup> propertyGroups;

    @OutputCustomType.Constructor({"propertyGroups"})
    private ApplicationApplicationConfigurationEnvironmentProperties(List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup> propertyGroups) {
        this.propertyGroups = Objects.requireNonNull(propertyGroups);
    }

    /**
     * Describes the execution property groups.
     * 
     */
    public List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup> getPropertyGroups() {
        return this.propertyGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationEnvironmentProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup> propertyGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationEnvironmentProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyGroups = defaults.propertyGroups;
        }

        public Builder setPropertyGroups(List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroup> propertyGroups) {
            this.propertyGroups = Objects.requireNonNull(propertyGroups);
            return this;
        }
        public ApplicationApplicationConfigurationEnvironmentProperties build() {
            return new ApplicationApplicationConfigurationEnvironmentProperties(propertyGroups);
        }
    }
}
