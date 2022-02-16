// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    @InputImport(name="lastTransitionTime", required=true)
    private final Input<String> lastTransitionTime;

    public Input<String> getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    @InputImport(name="message", required=true)
    private final Input<String> message;

    public Input<String> getMessage() {
        return this.message;
    }

    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    @InputImport(name="reason", required=true)
    private final Input<String> reason;

    public Input<String> getReason() {
        return this.reason;
    }

    @InputImport(name="status", required=true)
    private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ConditionArgs(
        Input<String> lastTransitionTime,
        Input<String> message,
        @Nullable Input<Integer> observedGeneration,
        Input<String> reason,
        Input<String> status,
        Input<String> type) {
        this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime, "expected parameter 'lastTransitionTime' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.observedGeneration = observedGeneration;
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConditionArgs() {
        this.lastTransitionTime = Input.empty();
        this.message = Input.empty();
        this.observedGeneration = Input.empty();
        this.reason = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> lastTransitionTime;
        private Input<String> message;
        private @Nullable Input<Integer> observedGeneration;
        private Input<String> reason;
        private Input<String> status;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(Input<String> lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }

        public Builder setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Input.of(Objects.requireNonNull(lastTransitionTime));
            return this;
        }

        public Builder setMessage(Input<String> message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Input.of(Objects.requireNonNull(message));
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setReason(Input<String> reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Input.of(Objects.requireNonNull(reason));
            return this;
        }

        public Builder setStatus(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ConditionArgs build() {
            return new ConditionArgs(lastTransitionTime, message, observedGeneration, reason, status, type);
        }
    }
}