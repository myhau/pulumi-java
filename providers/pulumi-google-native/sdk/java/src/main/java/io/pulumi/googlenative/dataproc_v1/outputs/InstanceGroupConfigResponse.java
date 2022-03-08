// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.DiskConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.InstanceReferenceResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.ManagedGroupConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupConfigResponse {
    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    private final List<AcceleratorConfigResponse> accelerators;
    /**
     * Optional. Disk option config settings.
     * 
     */
    private final DiskConfigResponse diskConfig;
    /**
     * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    private final String imageUri;
    /**
     * The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group.
     * 
     */
    private final List<String> instanceNames;
    /**
     * List of references to Compute Engine instances.
     * 
     */
    private final List<InstanceReferenceResponse> instanceReferences;
    /**
     * Specifies that this instance group contains preemptible instances.
     * 
     */
    private final Boolean isPreemptible;
    /**
     * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    private final String machineTypeUri;
    /**
     * The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    private final ManagedGroupConfigResponse managedGroupConfig;
    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    private final String minCpuPlatform;
    /**
     * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    private final Integer numInstances;
    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    private final String preemptibility;

    @OutputCustomType.Constructor({"accelerators","diskConfig","imageUri","instanceNames","instanceReferences","isPreemptible","machineTypeUri","managedGroupConfig","minCpuPlatform","numInstances","preemptibility"})
    private InstanceGroupConfigResponse(
        List<AcceleratorConfigResponse> accelerators,
        DiskConfigResponse diskConfig,
        String imageUri,
        List<String> instanceNames,
        List<InstanceReferenceResponse> instanceReferences,
        Boolean isPreemptible,
        String machineTypeUri,
        ManagedGroupConfigResponse managedGroupConfig,
        String minCpuPlatform,
        Integer numInstances,
        String preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.instanceNames = instanceNames;
        this.instanceReferences = instanceReferences;
        this.isPreemptible = isPreemptible;
        this.machineTypeUri = machineTypeUri;
        this.managedGroupConfig = managedGroupConfig;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
    */
    public List<AcceleratorConfigResponse> getAccelerators() {
        return this.accelerators;
    }
    /**
     * Optional. Disk option config settings.
     * 
    */
    public DiskConfigResponse getDiskConfig() {
        return this.diskConfig;
    }
    /**
     * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
    */
    public String getImageUri() {
        return this.imageUri;
    }
    /**
     * The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group.
     * 
    */
    public List<String> getInstanceNames() {
        return this.instanceNames;
    }
    /**
     * List of references to Compute Engine instances.
     * 
    */
    public List<InstanceReferenceResponse> getInstanceReferences() {
        return this.instanceReferences;
    }
    /**
     * Specifies that this instance group contains preemptible instances.
     * 
    */
    public Boolean getIsPreemptible() {
        return this.isPreemptible;
    }
    /**
     * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
    */
    public String getMachineTypeUri() {
        return this.machineTypeUri;
    }
    /**
     * The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
    */
    public ManagedGroupConfigResponse getManagedGroupConfig() {
        return this.managedGroupConfig;
    }
    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
    */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
    */
    public Integer getNumInstances() {
        return this.numInstances;
    }
    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
    */
    public String getPreemptibility() {
        return this.preemptibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private DiskConfigResponse diskConfig;
        private String imageUri;
        private List<String> instanceNames;
        private List<InstanceReferenceResponse> instanceReferences;
        private Boolean isPreemptible;
        private String machineTypeUri;
        private ManagedGroupConfigResponse managedGroupConfig;
        private String minCpuPlatform;
        private Integer numInstances;
        private String preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.instanceNames = defaults.instanceNames;
    	      this.instanceReferences = defaults.instanceReferences;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineTypeUri = defaults.machineTypeUri;
    	      this.managedGroupConfig = defaults.managedGroupConfig;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder setAccelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }

        public Builder setDiskConfig(DiskConfigResponse diskConfig) {
            this.diskConfig = Objects.requireNonNull(diskConfig);
            return this;
        }

        public Builder setImageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder setInstanceNames(List<String> instanceNames) {
            this.instanceNames = Objects.requireNonNull(instanceNames);
            return this;
        }

        public Builder setInstanceReferences(List<InstanceReferenceResponse> instanceReferences) {
            this.instanceReferences = Objects.requireNonNull(instanceReferences);
            return this;
        }

        public Builder setIsPreemptible(Boolean isPreemptible) {
            this.isPreemptible = Objects.requireNonNull(isPreemptible);
            return this;
        }

        public Builder setMachineTypeUri(String machineTypeUri) {
            this.machineTypeUri = Objects.requireNonNull(machineTypeUri);
            return this;
        }

        public Builder setManagedGroupConfig(ManagedGroupConfigResponse managedGroupConfig) {
            this.managedGroupConfig = Objects.requireNonNull(managedGroupConfig);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNumInstances(Integer numInstances) {
            this.numInstances = Objects.requireNonNull(numInstances);
            return this;
        }

        public Builder setPreemptibility(String preemptibility) {
            this.preemptibility = Objects.requireNonNull(preemptibility);
            return this;
        }
        public InstanceGroupConfigResponse build() {
            return new InstanceGroupConfigResponse(accelerators, diskConfig, imageUri, instanceNames, instanceReferences, isPreemptible, machineTypeUri, managedGroupConfig, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
