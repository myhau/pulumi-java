// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Status information about a virtual machine.
 * 
 */
public final class ComputeVmInstanceViewStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeVmInstanceViewStatusResponse Empty = new ComputeVmInstanceViewStatusResponse();

    /**
     * Gets the status Code.
     * 
     */
    @Import(name="code")
      private final @Nullable String code;

    public Optional<String> code() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Gets the short localizable label for the status.
     * 
     */
    @Import(name="displayStatus")
      private final @Nullable String displayStatus;

    public Optional<String> displayStatus() {
        return this.displayStatus == null ? Optional.empty() : Optional.ofNullable(this.displayStatus);
    }

    /**
     * Gets the message associated with the status.
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    public ComputeVmInstanceViewStatusResponse(
        @Nullable String code,
        @Nullable String displayStatus,
        @Nullable String message) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.message = message;
    }

    private ComputeVmInstanceViewStatusResponse() {
        this.code = null;
        this.displayStatus = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeVmInstanceViewStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String displayStatus;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeVmInstanceViewStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder displayStatus(@Nullable String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }        public ComputeVmInstanceViewStatusResponse build() {
            return new ComputeVmInstanceViewStatusResponse(code, displayStatus, message);
        }
    }
}
