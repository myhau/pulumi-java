// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs();

    /**
     * - 
     * Optional. Specifies whether the disk will be auto-deleted
     * when the instance is deleted (but not when the disk is
     * detached from the instance).
     * 
     */
    @InputImport(name="autoDelete")
    private final @Nullable Input<Boolean> autoDelete;

    public Input<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Input.empty() : this.autoDelete;
    }

    /**
     * - 
     * Optional. Indicates that this is a boot disk. The virtual
     * machine will use the first partition of the disk for its
     * root filesystem.
     * 
     */
    @InputImport(name="boot")
    private final @Nullable Input<Boolean> boot;

    public Input<Boolean> getBoot() {
        return this.boot == null ? Input.empty() : this.boot;
    }

    /**
     * - 
     * Optional. Specifies a unique device name of your choice
     * that is reflected into the /dev/disk/by-id/google-* tree
     * of a Linux operating system running within the instance.
     * This name can be used to reference the device for mounting,
     * resizing, and so on, from within the instance.
     * If not specified, the server chooses a default device name
     * to apply to this disk, in the form persistent-disk-x, where
     * x is a number assigned by Google Compute Engine. This field
     * is only applicable for persistent disks.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * - 
     * Indicates a list of features to enable on the guest operating
     * system. Applicable only for bootable images. To see a list of
     * available features, read `https://cloud.google.com/compute/docs/
     * images/create-delete-deprecate-private-images#guest-os-features`
     * options. ``
     * 
     */
    @InputImport(name="guestOsFeatures")
    private final @Nullable Input<List<String>> guestOsFeatures;

    public Input<List<String>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Input.empty() : this.guestOsFeatures;
    }

    /**
     * - 
     * Output only. A zero-based index to this disk, where 0 is
     * reserved for the boot disk. If you have many disks attached
     * to an instance, each disk would have a unique index number.
     * 
     */
    @InputImport(name="index")
    private final @Nullable Input<Integer> index;

    public Input<Integer> getIndex() {
        return this.index == null ? Input.empty() : this.index;
    }

    /**
     * Input only. Specifies the parameters for a new disk that will
     * be created alongside the new instance. Use initialization
     * parameters to create boot disks or local SSDs attached to the
     * new instance. This property is mutually exclusive with the
     * source property; you can only define one or the other, but not
     * both.
     * Structure is documented below.
     * 
     */
    @InputImport(name="initializeParams")
    private final @Nullable Input<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs> initializeParams;

    public Input<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs> getInitializeParams() {
        return this.initializeParams == null ? Input.empty() : this.initializeParams;
    }

    /**
     * "Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent
     * disks must always use SCSI and the request will fail if you attempt
     * to attach a persistent disk in any other format than SCSI. Local SSDs
     * can use either NVME or SCSI. For performance characteristics of SCSI
     * over NVMe, see Local SSD performance. Valid values: * NVME * SCSI".
     * 
     */
    @InputImport(name="interface")
    private final @Nullable Input<String> $interface;

    public Input<String> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    /**
     * - 
     * Type of the resource. Always compute#attachedDisk for attached
     * disks.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * - 
     * Output only. Any valid publicly visible licenses.
     * 
     */
    @InputImport(name="licenses")
    private final @Nullable Input<List<String>> licenses;

    public Input<List<String>> getLicenses() {
        return this.licenses == null ? Input.empty() : this.licenses;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If not specified, the default is to attach
     * the disk in READ_WRITE mode.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Specifies a valid partial or full URL to an existing
     * Persistent Disk resource.
     * 
     */
    @InputImport(name="source")
    private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs(
        @Nullable Input<Boolean> autoDelete,
        @Nullable Input<Boolean> boot,
        @Nullable Input<String> deviceName,
        @Nullable Input<List<String>> guestOsFeatures,
        @Nullable Input<Integer> index,
        @Nullable Input<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs> initializeParams,
        @Nullable Input<String> $interface,
        @Nullable Input<String> kind,
        @Nullable Input<List<String>> licenses,
        @Nullable Input<String> mode,
        @Nullable Input<String> source,
        @Nullable Input<String> type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.initializeParams = initializeParams;
        this.$interface = $interface;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    private RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs() {
        this.autoDelete = Input.empty();
        this.boot = Input.empty();
        this.deviceName = Input.empty();
        this.guestOsFeatures = Input.empty();
        this.index = Input.empty();
        this.initializeParams = Input.empty();
        this.$interface = Input.empty();
        this.kind = Input.empty();
        this.licenses = Input.empty();
        this.mode = Input.empty();
        this.source = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoDelete;
        private @Nullable Input<Boolean> boot;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<List<String>> guestOsFeatures;
        private @Nullable Input<Integer> index;
        private @Nullable Input<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs> initializeParams;
        private @Nullable Input<String> $interface;
        private @Nullable Input<String> kind;
        private @Nullable Input<List<String>> licenses;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> source;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.$interface = defaults.$interface;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setAutoDelete(@Nullable Input<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder setAutoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Input.ofNullable(autoDelete);
            return this;
        }

        public Builder setBoot(@Nullable Input<Boolean> boot) {
            this.boot = boot;
            return this;
        }

        public Builder setBoot(@Nullable Boolean boot) {
            this.boot = Input.ofNullable(boot);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setGuestOsFeatures(@Nullable Input<List<String>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }

        public Builder setGuestOsFeatures(@Nullable List<String> guestOsFeatures) {
            this.guestOsFeatures = Input.ofNullable(guestOsFeatures);
            return this;
        }

        public Builder setIndex(@Nullable Input<Integer> index) {
            this.index = index;
            return this;
        }

        public Builder setIndex(@Nullable Integer index) {
            this.index = Input.ofNullable(index);
            return this;
        }

        public Builder setInitializeParams(@Nullable Input<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }

        public Builder setInitializeParams(@Nullable RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsGetArgs initializeParams) {
            this.initializeParams = Input.ofNullable(initializeParams);
            return this;
        }

        public Builder set$interface(@Nullable Input<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLicenses(@Nullable Input<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }

        public Builder setLicenses(@Nullable List<String> licenses) {
            this.licenses = Input.ofNullable(licenses);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs(autoDelete, boot, deviceName, guestOsFeatures, index, initializeParams, $interface, kind, licenses, mode, source, type);
        }
    }
}
