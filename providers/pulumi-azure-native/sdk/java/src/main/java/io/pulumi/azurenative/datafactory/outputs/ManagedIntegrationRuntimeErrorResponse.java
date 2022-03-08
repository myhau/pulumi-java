// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedIntegrationRuntimeErrorResponse {
    /**
     * Error code.
     * 
     */
    private final String code;
    /**
     * Error message.
     * 
     */
    private final String message;
    /**
     * Managed integration runtime error parameters.
     * 
     */
    private final List<String> parameters;
    /**
     * The time when the error occurred.
     * 
     */
    private final String time;

    @OutputCustomType.Constructor({"code","message","parameters","time"})
    private ManagedIntegrationRuntimeErrorResponse(
        String code,
        String message,
        List<String> parameters,
        String time) {
        this.code = code;
        this.message = message;
        this.parameters = parameters;
        this.time = time;
    }

    /**
     * Error code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Error message.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Managed integration runtime error parameters.
     * 
    */
    public List<String> getParameters() {
        return this.parameters;
    }
    /**
     * The time when the error occurred.
     * 
    */
    public String getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;
        private List<String> parameters;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.parameters = defaults.parameters;
    	      this.time = defaults.time;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setParameters(List<String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public ManagedIntegrationRuntimeErrorResponse build() {
            return new ManagedIntegrationRuntimeErrorResponse(code, message, parameters, time);
        }
    }
}
