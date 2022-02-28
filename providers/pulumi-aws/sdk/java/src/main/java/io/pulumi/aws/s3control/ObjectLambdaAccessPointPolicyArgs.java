// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointPolicyArgs Empty = new ObjectLambdaAccessPointPolicyArgs();

    @InputImport(name="accountId")
      private final @Nullable Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId == null ? Input.empty() : this.accountId;
    }

    /**
     * The name of the Object Lambda Access Point.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Object Lambda Access Point resource policy document.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public ObjectLambdaAccessPointPolicyArgs(
        @Nullable Input<String> accountId,
        @Nullable Input<String> name,
        Input<String> policy) {
        this.accountId = accountId;
        this.name = name;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private ObjectLambdaAccessPointPolicyArgs() {
        this.accountId = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountId;
        private @Nullable Input<String> name;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder setAccountId(@Nullable Input<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = Input.ofNullable(accountId);
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

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }
        public ObjectLambdaAccessPointPolicyArgs build() {
            return new ObjectLambdaAccessPointPolicyArgs(accountId, name, policy);
        }
    }
}
