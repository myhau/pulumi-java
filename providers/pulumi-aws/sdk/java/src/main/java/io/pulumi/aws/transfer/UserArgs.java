// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer;

import io.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs;
import io.pulumi.aws.transfer.inputs.UserPosixProfileArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @InputImport(name="homeDirectory")
      private final @Nullable Input<String> homeDirectory;

    public Input<String> getHomeDirectory() {
        return this.homeDirectory == null ? Input.empty() : this.homeDirectory;
    }

    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @InputImport(name="homeDirectoryMappings")
      private final @Nullable Input<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings;

    public Input<List<UserHomeDirectoryMappingArgs>> getHomeDirectoryMappings() {
        return this.homeDirectoryMappings == null ? Input.empty() : this.homeDirectoryMappings;
    }

    /**
     * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @InputImport(name="homeDirectoryType")
      private final @Nullable Input<String> homeDirectoryType;

    public Input<String> getHomeDirectoryType() {
        return this.homeDirectoryType == null ? Input.empty() : this.homeDirectoryType;
    }

    /**
     * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @InputImport(name="posixProfile")
      private final @Nullable Input<UserPosixProfileArgs> posixProfile;

    public Input<UserPosixProfileArgs> getPosixProfile() {
        return this.posixProfile == null ? Input.empty() : this.posixProfile;
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @InputImport(name="serverId", required=true)
      private final Input<String> serverId;

    public Input<String> getServerId() {
        return this.serverId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name used for log in to your SFTP server.
     * 
     */
    @InputImport(name="userName", required=true)
      private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public UserArgs(
        @Nullable Input<String> homeDirectory,
        @Nullable Input<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings,
        @Nullable Input<String> homeDirectoryType,
        @Nullable Input<String> policy,
        @Nullable Input<UserPosixProfileArgs> posixProfile,
        Input<String> role,
        Input<String> serverId,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userName) {
        this.homeDirectory = homeDirectory;
        this.homeDirectoryMappings = homeDirectoryMappings;
        this.homeDirectoryType = homeDirectoryType;
        this.policy = policy;
        this.posixProfile = posixProfile;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.serverId = Objects.requireNonNull(serverId, "expected parameter 'serverId' to be non-null");
        this.tags = tags;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private UserArgs() {
        this.homeDirectory = Input.empty();
        this.homeDirectoryMappings = Input.empty();
        this.homeDirectoryType = Input.empty();
        this.policy = Input.empty();
        this.posixProfile = Input.empty();
        this.role = Input.empty();
        this.serverId = Input.empty();
        this.tags = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> homeDirectory;
        private @Nullable Input<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings;
        private @Nullable Input<String> homeDirectoryType;
        private @Nullable Input<String> policy;
        private @Nullable Input<UserPosixProfileArgs> posixProfile;
        private Input<String> role;
        private Input<String> serverId;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.homeDirectory = defaults.homeDirectory;
    	      this.homeDirectoryMappings = defaults.homeDirectoryMappings;
    	      this.homeDirectoryType = defaults.homeDirectoryType;
    	      this.policy = defaults.policy;
    	      this.posixProfile = defaults.posixProfile;
    	      this.role = defaults.role;
    	      this.serverId = defaults.serverId;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder setHomeDirectory(@Nullable Input<String> homeDirectory) {
            this.homeDirectory = homeDirectory;
            return this;
        }

        public Builder setHomeDirectory(@Nullable String homeDirectory) {
            this.homeDirectory = Input.ofNullable(homeDirectory);
            return this;
        }

        public Builder setHomeDirectoryMappings(@Nullable Input<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings) {
            this.homeDirectoryMappings = homeDirectoryMappings;
            return this;
        }

        public Builder setHomeDirectoryMappings(@Nullable List<UserHomeDirectoryMappingArgs> homeDirectoryMappings) {
            this.homeDirectoryMappings = Input.ofNullable(homeDirectoryMappings);
            return this;
        }

        public Builder setHomeDirectoryType(@Nullable Input<String> homeDirectoryType) {
            this.homeDirectoryType = homeDirectoryType;
            return this;
        }

        public Builder setHomeDirectoryType(@Nullable String homeDirectoryType) {
            this.homeDirectoryType = Input.ofNullable(homeDirectoryType);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setPosixProfile(@Nullable Input<UserPosixProfileArgs> posixProfile) {
            this.posixProfile = posixProfile;
            return this;
        }

        public Builder setPosixProfile(@Nullable UserPosixProfileArgs posixProfile) {
            this.posixProfile = Input.ofNullable(posixProfile);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setServerId(Input<String> serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }

        public Builder setServerId(String serverId) {
            this.serverId = Input.of(Objects.requireNonNull(serverId));
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

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }
        public UserArgs build() {
            return new UserArgs(homeDirectory, homeDirectoryMappings, homeDirectoryType, policy, posixProfile, role, serverId, tags, userName);
        }
    }
}
