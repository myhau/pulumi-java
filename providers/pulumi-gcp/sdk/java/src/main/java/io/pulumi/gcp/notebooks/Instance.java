// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.InstanceArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceState;
import io.pulumi.gcp.notebooks.outputs.InstanceAcceleratorConfig;
import io.pulumi.gcp.notebooks.outputs.InstanceContainerImage;
import io.pulumi.gcp.notebooks.outputs.InstanceReservationAffinity;
import io.pulumi.gcp.notebooks.outputs.InstanceShieldedInstanceConfig;
import io.pulumi.gcp.notebooks.outputs.InstanceVmImage;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:notebooks/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    @OutputExport(name="acceleratorConfig", type=InstanceAcceleratorConfig.class, parameters={})
    private Output</* @Nullable */ InstanceAcceleratorConfig> acceleratorConfig;

    public Output</* @Nullable */ InstanceAcceleratorConfig> getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    @OutputExport(name="bootDiskSizeGb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> bootDiskSizeGb;

    public Output</* @Nullable */ Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    @OutputExport(name="bootDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> bootDiskType;

    public Output</* @Nullable */ String> getBootDiskType() {
        return this.bootDiskType;
    }
    @OutputExport(name="containerImage", type=InstanceContainerImage.class, parameters={})
    private Output</* @Nullable */ InstanceContainerImage> containerImage;

    public Output</* @Nullable */ InstanceContainerImage> getContainerImage() {
        return this.containerImage;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="customGpuDriverPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> customGpuDriverPath;

    public Output</* @Nullable */ String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath;
    }
    @OutputExport(name="dataDiskSizeGb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dataDiskSizeGb;

    public Output</* @Nullable */ Integer> getDataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    @OutputExport(name="dataDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataDiskType;

    public Output</* @Nullable */ String> getDataDiskType() {
        return this.dataDiskType;
    }
    @OutputExport(name="diskEncryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskEncryption;

    public Output</* @Nullable */ String> getDiskEncryption() {
        return this.diskEncryption;
    }
    @OutputExport(name="installGpuDriver", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> installGpuDriver;

    public Output</* @Nullable */ Boolean> getInstallGpuDriver() {
        return this.installGpuDriver;
    }
    @OutputExport(name="instanceOwners", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> instanceOwners;

    public Output</* @Nullable */ List<String>> getInstanceOwners() {
        return this.instanceOwners;
    }
    @OutputExport(name="kmsKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKey;

    public Output</* @Nullable */ String> getKmsKey() {
        return this.kmsKey;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType;
    }
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    public Output<String> getNetwork() {
        return this.network;
    }
    @OutputExport(name="nicType", type=String.class, parameters={})
    private Output</* @Nullable */ String> nicType;

    public Output</* @Nullable */ String> getNicType() {
        return this.nicType;
    }
    @OutputExport(name="noProxyAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noProxyAccess;

    public Output</* @Nullable */ Boolean> getNoProxyAccess() {
        return this.noProxyAccess;
    }
    @OutputExport(name="noPublicIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noPublicIp;

    public Output</* @Nullable */ Boolean> getNoPublicIp() {
        return this.noPublicIp;
    }
    @OutputExport(name="noRemoveDataDisk", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noRemoveDataDisk;

    public Output</* @Nullable */ Boolean> getNoRemoveDataDisk() {
        return this.noRemoveDataDisk;
    }
    @OutputExport(name="postStartupScript", type=String.class, parameters={})
    private Output</* @Nullable */ String> postStartupScript;

    public Output</* @Nullable */ String> getPostStartupScript() {
        return this.postStartupScript;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="proxyUri", type=String.class, parameters={})
    private Output<String> proxyUri;

    public Output<String> getProxyUri() {
        return this.proxyUri;
    }
    @OutputExport(name="reservationAffinity", type=InstanceReservationAffinity.class, parameters={})
    private Output</* @Nullable */ InstanceReservationAffinity> reservationAffinity;

    public Output</* @Nullable */ InstanceReservationAffinity> getReservationAffinity() {
        return this.reservationAffinity;
    }
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    @OutputExport(name="serviceAccountScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> serviceAccountScopes;

    public Output</* @Nullable */ List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes;
    }
    @OutputExport(name="shieldedInstanceConfig", type=InstanceShieldedInstanceConfig.class, parameters={})
    private Output<InstanceShieldedInstanceConfig> shieldedInstanceConfig;

    public Output<InstanceShieldedInstanceConfig> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="subnet", type=String.class, parameters={})
    private Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet;
    }
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    public Output</* @Nullable */ List<String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    @OutputExport(name="vmImage", type=InstanceVmImage.class, parameters={})
    private Output</* @Nullable */ InstanceVmImage> vmImage;

    public Output</* @Nullable */ InstanceVmImage> getVmImage() {
        return this.vmImage;
    }

    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}