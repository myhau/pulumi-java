// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.LinkedWorkspacePropsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GetLinkedWorkspaceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") LinkedWorkspacePropsResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * ResourceId of the link of the linked workspace.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Friendly name of the linked workspace.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * LinkedWorkspace specific properties.
     * 
    */
    public LinkedWorkspacePropsResponse properties() {
        return this.properties;
    }
    /**
     * Resource type of linked workspace.
     * 
    */
    public String type() {
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

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(LinkedWorkspacePropsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLinkedWorkspaceResult build() {
            return new GetLinkedWorkspaceResult(id, name, properties, type);
        }
    }
}
