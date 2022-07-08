// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTagTemplateResult {
    /**
     * @return Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum length is 200 characters.
     * 
     */
    private final String displayName;
    /**
     * @return Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
     * 
     */
    private final Map<String,String> fields;
    /**
     * @return Indicates whether tags created with this template are public. Public tags do not require tag template access to appear in ListTags API response. Additionally, you can search for a public tag by value with a simple search query in addition to using a ``tag:`` predicate.
     * 
     */
    private final Boolean isPubliclyReadable;
    /**
     * @return The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetTagTemplateResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fields") Map<String,String> fields,
        @CustomType.Parameter("isPubliclyReadable") Boolean isPubliclyReadable,
        @CustomType.Parameter("name") String name) {
        this.displayName = displayName;
        this.fields = fields;
        this.isPubliclyReadable = isPubliclyReadable;
        this.name = name;
    }

    /**
     * @return Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum length is 200 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
     * 
     */
    public Map<String,String> fields() {
        return this.fields;
    }
    /**
     * @return Indicates whether tags created with this template are public. Public tags do not require tag template access to appear in ListTags API response. Additionally, you can search for a public tag by value with a simple search query in addition to using a ``tag:`` predicate.
     * 
     */
    public Boolean isPubliclyReadable() {
        return this.isPubliclyReadable;
    }
    /**
     * @return The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Map<String,String> fields;
        private Boolean isPubliclyReadable;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.isPubliclyReadable = defaults.isPubliclyReadable;
    	      this.name = defaults.name;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder fields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder isPubliclyReadable(Boolean isPubliclyReadable) {
            this.isPubliclyReadable = Objects.requireNonNull(isPubliclyReadable);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetTagTemplateResult build() {
            return new GetTagTemplateResult(displayName, fields, isPubliclyReadable, name);
        }
    }
}
