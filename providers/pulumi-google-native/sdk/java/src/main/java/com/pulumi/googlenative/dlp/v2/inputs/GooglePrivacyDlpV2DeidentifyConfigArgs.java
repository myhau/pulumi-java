// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2InfoTypeTransformationsArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2RecordTransformationsArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2TransformationErrorHandlingArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration that controls how the data will change.
 * 
 */
public final class GooglePrivacyDlpV2DeidentifyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2DeidentifyConfigArgs Empty = new GooglePrivacyDlpV2DeidentifyConfigArgs();

    /**
     * Treat the dataset as free-form text and apply the same free text transformation everywhere.
     * 
     */
    @Import(name="infoTypeTransformations")
    private @Nullable Output<GooglePrivacyDlpV2InfoTypeTransformationsArgs> infoTypeTransformations;

    /**
     * @return Treat the dataset as free-form text and apply the same free text transformation everywhere.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2InfoTypeTransformationsArgs>> infoTypeTransformations() {
        return Optional.ofNullable(this.infoTypeTransformations);
    }

    /**
     * Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     * 
     */
    @Import(name="recordTransformations")
    private @Nullable Output<GooglePrivacyDlpV2RecordTransformationsArgs> recordTransformations;

    /**
     * @return Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2RecordTransformationsArgs>> recordTransformations() {
        return Optional.ofNullable(this.recordTransformations);
    }

    /**
     * Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
     * 
     */
    @Import(name="transformationErrorHandling")
    private @Nullable Output<GooglePrivacyDlpV2TransformationErrorHandlingArgs> transformationErrorHandling;

    /**
     * @return Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2TransformationErrorHandlingArgs>> transformationErrorHandling() {
        return Optional.ofNullable(this.transformationErrorHandling);
    }

    private GooglePrivacyDlpV2DeidentifyConfigArgs() {}

    private GooglePrivacyDlpV2DeidentifyConfigArgs(GooglePrivacyDlpV2DeidentifyConfigArgs $) {
        this.infoTypeTransformations = $.infoTypeTransformations;
        this.recordTransformations = $.recordTransformations;
        this.transformationErrorHandling = $.transformationErrorHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2DeidentifyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2DeidentifyConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2DeidentifyConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2DeidentifyConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2DeidentifyConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param infoTypeTransformations Treat the dataset as free-form text and apply the same free text transformation everywhere.
         * 
         * @return builder
         * 
         */
        public Builder infoTypeTransformations(@Nullable Output<GooglePrivacyDlpV2InfoTypeTransformationsArgs> infoTypeTransformations) {
            $.infoTypeTransformations = infoTypeTransformations;
            return this;
        }

        /**
         * @param infoTypeTransformations Treat the dataset as free-form text and apply the same free text transformation everywhere.
         * 
         * @return builder
         * 
         */
        public Builder infoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformationsArgs infoTypeTransformations) {
            return infoTypeTransformations(Output.of(infoTypeTransformations));
        }

        /**
         * @param recordTransformations Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
         * 
         * @return builder
         * 
         */
        public Builder recordTransformations(@Nullable Output<GooglePrivacyDlpV2RecordTransformationsArgs> recordTransformations) {
            $.recordTransformations = recordTransformations;
            return this;
        }

        /**
         * @param recordTransformations Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
         * 
         * @return builder
         * 
         */
        public Builder recordTransformations(GooglePrivacyDlpV2RecordTransformationsArgs recordTransformations) {
            return recordTransformations(Output.of(recordTransformations));
        }

        /**
         * @param transformationErrorHandling Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
         * 
         * @return builder
         * 
         */
        public Builder transformationErrorHandling(@Nullable Output<GooglePrivacyDlpV2TransformationErrorHandlingArgs> transformationErrorHandling) {
            $.transformationErrorHandling = transformationErrorHandling;
            return this;
        }

        /**
         * @param transformationErrorHandling Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
         * 
         * @return builder
         * 
         */
        public Builder transformationErrorHandling(GooglePrivacyDlpV2TransformationErrorHandlingArgs transformationErrorHandling) {
            return transformationErrorHandling(Output.of(transformationErrorHandling));
        }

        public GooglePrivacyDlpV2DeidentifyConfigArgs build() {
            return $;
        }
    }

}
