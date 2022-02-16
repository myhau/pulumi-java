// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy {
    private final String backendService;

    @OutputCustomType.Constructor({"backendService"})
    private RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy(String backendService) {
        this.backendService = Objects.requireNonNull(backendService);
    }

    public String getBackendService() {
        return this.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy(backendService);
        }
    }
}