// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.AutoScaleRunErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoScaleRunResponse {
    private final @Nullable AutoScaleRunErrorResponse error;
    private final String evaluationTime;
    /**
     * Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     * 
     */
    private final @Nullable String results;

    @CustomType.Constructor
    private AutoScaleRunResponse(
        @CustomType.Parameter("error") @Nullable AutoScaleRunErrorResponse error,
        @CustomType.Parameter("evaluationTime") String evaluationTime,
        @CustomType.Parameter("results") @Nullable String results) {
        this.error = error;
        this.evaluationTime = evaluationTime;
        this.results = results;
    }

    public Optional<AutoScaleRunErrorResponse> error() {
        return Optional.ofNullable(this.error);
    }
    public String evaluationTime() {
        return this.evaluationTime;
    }
    /**
     * Each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     * 
    */
    public Optional<String> results() {
        return Optional.ofNullable(this.results);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleRunErrorResponse error;
        private String evaluationTime;
        private @Nullable String results;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.evaluationTime = defaults.evaluationTime;
    	      this.results = defaults.results;
        }

        public Builder error(@Nullable AutoScaleRunErrorResponse error) {
            this.error = error;
            return this;
        }
        public Builder evaluationTime(String evaluationTime) {
            this.evaluationTime = Objects.requireNonNull(evaluationTime);
            return this;
        }
        public Builder results(@Nullable String results) {
            this.results = results;
            return this;
        }        public AutoScaleRunResponse build() {
            return new AutoScaleRunResponse(error, evaluationTime, results);
        }
    }
}
