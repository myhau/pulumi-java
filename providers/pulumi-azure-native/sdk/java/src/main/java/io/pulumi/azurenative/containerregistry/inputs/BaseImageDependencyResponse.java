// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties that describe a base image dependency.
 * 
 */
public final class BaseImageDependencyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BaseImageDependencyResponse Empty = new BaseImageDependencyResponse();

    /**
     * The sha256-based digest of the image manifest.
     * 
     */
    @Import(name="digest")
      private final @Nullable String digest;

    public Optional<String> digest() {
        return this.digest == null ? Optional.empty() : Optional.ofNullable(this.digest);
    }

    /**
     * The registry login server.
     * 
     */
    @Import(name="registry")
      private final @Nullable String registry;

    public Optional<String> registry() {
        return this.registry == null ? Optional.empty() : Optional.ofNullable(this.registry);
    }

    /**
     * The repository name.
     * 
     */
    @Import(name="repository")
      private final @Nullable String repository;

    public Optional<String> repository() {
        return this.repository == null ? Optional.empty() : Optional.ofNullable(this.repository);
    }

    /**
     * The tag name.
     * 
     */
    @Import(name="tag")
      private final @Nullable String tag;

    public Optional<String> tag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    /**
     * The type of the base image dependency.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public BaseImageDependencyResponse(
        @Nullable String digest,
        @Nullable String registry,
        @Nullable String repository,
        @Nullable String tag,
        @Nullable String type) {
        this.digest = digest;
        this.registry = registry;
        this.repository = repository;
        this.tag = tag;
        this.type = type;
    }

    private BaseImageDependencyResponse() {
        this.digest = null;
        this.registry = null;
        this.repository = null;
        this.tag = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaseImageDependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private @Nullable String registry;
        private @Nullable String repository;
        private @Nullable String tag;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BaseImageDependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.registry = defaults.registry;
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        public Builder digest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }
        public Builder registry(@Nullable String registry) {
            this.registry = registry;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public BaseImageDependencyResponse build() {
            return new BaseImageDependencyResponse(digest, registry, repository, tag, type);
        }
    }
}
