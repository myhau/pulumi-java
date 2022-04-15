// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.IdentityProviderInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of an add provider request.
 * 
 */
public final class AddRecoveryServicesProviderInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddRecoveryServicesProviderInputPropertiesArgs Empty = new AddRecoveryServicesProviderInputPropertiesArgs();

    /**
     * The identity provider input for DRA authentication.
     * 
     */
    @Import(name="authenticationIdentityInput", required=true)
      private final Output<IdentityProviderInputArgs> authenticationIdentityInput;

    public Output<IdentityProviderInputArgs> authenticationIdentityInput() {
        return this.authenticationIdentityInput;
    }

    /**
     * The identity provider input for data plane authentication.
     * 
     */
    @Import(name="dataPlaneAuthenticationIdentityInput")
      private final @Nullable Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput;

    public Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput() {
        return this.dataPlaneAuthenticationIdentityInput == null ? Codegen.empty() : this.dataPlaneAuthenticationIdentityInput;
    }

    /**
     * The Id of the machine where the provider is getting added.
     * 
     */
    @Import(name="machineId")
      private final @Nullable Output<String> machineId;

    public Output<String> machineId() {
        return this.machineId == null ? Codegen.empty() : this.machineId;
    }

    /**
     * The name of the machine where the provider is getting added.
     * 
     */
    @Import(name="machineName", required=true)
      private final Output<String> machineName;

    public Output<String> machineName() {
        return this.machineName;
    }

    /**
     * The identity provider input for resource access.
     * 
     */
    @Import(name="resourceAccessIdentityInput", required=true)
      private final Output<IdentityProviderInputArgs> resourceAccessIdentityInput;

    public Output<IdentityProviderInputArgs> resourceAccessIdentityInput() {
        return this.resourceAccessIdentityInput;
    }

    public AddRecoveryServicesProviderInputPropertiesArgs(
        Output<IdentityProviderInputArgs> authenticationIdentityInput,
        @Nullable Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput,
        @Nullable Output<String> machineId,
        Output<String> machineName,
        Output<IdentityProviderInputArgs> resourceAccessIdentityInput) {
        this.authenticationIdentityInput = Objects.requireNonNull(authenticationIdentityInput, "expected parameter 'authenticationIdentityInput' to be non-null");
        this.dataPlaneAuthenticationIdentityInput = dataPlaneAuthenticationIdentityInput;
        this.machineId = machineId;
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.resourceAccessIdentityInput = Objects.requireNonNull(resourceAccessIdentityInput, "expected parameter 'resourceAccessIdentityInput' to be non-null");
    }

    private AddRecoveryServicesProviderInputPropertiesArgs() {
        this.authenticationIdentityInput = Codegen.empty();
        this.dataPlaneAuthenticationIdentityInput = Codegen.empty();
        this.machineId = Codegen.empty();
        this.machineName = Codegen.empty();
        this.resourceAccessIdentityInput = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddRecoveryServicesProviderInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<IdentityProviderInputArgs> authenticationIdentityInput;
        private @Nullable Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput;
        private @Nullable Output<String> machineId;
        private Output<String> machineName;
        private Output<IdentityProviderInputArgs> resourceAccessIdentityInput;

        public Builder() {
    	      // Empty
        }

        public Builder(AddRecoveryServicesProviderInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationIdentityInput = defaults.authenticationIdentityInput;
    	      this.dataPlaneAuthenticationIdentityInput = defaults.dataPlaneAuthenticationIdentityInput;
    	      this.machineId = defaults.machineId;
    	      this.machineName = defaults.machineName;
    	      this.resourceAccessIdentityInput = defaults.resourceAccessIdentityInput;
        }

        public Builder authenticationIdentityInput(Output<IdentityProviderInputArgs> authenticationIdentityInput) {
            this.authenticationIdentityInput = Objects.requireNonNull(authenticationIdentityInput);
            return this;
        }
        public Builder authenticationIdentityInput(IdentityProviderInputArgs authenticationIdentityInput) {
            this.authenticationIdentityInput = Output.of(Objects.requireNonNull(authenticationIdentityInput));
            return this;
        }
        public Builder dataPlaneAuthenticationIdentityInput(@Nullable Output<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput) {
            this.dataPlaneAuthenticationIdentityInput = dataPlaneAuthenticationIdentityInput;
            return this;
        }
        public Builder dataPlaneAuthenticationIdentityInput(@Nullable IdentityProviderInputArgs dataPlaneAuthenticationIdentityInput) {
            this.dataPlaneAuthenticationIdentityInput = Codegen.ofNullable(dataPlaneAuthenticationIdentityInput);
            return this;
        }
        public Builder machineId(@Nullable Output<String> machineId) {
            this.machineId = machineId;
            return this;
        }
        public Builder machineId(@Nullable String machineId) {
            this.machineId = Codegen.ofNullable(machineId);
            return this;
        }
        public Builder machineName(Output<String> machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }
        public Builder machineName(String machineName) {
            this.machineName = Output.of(Objects.requireNonNull(machineName));
            return this;
        }
        public Builder resourceAccessIdentityInput(Output<IdentityProviderInputArgs> resourceAccessIdentityInput) {
            this.resourceAccessIdentityInput = Objects.requireNonNull(resourceAccessIdentityInput);
            return this;
        }
        public Builder resourceAccessIdentityInput(IdentityProviderInputArgs resourceAccessIdentityInput) {
            this.resourceAccessIdentityInput = Output.of(Objects.requireNonNull(resourceAccessIdentityInput));
            return this;
        }        public AddRecoveryServicesProviderInputPropertiesArgs build() {
            return new AddRecoveryServicesProviderInputPropertiesArgs(authenticationIdentityInput, dataPlaneAuthenticationIdentityInput, machineId, machineName, resourceAccessIdentityInput);
        }
    }
}
