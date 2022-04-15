// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.ManagementGroupLogSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementGroupDiagnosticSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementGroupDiagnosticSettingArgs Empty = new ManagementGroupDiagnosticSettingArgs();

    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Import(name="eventHubAuthorizationRuleId")
      private final @Nullable Output<String> eventHubAuthorizationRuleId;

    public Output<String> eventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId == null ? Codegen.empty() : this.eventHubAuthorizationRuleId;
    }

    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Import(name="eventHubName")
      private final @Nullable Output<String> eventHubName;

    public Output<String> eventHubName() {
        return this.eventHubName == null ? Codegen.empty() : this.eventHubName;
    }

    /**
     * Location of the resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The list of logs settings.
     * 
     */
    @Import(name="logs")
      private final @Nullable Output<List<ManagementGroupLogSettingsArgs>> logs;

    public Output<List<ManagementGroupLogSettingsArgs>> logs() {
        return this.logs == null ? Codegen.empty() : this.logs;
    }

    /**
     * The management group id.
     * 
     */
    @Import(name="managementGroupId", required=true)
      private final Output<String> managementGroupId;

    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Import(name="serviceBusRuleId")
      private final @Nullable Output<String> serviceBusRuleId;

    public Output<String> serviceBusRuleId() {
        return this.serviceBusRuleId == null ? Codegen.empty() : this.serviceBusRuleId;
    }

    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable Output<String> storageAccountId;

    public Output<String> storageAccountId() {
        return this.storageAccountId == null ? Codegen.empty() : this.storageAccountId;
    }

    /**
     * The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Import(name="workspaceId")
      private final @Nullable Output<String> workspaceId;

    public Output<String> workspaceId() {
        return this.workspaceId == null ? Codegen.empty() : this.workspaceId;
    }

    public ManagementGroupDiagnosticSettingArgs(
        @Nullable Output<String> eventHubAuthorizationRuleId,
        @Nullable Output<String> eventHubName,
        @Nullable Output<String> location,
        @Nullable Output<List<ManagementGroupLogSettingsArgs>> logs,
        Output<String> managementGroupId,
        @Nullable Output<String> name,
        @Nullable Output<String> serviceBusRuleId,
        @Nullable Output<String> storageAccountId,
        @Nullable Output<String> workspaceId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        this.eventHubName = eventHubName;
        this.location = location;
        this.logs = logs;
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.name = name;
        this.serviceBusRuleId = serviceBusRuleId;
        this.storageAccountId = storageAccountId;
        this.workspaceId = workspaceId;
    }

    private ManagementGroupDiagnosticSettingArgs() {
        this.eventHubAuthorizationRuleId = Codegen.empty();
        this.eventHubName = Codegen.empty();
        this.location = Codegen.empty();
        this.logs = Codegen.empty();
        this.managementGroupId = Codegen.empty();
        this.name = Codegen.empty();
        this.serviceBusRuleId = Codegen.empty();
        this.storageAccountId = Codegen.empty();
        this.workspaceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupDiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eventHubAuthorizationRuleId;
        private @Nullable Output<String> eventHubName;
        private @Nullable Output<String> location;
        private @Nullable Output<List<ManagementGroupLogSettingsArgs>> logs;
        private Output<String> managementGroupId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> serviceBusRuleId;
        private @Nullable Output<String> storageAccountId;
        private @Nullable Output<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupDiagnosticSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubAuthorizationRuleId = defaults.eventHubAuthorizationRuleId;
    	      this.eventHubName = defaults.eventHubName;
    	      this.location = defaults.location;
    	      this.logs = defaults.logs;
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.name = defaults.name;
    	      this.serviceBusRuleId = defaults.serviceBusRuleId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder eventHubAuthorizationRuleId(@Nullable Output<String> eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
            return this;
        }
        public Builder eventHubAuthorizationRuleId(@Nullable String eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = Codegen.ofNullable(eventHubAuthorizationRuleId);
            return this;
        }
        public Builder eventHubName(@Nullable Output<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = Codegen.ofNullable(eventHubName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder logs(@Nullable Output<List<ManagementGroupLogSettingsArgs>> logs) {
            this.logs = logs;
            return this;
        }
        public Builder logs(@Nullable List<ManagementGroupLogSettingsArgs> logs) {
            this.logs = Codegen.ofNullable(logs);
            return this;
        }
        public Builder logs(ManagementGroupLogSettingsArgs... logs) {
            return logs(List.of(logs));
        }
        public Builder managementGroupId(Output<String> managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }
        public Builder managementGroupId(String managementGroupId) {
            this.managementGroupId = Output.of(Objects.requireNonNull(managementGroupId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder serviceBusRuleId(@Nullable Output<String> serviceBusRuleId) {
            this.serviceBusRuleId = serviceBusRuleId;
            return this;
        }
        public Builder serviceBusRuleId(@Nullable String serviceBusRuleId) {
            this.serviceBusRuleId = Codegen.ofNullable(serviceBusRuleId);
            return this;
        }
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Codegen.ofNullable(storageAccountId);
            return this;
        }
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = Codegen.ofNullable(workspaceId);
            return this;
        }        public ManagementGroupDiagnosticSettingArgs build() {
            return new ManagementGroupDiagnosticSettingArgs(eventHubAuthorizationRuleId, eventHubName, location, logs, managementGroupId, name, serviceBusRuleId, storageAccountId, workspaceId);
        }
    }
}
