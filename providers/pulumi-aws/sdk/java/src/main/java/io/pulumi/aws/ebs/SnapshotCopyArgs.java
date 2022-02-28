// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotCopyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotCopyArgs Empty = new SnapshotCopyArgs();

    /**
     * A description of what the snapshot is.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @InputImport(name="encrypted")
      private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @InputImport(name="permanentRestore")
      private final @Nullable Input<Boolean> permanentRestore;

    public Input<Boolean> getPermanentRestore() {
        return this.permanentRestore == null ? Input.empty() : this.permanentRestore;
    }

    /**
     * The region of the source snapshot.
     * 
     */
    @InputImport(name="sourceRegion", required=true)
      private final Input<String> sourceRegion;

    public Input<String> getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The ARN for the snapshot to be copied.
     * 
     */
    @InputImport(name="sourceSnapshotId", required=true)
      private final Input<String> sourceSnapshotId;

    public Input<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @InputImport(name="storageTier")
      private final @Nullable Input<String> storageTier;

    public Input<String> getStorageTier() {
        return this.storageTier == null ? Input.empty() : this.storageTier;
    }

    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @InputImport(name="temporaryRestoreDays")
      private final @Nullable Input<Integer> temporaryRestoreDays;

    public Input<Integer> getTemporaryRestoreDays() {
        return this.temporaryRestoreDays == null ? Input.empty() : this.temporaryRestoreDays;
    }

    public SnapshotCopyArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<Boolean> permanentRestore,
        Input<String> sourceRegion,
        Input<String> sourceSnapshotId,
        @Nullable Input<String> storageTier,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> temporaryRestoreDays) {
        this.description = description;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.permanentRestore = permanentRestore;
        this.sourceRegion = Objects.requireNonNull(sourceRegion, "expected parameter 'sourceRegion' to be non-null");
        this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId, "expected parameter 'sourceSnapshotId' to be non-null");
        this.storageTier = storageTier;
        this.tags = tags;
        this.temporaryRestoreDays = temporaryRestoreDays;
    }

    private SnapshotCopyArgs() {
        this.description = Input.empty();
        this.encrypted = Input.empty();
        this.kmsKeyId = Input.empty();
        this.permanentRestore = Input.empty();
        this.sourceRegion = Input.empty();
        this.sourceSnapshotId = Input.empty();
        this.storageTier = Input.empty();
        this.tags = Input.empty();
        this.temporaryRestoreDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<Boolean> permanentRestore;
        private Input<String> sourceRegion;
        private Input<String> sourceSnapshotId;
        private @Nullable Input<String> storageTier;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> temporaryRestoreDays;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotCopyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.permanentRestore = defaults.permanentRestore;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.storageTier = defaults.storageTier;
    	      this.tags = defaults.tags;
    	      this.temporaryRestoreDays = defaults.temporaryRestoreDays;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncrypted(@Nullable Input<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = Input.ofNullable(encrypted);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setPermanentRestore(@Nullable Input<Boolean> permanentRestore) {
            this.permanentRestore = permanentRestore;
            return this;
        }

        public Builder setPermanentRestore(@Nullable Boolean permanentRestore) {
            this.permanentRestore = Input.ofNullable(permanentRestore);
            return this;
        }

        public Builder setSourceRegion(Input<String> sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }

        public Builder setSourceRegion(String sourceRegion) {
            this.sourceRegion = Input.of(Objects.requireNonNull(sourceRegion));
            return this;
        }

        public Builder setSourceSnapshotId(Input<String> sourceSnapshotId) {
            this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId);
            return this;
        }

        public Builder setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = Input.of(Objects.requireNonNull(sourceSnapshotId));
            return this;
        }

        public Builder setStorageTier(@Nullable Input<String> storageTier) {
            this.storageTier = storageTier;
            return this;
        }

        public Builder setStorageTier(@Nullable String storageTier) {
            this.storageTier = Input.ofNullable(storageTier);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTemporaryRestoreDays(@Nullable Input<Integer> temporaryRestoreDays) {
            this.temporaryRestoreDays = temporaryRestoreDays;
            return this;
        }

        public Builder setTemporaryRestoreDays(@Nullable Integer temporaryRestoreDays) {
            this.temporaryRestoreDays = Input.ofNullable(temporaryRestoreDays);
            return this;
        }
        public SnapshotCopyArgs build() {
            return new SnapshotCopyArgs(description, encrypted, kmsKeyId, permanentRestore, sourceRegion, sourceSnapshotId, storageTier, tags, temporaryRestoreDays);
        }
    }
}
