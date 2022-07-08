// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Labels that can be used to filter Apigee metrics.
 * 
 */
public final class GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs Empty = new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs();

    /**
     * The environment ID associated with the metrics.
     * 
     */
    @Import(name="env")
    private @Nullable Output<String> env;

    /**
     * @return The environment ID associated with the metrics.
     * 
     */
    public Optional<Output<String>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The location associated with the metrics.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location associated with the metrics.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs() {}

    private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs $) {
        this.env = $.env;
        this.instanceId = $.instanceId;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs();
        }

        public Builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs defaults) {
            $ = new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param env The environment ID associated with the metrics.
         * 
         * @return builder
         * 
         */
        public Builder env(@Nullable Output<String> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env The environment ID associated with the metrics.
         * 
         * @return builder
         * 
         */
        public Builder env(String env) {
            return env(Output.of(env));
        }

        /**
         * @param instanceId The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param location The location associated with the metrics.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location associated with the metrics.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
