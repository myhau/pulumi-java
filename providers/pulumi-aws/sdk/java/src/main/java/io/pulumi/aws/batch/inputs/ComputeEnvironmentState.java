// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentState Empty = new ComputeEnvironmentState();

    /**
     * The Amazon Resource Name (ARN) of the compute environment.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="computeEnvironmentName")
      private final @Nullable Input<String> computeEnvironmentName;

    public Input<String> getComputeEnvironmentName() {
        return this.computeEnvironmentName == null ? Input.empty() : this.computeEnvironmentName;
    }

    /**
     * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `compute_environment_name`.
     * 
     */
    @InputImport(name="computeEnvironmentNamePrefix")
      private final @Nullable Input<String> computeEnvironmentNamePrefix;

    public Input<String> getComputeEnvironmentNamePrefix() {
        return this.computeEnvironmentNamePrefix == null ? Input.empty() : this.computeEnvironmentNamePrefix;
    }

    /**
     * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * 
     */
    @InputImport(name="computeResources")
      private final @Nullable Input<ComputeEnvironmentComputeResourcesGetArgs> computeResources;

    public Input<ComputeEnvironmentComputeResourcesGetArgs> getComputeResources() {
        return this.computeResources == null ? Input.empty() : this.computeResources;
    }

    /**
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * 
     */
    @InputImport(name="ecsClusterArn")
      private final @Nullable Input<String> ecsClusterArn;

    public Input<String> getEcsClusterArn() {
        return this.ecsClusterArn == null ? Input.empty() : this.ecsClusterArn;
    }

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
     * 
     */
    @InputImport(name="serviceRole")
      private final @Nullable Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole == null ? Input.empty() : this.serviceRole;
    }

    /**
     * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The current status of the compute environment (for example, CREATING or VALID).
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     * 
     */
    @InputImport(name="statusReason")
      private final @Nullable Input<String> statusReason;

    public Input<String> getStatusReason() {
        return this.statusReason == null ? Input.empty() : this.statusReason;
    }

    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ComputeEnvironmentState(
        @Nullable Input<String> arn,
        @Nullable Input<String> computeEnvironmentName,
        @Nullable Input<String> computeEnvironmentNamePrefix,
        @Nullable Input<ComputeEnvironmentComputeResourcesGetArgs> computeResources,
        @Nullable Input<String> ecsClusterArn,
        @Nullable Input<String> serviceRole,
        @Nullable Input<String> state,
        @Nullable Input<String> status,
        @Nullable Input<String> statusReason,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type) {
        this.arn = arn;
        this.computeEnvironmentName = computeEnvironmentName;
        this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
        this.computeResources = computeResources;
        this.ecsClusterArn = ecsClusterArn;
        this.serviceRole = serviceRole;
        this.state = state;
        this.status = status;
        this.statusReason = statusReason;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private ComputeEnvironmentState() {
        this.arn = Input.empty();
        this.computeEnvironmentName = Input.empty();
        this.computeEnvironmentNamePrefix = Input.empty();
        this.computeResources = Input.empty();
        this.ecsClusterArn = Input.empty();
        this.serviceRole = Input.empty();
        this.state = Input.empty();
        this.status = Input.empty();
        this.statusReason = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> computeEnvironmentName;
        private @Nullable Input<String> computeEnvironmentNamePrefix;
        private @Nullable Input<ComputeEnvironmentComputeResourcesGetArgs> computeResources;
        private @Nullable Input<String> ecsClusterArn;
        private @Nullable Input<String> serviceRole;
        private @Nullable Input<String> state;
        private @Nullable Input<String> status;
        private @Nullable Input<String> statusReason;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.computeEnvironmentName = defaults.computeEnvironmentName;
    	      this.computeEnvironmentNamePrefix = defaults.computeEnvironmentNamePrefix;
    	      this.computeResources = defaults.computeResources;
    	      this.ecsClusterArn = defaults.ecsClusterArn;
    	      this.serviceRole = defaults.serviceRole;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setComputeEnvironmentName(@Nullable Input<String> computeEnvironmentName) {
            this.computeEnvironmentName = computeEnvironmentName;
            return this;
        }

        public Builder setComputeEnvironmentName(@Nullable String computeEnvironmentName) {
            this.computeEnvironmentName = Input.ofNullable(computeEnvironmentName);
            return this;
        }

        public Builder setComputeEnvironmentNamePrefix(@Nullable Input<String> computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
            return this;
        }

        public Builder setComputeEnvironmentNamePrefix(@Nullable String computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = Input.ofNullable(computeEnvironmentNamePrefix);
            return this;
        }

        public Builder setComputeResources(@Nullable Input<ComputeEnvironmentComputeResourcesGetArgs> computeResources) {
            this.computeResources = computeResources;
            return this;
        }

        public Builder setComputeResources(@Nullable ComputeEnvironmentComputeResourcesGetArgs computeResources) {
            this.computeResources = Input.ofNullable(computeResources);
            return this;
        }

        public Builder setEcsClusterArn(@Nullable Input<String> ecsClusterArn) {
            this.ecsClusterArn = ecsClusterArn;
            return this;
        }

        public Builder setEcsClusterArn(@Nullable String ecsClusterArn) {
            this.ecsClusterArn = Input.ofNullable(ecsClusterArn);
            return this;
        }

        public Builder setServiceRole(@Nullable Input<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder setServiceRole(@Nullable String serviceRole) {
            this.serviceRole = Input.ofNullable(serviceRole);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setStatusReason(@Nullable Input<String> statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        public Builder setStatusReason(@Nullable String statusReason) {
            this.statusReason = Input.ofNullable(statusReason);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ComputeEnvironmentState build() {
            return new ComputeEnvironmentState(arn, computeEnvironmentName, computeEnvironmentNamePrefix, computeResources, ecsClusterArn, serviceRole, state, status, statusReason, tags, tagsAll, type);
        }
    }
}
