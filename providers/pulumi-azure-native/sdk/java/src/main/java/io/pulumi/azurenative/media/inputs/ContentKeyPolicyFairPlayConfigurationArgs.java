// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.ContentKeyPolicyFairPlayRentalAndLeaseKeyType;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a configuration for FairPlay licenses.
 * 
 */
public final class ContentKeyPolicyFairPlayConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyFairPlayConfigurationArgs Empty = new ContentKeyPolicyFairPlayConfigurationArgs();

    /**
     * The key that must be used as FairPlay Application Secret key.
     * 
     */
    @Import(name="ask", required=true)
      private final Output<String> ask;

    public Output<String> ask() {
        return this.ask;
    }

    /**
     * The Base64 representation of FairPlay certificate in PKCS 12 (pfx) format (including private key).
     * 
     */
    @Import(name="fairPlayPfx", required=true)
      private final Output<String> fairPlayPfx;

    public Output<String> fairPlayPfx() {
        return this.fairPlayPfx;
    }

    /**
     * The password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     * 
     */
    @Import(name="fairPlayPfxPassword", required=true)
      private final Output<String> fairPlayPfxPassword;

    public Output<String> fairPlayPfxPassword() {
        return this.fairPlayPfxPassword;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Offline rental policy
     * 
     */
    @Import(name="offlineRentalConfiguration")
      private final @Nullable Output<ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs> offlineRentalConfiguration;

    public Output<ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs> offlineRentalConfiguration() {
        return this.offlineRentalConfiguration == null ? Codegen.empty() : this.offlineRentalConfiguration;
    }

    /**
     * The rental and lease key type.
     * 
     */
    @Import(name="rentalAndLeaseKeyType", required=true)
      private final Output<Either<String,ContentKeyPolicyFairPlayRentalAndLeaseKeyType>> rentalAndLeaseKeyType;

    public Output<Either<String,ContentKeyPolicyFairPlayRentalAndLeaseKeyType>> rentalAndLeaseKeyType() {
        return this.rentalAndLeaseKeyType;
    }

    /**
     * The rental duration. Must be greater than or equal to 0.
     * 
     */
    @Import(name="rentalDuration", required=true)
      private final Output<Double> rentalDuration;

    public Output<Double> rentalDuration() {
        return this.rentalDuration;
    }

    public ContentKeyPolicyFairPlayConfigurationArgs(
        Output<String> ask,
        Output<String> fairPlayPfx,
        Output<String> fairPlayPfxPassword,
        Output<String> odataType,
        @Nullable Output<ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs> offlineRentalConfiguration,
        Output<Either<String,ContentKeyPolicyFairPlayRentalAndLeaseKeyType>> rentalAndLeaseKeyType,
        Output<Double> rentalDuration) {
        this.ask = Objects.requireNonNull(ask, "expected parameter 'ask' to be non-null");
        this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx, "expected parameter 'fairPlayPfx' to be non-null");
        this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword, "expected parameter 'fairPlayPfxPassword' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.offlineRentalConfiguration = offlineRentalConfiguration;
        this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType, "expected parameter 'rentalAndLeaseKeyType' to be non-null");
        this.rentalDuration = Objects.requireNonNull(rentalDuration, "expected parameter 'rentalDuration' to be non-null");
    }

    private ContentKeyPolicyFairPlayConfigurationArgs() {
        this.ask = Codegen.empty();
        this.fairPlayPfx = Codegen.empty();
        this.fairPlayPfxPassword = Codegen.empty();
        this.odataType = Codegen.empty();
        this.offlineRentalConfiguration = Codegen.empty();
        this.rentalAndLeaseKeyType = Codegen.empty();
        this.rentalDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ask;
        private Output<String> fairPlayPfx;
        private Output<String> fairPlayPfxPassword;
        private Output<String> odataType;
        private @Nullable Output<ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs> offlineRentalConfiguration;
        private Output<Either<String,ContentKeyPolicyFairPlayRentalAndLeaseKeyType>> rentalAndLeaseKeyType;
        private Output<Double> rentalDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ask = defaults.ask;
    	      this.fairPlayPfx = defaults.fairPlayPfx;
    	      this.fairPlayPfxPassword = defaults.fairPlayPfxPassword;
    	      this.odataType = defaults.odataType;
    	      this.offlineRentalConfiguration = defaults.offlineRentalConfiguration;
    	      this.rentalAndLeaseKeyType = defaults.rentalAndLeaseKeyType;
    	      this.rentalDuration = defaults.rentalDuration;
        }

        public Builder ask(Output<String> ask) {
            this.ask = Objects.requireNonNull(ask);
            return this;
        }
        public Builder ask(String ask) {
            this.ask = Output.of(Objects.requireNonNull(ask));
            return this;
        }
        public Builder fairPlayPfx(Output<String> fairPlayPfx) {
            this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx);
            return this;
        }
        public Builder fairPlayPfx(String fairPlayPfx) {
            this.fairPlayPfx = Output.of(Objects.requireNonNull(fairPlayPfx));
            return this;
        }
        public Builder fairPlayPfxPassword(Output<String> fairPlayPfxPassword) {
            this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword);
            return this;
        }
        public Builder fairPlayPfxPassword(String fairPlayPfxPassword) {
            this.fairPlayPfxPassword = Output.of(Objects.requireNonNull(fairPlayPfxPassword));
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder offlineRentalConfiguration(@Nullable Output<ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs> offlineRentalConfiguration) {
            this.offlineRentalConfiguration = offlineRentalConfiguration;
            return this;
        }
        public Builder offlineRentalConfiguration(@Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs offlineRentalConfiguration) {
            this.offlineRentalConfiguration = Codegen.ofNullable(offlineRentalConfiguration);
            return this;
        }
        public Builder rentalAndLeaseKeyType(Output<Either<String,ContentKeyPolicyFairPlayRentalAndLeaseKeyType>> rentalAndLeaseKeyType) {
            this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType);
            return this;
        }
        public Builder rentalAndLeaseKeyType(Either<String,ContentKeyPolicyFairPlayRentalAndLeaseKeyType> rentalAndLeaseKeyType) {
            this.rentalAndLeaseKeyType = Output.of(Objects.requireNonNull(rentalAndLeaseKeyType));
            return this;
        }
        public Builder rentalDuration(Output<Double> rentalDuration) {
            this.rentalDuration = Objects.requireNonNull(rentalDuration);
            return this;
        }
        public Builder rentalDuration(Double rentalDuration) {
            this.rentalDuration = Output.of(Objects.requireNonNull(rentalDuration));
            return this;
        }        public ContentKeyPolicyFairPlayConfigurationArgs build() {
            return new ContentKeyPolicyFairPlayConfigurationArgs(ask, fairPlayPfx, fairPlayPfxPassword, odataType, offlineRentalConfiguration, rentalAndLeaseKeyType, rentalDuration);
        }
    }
}
