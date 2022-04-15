// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions {
    private final @Nullable String optInHeaders;

    @CustomType.Constructor
    private ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions(@CustomType.Parameter("optInHeaders") @Nullable String optInHeaders) {
        this.optInHeaders = optInHeaders;
    }

    public Optional<String> optInHeaders() {
        return Optional.ofNullable(this.optInHeaders);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optInHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optInHeaders = defaults.optInHeaders;
        }

        public Builder optInHeaders(@Nullable String optInHeaders) {
            this.optInHeaders = optInHeaders;
            return this;
        }        public ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions build() {
            return new ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions(optInHeaders);
        }
    }
}
