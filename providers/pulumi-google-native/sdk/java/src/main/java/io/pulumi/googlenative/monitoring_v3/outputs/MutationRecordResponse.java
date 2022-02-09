// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MutationRecordResponse {
    private final String mutateTime;
    private final String mutatedBy;

    @OutputCustomType.Constructor({"mutateTime","mutatedBy"})
    private MutationRecordResponse(
        String mutateTime,
        String mutatedBy) {
        this.mutateTime = Objects.requireNonNull(mutateTime);
        this.mutatedBy = Objects.requireNonNull(mutatedBy);
    }

    public String getMutateTime() {
        return this.mutateTime;
    }
    public String getMutatedBy() {
        return this.mutatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutationRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mutateTime;
        private String mutatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(MutationRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mutateTime = defaults.mutateTime;
    	      this.mutatedBy = defaults.mutatedBy;
        }

        public Builder setMutateTime(String mutateTime) {
            this.mutateTime = Objects.requireNonNull(mutateTime);
            return this;
        }

        public Builder setMutatedBy(String mutatedBy) {
            this.mutatedBy = Objects.requireNonNull(mutatedBy);
            return this;
        }

        public MutationRecordResponse build() {
            return new MutationRecordResponse(mutateTime, mutatedBy);
        }
    }
}