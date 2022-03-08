// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotResponseSpecification;
import io.pulumi.awsnative.lex.outputs.BotStillWaitingResponseSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotWaitAndContinueSpecification {
    /**
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * 
     */
    private final BotResponseSpecification continueResponse;
    /**
     * Specifies whether the bot will wait for a user to respond.
     * 
     */
    private final @Nullable Boolean isActive;
    /**
     * The response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * 
     */
    private final @Nullable BotStillWaitingResponseSpecification stillWaitingResponse;
    /**
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * 
     */
    private final BotResponseSpecification waitingResponse;

    @OutputCustomType.Constructor({"continueResponse","isActive","stillWaitingResponse","waitingResponse"})
    private BotWaitAndContinueSpecification(
        BotResponseSpecification continueResponse,
        @Nullable Boolean isActive,
        @Nullable BotStillWaitingResponseSpecification stillWaitingResponse,
        BotResponseSpecification waitingResponse) {
        this.continueResponse = continueResponse;
        this.isActive = isActive;
        this.stillWaitingResponse = stillWaitingResponse;
        this.waitingResponse = waitingResponse;
    }

    /**
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * 
    */
    public BotResponseSpecification getContinueResponse() {
        return this.continueResponse;
    }
    /**
     * Specifies whether the bot will wait for a user to respond.
     * 
    */
    public Optional<Boolean> getIsActive() {
        return Optional.ofNullable(this.isActive);
    }
    /**
     * The response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * 
    */
    public Optional<BotStillWaitingResponseSpecification> getStillWaitingResponse() {
        return Optional.ofNullable(this.stillWaitingResponse);
    }
    /**
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * 
    */
    public BotResponseSpecification getWaitingResponse() {
        return this.waitingResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotWaitAndContinueSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotResponseSpecification continueResponse;
        private @Nullable Boolean isActive;
        private @Nullable BotStillWaitingResponseSpecification stillWaitingResponse;
        private BotResponseSpecification waitingResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(BotWaitAndContinueSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueResponse = defaults.continueResponse;
    	      this.isActive = defaults.isActive;
    	      this.stillWaitingResponse = defaults.stillWaitingResponse;
    	      this.waitingResponse = defaults.waitingResponse;
        }

        public Builder setContinueResponse(BotResponseSpecification continueResponse) {
            this.continueResponse = Objects.requireNonNull(continueResponse);
            return this;
        }

        public Builder setIsActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setStillWaitingResponse(@Nullable BotStillWaitingResponseSpecification stillWaitingResponse) {
            this.stillWaitingResponse = stillWaitingResponse;
            return this;
        }

        public Builder setWaitingResponse(BotResponseSpecification waitingResponse) {
            this.waitingResponse = Objects.requireNonNull(waitingResponse);
            return this;
        }
        public BotWaitAndContinueSpecification build() {
            return new BotWaitAndContinueSpecification(continueResponse, isActive, stillWaitingResponse, waitingResponse);
        }
    }
}
