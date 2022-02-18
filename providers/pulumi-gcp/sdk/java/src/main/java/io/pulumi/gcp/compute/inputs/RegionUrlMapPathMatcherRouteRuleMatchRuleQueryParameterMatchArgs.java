// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches
     * the contents of exactMatch. Only one of presentMatch, exactMatch and regexMatch
     * must be set.
     * 
     */
    @InputImport(name="exactMatch")
    private final @Nullable Input<String> exactMatch;

    public Input<String> getExactMatch() {
        return this.exactMatch == null ? Input.empty() : this.exactMatch;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query
     * parameter, irrespective of whether the parameter has a value or not. Only one of
     * presentMatch, exactMatch and regexMatch must be set.
     * 
     */
    @InputImport(name="presentMatch")
    private final @Nullable Input<Boolean> presentMatch;

    public Input<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Input.empty() : this.presentMatch;
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

    public RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs(
        @Nullable Input<String> exactMatch,
        Input<String> name,
        @Nullable Input<Boolean> presentMatch,
        @Nullable Input<String> regexMatch) {
        this.exactMatch = exactMatch;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.presentMatch = presentMatch;
        this.regexMatch = regexMatch;
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs() {
        this.exactMatch = Input.empty();
        this.name = Input.empty();
        this.presentMatch = Input.empty();
        this.regexMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exactMatch;
        private Input<String> name;
        private @Nullable Input<Boolean> presentMatch;
        private @Nullable Input<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setExactMatch(@Nullable Input<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder setExactMatch(@Nullable String exactMatch) {
            this.exactMatch = Input.ofNullable(exactMatch);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPresentMatch(@Nullable Input<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder setPresentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Input.ofNullable(presentMatch);
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

        public RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs(exactMatch, name, presentMatch, regexMatch);
        }
    }
}
