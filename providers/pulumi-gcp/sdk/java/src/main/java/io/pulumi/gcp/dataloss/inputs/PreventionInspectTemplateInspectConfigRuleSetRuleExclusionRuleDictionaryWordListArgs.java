// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs();

    /**
     * Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    @InputImport(name="words", required=true)
    private final Input<List<String>> words;

    public Input<List<String>> getWords() {
        return this.words;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs(Input<List<String>> words) {
        this.words = Objects.requireNonNull(words, "expected parameter 'words' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs() {
        this.words = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> words;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.words = defaults.words;
        }

        public Builder setWords(Input<List<String>> words) {
            this.words = Objects.requireNonNull(words);
            return this;
        }

        public Builder setWords(List<String> words) {
            this.words = Input.of(Objects.requireNonNull(words));
            return this;
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs(words);
        }
    }
}
