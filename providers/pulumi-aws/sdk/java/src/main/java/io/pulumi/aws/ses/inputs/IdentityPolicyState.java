// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPolicyState Empty = new IdentityPolicyState();

    /**
     * Name or Amazon Resource Name (ARN) of the SES Identity.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<String> identity;

    public Input<String> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Name of the policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * JSON string of the policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public IdentityPolicyState(
        @Nullable Input<String> identity,
        @Nullable Input<String> name,
        @Nullable Input<String> policy) {
        this.identity = identity;
        this.name = name;
        this.policy = policy;
    }

    private IdentityPolicyState() {
        this.identity = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identity;
        private @Nullable Input<String> name;
        private @Nullable Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder setIdentity(@Nullable Input<String> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable String identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }
        public IdentityPolicyState build() {
            return new IdentityPolicyState(identity, name, policy);
        }
    }
}
