// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchTemplateHibernationOption {
    private final Boolean configured;

    @OutputCustomType.Constructor({"configured"})
    private GetLaunchTemplateHibernationOption(Boolean configured) {
        this.configured = Objects.requireNonNull(configured);
    }

    public Boolean getConfigured() {
        return this.configured;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateHibernationOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean configured;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateHibernationOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configured = defaults.configured;
        }

        public Builder setConfigured(Boolean configured) {
            this.configured = Objects.requireNonNull(configured);
            return this;
        }
        public GetLaunchTemplateHibernationOption build() {
            return new GetLaunchTemplateHibernationOption(configured);
        }
    }
}
