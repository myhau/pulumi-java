// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectionClientParameters {
    private final String clientID;
    private final String clientSecret;

    @OutputCustomType.Constructor({"clientID","clientSecret"})
    private ConnectionClientParameters(
        String clientID,
        String clientSecret) {
        this.clientID = clientID;
        this.clientSecret = clientSecret;
    }

    public String getClientID() {
        return this.clientID;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionClientParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientID;
        private String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionClientParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientID = defaults.clientID;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder setClientID(String clientID) {
            this.clientID = Objects.requireNonNull(clientID);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public ConnectionClientParameters build() {
            return new ConnectionClientParameters(clientID, clientSecret);
        }
    }
}
