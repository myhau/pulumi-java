// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetDomainAdvancedSecurityOption {
    /**
     * Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * Whether the internal user database is enabled.
     * 
     */
    private final Boolean internalUserDatabaseEnabled;

    @OutputCustomType.Constructor({"enabled","internalUserDatabaseEnabled"})
    private GetDomainAdvancedSecurityOption(
        Boolean enabled,
        Boolean internalUserDatabaseEnabled) {
        this.enabled = Objects.requireNonNull(enabled);
        this.internalUserDatabaseEnabled = Objects.requireNonNull(internalUserDatabaseEnabled);
    }

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Whether the internal user database is enabled.
     * 
     */
    public Boolean getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainAdvancedSecurityOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Boolean internalUserDatabaseEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainAdvancedSecurityOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.internalUserDatabaseEnabled = defaults.internalUserDatabaseEnabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = Objects.requireNonNull(internalUserDatabaseEnabled);
            return this;
        }
        public GetDomainAdvancedSecurityOption build() {
            return new GetDomainAdvancedSecurityOption(enabled, internalUserDatabaseEnabled);
        }
    }
}
