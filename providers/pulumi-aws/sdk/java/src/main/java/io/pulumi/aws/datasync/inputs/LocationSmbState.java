// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.aws.datasync.inputs.LocationSmbMountOptionsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationSmbState extends io.pulumi.resources.ResourceArgs {

    public static final LocationSmbState Empty = new LocationSmbState();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @InputImport(name="agentArns")
      private final @Nullable Input<List<String>> agentArns;

    public Input<List<String>> getAgentArns() {
        return this.agentArns == null ? Input.empty() : this.agentArns;
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of the Windows domain the SMB server belongs to.
     * 
     */
    @InputImport(name="domain")
      private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
     * 
     */
    @InputImport(name="mountOptions")
      private final @Nullable Input<LocationSmbMountOptionsGetArgs> mountOptions;

    public Input<LocationSmbMountOptionsGetArgs> getMountOptions() {
        return this.mountOptions == null ? Input.empty() : this.mountOptions;
    }

    /**
     * The password of the user who can mount the share and has file permissions in the SMB.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
     * 
     */
    @InputImport(name="serverHostname")
      private final @Nullable Input<String> serverHostname;

    public Input<String> getServerHostname() {
        return this.serverHostname == null ? Input.empty() : this.serverHostname;
    }

    /**
     * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
     * 
     */
    @InputImport(name="subdirectory")
      private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    @InputImport(name="uri")
      private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    /**
     * The user who can mount the share and has file and folder permissions in the SMB share.
     * 
     */
    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public LocationSmbState(
        @Nullable Input<List<String>> agentArns,
        @Nullable Input<String> arn,
        @Nullable Input<String> domain,
        @Nullable Input<LocationSmbMountOptionsGetArgs> mountOptions,
        @Nullable Input<String> password,
        @Nullable Input<String> serverHostname,
        @Nullable Input<String> subdirectory,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> uri,
        @Nullable Input<String> user) {
        this.agentArns = agentArns;
        this.arn = arn;
        this.domain = domain;
        this.mountOptions = mountOptions;
        this.password = password;
        this.serverHostname = serverHostname;
        this.subdirectory = subdirectory;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uri = uri;
        this.user = user;
    }

    private LocationSmbState() {
        this.agentArns = Input.empty();
        this.arn = Input.empty();
        this.domain = Input.empty();
        this.mountOptions = Input.empty();
        this.password = Input.empty();
        this.serverHostname = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.uri = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSmbState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> agentArns;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> domain;
        private @Nullable Input<LocationSmbMountOptionsGetArgs> mountOptions;
        private @Nullable Input<String> password;
        private @Nullable Input<String> serverHostname;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> uri;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSmbState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.arn = defaults.arn;
    	      this.domain = defaults.domain;
    	      this.mountOptions = defaults.mountOptions;
    	      this.password = defaults.password;
    	      this.serverHostname = defaults.serverHostname;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uri = defaults.uri;
    	      this.user = defaults.user;
        }

        public Builder setAgentArns(@Nullable Input<List<String>> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = Input.ofNullable(agentArns);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setMountOptions(@Nullable Input<LocationSmbMountOptionsGetArgs> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setMountOptions(@Nullable LocationSmbMountOptionsGetArgs mountOptions) {
            this.mountOptions = Input.ofNullable(mountOptions);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setServerHostname(@Nullable Input<String> serverHostname) {
            this.serverHostname = serverHostname;
            return this;
        }

        public Builder setServerHostname(@Nullable String serverHostname) {
            this.serverHostname = Input.ofNullable(serverHostname);
            return this;
        }

        public Builder setSubdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder setSubdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
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

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public LocationSmbState build() {
            return new LocationSmbState(agentArns, arn, domain, mountOptions, password, serverHostname, subdirectory, tags, tagsAll, uri, user);
        }
    }
}
