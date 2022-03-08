// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2FulfillmentFeatureResponse {
    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private GoogleCloudDialogflowV2FulfillmentFeatureResponse(String type) {
        this.type = type;
    }

    /**
     * The type of the feature that enabled for fulfillment.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2FulfillmentFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDialogflowV2FulfillmentFeatureResponse build() {
            return new GoogleCloudDialogflowV2FulfillmentFeatureResponse(type);
        }
    }
}
