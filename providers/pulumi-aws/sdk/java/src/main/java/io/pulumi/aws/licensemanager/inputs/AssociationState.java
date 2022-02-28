// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.licensemanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationState extends io.pulumi.resources.ResourceArgs {

    public static final AssociationState Empty = new AssociationState();

    /**
     * ARN of the license configuration.
     * 
     */
    @InputImport(name="licenseConfigurationArn")
      private final @Nullable Input<String> licenseConfigurationArn;

    public Input<String> getLicenseConfigurationArn() {
        return this.licenseConfigurationArn == null ? Input.empty() : this.licenseConfigurationArn;
    }

    /**
     * ARN of the resource associated with the license configuration.
     * 
     */
    @InputImport(name="resourceArn")
      private final @Nullable Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn == null ? Input.empty() : this.resourceArn;
    }

    public AssociationState(
        @Nullable Input<String> licenseConfigurationArn,
        @Nullable Input<String> resourceArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
        this.resourceArn = resourceArn;
    }

    private AssociationState() {
        this.licenseConfigurationArn = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> licenseConfigurationArn;
        private @Nullable Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseConfigurationArn = defaults.licenseConfigurationArn;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setLicenseConfigurationArn(@Nullable Input<String> licenseConfigurationArn) {
            this.licenseConfigurationArn = licenseConfigurationArn;
            return this;
        }

        public Builder setLicenseConfigurationArn(@Nullable String licenseConfigurationArn) {
            this.licenseConfigurationArn = Input.ofNullable(licenseConfigurationArn);
            return this;
        }

        public Builder setResourceArn(@Nullable Input<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = Input.ofNullable(resourceArn);
            return this;
        }
        public AssociationState build() {
            return new AssociationState(licenseConfigurationArn, resourceArn);
        }
    }
}
