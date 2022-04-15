// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.outputs;

import io.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceAuthorizationRuleResult {
    /**
     * A string that describes the claim type
     * 
     */
    private final String claimType;
    /**
     * A string that describes the claim value
     * 
     */
    private final String claimValue;
    /**
     * The created time for this rule
     * 
     */
    private final String createdTime;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * A string that describes the authorization rule.
     * 
     */
    private final String keyName;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * The last modified time for this rule
     * 
     */
    private final String modifiedTime;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String primaryKey;
    /**
     * The revision number for the rule
     * 
     */
    private final Integer revision;
    /**
     * The rights associated with the rule.
     * 
     */
    private final @Nullable List<String> rights;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String secondaryKey;
    /**
     * The sku of the created namespace
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNamespaceAuthorizationRuleResult(
        @CustomType.Parameter("claimType") String claimType,
        @CustomType.Parameter("claimValue") String claimValue,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyName") String keyName,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("modifiedTime") String modifiedTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("revision") Integer revision,
        @CustomType.Parameter("rights") @Nullable List<String> rights,
        @CustomType.Parameter("secondaryKey") String secondaryKey,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.claimType = claimType;
        this.claimValue = claimValue;
        this.createdTime = createdTime;
        this.id = id;
        this.keyName = keyName;
        this.location = location;
        this.modifiedTime = modifiedTime;
        this.name = name;
        this.primaryKey = primaryKey;
        this.revision = revision;
        this.rights = rights;
        this.secondaryKey = secondaryKey;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A string that describes the claim type
     * 
    */
    public String claimType() {
        return this.claimType;
    }
    /**
     * A string that describes the claim value
     * 
    */
    public String claimValue() {
        return this.claimValue;
    }
    /**
     * The created time for this rule
     * 
    */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * A string that describes the authorization rule.
     * 
    */
    public String keyName() {
        return this.keyName;
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The last modified time for this rule
     * 
    */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String primaryKey() {
        return this.primaryKey;
    }
    /**
     * The revision number for the rule
     * 
    */
    public Integer revision() {
        return this.revision;
    }
    /**
     * The rights associated with the rule.
     * 
    */
    public List<String> rights() {
        return this.rights == null ? List.of() : this.rights;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * The sku of the created namespace
     * 
    */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String claimType;
        private String claimValue;
        private String createdTime;
        private String id;
        private String keyName;
        private @Nullable String location;
        private String modifiedTime;
        private String name;
        private String primaryKey;
        private Integer revision;
        private @Nullable List<String> rights;
        private String secondaryKey;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimType = defaults.claimType;
    	      this.claimValue = defaults.claimValue;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.keyName = defaults.keyName;
    	      this.location = defaults.location;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.primaryKey = defaults.primaryKey;
    	      this.revision = defaults.revision;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder claimType(String claimType) {
            this.claimType = Objects.requireNonNull(claimType);
            return this;
        }
        public Builder claimValue(String claimValue) {
            this.claimValue = Objects.requireNonNull(claimValue);
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder rights(@Nullable List<String> rights) {
            this.rights = rights;
            return this;
        }
        public Builder rights(String... rights) {
            return rights(List.of(rights));
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNamespaceAuthorizationRuleResult build() {
            return new GetNamespaceAuthorizationRuleResult(claimType, claimValue, createdTime, id, keyName, location, modifiedTime, name, primaryKey, revision, rights, secondaryKey, sku, tags, type);
        }
    }
}
