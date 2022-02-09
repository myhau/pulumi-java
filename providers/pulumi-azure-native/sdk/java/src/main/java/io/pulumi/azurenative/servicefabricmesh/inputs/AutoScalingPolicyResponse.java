// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.AddRemoveReplicaScalingMechanismResponse;
import io.pulumi.azurenative.servicefabricmesh.inputs.AverageLoadScalingTriggerResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AutoScalingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoScalingPolicyResponse Empty = new AutoScalingPolicyResponse();

    @InputImport(name="mechanism", required=true)
    private final AddRemoveReplicaScalingMechanismResponse mechanism;

    public AddRemoveReplicaScalingMechanismResponse getMechanism() {
        return this.mechanism;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="trigger", required=true)
    private final AverageLoadScalingTriggerResponse trigger;

    public AverageLoadScalingTriggerResponse getTrigger() {
        return this.trigger;
    }

    public AutoScalingPolicyResponse(
        AddRemoveReplicaScalingMechanismResponse mechanism,
        String name,
        AverageLoadScalingTriggerResponse trigger) {
        this.mechanism = Objects.requireNonNull(mechanism, "expected parameter 'mechanism' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.trigger = Objects.requireNonNull(trigger, "expected parameter 'trigger' to be non-null");
    }

    private AutoScalingPolicyResponse() {
        this.mechanism = null;
        this.name = null;
        this.trigger = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddRemoveReplicaScalingMechanismResponse mechanism;
        private String name;
        private AverageLoadScalingTriggerResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mechanism = defaults.mechanism;
    	      this.name = defaults.name;
    	      this.trigger = defaults.trigger;
        }

        public Builder setMechanism(AddRemoveReplicaScalingMechanismResponse mechanism) {
            this.mechanism = Objects.requireNonNull(mechanism);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTrigger(AverageLoadScalingTriggerResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }

        public AutoScalingPolicyResponse build() {
            return new AutoScalingPolicyResponse(mechanism, name, trigger);
        }
    }
}