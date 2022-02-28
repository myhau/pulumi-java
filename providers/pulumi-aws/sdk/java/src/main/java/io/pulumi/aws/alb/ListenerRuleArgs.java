// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.alb.inputs.ListenerRuleActionArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleArgs Empty = new ListenerRuleArgs();

    /**
     * An Action block. Action blocks are documented below.
     * 
     */
    @InputImport(name="actions", required=true)
      private final Input<List<ListenerRuleActionArgs>> actions;

    public Input<List<ListenerRuleActionArgs>> getActions() {
        return this.actions;
    }

    /**
     * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    @InputImport(name="conditions", required=true)
      private final Input<List<ListenerRuleConditionArgs>> conditions;

    public Input<List<ListenerRuleConditionArgs>> getConditions() {
        return this.conditions;
    }

    /**
     * The ARN of the listener to which to attach the rule.
     * 
     */
    @InputImport(name="listenerArn", required=true)
      private final Input<String> listenerArn;

    public Input<String> getListenerArn() {
        return this.listenerArn;
    }

    /**
     * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ListenerRuleArgs(
        Input<List<ListenerRuleActionArgs>> actions,
        Input<List<ListenerRuleConditionArgs>> conditions,
        Input<String> listenerArn,
        @Nullable Input<Integer> priority,
        @Nullable Input<Map<String,String>> tags) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.listenerArn = Objects.requireNonNull(listenerArn, "expected parameter 'listenerArn' to be non-null");
        this.priority = priority;
        this.tags = tags;
    }

    private ListenerRuleArgs() {
        this.actions = Input.empty();
        this.conditions = Input.empty();
        this.listenerArn = Input.empty();
        this.priority = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ListenerRuleActionArgs>> actions;
        private Input<List<ListenerRuleConditionArgs>> conditions;
        private Input<String> listenerArn;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.listenerArn = defaults.listenerArn;
    	      this.priority = defaults.priority;
    	      this.tags = defaults.tags;
        }

        public Builder setActions(Input<List<ListenerRuleActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<ListenerRuleActionArgs> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setConditions(Input<List<ListenerRuleConditionArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setConditions(List<ListenerRuleConditionArgs> conditions) {
            this.conditions = Input.of(Objects.requireNonNull(conditions));
            return this;
        }

        public Builder setListenerArn(Input<String> listenerArn) {
            this.listenerArn = Objects.requireNonNull(listenerArn);
            return this;
        }

        public Builder setListenerArn(String listenerArn) {
            this.listenerArn = Input.of(Objects.requireNonNull(listenerArn));
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ListenerRuleArgs build() {
            return new ListenerRuleArgs(actions, conditions, listenerArn, priority, tags);
        }
    }
}
