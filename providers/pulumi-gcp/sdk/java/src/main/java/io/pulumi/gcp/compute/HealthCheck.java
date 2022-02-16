// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.HealthCheckArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckState;
import io.pulumi.gcp.compute.outputs.HealthCheckGrpcHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckHttp2HealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckHttpHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckHttpsHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckLogConfig;
import io.pulumi.gcp.compute.outputs.HealthCheckSslHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckTcpHealthCheck;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/healthCheck:HealthCheck")
public class HealthCheck extends io.pulumi.resources.CustomResource {
    @OutputExport(name="checkIntervalSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> checkIntervalSec;

    public Output</* @Nullable */ Integer> getCheckIntervalSec() {
        return this.checkIntervalSec;
    }
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="grpcHealthCheck", type=HealthCheckGrpcHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckGrpcHealthCheck> grpcHealthCheck;

    public Output</* @Nullable */ HealthCheckGrpcHealthCheck> getGrpcHealthCheck() {
        return this.grpcHealthCheck;
    }
    @OutputExport(name="healthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthyThreshold;

    public Output</* @Nullable */ Integer> getHealthyThreshold() {
        return this.healthyThreshold;
    }
    @OutputExport(name="http2HealthCheck", type=HealthCheckHttp2HealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckHttp2HealthCheck> http2HealthCheck;

    public Output</* @Nullable */ HealthCheckHttp2HealthCheck> getHttp2HealthCheck() {
        return this.http2HealthCheck;
    }
    @OutputExport(name="httpHealthCheck", type=HealthCheckHttpHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckHttpHealthCheck> httpHealthCheck;

    public Output</* @Nullable */ HealthCheckHttpHealthCheck> getHttpHealthCheck() {
        return this.httpHealthCheck;
    }
    @OutputExport(name="httpsHealthCheck", type=HealthCheckHttpsHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckHttpsHealthCheck> httpsHealthCheck;

    public Output</* @Nullable */ HealthCheckHttpsHealthCheck> getHttpsHealthCheck() {
        return this.httpsHealthCheck;
    }
    @OutputExport(name="logConfig", type=HealthCheckLogConfig.class, parameters={})
    private Output<HealthCheckLogConfig> logConfig;

    public Output<HealthCheckLogConfig> getLogConfig() {
        return this.logConfig;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="sslHealthCheck", type=HealthCheckSslHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckSslHealthCheck> sslHealthCheck;

    public Output</* @Nullable */ HealthCheckSslHealthCheck> getSslHealthCheck() {
        return this.sslHealthCheck;
    }
    @OutputExport(name="tcpHealthCheck", type=HealthCheckTcpHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckTcpHealthCheck> tcpHealthCheck;

    public Output</* @Nullable */ HealthCheckTcpHealthCheck> getTcpHealthCheck() {
        return this.tcpHealthCheck;
    }
    @OutputExport(name="timeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutSec;

    public Output</* @Nullable */ Integer> getTimeoutSec() {
        return this.timeoutSec;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="unhealthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> unhealthyThreshold;

    public Output</* @Nullable */ Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public HealthCheck(String name, @Nullable HealthCheckArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/healthCheck:HealthCheck", name, args == null ? HealthCheckArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HealthCheck(String name, Input<String> id, @Nullable HealthCheckState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/healthCheck:HealthCheck", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static HealthCheck get(String name, Input<String> id, @Nullable HealthCheckState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HealthCheck(name, id, state, options);
    }
}