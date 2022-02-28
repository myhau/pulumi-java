// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeArgs Empty = new TaskDefinitionVolumeArgs();

    /**
     * Configuration block to configure a docker volume. Detailed below.
     * 
     */
    @InputImport(name="dockerVolumeConfiguration")
      private final @Nullable Input<TaskDefinitionVolumeDockerVolumeConfigurationArgs> dockerVolumeConfiguration;

    public Input<TaskDefinitionVolumeDockerVolumeConfigurationArgs> getDockerVolumeConfiguration() {
        return this.dockerVolumeConfiguration == null ? Input.empty() : this.dockerVolumeConfiguration;
    }

    /**
     * Configuration block for an EFS volume. Detailed below.
     * 
     */
    @InputImport(name="efsVolumeConfiguration")
      private final @Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationArgs> efsVolumeConfiguration;

    public Input<TaskDefinitionVolumeEfsVolumeConfigurationArgs> getEfsVolumeConfiguration() {
        return this.efsVolumeConfiguration == null ? Input.empty() : this.efsVolumeConfiguration;
    }

    /**
     * Configuration block for an FSX Windows File Server volume. Detailed below.
     * 
     */
    @InputImport(name="fsxWindowsFileServerVolumeConfiguration")
      private final @Nullable Input<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs> fsxWindowsFileServerVolumeConfiguration;

    public Input<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs> getFsxWindowsFileServerVolumeConfiguration() {
        return this.fsxWindowsFileServerVolumeConfiguration == null ? Input.empty() : this.fsxWindowsFileServerVolumeConfiguration;
    }

    /**
     * Path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
     * 
     */
    @InputImport(name="hostPath")
      private final @Nullable Input<String> hostPath;

    public Input<String> getHostPath() {
        return this.hostPath == null ? Input.empty() : this.hostPath;
    }

    /**
     * Name of the volume. This name is referenced in the `sourceVolume`
     * parameter of container definition in the `mountPoints` section.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public TaskDefinitionVolumeArgs(
        @Nullable Input<TaskDefinitionVolumeDockerVolumeConfigurationArgs> dockerVolumeConfiguration,
        @Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationArgs> efsVolumeConfiguration,
        @Nullable Input<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs> fsxWindowsFileServerVolumeConfiguration,
        @Nullable Input<String> hostPath,
        Input<String> name) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        this.efsVolumeConfiguration = efsVolumeConfiguration;
        this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
        this.hostPath = hostPath;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TaskDefinitionVolumeArgs() {
        this.dockerVolumeConfiguration = Input.empty();
        this.efsVolumeConfiguration = Input.empty();
        this.fsxWindowsFileServerVolumeConfiguration = Input.empty();
        this.hostPath = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskDefinitionVolumeDockerVolumeConfigurationArgs> dockerVolumeConfiguration;
        private @Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationArgs> efsVolumeConfiguration;
        private @Nullable Input<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs> fsxWindowsFileServerVolumeConfiguration;
        private @Nullable Input<String> hostPath;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerVolumeConfiguration = defaults.dockerVolumeConfiguration;
    	      this.efsVolumeConfiguration = defaults.efsVolumeConfiguration;
    	      this.fsxWindowsFileServerVolumeConfiguration = defaults.fsxWindowsFileServerVolumeConfiguration;
    	      this.hostPath = defaults.hostPath;
    	      this.name = defaults.name;
        }

        public Builder setDockerVolumeConfiguration(@Nullable Input<TaskDefinitionVolumeDockerVolumeConfigurationArgs> dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = dockerVolumeConfiguration;
            return this;
        }

        public Builder setDockerVolumeConfiguration(@Nullable TaskDefinitionVolumeDockerVolumeConfigurationArgs dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = Input.ofNullable(dockerVolumeConfiguration);
            return this;
        }

        public Builder setEfsVolumeConfiguration(@Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationArgs> efsVolumeConfiguration) {
            this.efsVolumeConfiguration = efsVolumeConfiguration;
            return this;
        }

        public Builder setEfsVolumeConfiguration(@Nullable TaskDefinitionVolumeEfsVolumeConfigurationArgs efsVolumeConfiguration) {
            this.efsVolumeConfiguration = Input.ofNullable(efsVolumeConfiguration);
            return this;
        }

        public Builder setFsxWindowsFileServerVolumeConfiguration(@Nullable Input<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs> fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
            return this;
        }

        public Builder setFsxWindowsFileServerVolumeConfiguration(@Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = Input.ofNullable(fsxWindowsFileServerVolumeConfiguration);
            return this;
        }

        public Builder setHostPath(@Nullable Input<String> hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder setHostPath(@Nullable String hostPath) {
            this.hostPath = Input.ofNullable(hostPath);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public TaskDefinitionVolumeArgs build() {
            return new TaskDefinitionVolumeArgs(dockerVolumeConfiguration, efsVolumeConfiguration, fsxWindowsFileServerVolumeConfiguration, hostPath, name);
        }
    }
}
