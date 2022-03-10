// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardStickinessGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardTargetGroupGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardGetArgs Empty = new ListenerRuleActionForwardGetArgs();

    /**
     * The target group stickiness for the rule.
     * 
     */
    @InputImport(name="stickiness")
      private final @Nullable Input<ListenerRuleActionForwardStickinessGetArgs> stickiness;

    public Input<ListenerRuleActionForwardStickinessGetArgs> getStickiness() {
        return this.stickiness == null ? Input.empty() : this.stickiness;
    }

    /**
     * One or more target groups block.
     * 
     */
    @InputImport(name="targetGroups", required=true)
      private final Input<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups;

    public Input<List<ListenerRuleActionForwardTargetGroupGetArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    public ListenerRuleActionForwardGetArgs(
        @Nullable Input<ListenerRuleActionForwardStickinessGetArgs> stickiness,
        Input<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private ListenerRuleActionForwardGetArgs() {
        this.stickiness = Input.empty();
        this.targetGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ListenerRuleActionForwardStickinessGetArgs> stickiness;
        private Input<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setStickiness(@Nullable Input<ListenerRuleActionForwardStickinessGetArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }

        public Builder setStickiness(@Nullable ListenerRuleActionForwardStickinessGetArgs stickiness) {
            this.stickiness = Input.ofNullable(stickiness);
            return this;
        }

        public Builder setTargetGroups(Input<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public Builder setTargetGroups(List<ListenerRuleActionForwardTargetGroupGetArgs> targetGroups) {
            this.targetGroups = Input.of(Objects.requireNonNull(targetGroups));
            return this;
        }
        public ListenerRuleActionForwardGetArgs build() {
            return new ListenerRuleActionForwardGetArgs(stickiness, targetGroups);
        }
    }
}