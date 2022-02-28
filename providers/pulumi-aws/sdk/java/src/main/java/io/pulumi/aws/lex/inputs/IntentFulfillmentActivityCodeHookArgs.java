// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class IntentFulfillmentActivityCodeHookArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentFulfillmentActivityCodeHookArgs Empty = new IntentFulfillmentActivityCodeHookArgs();

    /**
     * The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    @InputImport(name="messageVersion", required=true)
      private final Input<String> messageVersion;

    public Input<String> getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    @InputImport(name="uri", required=true)
      private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public IntentFulfillmentActivityCodeHookArgs(
        Input<String> messageVersion,
        Input<String> uri) {
        this.messageVersion = Objects.requireNonNull(messageVersion, "expected parameter 'messageVersion' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private IntentFulfillmentActivityCodeHookArgs() {
        this.messageVersion = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFulfillmentActivityCodeHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> messageVersion;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFulfillmentActivityCodeHookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageVersion = defaults.messageVersion;
    	      this.uri = defaults.uri;
        }

        public Builder setMessageVersion(Input<String> messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }

        public Builder setMessageVersion(String messageVersion) {
            this.messageVersion = Input.of(Objects.requireNonNull(messageVersion));
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }
        public IntentFulfillmentActivityCodeHookArgs build() {
            return new IntentFulfillmentActivityCodeHookArgs(messageVersion, uri);
        }
    }
}
