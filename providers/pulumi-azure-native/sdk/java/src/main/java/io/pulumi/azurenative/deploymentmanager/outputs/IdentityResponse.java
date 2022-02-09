// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class IdentityResponse {
    private final List<String> identityIds;
    private final String type;

    @OutputCustomType.Constructor({"identityIds","type"})
    private IdentityResponse(
        List<String> identityIds,
        String type) {
        this.identityIds = Objects.requireNonNull(identityIds);
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getIdentityIds() {
        return this.identityIds;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> identityIds;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.type = defaults.type;
        }

        public Builder setIdentityIds(List<String> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public IdentityResponse build() {
            return new IdentityResponse(identityIds, type);
        }
    }
}