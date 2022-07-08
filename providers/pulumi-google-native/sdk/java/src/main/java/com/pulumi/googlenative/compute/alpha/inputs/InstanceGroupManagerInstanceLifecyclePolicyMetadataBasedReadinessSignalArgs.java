// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs Empty = new InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs();

    /**
     * The number of seconds to wait for a readiness signal during initialization before timing out.
     * 
     */
    @Import(name="timeoutSec")
    private @Nullable Output<Integer> timeoutSec;

    /**
     * @return The number of seconds to wait for a readiness signal during initialization before timing out.
     * 
     */
    public Optional<Output<Integer>> timeoutSec() {
        return Optional.ofNullable(this.timeoutSec);
    }

    private InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs() {}

    private InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs $) {
        this.timeoutSec = $.timeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs $;

        public Builder() {
            $ = new InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs();
        }

        public Builder(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs defaults) {
            $ = new InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeoutSec The number of seconds to wait for a readiness signal during initialization before timing out.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            $.timeoutSec = timeoutSec;
            return this;
        }

        /**
         * @param timeoutSec The number of seconds to wait for a readiness signal during initialization before timing out.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSec(Integer timeoutSec) {
            return timeoutSec(Output.of(timeoutSec));
        }

        public InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs build() {
            return $;
        }
    }

}
