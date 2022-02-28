// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionFixedResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionFixedResponseArgs Empty = new ListenerDefaultActionFixedResponseArgs();

    /**
     * Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * Message body.
     * 
     */
    @InputImport(name="messageBody")
      private final @Nullable Input<String> messageBody;

    public Input<String> getMessageBody() {
        return this.messageBody == null ? Input.empty() : this.messageBody;
    }

    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    @InputImport(name="statusCode")
      private final @Nullable Input<String> statusCode;

    public Input<String> getStatusCode() {
        return this.statusCode == null ? Input.empty() : this.statusCode;
    }

    public ListenerDefaultActionFixedResponseArgs(
        Input<String> contentType,
        @Nullable Input<String> messageBody,
        @Nullable Input<String> statusCode) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.messageBody = messageBody;
        this.statusCode = statusCode;
    }

    private ListenerDefaultActionFixedResponseArgs() {
        this.contentType = Input.empty();
        this.messageBody = Input.empty();
        this.statusCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionFixedResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentType;
        private @Nullable Input<String> messageBody;
        private @Nullable Input<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionFixedResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setContentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder setMessageBody(@Nullable Input<String> messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public Builder setMessageBody(@Nullable String messageBody) {
            this.messageBody = Input.ofNullable(messageBody);
            return this;
        }

        public Builder setStatusCode(@Nullable Input<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setStatusCode(@Nullable String statusCode) {
            this.statusCode = Input.ofNullable(statusCode);
            return this;
        }
        public ListenerDefaultActionFixedResponseArgs build() {
            return new ListenerDefaultActionFixedResponseArgs(contentType, messageBody, statusCode);
        }
    }
}
