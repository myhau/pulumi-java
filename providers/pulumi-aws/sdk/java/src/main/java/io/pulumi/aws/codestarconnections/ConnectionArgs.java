// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

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

    public ConnectionArgs(
        @Nullable Input<String> hostArn,
        @Nullable Input<String> name,
        @Nullable Input<String> providerType,
        @Nullable Input<Map<String,String>> tags) {
        this.hostArn = hostArn;
        this.name = name;
        this.providerType = providerType;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.hostArn = Input.empty();
        this.name = Input.empty();
        this.providerType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostArn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> providerType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostArn = defaults.hostArn;
    	      this.name = defaults.name;
    	      this.providerType = defaults.providerType;
    	      this.tags = defaults.tags;
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
        public ConnectionArgs build() {
            return new ConnectionArgs(hostArn, name, providerType, tags);
        }
    }
}
