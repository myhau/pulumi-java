// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtendedLocationOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtendedLocationOptionsArgs Empty = new ExtendedLocationOptionsArgs();

    @Import(name="supportedPolicy")
      private final @Nullable Output<String> supportedPolicy;

    public Output<String> supportedPolicy() {
        return this.supportedPolicy == null ? Codegen.empty() : this.supportedPolicy;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ExtendedLocationOptionsArgs(
        @Nullable Output<String> supportedPolicy,
        @Nullable Output<String> type) {
        this.supportedPolicy = supportedPolicy;
        this.type = type;
    }

    private ExtendedLocationOptionsArgs() {
        this.supportedPolicy = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedLocationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> supportedPolicy;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedLocationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedPolicy = defaults.supportedPolicy;
    	      this.type = defaults.type;
        }

        public Builder supportedPolicy(@Nullable Output<String> supportedPolicy) {
            this.supportedPolicy = supportedPolicy;
            return this;
        }
        public Builder supportedPolicy(@Nullable String supportedPolicy) {
            this.supportedPolicy = Codegen.ofNullable(supportedPolicy);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ExtendedLocationOptionsArgs build() {
            return new ExtendedLocationOptionsArgs(supportedPolicy, type);
        }
    }
}
