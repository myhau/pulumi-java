// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RestApiPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestApiPolicyArgs Empty = new RestApiPolicyArgs();

    /**
     * JSON formatted policy document that controls access to the API Gateway.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    /**
     * The ID of the REST API.
     * 
     */
    @InputImport(name="restApiId", required=true)
      private final Input<String> restApiId;

    public Input<String> getRestApiId() {
        return this.restApiId;
    }

    public RestApiPolicyArgs(
        Input<String> policy,
        Input<String> restApiId) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private RestApiPolicyArgs() {
        this.policy = Input.empty();
        this.restApiId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestApiPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policy;
        private Input<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(RestApiPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }

        public Builder setRestApiId(Input<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Input.of(Objects.requireNonNull(restApiId));
            return this;
        }
        public RestApiPolicyArgs build() {
            return new RestApiPolicyArgs(policy, restApiId);
        }
    }
}
