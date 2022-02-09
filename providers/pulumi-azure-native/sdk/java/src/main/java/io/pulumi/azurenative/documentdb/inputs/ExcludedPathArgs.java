// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExcludedPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExcludedPathArgs Empty = new ExcludedPathArgs();

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public ExcludedPathArgs(@Nullable Input<String> path) {
        this.path = path;
    }

    private ExcludedPathArgs() {
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExcludedPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(ExcludedPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public ExcludedPathArgs build() {
            return new ExcludedPathArgs(path);
        }
    }
}