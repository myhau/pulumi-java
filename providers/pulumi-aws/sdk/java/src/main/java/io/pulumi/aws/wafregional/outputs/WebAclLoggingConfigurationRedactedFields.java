// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.aws.wafregional.outputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatch;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclLoggingConfigurationRedactedFields {
    /**
     * Set of configuration blocks for fields to redact. Detailed below.
     * 
     */
    private final List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches;

    @OutputCustomType.Constructor({"fieldToMatches"})
    private WebAclLoggingConfigurationRedactedFields(List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches) {
        this.fieldToMatches = fieldToMatches;
    }

    /**
     * Set of configuration blocks for fields to redact. Detailed below.
     * 
    */
    public List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> getFieldToMatches() {
        return this.fieldToMatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFields defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFields defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatches = defaults.fieldToMatches;
        }

        public Builder setFieldToMatches(List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches) {
            this.fieldToMatches = Objects.requireNonNull(fieldToMatches);
            return this;
        }
        public WebAclLoggingConfigurationRedactedFields build() {
            return new WebAclLoggingConfigurationRedactedFields(fieldToMatches);
        }
    }
}