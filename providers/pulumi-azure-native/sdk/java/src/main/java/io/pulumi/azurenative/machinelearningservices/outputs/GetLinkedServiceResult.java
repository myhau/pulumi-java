// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.LinkedServicePropsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLinkedServiceResult {
    /**
     * ResourceId of the link of the linked service.
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * location of the linked service.
     * 
     */
    private final @Nullable String location;
    /**
     * Friendly name of the linked service.
     * 
     */
    private final String name;
    /**
     * LinkedService specific properties.
     * 
     */
    private final LinkedServicePropsResponse properties;
    /**
     * Resource type of linked service.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","type"})
    private GetLinkedServiceResult(
        String id,
        @Nullable IdentityResponse identity,
        @Nullable String location,
        String name,
        LinkedServicePropsResponse properties,
        String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * ResourceId of the link of the linked service.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * location of the linked service.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Friendly name of the linked service.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * LinkedService specific properties.
     * 
    */
    public LinkedServicePropsResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource type of linked service.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String location;
        private String name;
        private LinkedServicePropsResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(LinkedServicePropsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLinkedServiceResult build() {
            return new GetLinkedServiceResult(id, identity, location, name, properties, type);
        }
    }
}
