// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ContainerGroupIdentityResponseUserAssignedIdentities extends io.pulumi.resources.InvokeArgs {

    public static final ContainerGroupIdentityResponseUserAssignedIdentities Empty = new ContainerGroupIdentityResponseUserAssignedIdentities();

    /**
     * The client id of user assigned identity.
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String principalId() {
        return this.principalId;
    }

    public ContainerGroupIdentityResponseUserAssignedIdentities(
        String clientId,
        String principalId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ContainerGroupIdentityResponseUserAssignedIdentities() {
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }        public ContainerGroupIdentityResponseUserAssignedIdentities build() {
            return new ContainerGroupIdentityResponseUserAssignedIdentities(clientId, principalId);
        }
    }
}
