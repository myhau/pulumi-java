// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.azurenative.eventhub.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceResult {
    /**
     * The time the Namespace was created.
     * 
     */
    private final String createdAt;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
     */
    private final @Nullable Boolean isAutoInflateEnabled;
    /**
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
     */
    private final @Nullable Boolean kafkaEnabled;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
     * 
     */
    private final @Nullable Integer maximumThroughputUnits;
    /**
     * Identifier for Azure Insights metrics.
     * 
     */
    private final String metricId;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the Namespace.
     * 
     */
    private final String provisioningState;
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
     */
    private final String serviceBusEndpoint;
    /**
     * Properties of sku resource
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The time the Namespace was updated.
     * 
     */
    private final String updatedAt;

    @OutputCustomType.Constructor({"createdAt","id","isAutoInflateEnabled","kafkaEnabled","location","maximumThroughputUnits","metricId","name","provisioningState","serviceBusEndpoint","sku","tags","type","updatedAt"})
    private GetNamespaceResult(
        String createdAt,
        String id,
        @Nullable Boolean isAutoInflateEnabled,
        @Nullable Boolean kafkaEnabled,
        @Nullable String location,
        @Nullable Integer maximumThroughputUnits,
        String metricId,
        String name,
        String provisioningState,
        String serviceBusEndpoint,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        String updatedAt) {
        this.createdAt = createdAt;
        this.id = id;
        this.isAutoInflateEnabled = isAutoInflateEnabled;
        this.kafkaEnabled = kafkaEnabled;
        this.location = location;
        this.maximumThroughputUnits = maximumThroughputUnits;
        this.metricId = metricId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serviceBusEndpoint = serviceBusEndpoint;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * The time the Namespace was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
    */
    public Optional<Boolean> getIsAutoInflateEnabled() {
        return Optional.ofNullable(this.isAutoInflateEnabled);
    }
    /**
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
    */
    public Optional<Boolean> getKafkaEnabled() {
        return Optional.ofNullable(this.kafkaEnabled);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
     * 
    */
    public Optional<Integer> getMaximumThroughputUnits() {
        return Optional.ofNullable(this.maximumThroughputUnits);
    }
    /**
     * Identifier for Azure Insights metrics.
     * 
    */
    public String getMetricId() {
        return this.metricId;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Namespace.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
    */
    public String getServiceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    /**
     * Properties of sku resource
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The time the Namespace was updated.
     * 
    */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private @Nullable Boolean isAutoInflateEnabled;
        private @Nullable Boolean kafkaEnabled;
        private @Nullable String location;
        private @Nullable Integer maximumThroughputUnits;
        private String metricId;
        private String name;
        private String provisioningState;
        private String serviceBusEndpoint;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.isAutoInflateEnabled = defaults.isAutoInflateEnabled;
    	      this.kafkaEnabled = defaults.kafkaEnabled;
    	      this.location = defaults.location;
    	      this.maximumThroughputUnits = defaults.maximumThroughputUnits;
    	      this.metricId = defaults.metricId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceBusEndpoint = defaults.serviceBusEndpoint;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsAutoInflateEnabled(@Nullable Boolean isAutoInflateEnabled) {
            this.isAutoInflateEnabled = isAutoInflateEnabled;
            return this;
        }

        public Builder setKafkaEnabled(@Nullable Boolean kafkaEnabled) {
            this.kafkaEnabled = kafkaEnabled;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaximumThroughputUnits(@Nullable Integer maximumThroughputUnits) {
            this.maximumThroughputUnits = maximumThroughputUnits;
            return this;
        }

        public Builder setMetricId(String metricId) {
            this.metricId = Objects.requireNonNull(metricId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setServiceBusEndpoint(String serviceBusEndpoint) {
            this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetNamespaceResult build() {
            return new GetNamespaceResult(createdAt, id, isAutoInflateEnabled, kafkaEnabled, location, maximumThroughputUnits, metricId, name, provisioningState, serviceBusEndpoint, sku, tags, type, updatedAt);
        }
    }
}
