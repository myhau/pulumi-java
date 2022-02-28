// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineThumbnailConfigPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineThumbnailConfigPermissionArgs Empty = new PipelineThumbnailConfigPermissionArgs();

    /**
     * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    @InputImport(name="accesses")
      private final @Nullable Input<List<String>> accesses;

    public Input<List<String>> getAccesses() {
        return this.accesses == null ? Input.empty() : this.accesses;
    }

    /**
     * The AWS user or group that you want to have access to thumbnail files.
     * 
     */
    @InputImport(name="grantee")
      private final @Nullable Input<String> grantee;

    public Input<String> getGrantee() {
        return this.grantee == null ? Input.empty() : this.grantee;
    }

    /**
     * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    @InputImport(name="granteeType")
      private final @Nullable Input<String> granteeType;

    public Input<String> getGranteeType() {
        return this.granteeType == null ? Input.empty() : this.granteeType;
    }

    public PipelineThumbnailConfigPermissionArgs(
        @Nullable Input<List<String>> accesses,
        @Nullable Input<String> grantee,
        @Nullable Input<String> granteeType) {
        this.accesses = accesses;
        this.grantee = grantee;
        this.granteeType = granteeType;
    }

    private PipelineThumbnailConfigPermissionArgs() {
        this.accesses = Input.empty();
        this.grantee = Input.empty();
        this.granteeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineThumbnailConfigPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accesses;
        private @Nullable Input<String> grantee;
        private @Nullable Input<String> granteeType;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineThumbnailConfigPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.grantee = defaults.grantee;
    	      this.granteeType = defaults.granteeType;
        }

        public Builder setAccesses(@Nullable Input<List<String>> accesses) {
            this.accesses = accesses;
            return this;
        }

        public Builder setAccesses(@Nullable List<String> accesses) {
            this.accesses = Input.ofNullable(accesses);
            return this;
        }

        public Builder setGrantee(@Nullable Input<String> grantee) {
            this.grantee = grantee;
            return this;
        }

        public Builder setGrantee(@Nullable String grantee) {
            this.grantee = Input.ofNullable(grantee);
            return this;
        }

        public Builder setGranteeType(@Nullable Input<String> granteeType) {
            this.granteeType = granteeType;
            return this;
        }

        public Builder setGranteeType(@Nullable String granteeType) {
            this.granteeType = Input.ofNullable(granteeType);
            return this;
        }
        public PipelineThumbnailConfigPermissionArgs build() {
            return new PipelineThumbnailConfigPermissionArgs(accesses, grantee, granteeType);
        }
    }
}
