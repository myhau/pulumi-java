// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1beta.outputs.ApiEndpointHandlerResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.ScriptHandlerResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.StaticFilesHandlerResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlMapResponse {
    private final ApiEndpointHandlerResponse apiEndpoint;
    private final String authFailAction;
    private final String login;
    private final String redirectHttpResponseCode;
    private final ScriptHandlerResponse script;
    private final String securityLevel;
    private final StaticFilesHandlerResponse staticFiles;
    private final String urlRegex;

    @OutputCustomType.Constructor({"apiEndpoint","authFailAction","login","redirectHttpResponseCode","script","securityLevel","staticFiles","urlRegex"})
    private UrlMapResponse(
        ApiEndpointHandlerResponse apiEndpoint,
        String authFailAction,
        String login,
        String redirectHttpResponseCode,
        ScriptHandlerResponse script,
        String securityLevel,
        StaticFilesHandlerResponse staticFiles,
        String urlRegex) {
        this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
        this.authFailAction = Objects.requireNonNull(authFailAction);
        this.login = Objects.requireNonNull(login);
        this.redirectHttpResponseCode = Objects.requireNonNull(redirectHttpResponseCode);
        this.script = Objects.requireNonNull(script);
        this.securityLevel = Objects.requireNonNull(securityLevel);
        this.staticFiles = Objects.requireNonNull(staticFiles);
        this.urlRegex = Objects.requireNonNull(urlRegex);
    }

    public ApiEndpointHandlerResponse getApiEndpoint() {
        return this.apiEndpoint;
    }
    public String getAuthFailAction() {
        return this.authFailAction;
    }
    public String getLogin() {
        return this.login;
    }
    public String getRedirectHttpResponseCode() {
        return this.redirectHttpResponseCode;
    }
    public ScriptHandlerResponse getScript() {
        return this.script;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }
    public StaticFilesHandlerResponse getStaticFiles() {
        return this.staticFiles;
    }
    public String getUrlRegex() {
        return this.urlRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiEndpointHandlerResponse apiEndpoint;
        private String authFailAction;
        private String login;
        private String redirectHttpResponseCode;
        private ScriptHandlerResponse script;
        private String securityLevel;
        private StaticFilesHandlerResponse staticFiles;
        private String urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder setApiEndpoint(ApiEndpointHandlerResponse apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }

        public Builder setAuthFailAction(String authFailAction) {
            this.authFailAction = Objects.requireNonNull(authFailAction);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setRedirectHttpResponseCode(String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Objects.requireNonNull(redirectHttpResponseCode);
            return this;
        }

        public Builder setScript(ScriptHandlerResponse script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setSecurityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }

        public Builder setStaticFiles(StaticFilesHandlerResponse staticFiles) {
            this.staticFiles = Objects.requireNonNull(staticFiles);
            return this;
        }

        public Builder setUrlRegex(String urlRegex) {
            this.urlRegex = Objects.requireNonNull(urlRegex);
            return this;
        }

        public UrlMapResponse build() {
            return new UrlMapResponse(apiEndpoint, authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}