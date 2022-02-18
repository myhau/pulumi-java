// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageGetArgs;
import io.pulumi.gcp.notebooks.inputs.EnvironmentVmImageGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentState Empty = new EnvironmentState();

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="containerImage")
    private final @Nullable Input<EnvironmentContainerImageGetArgs> containerImage;

    public Input<EnvironmentContainerImageGetArgs> getContainerImage() {
        return this.containerImage == null ? Input.empty() : this.containerImage;
    }

    /**
     * Instance creation time
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * A brief description of this environment.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Display name of this environment for the UI.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name specified for the Environment instance.
     * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up.
     * The path must be a URL or Cloud Storage path. Example: "gs://path-to-file/file-name"
     * 
     */
    @InputImport(name="postStartupScript")
    private final @Nullable Input<String> postStartupScript;

    public Input<String> getPostStartupScript() {
        return this.postStartupScript == null ? Input.empty() : this.postStartupScript;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="vmImage")
    private final @Nullable Input<EnvironmentVmImageGetArgs> vmImage;

    public Input<EnvironmentVmImageGetArgs> getVmImage() {
        return this.vmImage == null ? Input.empty() : this.vmImage;
    }

    public EnvironmentState(
        @Nullable Input<EnvironmentContainerImageGetArgs> containerImage,
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> postStartupScript,
        @Nullable Input<String> project,
        @Nullable Input<EnvironmentVmImageGetArgs> vmImage) {
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.location = location;
        this.name = name;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.vmImage = vmImage;
    }

    private EnvironmentState() {
        this.containerImage = Input.empty();
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.postStartupScript = Input.empty();
        this.project = Input.empty();
        this.vmImage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvironmentContainerImageGetArgs> containerImage;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> postStartupScript;
        private @Nullable Input<String> project;
        private @Nullable Input<EnvironmentVmImageGetArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setContainerImage(@Nullable Input<EnvironmentContainerImageGetArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }

        public Builder setContainerImage(@Nullable EnvironmentContainerImageGetArgs containerImage) {
            this.containerImage = Input.ofNullable(containerImage);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setPostStartupScript(@Nullable Input<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }

        public Builder setPostStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Input.ofNullable(postStartupScript);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setVmImage(@Nullable Input<EnvironmentVmImageGetArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }

        public Builder setVmImage(@Nullable EnvironmentVmImageGetArgs vmImage) {
            this.vmImage = Input.ofNullable(vmImage);
            return this;
        }

        public EnvironmentState build() {
            return new EnvironmentState(containerImage, createTime, description, displayName, location, name, postStartupScript, project, vmImage);
        }
    }
}
