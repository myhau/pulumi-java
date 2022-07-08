// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specifications for retries.
 * 
 */
public final class GrpcRouteRetryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrpcRouteRetryPolicyArgs Empty = new GrpcRouteRetryPolicyArgs();

    /**
     * Specifies the allowed number of retries. This number must be &gt; 0. If not specpfied, default to 1.
     * 
     */
    @Import(name="numRetries")
    private @Nullable Output<Integer> numRetries;

    /**
     * @return Specifies the allowed number of retries. This number must be &gt; 0. If not specpfied, default to 1.
     * 
     */
    public Optional<Output<Integer>> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }

    /**
     * - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    @Import(name="retryConditions")
    private @Nullable Output<List<String>> retryConditions;

    /**
     * @return - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    public Optional<Output<List<String>>> retryConditions() {
        return Optional.ofNullable(this.retryConditions);
    }

    private GrpcRouteRetryPolicyArgs() {}

    private GrpcRouteRetryPolicyArgs(GrpcRouteRetryPolicyArgs $) {
        this.numRetries = $.numRetries;
        this.retryConditions = $.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrpcRouteRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrpcRouteRetryPolicyArgs $;

        public Builder() {
            $ = new GrpcRouteRetryPolicyArgs();
        }

        public Builder(GrpcRouteRetryPolicyArgs defaults) {
            $ = new GrpcRouteRetryPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param numRetries Specifies the allowed number of retries. This number must be &gt; 0. If not specpfied, default to 1.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        /**
         * @param numRetries Specifies the allowed number of retries. This number must be &gt; 0. If not specpfied, default to 1.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Integer numRetries) {
            return numRetries(Output.of(numRetries));
        }

        /**
         * @param retryConditions - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(@Nullable Output<List<String>> retryConditions) {
            $.retryConditions = retryConditions;
            return this;
        }

        /**
         * @param retryConditions - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(List<String> retryConditions) {
            return retryConditions(Output.of(retryConditions));
        }

        /**
         * @param retryConditions - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }

        public GrpcRouteRetryPolicyArgs build() {
            return $;
        }
    }

}
