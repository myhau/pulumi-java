// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.EventHandlerResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a hub.
 * 
 */
public final class WebPubSubHubPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebPubSubHubPropertiesResponse Empty = new WebPubSubHubPropertiesResponse();

    /**
     * The settings for configuring if anonymous connections are allowed for this hub: "allow" or "deny". Default to "deny".
     * 
     */
    @Import(name="anonymousConnectPolicy")
      private final @Nullable String anonymousConnectPolicy;

    public Optional<String> anonymousConnectPolicy() {
        return this.anonymousConnectPolicy == null ? Optional.empty() : Optional.ofNullable(this.anonymousConnectPolicy);
    }

    /**
     * Event handler of a hub.
     * 
     */
    @Import(name="eventHandlers")
      private final @Nullable List<EventHandlerResponse> eventHandlers;

    public List<EventHandlerResponse> eventHandlers() {
        return this.eventHandlers == null ? List.of() : this.eventHandlers;
    }

    public WebPubSubHubPropertiesResponse(
        @Nullable String anonymousConnectPolicy,
        @Nullable List<EventHandlerResponse> eventHandlers) {
        this.anonymousConnectPolicy = anonymousConnectPolicy == null ? "deny" : anonymousConnectPolicy;
        this.eventHandlers = eventHandlers;
    }

    private WebPubSubHubPropertiesResponse() {
        this.anonymousConnectPolicy = null;
        this.eventHandlers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String anonymousConnectPolicy;
        private @Nullable List<EventHandlerResponse> eventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymousConnectPolicy = defaults.anonymousConnectPolicy;
    	      this.eventHandlers = defaults.eventHandlers;
        }

        public Builder anonymousConnectPolicy(@Nullable String anonymousConnectPolicy) {
            this.anonymousConnectPolicy = anonymousConnectPolicy;
            return this;
        }
        public Builder eventHandlers(@Nullable List<EventHandlerResponse> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }
        public Builder eventHandlers(EventHandlerResponse... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }        public WebPubSubHubPropertiesResponse build() {
            return new WebPubSubHubPropertiesResponse(anonymousConnectPolicy, eventHandlers);
        }
    }
}
