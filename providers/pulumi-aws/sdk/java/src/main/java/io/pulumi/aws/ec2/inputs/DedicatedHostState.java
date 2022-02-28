// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedHostState extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedHostState Empty = new DedicatedHostState();

    /**
     * The ARN of the Dedicated Host.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    @InputImport(name="autoPlacement")
      private final @Nullable Input<String> autoPlacement;

    public Input<String> getAutoPlacement() {
        return this.autoPlacement == null ? Input.empty() : this.autoPlacement;
    }

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    @InputImport(name="hostRecovery")
      private final @Nullable Input<String> hostRecovery;

    public Input<String> getHostRecovery() {
        return this.hostRecovery == null ? Input.empty() : this.hostRecovery;
    }

    /**
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @InputImport(name="instanceFamily")
      private final @Nullable Input<String> instanceFamily;

    public Input<String> getInstanceFamily() {
        return this.instanceFamily == null ? Input.empty() : this.instanceFamily;
    }

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public DedicatedHostState(
        @Nullable Input<String> arn,
        @Nullable Input<String> autoPlacement,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> hostRecovery,
        @Nullable Input<String> instanceFamily,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> ownerId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.autoPlacement = autoPlacement;
        this.availabilityZone = availabilityZone;
        this.hostRecovery = hostRecovery;
        this.instanceFamily = instanceFamily;
        this.instanceType = instanceType;
        this.ownerId = ownerId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DedicatedHostState() {
        this.arn = Input.empty();
        this.autoPlacement = Input.empty();
        this.availabilityZone = Input.empty();
        this.hostRecovery = Input.empty();
        this.instanceFamily = Input.empty();
        this.instanceType = Input.empty();
        this.ownerId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> autoPlacement;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> hostRecovery;
        private @Nullable Input<String> instanceFamily;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoPlacement = defaults.autoPlacement;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.hostRecovery = defaults.hostRecovery;
    	      this.instanceFamily = defaults.instanceFamily;
    	      this.instanceType = defaults.instanceType;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoPlacement(@Nullable Input<String> autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }

        public Builder setAutoPlacement(@Nullable String autoPlacement) {
            this.autoPlacement = Input.ofNullable(autoPlacement);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setHostRecovery(@Nullable Input<String> hostRecovery) {
            this.hostRecovery = hostRecovery;
            return this;
        }

        public Builder setHostRecovery(@Nullable String hostRecovery) {
            this.hostRecovery = Input.ofNullable(hostRecovery);
            return this;
        }

        public Builder setInstanceFamily(@Nullable Input<String> instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }

        public Builder setInstanceFamily(@Nullable String instanceFamily) {
            this.instanceFamily = Input.ofNullable(instanceFamily);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
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
        public DedicatedHostState build() {
            return new DedicatedHostState(arn, autoPlacement, availabilityZone, hostRecovery, instanceFamily, instanceType, ownerId, tags, tagsAll);
        }
    }
}
