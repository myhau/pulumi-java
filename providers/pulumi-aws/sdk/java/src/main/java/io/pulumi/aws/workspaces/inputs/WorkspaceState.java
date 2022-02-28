// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceState extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceState Empty = new WorkspaceState();

    /**
     * The ID of the bundle for the WorkSpace.
     * 
     */
    @InputImport(name="bundleId")
      private final @Nullable Input<String> bundleId;

    public Input<String> getBundleId() {
        return this.bundleId == null ? Input.empty() : this.bundleId;
    }

    /**
     * The name of the WorkSpace, as seen by the operating system.
     * 
     */
    @InputImport(name="computerName")
      private final @Nullable Input<String> computerName;

    public Input<String> getComputerName() {
        return this.computerName == null ? Input.empty() : this.computerName;
    }

    /**
     * The ID of the directory for the WorkSpace.
     * 
     */
    @InputImport(name="directoryId")
      private final @Nullable Input<String> directoryId;

    public Input<String> getDirectoryId() {
        return this.directoryId == null ? Input.empty() : this.directoryId;
    }

    /**
     * The IP address of the WorkSpace.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     * 
     */
    @InputImport(name="rootVolumeEncryptionEnabled")
      private final @Nullable Input<Boolean> rootVolumeEncryptionEnabled;

    public Input<Boolean> getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled == null ? Input.empty() : this.rootVolumeEncryptionEnabled;
    }

    /**
     * The operational state of the WorkSpace.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The tags for the WorkSpace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     * 
     */
    @InputImport(name="userVolumeEncryptionEnabled")
      private final @Nullable Input<Boolean> userVolumeEncryptionEnabled;

    public Input<Boolean> getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled == null ? Input.empty() : this.userVolumeEncryptionEnabled;
    }

    /**
     * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
     * 
     */
    @InputImport(name="volumeEncryptionKey")
      private final @Nullable Input<String> volumeEncryptionKey;

    public Input<String> getVolumeEncryptionKey() {
        return this.volumeEncryptionKey == null ? Input.empty() : this.volumeEncryptionKey;
    }

    /**
     * The WorkSpace properties.
     * 
     */
    @InputImport(name="workspaceProperties")
      private final @Nullable Input<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties;

    public Input<WorkspaceWorkspacePropertiesGetArgs> getWorkspaceProperties() {
        return this.workspaceProperties == null ? Input.empty() : this.workspaceProperties;
    }

    public WorkspaceState(
        @Nullable Input<String> bundleId,
        @Nullable Input<String> computerName,
        @Nullable Input<String> directoryId,
        @Nullable Input<String> ipAddress,
        @Nullable Input<Boolean> rootVolumeEncryptionEnabled,
        @Nullable Input<String> state,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> userName,
        @Nullable Input<Boolean> userVolumeEncryptionEnabled,
        @Nullable Input<String> volumeEncryptionKey,
        @Nullable Input<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties) {
        this.bundleId = bundleId;
        this.computerName = computerName;
        this.directoryId = directoryId;
        this.ipAddress = ipAddress;
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userName = userName;
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
        this.volumeEncryptionKey = volumeEncryptionKey;
        this.workspaceProperties = workspaceProperties;
    }

    private WorkspaceState() {
        this.bundleId = Input.empty();
        this.computerName = Input.empty();
        this.directoryId = Input.empty();
        this.ipAddress = Input.empty();
        this.rootVolumeEncryptionEnabled = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userName = Input.empty();
        this.userVolumeEncryptionEnabled = Input.empty();
        this.volumeEncryptionKey = Input.empty();
        this.workspaceProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bundleId;
        private @Nullable Input<String> computerName;
        private @Nullable Input<String> directoryId;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<Boolean> rootVolumeEncryptionEnabled;
        private @Nullable Input<String> state;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> userName;
        private @Nullable Input<Boolean> userVolumeEncryptionEnabled;
        private @Nullable Input<String> volumeEncryptionKey;
        private @Nullable Input<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.computerName = defaults.computerName;
    	      this.directoryId = defaults.directoryId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.rootVolumeEncryptionEnabled = defaults.rootVolumeEncryptionEnabled;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userName = defaults.userName;
    	      this.userVolumeEncryptionEnabled = defaults.userVolumeEncryptionEnabled;
    	      this.volumeEncryptionKey = defaults.volumeEncryptionKey;
    	      this.workspaceProperties = defaults.workspaceProperties;
        }

        public Builder setBundleId(@Nullable Input<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder setBundleId(@Nullable String bundleId) {
            this.bundleId = Input.ofNullable(bundleId);
            return this;
        }

        public Builder setComputerName(@Nullable Input<String> computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = Input.ofNullable(computerName);
            return this;
        }

        public Builder setDirectoryId(@Nullable Input<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        public Builder setDirectoryId(@Nullable String directoryId) {
            this.directoryId = Input.ofNullable(directoryId);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setRootVolumeEncryptionEnabled(@Nullable Input<Boolean> rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
            return this;
        }

        public Builder setRootVolumeEncryptionEnabled(@Nullable Boolean rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = Input.ofNullable(rootVolumeEncryptionEnabled);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public Builder setUserVolumeEncryptionEnabled(@Nullable Input<Boolean> userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
            return this;
        }

        public Builder setUserVolumeEncryptionEnabled(@Nullable Boolean userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = Input.ofNullable(userVolumeEncryptionEnabled);
            return this;
        }

        public Builder setVolumeEncryptionKey(@Nullable Input<String> volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        public Builder setVolumeEncryptionKey(@Nullable String volumeEncryptionKey) {
            this.volumeEncryptionKey = Input.ofNullable(volumeEncryptionKey);
            return this;
        }

        public Builder setWorkspaceProperties(@Nullable Input<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties) {
            this.workspaceProperties = workspaceProperties;
            return this;
        }

        public Builder setWorkspaceProperties(@Nullable WorkspaceWorkspacePropertiesGetArgs workspaceProperties) {
            this.workspaceProperties = Input.ofNullable(workspaceProperties);
            return this;
        }
        public WorkspaceState build() {
            return new WorkspaceState(bundleId, computerName, directoryId, ipAddress, rootVolumeEncryptionEnabled, state, tags, tagsAll, userName, userVolumeEncryptionEnabled, volumeEncryptionKey, workspaceProperties);
        }
    }
}
