// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolCognitoIdentityProviderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolCognitoIdentityProviderGetArgs Empty = new IdentityPoolCognitoIdentityProviderGetArgs();

    /**
     * The client ID for the Amazon Cognito Identity User Pool.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The provider name for an Amazon Cognito Identity User Pool.
     * 
     */
    @InputImport(name="providerName")
      private final @Nullable Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName == null ? Input.empty() : this.providerName;
    }

    /**
     * Whether server-side token validation is enabled for the identity provider’s token or not.
     * 
     */
    @InputImport(name="serverSideTokenCheck")
      private final @Nullable Input<Boolean> serverSideTokenCheck;

    public Input<Boolean> getServerSideTokenCheck() {
        return this.serverSideTokenCheck == null ? Input.empty() : this.serverSideTokenCheck;
    }

    public IdentityPoolCognitoIdentityProviderGetArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> providerName,
        @Nullable Input<Boolean> serverSideTokenCheck) {
        this.clientId = clientId;
        this.providerName = providerName;
        this.serverSideTokenCheck = serverSideTokenCheck;
    }

    private IdentityPoolCognitoIdentityProviderGetArgs() {
        this.clientId = Input.empty();
        this.providerName = Input.empty();
        this.serverSideTokenCheck = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolCognitoIdentityProviderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> providerName;
        private @Nullable Input<Boolean> serverSideTokenCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolCognitoIdentityProviderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.providerName = defaults.providerName;
    	      this.serverSideTokenCheck = defaults.serverSideTokenCheck;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setProviderName(@Nullable Input<String> providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder setProviderName(@Nullable String providerName) {
            this.providerName = Input.ofNullable(providerName);
            return this;
        }

        public Builder setServerSideTokenCheck(@Nullable Input<Boolean> serverSideTokenCheck) {
            this.serverSideTokenCheck = serverSideTokenCheck;
            return this;
        }

        public Builder setServerSideTokenCheck(@Nullable Boolean serverSideTokenCheck) {
            this.serverSideTokenCheck = Input.ofNullable(serverSideTokenCheck);
            return this;
        }
        public IdentityPoolCognitoIdentityProviderGetArgs build() {
            return new IdentityPoolCognitoIdentityProviderGetArgs(clientId, providerName, serverSideTokenCheck);
        }
    }
}
