// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The Edifact message identifier.
 * 
 */
public final class EdifactMessageIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactMessageIdentifierArgs Empty = new EdifactMessageIdentifierArgs();

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageId", required=true)
      private final Output<String> messageId;

    public Output<String> messageId() {
        return this.messageId;
    }

    public EdifactMessageIdentifierArgs(Output<String> messageId) {
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
    }

    private EdifactMessageIdentifierArgs() {
        this.messageId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder messageId(Output<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }
        public Builder messageId(String messageId) {
            this.messageId = Output.of(Objects.requireNonNull(messageId));
            return this;
        }        public EdifactMessageIdentifierArgs build() {
            return new EdifactMessageIdentifierArgs(messageId);
        }
    }
}
