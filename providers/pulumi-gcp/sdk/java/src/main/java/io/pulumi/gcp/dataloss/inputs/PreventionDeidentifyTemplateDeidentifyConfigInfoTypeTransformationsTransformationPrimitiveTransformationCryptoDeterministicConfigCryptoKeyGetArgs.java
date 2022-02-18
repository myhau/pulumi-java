// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs();

    /**
     * Kms wrapped key
     * Structure is documented below.
     * 
     */
    @InputImport(name="kmsWrapped")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs> kmsWrapped;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs> getKmsWrapped() {
        return this.kmsWrapped == null ? Input.empty() : this.kmsWrapped;
    }

    /**
     * Transient crypto key
     * Structure is documented below.
     * 
     */
    @InputImport(name="transient")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs> $transient;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs> get$transient() {
        return this.$transient == null ? Input.empty() : this.$transient;
    }

    /**
     * Unwrapped crypto key
     * Structure is documented below.
     * 
     */
    @InputImport(name="unwrapped")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs> unwrapped;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs> getUnwrapped() {
        return this.unwrapped == null ? Input.empty() : this.unwrapped;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs(
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs> kmsWrapped,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs> $transient,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs> unwrapped) {
        this.kmsWrapped = kmsWrapped;
        this.$transient = $transient;
        this.unwrapped = unwrapped;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs() {
        this.kmsWrapped = Input.empty();
        this.$transient = Input.empty();
        this.unwrapped = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs> kmsWrapped;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs> $transient;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs> unwrapped;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsWrapped = defaults.kmsWrapped;
    	      this.$transient = defaults.$transient;
    	      this.unwrapped = defaults.unwrapped;
        }

        public Builder setKmsWrapped(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs> kmsWrapped) {
            this.kmsWrapped = kmsWrapped;
            return this;
        }

        public Builder setKmsWrapped(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedGetArgs kmsWrapped) {
            this.kmsWrapped = Input.ofNullable(kmsWrapped);
            return this;
        }

        public Builder set$transient(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs> $transient) {
            this.$transient = $transient;
            return this;
        }

        public Builder set$transient(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientGetArgs $transient) {
            this.$transient = Input.ofNullable($transient);
            return this;
        }

        public Builder setUnwrapped(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs> unwrapped) {
            this.unwrapped = unwrapped;
            return this;
        }

        public Builder setUnwrapped(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs unwrapped) {
            this.unwrapped = Input.ofNullable(unwrapped);
            return this;
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyGetArgs(kmsWrapped, $transient, unwrapped);
        }
    }
}
