// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloud9;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentEC2Args extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentEC2Args Empty = new EnvironmentEC2Args();

    /**
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * 
     */
    @InputImport(name="automaticStopTimeMinutes")
      private final @Nullable Input<Integer> automaticStopTimeMinutes;

    public Input<Integer> getAutomaticStopTimeMinutes() {
        return this.automaticStopTimeMinutes == null ? Input.empty() : this.automaticStopTimeMinutes;
    }

    /**
     * The description of the environment.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The type of instance to connect to the environment, e.g., `t2.micro`.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * The name of the environment.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
     * 
     */
    @InputImport(name="ownerArn")
      private final @Nullable Input<String> ownerArn;

    public Input<String> getOwnerArn() {
        return this.ownerArn == null ? Input.empty() : this.ownerArn;
    }

    /**
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EnvironmentEC2Args(
        @Nullable Input<Integer> automaticStopTimeMinutes,
        @Nullable Input<String> description,
        Input<String> instanceType,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerArn,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags) {
        this.automaticStopTimeMinutes = automaticStopTimeMinutes;
        this.description = description;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.name = name;
        this.ownerArn = ownerArn;
        this.subnetId = subnetId;
        this.tags = tags;
    }

    private EnvironmentEC2Args() {
        this.automaticStopTimeMinutes = Input.empty();
        this.description = Input.empty();
        this.instanceType = Input.empty();
        this.name = Input.empty();
        this.ownerArn = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentEC2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> automaticStopTimeMinutes;
        private @Nullable Input<String> description;
        private Input<String> instanceType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerArn;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentEC2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticStopTimeMinutes = defaults.automaticStopTimeMinutes;
    	      this.description = defaults.description;
    	      this.instanceType = defaults.instanceType;
    	      this.name = defaults.name;
    	      this.ownerArn = defaults.ownerArn;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        public Builder setAutomaticStopTimeMinutes(@Nullable Input<Integer> automaticStopTimeMinutes) {
            this.automaticStopTimeMinutes = automaticStopTimeMinutes;
            return this;
        }

        public Builder setAutomaticStopTimeMinutes(@Nullable Integer automaticStopTimeMinutes) {
            this.automaticStopTimeMinutes = Input.ofNullable(automaticStopTimeMinutes);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
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

        public Builder setOwnerArn(@Nullable Input<String> ownerArn) {
            this.ownerArn = ownerArn;
            return this;
        }

        public Builder setOwnerArn(@Nullable String ownerArn) {
            this.ownerArn = Input.ofNullable(ownerArn);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
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
        public EnvironmentEC2Args build() {
            return new EnvironmentEC2Args(automaticStopTimeMinutes, description, instanceType, name, ownerArn, subnetId, tags);
        }
    }
}
