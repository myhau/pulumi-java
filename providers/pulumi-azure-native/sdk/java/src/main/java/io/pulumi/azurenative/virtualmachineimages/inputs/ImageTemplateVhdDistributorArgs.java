// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Distribute via VHD in a storage account.
 * 
 */
public final class ImageTemplateVhdDistributorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplateVhdDistributorArgs Empty = new ImageTemplateVhdDistributorArgs();

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    @Import(name="artifactTags")
      private final @Nullable Output<Map<String,String>> artifactTags;

    public Output<Map<String,String>> artifactTags() {
        return this.artifactTags == null ? Codegen.empty() : this.artifactTags;
    }

    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    @Import(name="runOutputName", required=true)
      private final Output<String> runOutputName;

    public Output<String> runOutputName() {
        return this.runOutputName;
    }

    /**
     * Type of distribution.
     * Expected value is 'VHD'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ImageTemplateVhdDistributorArgs(
        @Nullable Output<Map<String,String>> artifactTags,
        Output<String> runOutputName,
        Output<String> type) {
        this.artifactTags = artifactTags;
        this.runOutputName = Objects.requireNonNull(runOutputName, "expected parameter 'runOutputName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateVhdDistributorArgs() {
        this.artifactTags = Codegen.empty();
        this.runOutputName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateVhdDistributorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> artifactTags;
        private Output<String> runOutputName;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateVhdDistributorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.runOutputName = defaults.runOutputName;
    	      this.type = defaults.type;
        }

        public Builder artifactTags(@Nullable Output<Map<String,String>> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }
        public Builder artifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = Codegen.ofNullable(artifactTags);
            return this;
        }
        public Builder runOutputName(Output<String> runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }
        public Builder runOutputName(String runOutputName) {
            this.runOutputName = Output.of(Objects.requireNonNull(runOutputName));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ImageTemplateVhdDistributorArgs build() {
            return new ImageTemplateVhdDistributorArgs(artifactTags, runOutputName, type);
        }
    }
}
