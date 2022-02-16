// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs();

    @InputImport(name="characterMaskConfig")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs> characterMaskConfig;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs> getCharacterMaskConfig() {
        return this.characterMaskConfig == null ? Input.empty() : this.characterMaskConfig;
    }

    @InputImport(name="cryptoDeterministicConfig")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs> cryptoDeterministicConfig;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs> getCryptoDeterministicConfig() {
        return this.cryptoDeterministicConfig == null ? Input.empty() : this.cryptoDeterministicConfig;
    }

    @InputImport(name="cryptoReplaceFfxFpeConfig")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs> cryptoReplaceFfxFpeConfig;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs> getCryptoReplaceFfxFpeConfig() {
        return this.cryptoReplaceFfxFpeConfig == null ? Input.empty() : this.cryptoReplaceFfxFpeConfig;
    }

    @InputImport(name="replaceConfig")
    private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs> replaceConfig;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs> getReplaceConfig() {
        return this.replaceConfig == null ? Input.empty() : this.replaceConfig;
    }

    @InputImport(name="replaceWithInfoTypeConfig")
    private final @Nullable Input<Boolean> replaceWithInfoTypeConfig;

    public Input<Boolean> getReplaceWithInfoTypeConfig() {
        return this.replaceWithInfoTypeConfig == null ? Input.empty() : this.replaceWithInfoTypeConfig;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs(
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs> characterMaskConfig,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs> cryptoDeterministicConfig,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs> cryptoReplaceFfxFpeConfig,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs> replaceConfig,
        @Nullable Input<Boolean> replaceWithInfoTypeConfig) {
        this.characterMaskConfig = characterMaskConfig;
        this.cryptoDeterministicConfig = cryptoDeterministicConfig;
        this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
        this.replaceConfig = replaceConfig;
        this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs() {
        this.characterMaskConfig = Input.empty();
        this.cryptoDeterministicConfig = Input.empty();
        this.cryptoReplaceFfxFpeConfig = Input.empty();
        this.replaceConfig = Input.empty();
        this.replaceWithInfoTypeConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs> characterMaskConfig;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs> cryptoDeterministicConfig;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs> cryptoReplaceFfxFpeConfig;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs> replaceConfig;
        private @Nullable Input<Boolean> replaceWithInfoTypeConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterMaskConfig = defaults.characterMaskConfig;
    	      this.cryptoDeterministicConfig = defaults.cryptoDeterministicConfig;
    	      this.cryptoReplaceFfxFpeConfig = defaults.cryptoReplaceFfxFpeConfig;
    	      this.replaceConfig = defaults.replaceConfig;
    	      this.replaceWithInfoTypeConfig = defaults.replaceWithInfoTypeConfig;
        }

        public Builder setCharacterMaskConfig(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs> characterMaskConfig) {
            this.characterMaskConfig = characterMaskConfig;
            return this;
        }

        public Builder setCharacterMaskConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs characterMaskConfig) {
            this.characterMaskConfig = Input.ofNullable(characterMaskConfig);
            return this;
        }

        public Builder setCryptoDeterministicConfig(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs> cryptoDeterministicConfig) {
            this.cryptoDeterministicConfig = cryptoDeterministicConfig;
            return this;
        }

        public Builder setCryptoDeterministicConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigGetArgs cryptoDeterministicConfig) {
            this.cryptoDeterministicConfig = Input.ofNullable(cryptoDeterministicConfig);
            return this;
        }

        public Builder setCryptoReplaceFfxFpeConfig(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs> cryptoReplaceFfxFpeConfig) {
            this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
            return this;
        }

        public Builder setCryptoReplaceFfxFpeConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs cryptoReplaceFfxFpeConfig) {
            this.cryptoReplaceFfxFpeConfig = Input.ofNullable(cryptoReplaceFfxFpeConfig);
            return this;
        }

        public Builder setReplaceConfig(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs> replaceConfig) {
            this.replaceConfig = replaceConfig;
            return this;
        }

        public Builder setReplaceConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigGetArgs replaceConfig) {
            this.replaceConfig = Input.ofNullable(replaceConfig);
            return this;
        }

        public Builder setReplaceWithInfoTypeConfig(@Nullable Input<Boolean> replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
            return this;
        }

        public Builder setReplaceWithInfoTypeConfig(@Nullable Boolean replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = Input.ofNullable(replaceWithInfoTypeConfig);
            return this;
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationGetArgs(characterMaskConfig, cryptoDeterministicConfig, cryptoReplaceFfxFpeConfig, replaceConfig, replaceWithInfoTypeConfig);
        }
    }
}