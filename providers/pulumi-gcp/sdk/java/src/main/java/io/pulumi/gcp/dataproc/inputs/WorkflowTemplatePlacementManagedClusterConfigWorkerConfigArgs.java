// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @InputImport(name="accelerators")
    private final @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> accelerators;

    public Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> getAccelerators() {
        return this.accelerators == null ? Input.empty() : this.accelerators;
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @InputImport(name="diskConfig")
    private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> diskConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> getDiskConfig() {
        return this.diskConfig == null ? Input.empty() : this.diskConfig;
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * - 
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
     */
    @InputImport(name="instanceNames")
    private final @Nullable Input<List<String>> instanceNames;

    public Input<List<String>> getInstanceNames() {
        return this.instanceNames == null ? Input.empty() : this.instanceNames;
    }

    /**
     * - 
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
     */
    @InputImport(name="isPreemptible")
    private final @Nullable Input<Boolean> isPreemptible;

    public Input<Boolean> getIsPreemptible() {
        return this.isPreemptible == null ? Input.empty() : this.isPreemptible;
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    @InputImport(name="managedGroupConfigs")
    private final @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs;

    public Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> getManagedGroupConfigs() {
        return this.managedGroupConfigs == null ? Input.empty() : this.managedGroupConfigs;
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    @InputImport(name="numInstances")
    private final @Nullable Input<Integer> numInstances;

    public Input<Integer> getNumInstances() {
        return this.numInstances == null ? Input.empty() : this.numInstances;
    }

    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    @InputImport(name="preemptibility")
    private final @Nullable Input<String> preemptibility;

    public Input<String> getPreemptibility() {
        return this.preemptibility == null ? Input.empty() : this.preemptibility;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs(
        @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> accelerators,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> diskConfig,
        @Nullable Input<String> image,
        @Nullable Input<List<String>> instanceNames,
        @Nullable Input<Boolean> isPreemptible,
        @Nullable Input<String> machineType,
        @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<Integer> numInstances,
        @Nullable Input<String> preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.image = image;
        this.instanceNames = instanceNames;
        this.isPreemptible = isPreemptible;
        this.machineType = machineType;
        this.managedGroupConfigs = managedGroupConfigs;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs() {
        this.accelerators = Input.empty();
        this.diskConfig = Input.empty();
        this.image = Input.empty();
        this.instanceNames = Input.empty();
        this.isPreemptible = Input.empty();
        this.machineType = Input.empty();
        this.managedGroupConfigs = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.numInstances = Input.empty();
        this.preemptibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> accelerators;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> diskConfig;
        private @Nullable Input<String> image;
        private @Nullable Input<List<String>> instanceNames;
        private @Nullable Input<Boolean> isPreemptible;
        private @Nullable Input<String> machineType;
        private @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<Integer> numInstances;
        private @Nullable Input<String> preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.image = defaults.image;
    	      this.instanceNames = defaults.instanceNames;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineType = defaults.machineType;
    	      this.managedGroupConfigs = defaults.managedGroupConfigs;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder setAccelerators(@Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        public Builder setAccelerators(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs> accelerators) {
            this.accelerators = Input.ofNullable(accelerators);
            return this;
        }

        public Builder setDiskConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }

        public Builder setDiskConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs diskConfig) {
            this.diskConfig = Input.ofNullable(diskConfig);
            return this;
        }

        public Builder setImage(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setInstanceNames(@Nullable Input<List<String>> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }

        public Builder setInstanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = Input.ofNullable(instanceNames);
            return this;
        }

        public Builder setIsPreemptible(@Nullable Input<Boolean> isPreemptible) {
            this.isPreemptible = isPreemptible;
            return this;
        }

        public Builder setIsPreemptible(@Nullable Boolean isPreemptible) {
            this.isPreemptible = Input.ofNullable(isPreemptible);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setManagedGroupConfigs(@Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs) {
            this.managedGroupConfigs = managedGroupConfigs;
            return this;
        }

        public Builder setManagedGroupConfigs(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs> managedGroupConfigs) {
            this.managedGroupConfigs = Input.ofNullable(managedGroupConfigs);
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder setNumInstances(@Nullable Input<Integer> numInstances) {
            this.numInstances = numInstances;
            return this;
        }

        public Builder setNumInstances(@Nullable Integer numInstances) {
            this.numInstances = Input.ofNullable(numInstances);
            return this;
        }

        public Builder setPreemptibility(@Nullable Input<String> preemptibility) {
            this.preemptibility = preemptibility;
            return this;
        }

        public Builder setPreemptibility(@Nullable String preemptibility) {
            this.preemptibility = Input.ofNullable(preemptibility);
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs(accelerators, diskConfig, image, instanceNames, isPreemptible, machineType, managedGroupConfigs, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
