// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine.v1.enums.UrlMapAuthFailAction;
import com.pulumi.googlenative.appengine.v1.enums.UrlMapLogin;
import com.pulumi.googlenative.appengine.v1.enums.UrlMapRedirectHttpResponseCode;
import com.pulumi.googlenative.appengine.v1.enums.UrlMapSecurityLevel;
import com.pulumi.googlenative.appengine.v1.inputs.ApiEndpointHandlerArgs;
import com.pulumi.googlenative.appengine.v1.inputs.ScriptHandlerArgs;
import com.pulumi.googlenative.appengine.v1.inputs.StaticFilesHandlerArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript.
 * 
 */
public final class UrlMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlMapArgs Empty = new UrlMapArgs();

    /**
     * Uses API Endpoints to handle requests.
     * 
     */
    @Import(name="apiEndpoint")
    private @Nullable Output<ApiEndpointHandlerArgs> apiEndpoint;

    /**
     * @return Uses API Endpoints to handle requests.
     * 
     */
    public Optional<Output<ApiEndpointHandlerArgs>> apiEndpoint() {
        return Optional.ofNullable(this.apiEndpoint);
    }

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @Import(name="authFailAction")
    private @Nullable Output<UrlMapAuthFailAction> authFailAction;

    /**
     * @return Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    public Optional<Output<UrlMapAuthFailAction>> authFailAction() {
        return Optional.ofNullable(this.authFailAction);
    }

    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    @Import(name="login")
    private @Nullable Output<UrlMapLogin> login;

    /**
     * @return Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    public Optional<Output<UrlMapLogin>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    @Import(name="redirectHttpResponseCode")
    private @Nullable Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode;

    /**
     * @return 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    public Optional<Output<UrlMapRedirectHttpResponseCode>> redirectHttpResponseCode() {
        return Optional.ofNullable(this.redirectHttpResponseCode);
    }

    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
     * 
     */
    @Import(name="script")
    private @Nullable Output<ScriptHandlerArgs> script;

    /**
     * @return Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
     * 
     */
    public Optional<Output<ScriptHandlerArgs>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    @Import(name="securityLevel")
    private @Nullable Output<UrlMapSecurityLevel> securityLevel;

    /**
     * @return Security (HTTPS) enforcement for this URL.
     * 
     */
    public Optional<Output<UrlMapSecurityLevel>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
     */
    @Import(name="staticFiles")
    private @Nullable Output<StaticFilesHandlerArgs> staticFiles;

    /**
     * @return Returns the contents of a file, such as an image, as the response.
     * 
     */
    public Optional<Output<StaticFilesHandlerArgs>> staticFiles() {
        return Optional.ofNullable(this.staticFiles);
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @Import(name="urlRegex")
    private @Nullable Output<String> urlRegex;

    /**
     * @return URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    public Optional<Output<String>> urlRegex() {
        return Optional.ofNullable(this.urlRegex);
    }

    private UrlMapArgs() {}

    private UrlMapArgs(UrlMapArgs $) {
        this.apiEndpoint = $.apiEndpoint;
        this.authFailAction = $.authFailAction;
        this.login = $.login;
        this.redirectHttpResponseCode = $.redirectHttpResponseCode;
        this.script = $.script;
        this.securityLevel = $.securityLevel;
        this.staticFiles = $.staticFiles;
        this.urlRegex = $.urlRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlMapArgs $;

        public Builder() {
            $ = new UrlMapArgs();
        }

        public Builder(UrlMapArgs defaults) {
            $ = new UrlMapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiEndpoint Uses API Endpoints to handle requests.
         * 
         * @return builder
         * 
         */
        public Builder apiEndpoint(@Nullable Output<ApiEndpointHandlerArgs> apiEndpoint) {
            $.apiEndpoint = apiEndpoint;
            return this;
        }

        /**
         * @param apiEndpoint Uses API Endpoints to handle requests.
         * 
         * @return builder
         * 
         */
        public Builder apiEndpoint(ApiEndpointHandlerArgs apiEndpoint) {
            return apiEndpoint(Output.of(apiEndpoint));
        }

        /**
         * @param authFailAction Action to take when users access resources that require authentication. Defaults to redirect.
         * 
         * @return builder
         * 
         */
        public Builder authFailAction(@Nullable Output<UrlMapAuthFailAction> authFailAction) {
            $.authFailAction = authFailAction;
            return this;
        }

        /**
         * @param authFailAction Action to take when users access resources that require authentication. Defaults to redirect.
         * 
         * @return builder
         * 
         */
        public Builder authFailAction(UrlMapAuthFailAction authFailAction) {
            return authFailAction(Output.of(authFailAction));
        }

        /**
         * @param login Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<UrlMapLogin> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
         * 
         * @return builder
         * 
         */
        public Builder login(UrlMapLogin login) {
            return login(Output.of(login));
        }

        /**
         * @param redirectHttpResponseCode 30x code to use when performing redirects for the secure field. Defaults to 302.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpResponseCode(@Nullable Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode) {
            $.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }

        /**
         * @param redirectHttpResponseCode 30x code to use when performing redirects for the secure field. Defaults to 302.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpResponseCode(UrlMapRedirectHttpResponseCode redirectHttpResponseCode) {
            return redirectHttpResponseCode(Output.of(redirectHttpResponseCode));
        }

        /**
         * @param script Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<ScriptHandlerArgs> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
         * 
         * @return builder
         * 
         */
        public Builder script(ScriptHandlerArgs script) {
            return script(Output.of(script));
        }

        /**
         * @param securityLevel Security (HTTPS) enforcement for this URL.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(@Nullable Output<UrlMapSecurityLevel> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        /**
         * @param securityLevel Security (HTTPS) enforcement for this URL.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(UrlMapSecurityLevel securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        /**
         * @param staticFiles Returns the contents of a file, such as an image, as the response.
         * 
         * @return builder
         * 
         */
        public Builder staticFiles(@Nullable Output<StaticFilesHandlerArgs> staticFiles) {
            $.staticFiles = staticFiles;
            return this;
        }

        /**
         * @param staticFiles Returns the contents of a file, such as an image, as the response.
         * 
         * @return builder
         * 
         */
        public Builder staticFiles(StaticFilesHandlerArgs staticFiles) {
            return staticFiles(Output.of(staticFiles));
        }

        /**
         * @param urlRegex URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
         * 
         * @return builder
         * 
         */
        public Builder urlRegex(@Nullable Output<String> urlRegex) {
            $.urlRegex = urlRegex;
            return this;
        }

        /**
         * @param urlRegex URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
         * 
         * @return builder
         * 
         */
        public Builder urlRegex(String urlRegex) {
            return urlRegex(Output.of(urlRegex));
        }

        public UrlMapArgs build() {
            return $;
        }
    }

}
