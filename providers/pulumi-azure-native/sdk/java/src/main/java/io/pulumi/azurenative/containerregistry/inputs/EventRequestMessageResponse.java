// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.EventContentResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The event request message sent to the service URI.
 * 
 */
public final class EventRequestMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventRequestMessageResponse Empty = new EventRequestMessageResponse();

    /**
     * The content of the event request message.
     * 
     */
    @Import(name="content")
      private final @Nullable EventContentResponse content;

    public Optional<EventContentResponse> content() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The headers of the event request message.
     * 
     */
    @Import(name="headers")
      private final @Nullable Map<String,String> headers;

    public Map<String,String> headers() {
        return this.headers == null ? Map.of() : this.headers;
    }

    /**
     * The HTTP method used to send the event request message.
     * 
     */
    @Import(name="method")
      private final @Nullable String method;

    public Optional<String> method() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    /**
     * The URI used to send the event request message.
     * 
     */
    @Import(name="requestUri")
      private final @Nullable String requestUri;

    public Optional<String> requestUri() {
        return this.requestUri == null ? Optional.empty() : Optional.ofNullable(this.requestUri);
    }

    /**
     * The HTTP message version.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public EventRequestMessageResponse(
        @Nullable EventContentResponse content,
        @Nullable Map<String,String> headers,
        @Nullable String method,
        @Nullable String requestUri,
        @Nullable String version) {
        this.content = content;
        this.headers = headers;
        this.method = method;
        this.requestUri = requestUri;
        this.version = version;
    }

    private EventRequestMessageResponse() {
        this.content = null;
        this.headers = Map.of();
        this.method = null;
        this.requestUri = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRequestMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventContentResponse content;
        private @Nullable Map<String,String> headers;
        private @Nullable String method;
        private @Nullable String requestUri;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EventRequestMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.requestUri = defaults.requestUri;
    	      this.version = defaults.version;
        }

        public Builder content(@Nullable EventContentResponse content) {
            this.content = content;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder requestUri(@Nullable String requestUri) {
            this.requestUri = requestUri;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public EventRequestMessageResponse build() {
            return new EventRequestMessageResponse(content, headers, method, requestUri, version);
        }
    }
}
