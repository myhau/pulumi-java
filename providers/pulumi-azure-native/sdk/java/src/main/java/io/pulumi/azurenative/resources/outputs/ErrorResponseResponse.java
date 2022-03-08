// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.ErrorAdditionalInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ErrorResponseResponse {
    /**
     * The error additional info.
     * 
     */
    private final List<ErrorAdditionalInfoResponse> additionalInfo;
    /**
     * The error code.
     * 
     */
    private final String code;
    /**
     * The error details.
     * 
     */
    private final List<ErrorResponseResponse> details;
    /**
     * The error message.
     * 
     */
    private final String message;
    /**
     * The error target.
     * 
     */
    private final String target;

    @OutputCustomType.Constructor({"additionalInfo","code","details","message","target"})
    private ErrorResponseResponse(
        List<ErrorAdditionalInfoResponse> additionalInfo,
        String code,
        List<ErrorResponseResponse> details,
        String message,
        String target) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    /**
     * The error additional info.
     * 
    */
    public List<ErrorAdditionalInfoResponse> getAdditionalInfo() {
        return this.additionalInfo;
    }
    /**
     * The error code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * The error details.
     * 
    */
    public List<ErrorResponseResponse> getDetails() {
        return this.details;
    }
    /**
     * The error message.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The error target.
     * 
    */
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ErrorAdditionalInfoResponse> additionalInfo;
        private String code;
        private List<ErrorResponseResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setAdditionalInfo(List<ErrorAdditionalInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ErrorResponseResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ErrorResponseResponse build() {
            return new ErrorResponseResponse(additionalInfo, code, details, message, target);
        }
    }
}
