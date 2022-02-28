// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * Specifies the description of the Queue.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies the identifier of the Hours of Operation.
     * 
     */
    @InputImport(name="hoursOfOperationId", required=true)
      private final Input<String> hoursOfOperationId;

    public Input<String> getHoursOfOperationId() {
        return this.hoursOfOperationId;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    @InputImport(name="maxContacts")
      private final @Nullable Input<Integer> maxContacts;

    public Input<Integer> getMaxContacts() {
        return this.maxContacts == null ? Input.empty() : this.maxContacts;
    }

    /**
     * Specifies the name of the Queue.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    @InputImport(name="outboundCallerConfig")
      private final @Nullable Input<QueueOutboundCallerConfigArgs> outboundCallerConfig;

    public Input<QueueOutboundCallerConfigArgs> getOutboundCallerConfig() {
        return this.outboundCallerConfig == null ? Input.empty() : this.outboundCallerConfig;
    }

    /**
     * Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    @InputImport(name="quickConnectIds")
      private final @Nullable Input<List<String>> quickConnectIds;

    public Input<List<String>> getQuickConnectIds() {
        return this.quickConnectIds == null ? Input.empty() : this.quickConnectIds;
    }

    /**
     * Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public QueueArgs(
        @Nullable Input<String> description,
        Input<String> hoursOfOperationId,
        Input<String> instanceId,
        @Nullable Input<Integer> maxContacts,
        @Nullable Input<String> name,
        @Nullable Input<QueueOutboundCallerConfigArgs> outboundCallerConfig,
        @Nullable Input<List<String>> quickConnectIds,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.description = description;
        this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId, "expected parameter 'hoursOfOperationId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.maxContacts = maxContacts;
        this.name = name;
        this.outboundCallerConfig = outboundCallerConfig;
        this.quickConnectIds = quickConnectIds;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private QueueArgs() {
        this.description = Input.empty();
        this.hoursOfOperationId = Input.empty();
        this.instanceId = Input.empty();
        this.maxContacts = Input.empty();
        this.name = Input.empty();
        this.outboundCallerConfig = Input.empty();
        this.quickConnectIds = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> hoursOfOperationId;
        private Input<String> instanceId;
        private @Nullable Input<Integer> maxContacts;
        private @Nullable Input<String> name;
        private @Nullable Input<QueueOutboundCallerConfigArgs> outboundCallerConfig;
        private @Nullable Input<List<String>> quickConnectIds;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.instanceId = defaults.instanceId;
    	      this.maxContacts = defaults.maxContacts;
    	      this.name = defaults.name;
    	      this.outboundCallerConfig = defaults.outboundCallerConfig;
    	      this.quickConnectIds = defaults.quickConnectIds;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHoursOfOperationId(Input<String> hoursOfOperationId) {
            this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId);
            return this;
        }

        public Builder setHoursOfOperationId(String hoursOfOperationId) {
            this.hoursOfOperationId = Input.of(Objects.requireNonNull(hoursOfOperationId));
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setMaxContacts(@Nullable Input<Integer> maxContacts) {
            this.maxContacts = maxContacts;
            return this;
        }

        public Builder setMaxContacts(@Nullable Integer maxContacts) {
            this.maxContacts = Input.ofNullable(maxContacts);
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

        public Builder setOutboundCallerConfig(@Nullable Input<QueueOutboundCallerConfigArgs> outboundCallerConfig) {
            this.outboundCallerConfig = outboundCallerConfig;
            return this;
        }

        public Builder setOutboundCallerConfig(@Nullable QueueOutboundCallerConfigArgs outboundCallerConfig) {
            this.outboundCallerConfig = Input.ofNullable(outboundCallerConfig);
            return this;
        }

        public Builder setQuickConnectIds(@Nullable Input<List<String>> quickConnectIds) {
            this.quickConnectIds = quickConnectIds;
            return this;
        }

        public Builder setQuickConnectIds(@Nullable List<String> quickConnectIds) {
            this.quickConnectIds = Input.ofNullable(quickConnectIds);
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
        public QueueArgs build() {
            return new QueueArgs(description, hoursOfOperationId, instanceId, maxContacts, name, outboundCallerConfig, quickConnectIds, status, tags, tagsAll);
        }
    }
}
