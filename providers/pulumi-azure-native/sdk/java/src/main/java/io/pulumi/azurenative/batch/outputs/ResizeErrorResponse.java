// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResizeErrorResponse {
    private final String code;
    private final @Nullable List<ResizeErrorResponse> details;
    private final String message;

    @OutputCustomType.Constructor({"code","details","message"})
    private ResizeErrorResponse(
        String code,
        @Nullable List<ResizeErrorResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.details = details;
        this.message = Objects.requireNonNull(message);
    }

    public String getCode() {
        return this.code;
    }
    public List<ResizeErrorResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResizeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<ResizeErrorResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ResizeErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<ResizeErrorResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public ResizeErrorResponse build() {
            return new ResizeErrorResponse(code, details, message);
        }
    }
}