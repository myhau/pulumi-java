// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceEphemeralBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceEphemeralBlockDeviceGetArgs Empty = new InstanceEphemeralBlockDeviceGetArgs();

    /**
     * The name of the block device to mount on the instance.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
     */
    @InputImport(name="noDevice")
      private final @Nullable Input<Boolean> noDevice;

    public Input<Boolean> getNoDevice() {
        return this.noDevice == null ? Input.empty() : this.noDevice;
    }

    /**
     * [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
     * 
     */
    @InputImport(name="virtualName")
      private final @Nullable Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName == null ? Input.empty() : this.virtualName;
    }

    public InstanceEphemeralBlockDeviceGetArgs(
        Input<String> deviceName,
        @Nullable Input<Boolean> noDevice,
        @Nullable Input<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private InstanceEphemeralBlockDeviceGetArgs() {
        this.deviceName = Input.empty();
        this.noDevice = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEphemeralBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private @Nullable Input<Boolean> noDevice;
        private @Nullable Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceEphemeralBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setNoDevice(@Nullable Input<Boolean> noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setNoDevice(@Nullable Boolean noDevice) {
            this.noDevice = Input.ofNullable(noDevice);
            return this;
        }

        public Builder setVirtualName(@Nullable Input<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = Input.ofNullable(virtualName);
            return this;
        }
        public InstanceEphemeralBlockDeviceGetArgs build() {
            return new InstanceEphemeralBlockDeviceGetArgs(deviceName, noDevice, virtualName);
        }
    }
}
