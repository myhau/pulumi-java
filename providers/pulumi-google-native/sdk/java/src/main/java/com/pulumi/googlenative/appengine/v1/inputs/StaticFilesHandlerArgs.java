// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
 * 
 */
public final class StaticFilesHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticFilesHandlerArgs Empty = new StaticFilesHandlerArgs();

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
     * 
     */
    @Import(name="applicationReadable")
    private @Nullable Output<Boolean> applicationReadable;

    /**
     * @return Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
     * 
     */
    public Optional<Output<Boolean>> applicationReadable() {
        return Optional.ofNullable(this.applicationReadable);
    }

    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    /**
     * @return Time a static file served by this handler should be cached by web proxies and browsers.
     * 
     */
    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * HTTP headers to use for all responses from these URLs.
     * 
     */
    @Import(name="httpHeaders")
    private @Nullable Output<Map<String,String>> httpHeaders;

    /**
     * @return HTTP headers to use for all responses from these URLs.
     * 
     */
    public Optional<Output<Map<String,String>>> httpHeaders() {
        return Optional.ofNullable(this.httpHeaders);
    }

    /**
     * MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file&#39;s filename extension.
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    /**
     * @return MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file&#39;s filename extension.
     * 
     */
    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    @Import(name="requireMatchingFile")
    private @Nullable Output<Boolean> requireMatchingFile;

    /**
     * @return Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    public Optional<Output<Boolean>> requireMatchingFile() {
        return Optional.ofNullable(this.requireMatchingFile);
    }

    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    @Import(name="uploadPathRegex")
    private @Nullable Output<String> uploadPathRegex;

    /**
     * @return Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    public Optional<Output<String>> uploadPathRegex() {
        return Optional.ofNullable(this.uploadPathRegex);
    }

    private StaticFilesHandlerArgs() {}

    private StaticFilesHandlerArgs(StaticFilesHandlerArgs $) {
        this.applicationReadable = $.applicationReadable;
        this.expiration = $.expiration;
        this.httpHeaders = $.httpHeaders;
        this.mimeType = $.mimeType;
        this.path = $.path;
        this.requireMatchingFile = $.requireMatchingFile;
        this.uploadPathRegex = $.uploadPathRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticFilesHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticFilesHandlerArgs $;

        public Builder() {
            $ = new StaticFilesHandlerArgs();
        }

        public Builder(StaticFilesHandlerArgs defaults) {
            $ = new StaticFilesHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationReadable Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
         * 
         * @return builder
         * 
         */
        public Builder applicationReadable(@Nullable Output<Boolean> applicationReadable) {
            $.applicationReadable = applicationReadable;
            return this;
        }

        /**
         * @param applicationReadable Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
         * 
         * @return builder
         * 
         */
        public Builder applicationReadable(Boolean applicationReadable) {
            return applicationReadable(Output.of(applicationReadable));
        }

        /**
         * @param expiration Time a static file served by this handler should be cached by web proxies and browsers.
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration Time a static file served by this handler should be cached by web proxies and browsers.
         * 
         * @return builder
         * 
         */
        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param httpHeaders HTTP headers to use for all responses from these URLs.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(@Nullable Output<Map<String,String>> httpHeaders) {
            $.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * @param httpHeaders HTTP headers to use for all responses from these URLs.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(Map<String,String> httpHeaders) {
            return httpHeaders(Output.of(httpHeaders));
        }

        /**
         * @param mimeType MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file&#39;s filename extension.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file&#39;s filename extension.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        /**
         * @param path Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param requireMatchingFile Whether this handler should match the request if the file referenced by the handler does not exist.
         * 
         * @return builder
         * 
         */
        public Builder requireMatchingFile(@Nullable Output<Boolean> requireMatchingFile) {
            $.requireMatchingFile = requireMatchingFile;
            return this;
        }

        /**
         * @param requireMatchingFile Whether this handler should match the request if the file referenced by the handler does not exist.
         * 
         * @return builder
         * 
         */
        public Builder requireMatchingFile(Boolean requireMatchingFile) {
            return requireMatchingFile(Output.of(requireMatchingFile));
        }

        /**
         * @param uploadPathRegex Regular expression that matches the file paths for all files that should be referenced by this handler.
         * 
         * @return builder
         * 
         */
        public Builder uploadPathRegex(@Nullable Output<String> uploadPathRegex) {
            $.uploadPathRegex = uploadPathRegex;
            return this;
        }

        /**
         * @param uploadPathRegex Regular expression that matches the file paths for all files that should be referenced by this handler.
         * 
         * @return builder
         * 
         */
        public Builder uploadPathRegex(String uploadPathRegex) {
            return uploadPathRegex(Output.of(uploadPathRegex));
        }

        public StaticFilesHandlerArgs build() {
            return $;
        }
    }

}
