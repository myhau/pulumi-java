// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyDefaultAdmissionRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyDefaultAdmissionRuleGetArgs Empty = new PolicyDefaultAdmissionRuleGetArgs();

    @InputImport(name="enforcementMode", required=true)
    private final Input<String> enforcementMode;

    public Input<String> getEnforcementMode() {
        return this.enforcementMode;
    }

    @InputImport(name="evaluationMode", required=true)
    private final Input<String> evaluationMode;

    public Input<String> getEvaluationMode() {
        return this.evaluationMode;
    }

    @InputImport(name="requireAttestationsBies")
    private final @Nullable Input<List<String>> requireAttestationsBies;

    public Input<List<String>> getRequireAttestationsBies() {
        return this.requireAttestationsBies == null ? Input.empty() : this.requireAttestationsBies;
    }

    public PolicyDefaultAdmissionRuleGetArgs(
        Input<String> enforcementMode,
        Input<String> evaluationMode,
        @Nullable Input<List<String>> requireAttestationsBies) {
        this.enforcementMode = Objects.requireNonNull(enforcementMode, "expected parameter 'enforcementMode' to be non-null");
        this.evaluationMode = Objects.requireNonNull(evaluationMode, "expected parameter 'evaluationMode' to be non-null");
        this.requireAttestationsBies = requireAttestationsBies;
    }

    private PolicyDefaultAdmissionRuleGetArgs() {
        this.enforcementMode = Input.empty();
        this.evaluationMode = Input.empty();
        this.requireAttestationsBies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyDefaultAdmissionRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> enforcementMode;
        private Input<String> evaluationMode;
        private @Nullable Input<List<String>> requireAttestationsBies;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyDefaultAdmissionRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforcementMode = defaults.enforcementMode;
    	      this.evaluationMode = defaults.evaluationMode;
    	      this.requireAttestationsBies = defaults.requireAttestationsBies;
        }

        public Builder setEnforcementMode(Input<String> enforcementMode) {
            this.enforcementMode = Objects.requireNonNull(enforcementMode);
            return this;
        }

        public Builder setEnforcementMode(String enforcementMode) {
            this.enforcementMode = Input.of(Objects.requireNonNull(enforcementMode));
            return this;
        }

        public Builder setEvaluationMode(Input<String> evaluationMode) {
            this.evaluationMode = Objects.requireNonNull(evaluationMode);
            return this;
        }

        public Builder setEvaluationMode(String evaluationMode) {
            this.evaluationMode = Input.of(Objects.requireNonNull(evaluationMode));
            return this;
        }

        public Builder setRequireAttestationsBies(@Nullable Input<List<String>> requireAttestationsBies) {
            this.requireAttestationsBies = requireAttestationsBies;
            return this;
        }

        public Builder setRequireAttestationsBies(@Nullable List<String> requireAttestationsBies) {
            this.requireAttestationsBies = Input.ofNullable(requireAttestationsBies);
            return this;
        }

        public PolicyDefaultAdmissionRuleGetArgs build() {
            return new PolicyDefaultAdmissionRuleGetArgs(enforcementMode, evaluationMode, requireAttestationsBies);
        }
    }
}