// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final CxEnvironmentState Empty = new CxEnvironmentState();

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the environment.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Agent to create an Environment for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @InputImport(name="parent")
    private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * Update time of this environment. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     * Structure is documented below.
     * 
     */
    @InputImport(name="versionConfigs")
    private final @Nullable Input<List<CxEnvironmentVersionConfigGetArgs>> versionConfigs;

    public Input<List<CxEnvironmentVersionConfigGetArgs>> getVersionConfigs() {
        return this.versionConfigs == null ? Input.empty() : this.versionConfigs;
    }

    public CxEnvironmentState(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> parent,
        @Nullable Input<String> updateTime,
        @Nullable Input<List<CxEnvironmentVersionConfigGetArgs>> versionConfigs) {
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.parent = parent;
        this.updateTime = updateTime;
        this.versionConfigs = versionConfigs;
    }

    private CxEnvironmentState() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
        this.updateTime = Input.empty();
        this.versionConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<List<CxEnvironmentVersionConfigGetArgs>> versionConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.updateTime = defaults.updateTime;
    	      this.versionConfigs = defaults.versionConfigs;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setVersionConfigs(@Nullable Input<List<CxEnvironmentVersionConfigGetArgs>> versionConfigs) {
            this.versionConfigs = versionConfigs;
            return this;
        }

        public Builder setVersionConfigs(@Nullable List<CxEnvironmentVersionConfigGetArgs> versionConfigs) {
            this.versionConfigs = Input.ofNullable(versionConfigs);
            return this;
        }

        public CxEnvironmentState build() {
            return new CxEnvironmentState(description, displayName, name, parent, updateTime, versionConfigs);
        }
    }
}
