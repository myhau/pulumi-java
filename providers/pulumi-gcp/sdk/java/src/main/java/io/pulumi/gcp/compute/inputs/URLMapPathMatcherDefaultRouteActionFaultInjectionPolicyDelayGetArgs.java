// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fixedDelay")
    private final @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;

    public Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> getFixedDelay() {
        return this.fixedDelay == null ? Input.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage")
    private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs(
        @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay,
        @Nullable Input<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs() {
        this.fixedDelay = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixedDelay(@Nullable Input<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }

        public Builder setFixedDelay(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs fixedDelay) {
            this.fixedDelay = Input.ofNullable(fixedDelay);
            return this;
        }

        public Builder setPercentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setPercentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }

        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs(fixedDelay, percentage);
        }
    }
}
