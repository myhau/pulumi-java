// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleActionBlockCustomResponseResponseHeader;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleActionBlockCustomResponse {
    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    private final @Nullable String customResponseBodyKey;
    /**
     * The HTTP status code to return to the client.
     * 
     */
    private final Integer responseCode;
    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    private final @Nullable List<WebAclRuleActionBlockCustomResponseResponseHeader> responseHeaders;

    @OutputCustomType.Constructor({"customResponseBodyKey","responseCode","responseHeaders"})
    private WebAclRuleActionBlockCustomResponse(
        @Nullable String customResponseBodyKey,
        Integer responseCode,
        @Nullable List<WebAclRuleActionBlockCustomResponseResponseHeader> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode);
        this.responseHeaders = responseHeaders;
    }

    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    public Optional<String> getCustomResponseBodyKey() {
        return Optional.ofNullable(this.customResponseBodyKey);
    }
    /**
     * The HTTP status code to return to the client.
     * 
     */
    public Integer getResponseCode() {
        return this.responseCode;
    }
    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    public List<WebAclRuleActionBlockCustomResponseResponseHeader> getResponseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionBlockCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customResponseBodyKey;
        private Integer responseCode;
        private @Nullable List<WebAclRuleActionBlockCustomResponseResponseHeader> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionBlockCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder setCustomResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder setResponseCode(Integer responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }

        public Builder setResponseHeaders(@Nullable List<WebAclRuleActionBlockCustomResponseResponseHeader> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public WebAclRuleActionBlockCustomResponse build() {
            return new WebAclRuleActionBlockCustomResponse(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
