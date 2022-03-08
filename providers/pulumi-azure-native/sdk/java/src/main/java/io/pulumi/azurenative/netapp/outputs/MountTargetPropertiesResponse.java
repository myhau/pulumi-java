// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MountTargetPropertiesResponse {
    /**
     * UUID v4 used to identify the MountTarget
     * 
     */
    private final String fileSystemId;
    /**
     * The mount target's IPv4 address
     * 
     */
    private final String ipAddress;
    /**
     * UUID v4 used to identify the MountTarget
     * 
     */
    private final String mountTargetId;
    /**
     * The SMB server's Fully Qualified Domain Name, FQDN
     * 
     */
    private final @Nullable String smbServerFqdn;

    @OutputCustomType.Constructor({"fileSystemId","ipAddress","mountTargetId","smbServerFqdn"})
    private MountTargetPropertiesResponse(
        String fileSystemId,
        String ipAddress,
        String mountTargetId,
        @Nullable String smbServerFqdn) {
        this.fileSystemId = fileSystemId;
        this.ipAddress = ipAddress;
        this.mountTargetId = mountTargetId;
        this.smbServerFqdn = smbServerFqdn;
    }

    /**
     * UUID v4 used to identify the MountTarget
     * 
    */
    public String getFileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The mount target's IPv4 address
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * UUID v4 used to identify the MountTarget
     * 
    */
    public String getMountTargetId() {
        return this.mountTargetId;
    }
    /**
     * The SMB server's Fully Qualified Domain Name, FQDN
     * 
    */
    public Optional<String> getSmbServerFqdn() {
        return Optional.ofNullable(this.smbServerFqdn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountTargetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileSystemId;
        private String ipAddress;
        private String mountTargetId;
        private @Nullable String smbServerFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(MountTargetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.mountTargetId = defaults.mountTargetId;
    	      this.smbServerFqdn = defaults.smbServerFqdn;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setMountTargetId(String mountTargetId) {
            this.mountTargetId = Objects.requireNonNull(mountTargetId);
            return this;
        }

        public Builder setSmbServerFqdn(@Nullable String smbServerFqdn) {
            this.smbServerFqdn = smbServerFqdn;
            return this;
        }
        public MountTargetPropertiesResponse build() {
            return new MountTargetPropertiesResponse(fileSystemId, ipAddress, mountTargetId, smbServerFqdn);
        }
    }
}
