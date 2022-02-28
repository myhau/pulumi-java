// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterGetArgs;
import io.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationState Empty = new BucketIntelligentTieringConfigurationState();

    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @InputImport(name="bucket")
      private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * A bucket filter. The configuration only includes objects that meet the filter's criteria (documented below).
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<BucketIntelligentTieringConfigurationFilterGetArgs> filter;

    public Input<BucketIntelligentTieringConfigurationFilterGetArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @InputImport(name="tierings")
      private final @Nullable Input<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings;

    public Input<List<BucketIntelligentTieringConfigurationTieringGetArgs>> getTierings() {
        return this.tierings == null ? Input.empty() : this.tierings;
    }

    public BucketIntelligentTieringConfigurationState(
        @Nullable Input<String> bucket,
        @Nullable Input<BucketIntelligentTieringConfigurationFilterGetArgs> filter,
        @Nullable Input<String> name,
        @Nullable Input<String> status,
        @Nullable Input<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings) {
        this.bucket = bucket;
        this.filter = filter;
        this.name = name;
        this.status = status;
        this.tierings = tierings;
    }

    private BucketIntelligentTieringConfigurationState() {
        this.bucket = Input.empty();
        this.filter = Input.empty();
        this.name = Input.empty();
        this.status = Input.empty();
        this.tierings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<BucketIntelligentTieringConfigurationFilterGetArgs> filter;
        private @Nullable Input<String> name;
        private @Nullable Input<String> status;
        private @Nullable Input<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tierings = defaults.tierings;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketIntelligentTieringConfigurationFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketIntelligentTieringConfigurationFilterGetArgs filter) {
            this.filter = Input.ofNullable(filter);
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

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTierings(@Nullable Input<List<BucketIntelligentTieringConfigurationTieringGetArgs>> tierings) {
            this.tierings = tierings;
            return this;
        }

        public Builder setTierings(@Nullable List<BucketIntelligentTieringConfigurationTieringGetArgs> tierings) {
            this.tierings = Input.ofNullable(tierings);
            return this;
        }
        public BucketIntelligentTieringConfigurationState build() {
            return new BucketIntelligentTieringConfigurationState(bucket, filter, name, status, tierings);
        }
    }
}
