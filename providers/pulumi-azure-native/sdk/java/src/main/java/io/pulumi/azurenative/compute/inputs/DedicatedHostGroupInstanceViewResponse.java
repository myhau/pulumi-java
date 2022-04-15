// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DedicatedHostInstanceViewWithNameResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedHostGroupInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final DedicatedHostGroupInstanceViewResponse Empty = new DedicatedHostGroupInstanceViewResponse();

    /**
     * List of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    @Import(name="hosts")
      private final @Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts;

    public List<DedicatedHostInstanceViewWithNameResponse> hosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }

    public DedicatedHostGroupInstanceViewResponse(@Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts) {
        this.hosts = hosts;
    }

    private DedicatedHostGroupInstanceViewResponse() {
        this.hosts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostGroupInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostGroupInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
        }

        public Builder hosts(@Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts) {
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(DedicatedHostInstanceViewWithNameResponse... hosts) {
            return hosts(List.of(hosts));
        }        public DedicatedHostGroupInstanceViewResponse build() {
            return new DedicatedHostGroupInstanceViewResponse(hosts);
        }
    }
}
