// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPipelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    /**
     * ID of the pipeline.
     * 
     */
    @InputImport(name="pipelineId", required=true)
      private final String pipelineId;

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * A map of tags assigned to the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetPipelineArgs(
        String pipelineId,
        @Nullable Map<String,String> tags) {
        this.pipelineId = Objects.requireNonNull(pipelineId, "expected parameter 'pipelineId' to be non-null");
        this.tags = tags;
    }

    private GetPipelineArgs() {
        this.pipelineId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineId = defaults.pipelineId;
    	      this.tags = defaults.tags;
        }

        public Builder setPipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetPipelineArgs build() {
            return new GetPipelineArgs(pipelineId, tags);
        }
    }
}
