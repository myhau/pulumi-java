// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifications of a destination to which the request should be routed to.
 * 
 */
public final class HttpRouteDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteDestinationArgs Empty = new HttpRouteDestinationArgs();

    /**
     * The URL of a BackendService to route traffic to.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The URL of a BackendService to route traffic to.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private HttpRouteDestinationArgs() {}

    private HttpRouteDestinationArgs(HttpRouteDestinationArgs $) {
        this.serviceName = $.serviceName;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteDestinationArgs $;

        public Builder() {
            $ = new HttpRouteDestinationArgs();
        }

        public Builder(HttpRouteDestinationArgs defaults) {
            $ = new HttpRouteDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceName The URL of a BackendService to route traffic to.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The URL of a BackendService to route traffic to.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param weight Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public HttpRouteDestinationArgs build() {
            return $;
        }
    }

}
