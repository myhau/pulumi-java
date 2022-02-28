// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverQueryLogConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverQueryLogConfigState Empty = new ResolverQueryLogConfigState();

    /**
     * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    @InputImport(name="destinationArn")
      private final @Nullable Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn == null ? Input.empty() : this.destinationArn;
    }

    /**
     * The name of the Route 53 Resolver query logging configuration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The AWS account ID of the account that created the query logging configuration.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
     * Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @InputImport(name="shareStatus")
      private final @Nullable Input<String> shareStatus;

    public Input<String> getShareStatus() {
        return this.shareStatus == null ? Input.empty() : this.shareStatus;
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

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ResolverQueryLogConfigState(
        @Nullable Input<String> arn,
        @Nullable Input<String> destinationArn,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> shareStatus,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.destinationArn = destinationArn;
        this.name = name;
        this.ownerId = ownerId;
        this.shareStatus = shareStatus;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ResolverQueryLogConfigState() {
        this.arn = Input.empty();
        this.destinationArn = Input.empty();
        this.name = Input.empty();
        this.ownerId = Input.empty();
        this.shareStatus = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverQueryLogConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> destinationArn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> shareStatus;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverQueryLogConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destinationArn = defaults.destinationArn;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.shareStatus = defaults.shareStatus;
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

        public Builder setDestinationArn(@Nullable Input<String> destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        public Builder setDestinationArn(@Nullable String destinationArn) {
            this.destinationArn = Input.ofNullable(destinationArn);
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

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setShareStatus(@Nullable Input<String> shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }

        public Builder setShareStatus(@Nullable String shareStatus) {
            this.shareStatus = Input.ofNullable(shareStatus);
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
        public ResolverQueryLogConfigState build() {
            return new ResolverQueryLogConfigState(arn, destinationArn, name, ownerId, shareStatus, tags, tagsAll);
        }
    }
}
