// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkProfileState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileState Empty = new NetworkProfileState();

    /**
     * The Amazon Resource Name of this network profile.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of the network profile.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @InputImport(name="downlinkBandwidthBits")
      private final @Nullable Input<Integer> downlinkBandwidthBits;

    public Input<Integer> getDownlinkBandwidthBits() {
        return this.downlinkBandwidthBits == null ? Input.empty() : this.downlinkBandwidthBits;
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @InputImport(name="downlinkDelayMs")
      private final @Nullable Input<Integer> downlinkDelayMs;

    public Input<Integer> getDownlinkDelayMs() {
        return this.downlinkDelayMs == null ? Input.empty() : this.downlinkDelayMs;
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @InputImport(name="downlinkJitterMs")
      private final @Nullable Input<Integer> downlinkJitterMs;

    public Input<Integer> getDownlinkJitterMs() {
        return this.downlinkJitterMs == null ? Input.empty() : this.downlinkJitterMs;
    }

    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @InputImport(name="downlinkLossPercent")
      private final @Nullable Input<Integer> downlinkLossPercent;

    public Input<Integer> getDownlinkLossPercent() {
        return this.downlinkLossPercent == null ? Input.empty() : this.downlinkLossPercent;
    }

    /**
     * The name for the network profile.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of the project for the network profile.
     * 
     */
    @InputImport(name="projectArn")
      private final @Nullable Input<String> projectArn;

    public Input<String> getProjectArn() {
        return this.projectArn == null ? Input.empty() : this.projectArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @InputImport(name="uplinkBandwidthBits")
      private final @Nullable Input<Integer> uplinkBandwidthBits;

    public Input<Integer> getUplinkBandwidthBits() {
        return this.uplinkBandwidthBits == null ? Input.empty() : this.uplinkBandwidthBits;
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @InputImport(name="uplinkDelayMs")
      private final @Nullable Input<Integer> uplinkDelayMs;

    public Input<Integer> getUplinkDelayMs() {
        return this.uplinkDelayMs == null ? Input.empty() : this.uplinkDelayMs;
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @InputImport(name="uplinkJitterMs")
      private final @Nullable Input<Integer> uplinkJitterMs;

    public Input<Integer> getUplinkJitterMs() {
        return this.uplinkJitterMs == null ? Input.empty() : this.uplinkJitterMs;
    }

    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @InputImport(name="uplinkLossPercent")
      private final @Nullable Input<Integer> uplinkLossPercent;

    public Input<Integer> getUplinkLossPercent() {
        return this.uplinkLossPercent == null ? Input.empty() : this.uplinkLossPercent;
    }

    public NetworkProfileState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<Integer> downlinkBandwidthBits,
        @Nullable Input<Integer> downlinkDelayMs,
        @Nullable Input<Integer> downlinkJitterMs,
        @Nullable Input<Integer> downlinkLossPercent,
        @Nullable Input<String> name,
        @Nullable Input<String> projectArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type,
        @Nullable Input<Integer> uplinkBandwidthBits,
        @Nullable Input<Integer> uplinkDelayMs,
        @Nullable Input<Integer> uplinkJitterMs,
        @Nullable Input<Integer> uplinkLossPercent) {
        this.arn = arn;
        this.description = description;
        this.downlinkBandwidthBits = downlinkBandwidthBits;
        this.downlinkDelayMs = downlinkDelayMs;
        this.downlinkJitterMs = downlinkJitterMs;
        this.downlinkLossPercent = downlinkLossPercent;
        this.name = name;
        this.projectArn = projectArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
        this.uplinkBandwidthBits = uplinkBandwidthBits;
        this.uplinkDelayMs = uplinkDelayMs;
        this.uplinkJitterMs = uplinkJitterMs;
        this.uplinkLossPercent = uplinkLossPercent;
    }

    private NetworkProfileState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.downlinkBandwidthBits = Input.empty();
        this.downlinkDelayMs = Input.empty();
        this.downlinkJitterMs = Input.empty();
        this.downlinkLossPercent = Input.empty();
        this.name = Input.empty();
        this.projectArn = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
        this.uplinkBandwidthBits = Input.empty();
        this.uplinkDelayMs = Input.empty();
        this.uplinkJitterMs = Input.empty();
        this.uplinkLossPercent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> downlinkBandwidthBits;
        private @Nullable Input<Integer> downlinkDelayMs;
        private @Nullable Input<Integer> downlinkJitterMs;
        private @Nullable Input<Integer> downlinkLossPercent;
        private @Nullable Input<String> name;
        private @Nullable Input<String> projectArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;
        private @Nullable Input<Integer> uplinkBandwidthBits;
        private @Nullable Input<Integer> uplinkDelayMs;
        private @Nullable Input<Integer> uplinkJitterMs;
        private @Nullable Input<Integer> uplinkLossPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.downlinkBandwidthBits = defaults.downlinkBandwidthBits;
    	      this.downlinkDelayMs = defaults.downlinkDelayMs;
    	      this.downlinkJitterMs = defaults.downlinkJitterMs;
    	      this.downlinkLossPercent = defaults.downlinkLossPercent;
    	      this.name = defaults.name;
    	      this.projectArn = defaults.projectArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
    	      this.uplinkBandwidthBits = defaults.uplinkBandwidthBits;
    	      this.uplinkDelayMs = defaults.uplinkDelayMs;
    	      this.uplinkJitterMs = defaults.uplinkJitterMs;
    	      this.uplinkLossPercent = defaults.uplinkLossPercent;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder setDownlinkBandwidthBits(@Nullable Input<Integer> downlinkBandwidthBits) {
            this.downlinkBandwidthBits = downlinkBandwidthBits;
            return this;
        }

        public Builder setDownlinkBandwidthBits(@Nullable Integer downlinkBandwidthBits) {
            this.downlinkBandwidthBits = Input.ofNullable(downlinkBandwidthBits);
            return this;
        }

        public Builder setDownlinkDelayMs(@Nullable Input<Integer> downlinkDelayMs) {
            this.downlinkDelayMs = downlinkDelayMs;
            return this;
        }

        public Builder setDownlinkDelayMs(@Nullable Integer downlinkDelayMs) {
            this.downlinkDelayMs = Input.ofNullable(downlinkDelayMs);
            return this;
        }

        public Builder setDownlinkJitterMs(@Nullable Input<Integer> downlinkJitterMs) {
            this.downlinkJitterMs = downlinkJitterMs;
            return this;
        }

        public Builder setDownlinkJitterMs(@Nullable Integer downlinkJitterMs) {
            this.downlinkJitterMs = Input.ofNullable(downlinkJitterMs);
            return this;
        }

        public Builder setDownlinkLossPercent(@Nullable Input<Integer> downlinkLossPercent) {
            this.downlinkLossPercent = downlinkLossPercent;
            return this;
        }

        public Builder setDownlinkLossPercent(@Nullable Integer downlinkLossPercent) {
            this.downlinkLossPercent = Input.ofNullable(downlinkLossPercent);
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

        public Builder setProjectArn(@Nullable Input<String> projectArn) {
            this.projectArn = projectArn;
            return this;
        }

        public Builder setProjectArn(@Nullable String projectArn) {
            this.projectArn = Input.ofNullable(projectArn);
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

        public Builder setUplinkBandwidthBits(@Nullable Input<Integer> uplinkBandwidthBits) {
            this.uplinkBandwidthBits = uplinkBandwidthBits;
            return this;
        }

        public Builder setUplinkBandwidthBits(@Nullable Integer uplinkBandwidthBits) {
            this.uplinkBandwidthBits = Input.ofNullable(uplinkBandwidthBits);
            return this;
        }

        public Builder setUplinkDelayMs(@Nullable Input<Integer> uplinkDelayMs) {
            this.uplinkDelayMs = uplinkDelayMs;
            return this;
        }

        public Builder setUplinkDelayMs(@Nullable Integer uplinkDelayMs) {
            this.uplinkDelayMs = Input.ofNullable(uplinkDelayMs);
            return this;
        }

        public Builder setUplinkJitterMs(@Nullable Input<Integer> uplinkJitterMs) {
            this.uplinkJitterMs = uplinkJitterMs;
            return this;
        }

        public Builder setUplinkJitterMs(@Nullable Integer uplinkJitterMs) {
            this.uplinkJitterMs = Input.ofNullable(uplinkJitterMs);
            return this;
        }

        public Builder setUplinkLossPercent(@Nullable Input<Integer> uplinkLossPercent) {
            this.uplinkLossPercent = uplinkLossPercent;
            return this;
        }

        public Builder setUplinkLossPercent(@Nullable Integer uplinkLossPercent) {
            this.uplinkLossPercent = Input.ofNullable(uplinkLossPercent);
            return this;
        }
        public NetworkProfileState build() {
            return new NetworkProfileState(arn, description, downlinkBandwidthBits, downlinkDelayMs, downlinkJitterMs, downlinkLossPercent, name, projectArn, tags, tagsAll, type, uplinkBandwidthBits, uplinkDelayMs, uplinkJitterMs, uplinkLossPercent);
        }
    }
}
