// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OperationErrorErrorsItemResponse {
    /**
     * The error type identifier for this error.
     * 
     */
    private final String code;
    /**
     * Indicates the field in the request that caused the error. This property is optional.
     * 
     */
    private final String location;
    /**
     * An optional, human-readable error message.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","location","message"})
    private OperationErrorErrorsItemResponse(
        String code,
        String location,
        String message) {
        this.code = code;
        this.location = location;
        this.message = message;
    }

    /**
     * The error type identifier for this error.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Indicates the field in the request that caused the error. This property is optional.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * An optional, human-readable error message.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorErrorsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String location;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorErrorsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public OperationErrorErrorsItemResponse build() {
            return new OperationErrorErrorsItemResponse(code, location, message);
        }
    }
}
