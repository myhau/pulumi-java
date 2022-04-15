// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.inputs.PipelineRunRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineRunArgs Empty = new PipelineRunArgs();

    /**
     * How the pipeline run should be forced to recreate even if the pipeline run configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
      private final @Nullable Output<String> forceUpdateTag;

    public Output<String> forceUpdateTag() {
        return this.forceUpdateTag == null ? Codegen.empty() : this.forceUpdateTag;
    }

    /**
     * The name of the pipeline run.
     * 
     */
    @Import(name="pipelineRunName")
      private final @Nullable Output<String> pipelineRunName;

    public Output<String> pipelineRunName() {
        return this.pipelineRunName == null ? Codegen.empty() : this.pipelineRunName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final Output<String> registryName;

    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     * The request parameters for a pipeline run.
     * 
     */
    @Import(name="request")
      private final @Nullable Output<PipelineRunRequestArgs> request;

    public Output<PipelineRunRequestArgs> request() {
        return this.request == null ? Codegen.empty() : this.request;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public PipelineRunArgs(
        @Nullable Output<String> forceUpdateTag,
        @Nullable Output<String> pipelineRunName,
        Output<String> registryName,
        @Nullable Output<PipelineRunRequestArgs> request,
        Output<String> resourceGroupName) {
        this.forceUpdateTag = forceUpdateTag;
        this.pipelineRunName = pipelineRunName;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.request = request;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PipelineRunArgs() {
        this.forceUpdateTag = Codegen.empty();
        this.pipelineRunName = Codegen.empty();
        this.registryName = Codegen.empty();
        this.request = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> forceUpdateTag;
        private @Nullable Output<String> pipelineRunName;
        private Output<String> registryName;
        private @Nullable Output<PipelineRunRequestArgs> request;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.pipelineRunName = defaults.pipelineRunName;
    	      this.registryName = defaults.registryName;
    	      this.request = defaults.request;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Codegen.ofNullable(forceUpdateTag);
            return this;
        }
        public Builder pipelineRunName(@Nullable Output<String> pipelineRunName) {
            this.pipelineRunName = pipelineRunName;
            return this;
        }
        public Builder pipelineRunName(@Nullable String pipelineRunName) {
            this.pipelineRunName = Codegen.ofNullable(pipelineRunName);
            return this;
        }
        public Builder registryName(Output<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder registryName(String registryName) {
            this.registryName = Output.of(Objects.requireNonNull(registryName));
            return this;
        }
        public Builder request(@Nullable Output<PipelineRunRequestArgs> request) {
            this.request = request;
            return this;
        }
        public Builder request(@Nullable PipelineRunRequestArgs request) {
            this.request = Codegen.ofNullable(request);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public PipelineRunArgs build() {
            return new PipelineRunArgs(forceUpdateTag, pipelineRunName, registryName, request, resourceGroupName);
        }
    }
}
