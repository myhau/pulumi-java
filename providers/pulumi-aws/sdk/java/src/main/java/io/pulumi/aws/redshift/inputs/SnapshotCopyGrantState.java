// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotCopyGrantState extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotCopyGrantState Empty = new SnapshotCopyGrantState();

    /**
     * Amazon Resource Name (ARN) of snapshot copy grant
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * A friendly name for identifying the grant.
     * 
     */
    @InputImport(name="snapshotCopyGrantName")
      private final @Nullable Input<String> snapshotCopyGrantName;

    public Input<String> getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName == null ? Input.empty() : this.snapshotCopyGrantName;
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

    public SnapshotCopyGrantState(
        @Nullable Input<String> arn,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> snapshotCopyGrantName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.kmsKeyId = kmsKeyId;
        this.snapshotCopyGrantName = snapshotCopyGrantName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private SnapshotCopyGrantState() {
        this.arn = Input.empty();
        this.kmsKeyId = Input.empty();
        this.snapshotCopyGrantName = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotCopyGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> snapshotCopyGrantName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotCopyGrantState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotCopyGrantName = defaults.snapshotCopyGrantName;
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

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setSnapshotCopyGrantName(@Nullable Input<String> snapshotCopyGrantName) {
            this.snapshotCopyGrantName = snapshotCopyGrantName;
            return this;
        }

        public Builder setSnapshotCopyGrantName(@Nullable String snapshotCopyGrantName) {
            this.snapshotCopyGrantName = Input.ofNullable(snapshotCopyGrantName);
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
        public SnapshotCopyGrantState build() {
            return new SnapshotCopyGrantState(arn, kmsKeyId, snapshotCopyGrantName, tags, tagsAll);
        }
    }
}
