// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationPolicyBooleanPolicy {
    private final Boolean enforced;

    @OutputCustomType.Constructor({"enforced"})
    private GetOrganizationPolicyBooleanPolicy(Boolean enforced) {
        this.enforced = enforced;
    }

    public Boolean getEnforced() {
        return this.enforced;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyBooleanPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyBooleanPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder setEnforced(Boolean enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }
        public GetOrganizationPolicyBooleanPolicy build() {
            return new GetOrganizationPolicyBooleanPolicy(enforced);
        }
    }
}
