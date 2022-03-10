// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaPromotionResponse {
    /**
     * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    private final String promotionId;

    @OutputCustomType.Constructor
    private GoogleCloudRetailV2alphaPromotionResponse(@OutputCustomType.Parameter("promotionId") String promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
    */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaPromotionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaPromotionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder setPromotionId(String promotionId) {
            this.promotionId = Objects.requireNonNull(promotionId);
            return this;
        }
        public GoogleCloudRetailV2alphaPromotionResponse build() {
            return new GoogleCloudRetailV2alphaPromotionResponse(promotionId);
        }
    }
}
