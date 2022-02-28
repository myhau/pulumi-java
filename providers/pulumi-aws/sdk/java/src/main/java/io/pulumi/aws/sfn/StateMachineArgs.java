// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn;

import io.pulumi.aws.sfn.inputs.StateMachineLoggingConfigurationArgs;
import io.pulumi.aws.sfn.inputs.StateMachineTracingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineArgs Empty = new StateMachineArgs();

    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    @InputImport(name="definition", required=true)
      private final Input<String> definition;

    public Input<String> getDefinition() {
        return this.definition;
    }

    /**
     * Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    @InputImport(name="loggingConfiguration")
      private final @Nullable Input<StateMachineLoggingConfigurationArgs> loggingConfiguration;

    public Input<StateMachineLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Input.empty() : this.loggingConfiguration;
    }

    /**
     * The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    @InputImport(name="tracingConfiguration")
      private final @Nullable Input<StateMachineTracingConfigurationArgs> tracingConfiguration;

    public Input<StateMachineTracingConfigurationArgs> getTracingConfiguration() {
        return this.tracingConfiguration == null ? Input.empty() : this.tracingConfiguration;
    }

    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public StateMachineArgs(
        Input<String> definition,
        @Nullable Input<StateMachineLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Input<String> name,
        Input<String> roleArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<StateMachineTracingConfigurationArgs> tracingConfiguration,
        @Nullable Input<String> type) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.loggingConfiguration = loggingConfiguration;
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.tracingConfiguration = tracingConfiguration;
        this.type = type;
    }

    private StateMachineArgs() {
        this.definition = Input.empty();
        this.loggingConfiguration = Input.empty();
        this.name = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
        this.tracingConfiguration = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> definition;
        private @Nullable Input<StateMachineLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Input<String> name;
        private Input<String> roleArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<StateMachineTracingConfigurationArgs> tracingConfiguration;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.tracingConfiguration = defaults.tracingConfiguration;
    	      this.type = defaults.type;
        }

        public Builder setDefinition(Input<String> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setDefinition(String definition) {
            this.definition = Input.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable Input<StateMachineLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable StateMachineLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Input.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTracingConfiguration(@Nullable Input<StateMachineTracingConfigurationArgs> tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }

        public Builder setTracingConfiguration(@Nullable StateMachineTracingConfigurationArgs tracingConfiguration) {
            this.tracingConfiguration = Input.ofNullable(tracingConfiguration);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public StateMachineArgs build() {
            return new StateMachineArgs(definition, loggingConfiguration, name, roleArn, tags, tracingConfiguration, type);
        }
    }
}
