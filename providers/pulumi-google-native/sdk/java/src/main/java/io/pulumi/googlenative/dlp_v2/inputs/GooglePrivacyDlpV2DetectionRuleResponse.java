// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HotwordRuleResponse;
import java.util.Objects;


public final class GooglePrivacyDlpV2DetectionRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DetectionRuleResponse Empty = new GooglePrivacyDlpV2DetectionRuleResponse();

    @InputImport(name="hotwordRule", required=true)
    private final GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

    public GooglePrivacyDlpV2HotwordRuleResponse getHotwordRule() {
        return this.hotwordRule;
    }

    public GooglePrivacyDlpV2DetectionRuleResponse(GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
        this.hotwordRule = Objects.requireNonNull(hotwordRule, "expected parameter 'hotwordRule' to be non-null");
    }

    private GooglePrivacyDlpV2DetectionRuleResponse() {
        this.hotwordRule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DetectionRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DetectionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder setHotwordRule(GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
            this.hotwordRule = Objects.requireNonNull(hotwordRule);
            return this;
        }

        public GooglePrivacyDlpV2DetectionRuleResponse build() {
            return new GooglePrivacyDlpV2DetectionRuleResponse(hotwordRule);
        }
    }
}