// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GalleryImageFeatureResponse {
    /**
     * The name of the gallery image feature.
     * 
     */
    private final @Nullable String name;
    /**
     * The value of the gallery image feature.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GalleryImageFeatureResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The name of the gallery image feature.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The value of the gallery image feature.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GalleryImageFeatureResponse build() {
            return new GalleryImageFeatureResponse(name, value);
        }
    }
}
