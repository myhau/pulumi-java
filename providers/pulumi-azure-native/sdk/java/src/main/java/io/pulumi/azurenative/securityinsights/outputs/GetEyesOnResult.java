// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEyesOnResult {
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Determines whether the setting is enable or disabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The kind of the setting
     * Expected value is 'EyesOn'.
     * 
     */
    private final String kind;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetEyesOnResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.isEnabled = isEnabled;
        this.kind = kind;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Determines whether the setting is enable or disabled.
     * 
    */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * The kind of the setting
     * Expected value is 'EyesOn'.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Azure resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEyesOnResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private Boolean isEnabled;
        private String kind;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEyesOnResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetEyesOnResult build() {
            return new GetEyesOnResult(etag, id, isEnabled, kind, name, systemData, type);
        }
    }
}
