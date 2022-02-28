// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainCognitoOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainCognitoOptionsGetArgs Empty = new DomainCognitoOptionsGetArgs();

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * ID of the Cognito Identity Pool to use.
     * 
     */
    @InputImport(name="identityPoolId", required=true)
      private final Input<String> identityPoolId;

    public Input<String> getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * ARN of the IAM role that has the AmazonESCognitoAccess policy attached.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * ID of the Cognito User Pool to use.
     * 
     */
    @InputImport(name="userPoolId", required=true)
      private final Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId;
    }

    public DomainCognitoOptionsGetArgs(
        @Nullable Input<Boolean> enabled,
        Input<String> identityPoolId,
        Input<String> roleArn,
        Input<String> userPoolId) {
        this.enabled = enabled;
        this.identityPoolId = Objects.requireNonNull(identityPoolId, "expected parameter 'identityPoolId' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private DomainCognitoOptionsGetArgs() {
        this.enabled = Input.empty();
        this.identityPoolId = Input.empty();
        this.roleArn = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainCognitoOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private Input<String> identityPoolId;
        private Input<String> roleArn;
        private Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainCognitoOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setIdentityPoolId(Input<String> identityPoolId) {
            this.identityPoolId = Objects.requireNonNull(identityPoolId);
            return this;
        }

        public Builder setIdentityPoolId(String identityPoolId) {
            this.identityPoolId = Input.of(Objects.requireNonNull(identityPoolId));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setUserPoolId(Input<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Input.of(Objects.requireNonNull(userPoolId));
            return this;
        }
        public DomainCognitoOptionsGetArgs build() {
            return new DomainCognitoOptionsGetArgs(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
