// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GetVirtualServiceSpecProvider;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetVirtualServiceSpec {
    /**
     * The App Mesh object that is acting as the provider for a virtual service.
     * 
     */
    private final List<GetVirtualServiceSpecProvider> providers;

    @OutputCustomType.Constructor({"providers"})
    private GetVirtualServiceSpec(List<GetVirtualServiceSpecProvider> providers) {
        this.providers = Objects.requireNonNull(providers);
    }

    /**
     * The App Mesh object that is acting as the provider for a virtual service.
     * 
     */
    public List<GetVirtualServiceSpecProvider> getProviders() {
        return this.providers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetVirtualServiceSpecProvider> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providers = defaults.providers;
        }

        public Builder setProviders(List<GetVirtualServiceSpecProvider> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public GetVirtualServiceSpec build() {
            return new GetVirtualServiceSpec(providers);
        }
    }
}
