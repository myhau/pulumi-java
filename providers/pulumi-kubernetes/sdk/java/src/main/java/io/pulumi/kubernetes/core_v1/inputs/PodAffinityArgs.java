// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PodAffinityTermArgs;
import io.pulumi.kubernetes.core_v1.inputs.WeightedPodAffinityTermArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PodAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodAffinityArgs Empty = new PodAffinityArgs();

    @InputImport(name="preferredDuringSchedulingIgnoredDuringExecution")
    private final @Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;

    public Input<List<WeightedPodAffinityTermArgs>> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? Input.empty() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    @InputImport(name="requiredDuringSchedulingIgnoredDuringExecution")
    private final @Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

    public Input<List<PodAffinityTermArgs>> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution == null ? Input.empty() : this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public PodAffinityArgs(
        @Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution,
        @Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    private PodAffinityArgs() {
        this.preferredDuringSchedulingIgnoredDuringExecution = Input.empty();
        this.requiredDuringSchedulingIgnoredDuringExecution = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable List<WeightedPodAffinityTermArgs> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = Input.ofNullable(preferredDuringSchedulingIgnoredDuringExecution);
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable List<PodAffinityTermArgs> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = Input.ofNullable(requiredDuringSchedulingIgnoredDuringExecution);
            return this;
        }

        public PodAffinityArgs build() {
            return new PodAffinityArgs(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}