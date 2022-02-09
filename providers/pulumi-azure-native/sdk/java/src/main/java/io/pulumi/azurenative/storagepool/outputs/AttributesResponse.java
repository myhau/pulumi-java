// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class AttributesResponse {
    private final Boolean authentication;
    private final Boolean prodModeWriteProtect;

    @OutputCustomType.Constructor({"authentication","prodModeWriteProtect"})
    private AttributesResponse(
        Boolean authentication,
        Boolean prodModeWriteProtect) {
        this.authentication = Objects.requireNonNull(authentication);
        this.prodModeWriteProtect = Objects.requireNonNull(prodModeWriteProtect);
    }

    public Boolean getAuthentication() {
        return this.authentication;
    }
    public Boolean getProdModeWriteProtect() {
        return this.prodModeWriteProtect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean authentication;
        private Boolean prodModeWriteProtect;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.prodModeWriteProtect = defaults.prodModeWriteProtect;
        }

        public Builder setAuthentication(Boolean authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setProdModeWriteProtect(Boolean prodModeWriteProtect) {
            this.prodModeWriteProtect = Objects.requireNonNull(prodModeWriteProtect);
            return this;
        }

        public AttributesResponse build() {
            return new AttributesResponse(authentication, prodModeWriteProtect);
        }
    }
}