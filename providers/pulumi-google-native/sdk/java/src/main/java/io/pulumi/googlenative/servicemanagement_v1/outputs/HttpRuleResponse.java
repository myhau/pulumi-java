// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.CustomHttpPatternResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HttpRuleResponse {
    /**
     * Additional HTTP bindings for the selector. Nested bindings must not contain an `additional_bindings` field themselves (that is, the nesting may only be one level deep).
     * 
     */
    private final List<HttpRuleResponse> additionalBindings;
    /**
     * The name of the request field whose value is mapped to the HTTP request body, or `*` for mapping all request fields not captured by the path pattern to the HTTP body, or omitted for not having any HTTP request body. NOTE: the referred field must be present at the top-level of the request message type.
     * 
     */
    private final String body;
    /**
     * The custom pattern is used for specifying an HTTP method that is not included in the `pattern` field, such as HEAD, or "*" to leave the HTTP method unspecified for this rule. The wild-card rule is useful for services that provide content to Web (HTML) clients.
     * 
     */
    private final CustomHttpPatternResponse custom;
    /**
     * Maps to HTTP DELETE. Used for deleting a resource.
     * 
     */
    private final String delete;
    /**
     * Maps to HTTP GET. Used for listing and getting information about resources.
     * 
     */
    private final String get;
    /**
     * Maps to HTTP PATCH. Used for updating a resource.
     * 
     */
    private final String patch;
    /**
     * Maps to HTTP POST. Used for creating a resource or performing an action.
     * 
     */
    private final String post;
    /**
     * Maps to HTTP PUT. Used for replacing a resource.
     * 
     */
    private final String put;
    /**
     * Optional. The name of the response field whose value is mapped to the HTTP response body. When omitted, the entire response message will be used as the HTTP response body. NOTE: The referred field must be present at the top-level of the response message type.
     * 
     */
    private final String responseBody;
    /**
     * Selects a method to which this rule applies. Refer to selector for syntax details.
     * 
     */
    private final String selector;

    @OutputCustomType.Constructor({"additionalBindings","body","custom","delete","get","patch","post","put","responseBody","selector"})
    private HttpRuleResponse(
        List<HttpRuleResponse> additionalBindings,
        String body,
        CustomHttpPatternResponse custom,
        String delete,
        String get,
        String patch,
        String post,
        String put,
        String responseBody,
        String selector) {
        this.additionalBindings = additionalBindings;
        this.body = body;
        this.custom = custom;
        this.delete = delete;
        this.get = get;
        this.patch = patch;
        this.post = post;
        this.put = put;
        this.responseBody = responseBody;
        this.selector = selector;
    }

    /**
     * Additional HTTP bindings for the selector. Nested bindings must not contain an `additional_bindings` field themselves (that is, the nesting may only be one level deep).
     * 
    */
    public List<HttpRuleResponse> getAdditionalBindings() {
        return this.additionalBindings;
    }
    /**
     * The name of the request field whose value is mapped to the HTTP request body, or `*` for mapping all request fields not captured by the path pattern to the HTTP body, or omitted for not having any HTTP request body. NOTE: the referred field must be present at the top-level of the request message type.
     * 
    */
    public String getBody() {
        return this.body;
    }
    /**
     * The custom pattern is used for specifying an HTTP method that is not included in the `pattern` field, such as HEAD, or "*" to leave the HTTP method unspecified for this rule. The wild-card rule is useful for services that provide content to Web (HTML) clients.
     * 
    */
    public CustomHttpPatternResponse getCustom() {
        return this.custom;
    }
    /**
     * Maps to HTTP DELETE. Used for deleting a resource.
     * 
    */
    public String getDelete() {
        return this.delete;
    }
    /**
     * Maps to HTTP GET. Used for listing and getting information about resources.
     * 
    */
    public String getGet() {
        return this.get;
    }
    /**
     * Maps to HTTP PATCH. Used for updating a resource.
     * 
    */
    public String getPatch() {
        return this.patch;
    }
    /**
     * Maps to HTTP POST. Used for creating a resource or performing an action.
     * 
    */
    public String getPost() {
        return this.post;
    }
    /**
     * Maps to HTTP PUT. Used for replacing a resource.
     * 
    */
    public String getPut() {
        return this.put;
    }
    /**
     * Optional. The name of the response field whose value is mapped to the HTTP response body. When omitted, the entire response message will be used as the HTTP response body. NOTE: The referred field must be present at the top-level of the response message type.
     * 
    */
    public String getResponseBody() {
        return this.responseBody;
    }
    /**
     * Selects a method to which this rule applies. Refer to selector for syntax details.
     * 
    */
    public String getSelector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpRuleResponse> additionalBindings;
        private String body;
        private CustomHttpPatternResponse custom;
        private String delete;
        private String get;
        private String patch;
        private String post;
        private String put;
        private String responseBody;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBindings = defaults.additionalBindings;
    	      this.body = defaults.body;
    	      this.custom = defaults.custom;
    	      this.delete = defaults.delete;
    	      this.get = defaults.get;
    	      this.patch = defaults.patch;
    	      this.post = defaults.post;
    	      this.put = defaults.put;
    	      this.responseBody = defaults.responseBody;
    	      this.selector = defaults.selector;
        }

        public Builder setAdditionalBindings(List<HttpRuleResponse> additionalBindings) {
            this.additionalBindings = Objects.requireNonNull(additionalBindings);
            return this;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setCustom(CustomHttpPatternResponse custom) {
            this.custom = Objects.requireNonNull(custom);
            return this;
        }

        public Builder setDelete(String delete) {
            this.delete = Objects.requireNonNull(delete);
            return this;
        }

        public Builder setGet(String get) {
            this.get = Objects.requireNonNull(get);
            return this;
        }

        public Builder setPatch(String patch) {
            this.patch = Objects.requireNonNull(patch);
            return this;
        }

        public Builder setPost(String post) {
            this.post = Objects.requireNonNull(post);
            return this;
        }

        public Builder setPut(String put) {
            this.put = Objects.requireNonNull(put);
            return this;
        }

        public Builder setResponseBody(String responseBody) {
            this.responseBody = Objects.requireNonNull(responseBody);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public HttpRuleResponse build() {
            return new HttpRuleResponse(additionalBindings, body, custom, delete, get, patch, post, put, responseBody, selector);
        }
    }
}
