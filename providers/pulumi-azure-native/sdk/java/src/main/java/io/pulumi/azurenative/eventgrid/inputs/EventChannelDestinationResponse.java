// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventChannelDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventChannelDestinationResponse Empty = new EventChannelDestinationResponse();

    @InputImport(name="azureSubscriptionId")
    private final @Nullable String azureSubscriptionId;

    public Optional<String> getAzureSubscriptionId() {
        return this.azureSubscriptionId == null ? Optional.empty() : Optional.ofNullable(this.azureSubscriptionId);
    }

    @InputImport(name="partnerTopicName")
    private final @Nullable String partnerTopicName;

    public Optional<String> getPartnerTopicName() {
        return this.partnerTopicName == null ? Optional.empty() : Optional.ofNullable(this.partnerTopicName);
    }

    @InputImport(name="resourceGroup")
    private final @Nullable String resourceGroup;

    public Optional<String> getResourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    public EventChannelDestinationResponse(
        @Nullable String azureSubscriptionId,
        @Nullable String partnerTopicName,
        @Nullable String resourceGroup) {
        this.azureSubscriptionId = azureSubscriptionId;
        this.partnerTopicName = partnerTopicName;
        this.resourceGroup = resourceGroup;
    }

    private EventChannelDestinationResponse() {
        this.azureSubscriptionId = null;
        this.partnerTopicName = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventChannelDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureSubscriptionId;
        private @Nullable String partnerTopicName;
        private @Nullable String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(EventChannelDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.partnerTopicName = defaults.partnerTopicName;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder setAzureSubscriptionId(@Nullable String azureSubscriptionId) {
            this.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        public Builder setPartnerTopicName(@Nullable String partnerTopicName) {
            this.partnerTopicName = partnerTopicName;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public EventChannelDestinationResponse build() {
            return new EventChannelDestinationResponse(azureSubscriptionId, partnerTopicName, resourceGroup);
        }
    }
}