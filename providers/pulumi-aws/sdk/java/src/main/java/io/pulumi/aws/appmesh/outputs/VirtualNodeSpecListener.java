// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerConnectionPool;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerHealthCheck;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerOutlierDetection;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerPortMapping;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeout;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTls;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecListener {
    /**
     * The connection pool information for the listener.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerConnectionPool connectionPool;
    /**
     * The health check information for the listener.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerHealthCheck healthCheck;
    /**
     * The outlier detection information for the listener.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerOutlierDetection outlierDetection;
    /**
     * The port mapping information for the listener.
     * 
     */
    private final VirtualNodeSpecListenerPortMapping portMapping;
    /**
     * Timeouts for different protocols.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeout timeout;
    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTls tls;

    @OutputCustomType.Constructor({"connectionPool","healthCheck","outlierDetection","portMapping","timeout","tls"})
    private VirtualNodeSpecListener(
        @Nullable VirtualNodeSpecListenerConnectionPool connectionPool,
        @Nullable VirtualNodeSpecListenerHealthCheck healthCheck,
        @Nullable VirtualNodeSpecListenerOutlierDetection outlierDetection,
        VirtualNodeSpecListenerPortMapping portMapping,
        @Nullable VirtualNodeSpecListenerTimeout timeout,
        @Nullable VirtualNodeSpecListenerTls tls) {
        this.connectionPool = connectionPool;
        this.healthCheck = healthCheck;
        this.outlierDetection = outlierDetection;
        this.portMapping = Objects.requireNonNull(portMapping);
        this.timeout = timeout;
        this.tls = tls;
    }

    /**
     * The connection pool information for the listener.
     * 
     */
    public Optional<VirtualNodeSpecListenerConnectionPool> getConnectionPool() {
        return Optional.ofNullable(this.connectionPool);
    }
    /**
     * The health check information for the listener.
     * 
     */
    public Optional<VirtualNodeSpecListenerHealthCheck> getHealthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }
    /**
     * The outlier detection information for the listener.
     * 
     */
    public Optional<VirtualNodeSpecListenerOutlierDetection> getOutlierDetection() {
        return Optional.ofNullable(this.outlierDetection);
    }
    /**
     * The port mapping information for the listener.
     * 
     */
    public VirtualNodeSpecListenerPortMapping getPortMapping() {
        return this.portMapping;
    }
    /**
     * Timeouts for different protocols.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    public Optional<VirtualNodeSpecListenerTls> getTls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerConnectionPool connectionPool;
        private @Nullable VirtualNodeSpecListenerHealthCheck healthCheck;
        private @Nullable VirtualNodeSpecListenerOutlierDetection outlierDetection;
        private VirtualNodeSpecListenerPortMapping portMapping;
        private @Nullable VirtualNodeSpecListenerTimeout timeout;
        private @Nullable VirtualNodeSpecListenerTls tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPool = defaults.connectionPool;
    	      this.healthCheck = defaults.healthCheck;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portMapping = defaults.portMapping;
    	      this.timeout = defaults.timeout;
    	      this.tls = defaults.tls;
        }

        public Builder setConnectionPool(@Nullable VirtualNodeSpecListenerConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        public Builder setHealthCheck(@Nullable VirtualNodeSpecListenerHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder setOutlierDetection(@Nullable VirtualNodeSpecListenerOutlierDetection outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }

        public Builder setPortMapping(VirtualNodeSpecListenerPortMapping portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }

        public Builder setTimeout(@Nullable VirtualNodeSpecListenerTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTls(@Nullable VirtualNodeSpecListenerTls tls) {
            this.tls = tls;
            return this;
        }
        public VirtualNodeSpecListener build() {
            return new VirtualNodeSpecListener(connectionPool, healthCheck, outlierDetection, portMapping, timeout, tls);
        }
    }
}
