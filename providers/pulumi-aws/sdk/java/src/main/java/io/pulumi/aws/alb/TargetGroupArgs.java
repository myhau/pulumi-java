// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.alb.inputs.TargetGroupHealthCheckArgs;
import io.pulumi.aws.alb.inputs.TargetGroupStickinessArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetGroupArgs Empty = new TargetGroupArgs();

    /**
     * Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
     * 
     */
    @InputImport(name="connectionTermination")
      private final @Nullable Input<Boolean> connectionTermination;

    public Input<Boolean> getConnectionTermination() {
        return this.connectionTermination == null ? Input.empty() : this.connectionTermination;
    }

    /**
     * Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     * 
     */
    @InputImport(name="deregistrationDelay")
      private final @Nullable Input<Integer> deregistrationDelay;

    public Input<Integer> getDeregistrationDelay() {
        return this.deregistrationDelay == null ? Input.empty() : this.deregistrationDelay;
    }

    /**
     * Health Check configuration block. Detailed below.
     * 
     */
    @InputImport(name="healthCheck")
      private final @Nullable Input<TargetGroupHealthCheckArgs> healthCheck;

    public Input<TargetGroupHealthCheckArgs> getHealthCheck() {
        return this.healthCheck == null ? Input.empty() : this.healthCheck;
    }

    /**
     * Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
     * 
     */
    @InputImport(name="lambdaMultiValueHeadersEnabled")
      private final @Nullable Input<Boolean> lambdaMultiValueHeadersEnabled;

    public Input<Boolean> getLambdaMultiValueHeadersEnabled() {
        return this.lambdaMultiValueHeadersEnabled == null ? Input.empty() : this.lambdaMultiValueHeadersEnabled;
    }

    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
     * 
     */
    @InputImport(name="loadBalancingAlgorithmType")
      private final @Nullable Input<String> loadBalancingAlgorithmType;

    public Input<String> getLoadBalancingAlgorithmType() {
        return this.loadBalancingAlgorithmType == null ? Input.empty() : this.loadBalancingAlgorithmType;
    }

    /**
     * Name of the target group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
     * 
     */
    @InputImport(name="preserveClientIp")
      private final @Nullable Input<String> preserveClientIp;

    public Input<String> getPreserveClientIp() {
        return this.preserveClientIp == null ? Input.empty() : this.preserveClientIp;
    }

    /**
     * Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
     * 
     */
    @InputImport(name="protocolVersion")
      private final @Nullable Input<String> protocolVersion;

    public Input<String> getProtocolVersion() {
        return this.protocolVersion == null ? Input.empty() : this.protocolVersion;
    }

    /**
     * Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
     * 
     */
    @InputImport(name="proxyProtocolV2")
      private final @Nullable Input<Boolean> proxyProtocolV2;

    public Input<Boolean> getProxyProtocolV2() {
        return this.proxyProtocolV2 == null ? Input.empty() : this.proxyProtocolV2;
    }

    /**
     * Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     * 
     */
    @InputImport(name="slowStart")
      private final @Nullable Input<Integer> slowStart;

    public Input<Integer> getSlowStart() {
        return this.slowStart == null ? Input.empty() : this.slowStart;
    }

    /**
     * Stickiness configuration block. Detailed below.
     * 
     */
    @InputImport(name="stickiness")
      private final @Nullable Input<TargetGroupStickinessArgs> stickiness;

    public Input<TargetGroupStickinessArgs> getStickiness() {
        return this.stickiness == null ? Input.empty() : this.stickiness;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
     * 
     */
    @InputImport(name="targetType")
      private final @Nullable Input<String> targetType;

    public Input<String> getTargetType() {
        return this.targetType == null ? Input.empty() : this.targetType;
    }

    /**
     * Identifier of the VPC in which to create the target group. Required when `target_type` is `instance` or `ip`. Does not apply when `target_type` is `lambda`.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public TargetGroupArgs(
        @Nullable Input<Boolean> connectionTermination,
        @Nullable Input<Integer> deregistrationDelay,
        @Nullable Input<TargetGroupHealthCheckArgs> healthCheck,
        @Nullable Input<Boolean> lambdaMultiValueHeadersEnabled,
        @Nullable Input<String> loadBalancingAlgorithmType,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<Integer> port,
        @Nullable Input<String> preserveClientIp,
        @Nullable Input<String> protocol,
        @Nullable Input<String> protocolVersion,
        @Nullable Input<Boolean> proxyProtocolV2,
        @Nullable Input<Integer> slowStart,
        @Nullable Input<TargetGroupStickinessArgs> stickiness,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> targetType,
        @Nullable Input<String> vpcId) {
        this.connectionTermination = connectionTermination;
        this.deregistrationDelay = deregistrationDelay;
        this.healthCheck = healthCheck;
        this.lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled;
        this.loadBalancingAlgorithmType = loadBalancingAlgorithmType;
        this.name = name;
        this.namePrefix = namePrefix;
        this.port = port;
        this.preserveClientIp = preserveClientIp;
        this.protocol = protocol;
        this.protocolVersion = protocolVersion;
        this.proxyProtocolV2 = proxyProtocolV2;
        this.slowStart = slowStart;
        this.stickiness = stickiness;
        this.tags = tags;
        this.targetType = targetType;
        this.vpcId = vpcId;
    }

    private TargetGroupArgs() {
        this.connectionTermination = Input.empty();
        this.deregistrationDelay = Input.empty();
        this.healthCheck = Input.empty();
        this.lambdaMultiValueHeadersEnabled = Input.empty();
        this.loadBalancingAlgorithmType = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.port = Input.empty();
        this.preserveClientIp = Input.empty();
        this.protocol = Input.empty();
        this.protocolVersion = Input.empty();
        this.proxyProtocolV2 = Input.empty();
        this.slowStart = Input.empty();
        this.stickiness = Input.empty();
        this.tags = Input.empty();
        this.targetType = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> connectionTermination;
        private @Nullable Input<Integer> deregistrationDelay;
        private @Nullable Input<TargetGroupHealthCheckArgs> healthCheck;
        private @Nullable Input<Boolean> lambdaMultiValueHeadersEnabled;
        private @Nullable Input<String> loadBalancingAlgorithmType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> preserveClientIp;
        private @Nullable Input<String> protocol;
        private @Nullable Input<String> protocolVersion;
        private @Nullable Input<Boolean> proxyProtocolV2;
        private @Nullable Input<Integer> slowStart;
        private @Nullable Input<TargetGroupStickinessArgs> stickiness;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> targetType;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionTermination = defaults.connectionTermination;
    	      this.deregistrationDelay = defaults.deregistrationDelay;
    	      this.healthCheck = defaults.healthCheck;
    	      this.lambdaMultiValueHeadersEnabled = defaults.lambdaMultiValueHeadersEnabled;
    	      this.loadBalancingAlgorithmType = defaults.loadBalancingAlgorithmType;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.port = defaults.port;
    	      this.preserveClientIp = defaults.preserveClientIp;
    	      this.protocol = defaults.protocol;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.proxyProtocolV2 = defaults.proxyProtocolV2;
    	      this.slowStart = defaults.slowStart;
    	      this.stickiness = defaults.stickiness;
    	      this.tags = defaults.tags;
    	      this.targetType = defaults.targetType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setConnectionTermination(@Nullable Input<Boolean> connectionTermination) {
            this.connectionTermination = connectionTermination;
            return this;
        }

        public Builder setConnectionTermination(@Nullable Boolean connectionTermination) {
            this.connectionTermination = Input.ofNullable(connectionTermination);
            return this;
        }

        public Builder setDeregistrationDelay(@Nullable Input<Integer> deregistrationDelay) {
            this.deregistrationDelay = deregistrationDelay;
            return this;
        }

        public Builder setDeregistrationDelay(@Nullable Integer deregistrationDelay) {
            this.deregistrationDelay = Input.ofNullable(deregistrationDelay);
            return this;
        }

        public Builder setHealthCheck(@Nullable Input<TargetGroupHealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder setHealthCheck(@Nullable TargetGroupHealthCheckArgs healthCheck) {
            this.healthCheck = Input.ofNullable(healthCheck);
            return this;
        }

        public Builder setLambdaMultiValueHeadersEnabled(@Nullable Input<Boolean> lambdaMultiValueHeadersEnabled) {
            this.lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled;
            return this;
        }

        public Builder setLambdaMultiValueHeadersEnabled(@Nullable Boolean lambdaMultiValueHeadersEnabled) {
            this.lambdaMultiValueHeadersEnabled = Input.ofNullable(lambdaMultiValueHeadersEnabled);
            return this;
        }

        public Builder setLoadBalancingAlgorithmType(@Nullable Input<String> loadBalancingAlgorithmType) {
            this.loadBalancingAlgorithmType = loadBalancingAlgorithmType;
            return this;
        }

        public Builder setLoadBalancingAlgorithmType(@Nullable String loadBalancingAlgorithmType) {
            this.loadBalancingAlgorithmType = Input.ofNullable(loadBalancingAlgorithmType);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setPreserveClientIp(@Nullable Input<String> preserveClientIp) {
            this.preserveClientIp = preserveClientIp;
            return this;
        }

        public Builder setPreserveClientIp(@Nullable String preserveClientIp) {
            this.preserveClientIp = Input.ofNullable(preserveClientIp);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setProtocolVersion(@Nullable Input<String> protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder setProtocolVersion(@Nullable String protocolVersion) {
            this.protocolVersion = Input.ofNullable(protocolVersion);
            return this;
        }

        public Builder setProxyProtocolV2(@Nullable Input<Boolean> proxyProtocolV2) {
            this.proxyProtocolV2 = proxyProtocolV2;
            return this;
        }

        public Builder setProxyProtocolV2(@Nullable Boolean proxyProtocolV2) {
            this.proxyProtocolV2 = Input.ofNullable(proxyProtocolV2);
            return this;
        }

        public Builder setSlowStart(@Nullable Input<Integer> slowStart) {
            this.slowStart = slowStart;
            return this;
        }

        public Builder setSlowStart(@Nullable Integer slowStart) {
            this.slowStart = Input.ofNullable(slowStart);
            return this;
        }

        public Builder setStickiness(@Nullable Input<TargetGroupStickinessArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }

        public Builder setStickiness(@Nullable TargetGroupStickinessArgs stickiness) {
            this.stickiness = Input.ofNullable(stickiness);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetType(@Nullable Input<String> targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder setTargetType(@Nullable String targetType) {
            this.targetType = Input.ofNullable(targetType);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public TargetGroupArgs build() {
            return new TargetGroupArgs(connectionTermination, deregistrationDelay, healthCheck, lambdaMultiValueHeadersEnabled, loadBalancingAlgorithmType, name, namePrefix, port, preserveClientIp, protocol, protocolVersion, proxyProtocolV2, slowStart, stickiness, tags, targetType, vpcId);
        }
    }
}
