// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleHttpHeaderActionResponse {
    /**
     * @return The list of request headers to add or overwrite if they&#39;re already present.
     * 
     */
    private final List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds;

    @CustomType.Constructor
    private SecurityPolicyRuleHttpHeaderActionResponse(@CustomType.Parameter("requestHeadersToAdds") List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds) {
        this.requestHeadersToAdds = requestHeadersToAdds;
    }

    /**
     * @return The list of request headers to add or overwrite if they&#39;re already present.
     * 
     */
    public List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds() {
        return this.requestHeadersToAdds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleHttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
        }

        public Builder requestHeadersToAdds(List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds) {
            this.requestHeadersToAdds = Objects.requireNonNull(requestHeadersToAdds);
            return this;
        }
        public Builder requestHeadersToAdds(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }        public SecurityPolicyRuleHttpHeaderActionResponse build() {
            return new SecurityPolicyRuleHttpHeaderActionResponse(requestHeadersToAdds);
        }
    }
}
