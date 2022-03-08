// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MySqlReplicaConfigurationResponse {
    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    private final String caCertificate;
    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    private final String clientCertificate;
    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    private final String clientKey;
    /**
     * Seconds to wait between connect retries. MySQL's default is 60 seconds.
     * 
     */
    private final Integer connectRetryInterval;
    /**
     * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
     * 
     */
    private final String dumpFilePath;
    /**
     * This is always `sql#mysqlReplicaConfiguration`.
     * 
     */
    private final String kind;
    /**
     * Interval in milliseconds between replication heartbeats.
     * 
     */
    private final String masterHeartbeatPeriod;
    /**
     * The password for the replication connection.
     * 
     */
    private final String password;
    /**
     * A list of permissible ciphers to use for SSL encryption.
     * 
     */
    private final String sslCipher;
    /**
     * The username for the replication connection.
     * 
     */
    private final String username;
    /**
     * Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake.
     * 
     */
    private final Boolean verifyServerCertificate;

    @OutputCustomType.Constructor({"caCertificate","clientCertificate","clientKey","connectRetryInterval","dumpFilePath","kind","masterHeartbeatPeriod","password","sslCipher","username","verifyServerCertificate"})
    private MySqlReplicaConfigurationResponse(
        String caCertificate,
        String clientCertificate,
        String clientKey,
        Integer connectRetryInterval,
        String dumpFilePath,
        String kind,
        String masterHeartbeatPeriod,
        String password,
        String sslCipher,
        String username,
        Boolean verifyServerCertificate) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.connectRetryInterval = connectRetryInterval;
        this.dumpFilePath = dumpFilePath;
        this.kind = kind;
        this.masterHeartbeatPeriod = masterHeartbeatPeriod;
        this.password = password;
        this.sslCipher = sslCipher;
        this.username = username;
        this.verifyServerCertificate = verifyServerCertificate;
    }

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
    */
    public String getCaCertificate() {
        return this.caCertificate;
    }
    /**
     * PEM representation of the replica's x509 certificate.
     * 
    */
    public String getClientCertificate() {
        return this.clientCertificate;
    }
    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
    */
    public String getClientKey() {
        return this.clientKey;
    }
    /**
     * Seconds to wait between connect retries. MySQL's default is 60 seconds.
     * 
    */
    public Integer getConnectRetryInterval() {
        return this.connectRetryInterval;
    }
    /**
     * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
     * 
    */
    public String getDumpFilePath() {
        return this.dumpFilePath;
    }
    /**
     * This is always `sql#mysqlReplicaConfiguration`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Interval in milliseconds between replication heartbeats.
     * 
    */
    public String getMasterHeartbeatPeriod() {
        return this.masterHeartbeatPeriod;
    }
    /**
     * The password for the replication connection.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * A list of permissible ciphers to use for SSL encryption.
     * 
    */
    public String getSslCipher() {
        return this.sslCipher;
    }
    /**
     * The username for the replication connection.
     * 
    */
    public String getUsername() {
        return this.username;
    }
    /**
     * Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake.
     * 
    */
    public Boolean getVerifyServerCertificate() {
        return this.verifyServerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlReplicaConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private String clientCertificate;
        private String clientKey;
        private Integer connectRetryInterval;
        private String dumpFilePath;
        private String kind;
        private String masterHeartbeatPeriod;
        private String password;
        private String sslCipher;
        private String username;
        private Boolean verifyServerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlReplicaConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.connectRetryInterval = defaults.connectRetryInterval;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.kind = defaults.kind;
    	      this.masterHeartbeatPeriod = defaults.masterHeartbeatPeriod;
    	      this.password = defaults.password;
    	      this.sslCipher = defaults.sslCipher;
    	      this.username = defaults.username;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
        }

        public Builder setCaCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }

        public Builder setClientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder setClientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder setConnectRetryInterval(Integer connectRetryInterval) {
            this.connectRetryInterval = Objects.requireNonNull(connectRetryInterval);
            return this;
        }

        public Builder setDumpFilePath(String dumpFilePath) {
            this.dumpFilePath = Objects.requireNonNull(dumpFilePath);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMasterHeartbeatPeriod(String masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = Objects.requireNonNull(masterHeartbeatPeriod);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setSslCipher(String sslCipher) {
            this.sslCipher = Objects.requireNonNull(sslCipher);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setVerifyServerCertificate(Boolean verifyServerCertificate) {
            this.verifyServerCertificate = Objects.requireNonNull(verifyServerCertificate);
            return this;
        }
        public MySqlReplicaConfigurationResponse build() {
            return new MySqlReplicaConfigurationResponse(caCertificate, clientCertificate, clientKey, connectRetryInterval, dumpFilePath, kind, masterHeartbeatPeriod, password, sslCipher, username, verifyServerCertificate);
        }
    }
}
