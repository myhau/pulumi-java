// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DynamicGroupQueryResponse {
    /**
     * @return Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
     * 
     */
    private final String query;
    private final String resourceType;

    @CustomType.Constructor
    private DynamicGroupQueryResponse(
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.query = query;
        this.resourceType = resourceType;
    }

    /**
     * @return Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
     * 
     */
    public String query() {
        return this.query;
    }
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicGroupQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicGroupQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public DynamicGroupQueryResponse build() {
            return new DynamicGroupQueryResponse(query, resourceType);
        }
    }
}
