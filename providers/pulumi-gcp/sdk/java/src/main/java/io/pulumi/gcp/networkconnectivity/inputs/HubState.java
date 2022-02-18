// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.networkconnectivity.inputs.HubRoutingVpcGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubState extends io.pulumi.resources.ResourceArgs {

    public static final HubState Empty = new HubState();

    /**
     * Output only. The time the hub was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * An optional description of the hub.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Immutable. The name of the hub. Hub names must be unique. They use the following form: `projects/{project_number}/locations/global/hubs/{hub_id}`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The VPC network associated with this hub's spokes. All of the VPN tunnels, VLAN attachments, and router appliance
     * instances referenced by this hub's spokes must belong to this VPC network. This field is read-only. Network Connectivity
     * Center automatically populates it based on the set of spokes attached to the hub.
     * 
     */
    @InputImport(name="routingVpcs")
    private final @Nullable Input<List<HubRoutingVpcGetArgs>> routingVpcs;

    public Input<List<HubRoutingVpcGetArgs>> getRoutingVpcs() {
        return this.routingVpcs == null ? Input.empty() : this.routingVpcs;
    }

    /**
     * Output only. The current lifecycle state of this hub. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Output only. The Google-generated UUID for the hub. This value is unique across all hub resources. If a hub is deleted
     * and another with the same name is created, the new hub is assigned a different unique_id.
     * 
     */
    @InputImport(name="uniqueId")
    private final @Nullable Input<String> uniqueId;

    public Input<String> getUniqueId() {
        return this.uniqueId == null ? Input.empty() : this.uniqueId;
    }

    /**
     * Output only. The time the hub was last updated.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public HubState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<HubRoutingVpcGetArgs>> routingVpcs,
        @Nullable Input<String> state,
        @Nullable Input<String> uniqueId,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.routingVpcs = routingVpcs;
        this.state = state;
        this.uniqueId = uniqueId;
        this.updateTime = updateTime;
    }

    private HubState() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.routingVpcs = Input.empty();
        this.state = Input.empty();
        this.uniqueId = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<HubRoutingVpcGetArgs>> routingVpcs;
        private @Nullable Input<String> state;
        private @Nullable Input<String> uniqueId;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HubState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.routingVpcs = defaults.routingVpcs;
    	      this.state = defaults.state;
    	      this.uniqueId = defaults.uniqueId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRoutingVpcs(@Nullable Input<List<HubRoutingVpcGetArgs>> routingVpcs) {
            this.routingVpcs = routingVpcs;
            return this;
        }

        public Builder setRoutingVpcs(@Nullable List<HubRoutingVpcGetArgs> routingVpcs) {
            this.routingVpcs = Input.ofNullable(routingVpcs);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setUniqueId(@Nullable Input<String> uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public Builder setUniqueId(@Nullable String uniqueId) {
            this.uniqueId = Input.ofNullable(uniqueId);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public HubState build() {
            return new HubState(createTime, description, labels, name, project, routingVpcs, state, uniqueId, updateTime);
        }
    }
}
