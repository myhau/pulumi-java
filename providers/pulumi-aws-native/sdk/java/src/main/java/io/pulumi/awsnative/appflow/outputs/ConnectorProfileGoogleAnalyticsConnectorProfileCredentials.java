// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileConnectorOAuthRequest;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileGoogleAnalyticsConnectorProfileCredentials {
    private final @Nullable String accessToken;
    private final String clientId;
    private final String clientSecret;
    private final @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
    private final @Nullable String refreshToken;

    @OutputCustomType.Constructor({"accessToken","clientId","clientSecret","connectorOAuthRequest","refreshToken"})
    private ConnectorProfileGoogleAnalyticsConnectorProfileCredentials(
        @Nullable String accessToken,
        String clientId,
        String clientSecret,
        @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest,
        @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.clientId = Objects.requireNonNull(clientId);
        this.clientSecret = Objects.requireNonNull(clientSecret);
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    public String getClientId() {
        return this.clientId;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }
    public Optional<ConnectorProfileConnectorOAuthRequest> getConnectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }
    public Optional<String> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileGoogleAnalyticsConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileGoogleAnalyticsConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public ConnectorProfileGoogleAnalyticsConnectorProfileCredentials build() {
            return new ConnectorProfileGoogleAnalyticsConnectorProfileCredentials(accessToken, clientId, clientSecret, connectorOAuthRequest, refreshToken);
        }
    }
}