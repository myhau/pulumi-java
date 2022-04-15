// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DiffDiskSettingsResponse;
import io.pulumi.azurenative.compute.outputs.VirtualHardDiskResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetManagedDiskParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetOSDiskResponse {
    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    private final @Nullable String caching;
    /**
     * Specifies how the virtual machines in the scale set should be created.<br><br> The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    private final String createOption;
    /**
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
     */
    private final @Nullable DiffDiskSettingsResponse diffDiskSettings;
    /**
     * Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * Specifies information about the unmanaged user image to base the scale set on.
     * 
     */
    private final @Nullable VirtualHardDiskResponse image;
    /**
     * The managed disk parameters.
     * 
     */
    private final @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
    /**
     * The disk name.
     * 
     */
    private final @Nullable String name;
    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    private final @Nullable String osType;
    /**
     * Specifies the container urls that are used to store operating system disks for the scale set.
     * 
     */
    private final @Nullable List<String> vhdContainers;
    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    private final @Nullable Boolean writeAcceleratorEnabled;

    @CustomType.Constructor
    private VirtualMachineScaleSetOSDiskResponse(
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("createOption") String createOption,
        @CustomType.Parameter("diffDiskSettings") @Nullable DiffDiskSettingsResponse diffDiskSettings,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("image") @Nullable VirtualHardDiskResponse image,
        @CustomType.Parameter("managedDisk") @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("vhdContainers") @Nullable List<String> vhdContainers,
        @CustomType.Parameter("writeAcceleratorEnabled") @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = createOption;
        this.diffDiskSettings = diffDiskSettings;
        this.diskSizeGB = diskSizeGB;
        this.image = image;
        this.managedDisk = managedDisk;
        this.name = name;
        this.osType = osType;
        this.vhdContainers = vhdContainers;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
    */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * Specifies how the virtual machines in the scale set should be created.<br><br> The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
    */
    public String createOption() {
        return this.createOption;
    }
    /**
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
    */
    public Optional<DiffDiskSettingsResponse> diffDiskSettings() {
        return Optional.ofNullable(this.diffDiskSettings);
    }
    /**
     * Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
    */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * Specifies information about the unmanaged user image to base the scale set on.
     * 
    */
    public Optional<VirtualHardDiskResponse> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * The managed disk parameters.
     * 
    */
    public Optional<VirtualMachineScaleSetManagedDiskParametersResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * The disk name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
    */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * Specifies the container urls that are used to store operating system disks for the scale set.
     * 
    */
    public List<String> vhdContainers() {
        return this.vhdContainers == null ? List.of() : this.vhdContainers;
    }
    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
    */
    public Optional<Boolean> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable DiffDiskSettingsResponse diffDiskSettings;
        private @Nullable Integer diskSizeGB;
        private @Nullable VirtualHardDiskResponse image;
        private @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable List<String> vhdContainers;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetOSDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diffDiskSettings = defaults.diffDiskSettings;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.image = defaults.image;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.vhdContainers = defaults.vhdContainers;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        public Builder createOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder diffDiskSettings(@Nullable DiffDiskSettingsResponse diffDiskSettings) {
            this.diffDiskSettings = diffDiskSettings;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder image(@Nullable VirtualHardDiskResponse image) {
            this.image = image;
            return this;
        }
        public Builder managedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder vhdContainers(@Nullable List<String> vhdContainers) {
            this.vhdContainers = vhdContainers;
            return this;
        }
        public Builder vhdContainers(String... vhdContainers) {
            return vhdContainers(List.of(vhdContainers));
        }
        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }        public VirtualMachineScaleSetOSDiskResponse build() {
            return new VirtualMachineScaleSetOSDiskResponse(caching, createOption, diffDiskSettings, diskSizeGB, image, managedDisk, name, osType, vhdContainers, writeAcceleratorEnabled);
        }
    }
}
