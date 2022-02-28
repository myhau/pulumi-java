// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs;
import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleExpirationGetArgs;
import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleFilterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleConfigurationRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationRuleGetArgs Empty = new BucketLifecycleConfigurationRuleGetArgs();

    /**
     * Configuration block containing settings for abort incomplete multipart upload.
     * 
     */
    @InputImport(name="abortIncompleteMultipartUpload")
      private final @Nullable Input<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs> abortIncompleteMultipartUpload;

    public Input<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs> getAbortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload == null ? Input.empty() : this.abortIncompleteMultipartUpload;
    }

    /**
     * Configuration block containing settings for expiration of objects.
     * 
     */
    @InputImport(name="expiration")
      private final @Nullable Input<BucketLifecycleConfigurationRuleExpirationGetArgs> expiration;

    public Input<BucketLifecycleConfigurationRuleExpirationGetArgs> getExpiration() {
        return this.expiration == null ? Input.empty() : this.expiration;
    }

    /**
     * Configuration block containing settings for filtering.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<BucketLifecycleConfigurationRuleFilterGetArgs> filter;

    public Input<BucketLifecycleConfigurationRuleFilterGetArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Unique identifier for the rule.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public BucketLifecycleConfigurationRuleGetArgs(
        @Nullable Input<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs> abortIncompleteMultipartUpload,
        @Nullable Input<BucketLifecycleConfigurationRuleExpirationGetArgs> expiration,
        @Nullable Input<BucketLifecycleConfigurationRuleFilterGetArgs> filter,
        Input<String> id,
        @Nullable Input<String> status) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expiration = expiration;
        this.filter = filter;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.status = status;
    }

    private BucketLifecycleConfigurationRuleGetArgs() {
        this.abortIncompleteMultipartUpload = Input.empty();
        this.expiration = Input.empty();
        this.filter = Input.empty();
        this.id = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs> abortIncompleteMultipartUpload;
        private @Nullable Input<BucketLifecycleConfigurationRuleExpirationGetArgs> expiration;
        private @Nullable Input<BucketLifecycleConfigurationRuleFilterGetArgs> filter;
        private Input<String> id;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expiration = defaults.expiration;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder setAbortIncompleteMultipartUpload(@Nullable Input<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs> abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }

        public Builder setAbortIncompleteMultipartUpload(@Nullable BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = Input.ofNullable(abortIncompleteMultipartUpload);
            return this;
        }

        public Builder setExpiration(@Nullable Input<BucketLifecycleConfigurationRuleExpirationGetArgs> expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder setExpiration(@Nullable BucketLifecycleConfigurationRuleExpirationGetArgs expiration) {
            this.expiration = Input.ofNullable(expiration);
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketLifecycleConfigurationRuleFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketLifecycleConfigurationRuleFilterGetArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
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
        public BucketLifecycleConfigurationRuleGetArgs build() {
            return new BucketLifecycleConfigurationRuleGetArgs(abortIncompleteMultipartUpload, expiration, filter, id, status);
        }
    }
}
