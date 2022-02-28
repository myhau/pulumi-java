// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OntapFileSystemDiskIopsConfiguration {
    /**
     * - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    private final @Nullable String mode;

    @OutputCustomType.Constructor({"iops","mode"})
    private OntapFileSystemDiskIopsConfiguration(
        @Nullable Integer iops,
        @Nullable String mode) {
        this.iops = iops;
        this.mode = mode;
    }

    /**
     * - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemDiskIopsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer iops;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemDiskIopsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.mode = defaults.mode;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public OntapFileSystemDiskIopsConfiguration build() {
            return new OntapFileSystemDiskIopsConfiguration(iops, mode);
        }
    }
}
