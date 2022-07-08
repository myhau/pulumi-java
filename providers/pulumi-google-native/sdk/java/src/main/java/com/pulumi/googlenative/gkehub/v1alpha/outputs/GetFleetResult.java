// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFleetResult {
    /**
     * @return When the Fleet was created.
     * 
     */
    private final String createTime;
    /**
     * @return When the Fleet was deleted.
     * 
     */
    private final String deleteTime;
    /**
     * @return Optional. A user-assigned display name of the Fleet. When present, it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `Production Fleet`
     * 
     */
    private final String displayName;
    /**
     * @return The name for the fleet. The name must meet the following constraints: + The name of a fleet should be unique within the organization; + It must consist of lower case alphanumeric characters or `-`; + The length of the name must be less than or equal to 63; + Unicode names must be expressed in Punycode format (rfc3492). Examples: + prod-fleet + xn--wlq33vhyw9jb （Punycode form for &#34;生产环境&#34;)
     * 
     */
    private final String fleetName;
    /**
     * @return The full, unique resource name of this fleet in the format of `projects/{project}/locations/{location}/fleets/{fleet}`. Each GCP project can have at most one fleet resource, named &#34;default&#34;.
     * 
     */
    private final String name;
    /**
     * @return Google-generated UUID for this resource. This is unique across all Fleet resources. If a Fleet resource is deleted and another resource with the same name is created, it gets a different uid.
     * 
     */
    private final String uid;
    /**
     * @return When the Fleet was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetFleetResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fleetName") String fleetName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.displayName = displayName;
        this.fleetName = fleetName;
        this.name = name;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * @return When the Fleet was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return When the Fleet was deleted.
     * 
     */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * @return Optional. A user-assigned display name of the Fleet. When present, it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `Production Fleet`
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The name for the fleet. The name must meet the following constraints: + The name of a fleet should be unique within the organization; + It must consist of lower case alphanumeric characters or `-`; + The length of the name must be less than or equal to 63; + Unicode names must be expressed in Punycode format (rfc3492). Examples: + prod-fleet + xn--wlq33vhyw9jb （Punycode form for &#34;生产环境&#34;)
     * 
     */
    public String fleetName() {
        return this.fleetName;
    }
    /**
     * @return The full, unique resource name of this fleet in the format of `projects/{project}/locations/{location}/fleets/{fleet}`. Each GCP project can have at most one fleet resource, named &#34;default&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Google-generated UUID for this resource. This is unique across all Fleet resources. If a Fleet resource is deleted and another resource with the same name is created, it gets a different uid.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return When the Fleet was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String fleetName;
        private String name;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.fleetName = defaults.fleetName;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder fleetName(String fleetName) {
            this.fleetName = Objects.requireNonNull(fleetName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetFleetResult build() {
            return new GetFleetResult(createTime, deleteTime, displayName, fleetName, name, uid, updateTime);
        }
    }
}
