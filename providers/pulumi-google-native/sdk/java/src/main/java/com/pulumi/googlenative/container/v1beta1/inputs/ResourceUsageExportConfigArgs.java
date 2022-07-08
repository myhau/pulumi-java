// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.inputs.BigQueryDestinationArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.ConsumptionMeteringConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for exporting cluster resource usages.
 * 
 */
public final class ResourceUsageExportConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceUsageExportConfigArgs Empty = new ResourceUsageExportConfigArgs();

    /**
     * Configuration to use BigQuery as usage export destination.
     * 
     */
    @Import(name="bigqueryDestination")
    private @Nullable Output<BigQueryDestinationArgs> bigqueryDestination;

    /**
     * @return Configuration to use BigQuery as usage export destination.
     * 
     */
    public Optional<Output<BigQueryDestinationArgs>> bigqueryDestination() {
        return Optional.ofNullable(this.bigqueryDestination);
    }

    /**
     * Configuration to enable resource consumption metering.
     * 
     */
    @Import(name="consumptionMeteringConfig")
    private @Nullable Output<ConsumptionMeteringConfigArgs> consumptionMeteringConfig;

    /**
     * @return Configuration to enable resource consumption metering.
     * 
     */
    public Optional<Output<ConsumptionMeteringConfigArgs>> consumptionMeteringConfig() {
        return Optional.ofNullable(this.consumptionMeteringConfig);
    }

    /**
     * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
     */
    @Import(name="enableNetworkEgressMetering")
    private @Nullable Output<Boolean> enableNetworkEgressMetering;

    /**
     * @return Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
     */
    public Optional<Output<Boolean>> enableNetworkEgressMetering() {
        return Optional.ofNullable(this.enableNetworkEgressMetering);
    }

    private ResourceUsageExportConfigArgs() {}

    private ResourceUsageExportConfigArgs(ResourceUsageExportConfigArgs $) {
        this.bigqueryDestination = $.bigqueryDestination;
        this.consumptionMeteringConfig = $.consumptionMeteringConfig;
        this.enableNetworkEgressMetering = $.enableNetworkEgressMetering;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceUsageExportConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceUsageExportConfigArgs $;

        public Builder() {
            $ = new ResourceUsageExportConfigArgs();
        }

        public Builder(ResourceUsageExportConfigArgs defaults) {
            $ = new ResourceUsageExportConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigqueryDestination Configuration to use BigQuery as usage export destination.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDestination(@Nullable Output<BigQueryDestinationArgs> bigqueryDestination) {
            $.bigqueryDestination = bigqueryDestination;
            return this;
        }

        /**
         * @param bigqueryDestination Configuration to use BigQuery as usage export destination.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDestination(BigQueryDestinationArgs bigqueryDestination) {
            return bigqueryDestination(Output.of(bigqueryDestination));
        }

        /**
         * @param consumptionMeteringConfig Configuration to enable resource consumption metering.
         * 
         * @return builder
         * 
         */
        public Builder consumptionMeteringConfig(@Nullable Output<ConsumptionMeteringConfigArgs> consumptionMeteringConfig) {
            $.consumptionMeteringConfig = consumptionMeteringConfig;
            return this;
        }

        /**
         * @param consumptionMeteringConfig Configuration to enable resource consumption metering.
         * 
         * @return builder
         * 
         */
        public Builder consumptionMeteringConfig(ConsumptionMeteringConfigArgs consumptionMeteringConfig) {
            return consumptionMeteringConfig(Output.of(consumptionMeteringConfig));
        }

        /**
         * @param enableNetworkEgressMetering Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkEgressMetering(@Nullable Output<Boolean> enableNetworkEgressMetering) {
            $.enableNetworkEgressMetering = enableNetworkEgressMetering;
            return this;
        }

        /**
         * @param enableNetworkEgressMetering Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            return enableNetworkEgressMetering(Output.of(enableNetworkEgressMetering));
        }

        public ResourceUsageExportConfigArgs build() {
            return $;
        }
    }

}
