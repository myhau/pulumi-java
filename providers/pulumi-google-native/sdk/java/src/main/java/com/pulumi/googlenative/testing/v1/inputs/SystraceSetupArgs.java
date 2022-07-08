// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystraceSetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystraceSetupArgs Empty = new SystraceSetupArgs();

    /**
     * Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace.
     * 
     */
    @Import(name="durationSeconds")
    private @Nullable Output<Integer> durationSeconds;

    /**
     * @return Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace.
     * 
     */
    public Optional<Output<Integer>> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    private SystraceSetupArgs() {}

    private SystraceSetupArgs(SystraceSetupArgs $) {
        this.durationSeconds = $.durationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystraceSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystraceSetupArgs $;

        public Builder() {
            $ = new SystraceSetupArgs();
        }

        public Builder(SystraceSetupArgs defaults) {
            $ = new SystraceSetupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param durationSeconds Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * @param durationSeconds Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(Integer durationSeconds) {
            return durationSeconds(Output.of(durationSeconds));
        }

        public SystraceSetupArgs build() {
            return $;
        }
    }

}
