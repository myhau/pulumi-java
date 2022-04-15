// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ApiConnectionDefinitionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Connection name
     * 
     */
    @Import(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> connectionName() {
        return this.connectionName == null ? Codegen.empty() : this.connectionName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="properties")
      private final @Nullable Output<ApiConnectionDefinitionPropertiesArgs> properties;

    public Output<ApiConnectionDefinitionPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId == null ? Codegen.empty() : this.subscriptionId;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ConnectionArgs(
        @Nullable Output<String> connectionName,
        @Nullable Output<String> location,
        @Nullable Output<ApiConnectionDefinitionPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> subscriptionId,
        @Nullable Output<Map<String,String>> tags) {
        this.connectionName = connectionName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.connectionName = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.subscriptionId = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectionName;
        private @Nullable Output<String> location;
        private @Nullable Output<ApiConnectionDefinitionPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> subscriptionId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
        }

        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Codegen.ofNullable(connectionName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<ApiConnectionDefinitionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ApiConnectionDefinitionPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Codegen.ofNullable(subscriptionId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ConnectionArgs build() {
            return new ConnectionArgs(connectionName, location, properties, resourceGroupName, subscriptionId, tags);
        }
    }
}
