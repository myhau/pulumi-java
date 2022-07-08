// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for direct-path (via ALTS) with workload identity.
 * 
 */
public final class WorkloadALTSConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadALTSConfigArgs Empty = new WorkloadALTSConfigArgs();

    /**
     * enable_alts controls whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    @Import(name="enableAlts")
    private @Nullable Output<Boolean> enableAlts;

    /**
     * @return enable_alts controls whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    public Optional<Output<Boolean>> enableAlts() {
        return Optional.ofNullable(this.enableAlts);
    }

    private WorkloadALTSConfigArgs() {}

    private WorkloadALTSConfigArgs(WorkloadALTSConfigArgs $) {
        this.enableAlts = $.enableAlts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadALTSConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadALTSConfigArgs $;

        public Builder() {
            $ = new WorkloadALTSConfigArgs();
        }

        public Builder(WorkloadALTSConfigArgs defaults) {
            $ = new WorkloadALTSConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableAlts enable_alts controls whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workload_pool must be non-empty).
         * 
         * @return builder
         * 
         */
        public Builder enableAlts(@Nullable Output<Boolean> enableAlts) {
            $.enableAlts = enableAlts;
            return this;
        }

        /**
         * @param enableAlts enable_alts controls whether the alts handshaker should be enabled or not for direct-path. Requires Workload Identity (workload_pool must be non-empty).
         * 
         * @return builder
         * 
         */
        public Builder enableAlts(Boolean enableAlts) {
            return enableAlts(Output.of(enableAlts));
        }

        public WorkloadALTSConfigArgs build() {
            return $;
        }
    }

}
