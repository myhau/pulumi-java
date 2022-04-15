// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes properties of a network resource.
 * 
 */
public final class NetworkResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkResourcePropertiesResponse Empty = new NetworkResourcePropertiesResponse();

    /**
     * User readable description of the network.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The type of a Service Fabric container network.
     * Expected value is 'NetworkResourceProperties'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * State of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Status of the network.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * Gives additional information about the current status of the network.
     * 
     */
    @Import(name="statusDetails", required=true)
      private final String statusDetails;

    public String statusDetails() {
        return this.statusDetails;
    }

    public NetworkResourcePropertiesResponse(
        @Nullable String description,
        String kind,
        String provisioningState,
        String status,
        String statusDetails) {
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusDetails = Objects.requireNonNull(statusDetails, "expected parameter 'statusDetails' to be non-null");
    }

    private NetworkResourcePropertiesResponse() {
        this.description = null;
        this.kind = null;
        this.provisioningState = null;
        this.status = null;
        this.statusDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String kind;
        private String provisioningState;
        private String status;
        private String statusDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }        public NetworkResourcePropertiesResponse build() {
            return new NetworkResourcePropertiesResponse(description, kind, provisioningState, status, statusDetails);
        }
    }
}
