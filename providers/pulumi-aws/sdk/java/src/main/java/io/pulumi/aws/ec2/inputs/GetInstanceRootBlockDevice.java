// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetInstanceRootBlockDevice extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceRootBlockDevice Empty = new GetInstanceRootBlockDevice();

    /**
     * If the root block device will be deleted on termination.
     * 
     */
    @InputImport(name="deleteOnTermination", required=true)
      private final Boolean deleteOnTermination;

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * The physical name of the device.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * If the EBS volume is encrypted.
     * 
     */
    @InputImport(name="encrypted", required=true)
      private final Boolean encrypted;

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
     * 
     */
    @InputImport(name="iops", required=true)
      private final Integer iops;

    public Integer getIops() {
        return this.iops;
    }

    @InputImport(name="kmsKeyId", required=true)
      private final String kmsKeyId;

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * A map of tags assigned to the Instance.
     * 
     */
    @InputImport(name="tags", required=true)
      private final Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags;
    }

    /**
     * The throughput of the volume, in MiB/s.
     * 
     */
    @InputImport(name="throughput", required=true)
      private final Integer throughput;

    public Integer getThroughput() {
        return this.throughput;
    }

    @InputImport(name="volumeId", required=true)
      private final String volumeId;

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * The size of the volume, in GiB.
     * 
     */
    @InputImport(name="volumeSize", required=true)
      private final Integer volumeSize;

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * The type of the volume.
     * 
     */
    @InputImport(name="volumeType", required=true)
      private final String volumeType;

    public String getVolumeType() {
        return this.volumeType;
    }

    public GetInstanceRootBlockDevice(
        Boolean deleteOnTermination,
        String deviceName,
        Boolean encrypted,
        Integer iops,
        String kmsKeyId,
        Map<String,String> tags,
        Integer throughput,
        String volumeId,
        Integer volumeSize,
        String volumeType) {
        this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination, "expected parameter 'deleteOnTermination' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encrypted = Objects.requireNonNull(encrypted, "expected parameter 'encrypted' to be non-null");
        this.iops = Objects.requireNonNull(iops, "expected parameter 'iops' to be non-null");
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.throughput = Objects.requireNonNull(throughput, "expected parameter 'throughput' to be non-null");
        this.volumeId = Objects.requireNonNull(volumeId, "expected parameter 'volumeId' to be non-null");
        this.volumeSize = Objects.requireNonNull(volumeSize, "expected parameter 'volumeSize' to be non-null");
        this.volumeType = Objects.requireNonNull(volumeType, "expected parameter 'volumeType' to be non-null");
    }

    private GetInstanceRootBlockDevice() {
        this.deleteOnTermination = null;
        this.deviceName = null;
        this.encrypted = null;
        this.iops = null;
        this.kmsKeyId = null;
        this.tags = Map.of();
        this.throughput = null;
        this.volumeId = null;
        this.volumeSize = null;
        this.volumeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private String kmsKeyId;
        private Map<String,String> tags;
        private Integer throughput;
        private String volumeId;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceRootBlockDevice defaults) {
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

        public Builder setDeleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setIops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setThroughput(Integer throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }

        public Builder setVolumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }

        public Builder setVolumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetInstanceRootBlockDevice build() {
            return new GetInstanceRootBlockDevice(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}
