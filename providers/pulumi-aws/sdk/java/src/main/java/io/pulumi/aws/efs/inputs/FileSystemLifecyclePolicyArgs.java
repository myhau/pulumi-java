// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemLifecyclePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemLifecyclePolicyArgs Empty = new FileSystemLifecyclePolicyArgs();

    /**
     * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
     * 
     */
    @InputImport(name="transitionToIa")
      private final @Nullable Input<String> transitionToIa;

    public Input<String> getTransitionToIa() {
        return this.transitionToIa == null ? Input.empty() : this.transitionToIa;
    }

    /**
     * Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
     * 
     */
    @InputImport(name="transitionToPrimaryStorageClass")
      private final @Nullable Input<String> transitionToPrimaryStorageClass;

    public Input<String> getTransitionToPrimaryStorageClass() {
        return this.transitionToPrimaryStorageClass == null ? Input.empty() : this.transitionToPrimaryStorageClass;
    }

    public FileSystemLifecyclePolicyArgs(
        @Nullable Input<String> transitionToIa,
        @Nullable Input<String> transitionToPrimaryStorageClass) {
        this.transitionToIa = transitionToIa;
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
    }

    private FileSystemLifecyclePolicyArgs() {
        this.transitionToIa = Input.empty();
        this.transitionToPrimaryStorageClass = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemLifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> transitionToIa;
        private @Nullable Input<String> transitionToPrimaryStorageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemLifecyclePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIa = defaults.transitionToIa;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        public Builder setTransitionToIa(@Nullable Input<String> transitionToIa) {
            this.transitionToIa = transitionToIa;
            return this;
        }

        public Builder setTransitionToIa(@Nullable String transitionToIa) {
            this.transitionToIa = Input.ofNullable(transitionToIa);
            return this;
        }

        public Builder setTransitionToPrimaryStorageClass(@Nullable Input<String> transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return this;
        }

        public Builder setTransitionToPrimaryStorageClass(@Nullable String transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = Input.ofNullable(transitionToPrimaryStorageClass);
            return this;
        }
        public FileSystemLifecyclePolicyArgs build() {
            return new FileSystemLifecyclePolicyArgs(transitionToIa, transitionToPrimaryStorageClass);
        }
    }
}
