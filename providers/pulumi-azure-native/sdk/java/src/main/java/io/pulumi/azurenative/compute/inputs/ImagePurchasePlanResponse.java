// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagePurchasePlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImagePurchasePlanResponse Empty = new ImagePurchasePlanResponse();

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="product")
    private final @Nullable String product;

    public Optional<String> getProduct() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    @InputImport(name="publisher")
    private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    public ImagePurchasePlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.publisher = publisher;
    }

    private ImagePurchasePlanResponse() {
        this.name = null;
        this.product = null;
        this.publisher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePurchasePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.publisher = defaults.publisher;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProduct(@Nullable String product) {
            this.product = product;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public ImagePurchasePlanResponse build() {
            return new ImagePurchasePlanResponse(name, product, publisher);
        }
    }
}