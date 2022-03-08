// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketRetentionPolicy {
    /**
     * If set to `true`, the bucket will be [locked](https://cloud.google.com/storage/docs/using-bucket-lock#lock-bucket) and permanently restrict edits to the bucket's retention policy.  Caution: Locking a bucket is an irreversible action.
     * 
     */
    private final @Nullable Boolean isLocked;
    /**
     * The period of time, in seconds, that objects in the bucket must be retained and cannot be deleted, overwritten, or archived. The value must be less than 2,147,483,647 seconds.
     * 
     */
    private final Integer retentionPeriod;

    @OutputCustomType.Constructor({"isLocked","retentionPeriod"})
    private BucketRetentionPolicy(
        @Nullable Boolean isLocked,
        Integer retentionPeriod) {
        this.isLocked = isLocked;
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * If set to `true`, the bucket will be [locked](https://cloud.google.com/storage/docs/using-bucket-lock#lock-bucket) and permanently restrict edits to the bucket's retention policy.  Caution: Locking a bucket is an irreversible action.
     * 
    */
    public Optional<Boolean> getIsLocked() {
        return Optional.ofNullable(this.isLocked);
    }
    /**
     * The period of time, in seconds, that objects in the bucket must be retained and cannot be deleted, overwritten, or archived. The value must be less than 2,147,483,647 seconds.
     * 
    */
    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isLocked;
        private Integer retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLocked = defaults.isLocked;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder setIsLocked(@Nullable Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        public Builder setRetentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }
        public BucketRetentionPolicy build() {
            return new BucketRetentionPolicy(isLocked, retentionPeriod);
        }
    }
}
