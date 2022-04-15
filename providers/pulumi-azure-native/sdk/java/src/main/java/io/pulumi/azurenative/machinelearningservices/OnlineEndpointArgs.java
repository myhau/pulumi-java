// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.inputs.ResourceIdentityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OnlineEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnlineEndpointArgs Empty = new OnlineEndpointArgs();

    /**
     * Online Endpoint name.
     * 
     */
    @Import(name="endpointName")
      private final @Nullable Output<String> endpointName;

    public Output<String> endpointName() {
        return this.endpointName == null ? Codegen.empty() : this.endpointName;
    }

    /**
     * Service identity associated with a resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ResourceIdentityArgs> identity;

    public Output<ResourceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<io.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties;

    public Output<io.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public OnlineEndpointArgs(
        @Nullable Output<String> endpointName,
        @Nullable Output<ResourceIdentityArgs> identity,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        Output<io.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<String> workspaceName) {
        this.endpointName = endpointName;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private OnlineEndpointArgs() {
        this.endpointName = Codegen.empty();
        this.identity = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpointName;
        private @Nullable Output<ResourceIdentityArgs> identity;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private Output<io.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder endpointName(@Nullable Output<String> endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public Builder endpointName(@Nullable String endpointName) {
            this.endpointName = Codegen.ofNullable(endpointName);
            return this;
        }
        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder properties(Output<io.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(io.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public OnlineEndpointArgs build() {
            return new OnlineEndpointArgs(endpointName, identity, kind, location, properties, resourceGroupName, tags, workspaceName);
        }
    }
}
