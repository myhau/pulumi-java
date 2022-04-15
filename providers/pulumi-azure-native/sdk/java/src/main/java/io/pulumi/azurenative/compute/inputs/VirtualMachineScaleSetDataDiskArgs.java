// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.DiskCreateOptionTypes;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set data disk.
 * 
 */
public final class VirtualMachineScaleSetDataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetDataDiskArgs Empty = new VirtualMachineScaleSetDataDiskArgs();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @Import(name="caching")
      private final @Nullable Output<CachingTypes> caching;

    public Output<CachingTypes> caching() {
        return this.caching == null ? Codegen.empty() : this.caching;
    }

    /**
     * The create option.
     * 
     */
    @Import(name="createOption", required=true)
      private final Output<Either<String,DiskCreateOptionTypes>> createOption;

    public Output<Either<String,DiskCreateOptionTypes>> createOption() {
        return this.createOption;
    }

    /**
     * Specifies the Read-Write IOPS for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    @Import(name="diskIOPSReadWrite")
      private final @Nullable Output<Double> diskIOPSReadWrite;

    public Output<Double> diskIOPSReadWrite() {
        return this.diskIOPSReadWrite == null ? Codegen.empty() : this.diskIOPSReadWrite;
    }

    /**
     * Specifies the bandwidth in MB per second for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    @Import(name="diskMBpsReadWrite")
      private final @Nullable Output<Double> diskMBpsReadWrite;

    public Output<Double> diskMBpsReadWrite() {
        return this.diskMBpsReadWrite == null ? Codegen.empty() : this.diskMBpsReadWrite;
    }

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
      private final @Nullable Output<Integer> diskSizeGB;

    public Output<Integer> diskSizeGB() {
        return this.diskSizeGB == null ? Codegen.empty() : this.diskSizeGB;
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @Import(name="lun", required=true)
      private final Output<Integer> lun;

    public Output<Integer> lun() {
        return this.lun;
    }

    /**
     * The managed disk parameters.
     * 
     */
    @Import(name="managedDisk")
      private final @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;

    public Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk() {
        return this.managedDisk == null ? Codegen.empty() : this.managedDisk;
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
      private final @Nullable Output<Boolean> writeAcceleratorEnabled;

    public Output<Boolean> writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Codegen.empty() : this.writeAcceleratorEnabled;
    }

    public VirtualMachineScaleSetDataDiskArgs(
        @Nullable Output<CachingTypes> caching,
        Output<Either<String,DiskCreateOptionTypes>> createOption,
        @Nullable Output<Double> diskIOPSReadWrite,
        @Nullable Output<Double> diskMBpsReadWrite,
        @Nullable Output<Integer> diskSizeGB,
        Output<Integer> lun,
        @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.name = name;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private VirtualMachineScaleSetDataDiskArgs() {
        this.caching = Codegen.empty();
        this.createOption = Codegen.empty();
        this.diskIOPSReadWrite = Codegen.empty();
        this.diskMBpsReadWrite = Codegen.empty();
        this.diskSizeGB = Codegen.empty();
        this.lun = Codegen.empty();
        this.managedDisk = Codegen.empty();
        this.name = Codegen.empty();
        this.writeAcceleratorEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CachingTypes> caching;
        private Output<Either<String,DiskCreateOptionTypes>> createOption;
        private @Nullable Output<Double> diskIOPSReadWrite;
        private @Nullable Output<Double> diskMBpsReadWrite;
        private @Nullable Output<Integer> diskSizeGB;
        private Output<Integer> lun;
        private @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetDataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable Output<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }
        public Builder caching(@Nullable CachingTypes caching) {
            this.caching = Codegen.ofNullable(caching);
            return this;
        }
        public Builder createOption(Output<Either<String,DiskCreateOptionTypes>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder createOption(Either<String,DiskCreateOptionTypes> createOption) {
            this.createOption = Output.of(Objects.requireNonNull(createOption));
            return this;
        }
        public Builder diskIOPSReadWrite(@Nullable Output<Double> diskIOPSReadWrite) {
            this.diskIOPSReadWrite = diskIOPSReadWrite;
            return this;
        }
        public Builder diskIOPSReadWrite(@Nullable Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = Codegen.ofNullable(diskIOPSReadWrite);
            return this;
        }
        public Builder diskMBpsReadWrite(@Nullable Output<Double> diskMBpsReadWrite) {
            this.diskMBpsReadWrite = diskMBpsReadWrite;
            return this;
        }
        public Builder diskMBpsReadWrite(@Nullable Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = Codegen.ofNullable(diskMBpsReadWrite);
            return this;
        }
        public Builder diskSizeGB(@Nullable Output<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Codegen.ofNullable(diskSizeGB);
            return this;
        }
        public Builder lun(Output<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public Builder lun(Integer lun) {
            this.lun = Output.of(Objects.requireNonNull(lun));
            return this;
        }
        public Builder managedDisk(@Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder managedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersArgs managedDisk) {
            this.managedDisk = Codegen.ofNullable(managedDisk);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = Codegen.ofNullable(writeAcceleratorEnabled);
            return this;
        }        public VirtualMachineScaleSetDataDiskArgs build() {
            return new VirtualMachineScaleSetDataDiskArgs(caching, createOption, diskIOPSReadWrite, diskMBpsReadWrite, diskSizeGB, lun, managedDisk, name, writeAcceleratorEnabled);
        }
    }
}
