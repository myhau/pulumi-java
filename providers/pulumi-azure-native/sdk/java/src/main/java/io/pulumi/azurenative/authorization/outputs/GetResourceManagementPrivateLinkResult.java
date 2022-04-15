// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ResourceManagementPrivateLinkEndpointConnectionsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceManagementPrivateLinkResult {
    /**
     * The rmplResourceID.
     * 
     */
    private final String id;
    /**
     * the region of the rmpl
     * 
     */
    private final @Nullable String location;
    /**
     * The rmpl Name.
     * 
     */
    private final String name;
    private final ResourceManagementPrivateLinkEndpointConnectionsResponse properties;
    /**
     * The operation type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetResourceManagementPrivateLinkResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") ResourceManagementPrivateLinkEndpointConnectionsResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * The rmplResourceID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * the region of the rmpl
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The rmpl Name.
     * 
    */
    public String name() {
        return this.name;
    }
    public ResourceManagementPrivateLinkEndpointConnectionsResponse properties() {
        return this.properties;
    }
    /**
     * The operation type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceManagementPrivateLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private ResourceManagementPrivateLinkEndpointConnectionsResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceManagementPrivateLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(ResourceManagementPrivateLinkEndpointConnectionsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetResourceManagementPrivateLinkResult build() {
            return new GetResourceManagementPrivateLinkResult(id, location, name, properties, type);
        }
    }
}
