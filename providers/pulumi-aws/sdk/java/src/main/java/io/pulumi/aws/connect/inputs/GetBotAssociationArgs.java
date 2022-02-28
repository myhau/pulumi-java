// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.GetBotAssociationLexBot;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBotAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBotAssociationArgs Empty = new GetBotAssociationArgs();

    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * 
     */
    @InputImport(name="lexBot", required=true)
      private final GetBotAssociationLexBot lexBot;

    public GetBotAssociationLexBot getLexBot() {
        return this.lexBot;
    }

    public GetBotAssociationArgs(
        String instanceId,
        GetBotAssociationLexBot lexBot) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.lexBot = Objects.requireNonNull(lexBot, "expected parameter 'lexBot' to be non-null");
    }

    private GetBotAssociationArgs() {
        this.instanceId = null;
        this.lexBot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private GetBotAssociationLexBot lexBot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.lexBot = defaults.lexBot;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setLexBot(GetBotAssociationLexBot lexBot) {
            this.lexBot = Objects.requireNonNull(lexBot);
            return this;
        }
        public GetBotAssociationArgs build() {
            return new GetBotAssociationArgs(instanceId, lexBot);
        }
    }
}
