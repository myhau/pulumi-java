// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MoveResourceErrorBodyResponse {
    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    private final String code;
    /**
     * A list of additional details about the error.
     * 
     */
    private final List<MoveResourceErrorBodyResponse> details;
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    private final String message;
    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
     */
    private final String target;

    @OutputCustomType.Constructor({"code","details","message","target"})
    private MoveResourceErrorBodyResponse(
        String code,
        List<MoveResourceErrorBodyResponse> details,
        String message,
        String target) {
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * A list of additional details about the error.
     * 
    */
    public List<MoveResourceErrorBodyResponse> getDetails() {
        return this.details;
    }
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
    */
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourceErrorBodyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<MoveResourceErrorBodyResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourceErrorBodyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<MoveResourceErrorBodyResponse> details) {
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
        public MoveResourceErrorBodyResponse build() {
            return new MoveResourceErrorBodyResponse(code, details, message, target);
        }
    }
}
