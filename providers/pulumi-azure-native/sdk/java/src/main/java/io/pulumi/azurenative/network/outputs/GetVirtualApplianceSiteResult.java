// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.Office365PolicyPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualApplianceSiteResult {
    private final @Nullable String addressPrefix;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable Office365PolicyPropertiesResponse o365Policy;
    private final String provisioningState;
    private final String type;

    @OutputCustomType.Constructor({"addressPrefix","etag","id","name","o365Policy","provisioningState","type"})
    private GetVirtualApplianceSiteResult(
        @Nullable String addressPrefix,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Office365PolicyPropertiesResponse o365Policy,
        String provisioningState,
        String type) {
        this.addressPrefix = addressPrefix;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.o365Policy = o365Policy;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Office365PolicyPropertiesResponse> getO365Policy() {
        return Optional.ofNullable(this.o365Policy);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualApplianceSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Office365PolicyPropertiesResponse o365Policy;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualApplianceSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.o365Policy = defaults.o365Policy;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setO365Policy(@Nullable Office365PolicyPropertiesResponse o365Policy) {
            this.o365Policy = o365Policy;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetVirtualApplianceSiteResult build() {
            return new GetVirtualApplianceSiteResult(addressPrefix, etag, id, name, o365Policy, provisioningState, type);
        }
    }
}