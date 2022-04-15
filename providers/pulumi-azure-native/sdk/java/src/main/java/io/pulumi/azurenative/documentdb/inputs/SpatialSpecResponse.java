// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpatialSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final SpatialSpecResponse Empty = new SpatialSpecResponse();

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> path() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * List of path's spatial type
     * 
     */
    @Import(name="types")
      private final @Nullable List<String> types;

    public List<String> types() {
        return this.types == null ? List.of() : this.types;
    }

    public SpatialSpecResponse(
        @Nullable String path,
        @Nullable List<String> types) {
        this.path = path;
        this.types = types;
    }

    private SpatialSpecResponse() {
        this.path = null;
        this.types = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpatialSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(SpatialSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.types = defaults.types;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder types(@Nullable List<String> types) {
            this.types = types;
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }        public SpatialSpecResponse build() {
            return new SpatialSpecResponse(path, types);
        }
    }
}
