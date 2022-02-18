// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceAttachedDisk extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceAttachedDisk Empty = new GetInstanceAttachedDisk();

    /**
     * Name with which the attached disk is accessible
     * under `/dev/disk/by-id/`
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="diskEncryptionKeyRaw", required=true)
    private final String diskEncryptionKeyRaw;

    public String getDiskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw;
    }

    @InputImport(name="diskEncryptionKeySha256", required=true)
    private final String diskEncryptionKeySha256;

    public String getDiskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256;
    }

    @InputImport(name="kmsKeySelfLink", required=true)
    private final String kmsKeySelfLink;

    public String getKmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }

    /**
     * Read/write mode for the disk. One of `"READ_ONLY"` or `"READ_WRITE"`.
     * 
     */
    @InputImport(name="mode", required=true)
    private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * The name or self_link of the disk attached to this instance.
     * 
     */
    @InputImport(name="source", required=true)
    private final String source;

    public String getSource() {
        return this.source;
    }

    public GetInstanceAttachedDisk(
        String deviceName,
        String diskEncryptionKeyRaw,
        String diskEncryptionKeySha256,
        String kmsKeySelfLink,
        String mode,
        String source) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.diskEncryptionKeyRaw = Objects.requireNonNull(diskEncryptionKeyRaw, "expected parameter 'diskEncryptionKeyRaw' to be non-null");
        this.diskEncryptionKeySha256 = Objects.requireNonNull(diskEncryptionKeySha256, "expected parameter 'diskEncryptionKeySha256' to be non-null");
        this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink, "expected parameter 'kmsKeySelfLink' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private GetInstanceAttachedDisk() {
        this.deviceName = null;
        this.diskEncryptionKeyRaw = null;
        this.diskEncryptionKeySha256 = null;
        this.kmsKeySelfLink = null;
        this.mode = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAttachedDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String diskEncryptionKeyRaw;
        private String diskEncryptionKeySha256;
        private String kmsKeySelfLink;
        private String mode;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceAttachedDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDiskEncryptionKeyRaw(String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Objects.requireNonNull(diskEncryptionKeyRaw);
            return this;
        }

        public Builder setDiskEncryptionKeySha256(String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Objects.requireNonNull(diskEncryptionKeySha256);
            return this;
        }

        public Builder setKmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public GetInstanceAttachedDisk build() {
            return new GetInstanceAttachedDisk(deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, kmsKeySelfLink, mode, source);
        }
    }
}
