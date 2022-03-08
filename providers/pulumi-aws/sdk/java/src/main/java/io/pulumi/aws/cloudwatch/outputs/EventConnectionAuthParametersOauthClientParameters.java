// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventConnectionAuthParametersOauthClientParameters {
    /**
     * The client ID for the credentials to use for authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    private final String clientId;
    /**
     * The client secret for the credentials to use for authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    private final String clientSecret;

    @OutputCustomType.Constructor({"clientId","clientSecret"})
    private EventConnectionAuthParametersOauthClientParameters(
        String clientId,
        String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * The client ID for the credentials to use for authorization. Created and stored in AWS Secrets Manager.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The client secret for the credentials to use for authorization. Created and stored in AWS Secrets Manager.
     * 
    */
    public String getClientSecret() {
        return this.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthClientParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthClientParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public EventConnectionAuthParametersOauthClientParameters build() {
            return new EventConnectionAuthParametersOauthClientParameters(clientId, clientSecret);
        }
    }
}
