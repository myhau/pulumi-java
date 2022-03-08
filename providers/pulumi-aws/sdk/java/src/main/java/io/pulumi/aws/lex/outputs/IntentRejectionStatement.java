// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.aws.lex.outputs.IntentRejectionStatementMessage;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntentRejectionStatement {
    /**
     * A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    private final List<IntentRejectionStatementMessage> messages;
    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    private final @Nullable String responseCard;

    @OutputCustomType.Constructor({"messages","responseCard"})
    private IntentRejectionStatement(
        List<IntentRejectionStatementMessage> messages,
        @Nullable String responseCard) {
        this.messages = messages;
        this.responseCard = responseCard;
    }

    /**
     * A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
    */
    public List<IntentRejectionStatementMessage> getMessages() {
        return this.messages;
    }
    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
    */
    public Optional<String> getResponseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentRejectionStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IntentRejectionStatementMessage> messages;
        private @Nullable String responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentRejectionStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder setMessages(List<IntentRejectionStatementMessage> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder setResponseCard(@Nullable String responseCard) {
            this.responseCard = responseCard;
            return this;
        }
        public IntentRejectionStatement build() {
            return new IntentRejectionStatement(messages, responseCard);
        }
    }
}
