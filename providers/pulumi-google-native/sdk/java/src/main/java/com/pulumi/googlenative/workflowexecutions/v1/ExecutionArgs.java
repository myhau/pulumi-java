// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.workflowexecutions.v1.enums.ExecutionCallLogLevel;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExecutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionArgs Empty = new ExecutionArgs();

    /**
     * Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `&#39;{&#34;argument&#34;:&#34;{\&#34;firstName\&#34;:\&#34;FIRST\&#34;,\&#34;lastName\&#34;:\&#34;LAST\&#34;}&#34;}&#39;`
     * 
     */
    @Import(name="argument")
    private @Nullable Output<String> argument;

    /**
     * @return Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `&#39;{&#34;argument&#34;:&#34;{\&#34;firstName\&#34;:\&#34;FIRST\&#34;,\&#34;lastName\&#34;:\&#34;LAST\&#34;}&#34;}&#39;`
     * 
     */
    public Optional<Output<String>> argument() {
        return Optional.ofNullable(this.argument);
    }

    /**
     * The call logging level associated to this execution.
     * 
     */
    @Import(name="callLogLevel")
    private @Nullable Output<ExecutionCallLogLevel> callLogLevel;

    /**
     * @return The call logging level associated to this execution.
     * 
     */
    public Optional<Output<ExecutionCallLogLevel>> callLogLevel() {
        return Optional.ofNullable(this.callLogLevel);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workflowId", required=true)
    private Output<String> workflowId;

    public Output<String> workflowId() {
        return this.workflowId;
    }

    private ExecutionArgs() {}

    private ExecutionArgs(ExecutionArgs $) {
        this.argument = $.argument;
        this.callLogLevel = $.callLogLevel;
        this.location = $.location;
        this.project = $.project;
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionArgs $;

        public Builder() {
            $ = new ExecutionArgs();
        }

        public Builder(ExecutionArgs defaults) {
            $ = new ExecutionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param argument Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `&#39;{&#34;argument&#34;:&#34;{\&#34;firstName\&#34;:\&#34;FIRST\&#34;,\&#34;lastName\&#34;:\&#34;LAST\&#34;}&#34;}&#39;`
         * 
         * @return builder
         * 
         */
        public Builder argument(@Nullable Output<String> argument) {
            $.argument = argument;
            return this;
        }

        /**
         * @param argument Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `&#39;{&#34;argument&#34;:&#34;{\&#34;firstName\&#34;:\&#34;FIRST\&#34;,\&#34;lastName\&#34;:\&#34;LAST\&#34;}&#34;}&#39;`
         * 
         * @return builder
         * 
         */
        public Builder argument(String argument) {
            return argument(Output.of(argument));
        }

        /**
         * @param callLogLevel The call logging level associated to this execution.
         * 
         * @return builder
         * 
         */
        public Builder callLogLevel(@Nullable Output<ExecutionCallLogLevel> callLogLevel) {
            $.callLogLevel = callLogLevel;
            return this;
        }

        /**
         * @param callLogLevel The call logging level associated to this execution.
         * 
         * @return builder
         * 
         */
        public Builder callLogLevel(ExecutionCallLogLevel callLogLevel) {
            return callLogLevel(Output.of(callLogLevel));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder workflowId(Output<String> workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        public Builder workflowId(String workflowId) {
            return workflowId(Output.of(workflowId));
        }

        public ExecutionArgs build() {
            $.workflowId = Objects.requireNonNull($.workflowId, "expected parameter 'workflowId' to be non-null");
            return $;
        }
    }

}
