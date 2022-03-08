// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationMuteConfigResult {
    /**
     * The time at which the mute config was created. This field is set by the server and will be ignored if provided on config creation.
     * 
     */
    private final String createTime;
    /**
     * A description of the mute config.
     * 
     */
    private final String description;
    /**
     * The human readable name to be displayed for the mute config.
     * 
     */
    private final String displayName;
    /**
     * An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
     * 
     */
    private final String filter;
    /**
     * Email address of the user who last edited the mute config. This field is set by the server and will be ignored if provided on config creation or update.
     * 
     */
    private final String mostRecentEditor;
    /**
     * This field will be ignored if provided on config creation. Format "organizations/{organization}/muteConfigs/{mute_config}" "folders/{folder}/muteConfigs/{mute_config}" "projects/{project}/muteConfigs/{mute_config}"
     * 
     */
    private final String name;
    /**
     * The most recent time at which the mute config was updated. This field is set by the server and will be ignored if provided on config creation or update.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","displayName","filter","mostRecentEditor","name","updateTime"})
    private GetOrganizationMuteConfigResult(
        String createTime,
        String description,
        String displayName,
        String filter,
        String mostRecentEditor,
        String name,
        String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.filter = filter;
        this.mostRecentEditor = mostRecentEditor;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * The time at which the mute config was created. This field is set by the server and will be ignored if provided on config creation.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * A description of the mute config.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human readable name to be displayed for the mute config.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * Email address of the user who last edited the mute config. This field is set by the server and will be ignored if provided on config creation or update.
     * 
    */
    public String getMostRecentEditor() {
        return this.mostRecentEditor;
    }
    /**
     * This field will be ignored if provided on config creation. Format "organizations/{organization}/muteConfigs/{mute_config}" "folders/{folder}/muteConfigs/{mute_config}" "projects/{project}/muteConfigs/{mute_config}"
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The most recent time at which the mute config was updated. This field is set by the server and will be ignored if provided on config creation or update.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationMuteConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private String filter;
        private String mostRecentEditor;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationMuteConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.mostRecentEditor = defaults.mostRecentEditor;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setMostRecentEditor(String mostRecentEditor) {
            this.mostRecentEditor = Objects.requireNonNull(mostRecentEditor);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetOrganizationMuteConfigResult build() {
            return new GetOrganizationMuteConfigResult(createTime, description, displayName, filter, mostRecentEditor, name, updateTime);
        }
    }
}
