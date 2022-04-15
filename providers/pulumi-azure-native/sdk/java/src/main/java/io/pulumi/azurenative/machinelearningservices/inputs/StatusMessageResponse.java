// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Active message associated with project.
 * 
 */
public final class StatusMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatusMessageResponse Empty = new StatusMessageResponse();

    /**
     * Service-defined message code.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * Time in UTC at which the message was created.
     * 
     */
    @Import(name="createdTimeUtc", required=true)
      private final String createdTimeUtc;

    public String createdTimeUtc() {
        return this.createdTimeUtc;
    }

    /**
     * Severity level of the status message.
     * 
     */
    @Import(name="level", required=true)
      private final String level;

    public String level() {
        return this.level;
    }

    /**
     * A human-readable representation of the message code.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    public StatusMessageResponse(
        String code,
        String createdTimeUtc,
        String level,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc, "expected parameter 'createdTimeUtc' to be non-null");
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private StatusMessageResponse() {
        this.code = null;
        this.createdTimeUtc = null;
        this.level = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String createdTimeUtc;
        private String level;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder createdTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
            return this;
        }
        public Builder level(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public StatusMessageResponse build() {
            return new StatusMessageResponse(code, createdTimeUtc, level, message);
        }
    }
}
