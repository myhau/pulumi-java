// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssociatedWorkspaceResponse {
    /**
     * The time of workspace association.
     * 
     */
    private final String associateDate;
    /**
     * The ResourceId id the assigned workspace.
     * 
     */
    private final String resourceId;
    /**
     * The id of the assigned workspace.
     * 
     */
    private final String workspaceId;
    /**
     * The name id the assigned workspace.
     * 
     */
    private final String workspaceName;

    @OutputCustomType.Constructor({"associateDate","resourceId","workspaceId","workspaceName"})
    private AssociatedWorkspaceResponse(
        String associateDate,
        String resourceId,
        String workspaceId,
        String workspaceName) {
        this.associateDate = associateDate;
        this.resourceId = resourceId;
        this.workspaceId = workspaceId;
        this.workspaceName = workspaceName;
    }

    /**
     * The time of workspace association.
     * 
    */
    public String getAssociateDate() {
        return this.associateDate;
    }
    /**
     * The ResourceId id the assigned workspace.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The id of the assigned workspace.
     * 
    */
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    /**
     * The name id the assigned workspace.
     * 
    */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociatedWorkspaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associateDate;
        private String resourceId;
        private String workspaceId;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociatedWorkspaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateDate = defaults.associateDate;
    	      this.resourceId = defaults.resourceId;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAssociateDate(String associateDate) {
            this.associateDate = Objects.requireNonNull(associateDate);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public AssociatedWorkspaceResponse build() {
            return new AssociatedWorkspaceResponse(associateDate, resourceId, workspaceId, workspaceName);
        }
    }
}
