// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apikeys.v2.outputs.V2RestrictionsResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKeyResult {
    /**
     * @return Annotations is an unstructured key-value map stored with a policy that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * @return A timestamp identifying the time this key was originally created.
     * 
     */
    private final String createTime;
    /**
     * @return A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
     * 
     */
    private final String deleteTime;
    /**
     * @return Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    private final String displayName;
    /**
     * @return A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
     * 
     */
    private final String etag;
    /**
     * @return An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
     * 
     */
    private final String keyString;
    /**
     * @return The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    private final String name;
    /**
     * @return Key restrictions.
     * 
     */
    private final V2RestrictionsResponse restrictions;
    /**
     * @return Unique id in UUID4 format.
     * 
     */
    private final String uid;
    /**
     * @return A timestamp identifying the time this key was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("keyString") String keyString,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("restrictions") V2RestrictionsResponse restrictions,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.annotations = annotations;
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.displayName = displayName;
        this.etag = etag;
        this.keyString = keyString;
        this.name = name;
        this.restrictions = restrictions;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * @return Annotations is an unstructured key-value map stored with a policy that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return A timestamp identifying the time this key was originally created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
     * 
     */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * @return Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
     * 
     */
    public String keyString() {
        return this.keyString;
    }
    /**
     * @return The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Key restrictions.
     * 
     */
    public V2RestrictionsResponse restrictions() {
        return this.restrictions;
    }
    /**
     * @return Unique id in UUID4 format.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return A timestamp identifying the time this key was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String etag;
        private String keyString;
        private String name;
        private V2RestrictionsResponse restrictions;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.keyString = defaults.keyString;
    	      this.name = defaults.name;
    	      this.restrictions = defaults.restrictions;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
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
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder keyString(String keyString) {
            this.keyString = Objects.requireNonNull(keyString);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder restrictions(V2RestrictionsResponse restrictions) {
            this.restrictions = Objects.requireNonNull(restrictions);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetKeyResult build() {
            return new GetKeyResult(annotations, createTime, deleteTime, displayName, etag, keyString, name, restrictions, uid, updateTime);
        }
    }
}
