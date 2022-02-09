// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.inputs.WebActivityAuthenticationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebHookActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebHookActivityResponse Empty = new WebHookActivityResponse();

    @InputImport(name="authentication")
    private final @Nullable WebActivityAuthenticationResponse authentication;

    public Optional<WebActivityAuthenticationResponse> getAuthentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    @InputImport(name="body")
    private final @Nullable Object body;

    public Optional<Object> getBody() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="headers")
    private final @Nullable Object headers;

    public Optional<Object> getHeaders() {
        return this.headers == null ? Optional.empty() : Optional.ofNullable(this.headers);
    }

    @InputImport(name="method", required=true)
    private final String method;

    public String getMethod() {
        return this.method;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="reportStatusOnCallBack")
    private final @Nullable Object reportStatusOnCallBack;

    public Optional<Object> getReportStatusOnCallBack() {
        return this.reportStatusOnCallBack == null ? Optional.empty() : Optional.ofNullable(this.reportStatusOnCallBack);
    }

    @InputImport(name="timeout")
    private final @Nullable String timeout;

    public Optional<String> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="url", required=true)
    private final Object url;

    public Object getUrl() {
        return this.url;
    }

    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public WebHookActivityResponse(
        @Nullable WebActivityAuthenticationResponse authentication,
        @Nullable Object body,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object headers,
        String method,
        String name,
        @Nullable Object reportStatusOnCallBack,
        @Nullable String timeout,
        String type,
        Object url,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userProperties = userProperties;
    }

    private WebHookActivityResponse() {
        this.authentication = null;
        this.body = null;
        this.dependsOn = List.of();
        this.description = null;
        this.headers = null;
        this.method = null;
        this.name = null;
        this.reportStatusOnCallBack = null;
        this.timeout = null;
        this.type = null;
        this.url = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebHookActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebActivityAuthenticationResponse authentication;
        private @Nullable Object body;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object headers;
        private String method;
        private String name;
        private @Nullable Object reportStatusOnCallBack;
        private @Nullable String timeout;
        private String type;
        private Object url;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebHookActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.reportStatusOnCallBack = defaults.reportStatusOnCallBack;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setAuthentication(@Nullable WebActivityAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = body;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHeaders(@Nullable Object headers) {
            this.headers = headers;
            return this;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReportStatusOnCallBack(@Nullable Object reportStatusOnCallBack) {
            this.reportStatusOnCallBack = reportStatusOnCallBack;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public WebHookActivityResponse build() {
            return new WebHookActivityResponse(authentication, body, dependsOn, description, headers, method, name, reportStatusOnCallBack, timeout, type, url, userProperties);
        }
    }
}