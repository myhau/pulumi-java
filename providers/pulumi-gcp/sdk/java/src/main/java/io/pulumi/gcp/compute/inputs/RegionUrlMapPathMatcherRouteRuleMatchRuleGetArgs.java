// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly
     * match the value specified in fullPathMatch after removing any query parameters
     * and anchor that may be part of the original URL. FullPathMatch must be between 1
     * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
     * be specified.
     * 
     */
    @InputImport(name="fullPathMatch")
    private final @Nullable Input<String> fullPathMatch;

    public Input<String> getFullPathMatch() {
        return this.fullPathMatch == null ? Input.empty() : this.fullPathMatch;
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * 
     */
    @InputImport(name="headerMatches")
    private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> headerMatches;

    public Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> getHeaderMatches() {
        return this.headerMatches == null ? Input.empty() : this.headerMatches;
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * Defaults to false.
     * 
     */
    @InputImport(name="ignoreCase")
    private final @Nullable Input<Boolean> ignoreCase;

    public Input<Boolean> getIgnoreCase() {
        return this.ignoreCase == null ? Input.empty() : this.ignoreCase;
    }

    /**
     * Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metadataFilters")
    private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs>> metadataFilters;

    public Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs>> getMetadataFilters() {
        return this.metadataFilters == null ? Input.empty() : this.metadataFilters;
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @InputImport(name="prefixMatch")
    private final @Nullable Input<String> prefixMatch;

    public Input<String> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    @InputImport(name="queryParameterMatches")
    private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> queryParameterMatches;

    public Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> getQueryParameterMatches() {
        return this.queryParameterMatches == null ? Input.empty() : this.queryParameterMatches;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    @InputImport(name="regexMatch")
    private final @Nullable Input<String> regexMatch;

    public Input<String> getRegexMatch() {
        return this.regexMatch == null ? Input.empty() : this.regexMatch;
    }

    public RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs(
        @Nullable Input<String> fullPathMatch,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> headerMatches,
        @Nullable Input<Boolean> ignoreCase,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs>> metadataFilters,
        @Nullable Input<String> prefixMatch,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> queryParameterMatches,
        @Nullable Input<String> regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.metadataFilters = metadataFilters;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
        this.regexMatch = regexMatch;
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs() {
        this.fullPathMatch = Input.empty();
        this.headerMatches = Input.empty();
        this.ignoreCase = Input.empty();
        this.metadataFilters = Input.empty();
        this.prefixMatch = Input.empty();
        this.queryParameterMatches = Input.empty();
        this.regexMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fullPathMatch;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> headerMatches;
        private @Nullable Input<Boolean> ignoreCase;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs>> metadataFilters;
        private @Nullable Input<String> prefixMatch;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> queryParameterMatches;
        private @Nullable Input<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setFullPathMatch(@Nullable Input<String> fullPathMatch) {
            this.fullPathMatch = fullPathMatch;
            return this;
        }

        public Builder setFullPathMatch(@Nullable String fullPathMatch) {
            this.fullPathMatch = Input.ofNullable(fullPathMatch);
            return this;
        }

        public Builder setHeaderMatches(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> headerMatches) {
            this.headerMatches = headerMatches;
            return this;
        }

        public Builder setHeaderMatches(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs> headerMatches) {
            this.headerMatches = Input.ofNullable(headerMatches);
            return this;
        }

        public Builder setIgnoreCase(@Nullable Input<Boolean> ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder setIgnoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = Input.ofNullable(ignoreCase);
            return this;
        }

        public Builder setMetadataFilters(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs>> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }

        public Builder setMetadataFilters(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs> metadataFilters) {
            this.metadataFilters = Input.ofNullable(metadataFilters);
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public Builder setQueryParameterMatches(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> queryParameterMatches) {
            this.queryParameterMatches = queryParameterMatches;
            return this;
        }

        public Builder setQueryParameterMatches(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs> queryParameterMatches) {
            this.queryParameterMatches = Input.ofNullable(queryParameterMatches);
            return this;
        }

        public Builder setRegexMatch(@Nullable Input<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder setRegexMatch(@Nullable String regexMatch) {
            this.regexMatch = Input.ofNullable(regexMatch);
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
