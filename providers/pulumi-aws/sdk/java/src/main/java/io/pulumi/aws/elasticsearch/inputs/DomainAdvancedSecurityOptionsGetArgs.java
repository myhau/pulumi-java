// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainAdvancedSecurityOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainAdvancedSecurityOptionsGetArgs Empty = new DomainAdvancedSecurityOptionsGetArgs();

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
     * 
     */
    @InputImport(name="internalUserDatabaseEnabled")
      private final @Nullable Input<Boolean> internalUserDatabaseEnabled;

    public Input<Boolean> getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled == null ? Input.empty() : this.internalUserDatabaseEnabled;
    }

    /**
     * Configuration block for the main user. Detailed below.
     * 
     */
    @InputImport(name="masterUserOptions")
      private final @Nullable Input<DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs> masterUserOptions;

    public Input<DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs> getMasterUserOptions() {
        return this.masterUserOptions == null ? Input.empty() : this.masterUserOptions;
    }

    public DomainAdvancedSecurityOptionsGetArgs(
        Input<Boolean> enabled,
        @Nullable Input<Boolean> internalUserDatabaseEnabled,
        @Nullable Input<DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs> masterUserOptions) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
        this.masterUserOptions = masterUserOptions;
    }

    private DomainAdvancedSecurityOptionsGetArgs() {
        this.enabled = Input.empty();
        this.internalUserDatabaseEnabled = Input.empty();
        this.masterUserOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAdvancedSecurityOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;
        private @Nullable Input<Boolean> internalUserDatabaseEnabled;
        private @Nullable Input<DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs> masterUserOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAdvancedSecurityOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.internalUserDatabaseEnabled = defaults.internalUserDatabaseEnabled;
    	      this.masterUserOptions = defaults.masterUserOptions;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setInternalUserDatabaseEnabled(@Nullable Input<Boolean> internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
            return this;
        }

        public Builder setInternalUserDatabaseEnabled(@Nullable Boolean internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = Input.ofNullable(internalUserDatabaseEnabled);
            return this;
        }

        public Builder setMasterUserOptions(@Nullable Input<DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs> masterUserOptions) {
            this.masterUserOptions = masterUserOptions;
            return this;
        }

        public Builder setMasterUserOptions(@Nullable DomainAdvancedSecurityOptionsMasterUserOptionsGetArgs masterUserOptions) {
            this.masterUserOptions = Input.ofNullable(masterUserOptions);
            return this;
        }
        public DomainAdvancedSecurityOptionsGetArgs build() {
            return new DomainAdvancedSecurityOptionsGetArgs(enabled, internalUserDatabaseEnabled, masterUserOptions);
        }
    }
}
