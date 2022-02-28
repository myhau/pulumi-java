// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApprovalRuleTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateArgs Empty = new ApprovalRuleTemplateArgs();

    /**
     * The content of the approval rule template. Maximum of 3000 characters.
     * 
     */
    @InputImport(name="content", required=true)
      private final Input<String> content;

    public Input<String> getContent() {
        return this.content;
    }

    /**
     * The description of the approval rule template. Maximum of 1000 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name for the approval rule template. Maximum of 100 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ApprovalRuleTemplateArgs(
        Input<String> content,
        @Nullable Input<String> description,
        @Nullable Input<String> name) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.description = description;
        this.name = name;
    }

    private ApprovalRuleTemplateArgs() {
        this.content = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalRuleTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> content;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalRuleTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder setContent(Input<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ApprovalRuleTemplateArgs build() {
            return new ApprovalRuleTemplateArgs(content, description, name);
        }
    }
}
