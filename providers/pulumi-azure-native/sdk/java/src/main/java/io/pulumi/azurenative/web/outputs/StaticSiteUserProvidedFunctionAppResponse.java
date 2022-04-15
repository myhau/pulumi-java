// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticSiteUserProvidedFunctionAppResponse {
    /**
     * The date and time on which the function app was registered with the static site.
     * 
     */
    private final String createdOn;
    /**
     * The region of the function app registered with the static site
     * 
     */
    private final @Nullable String functionAppRegion;
    /**
     * The resource id of the function app registered with the static site
     * 
     */
    private final @Nullable String functionAppResourceId;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private StaticSiteUserProvidedFunctionAppResponse(
        @CustomType.Parameter("createdOn") String createdOn,
        @CustomType.Parameter("functionAppRegion") @Nullable String functionAppRegion,
        @CustomType.Parameter("functionAppResourceId") @Nullable String functionAppResourceId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.createdOn = createdOn;
        this.functionAppRegion = functionAppRegion;
        this.functionAppResourceId = functionAppResourceId;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.type = type;
    }

    /**
     * The date and time on which the function app was registered with the static site.
     * 
    */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * The region of the function app registered with the static site
     * 
    */
    public Optional<String> functionAppRegion() {
        return Optional.ofNullable(this.functionAppRegion);
    }
    /**
     * The resource id of the function app registered with the static site
     * 
    */
    public Optional<String> functionAppResourceId() {
        return Optional.ofNullable(this.functionAppResourceId);
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteUserProvidedFunctionAppResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdOn;
        private @Nullable String functionAppRegion;
        private @Nullable String functionAppResourceId;
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteUserProvidedFunctionAppResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.functionAppRegion = defaults.functionAppRegion;
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        public Builder functionAppRegion(@Nullable String functionAppRegion) {
            this.functionAppRegion = functionAppRegion;
            return this;
        }
        public Builder functionAppResourceId(@Nullable String functionAppResourceId) {
            this.functionAppResourceId = functionAppResourceId;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public StaticSiteUserProvidedFunctionAppResponse build() {
            return new StaticSiteUserProvidedFunctionAppResponse(createdOn, functionAppRegion, functionAppResourceId, id, kind, name, type);
        }
    }
}
