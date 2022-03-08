// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationPolicyListPolicyDeny {
    private final Boolean all;
    private final List<String> values;

    @OutputCustomType.Constructor({"all","values"})
    private GetOrganizationPolicyListPolicyDeny(
        Boolean all,
        List<String> values) {
        this.all = all;
        this.values = values;
    }

    public Boolean getAll() {
        return this.all;
    }
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicyDeny defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean all;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyListPolicyDeny defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder setAll(Boolean all) {
            this.all = Objects.requireNonNull(all);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetOrganizationPolicyListPolicyDeny build() {
            return new GetOrganizationPolicyListPolicyDeny(all, values);
        }
    }
}
