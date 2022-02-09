// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BucketArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2BucketingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2BucketingConfigArgs Empty = new GooglePrivacyDlpV2BucketingConfigArgs();

    @InputImport(name="buckets")
    private final @Nullable Input<List<GooglePrivacyDlpV2BucketArgs>> buckets;

    public Input<List<GooglePrivacyDlpV2BucketArgs>> getBuckets() {
        return this.buckets == null ? Input.empty() : this.buckets;
    }

    public GooglePrivacyDlpV2BucketingConfigArgs(@Nullable Input<List<GooglePrivacyDlpV2BucketArgs>> buckets) {
        this.buckets = buckets;
    }

    private GooglePrivacyDlpV2BucketingConfigArgs() {
        this.buckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BucketingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GooglePrivacyDlpV2BucketArgs>> buckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BucketingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buckets = defaults.buckets;
        }

        public Builder setBuckets(@Nullable Input<List<GooglePrivacyDlpV2BucketArgs>> buckets) {
            this.buckets = buckets;
            return this;
        }

        public Builder setBuckets(@Nullable List<GooglePrivacyDlpV2BucketArgs> buckets) {
            this.buckets = Input.ofNullable(buckets);
            return this;
        }

        public GooglePrivacyDlpV2BucketingConfigArgs build() {
            return new GooglePrivacyDlpV2BucketingConfigArgs(buckets);
        }
    }
}