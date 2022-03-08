// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class X12ValidationOverrideResponse {
    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    private final Boolean allowLeadingAndTrailingSpacesAndZeroes;
    /**
     * The message id on which the validation settings has to be applied.
     * 
     */
    private final String messageId;
    /**
     * The trailing separator policy.
     * 
     */
    private final String trailingSeparatorPolicy;
    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    private final Boolean trimLeadingAndTrailingSpacesAndZeroes;
    /**
     * The value indicating whether to validate character Set.
     * 
     */
    private final Boolean validateCharacterSet;
    /**
     * The value indicating whether to validate EDI types.
     * 
     */
    private final Boolean validateEDITypes;
    /**
     * The value indicating whether to validate XSD types.
     * 
     */
    private final Boolean validateXSDTypes;

    @OutputCustomType.Constructor({"allowLeadingAndTrailingSpacesAndZeroes","messageId","trailingSeparatorPolicy","trimLeadingAndTrailingSpacesAndZeroes","validateCharacterSet","validateEDITypes","validateXSDTypes"})
    private X12ValidationOverrideResponse(
        Boolean allowLeadingAndTrailingSpacesAndZeroes,
        String messageId,
        String trailingSeparatorPolicy,
        Boolean trimLeadingAndTrailingSpacesAndZeroes,
        Boolean validateCharacterSet,
        Boolean validateEDITypes,
        Boolean validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
        this.messageId = messageId;
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
        this.validateCharacterSet = validateCharacterSet;
        this.validateEDITypes = validateEDITypes;
        this.validateXSDTypes = validateXSDTypes;
    }

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
    */
    public Boolean getAllowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }
    /**
     * The message id on which the validation settings has to be applied.
     * 
    */
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * The trailing separator policy.
     * 
    */
    public String getTrailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }
    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
    */
    public Boolean getTrimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }
    /**
     * The value indicating whether to validate character Set.
     * 
    */
    public Boolean getValidateCharacterSet() {
        return this.validateCharacterSet;
    }
    /**
     * The value indicating whether to validate EDI types.
     * 
    */
    public Boolean getValidateEDITypes() {
        return this.validateEDITypes;
    }
    /**
     * The value indicating whether to validate XSD types.
     * 
    */
    public Boolean getValidateXSDTypes() {
        return this.validateXSDTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ValidationOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowLeadingAndTrailingSpacesAndZeroes;
        private String messageId;
        private String trailingSeparatorPolicy;
        private Boolean trimLeadingAndTrailingSpacesAndZeroes;
        private Boolean validateCharacterSet;
        private Boolean validateEDITypes;
        private Boolean validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ValidationOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.messageId = defaults.messageId;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateCharacterSet = defaults.validateCharacterSet;
    	      this.validateEDITypes = defaults.validateEDITypes;
    	      this.validateXSDTypes = defaults.validateXSDTypes;
        }

        public Builder setAllowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setTrailingSeparatorPolicy(String trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy);
            return this;
        }

        public Builder setTrimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setValidateCharacterSet(Boolean validateCharacterSet) {
            this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet);
            return this;
        }

        public Builder setValidateEDITypes(Boolean validateEDITypes) {
            this.validateEDITypes = Objects.requireNonNull(validateEDITypes);
            return this;
        }

        public Builder setValidateXSDTypes(Boolean validateXSDTypes) {
            this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes);
            return this;
        }
        public X12ValidationOverrideResponse build() {
            return new X12ValidationOverrideResponse(allowLeadingAndTrailingSpacesAndZeroes, messageId, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
