// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.config.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IgnoreTags extends io.pulumi.resources.InvokeArgs {

    public static final IgnoreTags Empty = new IgnoreTags();

    @InputImport(name="keyPrefixes")
      private final @Nullable List<String> keyPrefixes;

    public List<String> getKeyPrefixes() {
        return this.keyPrefixes == null ? List.of() : this.keyPrefixes;
    }

    @InputImport(name="keys")
      private final @Nullable List<String> keys;

    public List<String> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public IgnoreTags(
        @Nullable List<String> keyPrefixes,
        @Nullable List<String> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    private IgnoreTags() {
        this.keyPrefixes = List.of();
        this.keys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IgnoreTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> keyPrefixes;
        private @Nullable List<String> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(IgnoreTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder setKeyPrefixes(@Nullable List<String> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }

        public Builder setKeys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public IgnoreTags build() {
            return new IgnoreTags(keyPrefixes, keys);
        }
    }
}
