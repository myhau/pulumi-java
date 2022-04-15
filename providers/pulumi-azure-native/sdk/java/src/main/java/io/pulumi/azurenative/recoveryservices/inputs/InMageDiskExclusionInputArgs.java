// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.InMageDiskSignatureExclusionOptionsArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageVolumeExclusionOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DiskExclusionInput when doing enable protection of virtual machine in InMage provider.
 * 
 */
public final class InMageDiskExclusionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageDiskExclusionInputArgs Empty = new InMageDiskExclusionInputArgs();

    /**
     * The guest disk signature based option for disk exclusion.
     * 
     */
    @Import(name="diskSignatureOptions")
      private final @Nullable Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions;

    public Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions() {
        return this.diskSignatureOptions == null ? Codegen.empty() : this.diskSignatureOptions;
    }

    /**
     * The volume label based option for disk exclusion.
     * 
     */
    @Import(name="volumeOptions")
      private final @Nullable Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions;

    public Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions() {
        return this.volumeOptions == null ? Codegen.empty() : this.volumeOptions;
    }

    public InMageDiskExclusionInputArgs(
        @Nullable Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions,
        @Nullable Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions) {
        this.diskSignatureOptions = diskSignatureOptions;
        this.volumeOptions = volumeOptions;
    }

    private InMageDiskExclusionInputArgs() {
        this.diskSignatureOptions = Codegen.empty();
        this.volumeOptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageDiskExclusionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions;
        private @Nullable Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageDiskExclusionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSignatureOptions = defaults.diskSignatureOptions;
    	      this.volumeOptions = defaults.volumeOptions;
        }

        public Builder diskSignatureOptions(@Nullable Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions) {
            this.diskSignatureOptions = diskSignatureOptions;
            return this;
        }
        public Builder diskSignatureOptions(@Nullable List<InMageDiskSignatureExclusionOptionsArgs> diskSignatureOptions) {
            this.diskSignatureOptions = Codegen.ofNullable(diskSignatureOptions);
            return this;
        }
        public Builder diskSignatureOptions(InMageDiskSignatureExclusionOptionsArgs... diskSignatureOptions) {
            return diskSignatureOptions(List.of(diskSignatureOptions));
        }
        public Builder volumeOptions(@Nullable Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions) {
            this.volumeOptions = volumeOptions;
            return this;
        }
        public Builder volumeOptions(@Nullable List<InMageVolumeExclusionOptionsArgs> volumeOptions) {
            this.volumeOptions = Codegen.ofNullable(volumeOptions);
            return this;
        }
        public Builder volumeOptions(InMageVolumeExclusionOptionsArgs... volumeOptions) {
            return volumeOptions(List.of(volumeOptions));
        }        public InMageDiskExclusionInputArgs build() {
            return new InMageDiskExclusionInputArgs(diskSignatureOptions, volumeOptions);
        }
    }
}
