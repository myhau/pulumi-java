// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerHealthCheckArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerPortMappingArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerArgs Empty = new VirtualNodeSpecListenerArgs();

    /**
     * The connection pool information for the listener.
     * 
     */
    @InputImport(name="connectionPool")
      private final @Nullable Input<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool;

    public Input<VirtualNodeSpecListenerConnectionPoolArgs> getConnectionPool() {
        return this.connectionPool == null ? Input.empty() : this.connectionPool;
    }

    /**
     * The health check information for the listener.
     * 
     */
    @InputImport(name="healthCheck")
      private final @Nullable Input<VirtualNodeSpecListenerHealthCheckArgs> healthCheck;

    public Input<VirtualNodeSpecListenerHealthCheckArgs> getHealthCheck() {
        return this.healthCheck == null ? Input.empty() : this.healthCheck;
    }

    /**
     * The outlier detection information for the listener.
     * 
     */
    @InputImport(name="outlierDetection")
      private final @Nullable Input<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection;

    public Input<VirtualNodeSpecListenerOutlierDetectionArgs> getOutlierDetection() {
        return this.outlierDetection == null ? Input.empty() : this.outlierDetection;
    }

    /**
     * The port mapping information for the listener.
     * 
     */
    @InputImport(name="portMapping", required=true)
      private final Input<VirtualNodeSpecListenerPortMappingArgs> portMapping;

    public Input<VirtualNodeSpecListenerPortMappingArgs> getPortMapping() {
        return this.portMapping;
    }

    /**
     * Timeouts for different protocols.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutArgs> timeout;

    public Input<VirtualNodeSpecListenerTimeoutArgs> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    @InputImport(name="tls")
      private final @Nullable Input<VirtualNodeSpecListenerTlsArgs> tls;

    public Input<VirtualNodeSpecListenerTlsArgs> getTls() {
        return this.tls == null ? Input.empty() : this.tls;
    }

    public VirtualNodeSpecListenerArgs(
        @Nullable Input<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool,
        @Nullable Input<VirtualNodeSpecListenerHealthCheckArgs> healthCheck,
        @Nullable Input<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection,
        Input<VirtualNodeSpecListenerPortMappingArgs> portMapping,
        @Nullable Input<VirtualNodeSpecListenerTimeoutArgs> timeout,
        @Nullable Input<VirtualNodeSpecListenerTlsArgs> tls) {
        this.connectionPool = connectionPool;
        this.healthCheck = healthCheck;
        this.outlierDetection = outlierDetection;
        this.portMapping = Objects.requireNonNull(portMapping, "expected parameter 'portMapping' to be non-null");
        this.timeout = timeout;
        this.tls = tls;
    }

    private VirtualNodeSpecListenerArgs() {
        this.connectionPool = Input.empty();
        this.healthCheck = Input.empty();
        this.outlierDetection = Input.empty();
        this.portMapping = Input.empty();
        this.timeout = Input.empty();
        this.tls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool;
        private @Nullable Input<VirtualNodeSpecListenerHealthCheckArgs> healthCheck;
        private @Nullable Input<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection;
        private Input<VirtualNodeSpecListenerPortMappingArgs> portMapping;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutArgs> timeout;
        private @Nullable Input<VirtualNodeSpecListenerTlsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPool = defaults.connectionPool;
    	      this.healthCheck = defaults.healthCheck;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portMapping = defaults.portMapping;
    	      this.timeout = defaults.timeout;
    	      this.tls = defaults.tls;
        }

        public Builder setConnectionPool(@Nullable Input<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        public Builder setConnectionPool(@Nullable VirtualNodeSpecListenerConnectionPoolArgs connectionPool) {
            this.connectionPool = Input.ofNullable(connectionPool);
            return this;
        }

        public Builder setHealthCheck(@Nullable Input<VirtualNodeSpecListenerHealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder setHealthCheck(@Nullable VirtualNodeSpecListenerHealthCheckArgs healthCheck) {
            this.healthCheck = Input.ofNullable(healthCheck);
            return this;
        }

        public Builder setOutlierDetection(@Nullable Input<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }

        public Builder setOutlierDetection(@Nullable VirtualNodeSpecListenerOutlierDetectionArgs outlierDetection) {
            this.outlierDetection = Input.ofNullable(outlierDetection);
            return this;
        }

        public Builder setPortMapping(Input<VirtualNodeSpecListenerPortMappingArgs> portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }

        public Builder setPortMapping(VirtualNodeSpecListenerPortMappingArgs portMapping) {
            this.portMapping = Input.of(Objects.requireNonNull(portMapping));
            return this;
        }

        public Builder setTimeout(@Nullable Input<VirtualNodeSpecListenerTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable VirtualNodeSpecListenerTimeoutArgs timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTls(@Nullable Input<VirtualNodeSpecListenerTlsArgs> tls) {
            this.tls = tls;
            return this;
        }

        public Builder setTls(@Nullable VirtualNodeSpecListenerTlsArgs tls) {
            this.tls = Input.ofNullable(tls);
            return this;
        }
        public VirtualNodeSpecListenerArgs build() {
            return new VirtualNodeSpecListenerArgs(connectionPool, healthCheck, outlierDetection, portMapping, timeout, tls);
        }
    }
}