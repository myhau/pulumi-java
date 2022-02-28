// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceRootBlockDevice {
    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * Name of the device to mount.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * Whether to enable volume encryption. Defaults to `false`. Must be configured to perform drift detection.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * A map of tags to assign to the device.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * ID of the volume. For example, the ID can be accessed like this, `aws_instance.web.root_block_device.0.volume_id`.
     * 
     */
    private final @Nullable String volumeId;
    /**
     * Size of the volume in gibibytes (GiB).
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor({"deleteOnTermination","deviceName","encrypted","iops","kmsKeyId","tags","throughput","volumeId","volumeSize","volumeType"})
    private InstanceRootBlockDevice(
        @Nullable Boolean deleteOnTermination,
        @Nullable String deviceName,
        @Nullable Boolean encrypted,
        @Nullable Integer iops,
        @Nullable String kmsKeyId,
        @Nullable Map<String,String> tags,
        @Nullable Integer throughput,
        @Nullable String volumeId,
        @Nullable Integer volumeSize,
        @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Name of the device to mount.
     * 
     */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * Whether to enable volume encryption. Defaults to `false`. Must be configured to perform drift detection.
     * 
     */
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * A map of tags to assign to the device.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * ID of the volume. For example, the ID can be accessed like this, `aws_instance.web.root_block_device.0.volume_id`.
     * 
     */
    public Optional<String> getVolumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    /**
     * Size of the volume in gibibytes (GiB).
     * 
     */
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable String deviceName;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer throughput;
        private @Nullable String volumeId;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setVolumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public InstanceRootBlockDevice build() {
            return new InstanceRootBlockDevice(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}
