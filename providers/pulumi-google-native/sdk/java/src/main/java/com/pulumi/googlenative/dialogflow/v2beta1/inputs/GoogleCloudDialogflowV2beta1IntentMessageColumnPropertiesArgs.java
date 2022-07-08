// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Column properties for TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs();

    /**
     * Column heading.
     * 
     */
    @Import(name="header", required=true)
    private Output<String> header;

    /**
     * @return Column heading.
     * 
     */
    public Output<String> header() {
        return this.header;
    }

    /**
     * Optional. Defines text alignment for all cells in this column.
     * 
     */
    @Import(name="horizontalAlignment")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment;

    /**
     * @return Optional. Defines text alignment for all cells in this column.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment>> horizontalAlignment() {
        return Optional.ofNullable(this.horizontalAlignment);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs $) {
        this.header = $.header;
        this.horizontalAlignment = $.horizontalAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param header Column heading.
         * 
         * @return builder
         * 
         */
        public Builder header(Output<String> header) {
            $.header = header;
            return this;
        }

        /**
         * @param header Column heading.
         * 
         * @return builder
         * 
         */
        public Builder header(String header) {
            return header(Output.of(header));
        }

        /**
         * @param horizontalAlignment Optional. Defines text alignment for all cells in this column.
         * 
         * @return builder
         * 
         */
        public Builder horizontalAlignment(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment) {
            $.horizontalAlignment = horizontalAlignment;
            return this;
        }

        /**
         * @param horizontalAlignment Optional. Defines text alignment for all cells in this column.
         * 
         * @return builder
         * 
         */
        public Builder horizontalAlignment(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment horizontalAlignment) {
            return horizontalAlignment(Output.of(horizontalAlignment));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs build() {
            $.header = Objects.requireNonNull($.header, "expected parameter 'header' to be non-null");
            return $;
        }
    }

}
