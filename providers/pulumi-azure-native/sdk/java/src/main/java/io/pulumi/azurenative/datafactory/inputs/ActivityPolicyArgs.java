// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityPolicyArgs Empty = new ActivityPolicyArgs();

    @InputImport(name="retry")
    private final @Nullable Input<Object> retry;

    public Input<Object> getRetry() {
        return this.retry == null ? Input.empty() : this.retry;
    }

    @InputImport(name="retryIntervalInSeconds")
    private final @Nullable Input<Integer> retryIntervalInSeconds;

    public Input<Integer> getRetryIntervalInSeconds() {
        return this.retryIntervalInSeconds == null ? Input.empty() : this.retryIntervalInSeconds;
    }

    @InputImport(name="secureInput")
    private final @Nullable Input<Boolean> secureInput;

    public Input<Boolean> getSecureInput() {
        return this.secureInput == null ? Input.empty() : this.secureInput;
    }

    @InputImport(name="secureOutput")
    private final @Nullable Input<Boolean> secureOutput;

    public Input<Boolean> getSecureOutput() {
        return this.secureOutput == null ? Input.empty() : this.secureOutput;
    }

    @InputImport(name="timeout")
    private final @Nullable Input<Object> timeout;

    public Input<Object> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public ActivityPolicyArgs(
        @Nullable Input<Object> retry,
        @Nullable Input<Integer> retryIntervalInSeconds,
        @Nullable Input<Boolean> secureInput,
        @Nullable Input<Boolean> secureOutput,
        @Nullable Input<Object> timeout) {
        this.retry = retry;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.secureInput = secureInput;
        this.secureOutput = secureOutput;
        this.timeout = timeout;
    }

    private ActivityPolicyArgs() {
        this.retry = Input.empty();
        this.retryIntervalInSeconds = Input.empty();
        this.secureInput = Input.empty();
        this.secureOutput = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> retry;
        private @Nullable Input<Integer> retryIntervalInSeconds;
        private @Nullable Input<Boolean> secureInput;
        private @Nullable Input<Boolean> secureOutput;
        private @Nullable Input<Object> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
    	      this.retryIntervalInSeconds = defaults.retryIntervalInSeconds;
    	      this.secureInput = defaults.secureInput;
    	      this.secureOutput = defaults.secureOutput;
    	      this.timeout = defaults.timeout;
        }

        public Builder setRetry(@Nullable Input<Object> retry) {
            this.retry = retry;
            return this;
        }

        public Builder setRetry(@Nullable Object retry) {
            this.retry = Input.ofNullable(retry);
            return this;
        }

        public Builder setRetryIntervalInSeconds(@Nullable Input<Integer> retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        public Builder setRetryIntervalInSeconds(@Nullable Integer retryIntervalInSeconds) {
            this.retryIntervalInSeconds = Input.ofNullable(retryIntervalInSeconds);
            return this;
        }

        public Builder setSecureInput(@Nullable Input<Boolean> secureInput) {
            this.secureInput = secureInput;
            return this;
        }

        public Builder setSecureInput(@Nullable Boolean secureInput) {
            this.secureInput = Input.ofNullable(secureInput);
            return this;
        }

        public Builder setSecureOutput(@Nullable Input<Boolean> secureOutput) {
            this.secureOutput = secureOutput;
            return this;
        }

        public Builder setSecureOutput(@Nullable Boolean secureOutput) {
            this.secureOutput = Input.ofNullable(secureOutput);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Object> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Object timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public ActivityPolicyArgs build() {
            return new ActivityPolicyArgs(retry, retryIntervalInSeconds, secureInput, secureOutput, timeout);
        }
    }
}