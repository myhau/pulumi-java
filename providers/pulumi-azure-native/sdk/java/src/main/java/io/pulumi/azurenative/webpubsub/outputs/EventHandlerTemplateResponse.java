// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.UpstreamAuthSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventHandlerTemplateResponse {
    private final @Nullable UpstreamAuthSettingsResponse auth;
    private final @Nullable String systemEventPattern;
    private final String urlTemplate;
    private final @Nullable String userEventPattern;

    @OutputCustomType.Constructor({"auth","systemEventPattern","urlTemplate","userEventPattern"})
    private EventHandlerTemplateResponse(
        @Nullable UpstreamAuthSettingsResponse auth,
        @Nullable String systemEventPattern,
        String urlTemplate,
        @Nullable String userEventPattern) {
        this.auth = auth;
        this.systemEventPattern = systemEventPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate);
        this.userEventPattern = userEventPattern;
    }

    public Optional<UpstreamAuthSettingsResponse> getAuth() {
        return Optional.ofNullable(this.auth);
    }
    public Optional<String> getSystemEventPattern() {
        return Optional.ofNullable(this.systemEventPattern);
    }
    public String getUrlTemplate() {
        return this.urlTemplate;
    }
    public Optional<String> getUserEventPattern() {
        return Optional.ofNullable(this.userEventPattern);
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

        public Builder setAuth(@Nullable UpstreamAuthSettingsResponse auth) {
            this.auth = auth;
            return this;
        }

        public Builder setSystemEventPattern(@Nullable String systemEventPattern) {
            this.systemEventPattern = systemEventPattern;
            return this;
        }

        public Builder setUrlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }

        public Builder setUserEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }

        public EventHandlerTemplateResponse build() {
            return new EventHandlerTemplateResponse(auth, systemEventPattern, urlTemplate, userEventPattern);
        }
    }
}