// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRedirectConfigurationResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Include path in the redirected url.
     * 
     */
    private final @Nullable Boolean includePath;
    /**
     * Include query string in the redirected url.
     * 
     */
    private final @Nullable Boolean includeQueryString;
    /**
     * Name of the redirect configuration that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Path rules specifying redirect configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> pathRules;
    /**
     * HTTP redirection type.
     * 
     */
    private final @Nullable String redirectType;
    /**
     * Request routing specifying redirect configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> requestRoutingRules;
    /**
     * Reference to a listener to redirect the request to.
     * 
     */
    private final @Nullable SubResourceResponse targetListener;
    /**
     * Url to redirect the request to.
     * 
     */
    private final @Nullable String targetUrl;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * Url path maps specifying default redirect configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> urlPathMaps;

    @CustomType.Constructor
    private ApplicationGatewayRedirectConfigurationResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("includePath") @Nullable Boolean includePath,
        @CustomType.Parameter("includeQueryString") @Nullable Boolean includeQueryString,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("pathRules") @Nullable List<SubResourceResponse> pathRules,
        @CustomType.Parameter("redirectType") @Nullable String redirectType,
        @CustomType.Parameter("requestRoutingRules") @Nullable List<SubResourceResponse> requestRoutingRules,
        @CustomType.Parameter("targetListener") @Nullable SubResourceResponse targetListener,
        @CustomType.Parameter("targetUrl") @Nullable String targetUrl,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("urlPathMaps") @Nullable List<SubResourceResponse> urlPathMaps) {
        this.etag = etag;
        this.id = id;
        this.includePath = includePath;
        this.includeQueryString = includeQueryString;
        this.name = name;
        this.pathRules = pathRules;
        this.redirectType = redirectType;
        this.requestRoutingRules = requestRoutingRules;
        this.targetListener = targetListener;
        this.targetUrl = targetUrl;
        this.type = type;
        this.urlPathMaps = urlPathMaps;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Include path in the redirected url.
     * 
    */
    public Optional<Boolean> includePath() {
        return Optional.ofNullable(this.includePath);
    }
    /**
     * Include query string in the redirected url.
     * 
    */
    public Optional<Boolean> includeQueryString() {
        return Optional.ofNullable(this.includeQueryString);
    }
    /**
     * Name of the redirect configuration that is unique within an Application Gateway.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Path rules specifying redirect configuration.
     * 
    */
    public List<SubResourceResponse> pathRules() {
        return this.pathRules == null ? List.of() : this.pathRules;
    }
    /**
     * HTTP redirection type.
     * 
    */
    public Optional<String> redirectType() {
        return Optional.ofNullable(this.redirectType);
    }
    /**
     * Request routing specifying redirect configuration.
     * 
    */
    public List<SubResourceResponse> requestRoutingRules() {
        return this.requestRoutingRules == null ? List.of() : this.requestRoutingRules;
    }
    /**
     * Reference to a listener to redirect the request to.
     * 
    */
    public Optional<SubResourceResponse> targetListener() {
        return Optional.ofNullable(this.targetListener);
    }
    /**
     * Url to redirect the request to.
     * 
    */
    public Optional<String> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }
    /**
     * Type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Url path maps specifying default redirect configuration.
     * 
    */
    public List<SubResourceResponse> urlPathMaps() {
        return this.urlPathMaps == null ? List.of() : this.urlPathMaps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRedirectConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable Boolean includePath;
        private @Nullable Boolean includeQueryString;
        private @Nullable String name;
        private @Nullable List<SubResourceResponse> pathRules;
        private @Nullable String redirectType;
        private @Nullable List<SubResourceResponse> requestRoutingRules;
        private @Nullable SubResourceResponse targetListener;
        private @Nullable String targetUrl;
        private String type;
        private @Nullable List<SubResourceResponse> urlPathMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRedirectConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.includePath = defaults.includePath;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.redirectType = defaults.redirectType;
    	      this.requestRoutingRules = defaults.requestRoutingRules;
    	      this.targetListener = defaults.targetListener;
    	      this.targetUrl = defaults.targetUrl;
    	      this.type = defaults.type;
    	      this.urlPathMaps = defaults.urlPathMaps;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder includePath(@Nullable Boolean includePath) {
            this.includePath = includePath;
            return this;
        }
        public Builder includeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder pathRules(@Nullable List<SubResourceResponse> pathRules) {
            this.pathRules = pathRules;
            return this;
        }
        public Builder pathRules(SubResourceResponse... pathRules) {
            return pathRules(List.of(pathRules));
        }
        public Builder redirectType(@Nullable String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public Builder requestRoutingRules(@Nullable List<SubResourceResponse> requestRoutingRules) {
            this.requestRoutingRules = requestRoutingRules;
            return this;
        }
        public Builder requestRoutingRules(SubResourceResponse... requestRoutingRules) {
            return requestRoutingRules(List.of(requestRoutingRules));
        }
        public Builder targetListener(@Nullable SubResourceResponse targetListener) {
            this.targetListener = targetListener;
            return this;
        }
        public Builder targetUrl(@Nullable String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder urlPathMaps(@Nullable List<SubResourceResponse> urlPathMaps) {
            this.urlPathMaps = urlPathMaps;
            return this;
        }
        public Builder urlPathMaps(SubResourceResponse... urlPathMaps) {
            return urlPathMaps(List.of(urlPathMaps));
        }        public ApplicationGatewayRedirectConfigurationResponse build() {
            return new ApplicationGatewayRedirectConfigurationResponse(etag, id, includePath, includeQueryString, name, pathRules, redirectType, requestRoutingRules, targetListener, targetUrl, type, urlPathMaps);
        }
    }
}
