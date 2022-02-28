// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs Empty = new ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs();

    /**
     * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
     */
    @InputImport(name="simpleScopeTerm")
      private final @Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs> simpleScopeTerm;

    public Input<ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs> getSimpleScopeTerm() {
        return this.simpleScopeTerm == null ? Input.empty() : this.simpleScopeTerm;
    }

    /**
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
     */
    @InputImport(name="tagScopeTerm")
      private final @Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs> tagScopeTerm;

    public Input<ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs> getTagScopeTerm() {
        return this.tagScopeTerm == null ? Input.empty() : this.tagScopeTerm;
    }

    public ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs(
        @Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs> simpleScopeTerm,
        @Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs> tagScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
        this.tagScopeTerm = tagScopeTerm;
    }

    private ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs() {
        this.simpleScopeTerm = Input.empty();
        this.tagScopeTerm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs> simpleScopeTerm;
        private @Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs> tagScopeTerm;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleScopeTerm = defaults.simpleScopeTerm;
    	      this.tagScopeTerm = defaults.tagScopeTerm;
        }

        public Builder setSimpleScopeTerm(@Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs> simpleScopeTerm) {
            this.simpleScopeTerm = simpleScopeTerm;
            return this;
        }

        public Builder setSimpleScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs simpleScopeTerm) {
            this.simpleScopeTerm = Input.ofNullable(simpleScopeTerm);
            return this;
        }

        public Builder setTagScopeTerm(@Nullable Input<ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs> tagScopeTerm) {
            this.tagScopeTerm = tagScopeTerm;
            return this;
        }

        public Builder setTagScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermGetArgs tagScopeTerm) {
            this.tagScopeTerm = Input.ofNullable(tagScopeTerm);
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs build() {
            return new ClassificationJobS3JobDefinitionScopingExcludesAndGetArgs(simpleScopeTerm, tagScopeTerm);
        }
    }
}
