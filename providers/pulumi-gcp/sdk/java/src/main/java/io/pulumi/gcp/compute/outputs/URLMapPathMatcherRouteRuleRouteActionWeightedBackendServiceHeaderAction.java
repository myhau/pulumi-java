// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction {
    /**
     * Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
    /**
     * A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    private final @Nullable List<String> requestHeadersToRemoves;
    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
    /**
     * A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    private final @Nullable List<String> responseHeadersToRemoves;

    @OutputCustomType.Constructor({"requestHeadersToAdds","requestHeadersToRemoves","responseHeadersToAdds","responseHeadersToRemoves"})
    private URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction(
        @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds,
        @Nullable List<String> requestHeadersToRemoves,
        @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds,
        @Nullable List<String> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    /**
     * Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    public List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? List.of() : this.requestHeadersToAdds;
    }
    /**
     * A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    public List<String> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? List.of() : this.requestHeadersToRemoves;
    }
    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    public List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? List.of() : this.responseHeadersToAdds;
    }
    /**
     * A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    public List<String> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? List.of() : this.responseHeadersToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
        private @Nullable List<String> requestHeadersToRemoves;
        private @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
        private @Nullable List<String> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder setRequestHeadersToAdds(@Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        public URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction build() {
            return new URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderAction(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}
