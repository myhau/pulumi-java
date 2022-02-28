// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WorkforceCognitoConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkforceCognitoConfigArgs Empty = new WorkforceCognitoConfigArgs();

    /**
     * The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * The id for your Amazon Cognito user pool.
     * 
     */
    @InputImport(name="userPool", required=true)
      private final Input<String> userPool;

    public Input<String> getUserPool() {
        return this.userPool;
    }

    public WorkforceCognitoConfigArgs(
        Input<String> clientId,
        Input<String> userPool) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.userPool = Objects.requireNonNull(userPool, "expected parameter 'userPool' to be non-null");
    }

    private WorkforceCognitoConfigArgs() {
        this.clientId = Input.empty();
        this.userPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceCognitoConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientId;
        private Input<String> userPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceCognitoConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.userPool = defaults.userPool;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setUserPool(Input<String> userPool) {
            this.userPool = Objects.requireNonNull(userPool);
            return this;
        }

        public Builder setUserPool(String userPool) {
            this.userPool = Input.of(Objects.requireNonNull(userPool));
            return this;
        }
        public WorkforceCognitoConfigArgs build() {
            return new WorkforceCognitoConfigArgs(clientId, userPool);
        }
    }
}
