// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverPipelineConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverPipelineConfigArgs Empty = new ResolverPipelineConfigArgs();

    /**
     * The list of Function ID.
     * 
     */
    @InputImport(name="functions")
      private final @Nullable Input<List<String>> functions;

    public Input<List<String>> getFunctions() {
        return this.functions == null ? Input.empty() : this.functions;
    }

    public ResolverPipelineConfigArgs(@Nullable Input<List<String>> functions) {
        this.functions = functions;
    }

    private ResolverPipelineConfigArgs() {
        this.functions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverPipelineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> functions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverPipelineConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functions = defaults.functions;
        }

        public Builder setFunctions(@Nullable Input<List<String>> functions) {
            this.functions = functions;
            return this;
        }

        public Builder setFunctions(@Nullable List<String> functions) {
            this.functions = Input.ofNullable(functions);
            return this;
        }
        public ResolverPipelineConfigArgs build() {
            return new ResolverPipelineConfigArgs(functions);
        }
    }
}
