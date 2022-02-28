// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassifierGrokClassifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierGrokClassifierArgs Empty = new ClassifierGrokClassifierArgs();

    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    @InputImport(name="classification", required=true)
      private final Input<String> classification;

    public Input<String> getClassification() {
        return this.classification;
    }

    /**
     * Custom grok patterns used by this classifier.
     * 
     */
    @InputImport(name="customPatterns")
      private final @Nullable Input<String> customPatterns;

    public Input<String> getCustomPatterns() {
        return this.customPatterns == null ? Input.empty() : this.customPatterns;
    }

    /**
     * The grok pattern used by this classifier.
     * 
     */
    @InputImport(name="grokPattern", required=true)
      private final Input<String> grokPattern;

    public Input<String> getGrokPattern() {
        return this.grokPattern;
    }

    public ClassifierGrokClassifierArgs(
        Input<String> classification,
        @Nullable Input<String> customPatterns,
        Input<String> grokPattern) {
        this.classification = Objects.requireNonNull(classification, "expected parameter 'classification' to be non-null");
        this.customPatterns = customPatterns;
        this.grokPattern = Objects.requireNonNull(grokPattern, "expected parameter 'grokPattern' to be non-null");
    }

    private ClassifierGrokClassifierArgs() {
        this.classification = Input.empty();
        this.customPatterns = Input.empty();
        this.grokPattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierGrokClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> classification;
        private @Nullable Input<String> customPatterns;
        private Input<String> grokPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierGrokClassifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.customPatterns = defaults.customPatterns;
    	      this.grokPattern = defaults.grokPattern;
        }

        public Builder setClassification(Input<String> classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder setClassification(String classification) {
            this.classification = Input.of(Objects.requireNonNull(classification));
            return this;
        }

        public Builder setCustomPatterns(@Nullable Input<String> customPatterns) {
            this.customPatterns = customPatterns;
            return this;
        }

        public Builder setCustomPatterns(@Nullable String customPatterns) {
            this.customPatterns = Input.ofNullable(customPatterns);
            return this;
        }

        public Builder setGrokPattern(Input<String> grokPattern) {
            this.grokPattern = Objects.requireNonNull(grokPattern);
            return this;
        }

        public Builder setGrokPattern(String grokPattern) {
            this.grokPattern = Input.of(Objects.requireNonNull(grokPattern));
            return this;
        }
        public ClassifierGrokClassifierArgs build() {
            return new ClassifierGrokClassifierArgs(classification, customPatterns, grokPattern);
        }
    }
}
