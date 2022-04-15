// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MongoIndexKeysResponse {
    /**
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     * 
     */
    private final @Nullable List<String> keys;

    @CustomType.Constructor
    private MongoIndexKeysResponse(@CustomType.Parameter("keys") @Nullable List<String> keys) {
        this.keys = keys;
    }

    /**
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     * 
    */
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder keys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }        public MongoIndexKeysResponse build() {
            return new MongoIndexKeysResponse(keys);
        }
    }
}
