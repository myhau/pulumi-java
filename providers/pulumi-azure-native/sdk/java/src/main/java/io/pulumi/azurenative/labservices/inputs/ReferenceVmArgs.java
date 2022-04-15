// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of a Reference Vm
 * 
 */
public final class ReferenceVmArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReferenceVmArgs Empty = new ReferenceVmArgs();

    /**
     * The password of the virtual machine. This will be set to null in GET resource API
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The username of the virtual machine
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> userName() {
        return this.userName;
    }

    public ReferenceVmArgs(
        @Nullable Output<String> password,
        Output<String> userName) {
        this.password = password;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ReferenceVmArgs() {
        this.password = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceVmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public ReferenceVmArgs build() {
            return new ReferenceVmArgs(password, userName);
        }
    }
}
