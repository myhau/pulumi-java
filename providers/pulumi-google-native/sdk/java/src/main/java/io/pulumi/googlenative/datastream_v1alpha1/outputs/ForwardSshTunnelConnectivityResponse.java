// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ForwardSshTunnelConnectivityResponse {
    private final String hostname;
    private final String password;
    private final Integer port;
    private final String privateKey;
    private final String username;

    @OutputCustomType.Constructor({"hostname","password","port","privateKey","username"})
    private ForwardSshTunnelConnectivityResponse(
        String hostname,
        String password,
        Integer port,
        String privateKey,
        String username) {
        this.hostname = Objects.requireNonNull(hostname);
        this.password = Objects.requireNonNull(password);
        this.port = Objects.requireNonNull(port);
        this.privateKey = Objects.requireNonNull(privateKey);
        this.username = Objects.requireNonNull(username);
    }

    public String getHostname() {
        return this.hostname;
    }
    public String getPassword() {
        return this.password;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardSshTunnelConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private String password;
        private Integer port;
        private String privateKey;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardSshTunnelConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKey = defaults.privateKey;
    	      this.username = defaults.username;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public ForwardSshTunnelConnectivityResponse build() {
            return new ForwardSshTunnelConnectivityResponse(hostname, password, port, privateKey, username);
        }
    }
}