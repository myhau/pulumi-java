// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerArgs Empty = new GetLoadBalancerArgs();

    /**
     * The full ARN of the load balancer.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The unique name of the load balancer.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A mapping of tags, each pair of which must exactly match a pair on the desired load balancer.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetLoadBalancerArgs(
        @Nullable String arn,
        @Nullable String name,
        @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.name = name;
        this.tags = tags;
    }

    private GetLoadBalancerArgs() {
        this.arn = null;
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetLoadBalancerArgs build() {
            return new GetLoadBalancerArgs(arn, name, tags);
        }
    }
}
