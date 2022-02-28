// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclLoggingConfigurationRedactedFieldsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldsGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldsGetArgs();

    /**
     * Set of configuration blocks for fields to redact. Detailed below.
     * 
     */
    @InputImport(name="fieldToMatches", required=true)
      private final Input<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches;

    public Input<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> getFieldToMatches() {
        return this.fieldToMatches;
    }

    public WebAclLoggingConfigurationRedactedFieldsGetArgs(Input<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches) {
        this.fieldToMatches = Objects.requireNonNull(fieldToMatches, "expected parameter 'fieldToMatches' to be non-null");
    }

    private WebAclLoggingConfigurationRedactedFieldsGetArgs() {
        this.fieldToMatches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatches = defaults.fieldToMatches;
        }

        public Builder setFieldToMatches(Input<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches) {
            this.fieldToMatches = Objects.requireNonNull(fieldToMatches);
            return this;
        }

        public Builder setFieldToMatches(List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs> fieldToMatches) {
            this.fieldToMatches = Input.of(Objects.requireNonNull(fieldToMatches));
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldsGetArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldsGetArgs(fieldToMatches);
        }
    }
}
