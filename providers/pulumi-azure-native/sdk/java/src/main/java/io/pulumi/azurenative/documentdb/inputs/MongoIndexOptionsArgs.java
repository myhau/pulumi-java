// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection index options
 * 
 */
public final class MongoIndexOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoIndexOptionsArgs Empty = new MongoIndexOptionsArgs();

    /**
     * Expire after seconds
     * 
     */
    @Import(name="expireAfterSeconds")
      private final @Nullable Output<Integer> expireAfterSeconds;

    public Output<Integer> expireAfterSeconds() {
        return this.expireAfterSeconds == null ? Codegen.empty() : this.expireAfterSeconds;
    }

    /**
     * Is unique or not
     * 
     */
    @Import(name="unique")
      private final @Nullable Output<Boolean> unique;

    public Output<Boolean> unique() {
        return this.unique == null ? Codegen.empty() : this.unique;
    }

    public MongoIndexOptionsArgs(
        @Nullable Output<Integer> expireAfterSeconds,
        @Nullable Output<Boolean> unique) {
        this.expireAfterSeconds = expireAfterSeconds;
        this.unique = unique;
    }

    private MongoIndexOptionsArgs() {
        this.expireAfterSeconds = Codegen.empty();
        this.unique = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> expireAfterSeconds;
        private @Nullable Output<Boolean> unique;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireAfterSeconds = defaults.expireAfterSeconds;
    	      this.unique = defaults.unique;
        }

        public Builder expireAfterSeconds(@Nullable Output<Integer> expireAfterSeconds) {
            this.expireAfterSeconds = expireAfterSeconds;
            return this;
        }
        public Builder expireAfterSeconds(@Nullable Integer expireAfterSeconds) {
            this.expireAfterSeconds = Codegen.ofNullable(expireAfterSeconds);
            return this;
        }
        public Builder unique(@Nullable Output<Boolean> unique) {
            this.unique = unique;
            return this;
        }
        public Builder unique(@Nullable Boolean unique) {
            this.unique = Codegen.ofNullable(unique);
            return this;
        }        public MongoIndexOptionsArgs build() {
            return new MongoIndexOptionsArgs(expireAfterSeconds, unique);
        }
    }
}
