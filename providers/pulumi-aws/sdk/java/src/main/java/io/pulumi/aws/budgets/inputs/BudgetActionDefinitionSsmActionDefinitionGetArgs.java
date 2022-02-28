// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BudgetActionDefinitionSsmActionDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionSsmActionDefinitionGetArgs Empty = new BudgetActionDefinitionSsmActionDefinitionGetArgs();

    /**
     * The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
     * 
     */
    @InputImport(name="actionSubType", required=true)
      private final Input<String> actionSubType;

    public Input<String> getActionSubType() {
        return this.actionSubType;
    }

    /**
     * The EC2 and RDS instance IDs.
     * 
     */
    @InputImport(name="instanceIds", required=true)
      private final Input<List<String>> instanceIds;

    public Input<List<String>> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * The Region to run the SSM document.
     * 
     */
    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    public BudgetActionDefinitionSsmActionDefinitionGetArgs(
        Input<String> actionSubType,
        Input<List<String>> instanceIds,
        Input<String> region) {
        this.actionSubType = Objects.requireNonNull(actionSubType, "expected parameter 'actionSubType' to be non-null");
        this.instanceIds = Objects.requireNonNull(instanceIds, "expected parameter 'instanceIds' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private BudgetActionDefinitionSsmActionDefinitionGetArgs() {
        this.actionSubType = Input.empty();
        this.instanceIds = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionSsmActionDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actionSubType;
        private Input<List<String>> instanceIds;
        private Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionSsmActionDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionSubType = defaults.actionSubType;
    	      this.instanceIds = defaults.instanceIds;
    	      this.region = defaults.region;
        }

        public Builder setActionSubType(Input<String> actionSubType) {
            this.actionSubType = Objects.requireNonNull(actionSubType);
            return this;
        }

        public Builder setActionSubType(String actionSubType) {
            this.actionSubType = Input.of(Objects.requireNonNull(actionSubType));
            return this;
        }

        public Builder setInstanceIds(Input<List<String>> instanceIds) {
            this.instanceIds = Objects.requireNonNull(instanceIds);
            return this;
        }

        public Builder setInstanceIds(List<String> instanceIds) {
            this.instanceIds = Input.of(Objects.requireNonNull(instanceIds));
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }
        public BudgetActionDefinitionSsmActionDefinitionGetArgs build() {
            return new BudgetActionDefinitionSsmActionDefinitionGetArgs(actionSubType, instanceIds, region);
        }
    }
}
