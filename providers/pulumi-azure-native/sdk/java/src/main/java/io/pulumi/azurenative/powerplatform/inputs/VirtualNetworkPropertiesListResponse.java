// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.VirtualNetworkPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A list of private link resources
 * 
 */
public final class VirtualNetworkPropertiesListResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPropertiesListResponse Empty = new VirtualNetworkPropertiesListResponse();

    /**
     * Next page link if any.
     * 
     */
    @Import(name="nextLink")
      private final @Nullable String nextLink;

    public Optional<String> nextLink() {
        return this.nextLink == null ? Optional.empty() : Optional.ofNullable(this.nextLink);
    }

    /**
     * Array of virtual networks.
     * 
     */
    @Import(name="value")
      private final @Nullable List<VirtualNetworkPropertiesResponse> value;

    public List<VirtualNetworkPropertiesResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public VirtualNetworkPropertiesListResponse(
        @Nullable String nextLink,
        @Nullable List<VirtualNetworkPropertiesResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    private VirtualNetworkPropertiesListResponse() {
        this.nextLink = null;
        this.value = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<VirtualNetworkPropertiesResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<VirtualNetworkPropertiesResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(VirtualNetworkPropertiesResponse... value) {
            return value(List.of(value));
        }        public VirtualNetworkPropertiesListResponse build() {
            return new VirtualNetworkPropertiesListResponse(nextLink, value);
        }
    }
}
