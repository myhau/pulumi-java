// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.secretmanager.v1.outputs.AutomaticResponse;
import com.pulumi.googlenative.secretmanager.v1.outputs.UserManagedResponse;
import java.util.Objects;

@CustomType
public final class ReplicationResponse {
    /**
     * @return The Secret will automatically be replicated without any restrictions.
     * 
     */
    private final AutomaticResponse automatic;
    /**
     * @return The Secret will only be replicated into the locations specified.
     * 
     */
    private final UserManagedResponse userManaged;

    @CustomType.Constructor
    private ReplicationResponse(
        @CustomType.Parameter("automatic") AutomaticResponse automatic,
        @CustomType.Parameter("userManaged") UserManagedResponse userManaged) {
        this.automatic = automatic;
        this.userManaged = userManaged;
    }

    /**
     * @return The Secret will automatically be replicated without any restrictions.
     * 
     */
    public AutomaticResponse automatic() {
        return this.automatic;
    }
    /**
     * @return The Secret will only be replicated into the locations specified.
     * 
     */
    public UserManagedResponse userManaged() {
        return this.userManaged;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticResponse automatic;
        private UserManagedResponse userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder automatic(AutomaticResponse automatic) {
            this.automatic = Objects.requireNonNull(automatic);
            return this;
        }
        public Builder userManaged(UserManagedResponse userManaged) {
            this.userManaged = Objects.requireNonNull(userManaged);
            return this;
        }        public ReplicationResponse build() {
            return new ReplicationResponse(automatic, userManaged);
        }
    }
}
