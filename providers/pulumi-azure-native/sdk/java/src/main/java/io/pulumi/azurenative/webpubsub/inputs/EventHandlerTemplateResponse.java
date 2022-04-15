// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.UpstreamAuthSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EventHandler template item settings.
 * 
 */
public final class EventHandlerTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventHandlerTemplateResponse Empty = new EventHandlerTemplateResponse();

    /**
     * Gets or sets the auth settings for an event handler. If not set, no auth is used.
     * 
     */
    @Import(name="auth")
      private final @Nullable UpstreamAuthSettingsResponse auth;

    public Optional<UpstreamAuthSettingsResponse> auth() {
        return this.auth == null ? Optional.empty() : Optional.ofNullable(this.auth);
    }

    /**
     * Gets ot sets the system event pattern.
     * There are 2 kind of patterns supported:
     *     1. The single event name, for example, "connect", it matches "connect"
     *     2. Combine multiple events with ",", for example "connect,disconnected", it matches event "connect" and "disconnected"
     * 
     */
    @Import(name="systemEventPattern")
      private final @Nullable String systemEventPattern;

    public Optional<String> systemEventPattern() {
        return this.systemEventPattern == null ? Optional.empty() : Optional.ofNullable(this.systemEventPattern);
    }

    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    @Import(name="urlTemplate", required=true)
      private final String urlTemplate;

    public String urlTemplate() {
        return this.urlTemplate;
    }

    /**
     * Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "event1,event2", it matches event "event1" and "event2"
     *     3. The single event name, for example, "event1", it matches "event1"
     * 
     */
    @Import(name="userEventPattern")
      private final @Nullable String userEventPattern;

    public Optional<String> userEventPattern() {
        return this.userEventPattern == null ? Optional.empty() : Optional.ofNullable(this.userEventPattern);
    }

    public EventHandlerTemplateResponse(
        @Nullable UpstreamAuthSettingsResponse auth,
        @Nullable String systemEventPattern,
        String urlTemplate,
        @Nullable String userEventPattern) {
        this.auth = auth;
        this.systemEventPattern = systemEventPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate, "expected parameter 'urlTemplate' to be non-null");
        this.userEventPattern = userEventPattern;
    }

    private EventHandlerTemplateResponse() {
        this.auth = null;
        this.systemEventPattern = null;
        this.urlTemplate = null;
        this.userEventPattern = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UpstreamAuthSettingsResponse auth;
        private @Nullable String systemEventPattern;
        private String urlTemplate;
        private @Nullable String userEventPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.systemEventPattern = defaults.systemEventPattern;
    	      this.urlTemplate = defaults.urlTemplate;
    	      this.userEventPattern = defaults.userEventPattern;
        }

        public Builder auth(@Nullable UpstreamAuthSettingsResponse auth) {
            this.auth = auth;
            return this;
        }
        public Builder systemEventPattern(@Nullable String systemEventPattern) {
            this.systemEventPattern = systemEventPattern;
            return this;
        }
        public Builder urlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }
        public Builder userEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }        public EventHandlerTemplateResponse build() {
            return new EventHandlerTemplateResponse(auth, systemEventPattern, urlTemplate, userEventPattern);
        }
    }
}
