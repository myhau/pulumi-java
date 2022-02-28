// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuickConnectArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectArgs Empty = new QuickConnectArgs();

    /**
     * Specifies the description of the Quick Connect.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
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
     * Specifies the name of the Quick Connect.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    @InputImport(name="quickConnectConfig", required=true)
      private final Input<QuickConnectQuickConnectConfigArgs> quickConnectConfig;

    public Input<QuickConnectQuickConnectConfigArgs> getQuickConnectConfig() {
        return this.quickConnectConfig;
    }

    /**
     * Tags to apply to the Quick Connect. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
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

    public QuickConnectArgs(
        @Nullable Input<String> description,
        Input<String> instanceId,
        @Nullable Input<String> name,
        Input<QuickConnectQuickConnectConfigArgs> quickConnectConfig,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.description = description;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.quickConnectConfig = Objects.requireNonNull(quickConnectConfig, "expected parameter 'quickConnectConfig' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private QuickConnectArgs() {
        this.description = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
        this.quickConnectConfig = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> instanceId;
        private @Nullable Input<String> name;
        private Input<QuickConnectQuickConnectConfigArgs> quickConnectConfig;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.quickConnectConfig = defaults.quickConnectConfig;
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

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
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

        public Builder setQuickConnectConfig(Input<QuickConnectQuickConnectConfigArgs> quickConnectConfig) {
            this.quickConnectConfig = Objects.requireNonNull(quickConnectConfig);
            return this;
        }

        public Builder setQuickConnectConfig(QuickConnectQuickConnectConfigArgs quickConnectConfig) {
            this.quickConnectConfig = Input.of(Objects.requireNonNull(quickConnectConfig));
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
        public QuickConnectArgs build() {
            return new QuickConnectArgs(description, instanceId, name, quickConnectConfig, tags, tagsAll);
        }
    }
}
