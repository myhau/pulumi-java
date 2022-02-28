// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchConfigurationEbsBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationEbsBlockDeviceGetArgs Empty = new LaunchConfigurationEbsBlockDeviceGetArgs();

    @InputImport(name="deleteOnTermination")
      private final @Nullable Input<Boolean> deleteOnTermination;

    public Input<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Input.empty() : this.deleteOnTermination;
    }

    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="encrypted")
      private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    @InputImport(name="noDevice")
      private final @Nullable Input<Boolean> noDevice;

    public Input<Boolean> getNoDevice() {
        return this.noDevice == null ? Input.empty() : this.noDevice;
    }

    @InputImport(name="snapshotId")
      private final @Nullable Input<String> snapshotId;

    public Input<String> getSnapshotId() {
        return this.snapshotId == null ? Input.empty() : this.snapshotId;
    }

    @InputImport(name="throughput")
      private final @Nullable Input<Integer> throughput;

    public Input<Integer> getThroughput() {
        return this.throughput == null ? Input.empty() : this.throughput;
    }

    @InputImport(name="volumeSize")
      private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    @InputImport(name="volumeType")
      private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public LaunchConfigurationEbsBlockDeviceGetArgs(
        @Nullable Input<Boolean> deleteOnTermination,
        Input<String> deviceName,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Integer> iops,
        @Nullable Input<Boolean> noDevice,
        @Nullable Input<String> snapshotId,
        @Nullable Input<Integer> throughput,
        @Nullable Input<Integer> volumeSize,
        @Nullable Input<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encrypted = encrypted;
        this.iops = iops;
        this.noDevice = noDevice;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private LaunchConfigurationEbsBlockDeviceGetArgs() {
        this.deleteOnTermination = Input.empty();
        this.deviceName = Input.empty();
        this.encrypted = Input.empty();
        this.iops = Input.empty();
        this.noDevice = Input.empty();
        this.snapshotId = Input.empty();
        this.throughput = Input.empty();
        this.volumeSize = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationEbsBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteOnTermination;
        private Input<String> deviceName;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<Boolean> noDevice;
        private @Nullable Input<String> snapshotId;
        private @Nullable Input<Integer> throughput;
        private @Nullable Input<Integer> volumeSize;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationEbsBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.noDevice = defaults.noDevice;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(@Nullable Input<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Input.ofNullable(deleteOnTermination);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setEncrypted(@Nullable Input<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = Input.ofNullable(encrypted);
            return this;
        }

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
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

        public Builder setSnapshotId(@Nullable Input<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = Input.ofNullable(snapshotId);
            return this;
        }

        public Builder setThroughput(@Nullable Input<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = Input.ofNullable(throughput);
            return this;
        }

        public Builder setVolumeSize(@Nullable Input<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Input.ofNullable(volumeSize);
            return this;
        }

        public Builder setVolumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public LaunchConfigurationEbsBlockDeviceGetArgs build() {
            return new LaunchConfigurationEbsBlockDeviceGetArgs(deleteOnTermination, deviceName, encrypted, iops, noDevice, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
