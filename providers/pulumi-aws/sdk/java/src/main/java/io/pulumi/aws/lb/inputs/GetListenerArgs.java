// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListenerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerArgs Empty = new GetListenerArgs();

    /**
     * ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * ARN of the load balancer. Required if `arn` is not set.
     * 
     */
    @InputImport(name="loadBalancerArn")
      private final @Nullable String loadBalancerArn;

    public Optional<String> getLoadBalancerArn() {
        return this.loadBalancerArn == null ? Optional.empty() : Optional.ofNullable(this.loadBalancerArn);
    }

    /**
     * Port of the listener. Required if `arn` is not set.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetListenerArgs(
        @Nullable String arn,
        @Nullable String loadBalancerArn,
        @Nullable Integer port,
        @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.loadBalancerArn = loadBalancerArn;
        this.port = port;
        this.tags = tags;
    }

    private GetListenerArgs() {
        this.arn = null;
        this.loadBalancerArn = null;
        this.port = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String loadBalancerArn;
        private @Nullable Integer port;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setLoadBalancerArn(@Nullable String loadBalancerArn) {
            this.loadBalancerArn = loadBalancerArn;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetListenerArgs build() {
            return new GetListenerArgs(arn, loadBalancerArn, port, tags);
        }
    }
}
