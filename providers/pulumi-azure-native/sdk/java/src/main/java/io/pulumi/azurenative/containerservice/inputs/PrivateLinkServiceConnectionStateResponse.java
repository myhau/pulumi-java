// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkServiceConnectionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public PrivateLinkServiceConnectionStateResponse(
        @Nullable String description,
        @Nullable String status) {
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateResponse() {
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(description, status);
        }
    }
}