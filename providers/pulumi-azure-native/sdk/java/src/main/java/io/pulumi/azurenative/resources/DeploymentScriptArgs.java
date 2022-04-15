// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.enums.ScriptType;
import io.pulumi.azurenative.resources.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentScriptArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentScriptArgs Empty = new DeploymentScriptArgs();

    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Type of the script.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,ScriptType>> kind;

    public Output<Either<String,ScriptType>> kind() {
        return this.kind;
    }

    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
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
     * Name of the deployment script.
     * 
     */
    @Import(name="scriptName")
      private final @Nullable Output<String> scriptName;

    public Output<String> scriptName() {
        return this.scriptName == null ? Codegen.empty() : this.scriptName;
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

    public DeploymentScriptArgs(
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        Output<Either<String,ScriptType>> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> scriptName,
        @Nullable Output<Map<String,String>> tags) {
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptName = scriptName;
        this.tags = tags;
    }

    private DeploymentScriptArgs() {
        this.identity = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scriptName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private Output<Either<String,ScriptType>> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> scriptName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptName = defaults.scriptName;
    	      this.tags = defaults.tags;
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder kind(Output<Either<String,ScriptType>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,ScriptType> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder scriptName(@Nullable Output<String> scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public Builder scriptName(@Nullable String scriptName) {
            this.scriptName = Codegen.ofNullable(scriptName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DeploymentScriptArgs build() {
            return new DeploymentScriptArgs(identity, kind, location, resourceGroupName, scriptName, tags);
        }
    }
}
