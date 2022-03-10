// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFileSystemLifecyclePolicy {
    private final String transitionToIa;
    private final String transitionToPrimaryStorageClass;

    @OutputCustomType.Constructor({"transitionToIa","transitionToPrimaryStorageClass"})
    private GetFileSystemLifecyclePolicy(
        String transitionToIa,
        String transitionToPrimaryStorageClass) {
        this.transitionToIa = transitionToIa;
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
    }

    public String getTransitionToIa() {
        return this.transitionToIa;
    }
    public String getTransitionToPrimaryStorageClass() {
        return this.transitionToPrimaryStorageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSystemLifecyclePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transitionToIa;
        private String transitionToPrimaryStorageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileSystemLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIa = defaults.transitionToIa;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        public Builder setTransitionToIa(String transitionToIa) {
            this.transitionToIa = Objects.requireNonNull(transitionToIa);
            return this;
        }

        public Builder setTransitionToPrimaryStorageClass(String transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = Objects.requireNonNull(transitionToPrimaryStorageClass);
            return this;
        }
        public GetFileSystemLifecyclePolicy build() {
            return new GetFileSystemLifecyclePolicy(transitionToIa, transitionToPrimaryStorageClass);
        }
    }
}