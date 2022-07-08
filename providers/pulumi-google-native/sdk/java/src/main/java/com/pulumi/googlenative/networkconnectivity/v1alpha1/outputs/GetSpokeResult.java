// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.RouterApplianceInstanceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSpokeResult {
    /**
     * @return The time when the Spoke was created.
     * 
     */
    private final String createTime;
    /**
     * @return Short description of the spoke resource
     * 
     */
    private final String description;
    /**
     * @return The resource URL of the hub resource that the spoke is attached to
     * 
     */
    private final String hub;
    /**
     * @return User-defined labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    private final List<String> linkedInterconnectAttachments;
    /**
     * @return The URIs of linked Router appliance resources
     * 
     */
    private final List<RouterApplianceInstanceResponse> linkedRouterApplianceInstances;
    /**
     * @return The URIs of linked VPN tunnel resources
     * 
     */
    private final List<String> linkedVpnTunnels;
    /**
     * @return Immutable. The name of a Spoke resource.
     * 
     */
    private final String name;
    /**
     * @return The current lifecycle state of this Hub.
     * 
     */
    private final String state;
    /**
     * @return Google-generated UUID for this resource. This is unique across all Spoke resources. If a Spoke resource is deleted and another with the same name is created, it gets a different unique_id.
     * 
     */
    private final String uniqueId;
    /**
     * @return The time when the Spoke was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetSpokeResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("hub") String hub,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("linkedInterconnectAttachments") List<String> linkedInterconnectAttachments,
        @CustomType.Parameter("linkedRouterApplianceInstances") List<RouterApplianceInstanceResponse> linkedRouterApplianceInstances,
        @CustomType.Parameter("linkedVpnTunnels") List<String> linkedVpnTunnels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("uniqueId") String uniqueId,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.hub = hub;
        this.labels = labels;
        this.linkedInterconnectAttachments = linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
        this.linkedVpnTunnels = linkedVpnTunnels;
        this.name = name;
        this.state = state;
        this.uniqueId = uniqueId;
        this.updateTime = updateTime;
    }

    /**
     * @return The time when the Spoke was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Short description of the spoke resource
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The resource URL of the hub resource that the spoke is attached to
     * 
     */
    public String hub() {
        return this.hub;
    }
    /**
     * @return User-defined labels.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The URIs of linked interconnect attachment resources
     * 
     */
    public List<String> linkedInterconnectAttachments() {
        return this.linkedInterconnectAttachments;
    }
    /**
     * @return The URIs of linked Router appliance resources
     * 
     */
    public List<RouterApplianceInstanceResponse> linkedRouterApplianceInstances() {
        return this.linkedRouterApplianceInstances;
    }
    /**
     * @return The URIs of linked VPN tunnel resources
     * 
     */
    public List<String> linkedVpnTunnels() {
        return this.linkedVpnTunnels;
    }
    /**
     * @return Immutable. The name of a Spoke resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current lifecycle state of this Hub.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Google-generated UUID for this resource. This is unique across all Spoke resources. If a Spoke resource is deleted and another with the same name is created, it gets a different unique_id.
     * 
     */
    public String uniqueId() {
        return this.uniqueId;
    }
    /**
     * @return The time when the Spoke was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpokeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String hub;
        private Map<String,String> labels;
        private List<String> linkedInterconnectAttachments;
        private List<RouterApplianceInstanceResponse> linkedRouterApplianceInstances;
        private List<String> linkedVpnTunnels;
        private String name;
        private String state;
        private String uniqueId;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.hub = defaults.hub;
    	      this.labels = defaults.labels;
    	      this.linkedInterconnectAttachments = defaults.linkedInterconnectAttachments;
    	      this.linkedRouterApplianceInstances = defaults.linkedRouterApplianceInstances;
    	      this.linkedVpnTunnels = defaults.linkedVpnTunnels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.uniqueId = defaults.uniqueId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder hub(String hub) {
            this.hub = Objects.requireNonNull(hub);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder linkedInterconnectAttachments(List<String> linkedInterconnectAttachments) {
            this.linkedInterconnectAttachments = Objects.requireNonNull(linkedInterconnectAttachments);
            return this;
        }
        public Builder linkedInterconnectAttachments(String... linkedInterconnectAttachments) {
            return linkedInterconnectAttachments(List.of(linkedInterconnectAttachments));
        }
        public Builder linkedRouterApplianceInstances(List<RouterApplianceInstanceResponse> linkedRouterApplianceInstances) {
            this.linkedRouterApplianceInstances = Objects.requireNonNull(linkedRouterApplianceInstances);
            return this;
        }
        public Builder linkedRouterApplianceInstances(RouterApplianceInstanceResponse... linkedRouterApplianceInstances) {
            return linkedRouterApplianceInstances(List.of(linkedRouterApplianceInstances));
        }
        public Builder linkedVpnTunnels(List<String> linkedVpnTunnels) {
            this.linkedVpnTunnels = Objects.requireNonNull(linkedVpnTunnels);
            return this;
        }
        public Builder linkedVpnTunnels(String... linkedVpnTunnels) {
            return linkedVpnTunnels(List.of(linkedVpnTunnels));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetSpokeResult build() {
            return new GetSpokeResult(createTime, description, hub, labels, linkedInterconnectAttachments, linkedRouterApplianceInstances, linkedVpnTunnels, name, state, uniqueId, updateTime);
        }
    }
}
