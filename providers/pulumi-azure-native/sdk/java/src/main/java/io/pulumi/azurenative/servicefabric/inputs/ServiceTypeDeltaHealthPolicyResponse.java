// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTypeDeltaHealthPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceTypeDeltaHealthPolicyResponse Empty = new ServiceTypeDeltaHealthPolicyResponse();

    @InputImport(name="maxPercentDeltaUnhealthyServices")
    private final @Nullable Integer maxPercentDeltaUnhealthyServices;

    public Optional<Integer> getMaxPercentDeltaUnhealthyServices() {
        return this.maxPercentDeltaUnhealthyServices == null ? Optional.empty() : Optional.ofNullable(this.maxPercentDeltaUnhealthyServices);
    }

    public ServiceTypeDeltaHealthPolicyResponse(@Nullable Integer maxPercentDeltaUnhealthyServices) {
        this.maxPercentDeltaUnhealthyServices = maxPercentDeltaUnhealthyServices == null ? 0 : maxPercentDeltaUnhealthyServices;
    }

    private ServiceTypeDeltaHealthPolicyResponse() {
        this.maxPercentDeltaUnhealthyServices = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTypeDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxPercentDeltaUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTypeDeltaHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentDeltaUnhealthyServices = defaults.maxPercentDeltaUnhealthyServices;
        }

        public Builder setMaxPercentDeltaUnhealthyServices(@Nullable Integer maxPercentDeltaUnhealthyServices) {
            this.maxPercentDeltaUnhealthyServices = maxPercentDeltaUnhealthyServices;
            return this;
        }

        public ServiceTypeDeltaHealthPolicyResponse build() {
            return new ServiceTypeDeltaHealthPolicyResponse(maxPercentDeltaUnhealthyServices);
        }
    }
}