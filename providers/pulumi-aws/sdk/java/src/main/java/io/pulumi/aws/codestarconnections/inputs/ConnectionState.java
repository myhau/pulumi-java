// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * The codestar connection ARN.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The codestar connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
     * 
     */
    @InputImport(name="connectionStatus")
      private final @Nullable Input<String> connectionStatus;

    public Input<String> getConnectionStatus() {
        return this.connectionStatus == null ? Input.empty() : this.connectionStatus;
    }

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `provider_type`
     * 
     */
    @InputImport(name="hostArn")
      private final @Nullable Input<String> hostArn;

    public Input<String> getHostArn() {
        return this.hostArn == null ? Input.empty() : this.hostArn;
    }

    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `provider_type` will create a new resource. Conflicts with `host_arn`
     * 
     */
    @InputImport(name="providerType")
      private final @Nullable Input<String> providerType;

    public Input<String> getProviderType() {
        return this.providerType == null ? Input.empty() : this.providerType;
    }

    /**
     * Map of key-value resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public ConnectionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> connectionStatus,
        @Nullable Input<String> hostArn,
        @Nullable Input<String> name,
        @Nullable Input<String> providerType,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.connectionStatus = connectionStatus;
        this.hostArn = hostArn;
        this.name = name;
        this.providerType = providerType;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ConnectionState() {
        this.arn = Input.empty();
        this.connectionStatus = Input.empty();
        this.hostArn = Input.empty();
        this.name = Input.empty();
        this.providerType = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> connectionStatus;
        private @Nullable Input<String> hostArn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> providerType;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.hostArn = defaults.hostArn;
    	      this.name = defaults.name;
    	      this.providerType = defaults.providerType;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setConnectionStatus(@Nullable Input<String> connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        public Builder setConnectionStatus(@Nullable String connectionStatus) {
            this.connectionStatus = Input.ofNullable(connectionStatus);
            return this;
        }

        public Builder setHostArn(@Nullable Input<String> hostArn) {
            this.hostArn = hostArn;
            return this;
        }

        public Builder setHostArn(@Nullable String hostArn) {
            this.hostArn = Input.ofNullable(hostArn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProviderType(@Nullable Input<String> providerType) {
            this.providerType = providerType;
            return this;
        }

        public Builder setProviderType(@Nullable String providerType) {
            this.providerType = Input.ofNullable(providerType);
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
        public ConnectionState build() {
            return new ConnectionState(arn, connectionStatus, hostArn, name, providerType, tags, tagsAll);
        }
    }
}
