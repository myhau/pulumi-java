// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetComputeEnvironmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetComputeEnvironmentArgs Empty = new GetComputeEnvironmentArgs();

    /**
     * The name of the Batch Compute Environment
     * 
     */
    @InputImport(name="computeEnvironmentName", required=true)
      private final String computeEnvironmentName;

    public String getComputeEnvironmentName() {
        return this.computeEnvironmentName;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetComputeEnvironmentArgs(
        String computeEnvironmentName,
        @Nullable Map<String,String> tags) {
        this.computeEnvironmentName = Objects.requireNonNull(computeEnvironmentName, "expected parameter 'computeEnvironmentName' to be non-null");
        this.tags = tags;
    }

    private GetComputeEnvironmentArgs() {
        this.computeEnvironmentName = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeEnvironmentName;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputeEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnvironmentName = defaults.computeEnvironmentName;
    	      this.tags = defaults.tags;
        }

        public Builder setComputeEnvironmentName(String computeEnvironmentName) {
            this.computeEnvironmentName = Objects.requireNonNull(computeEnvironmentName);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetComputeEnvironmentArgs build() {
            return new GetComputeEnvironmentArgs(computeEnvironmentName, tags);
        }
    }
}
