// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.connect.inputs.BotAssociationLexBotArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BotAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAssociationArgs Empty = new BotAssociationArgs();

    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * 
     */
    @InputImport(name="lexBot", required=true)
      private final Input<BotAssociationLexBotArgs> lexBot;

    public Input<BotAssociationLexBotArgs> getLexBot() {
        return this.lexBot;
    }

    public BotAssociationArgs(
        Input<String> instanceId,
        Input<BotAssociationLexBotArgs> lexBot) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.lexBot = Objects.requireNonNull(lexBot, "expected parameter 'lexBot' to be non-null");
    }

    private BotAssociationArgs() {
        this.instanceId = Input.empty();
        this.lexBot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceId;
        private Input<BotAssociationLexBotArgs> lexBot;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.lexBot = defaults.lexBot;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setLexBot(Input<BotAssociationLexBotArgs> lexBot) {
            this.lexBot = Objects.requireNonNull(lexBot);
            return this;
        }

        public Builder setLexBot(BotAssociationLexBotArgs lexBot) {
            this.lexBot = Input.of(Objects.requireNonNull(lexBot));
            return this;
        }
        public BotAssociationArgs build() {
            return new BotAssociationArgs(instanceId, lexBot);
        }
    }
}
