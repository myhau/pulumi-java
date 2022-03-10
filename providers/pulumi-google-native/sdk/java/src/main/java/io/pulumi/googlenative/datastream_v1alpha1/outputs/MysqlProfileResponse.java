// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.MysqlSslConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MysqlProfileResponse {
    /**
     * Hostname for the MySQL connection.
     * 
     */
    private final String hostname;
    /**
     * Input only. Password for the MySQL connection.
     * 
     */
    private final String password;
    /**
     * Port for the MySQL connection, default value is 3306.
     * 
     */
    private final Integer port;
    /**
     * SSL configuration for the MySQL connection.
     * 
     */
    private final MysqlSslConfigResponse sslConfig;
    /**
     * Username for the MySQL connection.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor
    private MysqlProfileResponse(
        @OutputCustomType.Parameter("hostname") String hostname,
        @OutputCustomType.Parameter("password") String password,
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("sslConfig") MysqlSslConfigResponse sslConfig,
        @OutputCustomType.Parameter("username") String username) {
        this.hostname = hostname;
        this.password = password;
        this.port = port;
        this.sslConfig = sslConfig;
        this.username = username;
    }

    /**
     * Hostname for the MySQL connection.
     * 
    */
    public String getHostname() {
        return this.hostname;
    }
    /**
     * Input only. Password for the MySQL connection.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * Port for the MySQL connection, default value is 3306.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * SSL configuration for the MySQL connection.
     * 
    */
    public MysqlSslConfigResponse getSslConfig() {
        return this.sslConfig;
    }
    /**
     * Username for the MySQL connection.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private String password;
        private Integer port;
        private MysqlSslConfigResponse sslConfig;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sslConfig = defaults.sslConfig;
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

        public Builder setSslConfig(MysqlSslConfigResponse sslConfig) {
            this.sslConfig = Objects.requireNonNull(sslConfig);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public MysqlProfileResponse build() {
            return new MysqlProfileResponse(hostname, password, port, sslConfig, username);
        }
    }
}
