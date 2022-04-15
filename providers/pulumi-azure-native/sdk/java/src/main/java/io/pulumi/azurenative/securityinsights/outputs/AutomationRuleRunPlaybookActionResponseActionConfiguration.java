// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleRunPlaybookActionResponseActionConfiguration {
    /**
     * The resource id of the playbook resource
     * 
     */
    private final @Nullable String logicAppResourceId;
    /**
     * The tenant id of the playbook resource
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private AutomationRuleRunPlaybookActionResponseActionConfiguration(
        @CustomType.Parameter("logicAppResourceId") @Nullable String logicAppResourceId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.logicAppResourceId = logicAppResourceId;
        this.tenantId = tenantId;
    }

    /**
     * The resource id of the playbook resource
     * 
    */
    public Optional<String> logicAppResourceId() {
        return Optional.ofNullable(this.logicAppResourceId);
    }
    /**
     * The tenant id of the playbook resource
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleRunPlaybookActionResponseActionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logicAppResourceId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleRunPlaybookActionResponseActionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logicAppResourceId = defaults.logicAppResourceId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder logicAppResourceId(@Nullable String logicAppResourceId) {
            this.logicAppResourceId = logicAppResourceId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public AutomationRuleRunPlaybookActionResponseActionConfiguration build() {
            return new AutomationRuleRunPlaybookActionResponseActionConfiguration(logicAppResourceId, tenantId);
        }
    }
}
