// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Gets or sets private link service connection state.
 * 
 */
public final class VaultPrivateLinkServiceConnectionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultPrivateLinkServiceConnectionStateResponse Empty = new VaultPrivateLinkServiceConnectionStateResponse();

    /**
     * Gets or sets actions required.
     * 
     */
    @Import(name="actionsRequired", required=true)
      private final String actionsRequired;

    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Gets or sets description.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * Gets or sets the status.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    public VaultPrivateLinkServiceConnectionStateResponse(
        String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired, "expected parameter 'actionsRequired' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private VaultPrivateLinkServiceConnectionStateResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public VaultPrivateLinkServiceConnectionStateResponse build() {
            return new VaultPrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
