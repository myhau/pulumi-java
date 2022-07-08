// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouteAsPathResponse {
    /**
     * @return The AS numbers of the AS Path.
     * 
     */
    private final List<Integer> asLists;
    /**
     * @return The type of the AS Path, which can be one of the following values: - &#39;AS_SET&#39;: unordered set of autonomous systems that the route in has traversed - &#39;AS_SEQUENCE&#39;: ordered set of autonomous systems that the route has traversed - &#39;AS_CONFED_SEQUENCE&#39;: ordered set of Member Autonomous Systems in the local confederation that the route has traversed - &#39;AS_CONFED_SET&#39;: unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * 
     */
    private final String pathSegmentType;

    @CustomType.Constructor
    private RouteAsPathResponse(
        @CustomType.Parameter("asLists") List<Integer> asLists,
        @CustomType.Parameter("pathSegmentType") String pathSegmentType) {
        this.asLists = asLists;
        this.pathSegmentType = pathSegmentType;
    }

    /**
     * @return The AS numbers of the AS Path.
     * 
     */
    public List<Integer> asLists() {
        return this.asLists;
    }
    /**
     * @return The type of the AS Path, which can be one of the following values: - &#39;AS_SET&#39;: unordered set of autonomous systems that the route in has traversed - &#39;AS_SEQUENCE&#39;: ordered set of autonomous systems that the route has traversed - &#39;AS_CONFED_SEQUENCE&#39;: ordered set of Member Autonomous Systems in the local confederation that the route has traversed - &#39;AS_CONFED_SET&#39;: unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * 
     */
    public String pathSegmentType() {
        return this.pathSegmentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteAsPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> asLists;
        private String pathSegmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteAsPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asLists = defaults.asLists;
    	      this.pathSegmentType = defaults.pathSegmentType;
        }

        public Builder asLists(List<Integer> asLists) {
            this.asLists = Objects.requireNonNull(asLists);
            return this;
        }
        public Builder asLists(Integer... asLists) {
            return asLists(List.of(asLists));
        }
        public Builder pathSegmentType(String pathSegmentType) {
            this.pathSegmentType = Objects.requireNonNull(pathSegmentType);
            return this;
        }        public RouteAsPathResponse build() {
            return new RouteAsPathResponse(asLists, pathSegmentType);
        }
    }
}
