// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs();

    /**
     * The default POSIX group ID (GID). If not specified, defaults to `100`. Valid values are `0` and `100`.
     * 
     */
    @InputImport(name="defaultGid")
      private final @Nullable Input<Integer> defaultGid;

    public Input<Integer> getDefaultGid() {
        return this.defaultGid == null ? Input.empty() : this.defaultGid;
    }

    /**
     * The default POSIX user ID (UID). If not specified, defaults to `1000`. Valid values are `0` and `1000`.
     * 
     */
    @InputImport(name="defaultUid")
      private final @Nullable Input<Integer> defaultUid;

    public Input<Integer> getDefaultUid() {
        return this.defaultUid == null ? Input.empty() : this.defaultUid;
    }

    /**
     * The path within the image to mount the user's EFS home directory. The directory should be empty. If not specified, defaults to `/home/sagemaker-user`.
     * 
     */
    @InputImport(name="mountPath")
      private final @Nullable Input<String> mountPath;

    public Input<String> getMountPath() {
        return this.mountPath == null ? Input.empty() : this.mountPath;
    }

    public AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs(
        @Nullable Input<Integer> defaultGid,
        @Nullable Input<Integer> defaultUid,
        @Nullable Input<String> mountPath) {
        this.defaultGid = defaultGid;
        this.defaultUid = defaultUid;
        this.mountPath = mountPath;
    }

    private AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs() {
        this.defaultGid = Input.empty();
        this.defaultUid = Input.empty();
        this.mountPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultGid;
        private @Nullable Input<Integer> defaultUid;
        private @Nullable Input<String> mountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGid = defaults.defaultGid;
    	      this.defaultUid = defaults.defaultUid;
    	      this.mountPath = defaults.mountPath;
        }

        public Builder setDefaultGid(@Nullable Input<Integer> defaultGid) {
            this.defaultGid = defaultGid;
            return this;
        }

        public Builder setDefaultGid(@Nullable Integer defaultGid) {
            this.defaultGid = Input.ofNullable(defaultGid);
            return this;
        }

        public Builder setDefaultUid(@Nullable Input<Integer> defaultUid) {
            this.defaultUid = defaultUid;
            return this;
        }

        public Builder setDefaultUid(@Nullable Integer defaultUid) {
            this.defaultUid = Input.ofNullable(defaultUid);
            return this;
        }

        public Builder setMountPath(@Nullable Input<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder setMountPath(@Nullable String mountPath) {
            this.mountPath = Input.ofNullable(mountPath);
            return this;
        }
        public AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs build() {
            return new AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs(defaultGid, defaultUid, mountPath);
        }
    }
}
