// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetThreatIntelligenceIndicatorResult {
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
     * The kind of the entity.
     * 
     */
    private final String kind;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetThreatIntelligenceIndicatorResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.name = name;
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
     * The kind of the entity.
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
     * Azure resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThreatIntelligenceIndicatorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetThreatIntelligenceIndicatorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
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
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetThreatIntelligenceIndicatorResult build() {
            return new GetThreatIntelligenceIndicatorResult(etag, id, kind, name, type);
        }
    }
}
