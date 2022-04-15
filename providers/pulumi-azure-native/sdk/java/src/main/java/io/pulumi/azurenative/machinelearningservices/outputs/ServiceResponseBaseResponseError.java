// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ErrorResponseResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ServiceResponseBaseResponseError {
    /**
     * The error response.
     * 
     */
    private final ErrorResponseResponse error;

    @CustomType.Constructor
    private ServiceResponseBaseResponseError(@CustomType.Parameter("error") ErrorResponseResponse error) {
        this.error = error;
    }

    /**
     * The error response.
     * 
    */
    public ErrorResponseResponse error() {
        return this.error;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResponseBaseResponseError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorResponseResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResponseBaseResponseError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder error(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }        public ServiceResponseBaseResponseError build() {
            return new ServiceResponseBaseResponseError(error);
        }
    }
}
