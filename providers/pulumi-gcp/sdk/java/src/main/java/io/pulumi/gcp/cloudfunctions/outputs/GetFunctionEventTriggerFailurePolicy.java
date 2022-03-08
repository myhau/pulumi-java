// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetFunctionEventTriggerFailurePolicy {
    /**
     * Whether the function should be retried on failure.
     * 
     */
    private final Boolean retry;

    @OutputCustomType.Constructor({"retry"})
    private GetFunctionEventTriggerFailurePolicy(Boolean retry) {
        this.retry = retry;
    }

    /**
     * Whether the function should be retried on failure.
     * 
    */
    public Boolean getRetry() {
        return this.retry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionEventTriggerFailurePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean retry;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionEventTriggerFailurePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder setRetry(Boolean retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }
        public GetFunctionEventTriggerFailurePolicy build() {
            return new GetFunctionEventTriggerFailurePolicy(retry);
        }
    }
}
