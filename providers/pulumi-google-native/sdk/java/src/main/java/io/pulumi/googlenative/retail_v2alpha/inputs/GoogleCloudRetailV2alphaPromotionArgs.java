// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRetailV2alphaPromotionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaPromotionArgs Empty = new GoogleCloudRetailV2alphaPromotionArgs();

    @InputImport(name="promotionId")
    private final @Nullable Input<String> promotionId;

    public Input<String> getPromotionId() {
        return this.promotionId == null ? Input.empty() : this.promotionId;
    }

    public GoogleCloudRetailV2alphaPromotionArgs(@Nullable Input<String> promotionId) {
        this.promotionId = promotionId;
    }

    private GoogleCloudRetailV2alphaPromotionArgs() {
        this.promotionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaPromotionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaPromotionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder setPromotionId(@Nullable Input<String> promotionId) {
            this.promotionId = promotionId;
            return this;
        }

        public Builder setPromotionId(@Nullable String promotionId) {
            this.promotionId = Input.ofNullable(promotionId);
            return this;
        }

        public GoogleCloudRetailV2alphaPromotionArgs build() {
            return new GoogleCloudRetailV2alphaPromotionArgs(promotionId);
        }
    }
}