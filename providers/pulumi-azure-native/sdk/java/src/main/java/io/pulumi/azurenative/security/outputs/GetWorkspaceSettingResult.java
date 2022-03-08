// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetWorkspaceSettingResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * All the VMs in this scope will send their security data to the mentioned workspace unless overridden by a setting with more specific scope
     * 
     */
    private final String scope;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * The full Azure ID of the workspace to save the data in
     * 
     */
    private final String workspaceId;

    @OutputCustomType.Constructor({"id","name","scope","type","workspaceId"})
    private GetWorkspaceSettingResult(
        String id,
        String name,
        String scope,
        String type,
        String workspaceId) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.type = type;
        this.workspaceId = workspaceId;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * All the VMs in this scope will send their security data to the mentioned workspace unless overridden by a setting with more specific scope
     * 
    */
    public String getScope() {
        return this.scope;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The full Azure ID of the workspace to save the data in
     * 
    */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String scope;
        private String type;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public GetWorkspaceSettingResult build() {
            return new GetWorkspaceSettingResult(id, name, scope, type, workspaceId);
        }
    }
}
