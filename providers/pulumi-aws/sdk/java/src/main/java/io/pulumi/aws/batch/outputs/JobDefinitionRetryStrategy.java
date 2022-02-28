// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.aws.batch.outputs.JobDefinitionRetryStrategyEvaluateOnExit;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobDefinitionRetryStrategy {
    /**
     * The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
     * 
     */
    private final @Nullable Integer attempts;
    /**
     * The evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
     * 
     */
    private final @Nullable List<JobDefinitionRetryStrategyEvaluateOnExit> evaluateOnExits;

    @OutputCustomType.Constructor({"attempts","evaluateOnExits"})
    private JobDefinitionRetryStrategy(
        @Nullable Integer attempts,
        @Nullable List<JobDefinitionRetryStrategyEvaluateOnExit> evaluateOnExits) {
        this.attempts = attempts;
        this.evaluateOnExits = evaluateOnExits;
    }

    /**
     * The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
     * 
     */
    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(this.attempts);
    }
    /**
     * The evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
     * 
     */
    public List<JobDefinitionRetryStrategyEvaluateOnExit> getEvaluateOnExits() {
        return this.evaluateOnExits == null ? List.of() : this.evaluateOnExits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionRetryStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer attempts;
        private @Nullable List<JobDefinitionRetryStrategyEvaluateOnExit> evaluateOnExits;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionRetryStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attempts = defaults.attempts;
    	      this.evaluateOnExits = defaults.evaluateOnExits;
        }

        public Builder setAttempts(@Nullable Integer attempts) {
            this.attempts = attempts;
            return this;
        }

        public Builder setEvaluateOnExits(@Nullable List<JobDefinitionRetryStrategyEvaluateOnExit> evaluateOnExits) {
            this.evaluateOnExits = evaluateOnExits;
            return this;
        }
        public JobDefinitionRetryStrategy build() {
            return new JobDefinitionRetryStrategy(attempts, evaluateOnExits);
        }
    }
}
