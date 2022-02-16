// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.tpu.inputs.NodeSchedulingConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeArgs Empty = new NodeArgs();

    @InputImport(name="acceleratorType", required=true)
    private final Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType;
    }

    @InputImport(name="cidrBlock")
    private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="schedulingConfig")
    private final @Nullable Input<NodeSchedulingConfigArgs> schedulingConfig;

    public Input<NodeSchedulingConfigArgs> getSchedulingConfig() {
        return this.schedulingConfig == null ? Input.empty() : this.schedulingConfig;
    }

    @InputImport(name="tensorflowVersion", required=true)
    private final Input<String> tensorflowVersion;

    public Input<String> getTensorflowVersion() {
        return this.tensorflowVersion;
    }

    @InputImport(name="useServiceNetworking")
    private final @Nullable Input<Boolean> useServiceNetworking;

    public Input<Boolean> getUseServiceNetworking() {
        return this.useServiceNetworking == null ? Input.empty() : this.useServiceNetworking;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public NodeArgs(
        Input<String> acceleratorType,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<NodeSchedulingConfigArgs> schedulingConfig,
        Input<String> tensorflowVersion,
        @Nullable Input<Boolean> useServiceNetworking,
        @Nullable Input<String> zone) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
        this.cidrBlock = cidrBlock;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.project = project;
        this.schedulingConfig = schedulingConfig;
        this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion, "expected parameter 'tensorflowVersion' to be non-null");
        this.useServiceNetworking = useServiceNetworking;
        this.zone = zone;
    }

    private NodeArgs() {
        this.acceleratorType = Input.empty();
        this.cidrBlock = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.schedulingConfig = Input.empty();
        this.tensorflowVersion = Input.empty();
        this.useServiceNetworking = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> acceleratorType;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<NodeSchedulingConfigArgs> schedulingConfig;
        private Input<String> tensorflowVersion;
        private @Nullable Input<Boolean> useServiceNetworking;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.tensorflowVersion = defaults.tensorflowVersion;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
    	      this.zone = defaults.zone;
        }

        public Builder setAcceleratorType(Input<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Input.of(Objects.requireNonNull(acceleratorType));
            return this;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
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

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
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

        public Builder setSchedulingConfig(@Nullable Input<NodeSchedulingConfigArgs> schedulingConfig) {
            this.schedulingConfig = schedulingConfig;
            return this;
        }

        public Builder setSchedulingConfig(@Nullable NodeSchedulingConfigArgs schedulingConfig) {
            this.schedulingConfig = Input.ofNullable(schedulingConfig);
            return this;
        }

        public Builder setTensorflowVersion(Input<String> tensorflowVersion) {
            this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion);
            return this;
        }

        public Builder setTensorflowVersion(String tensorflowVersion) {
            this.tensorflowVersion = Input.of(Objects.requireNonNull(tensorflowVersion));
            return this;
        }

        public Builder setUseServiceNetworking(@Nullable Input<Boolean> useServiceNetworking) {
            this.useServiceNetworking = useServiceNetworking;
            return this;
        }

        public Builder setUseServiceNetworking(@Nullable Boolean useServiceNetworking) {
            this.useServiceNetworking = Input.ofNullable(useServiceNetworking);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public NodeArgs build() {
            return new NodeArgs(acceleratorType, cidrBlock, description, labels, name, network, project, schedulingConfig, tensorflowVersion, useServiceNetworking, zone);
        }
    }
}