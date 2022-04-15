// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.RampUpRuleResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Routing rules in production experiments.
 * 
 */
public final class ExperimentsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExperimentsResponse Empty = new ExperimentsResponse();

    /**
     * List of ramp-up rules.
     * 
     */
    @Import(name="rampUpRules")
      private final @Nullable List<RampUpRuleResponse> rampUpRules;

    public List<RampUpRuleResponse> rampUpRules() {
        return this.rampUpRules == null ? List.of() : this.rampUpRules;
    }

    public ExperimentsResponse(@Nullable List<RampUpRuleResponse> rampUpRules) {
        this.rampUpRules = rampUpRules;
    }

    private ExperimentsResponse() {
        this.rampUpRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RampUpRuleResponse> rampUpRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rampUpRules = defaults.rampUpRules;
        }

        public Builder rampUpRules(@Nullable List<RampUpRuleResponse> rampUpRules) {
            this.rampUpRules = rampUpRules;
            return this;
        }
        public Builder rampUpRules(RampUpRuleResponse... rampUpRules) {
            return rampUpRules(List.of(rampUpRules));
        }        public ExperimentsResponse build() {
            return new ExperimentsResponse(rampUpRules);
        }
    }
}
