// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetImageRecipeBlockDeviceMappingEb;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetImageRecipeBlockDeviceMapping {
    /**
     * Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    private final String deviceName;
    /**
     * Single list of object with Elastic Block Storage (EBS) block device mapping settings.
     * 
     */
    private final List<GetImageRecipeBlockDeviceMappingEb> ebs;
    /**
     * Whether to remove a mapping from the parent image.
     * 
     */
    private final String noDevice;
    /**
     * Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    private final String virtualName;

    @OutputCustomType.Constructor({"deviceName","ebs","noDevice","virtualName"})
    private GetImageRecipeBlockDeviceMapping(
        String deviceName,
        List<GetImageRecipeBlockDeviceMappingEb> ebs,
        String noDevice,
        String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName);
        this.ebs = Objects.requireNonNull(ebs);
        this.noDevice = Objects.requireNonNull(noDevice);
        this.virtualName = Objects.requireNonNull(virtualName);
    }

    /**
     * Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Single list of object with Elastic Block Storage (EBS) block device mapping settings.
     * 
     */
    public List<GetImageRecipeBlockDeviceMappingEb> getEbs() {
        return this.ebs;
    }
    /**
     * Whether to remove a mapping from the parent image.
     * 
     */
    public String getNoDevice() {
        return this.noDevice;
    }
    /**
     * Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    public String getVirtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private List<GetImageRecipeBlockDeviceMappingEb> ebs;
        private String noDevice;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipeBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setEbs(List<GetImageRecipeBlockDeviceMappingEb> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }

        public Builder setNoDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }

        public Builder setVirtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetImageRecipeBlockDeviceMapping build() {
            return new GetImageRecipeBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
