// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FlowLogFormatParametersResponse;
import io.pulumi.azurenative.network.inputs.RetentionPolicyParametersResponse;
import io.pulumi.azurenative.network.inputs.TrafficAnalyticsPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A flow log resource.
 * 
 */
public final class FlowLogResponse extends io.pulumi.resources.InvokeArgs {

    public static final FlowLogResponse Empty = new FlowLogResponse();

    /**
     * Flag to enable/disable flow logging.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    @Import(name="flowAnalyticsConfiguration")
      private final @Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration;

    public Optional<TrafficAnalyticsPropertiesResponse> flowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.flowAnalyticsConfiguration);
    }

    /**
     * Parameters that define the flow log format.
     * 
     */
    @Import(name="format")
      private final @Nullable FlowLogFormatParametersResponse format;

    public Optional<FlowLogFormatParametersResponse> format() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The provisioning state of the flow log.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Parameters that define the retention policy for flow log.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable RetentionPolicyParametersResponse retentionPolicy;

    public Optional<RetentionPolicyParametersResponse> retentionPolicy() {
        return this.retentionPolicy == null ? Optional.empty() : Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * ID of the storage account which is used to store the flow log.
     * 
     */
    @Import(name="storageId", required=true)
      private final String storageId;

    public String storageId() {
        return this.storageId;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Guid of network security group to which flow log will be applied.
     * 
     */
    @Import(name="targetResourceGuid", required=true)
      private final String targetResourceGuid;

    public String targetResourceGuid() {
        return this.targetResourceGuid;
    }

    /**
     * ID of network security group to which flow log will be applied.
     * 
     */
    @Import(name="targetResourceId", required=true)
      private final String targetResourceId;

    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public FlowLogResponse(
        @Nullable Boolean enabled,
        String etag,
        @Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration,
        @Nullable FlowLogFormatParametersResponse format,
        @Nullable String id,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable RetentionPolicyParametersResponse retentionPolicy,
        String storageId,
        @Nullable Map<String,String> tags,
        String targetResourceGuid,
        String targetResourceId,
        String type) {
        this.enabled = enabled;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        this.format = format;
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.retentionPolicy = retentionPolicy;
        this.storageId = Objects.requireNonNull(storageId, "expected parameter 'storageId' to be non-null");
        this.tags = tags;
        this.targetResourceGuid = Objects.requireNonNull(targetResourceGuid, "expected parameter 'targetResourceGuid' to be non-null");
        this.targetResourceId = Objects.requireNonNull(targetResourceId, "expected parameter 'targetResourceId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FlowLogResponse() {
        this.enabled = null;
        this.etag = null;
        this.flowAnalyticsConfiguration = null;
        this.format = null;
        this.id = null;
        this.location = null;
        this.name = null;
        this.provisioningState = null;
        this.retentionPolicy = null;
        this.storageId = null;
        this.tags = Map.of();
        this.targetResourceGuid = null;
        this.targetResourceId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String etag;
        private @Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration;
        private @Nullable FlowLogFormatParametersResponse format;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable RetentionPolicyParametersResponse retentionPolicy;
        private String storageId;
        private @Nullable Map<String,String> tags;
        private String targetResourceGuid;
        private String targetResourceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.flowAnalyticsConfiguration = defaults.flowAnalyticsConfiguration;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.storageId = defaults.storageId;
    	      this.tags = defaults.tags;
    	      this.targetResourceGuid = defaults.targetResourceGuid;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.type = defaults.type;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder flowAnalyticsConfiguration(@Nullable TrafficAnalyticsPropertiesResponse flowAnalyticsConfiguration) {
            this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
            return this;
        }
        public Builder format(@Nullable FlowLogFormatParametersResponse format) {
            this.format = format;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder retentionPolicy(@Nullable RetentionPolicyParametersResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder storageId(String storageId) {
            this.storageId = Objects.requireNonNull(storageId);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder targetResourceGuid(String targetResourceGuid) {
            this.targetResourceGuid = Objects.requireNonNull(targetResourceGuid);
            return this;
        }
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = Objects.requireNonNull(targetResourceId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FlowLogResponse build() {
            return new FlowLogResponse(enabled, etag, flowAnalyticsConfiguration, format, id, location, name, provisioningState, retentionPolicy, storageId, tags, targetResourceGuid, targetResourceId, type);
        }
    }
}
