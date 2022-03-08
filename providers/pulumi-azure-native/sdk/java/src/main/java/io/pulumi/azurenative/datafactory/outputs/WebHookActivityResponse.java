// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityAuthenticationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebHookActivityResponse {
    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    private final @Nullable WebActivityAuthenticationResponse authentication;
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object body;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object headers;
    /**
     * Rest API method for target endpoint.
     * 
     */
    private final String method;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode >= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object reportStatusOnCallBack;
    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable String timeout;
    /**
     * Type of activity.
     * Expected value is 'WebHook'.
     * 
     */
    private final String type;
    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object url;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"authentication","body","dependsOn","description","headers","method","name","reportStatusOnCallBack","timeout","type","url","userProperties"})
    private WebHookActivityResponse(
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
        this.method = method;
        this.name = name;
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        this.timeout = timeout;
        this.type = type;
        this.url = url;
        this.userProperties = userProperties;
    }

    /**
     * Authentication method used for calling the endpoint.
     * 
    */
    public Optional<WebActivityAuthenticationResponse> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getHeaders() {
        return Optional.ofNullable(this.headers);
    }
    /**
     * Rest API method for target endpoint.
     * 
    */
    public String getMethod() {
        return this.method;
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode >= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getReportStatusOnCallBack() {
        return Optional.ofNullable(this.reportStatusOnCallBack);
    }
    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of activity.
     * Expected value is 'WebHook'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
    */
    public Object getUrl() {
        return this.url;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
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
