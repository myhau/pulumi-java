// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleActionAllowCustomRequestHandlingInsertHeader;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleActionAllowCustomRequestHandling {
    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private final List<WebAclRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

    @OutputCustomType.Constructor({"insertHeaders"})
    private WebAclRuleActionAllowCustomRequestHandling(List<WebAclRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders);
    }

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public List<WebAclRuleActionAllowCustomRequestHandlingInsertHeader> getInsertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllowCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionAllowCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(List<WebAclRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public WebAclRuleActionAllowCustomRequestHandling build() {
            return new WebAclRuleActionAllowCustomRequestHandling(insertHeaders);
        }
    }
}
