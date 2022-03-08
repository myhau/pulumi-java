// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.secretmanager.outputs.SecretReplicationUserManagedReplica;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecretReplicationUserManaged {
    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * Structure is documented below.
     * 
     */
    private final List<SecretReplicationUserManagedReplica> replicas;

    @OutputCustomType.Constructor({"replicas"})
    private SecretReplicationUserManaged(List<SecretReplicationUserManagedReplica> replicas) {
        this.replicas = replicas;
    }

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * Structure is documented below.
     * 
    */
    public List<SecretReplicationUserManagedReplica> getReplicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicationUserManaged defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SecretReplicationUserManagedReplica> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicationUserManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder setReplicas(List<SecretReplicationUserManagedReplica> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public SecretReplicationUserManaged build() {
            return new SecretReplicationUserManaged(replicas);
        }
    }
}
