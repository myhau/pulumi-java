// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LanguageCodesSetResponse {
    /**
     * @return The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    private final List<String> languageCodes;

    @CustomType.Constructor
    private LanguageCodesSetResponse(@CustomType.Parameter("languageCodes") List<String> languageCodes) {
        this.languageCodes = languageCodes;
    }

    /**
     * @return The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    public List<String> languageCodes() {
        return this.languageCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageCodesSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> languageCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageCodesSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.languageCodes = defaults.languageCodes;
        }

        public Builder languageCodes(List<String> languageCodes) {
            this.languageCodes = Objects.requireNonNull(languageCodes);
            return this;
        }
        public Builder languageCodes(String... languageCodes) {
            return languageCodes(List.of(languageCodes));
        }        public LanguageCodesSetResponse build() {
            return new LanguageCodesSetResponse(languageCodes);
        }
    }
}
