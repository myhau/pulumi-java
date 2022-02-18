// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.PacketMirroringCollectorIlbGetArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringFilterGetArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesGetArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringNetworkGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringState extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringState Empty = new PacketMirroringState();

    /**
     * The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
     * that will be used as collector for mirrored traffic. The
     * specified forwarding rule must have is_mirroring_collector
     * set to true.
     * Structure is documented below.
     * 
     */
    @InputImport(name="collectorIlb")
    private final @Nullable Input<PacketMirroringCollectorIlbGetArgs> collectorIlb;

    public Input<PacketMirroringCollectorIlbGetArgs> getCollectorIlb() {
        return this.collectorIlb == null ? Input.empty() : this.collectorIlb;
    }

    /**
     * A human-readable description of the rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<PacketMirroringFilterGetArgs> filter;

    public Input<PacketMirroringFilterGetArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * A means of specifying which resources to mirror.
     * Structure is documented below.
     * 
     */
    @InputImport(name="mirroredResources")
    private final @Nullable Input<PacketMirroringMirroredResourcesGetArgs> mirroredResources;

    public Input<PacketMirroringMirroredResourcesGetArgs> getMirroredResources() {
        return this.mirroredResources == null ? Input.empty() : this.mirroredResources;
    }

    /**
     * The name of the packet mirroring rule
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<PacketMirroringNetworkGetArgs> network;

    public Input<PacketMirroringNetworkGetArgs> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Since only one rule can be active at a time, priority is
     * used to break ties in the case of two rules that apply to
     * the same instances.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public PacketMirroringState(
        @Nullable Input<PacketMirroringCollectorIlbGetArgs> collectorIlb,
        @Nullable Input<String> description,
        @Nullable Input<PacketMirroringFilterGetArgs> filter,
        @Nullable Input<PacketMirroringMirroredResourcesGetArgs> mirroredResources,
        @Nullable Input<String> name,
        @Nullable Input<PacketMirroringNetworkGetArgs> network,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.collectorIlb = collectorIlb;
        this.description = description;
        this.filter = filter;
        this.mirroredResources = mirroredResources;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.project = project;
        this.region = region;
    }

    private PacketMirroringState() {
        this.collectorIlb = Input.empty();
        this.description = Input.empty();
        this.filter = Input.empty();
        this.mirroredResources = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PacketMirroringCollectorIlbGetArgs> collectorIlb;
        private @Nullable Input<String> description;
        private @Nullable Input<PacketMirroringFilterGetArgs> filter;
        private @Nullable Input<PacketMirroringMirroredResourcesGetArgs> mirroredResources;
        private @Nullable Input<String> name;
        private @Nullable Input<PacketMirroringNetworkGetArgs> network;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIlb = defaults.collectorIlb;
    	      this.description = defaults.description;
    	      this.filter = defaults.filter;
    	      this.mirroredResources = defaults.mirroredResources;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setCollectorIlb(@Nullable Input<PacketMirroringCollectorIlbGetArgs> collectorIlb) {
            this.collectorIlb = collectorIlb;
            return this;
        }

        public Builder setCollectorIlb(@Nullable PacketMirroringCollectorIlbGetArgs collectorIlb) {
            this.collectorIlb = Input.ofNullable(collectorIlb);
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

        public Builder setFilter(@Nullable Input<PacketMirroringFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable PacketMirroringFilterGetArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setMirroredResources(@Nullable Input<PacketMirroringMirroredResourcesGetArgs> mirroredResources) {
            this.mirroredResources = mirroredResources;
            return this;
        }

        public Builder setMirroredResources(@Nullable PacketMirroringMirroredResourcesGetArgs mirroredResources) {
            this.mirroredResources = Input.ofNullable(mirroredResources);
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

        public Builder setNetwork(@Nullable Input<PacketMirroringNetworkGetArgs> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable PacketMirroringNetworkGetArgs network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public PacketMirroringState build() {
            return new PacketMirroringState(collectorIlb, description, filter, mirroredResources, name, network, priority, project, region);
        }
    }
}
