// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.enums.PersistedConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ConnectionState information.
 * 
 */
public final class ConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionStateArgs Empty = new ConnectionStateArgs();

    /**
     * Actions required (if any).
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable Output<String> actionsRequired;

    public Output<String> actionsRequired() {
        return this.actionsRequired == null ? Codegen.empty() : this.actionsRequired;
    }

    /**
     * Description of the connection state.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Status of the connection.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,PersistedConnectionStatus>> status;

    public Output<Either<String,PersistedConnectionStatus>> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public ConnectionStateArgs(
        @Nullable Output<String> actionsRequired,
        @Nullable Output<String> description,
        @Nullable Output<Either<String,PersistedConnectionStatus>> status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private ConnectionStateArgs() {
        this.actionsRequired = Codegen.empty();
        this.description = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionsRequired;
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,PersistedConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }
        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = Codegen.ofNullable(actionsRequired);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,PersistedConnectionStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,PersistedConnectionStatus> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public ConnectionStateArgs build() {
            return new ConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
