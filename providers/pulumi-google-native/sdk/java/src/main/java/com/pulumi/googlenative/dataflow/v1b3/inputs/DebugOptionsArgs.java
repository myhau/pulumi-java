// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes any options that have an effect on the debugging of pipelines.
 * 
 */
public final class DebugOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DebugOptionsArgs Empty = new DebugOptionsArgs();

    /**
     * When true, enables the logging of the literal hot key to the user&#39;s Cloud Logging.
     * 
     */
    @Import(name="enableHotKeyLogging")
    private @Nullable Output<Boolean> enableHotKeyLogging;

    /**
     * @return When true, enables the logging of the literal hot key to the user&#39;s Cloud Logging.
     * 
     */
    public Optional<Output<Boolean>> enableHotKeyLogging() {
        return Optional.ofNullable(this.enableHotKeyLogging);
    }

    private DebugOptionsArgs() {}

    private DebugOptionsArgs(DebugOptionsArgs $) {
        this.enableHotKeyLogging = $.enableHotKeyLogging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DebugOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DebugOptionsArgs $;

        public Builder() {
            $ = new DebugOptionsArgs();
        }

        public Builder(DebugOptionsArgs defaults) {
            $ = new DebugOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableHotKeyLogging When true, enables the logging of the literal hot key to the user&#39;s Cloud Logging.
         * 
         * @return builder
         * 
         */
        public Builder enableHotKeyLogging(@Nullable Output<Boolean> enableHotKeyLogging) {
            $.enableHotKeyLogging = enableHotKeyLogging;
            return this;
        }

        /**
         * @param enableHotKeyLogging When true, enables the logging of the literal hot key to the user&#39;s Cloud Logging.
         * 
         * @return builder
         * 
         */
        public Builder enableHotKeyLogging(Boolean enableHotKeyLogging) {
            return enableHotKeyLogging(Output.of(enableHotKeyLogging));
        }

        public DebugOptionsArgs build() {
            return $;
        }
    }

}
