// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcHealthCheckArgs;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckHttp2HealthCheckArgs;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckHttpsHealthCheckArgs;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckLogConfigArgs;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckSslHealthCheckArgs;
import io.pulumi.gcp.compute.inputs.RegionHealthCheckTcpHealthCheckArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckArgs Empty = new RegionHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    @InputImport(name="checkIntervalSec")
    private final @Nullable Input<Integer> checkIntervalSec;

    public Input<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Input.empty() : this.checkIntervalSec;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="grpcHealthCheck")
    private final @Nullable Input<RegionHealthCheckGrpcHealthCheckArgs> grpcHealthCheck;

    public Input<RegionHealthCheckGrpcHealthCheckArgs> getGrpcHealthCheck() {
        return this.grpcHealthCheck == null ? Input.empty() : this.grpcHealthCheck;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    @InputImport(name="healthyThreshold")
    private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="http2HealthCheck")
    private final @Nullable Input<RegionHealthCheckHttp2HealthCheckArgs> http2HealthCheck;

    public Input<RegionHealthCheckHttp2HealthCheckArgs> getHttp2HealthCheck() {
        return this.http2HealthCheck == null ? Input.empty() : this.http2HealthCheck;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpHealthCheck")
    private final @Nullable Input<RegionHealthCheckHttpHealthCheckArgs> httpHealthCheck;

    public Input<RegionHealthCheckHttpHealthCheckArgs> getHttpHealthCheck() {
        return this.httpHealthCheck == null ? Input.empty() : this.httpHealthCheck;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpsHealthCheck")
    private final @Nullable Input<RegionHealthCheckHttpsHealthCheckArgs> httpsHealthCheck;

    public Input<RegionHealthCheckHttpsHealthCheckArgs> getHttpsHealthCheck() {
        return this.httpsHealthCheck == null ? Input.empty() : this.httpsHealthCheck;
    }

    /**
     * Configure logging on this health check.
     * Structure is documented below.
     * 
     */
    @InputImport(name="logConfig")
    private final @Nullable Input<RegionHealthCheckLogConfigArgs> logConfig;

    public Input<RegionHealthCheckLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Region in which the created health check should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="sslHealthCheck")
    private final @Nullable Input<RegionHealthCheckSslHealthCheckArgs> sslHealthCheck;

    public Input<RegionHealthCheckSslHealthCheckArgs> getSslHealthCheck() {
        return this.sslHealthCheck == null ? Input.empty() : this.sslHealthCheck;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="tcpHealthCheck")
    private final @Nullable Input<RegionHealthCheckTcpHealthCheckArgs> tcpHealthCheck;

    public Input<RegionHealthCheckTcpHealthCheckArgs> getTcpHealthCheck() {
        return this.tcpHealthCheck == null ? Input.empty() : this.tcpHealthCheck;
    }

    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    @InputImport(name="timeoutSec")
    private final @Nullable Input<Integer> timeoutSec;

    public Input<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Input.empty() : this.timeoutSec;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    @InputImport(name="unhealthyThreshold")
    private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public RegionHealthCheckArgs(
        @Nullable Input<Integer> checkIntervalSec,
        @Nullable Input<String> description,
        @Nullable Input<RegionHealthCheckGrpcHealthCheckArgs> grpcHealthCheck,
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<RegionHealthCheckHttp2HealthCheckArgs> http2HealthCheck,
        @Nullable Input<RegionHealthCheckHttpHealthCheckArgs> httpHealthCheck,
        @Nullable Input<RegionHealthCheckHttpsHealthCheckArgs> httpsHealthCheck,
        @Nullable Input<RegionHealthCheckLogConfigArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<RegionHealthCheckSslHealthCheckArgs> sslHealthCheck,
        @Nullable Input<RegionHealthCheckTcpHealthCheckArgs> tcpHealthCheck,
        @Nullable Input<Integer> timeoutSec,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.description = description;
        this.grpcHealthCheck = grpcHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.http2HealthCheck = http2HealthCheck;
        this.httpHealthCheck = httpHealthCheck;
        this.httpsHealthCheck = httpsHealthCheck;
        this.logConfig = logConfig;
        this.name = name;
        this.project = project;
        this.region = region;
        this.sslHealthCheck = sslHealthCheck;
        this.tcpHealthCheck = tcpHealthCheck;
        this.timeoutSec = timeoutSec;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private RegionHealthCheckArgs() {
        this.checkIntervalSec = Input.empty();
        this.description = Input.empty();
        this.grpcHealthCheck = Input.empty();
        this.healthyThreshold = Input.empty();
        this.http2HealthCheck = Input.empty();
        this.httpHealthCheck = Input.empty();
        this.httpsHealthCheck = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.sslHealthCheck = Input.empty();
        this.tcpHealthCheck = Input.empty();
        this.timeoutSec = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> checkIntervalSec;
        private @Nullable Input<String> description;
        private @Nullable Input<RegionHealthCheckGrpcHealthCheckArgs> grpcHealthCheck;
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<RegionHealthCheckHttp2HealthCheckArgs> http2HealthCheck;
        private @Nullable Input<RegionHealthCheckHttpHealthCheckArgs> httpHealthCheck;
        private @Nullable Input<RegionHealthCheckHttpsHealthCheckArgs> httpsHealthCheck;
        private @Nullable Input<RegionHealthCheckLogConfigArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<RegionHealthCheckSslHealthCheckArgs> sslHealthCheck;
        private @Nullable Input<RegionHealthCheckTcpHealthCheckArgs> tcpHealthCheck;
        private @Nullable Input<Integer> timeoutSec;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.description = defaults.description;
    	      this.grpcHealthCheck = defaults.grpcHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.http2HealthCheck = defaults.http2HealthCheck;
    	      this.httpHealthCheck = defaults.httpHealthCheck;
    	      this.httpsHealthCheck = defaults.httpsHealthCheck;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.sslHealthCheck = defaults.sslHealthCheck;
    	      this.tcpHealthCheck = defaults.tcpHealthCheck;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setCheckIntervalSec(@Nullable Input<Integer> checkIntervalSec) {
            this.checkIntervalSec = checkIntervalSec;
            return this;
        }

        public Builder setCheckIntervalSec(@Nullable Integer checkIntervalSec) {
            this.checkIntervalSec = Input.ofNullable(checkIntervalSec);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGrpcHealthCheck(@Nullable Input<RegionHealthCheckGrpcHealthCheckArgs> grpcHealthCheck) {
            this.grpcHealthCheck = grpcHealthCheck;
            return this;
        }

        public Builder setGrpcHealthCheck(@Nullable RegionHealthCheckGrpcHealthCheckArgs grpcHealthCheck) {
            this.grpcHealthCheck = Input.ofNullable(grpcHealthCheck);
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Input<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Input.ofNullable(healthyThreshold);
            return this;
        }

        public Builder setHttp2HealthCheck(@Nullable Input<RegionHealthCheckHttp2HealthCheckArgs> http2HealthCheck) {
            this.http2HealthCheck = http2HealthCheck;
            return this;
        }

        public Builder setHttp2HealthCheck(@Nullable RegionHealthCheckHttp2HealthCheckArgs http2HealthCheck) {
            this.http2HealthCheck = Input.ofNullable(http2HealthCheck);
            return this;
        }

        public Builder setHttpHealthCheck(@Nullable Input<RegionHealthCheckHttpHealthCheckArgs> httpHealthCheck) {
            this.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder setHttpHealthCheck(@Nullable RegionHealthCheckHttpHealthCheckArgs httpHealthCheck) {
            this.httpHealthCheck = Input.ofNullable(httpHealthCheck);
            return this;
        }

        public Builder setHttpsHealthCheck(@Nullable Input<RegionHealthCheckHttpsHealthCheckArgs> httpsHealthCheck) {
            this.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder setHttpsHealthCheck(@Nullable RegionHealthCheckHttpsHealthCheckArgs httpsHealthCheck) {
            this.httpsHealthCheck = Input.ofNullable(httpsHealthCheck);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<RegionHealthCheckLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable RegionHealthCheckLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setSslHealthCheck(@Nullable Input<RegionHealthCheckSslHealthCheckArgs> sslHealthCheck) {
            this.sslHealthCheck = sslHealthCheck;
            return this;
        }

        public Builder setSslHealthCheck(@Nullable RegionHealthCheckSslHealthCheckArgs sslHealthCheck) {
            this.sslHealthCheck = Input.ofNullable(sslHealthCheck);
            return this;
        }

        public Builder setTcpHealthCheck(@Nullable Input<RegionHealthCheckTcpHealthCheckArgs> tcpHealthCheck) {
            this.tcpHealthCheck = tcpHealthCheck;
            return this;
        }

        public Builder setTcpHealthCheck(@Nullable RegionHealthCheckTcpHealthCheckArgs tcpHealthCheck) {
            this.tcpHealthCheck = Input.ofNullable(tcpHealthCheck);
            return this;
        }

        public Builder setTimeoutSec(@Nullable Input<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }

        public Builder setTimeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Input.ofNullable(timeoutSec);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.ofNullable(unhealthyThreshold);
            return this;
        }

        public RegionHealthCheckArgs build() {
            return new RegionHealthCheckArgs(checkIntervalSec, description, grpcHealthCheck, healthyThreshold, http2HealthCheck, httpHealthCheck, httpsHealthCheck, logConfig, name, project, region, sslHealthCheck, tcpHealthCheck, timeoutSec, unhealthyThreshold);
        }
    }
}
