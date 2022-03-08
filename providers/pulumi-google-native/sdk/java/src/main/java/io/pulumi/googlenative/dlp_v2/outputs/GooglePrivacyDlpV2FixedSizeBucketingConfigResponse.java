// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2FixedSizeBucketingConfigResponse {
    /**
     * Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
     * 
     */
    private final Double bucketSize;
    /**
     * Lower bound value of buckets. All values less than `lower_bound` are grouped together into a single bucket; for example if `lower_bound` = 10, then all values less than 10 are replaced with the value "-10".
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse lowerBound;
    /**
     * Upper bound value of buckets. All values greater than upper_bound are grouped together into a single bucket; for example if `upper_bound` = 89, then all values greater than 89 are replaced with the value "89+".
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse upperBound;

    @OutputCustomType.Constructor({"bucketSize","lowerBound","upperBound"})
    private GooglePrivacyDlpV2FixedSizeBucketingConfigResponse(
        Double bucketSize,
        GooglePrivacyDlpV2ValueResponse lowerBound,
        GooglePrivacyDlpV2ValueResponse upperBound) {
        this.bucketSize = bucketSize;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
     * 
    */
    public Double getBucketSize() {
        return this.bucketSize;
    }
    /**
     * Lower bound value of buckets. All values less than `lower_bound` are grouped together into a single bucket; for example if `lower_bound` = 10, then all values less than 10 are replaced with the value "-10".
     * 
    */
    public GooglePrivacyDlpV2ValueResponse getLowerBound() {
        return this.lowerBound;
    }
    /**
     * Upper bound value of buckets. All values greater than upper_bound are grouped together into a single bucket; for example if `upper_bound` = 89, then all values greater than 89 are replaced with the value "89+".
     * 
    */
    public GooglePrivacyDlpV2ValueResponse getUpperBound() {
        return this.upperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FixedSizeBucketingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double bucketSize;
        private GooglePrivacyDlpV2ValueResponse lowerBound;
        private GooglePrivacyDlpV2ValueResponse upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FixedSizeBucketingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.lowerBound = defaults.lowerBound;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder setBucketSize(Double bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder setLowerBound(GooglePrivacyDlpV2ValueResponse lowerBound) {
            this.lowerBound = Objects.requireNonNull(lowerBound);
            return this;
        }

        public Builder setUpperBound(GooglePrivacyDlpV2ValueResponse upperBound) {
            this.upperBound = Objects.requireNonNull(upperBound);
            return this;
        }
        public GooglePrivacyDlpV2FixedSizeBucketingConfigResponse build() {
            return new GooglePrivacyDlpV2FixedSizeBucketingConfigResponse(bucketSize, lowerBound, upperBound);
        }
    }
}
