// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetRequestLaunchSpecificationRootBlockDevice {
    private final @Nullable Boolean deleteOnTermination;
    private final @Nullable Boolean encrypted;
    private final @Nullable Integer iops;
    private final @Nullable String kmsKeyId;
    private final @Nullable Integer throughput;
    private final @Nullable Integer volumeSize;
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor({"deleteOnTermination","encrypted","iops","kmsKeyId","throughput","volumeSize","volumeType"})
    private SpotFleetRequestLaunchSpecificationRootBlockDevice(
        @Nullable Boolean deleteOnTermination,
        @Nullable Boolean encrypted,
        @Nullable Integer iops,
        @Nullable String kmsKeyId,
        @Nullable Integer throughput,
        @Nullable Integer volumeSize,
        @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecificationRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchSpecificationRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
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

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = throughput;
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
        public SpotFleetRequestLaunchSpecificationRootBlockDevice build() {
            return new SpotFleetRequestLaunchSpecificationRootBlockDevice(deleteOnTermination, encrypted, iops, kmsKeyId, throughput, volumeSize, volumeType);
        }
    }
}
