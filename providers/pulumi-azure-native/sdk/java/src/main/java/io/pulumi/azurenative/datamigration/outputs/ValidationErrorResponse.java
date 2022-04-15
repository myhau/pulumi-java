// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ValidationErrorResponse {
    /**
     * Severity of the error
     * 
     */
    private final String severity;
    /**
     * Error Text
     * 
     */
    private final String text;

    @CustomType.Constructor
    private ValidationErrorResponse(
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("text") String text) {
        this.severity = severity;
        this.text = text;
    }

    /**
     * Severity of the error
     * 
    */
    public String severity() {
        return this.severity;
    }
    /**
     * Error Text
     * 
    */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String severity;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.severity = defaults.severity;
    	      this.text = defaults.text;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public ValidationErrorResponse build() {
            return new ValidationErrorResponse(severity, text);
        }
    }
}
