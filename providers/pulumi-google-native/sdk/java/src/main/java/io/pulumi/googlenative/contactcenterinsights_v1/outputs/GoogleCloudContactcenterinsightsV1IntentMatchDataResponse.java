// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1IntentMatchDataResponse {
    /**
     * The id of the matched intent. Can be used to retrieve the corresponding intent information.
     * 
     */
    private final String intentUniqueId;

    @OutputCustomType.Constructor({"intentUniqueId"})
    private GoogleCloudContactcenterinsightsV1IntentMatchDataResponse(String intentUniqueId) {
        this.intentUniqueId = intentUniqueId;
    }

    /**
     * The id of the matched intent. Can be used to retrieve the corresponding intent information.
     * 
    */
    public String getIntentUniqueId() {
        return this.intentUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IntentMatchDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String intentUniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IntentMatchDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intentUniqueId = defaults.intentUniqueId;
        }

        public Builder setIntentUniqueId(String intentUniqueId) {
            this.intentUniqueId = Objects.requireNonNull(intentUniqueId);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1IntentMatchDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1IntentMatchDataResponse(intentUniqueId);
        }
    }
}
