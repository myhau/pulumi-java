// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLienResult {
    /**
     * @return The creation time of this Lien.
     * 
     */
    private final String createTime;
    /**
     * @return A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
     * 
     */
    private final String name;
    /**
     * @return A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
     * 
     */
    private final String origin;
    /**
     * @return A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
     * 
     */
    private final String parent;
    /**
     * @return Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
     * 
     */
    private final String reason;
    /**
     * @return The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    private final List<String> restrictions;

    @CustomType.Constructor
    private GetLienResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("origin") String origin,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("restrictions") List<String> restrictions) {
        this.createTime = createTime;
        this.name = name;
        this.origin = origin;
        this.parent = parent;
        this.reason = reason;
        this.restrictions = restrictions;
    }

    /**
     * @return The creation time of this Lien.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
     * 
     */
    public String origin() {
        return this.origin;
    }
    /**
     * @return A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
     * 
     */
    public String parent() {
        return this.parent;
    }
    /**
     * @return Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    public List<String> restrictions() {
        return this.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLienResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String name;
        private String origin;
        private String parent;
        private String reason;
        private List<String> restrictions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLienResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.origin = defaults.origin;
    	      this.parent = defaults.parent;
    	      this.reason = defaults.reason;
    	      this.restrictions = defaults.restrictions;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder restrictions(List<String> restrictions) {
            this.restrictions = Objects.requireNonNull(restrictions);
            return this;
        }
        public Builder restrictions(String... restrictions) {
            return restrictions(List.of(restrictions));
        }        public GetLienResult build() {
            return new GetLienResult(createTime, name, origin, parent, reason, restrictions);
        }
    }
}
