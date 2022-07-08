// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGcpUserAccessBindingResult {
    /**
     * @return Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    private final List<String> accessLevels;
    /**
     * @return Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the [G Suite Directory API&#39;s Groups resource] (https://developers.google.com/admin-sdk/directory/v1/reference/groups#resource). If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
     * 
     */
    private final String groupKey;
    /**
     * @return Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetGcpUserAccessBindingResult(
        @CustomType.Parameter("accessLevels") List<String> accessLevels,
        @CustomType.Parameter("groupKey") String groupKey,
        @CustomType.Parameter("name") String name) {
        this.accessLevels = accessLevels;
        this.groupKey = groupKey;
        this.name = name;
    }

    /**
     * @return Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    public List<String> accessLevels() {
        return this.accessLevels;
    }
    /**
     * @return Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the [G Suite Directory API&#39;s Groups resource] (https://developers.google.com/admin-sdk/directory/v1/reference/groups#resource). If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
     * 
     */
    public String groupKey() {
        return this.groupKey;
    }
    /**
     * @return Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGcpUserAccessBindingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accessLevels;
        private String groupKey;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGcpUserAccessBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.groupKey = defaults.groupKey;
    	      this.name = defaults.name;
        }

        public Builder accessLevels(List<String> accessLevels) {
            this.accessLevels = Objects.requireNonNull(accessLevels);
            return this;
        }
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }
        public Builder groupKey(String groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetGcpUserAccessBindingResult build() {
            return new GetGcpUserAccessBindingResult(accessLevels, groupKey, name);
        }
    }
}
