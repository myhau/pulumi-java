// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.DiskEncryptionTarget;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
 * 
 */
public final class DiskEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionConfigurationArgs Empty = new DiskEncryptionConfigurationArgs();

    /**
     * On Linux pool, only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     * 
     */
    @Import(name="targets")
      private final @Nullable Output<List<DiskEncryptionTarget>> targets;

    public Output<List<DiskEncryptionTarget>> targets() {
        return this.targets == null ? Codegen.empty() : this.targets;
    }

    public DiskEncryptionConfigurationArgs(@Nullable Output<List<DiskEncryptionTarget>> targets) {
        this.targets = targets;
    }

    private DiskEncryptionConfigurationArgs() {
        this.targets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DiskEncryptionTarget>> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targets = defaults.targets;
        }

        public Builder targets(@Nullable Output<List<DiskEncryptionTarget>> targets) {
            this.targets = targets;
            return this;
        }
        public Builder targets(@Nullable List<DiskEncryptionTarget> targets) {
            this.targets = Codegen.ofNullable(targets);
            return this;
        }
        public Builder targets(DiskEncryptionTarget... targets) {
            return targets(List.of(targets));
        }        public DiskEncryptionConfigurationArgs build() {
            return new DiskEncryptionConfigurationArgs(targets);
        }
    }
}
