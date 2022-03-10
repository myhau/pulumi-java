// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleSourceSelectionCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleSourceSelectionCriteriaArgs Empty = new BucketReplicationConfigRuleSourceSelectionCriteriaArgs();

    /**
     * A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * 
     */
    @InputImport(name="replicaModifications")
      private final @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> replicaModifications;

    public Input<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> getReplicaModifications() {
        return this.replicaModifications == null ? Input.empty() : this.replicaModifications;
    }

    /**
     * A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
     * 
     */
    @InputImport(name="sseKmsEncryptedObjects")
      private final @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects;

    public Input<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects == null ? Input.empty() : this.sseKmsEncryptedObjects;
    }

    public BucketReplicationConfigRuleSourceSelectionCriteriaArgs(
        @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> replicaModifications,
        @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects) {
        this.replicaModifications = replicaModifications;
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    private BucketReplicationConfigRuleSourceSelectionCriteriaArgs() {
        this.replicaModifications = Input.empty();
        this.sseKmsEncryptedObjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> replicaModifications;
        private @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaModifications = defaults.replicaModifications;
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder setReplicaModifications(@Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs> replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }

        public Builder setReplicaModifications(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs replicaModifications) {
            this.replicaModifications = Input.ofNullable(replicaModifications);
            return this;
        }

        public Builder setSseKmsEncryptedObjects(@Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        public Builder setSseKmsEncryptedObjects(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = Input.ofNullable(sseKmsEncryptedObjects);
            return this;
        }
        public BucketReplicationConfigRuleSourceSelectionCriteriaArgs build() {
            return new BucketReplicationConfigRuleSourceSelectionCriteriaArgs(replicaModifications, sseKmsEncryptedObjects);
        }
    }
}