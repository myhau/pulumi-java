// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectorySelfServicePermissionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectorySelfServicePermissionsArgs Empty = new DirectorySelfServicePermissionsArgs();

    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
     * 
     */
    @InputImport(name="changeComputeType")
      private final @Nullable Input<Boolean> changeComputeType;

    public Input<Boolean> getChangeComputeType() {
        return this.changeComputeType == null ? Input.empty() : this.changeComputeType;
    }

    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
     * 
     */
    @InputImport(name="increaseVolumeSize")
      private final @Nullable Input<Boolean> increaseVolumeSize;

    public Input<Boolean> getIncreaseVolumeSize() {
        return this.increaseVolumeSize == null ? Input.empty() : this.increaseVolumeSize;
    }

    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
     * 
     */
    @InputImport(name="rebuildWorkspace")
      private final @Nullable Input<Boolean> rebuildWorkspace;

    public Input<Boolean> getRebuildWorkspace() {
        return this.rebuildWorkspace == null ? Input.empty() : this.rebuildWorkspace;
    }

    /**
     * Whether WorkSpaces directory users can restart their workspace. Default `true`.
     * 
     */
    @InputImport(name="restartWorkspace")
      private final @Nullable Input<Boolean> restartWorkspace;

    public Input<Boolean> getRestartWorkspace() {
        return this.restartWorkspace == null ? Input.empty() : this.restartWorkspace;
    }

    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
     * 
     */
    @InputImport(name="switchRunningMode")
      private final @Nullable Input<Boolean> switchRunningMode;

    public Input<Boolean> getSwitchRunningMode() {
        return this.switchRunningMode == null ? Input.empty() : this.switchRunningMode;
    }

    public DirectorySelfServicePermissionsArgs(
        @Nullable Input<Boolean> changeComputeType,
        @Nullable Input<Boolean> increaseVolumeSize,
        @Nullable Input<Boolean> rebuildWorkspace,
        @Nullable Input<Boolean> restartWorkspace,
        @Nullable Input<Boolean> switchRunningMode) {
        this.changeComputeType = changeComputeType;
        this.increaseVolumeSize = increaseVolumeSize;
        this.rebuildWorkspace = rebuildWorkspace;
        this.restartWorkspace = restartWorkspace;
        this.switchRunningMode = switchRunningMode;
    }

    private DirectorySelfServicePermissionsArgs() {
        this.changeComputeType = Input.empty();
        this.increaseVolumeSize = Input.empty();
        this.rebuildWorkspace = Input.empty();
        this.restartWorkspace = Input.empty();
        this.switchRunningMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectorySelfServicePermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> changeComputeType;
        private @Nullable Input<Boolean> increaseVolumeSize;
        private @Nullable Input<Boolean> rebuildWorkspace;
        private @Nullable Input<Boolean> restartWorkspace;
        private @Nullable Input<Boolean> switchRunningMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectorySelfServicePermissionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeComputeType = defaults.changeComputeType;
    	      this.increaseVolumeSize = defaults.increaseVolumeSize;
    	      this.rebuildWorkspace = defaults.rebuildWorkspace;
    	      this.restartWorkspace = defaults.restartWorkspace;
    	      this.switchRunningMode = defaults.switchRunningMode;
        }

        public Builder setChangeComputeType(@Nullable Input<Boolean> changeComputeType) {
            this.changeComputeType = changeComputeType;
            return this;
        }

        public Builder setChangeComputeType(@Nullable Boolean changeComputeType) {
            this.changeComputeType = Input.ofNullable(changeComputeType);
            return this;
        }

        public Builder setIncreaseVolumeSize(@Nullable Input<Boolean> increaseVolumeSize) {
            this.increaseVolumeSize = increaseVolumeSize;
            return this;
        }

        public Builder setIncreaseVolumeSize(@Nullable Boolean increaseVolumeSize) {
            this.increaseVolumeSize = Input.ofNullable(increaseVolumeSize);
            return this;
        }

        public Builder setRebuildWorkspace(@Nullable Input<Boolean> rebuildWorkspace) {
            this.rebuildWorkspace = rebuildWorkspace;
            return this;
        }

        public Builder setRebuildWorkspace(@Nullable Boolean rebuildWorkspace) {
            this.rebuildWorkspace = Input.ofNullable(rebuildWorkspace);
            return this;
        }

        public Builder setRestartWorkspace(@Nullable Input<Boolean> restartWorkspace) {
            this.restartWorkspace = restartWorkspace;
            return this;
        }

        public Builder setRestartWorkspace(@Nullable Boolean restartWorkspace) {
            this.restartWorkspace = Input.ofNullable(restartWorkspace);
            return this;
        }

        public Builder setSwitchRunningMode(@Nullable Input<Boolean> switchRunningMode) {
            this.switchRunningMode = switchRunningMode;
            return this;
        }

        public Builder setSwitchRunningMode(@Nullable Boolean switchRunningMode) {
            this.switchRunningMode = Input.ofNullable(switchRunningMode);
            return this;
        }
        public DirectorySelfServicePermissionsArgs build() {
            return new DirectorySelfServicePermissionsArgs(changeComputeType, increaseVolumeSize, rebuildWorkspace, restartWorkspace, switchRunningMode);
        }
    }
}
