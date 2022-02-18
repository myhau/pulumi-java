// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetGetArgs();

    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    @InputImport(name="infoTypes", required=true)
    private final Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes;

    public Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> getInfoTypes() {
        return this.infoTypes;
    }

    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rules", required=true)
    private final Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules;

    public Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> getRules() {
        return this.rules;
    }

    public PreventionInspectTemplateInspectConfigRuleSetGetArgs(
        Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes,
        Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetGetArgs() {
        this.infoTypes = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes;
        private Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder setInfoTypes(Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public Builder setInfoTypes(List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs> infoTypes) {
            this.infoTypes = Input.of(Objects.requireNonNull(infoTypes));
            return this;
        }

        public Builder setRules(Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }

        public PreventionInspectTemplateInspectConfigRuleSetGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetGetArgs(infoTypes, rules);
        }
    }
}
