// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanApiStageThrottleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanApiStageThrottleGetArgs Empty = new UsagePlanApiStageThrottleGetArgs();

    /**
     * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
     * 
     */
    @InputImport(name="burstLimit")
      private final @Nullable Input<Integer> burstLimit;

    public Input<Integer> getBurstLimit() {
        return this.burstLimit == null ? Input.empty() : this.burstLimit;
    }

    /**
     * The method to apply the throttle settings for. Specfiy the path and method, for example `/test/GET`.
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * The API request steady-state rate limit.
     * 
     */
    @InputImport(name="rateLimit")
      private final @Nullable Input<Double> rateLimit;

    public Input<Double> getRateLimit() {
        return this.rateLimit == null ? Input.empty() : this.rateLimit;
    }

    public UsagePlanApiStageThrottleGetArgs(
        @Nullable Input<Integer> burstLimit,
        Input<String> path,
        @Nullable Input<Double> rateLimit) {
        this.burstLimit = burstLimit;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.rateLimit = rateLimit;
    }

    private UsagePlanApiStageThrottleGetArgs() {
        this.burstLimit = Input.empty();
        this.path = Input.empty();
        this.rateLimit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanApiStageThrottleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> burstLimit;
        private Input<String> path;
        private @Nullable Input<Double> rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanApiStageThrottleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.path = defaults.path;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder setBurstLimit(@Nullable Input<Integer> burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }

        public Builder setBurstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = Input.ofNullable(burstLimit);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setRateLimit(@Nullable Input<Double> rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        public Builder setRateLimit(@Nullable Double rateLimit) {
            this.rateLimit = Input.ofNullable(rateLimit);
            return this;
        }
        public UsagePlanApiStageThrottleGetArgs build() {
            return new UsagePlanApiStageThrottleGetArgs(burstLimit, path, rateLimit);
        }
    }
}
