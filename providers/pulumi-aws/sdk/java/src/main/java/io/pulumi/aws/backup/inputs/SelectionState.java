// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.aws.backup.inputs.SelectionConditionGetArgs;
import io.pulumi.aws.backup.inputs.SelectionSelectionTagGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SelectionState extends io.pulumi.resources.ResourceArgs {

    public static final SelectionState Empty = new SelectionState();

    /**
     * A list of conditions that you define to assign resources to your backup plans using tags.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<SelectionConditionGetArgs>> conditions;

    public Input<List<SelectionConditionGetArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    @InputImport(name="iamRoleArn")
      private final @Nullable Input<String> iamRoleArn;

    public Input<String> getIamRoleArn() {
        return this.iamRoleArn == null ? Input.empty() : this.iamRoleArn;
    }

    /**
     * The display name of a resource selection document.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to exclude from a backup plan.
     * 
     */
    @InputImport(name="notResources")
      private final @Nullable Input<List<String>> notResources;

    public Input<List<String>> getNotResources() {
        return this.notResources == null ? Input.empty() : this.notResources;
    }

    /**
     * The backup plan ID to be associated with the selection of resources.
     * 
     */
    @InputImport(name="planId")
      private final @Nullable Input<String> planId;

    public Input<String> getPlanId() {
        return this.planId == null ? Input.empty() : this.planId;
    }

    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * Tag-based conditions used to specify a set of resources to assign to a backup plan.
     * 
     */
    @InputImport(name="selectionTags")
      private final @Nullable Input<List<SelectionSelectionTagGetArgs>> selectionTags;

    public Input<List<SelectionSelectionTagGetArgs>> getSelectionTags() {
        return this.selectionTags == null ? Input.empty() : this.selectionTags;
    }

    public SelectionState(
        @Nullable Input<List<SelectionConditionGetArgs>> conditions,
        @Nullable Input<String> iamRoleArn,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> notResources,
        @Nullable Input<String> planId,
        @Nullable Input<List<String>> resources,
        @Nullable Input<List<SelectionSelectionTagGetArgs>> selectionTags) {
        this.conditions = conditions;
        this.iamRoleArn = iamRoleArn;
        this.name = name;
        this.notResources = notResources;
        this.planId = planId;
        this.resources = resources;
        this.selectionTags = selectionTags;
    }

    private SelectionState() {
        this.conditions = Input.empty();
        this.iamRoleArn = Input.empty();
        this.name = Input.empty();
        this.notResources = Input.empty();
        this.planId = Input.empty();
        this.resources = Input.empty();
        this.selectionTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SelectionConditionGetArgs>> conditions;
        private @Nullable Input<String> iamRoleArn;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> notResources;
        private @Nullable Input<String> planId;
        private @Nullable Input<List<String>> resources;
        private @Nullable Input<List<SelectionSelectionTagGetArgs>> selectionTags;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.name = defaults.name;
    	      this.notResources = defaults.notResources;
    	      this.planId = defaults.planId;
    	      this.resources = defaults.resources;
    	      this.selectionTags = defaults.selectionTags;
        }

        public Builder setConditions(@Nullable Input<List<SelectionConditionGetArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<SelectionConditionGetArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setIamRoleArn(@Nullable Input<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }

        public Builder setIamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Input.ofNullable(iamRoleArn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotResources(@Nullable Input<List<String>> notResources) {
            this.notResources = notResources;
            return this;
        }

        public Builder setNotResources(@Nullable List<String> notResources) {
            this.notResources = Input.ofNullable(notResources);
            return this;
        }

        public Builder setPlanId(@Nullable Input<String> planId) {
            this.planId = planId;
            return this;
        }

        public Builder setPlanId(@Nullable String planId) {
            this.planId = Input.ofNullable(planId);
            return this;
        }

        public Builder setResources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder setSelectionTags(@Nullable Input<List<SelectionSelectionTagGetArgs>> selectionTags) {
            this.selectionTags = selectionTags;
            return this;
        }

        public Builder setSelectionTags(@Nullable List<SelectionSelectionTagGetArgs> selectionTags) {
            this.selectionTags = Input.ofNullable(selectionTags);
            return this;
        }
        public SelectionState build() {
            return new SelectionState(conditions, iamRoleArn, name, notResources, planId, resources, selectionTags);
        }
    }
}
