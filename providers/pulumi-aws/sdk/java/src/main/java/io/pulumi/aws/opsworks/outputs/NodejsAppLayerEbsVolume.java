// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodejsAppLayerEbsVolume {
    private final @Nullable Boolean encrypted;
    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * The path to mount the EBS volume on the layer's instances.
     * 
     */
    private final String mountPoint;
    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    private final Integer numberOfDisks;
    /**
     * The RAID level to use for the volume.
     * 
     */
    private final @Nullable String raidLevel;
    /**
     * The size of the volume in gigabytes.
     * 
     */
    private final Integer size;
    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"encrypted","iops","mountPoint","numberOfDisks","raidLevel","size","type"})
    private NodejsAppLayerEbsVolume(
        @Nullable Boolean encrypted,
        @Nullable Integer iops,
        String mountPoint,
        Integer numberOfDisks,
        @Nullable String raidLevel,
        Integer size,
        @Nullable String type) {
        this.encrypted = encrypted;
        this.iops = iops;
        this.mountPoint = Objects.requireNonNull(mountPoint);
        this.numberOfDisks = Objects.requireNonNull(numberOfDisks);
        this.raidLevel = raidLevel;
        this.size = Objects.requireNonNull(size);
        this.type = type;
    }

    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * The path to mount the EBS volume on the layer's instances.
     * 
     */
    public String getMountPoint() {
        return this.mountPoint;
    }
    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    public Integer getNumberOfDisks() {
        return this.numberOfDisks;
    }
    /**
     * The RAID level to use for the volume.
     * 
     */
    public Optional<String> getRaidLevel() {
        return Optional.ofNullable(this.raidLevel);
    }
    /**
     * The size of the volume in gigabytes.
     * 
     */
    public Integer getSize() {
        return this.size;
    }
    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodejsAppLayerEbsVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private String mountPoint;
        private Integer numberOfDisks;
        private @Nullable String raidLevel;
        private Integer size;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodejsAppLayerEbsVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.mountPoint = defaults.mountPoint;
    	      this.numberOfDisks = defaults.numberOfDisks;
    	      this.raidLevel = defaults.raidLevel;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setMountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder setNumberOfDisks(Integer numberOfDisks) {
            this.numberOfDisks = Objects.requireNonNull(numberOfDisks);
            return this;
        }

        public Builder setRaidLevel(@Nullable String raidLevel) {
            this.raidLevel = raidLevel;
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public NodejsAppLayerEbsVolume build() {
            return new NodejsAppLayerEbsVolume(encrypted, iops, mountPoint, numberOfDisks, raidLevel, size, type);
        }
    }
}
