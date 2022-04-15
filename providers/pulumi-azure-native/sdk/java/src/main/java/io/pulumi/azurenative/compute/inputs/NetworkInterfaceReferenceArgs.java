// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DeleteOptions;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a network interface reference.
 * 
 */
public final class NetworkInterfaceReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceReferenceArgs Empty = new NetworkInterfaceReferenceArgs();

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
      private final @Nullable Output<Either<String,DeleteOptions>> deleteOption;

    public Output<Either<String,DeleteOptions>> deleteOption() {
        return this.deleteOption == null ? Codegen.empty() : this.deleteOption;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
      private final @Nullable Output<Boolean> primary;

    public Output<Boolean> primary() {
        return this.primary == null ? Codegen.empty() : this.primary;
    }

    public NetworkInterfaceReferenceArgs(
        @Nullable Output<Either<String,DeleteOptions>> deleteOption,
        @Nullable Output<String> id,
        @Nullable Output<Boolean> primary) {
        this.deleteOption = deleteOption;
        this.id = id;
        this.primary = primary;
    }

    private NetworkInterfaceReferenceArgs() {
        this.deleteOption = Codegen.empty();
        this.id = Codegen.empty();
        this.primary = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DeleteOptions>> deleteOption;
        private @Nullable Output<String> id;
        private @Nullable Output<Boolean> primary;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.id = defaults.id;
    	      this.primary = defaults.primary;
        }

        public Builder deleteOption(@Nullable Output<Either<String,DeleteOptions>> deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }
        public Builder deleteOption(@Nullable Either<String,DeleteOptions> deleteOption) {
            this.deleteOption = Codegen.ofNullable(deleteOption);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder primary(@Nullable Output<Boolean> primary) {
            this.primary = primary;
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = Codegen.ofNullable(primary);
            return this;
        }        public NetworkInterfaceReferenceArgs build() {
            return new NetworkInterfaceReferenceArgs(deleteOption, id, primary);
        }
    }
}
