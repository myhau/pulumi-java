// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch {
    /**
     * The end of the range (exclusive).
     * 
     */
    private final Integer rangeEnd;
    /**
     * The start of the range (inclusive).
     * 
     */
    private final Integer rangeStart;

    @OutputCustomType.Constructor({"rangeEnd","rangeStart"})
    private RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch(
        Integer rangeEnd,
        Integer rangeStart) {
        this.rangeEnd = rangeEnd;
        this.rangeStart = rangeStart;
    }

    /**
     * The end of the range (exclusive).
     * 
    */
    public Integer getRangeEnd() {
        return this.rangeEnd;
    }
    /**
     * The start of the range (inclusive).
     * 
    */
    public Integer getRangeStart() {
        return this.rangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer rangeEnd;
        private Integer rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder setRangeEnd(Integer rangeEnd) {
            this.rangeEnd = Objects.requireNonNull(rangeEnd);
            return this;
        }

        public Builder setRangeStart(Integer rangeStart) {
            this.rangeStart = Objects.requireNonNull(rangeStart);
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch(rangeEnd, rangeStart);
        }
    }
}
