// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EdgeCacheKeysetPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheKeysetPublicKeyArgs Empty = new EdgeCacheKeysetPublicKeyArgs();

    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public EdgeCacheKeysetPublicKeyArgs(
        Input<String> id,
        Input<String> value) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EdgeCacheKeysetPublicKeyArgs() {
        this.id = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheKeysetPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheKeysetPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.value = defaults.value;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public EdgeCacheKeysetPublicKeyArgs build() {
            return new EdgeCacheKeysetPublicKeyArgs(id, value);
        }
    }
}