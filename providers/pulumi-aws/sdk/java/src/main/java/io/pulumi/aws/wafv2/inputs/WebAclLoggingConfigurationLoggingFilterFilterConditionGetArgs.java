// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs Empty = new WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs();

    /**
     * A single action condition. See Action Condition below for more details.
     * 
     */
    @InputImport(name="actionCondition")
      private final @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition;

    public Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> getActionCondition() {
        return this.actionCondition == null ? Input.empty() : this.actionCondition;
    }

    /**
     * A single label name condition. See Label Name Condition below for more details.
     * 
     */
    @InputImport(name="labelNameCondition")
      private final @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition;

    public Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> getLabelNameCondition() {
        return this.labelNameCondition == null ? Input.empty() : this.labelNameCondition;
    }

    public WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs(
        @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition,
        @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition) {
        this.actionCondition = actionCondition;
        this.labelNameCondition = labelNameCondition;
    }

    private WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs() {
        this.actionCondition = Input.empty();
        this.labelNameCondition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition;
        private @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionCondition = defaults.actionCondition;
    	      this.labelNameCondition = defaults.labelNameCondition;
        }

        public Builder setActionCondition(@Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition) {
            this.actionCondition = actionCondition;
            return this;
        }

        public Builder setActionCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs actionCondition) {
            this.actionCondition = Input.ofNullable(actionCondition);
            return this;
        }

        public Builder setLabelNameCondition(@Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition) {
            this.labelNameCondition = labelNameCondition;
            return this;
        }

        public Builder setLabelNameCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs labelNameCondition) {
            this.labelNameCondition = Input.ofNullable(labelNameCondition);
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs(actionCondition, labelNameCondition);
        }
    }
}
