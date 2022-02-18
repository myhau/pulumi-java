// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferJobTransferSpecTransferOptions {
    /**
     * Whether objects should be deleted from the source after they are transferred to the sink. Note that this option and `delete_objects_unique_in_sink` are mutually exclusive.
     * 
     */
    private final @Nullable Boolean deleteObjectsFromSourceAfterTransfer;
    /**
     * Whether objects that exist only in the sink should be deleted. Note that this option and
     * `delete_objects_from_source_after_transfer` are mutually exclusive.
     * 
     */
    private final @Nullable Boolean deleteObjectsUniqueInSink;
    /**
     * Whether overwriting objects that already exist in the sink is allowed.
     * 
     */
    private final @Nullable Boolean overwriteObjectsAlreadyExistingInSink;

    @OutputCustomType.Constructor({"deleteObjectsFromSourceAfterTransfer","deleteObjectsUniqueInSink","overwriteObjectsAlreadyExistingInSink"})
    private TransferJobTransferSpecTransferOptions(
        @Nullable Boolean deleteObjectsFromSourceAfterTransfer,
        @Nullable Boolean deleteObjectsUniqueInSink,
        @Nullable Boolean overwriteObjectsAlreadyExistingInSink) {
        this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
        this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
        this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
    }

    /**
     * Whether objects should be deleted from the source after they are transferred to the sink. Note that this option and `delete_objects_unique_in_sink` are mutually exclusive.
     * 
     */
    public Optional<Boolean> getDeleteObjectsFromSourceAfterTransfer() {
        return Optional.ofNullable(this.deleteObjectsFromSourceAfterTransfer);
    }
    /**
     * Whether objects that exist only in the sink should be deleted. Note that this option and
     * `delete_objects_from_source_after_transfer` are mutually exclusive.
     * 
     */
    public Optional<Boolean> getDeleteObjectsUniqueInSink() {
        return Optional.ofNullable(this.deleteObjectsUniqueInSink);
    }
    /**
     * Whether overwriting objects that already exist in the sink is allowed.
     * 
     */
    public Optional<Boolean> getOverwriteObjectsAlreadyExistingInSink() {
        return Optional.ofNullable(this.overwriteObjectsAlreadyExistingInSink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecTransferOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteObjectsFromSourceAfterTransfer;
        private @Nullable Boolean deleteObjectsUniqueInSink;
        private @Nullable Boolean overwriteObjectsAlreadyExistingInSink;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecTransferOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteObjectsFromSourceAfterTransfer = defaults.deleteObjectsFromSourceAfterTransfer;
    	      this.deleteObjectsUniqueInSink = defaults.deleteObjectsUniqueInSink;
    	      this.overwriteObjectsAlreadyExistingInSink = defaults.overwriteObjectsAlreadyExistingInSink;
        }

        public Builder setDeleteObjectsFromSourceAfterTransfer(@Nullable Boolean deleteObjectsFromSourceAfterTransfer) {
            this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
            return this;
        }

        public Builder setDeleteObjectsUniqueInSink(@Nullable Boolean deleteObjectsUniqueInSink) {
            this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
            return this;
        }

        public Builder setOverwriteObjectsAlreadyExistingInSink(@Nullable Boolean overwriteObjectsAlreadyExistingInSink) {
            this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
            return this;
        }

        public TransferJobTransferSpecTransferOptions build() {
            return new TransferJobTransferSpecTransferOptions(deleteObjectsFromSourceAfterTransfer, deleteObjectsUniqueInSink, overwriteObjectsAlreadyExistingInSink);
        }
    }
}
