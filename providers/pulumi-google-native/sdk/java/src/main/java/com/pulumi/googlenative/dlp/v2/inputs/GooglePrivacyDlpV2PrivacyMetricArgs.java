// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2CategoricalStatsConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2KAnonymityConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2KMapEstimationConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2LDiversityConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2NumericalStatsConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Privacy metric to compute for reidentification risk analysis.
 * 
 */
public final class GooglePrivacyDlpV2PrivacyMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2PrivacyMetricArgs Empty = new GooglePrivacyDlpV2PrivacyMetricArgs();

    /**
     * Categorical stats
     * 
     */
    @Import(name="categoricalStatsConfig")
    private @Nullable Output<GooglePrivacyDlpV2CategoricalStatsConfigArgs> categoricalStatsConfig;

    /**
     * @return Categorical stats
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2CategoricalStatsConfigArgs>> categoricalStatsConfig() {
        return Optional.ofNullable(this.categoricalStatsConfig);
    }

    /**
     * delta-presence
     * 
     */
    @Import(name="deltaPresenceEstimationConfig")
    private @Nullable Output<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> deltaPresenceEstimationConfig;

    /**
     * @return delta-presence
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs>> deltaPresenceEstimationConfig() {
        return Optional.ofNullable(this.deltaPresenceEstimationConfig);
    }

    /**
     * K-anonymity
     * 
     */
    @Import(name="kAnonymityConfig")
    private @Nullable Output<GooglePrivacyDlpV2KAnonymityConfigArgs> kAnonymityConfig;

    /**
     * @return K-anonymity
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2KAnonymityConfigArgs>> kAnonymityConfig() {
        return Optional.ofNullable(this.kAnonymityConfig);
    }

    /**
     * k-map
     * 
     */
    @Import(name="kMapEstimationConfig")
    private @Nullable Output<GooglePrivacyDlpV2KMapEstimationConfigArgs> kMapEstimationConfig;

    /**
     * @return k-map
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2KMapEstimationConfigArgs>> kMapEstimationConfig() {
        return Optional.ofNullable(this.kMapEstimationConfig);
    }

    /**
     * l-diversity
     * 
     */
    @Import(name="lDiversityConfig")
    private @Nullable Output<GooglePrivacyDlpV2LDiversityConfigArgs> lDiversityConfig;

    /**
     * @return l-diversity
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2LDiversityConfigArgs>> lDiversityConfig() {
        return Optional.ofNullable(this.lDiversityConfig);
    }

    /**
     * Numerical stats
     * 
     */
    @Import(name="numericalStatsConfig")
    private @Nullable Output<GooglePrivacyDlpV2NumericalStatsConfigArgs> numericalStatsConfig;

    /**
     * @return Numerical stats
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2NumericalStatsConfigArgs>> numericalStatsConfig() {
        return Optional.ofNullable(this.numericalStatsConfig);
    }

    private GooglePrivacyDlpV2PrivacyMetricArgs() {}

    private GooglePrivacyDlpV2PrivacyMetricArgs(GooglePrivacyDlpV2PrivacyMetricArgs $) {
        this.categoricalStatsConfig = $.categoricalStatsConfig;
        this.deltaPresenceEstimationConfig = $.deltaPresenceEstimationConfig;
        this.kAnonymityConfig = $.kAnonymityConfig;
        this.kMapEstimationConfig = $.kMapEstimationConfig;
        this.lDiversityConfig = $.lDiversityConfig;
        this.numericalStatsConfig = $.numericalStatsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2PrivacyMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2PrivacyMetricArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2PrivacyMetricArgs();
        }

        public Builder(GooglePrivacyDlpV2PrivacyMetricArgs defaults) {
            $ = new GooglePrivacyDlpV2PrivacyMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categoricalStatsConfig Categorical stats
         * 
         * @return builder
         * 
         */
        public Builder categoricalStatsConfig(@Nullable Output<GooglePrivacyDlpV2CategoricalStatsConfigArgs> categoricalStatsConfig) {
            $.categoricalStatsConfig = categoricalStatsConfig;
            return this;
        }

        /**
         * @param categoricalStatsConfig Categorical stats
         * 
         * @return builder
         * 
         */
        public Builder categoricalStatsConfig(GooglePrivacyDlpV2CategoricalStatsConfigArgs categoricalStatsConfig) {
            return categoricalStatsConfig(Output.of(categoricalStatsConfig));
        }

        /**
         * @param deltaPresenceEstimationConfig delta-presence
         * 
         * @return builder
         * 
         */
        public Builder deltaPresenceEstimationConfig(@Nullable Output<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> deltaPresenceEstimationConfig) {
            $.deltaPresenceEstimationConfig = deltaPresenceEstimationConfig;
            return this;
        }

        /**
         * @param deltaPresenceEstimationConfig delta-presence
         * 
         * @return builder
         * 
         */
        public Builder deltaPresenceEstimationConfig(GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs deltaPresenceEstimationConfig) {
            return deltaPresenceEstimationConfig(Output.of(deltaPresenceEstimationConfig));
        }

        /**
         * @param kAnonymityConfig K-anonymity
         * 
         * @return builder
         * 
         */
        public Builder kAnonymityConfig(@Nullable Output<GooglePrivacyDlpV2KAnonymityConfigArgs> kAnonymityConfig) {
            $.kAnonymityConfig = kAnonymityConfig;
            return this;
        }

        /**
         * @param kAnonymityConfig K-anonymity
         * 
         * @return builder
         * 
         */
        public Builder kAnonymityConfig(GooglePrivacyDlpV2KAnonymityConfigArgs kAnonymityConfig) {
            return kAnonymityConfig(Output.of(kAnonymityConfig));
        }

        /**
         * @param kMapEstimationConfig k-map
         * 
         * @return builder
         * 
         */
        public Builder kMapEstimationConfig(@Nullable Output<GooglePrivacyDlpV2KMapEstimationConfigArgs> kMapEstimationConfig) {
            $.kMapEstimationConfig = kMapEstimationConfig;
            return this;
        }

        /**
         * @param kMapEstimationConfig k-map
         * 
         * @return builder
         * 
         */
        public Builder kMapEstimationConfig(GooglePrivacyDlpV2KMapEstimationConfigArgs kMapEstimationConfig) {
            return kMapEstimationConfig(Output.of(kMapEstimationConfig));
        }

        /**
         * @param lDiversityConfig l-diversity
         * 
         * @return builder
         * 
         */
        public Builder lDiversityConfig(@Nullable Output<GooglePrivacyDlpV2LDiversityConfigArgs> lDiversityConfig) {
            $.lDiversityConfig = lDiversityConfig;
            return this;
        }

        /**
         * @param lDiversityConfig l-diversity
         * 
         * @return builder
         * 
         */
        public Builder lDiversityConfig(GooglePrivacyDlpV2LDiversityConfigArgs lDiversityConfig) {
            return lDiversityConfig(Output.of(lDiversityConfig));
        }

        /**
         * @param numericalStatsConfig Numerical stats
         * 
         * @return builder
         * 
         */
        public Builder numericalStatsConfig(@Nullable Output<GooglePrivacyDlpV2NumericalStatsConfigArgs> numericalStatsConfig) {
            $.numericalStatsConfig = numericalStatsConfig;
            return this;
        }

        /**
         * @param numericalStatsConfig Numerical stats
         * 
         * @return builder
         * 
         */
        public Builder numericalStatsConfig(GooglePrivacyDlpV2NumericalStatsConfigArgs numericalStatsConfig) {
            return numericalStatsConfig(Output.of(numericalStatsConfig));
        }

        public GooglePrivacyDlpV2PrivacyMetricArgs build() {
            return $;
        }
    }

}
