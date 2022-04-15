// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.inputs.ErrorResponseResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Wrapper for error response to follow ARM guidelines.
 * 
 */
public final class ErrorResponseWrapperResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorResponseWrapperResponse Empty = new ErrorResponseWrapperResponse();

    /**
     * The error response.
     * 
     */
    @Import(name="error")
      private final @Nullable ErrorResponseResponse error;

    public Optional<ErrorResponseResponse> error() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    public ErrorResponseWrapperResponse(@Nullable ErrorResponseResponse error) {
        this.error = error;
    }

    private ErrorResponseWrapperResponse() {
        this.error = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseWrapperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorResponseResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseWrapperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder error(@Nullable ErrorResponseResponse error) {
            this.error = error;
            return this;
        }        public ErrorResponseWrapperResponse build() {
            return new ErrorResponseWrapperResponse(error);
        }
    }
}
