// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAdd;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleHeaderAction {
    private final @Nullable List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
    private final @Nullable List<String> requestHeadersToRemoves;
    private final @Nullable List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
    private final @Nullable List<String> responseHeadersToRemoves;

    @OutputCustomType.Constructor({"requestHeadersToAdds","requestHeadersToRemoves","responseHeadersToAdds","responseHeadersToRemoves"})
    private URLMapPathMatcherRouteRuleHeaderAction(
        @Nullable List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds,
        @Nullable List<String> requestHeadersToRemoves,
        @Nullable List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAdd> responseHeadersToAdds,
        @Nullable List<String> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    public List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? List.of() : this.requestHeadersToAdds;
    }
    public List<String> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? List.of() : this.requestHeadersToRemoves;
    }
    public List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAdd> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? List.of() : this.responseHeadersToAdds;
    }
    public List<String> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? List.of() : this.responseHeadersToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleHeaderAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
        private @Nullable List<String> requestHeadersToRemoves;
        private @Nullable List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
        private @Nullable List<String> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder setRequestHeadersToAdds(@Nullable List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAdd> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        public URLMapPathMatcherRouteRuleHeaderAction build() {
            return new URLMapPathMatcherRouteRuleHeaderAction(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}