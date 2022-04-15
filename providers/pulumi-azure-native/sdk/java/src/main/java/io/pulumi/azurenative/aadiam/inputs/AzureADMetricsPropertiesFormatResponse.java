// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureADMetricsPropertiesFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureADMetricsPropertiesFormatResponse Empty = new AzureADMetricsPropertiesFormatResponse();

    /**
     * The provisioning state of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public AzureADMetricsPropertiesFormatResponse(String provisioningState) {
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private AzureADMetricsPropertiesFormatResponse() {
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureADMetricsPropertiesFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureADMetricsPropertiesFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public AzureADMetricsPropertiesFormatResponse build() {
            return new AzureADMetricsPropertiesFormatResponse(provisioningState);
        }
    }
}
