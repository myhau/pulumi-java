// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Compliance Status details
 * 
 */
public final class ComplianceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComplianceStatusResponse Empty = new ComplianceStatusResponse();

    /**
     * The compliance state of the configuration.
     * 
     */
    @Import(name="complianceState", required=true)
      private final String complianceState;

    public String complianceState() {
        return this.complianceState;
    }

    /**
     * Datetime the configuration was last applied.
     * 
     */
    @Import(name="lastConfigApplied")
      private final @Nullable String lastConfigApplied;

    public Optional<String> lastConfigApplied() {
        return this.lastConfigApplied == null ? Optional.empty() : Optional.ofNullable(this.lastConfigApplied);
    }

    /**
     * Message from when the configuration was applied.
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Level of the message.
     * 
     */
    @Import(name="messageLevel")
      private final @Nullable String messageLevel;

    public Optional<String> messageLevel() {
        return this.messageLevel == null ? Optional.empty() : Optional.ofNullable(this.messageLevel);
    }

    public ComplianceStatusResponse(
        String complianceState,
        @Nullable String lastConfigApplied,
        @Nullable String message,
        @Nullable String messageLevel) {
        this.complianceState = Objects.requireNonNull(complianceState, "expected parameter 'complianceState' to be non-null");
        this.lastConfigApplied = lastConfigApplied;
        this.message = message;
        this.messageLevel = messageLevel;
    }

    private ComplianceStatusResponse() {
        this.complianceState = null;
        this.lastConfigApplied = null;
        this.message = null;
        this.messageLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceState;
        private @Nullable String lastConfigApplied;
        private @Nullable String message;
        private @Nullable String messageLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceState = defaults.complianceState;
    	      this.lastConfigApplied = defaults.lastConfigApplied;
    	      this.message = defaults.message;
    	      this.messageLevel = defaults.messageLevel;
        }

        public Builder complianceState(String complianceState) {
            this.complianceState = Objects.requireNonNull(complianceState);
            return this;
        }
        public Builder lastConfigApplied(@Nullable String lastConfigApplied) {
            this.lastConfigApplied = lastConfigApplied;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder messageLevel(@Nullable String messageLevel) {
            this.messageLevel = messageLevel;
            return this;
        }        public ComplianceStatusResponse build() {
            return new ComplianceStatusResponse(complianceState, lastConfigApplied, message, messageLevel);
        }
    }
}
