// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.enums.PrivateLinkServiceConnectionStatus;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint.
 * 
 */
public final class PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs Empty = new PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs();

    /**
     * A description of any extra actions that may be required.
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable Output<String> actionsRequired;

    public Output<String> actionsRequired() {
        return this.actionsRequired == null ? Codegen.empty() : this.actionsRequired;
    }

    /**
     * The description for the private link service connection state.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Status of the the private link service connection. Can be Pending, Approved, Rejected, or Disconnected.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<PrivateLinkServiceConnectionStatus> status;

    public Output<PrivateLinkServiceConnectionStatus> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> actionsRequired,
        @Nullable Output<String> description,
        @Nullable Output<PrivateLinkServiceConnectionStatus> status) {
        this.actionsRequired = actionsRequired == null ? Codegen.ofNullable("None") : actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs() {
        this.actionsRequired = Codegen.empty();
        this.description = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionsRequired;
        private @Nullable Output<String> description;
        private @Nullable Output<PrivateLinkServiceConnectionStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs defaults) {
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
        public Builder status(@Nullable Output<PrivateLinkServiceConnectionStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable PrivateLinkServiceConnectionStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs build() {
            return new PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
