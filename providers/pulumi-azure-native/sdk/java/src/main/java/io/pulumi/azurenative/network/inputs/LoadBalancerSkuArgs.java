// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.LoadBalancerSkuName;
import io.pulumi.azurenative.network.enums.LoadBalancerSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of a load balancer.
 * 
 */
public final class LoadBalancerSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerSkuArgs Empty = new LoadBalancerSkuArgs();

    /**
     * Name of a load balancer SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<Either<String,LoadBalancerSkuName>> name;

    public Output<Either<String,LoadBalancerSkuName>> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Tier of a load balancer SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,LoadBalancerSkuTier>> tier;

    public Output<Either<String,LoadBalancerSkuTier>> tier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public LoadBalancerSkuArgs(
        @Nullable Output<Either<String,LoadBalancerSkuName>> name,
        @Nullable Output<Either<String,LoadBalancerSkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private LoadBalancerSkuArgs() {
        this.name = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,LoadBalancerSkuName>> name;
        private @Nullable Output<Either<String,LoadBalancerSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable Output<Either<String,LoadBalancerSkuName>> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable Either<String,LoadBalancerSkuName> name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,LoadBalancerSkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,LoadBalancerSkuTier> tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public LoadBalancerSkuArgs build() {
            return new LoadBalancerSkuArgs(name, tier);
        }
    }
}
