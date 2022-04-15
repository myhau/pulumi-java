// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.azurenative.solutions.enums.ApplicationManagementMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed application management policy.
 * 
 */
public final class ApplicationManagementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationManagementPolicyArgs Empty = new ApplicationManagementPolicyArgs();

    /**
     * The managed application management mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<Either<String,ApplicationManagementMode>> mode;

    public Output<Either<String,ApplicationManagementMode>> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    public ApplicationManagementPolicyArgs(@Nullable Output<Either<String,ApplicationManagementMode>> mode) {
        this.mode = mode;
    }

    private ApplicationManagementPolicyArgs() {
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationManagementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ApplicationManagementMode>> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationManagementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(@Nullable Output<Either<String,ApplicationManagementMode>> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable Either<String,ApplicationManagementMode> mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }        public ApplicationManagementPolicyArgs build() {
            return new ApplicationManagementPolicyArgs(mode);
        }
    }
}
