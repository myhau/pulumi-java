// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.ContainerImageResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.VmImageResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * Use a container image to start the notebook instance.
     * 
     */
    private final ContainerImageResponse containerImage;
    /**
     * The time at which this environment was created.
     * 
     */
    private final String createTime;
    /**
     * A brief description of this environment.
     * 
     */
    private final String description;
    /**
     * Display name of this environment for the UI.
     * 
     */
    private final String displayName;
    /**
     * Name of this environment. Format: `projects/{project_id}/locations/{location}/environments/{environment_id}`
     * 
     */
    private final String name;
    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `"gs://path-to-file/file-name"`
     * 
     */
    private final String postStartupScript;
    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    private final VmImageResponse vmImage;

    @OutputCustomType.Constructor({"containerImage","createTime","description","displayName","name","postStartupScript","vmImage"})
    private GetEnvironmentResult(
        ContainerImageResponse containerImage,
        String createTime,
        String description,
        String displayName,
        String name,
        String postStartupScript,
        VmImageResponse vmImage) {
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.postStartupScript = postStartupScript;
        this.vmImage = vmImage;
    }

    /**
     * Use a container image to start the notebook instance.
     * 
    */
    public ContainerImageResponse getContainerImage() {
        return this.containerImage;
    }
    /**
     * The time at which this environment was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * A brief description of this environment.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name of this environment for the UI.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Name of this environment. Format: `projects/{project_id}/locations/{location}/environments/{environment_id}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `"gs://path-to-file/file-name"`
     * 
    */
    public String getPostStartupScript() {
        return this.postStartupScript;
    }
    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * 
    */
    public VmImageResponse getVmImage() {
        return this.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerImageResponse containerImage;
        private String createTime;
        private String description;
        private String displayName;
        private String name;
        private String postStartupScript;
        private VmImageResponse vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setContainerImage(ContainerImageResponse containerImage) {
            this.containerImage = Objects.requireNonNull(containerImage);
            return this;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPostStartupScript(String postStartupScript) {
            this.postStartupScript = Objects.requireNonNull(postStartupScript);
            return this;
        }

        public Builder setVmImage(VmImageResponse vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }
        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(containerImage, createTime, description, displayName, name, postStartupScript, vmImage);
        }
    }
}
