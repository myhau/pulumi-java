// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NfsLocationMountOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsLocationMountOptionsGetArgs Empty = new NfsLocationMountOptionsGetArgs();

    /**
     * The specific NFS version that you want DataSync to use for mounting your NFS share. Valid values: `AUTOMATIC`, `NFS3`, `NFS4_0` and `NFS4_1`. Default: `AUTOMATIC`
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NfsLocationMountOptionsGetArgs(@Nullable Input<String> version) {
        this.version = version;
    }

    private NfsLocationMountOptionsGetArgs() {
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsLocationMountOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsLocationMountOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public NfsLocationMountOptionsGetArgs build() {
            return new NfsLocationMountOptionsGetArgs(version);
        }
    }
}
