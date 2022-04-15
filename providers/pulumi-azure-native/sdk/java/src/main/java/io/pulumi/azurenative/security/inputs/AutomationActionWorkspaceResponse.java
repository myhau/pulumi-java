// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Log Analytics Workspace to which event data will be exported. Security alerts data will reside in the 'SecurityAlert' table and the assessments data will reside in the 'SecurityRecommendation' table (under the 'Security'/'SecurityCenterFree' solutions). Note that in order to view the data in the workspace, the Security Center Log Analytics free/standard solution needs to be enabled on that workspace. To learn more about Security Center continuous export capabilities, visit https://aka.ms/ASCExportLearnMore
 * 
 */
public final class AutomationActionWorkspaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationActionWorkspaceResponse Empty = new AutomationActionWorkspaceResponse();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'Workspace'.
     * 
     */
    @Import(name="actionType", required=true)
      private final String actionType;

    public String actionType() {
        return this.actionType;
    }

    /**
     * The fully qualified Log Analytics Workspace Azure Resource ID.
     * 
     */
    @Import(name="workspaceResourceId")
      private final @Nullable String workspaceResourceId;

    public Optional<String> workspaceResourceId() {
        return this.workspaceResourceId == null ? Optional.empty() : Optional.ofNullable(this.workspaceResourceId);
    }

    public AutomationActionWorkspaceResponse(
        String actionType,
        @Nullable String workspaceResourceId) {
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.workspaceResourceId = workspaceResourceId;
    }

    private AutomationActionWorkspaceResponse() {
        this.actionType = null;
        this.workspaceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionWorkspaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionWorkspaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }        public AutomationActionWorkspaceResponse build() {
            return new AutomationActionWorkspaceResponse(actionType, workspaceResourceId);
        }
    }
}
