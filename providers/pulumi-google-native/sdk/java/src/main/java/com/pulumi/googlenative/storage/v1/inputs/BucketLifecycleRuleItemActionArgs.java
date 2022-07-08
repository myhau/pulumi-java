// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The action to take.
 * 
 */
public final class BucketLifecycleRuleItemActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleItemActionArgs Empty = new BucketLifecycleRuleItemActionArgs();

    /**
     * Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<String> storageClass;

    /**
     * @return Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    public Optional<Output<String>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    /**
     * Type of the action. Currently, only Delete, SetStorageClass, and AbortIncompleteMultipartUpload are supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the action. Currently, only Delete, SetStorageClass, and AbortIncompleteMultipartUpload are supported.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private BucketLifecycleRuleItemActionArgs() {}

    private BucketLifecycleRuleItemActionArgs(BucketLifecycleRuleItemActionArgs $) {
        this.storageClass = $.storageClass;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleItemActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleItemActionArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleItemActionArgs();
        }

        public Builder(BucketLifecycleRuleItemActionArgs defaults) {
            $ = new BucketLifecycleRuleItemActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param storageClass Target storage class. Required iff the type of the action is SetStorageClass.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(@Nullable Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        /**
         * @param storageClass Target storage class. Required iff the type of the action is SetStorageClass.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        /**
         * @param type Type of the action. Currently, only Delete, SetStorageClass, and AbortIncompleteMultipartUpload are supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the action. Currently, only Delete, SetStorageClass, and AbortIncompleteMultipartUpload are supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BucketLifecycleRuleItemActionArgs build() {
            return $;
        }
    }

}
