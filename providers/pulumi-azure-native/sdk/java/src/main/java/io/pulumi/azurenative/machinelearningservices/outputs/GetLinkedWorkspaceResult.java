// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.LinkedWorkspacePropsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLinkedWorkspaceResult {
    /**
     * ResourceId of the link of the linked workspace.
     * 
     */
    private final String id;
    /**
     * Friendly name of the linked workspace.
     * 
     */
    private final String name;
    /**
     * LinkedWorkspace specific properties.
     * 
     */
    private final LinkedWorkspacePropsResponse properties;
    /**
     * Resource type of linked workspace.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetLinkedWorkspaceResult(
        String id,
        String name,
        LinkedWorkspacePropsResponse properties,
        String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * ResourceId of the link of the linked workspace.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Friendly name of the linked workspace.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * LinkedWorkspace specific properties.
     * 
    */
    public LinkedWorkspacePropsResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource type of linked workspace.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private LinkedWorkspacePropsResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedWorkspaceResult defaults) {
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

        public Builder setProperties(LinkedWorkspacePropsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLinkedWorkspaceResult build() {
            return new GetLinkedWorkspaceResult(id, name, properties, type);
        }
    }
}
