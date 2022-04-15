// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.SecurityTypes;
import io.pulumi.azurenative.compute.inputs.UefiSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the Security profile settings for the virtual machine or virtual machine scale set.
 * 
 */
public final class SecurityProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileArgs Empty = new SecurityProfileArgs();

    /**
     * This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. <br><br> Default: The Encryption at host will be disabled unless this property is set to true for the resource.
     * 
     */
    @Import(name="encryptionAtHost")
      private final @Nullable Output<Boolean> encryptionAtHost;

    public Output<Boolean> encryptionAtHost() {
        return this.encryptionAtHost == null ? Codegen.empty() : this.encryptionAtHost;
    }

    /**
     * Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. <br><br> Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
     * 
     */
    @Import(name="securityType")
      private final @Nullable Output<Either<String,SecurityTypes>> securityType;

    public Output<Either<String,SecurityTypes>> securityType() {
        return this.securityType == null ? Codegen.empty() : this.securityType;
    }

    /**
     * Specifies the security settings like secure boot and vTPM used while creating the virtual machine. <br><br>Minimum api-version: 2020-12-01
     * 
     */
    @Import(name="uefiSettings")
      private final @Nullable Output<UefiSettingsArgs> uefiSettings;

    public Output<UefiSettingsArgs> uefiSettings() {
        return this.uefiSettings == null ? Codegen.empty() : this.uefiSettings;
    }

    public SecurityProfileArgs(
        @Nullable Output<Boolean> encryptionAtHost,
        @Nullable Output<Either<String,SecurityTypes>> securityType,
        @Nullable Output<UefiSettingsArgs> uefiSettings) {
        this.encryptionAtHost = encryptionAtHost;
        this.securityType = securityType;
        this.uefiSettings = uefiSettings;
    }

    private SecurityProfileArgs() {
        this.encryptionAtHost = Codegen.empty();
        this.securityType = Codegen.empty();
        this.uefiSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> encryptionAtHost;
        private @Nullable Output<Either<String,SecurityTypes>> securityType;
        private @Nullable Output<UefiSettingsArgs> uefiSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAtHost = defaults.encryptionAtHost;
    	      this.securityType = defaults.securityType;
    	      this.uefiSettings = defaults.uefiSettings;
        }

        public Builder encryptionAtHost(@Nullable Output<Boolean> encryptionAtHost) {
            this.encryptionAtHost = encryptionAtHost;
            return this;
        }
        public Builder encryptionAtHost(@Nullable Boolean encryptionAtHost) {
            this.encryptionAtHost = Codegen.ofNullable(encryptionAtHost);
            return this;
        }
        public Builder securityType(@Nullable Output<Either<String,SecurityTypes>> securityType) {
            this.securityType = securityType;
            return this;
        }
        public Builder securityType(@Nullable Either<String,SecurityTypes> securityType) {
            this.securityType = Codegen.ofNullable(securityType);
            return this;
        }
        public Builder uefiSettings(@Nullable Output<UefiSettingsArgs> uefiSettings) {
            this.uefiSettings = uefiSettings;
            return this;
        }
        public Builder uefiSettings(@Nullable UefiSettingsArgs uefiSettings) {
            this.uefiSettings = Codegen.ofNullable(uefiSettings);
            return this;
        }        public SecurityProfileArgs build() {
            return new SecurityProfileArgs(encryptionAtHost, securityType, uefiSettings);
        }
    }
}
