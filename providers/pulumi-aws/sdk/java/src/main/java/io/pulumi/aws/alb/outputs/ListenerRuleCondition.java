// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.aws.alb.outputs.ListenerRuleConditionHostHeader;
import io.pulumi.aws.alb.outputs.ListenerRuleConditionHttpHeader;
import io.pulumi.aws.alb.outputs.ListenerRuleConditionHttpRequestMethod;
import io.pulumi.aws.alb.outputs.ListenerRuleConditionPathPattern;
import io.pulumi.aws.alb.outputs.ListenerRuleConditionQueryString;
import io.pulumi.aws.alb.outputs.ListenerRuleConditionSourceIp;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleCondition {
    /**
     * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
     * 
     */
    private final @Nullable ListenerRuleConditionHostHeader hostHeader;
    /**
     * HTTP headers to match. HTTP Header block fields documented below.
     * 
     */
    private final @Nullable ListenerRuleConditionHttpHeader httpHeader;
    /**
     * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * 
     */
    private final @Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod;
    /**
     * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query_string` condition.
     * 
     */
    private final @Nullable ListenerRuleConditionPathPattern pathPattern;
    /**
     * Query strings to match. Query String block fields documented below.
     * 
     */
    private final @Nullable List<ListenerRuleConditionQueryString> queryStrings;
    /**
     * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http_header` condition instead.
     * 
     */
    private final @Nullable ListenerRuleConditionSourceIp sourceIp;

    @OutputCustomType.Constructor({"hostHeader","httpHeader","httpRequestMethod","pathPattern","queryStrings","sourceIp"})
    private ListenerRuleCondition(
        @Nullable ListenerRuleConditionHostHeader hostHeader,
        @Nullable ListenerRuleConditionHttpHeader httpHeader,
        @Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod,
        @Nullable ListenerRuleConditionPathPattern pathPattern,
        @Nullable List<ListenerRuleConditionQueryString> queryStrings,
        @Nullable ListenerRuleConditionSourceIp sourceIp) {
        this.hostHeader = hostHeader;
        this.httpHeader = httpHeader;
        this.httpRequestMethod = httpRequestMethod;
        this.pathPattern = pathPattern;
        this.queryStrings = queryStrings;
        this.sourceIp = sourceIp;
    }

    /**
     * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
     * 
     */
    public Optional<ListenerRuleConditionHostHeader> getHostHeader() {
        return Optional.ofNullable(this.hostHeader);
    }
    /**
     * HTTP headers to match. HTTP Header block fields documented below.
     * 
     */
    public Optional<ListenerRuleConditionHttpHeader> getHttpHeader() {
        return Optional.ofNullable(this.httpHeader);
    }
    /**
     * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * 
     */
    public Optional<ListenerRuleConditionHttpRequestMethod> getHttpRequestMethod() {
        return Optional.ofNullable(this.httpRequestMethod);
    }
    /**
     * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query_string` condition.
     * 
     */
    public Optional<ListenerRuleConditionPathPattern> getPathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }
    /**
     * Query strings to match. Query String block fields documented below.
     * 
     */
    public List<ListenerRuleConditionQueryString> getQueryStrings() {
        return this.queryStrings == null ? List.of() : this.queryStrings;
    }
    /**
     * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http_header` condition instead.
     * 
     */
    public Optional<ListenerRuleConditionSourceIp> getSourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleConditionHostHeader hostHeader;
        private @Nullable ListenerRuleConditionHttpHeader httpHeader;
        private @Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod;
        private @Nullable ListenerRuleConditionPathPattern pathPattern;
        private @Nullable List<ListenerRuleConditionQueryString> queryStrings;
        private @Nullable ListenerRuleConditionSourceIp sourceIp;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostHeader = defaults.hostHeader;
    	      this.httpHeader = defaults.httpHeader;
    	      this.httpRequestMethod = defaults.httpRequestMethod;
    	      this.pathPattern = defaults.pathPattern;
    	      this.queryStrings = defaults.queryStrings;
    	      this.sourceIp = defaults.sourceIp;
        }

        public Builder setHostHeader(@Nullable ListenerRuleConditionHostHeader hostHeader) {
            this.hostHeader = hostHeader;
            return this;
        }

        public Builder setHttpHeader(@Nullable ListenerRuleConditionHttpHeader httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }

        public Builder setHttpRequestMethod(@Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod) {
            this.httpRequestMethod = httpRequestMethod;
            return this;
        }

        public Builder setPathPattern(@Nullable ListenerRuleConditionPathPattern pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }

        public Builder setQueryStrings(@Nullable List<ListenerRuleConditionQueryString> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder setSourceIp(@Nullable ListenerRuleConditionSourceIp sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public ListenerRuleCondition build() {
            return new ListenerRuleCondition(hostHeader, httpHeader, httpRequestMethod, pathPattern, queryStrings, sourceIp);
        }
    }
}
