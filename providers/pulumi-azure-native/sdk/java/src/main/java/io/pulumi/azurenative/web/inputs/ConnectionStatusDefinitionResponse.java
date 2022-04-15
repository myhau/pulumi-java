// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ConnectionErrorResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection status
 * 
 */
public final class ConnectionStatusDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionStatusDefinitionResponse Empty = new ConnectionStatusDefinitionResponse();

    /**
     * Connection error
     * 
     */
    @Import(name="error")
      private final @Nullable ConnectionErrorResponse error;

    public Optional<ConnectionErrorResponse> error() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    /**
     * The gateway status
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Target of the error
     * 
     */
    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public ConnectionStatusDefinitionResponse(
        @Nullable ConnectionErrorResponse error,
        @Nullable String status,
        @Nullable String target) {
        this.error = error;
        this.status = status;
        this.target = target;
    }

    private ConnectionStatusDefinitionResponse() {
        this.error = null;
        this.status = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatusDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionErrorResponse error;
        private @Nullable String status;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStatusDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        public Builder error(@Nullable ConnectionErrorResponse error) {
            this.error = error;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public ConnectionStatusDefinitionResponse build() {
            return new ConnectionStatusDefinitionResponse(error, status, target);
        }
    }
}
