// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketVersioning {
    /**
     * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    private final @Nullable Boolean mfaDelete;

    @OutputCustomType.Constructor({"enabled","mfaDelete"})
    private BucketVersioning(
        @Nullable Boolean enabled,
        @Nullable Boolean mfaDelete) {
        this.enabled = enabled;
        this.mfaDelete = mfaDelete;
    }

    /**
     * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    public Optional<Boolean> getMfaDelete() {
        return Optional.ofNullable(this.mfaDelete);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean mfaDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketVersioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.mfaDelete = defaults.mfaDelete;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setMfaDelete(@Nullable Boolean mfaDelete) {
            this.mfaDelete = mfaDelete;
            return this;
        }
        public BucketVersioning build() {
            return new BucketVersioning(enabled, mfaDelete);
        }
    }
}
