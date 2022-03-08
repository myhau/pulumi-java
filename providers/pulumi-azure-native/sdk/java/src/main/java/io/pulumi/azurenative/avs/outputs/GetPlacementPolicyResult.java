// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.VmHostPlacementPolicyPropertiesResponse;
import io.pulumi.azurenative.avs.outputs.VmVmPlacementPolicyPropertiesResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPlacementPolicyResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * placement policy properties
     * 
     */
    private final Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse> properties;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetPlacementPolicyResult(
        String id,
        String name,
        Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse> properties,
        String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * placement policy properties
     * 
    */
    public Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPlacementPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Either<VmHostPlacementPolicyPropertiesResponse,VmVmPlacementPolicyPropertiesResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPlacementPolicyResult build() {
            return new GetPlacementPolicyResult(id, name, properties, type);
        }
    }
}
