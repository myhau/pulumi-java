// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RCranPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final RCranPackageArgs Empty = new RCranPackageArgs();

    /**
     * The package name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The repository name.
     * 
     */
    @Import(name="repository")
      private final @Nullable Output<String> repository;

    public Output<String> repository() {
        return this.repository == null ? Codegen.empty() : this.repository;
    }

    public RCranPackageArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> repository) {
        this.name = name;
        this.repository = repository;
    }

    private RCranPackageArgs() {
        this.name = Codegen.empty();
        this.repository = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RCranPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RCranPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.repository = defaults.repository;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder repository(@Nullable Output<String> repository) {
            this.repository = repository;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = Codegen.ofNullable(repository);
            return this;
        }        public RCranPackageArgs build() {
            return new RCranPackageArgs(name, repository);
        }
    }
}
