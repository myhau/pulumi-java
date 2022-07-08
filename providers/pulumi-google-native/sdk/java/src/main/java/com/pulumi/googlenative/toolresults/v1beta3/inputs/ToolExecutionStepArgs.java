// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.ToolExecutionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Generic tool step to be used for binaries we do not explicitly support. For example: running cp to copy artifacts from one location to another.
 * 
 */
public final class ToolExecutionStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final ToolExecutionStepArgs Empty = new ToolExecutionStepArgs();

    /**
     * A Tool execution. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="toolExecution")
    private @Nullable Output<ToolExecutionArgs> toolExecution;

    /**
     * @return A Tool execution. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    public Optional<Output<ToolExecutionArgs>> toolExecution() {
        return Optional.ofNullable(this.toolExecution);
    }

    private ToolExecutionStepArgs() {}

    private ToolExecutionStepArgs(ToolExecutionStepArgs $) {
        this.toolExecution = $.toolExecution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ToolExecutionStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ToolExecutionStepArgs $;

        public Builder() {
            $ = new ToolExecutionStepArgs();
        }

        public Builder(ToolExecutionStepArgs defaults) {
            $ = new ToolExecutionStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param toolExecution A Tool execution. - In response: present if set by create/update request - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder toolExecution(@Nullable Output<ToolExecutionArgs> toolExecution) {
            $.toolExecution = toolExecution;
            return this;
        }

        /**
         * @param toolExecution A Tool execution. - In response: present if set by create/update request - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder toolExecution(ToolExecutionArgs toolExecution) {
            return toolExecution(Output.of(toolExecution));
        }

        public ToolExecutionStepArgs build() {
            return $;
        }
    }

}
