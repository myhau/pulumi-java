// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instructions for a labeling job.
 * 
 */
public final class LabelingJobInstructionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobInstructionsArgs Empty = new LabelingJobInstructionsArgs();

    /**
     * The link to a page with detailed labeling instructions for labelers.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> uri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public LabelingJobInstructionsArgs(@Nullable Output<String> uri) {
        this.uri = uri;
    }

    private LabelingJobInstructionsArgs() {
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobInstructionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobInstructionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public LabelingJobInstructionsArgs build() {
            return new LabelingJobInstructionsArgs(uri);
        }
    }
}
