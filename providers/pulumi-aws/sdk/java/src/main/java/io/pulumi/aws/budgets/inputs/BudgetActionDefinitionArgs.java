// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionIamActionDefinitionArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionScpActionDefinitionArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionSsmActionDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionArgs Empty = new BudgetActionDefinitionArgs();

    /**
     * The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
     */
    @InputImport(name="iamActionDefinition")
      private final @Nullable Input<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition;

    public Input<BudgetActionDefinitionIamActionDefinitionArgs> getIamActionDefinition() {
        return this.iamActionDefinition == null ? Input.empty() : this.iamActionDefinition;
    }

    /**
     * The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
     */
    @InputImport(name="scpActionDefinition")
      private final @Nullable Input<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition;

    public Input<BudgetActionDefinitionScpActionDefinitionArgs> getScpActionDefinition() {
        return this.scpActionDefinition == null ? Input.empty() : this.scpActionDefinition;
    }

    /**
     * The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
     */
    @InputImport(name="ssmActionDefinition")
      private final @Nullable Input<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition;

    public Input<BudgetActionDefinitionSsmActionDefinitionArgs> getSsmActionDefinition() {
        return this.ssmActionDefinition == null ? Input.empty() : this.ssmActionDefinition;
    }

    public BudgetActionDefinitionArgs(
        @Nullable Input<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition,
        @Nullable Input<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition,
        @Nullable Input<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
        this.scpActionDefinition = scpActionDefinition;
        this.ssmActionDefinition = ssmActionDefinition;
    }

    private BudgetActionDefinitionArgs() {
        this.iamActionDefinition = Input.empty();
        this.scpActionDefinition = Input.empty();
        this.ssmActionDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition;
        private @Nullable Input<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition;
        private @Nullable Input<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamActionDefinition = defaults.iamActionDefinition;
    	      this.scpActionDefinition = defaults.scpActionDefinition;
    	      this.ssmActionDefinition = defaults.ssmActionDefinition;
        }

        public Builder setIamActionDefinition(@Nullable Input<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition) {
            this.iamActionDefinition = iamActionDefinition;
            return this;
        }

        public Builder setIamActionDefinition(@Nullable BudgetActionDefinitionIamActionDefinitionArgs iamActionDefinition) {
            this.iamActionDefinition = Input.ofNullable(iamActionDefinition);
            return this;
        }

        public Builder setScpActionDefinition(@Nullable Input<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition) {
            this.scpActionDefinition = scpActionDefinition;
            return this;
        }

        public Builder setScpActionDefinition(@Nullable BudgetActionDefinitionScpActionDefinitionArgs scpActionDefinition) {
            this.scpActionDefinition = Input.ofNullable(scpActionDefinition);
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable Input<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition) {
            this.ssmActionDefinition = ssmActionDefinition;
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable BudgetActionDefinitionSsmActionDefinitionArgs ssmActionDefinition) {
            this.ssmActionDefinition = Input.ofNullable(ssmActionDefinition);
            return this;
        }
        public BudgetActionDefinitionArgs build() {
            return new BudgetActionDefinitionArgs(iamActionDefinition, scpActionDefinition, ssmActionDefinition);
        }
    }
}
