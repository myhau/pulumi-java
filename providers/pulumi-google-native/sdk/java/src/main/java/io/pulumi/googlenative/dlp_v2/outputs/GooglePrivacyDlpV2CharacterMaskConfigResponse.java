// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CharsToIgnoreResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CharacterMaskConfigResponse {
    /**
     * When masking a string, items in this list will be skipped when replacing characters. For example, if the input string is `555-555-5555` and you instruct Cloud DLP to skip `-` and mask 5 characters with `*`, Cloud DLP returns `***-**5-5555`.
     * 
     */
    private final List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore;
    /**
     * Character to use to mask the sensitive values—for example, `*` for an alphabetic string such as a name, or `0` for a numeric string such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to `*` for strings, and `0` for digits.
     * 
     */
    private final String maskingCharacter;
    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
     */
    private final Integer numberToMask;
    /**
     * Mask characters in reverse order. For example, if `masking_character` is `0`, `number_to_mask` is `14`, and `reverse_order` is `false`, then the input string `1234-5678-9012-3456` is masked as `00000000000000-3456`. If `masking_character` is `*`, `number_to_mask` is `3`, and `reverse_order` is `true`, then the string `12345` is masked as `12***`.
     * 
     */
    private final Boolean reverseOrder;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2CharacterMaskConfigResponse(
        @OutputCustomType.Parameter("charactersToIgnore") List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore,
        @OutputCustomType.Parameter("maskingCharacter") String maskingCharacter,
        @OutputCustomType.Parameter("numberToMask") Integer numberToMask,
        @OutputCustomType.Parameter("reverseOrder") Boolean reverseOrder) {
        this.charactersToIgnore = charactersToIgnore;
        this.maskingCharacter = maskingCharacter;
        this.numberToMask = numberToMask;
        this.reverseOrder = reverseOrder;
    }

    /**
     * When masking a string, items in this list will be skipped when replacing characters. For example, if the input string is `555-555-5555` and you instruct Cloud DLP to skip `-` and mask 5 characters with `*`, Cloud DLP returns `***-**5-5555`.
     * 
    */
    public List<GooglePrivacyDlpV2CharsToIgnoreResponse> getCharactersToIgnore() {
        return this.charactersToIgnore;
    }
    /**
     * Character to use to mask the sensitive values—for example, `*` for an alphabetic string such as a name, or `0` for a numeric string such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to `*` for strings, and `0` for digits.
     * 
    */
    public String getMaskingCharacter() {
        return this.maskingCharacter;
    }
    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
    */
    public Integer getNumberToMask() {
        return this.numberToMask;
    }
    /**
     * Mask characters in reverse order. For example, if `masking_character` is `0`, `number_to_mask` is `14`, and `reverse_order` is `false`, then the input string `1234-5678-9012-3456` is masked as `00000000000000-3456`. If `masking_character` is `*`, `number_to_mask` is `3`, and `reverse_order` is `true`, then the string `12345` is masked as `12***`.
     * 
    */
    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CharacterMaskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore;
        private String maskingCharacter;
        private Integer numberToMask;
        private Boolean reverseOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CharacterMaskConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnore = defaults.charactersToIgnore;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        public Builder setCharactersToIgnore(List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore) {
            this.charactersToIgnore = Objects.requireNonNull(charactersToIgnore);
            return this;
        }

        public Builder setMaskingCharacter(String maskingCharacter) {
            this.maskingCharacter = Objects.requireNonNull(maskingCharacter);
            return this;
        }

        public Builder setNumberToMask(Integer numberToMask) {
            this.numberToMask = Objects.requireNonNull(numberToMask);
            return this;
        }

        public Builder setReverseOrder(Boolean reverseOrder) {
            this.reverseOrder = Objects.requireNonNull(reverseOrder);
            return this;
        }
        public GooglePrivacyDlpV2CharacterMaskConfigResponse build() {
            return new GooglePrivacyDlpV2CharacterMaskConfigResponse(charactersToIgnore, maskingCharacter, numberToMask, reverseOrder);
        }
    }
}
