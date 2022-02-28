// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclDefaultActionAllowCustomRequestHandlingInsertHeader;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclDefaultActionAllowCustomRequestHandling {
    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private final List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

    @OutputCustomType.Constructor({"insertHeaders"})
    private WebAclDefaultActionAllowCustomRequestHandling(List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders);
    }

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> getInsertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllowCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionAllowCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public WebAclDefaultActionAllowCustomRequestHandling build() {
            return new WebAclDefaultActionAllowCustomRequestHandling(insertHeaders);
        }
    }
}
