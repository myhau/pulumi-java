// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemDiskIopsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemDiskIopsConfigurationArgs Empty = new OpenZfsFileSystemDiskIopsConfigurationArgs();

    /**
     * - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public OpenZfsFileSystemDiskIopsConfigurationArgs(
        @Nullable Input<Integer> iops,
        @Nullable Input<String> mode) {
        this.iops = iops;
        this.mode = mode;
    }

    private OpenZfsFileSystemDiskIopsConfigurationArgs() {
        this.iops = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemDiskIopsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> iops;
        private @Nullable Input<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsFileSystemDiskIopsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.mode = defaults.mode;
        }

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }
        public OpenZfsFileSystemDiskIopsConfigurationArgs build() {
            return new OpenZfsFileSystemDiskIopsConfigurationArgs(iops, mode);
        }
    }
}
