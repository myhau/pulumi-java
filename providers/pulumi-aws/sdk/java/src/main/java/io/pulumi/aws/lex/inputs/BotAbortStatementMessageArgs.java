// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAbortStatementMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAbortStatementMessageArgs Empty = new BotAbortStatementMessageArgs();

    /**
     * The text of the message.
     * 
     */
    @InputImport(name="content", required=true)
      private final Input<String> content;

    public Input<String> getContent() {
        return this.content;
    }

    /**
     * The content type of the message string.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response.
     * 
     */
    @InputImport(name="groupNumber")
      private final @Nullable Input<Integer> groupNumber;

    public Input<Integer> getGroupNumber() {
        return this.groupNumber == null ? Input.empty() : this.groupNumber;
    }

    public BotAbortStatementMessageArgs(
        Input<String> content,
        Input<String> contentType,
        @Nullable Input<Integer> groupNumber) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.groupNumber = groupNumber;
    }

    private BotAbortStatementMessageArgs() {
        this.content = Input.empty();
        this.contentType = Input.empty();
        this.groupNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAbortStatementMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> content;
        private Input<String> contentType;
        private @Nullable Input<Integer> groupNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAbortStatementMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.groupNumber = defaults.groupNumber;
        }

        public Builder setContent(Input<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setContentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder setGroupNumber(@Nullable Input<Integer> groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public Builder setGroupNumber(@Nullable Integer groupNumber) {
            this.groupNumber = Input.ofNullable(groupNumber);
            return this;
        }
        public BotAbortStatementMessageArgs build() {
            return new BotAbortStatementMessageArgs(content, contentType, groupNumber);
        }
    }
}
