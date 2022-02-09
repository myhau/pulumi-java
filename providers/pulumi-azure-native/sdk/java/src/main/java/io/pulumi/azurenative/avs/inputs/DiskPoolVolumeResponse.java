// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskPoolVolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskPoolVolumeResponse Empty = new DiskPoolVolumeResponse();

    @InputImport(name="endpoints")
    private final @Nullable List<String> endpoints;

    public List<String> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }

    @InputImport(name="lunName")
    private final @Nullable String lunName;

    public Optional<String> getLunName() {
        return this.lunName == null ? Optional.empty() : Optional.ofNullable(this.lunName);
    }

    public DiskPoolVolumeResponse(
        @Nullable List<String> endpoints,
        @Nullable String lunName) {
        this.endpoints = endpoints;
        this.lunName = lunName;
    }

    private DiskPoolVolumeResponse() {
        this.endpoints = List.of();
        this.lunName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskPoolVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> endpoints;
        private @Nullable String lunName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskPoolVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.lunName = defaults.lunName;
        }

        public Builder setEndpoints(@Nullable List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setLunName(@Nullable String lunName) {
            this.lunName = lunName;
            return this;
        }

        public DiskPoolVolumeResponse build() {
            return new DiskPoolVolumeResponse(endpoints, lunName);
        }
    }
}