// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryScheduleGetArgs Empty = new CanaryScheduleGetArgs();

    /**
     * Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    @InputImport(name="durationInSeconds")
      private final @Nullable Input<Integer> durationInSeconds;

    public Input<Integer> getDurationInSeconds() {
        return this.durationInSeconds == null ? Input.empty() : this.durationInSeconds;
    }

    /**
     * Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    public CanaryScheduleGetArgs(
        @Nullable Input<Integer> durationInSeconds,
        Input<String> expression) {
        this.durationInSeconds = durationInSeconds;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private CanaryScheduleGetArgs() {
        this.durationInSeconds = Input.empty();
        this.expression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> durationInSeconds;
        private Input<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
    	      this.expression = defaults.expression;
        }

        public Builder setDurationInSeconds(@Nullable Input<Integer> durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder setDurationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = Input.ofNullable(durationInSeconds);
            return this;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }
        public CanaryScheduleGetArgs build() {
            return new CanaryScheduleGetArgs(durationInSeconds, expression);
        }
    }
}
