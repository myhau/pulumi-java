// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs();

    /**
     * Headers to add to a matching request prior to forwarding the request to the
     * backendService.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestHeadersToAdds")
    private final @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds;

    public Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? Input.empty() : this.requestHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the request
     * prior to forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToRemoves")
    private final @Nullable Input<List<String>> requestHeadersToRemoves;

    public Input<List<String>> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? Input.empty() : this.requestHeadersToRemoves;
    }

    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    @InputImport(name="responseHeadersToAdds")
    private final @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds;

    public Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? Input.empty() : this.responseHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the response
     * prior to sending the response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToRemoves")
    private final @Nullable Input<List<String>> responseHeadersToRemoves;

    public Input<List<String>> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? Input.empty() : this.responseHeadersToRemoves;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs(
        @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds,
        @Nullable Input<List<String>> requestHeadersToRemoves,
        @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds,
        @Nullable Input<List<String>> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs() {
        this.requestHeadersToAdds = Input.empty();
        this.requestHeadersToRemoves = Input.empty();
        this.responseHeadersToAdds = Input.empty();
        this.responseHeadersToRemoves = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds;
        private @Nullable Input<List<String>> requestHeadersToRemoves;
        private @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds;
        private @Nullable Input<List<String>> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder setRequestHeadersToAdds(@Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        public Builder setRequestHeadersToAdds(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs> requestHeadersToAdds) {
            this.requestHeadersToAdds = Input.ofNullable(requestHeadersToAdds);
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable Input<List<String>> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = Input.ofNullable(requestHeadersToRemoves);
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs> responseHeadersToAdds) {
            this.responseHeadersToAdds = Input.ofNullable(responseHeadersToAdds);
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable Input<List<String>> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = Input.ofNullable(responseHeadersToRemoves);
            return this;
        }

        public RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}
