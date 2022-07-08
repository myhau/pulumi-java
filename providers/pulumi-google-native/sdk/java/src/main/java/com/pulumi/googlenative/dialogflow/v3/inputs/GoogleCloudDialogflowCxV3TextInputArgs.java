// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the natural language text to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3TextInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TextInputArgs Empty = new GoogleCloudDialogflowCxV3TextInputArgs();

    /**
     * The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
     * 
     */
    @Import(name="text", required=true)
    private Output<String> text;

    /**
     * @return The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    private GoogleCloudDialogflowCxV3TextInputArgs() {}

    private GoogleCloudDialogflowCxV3TextInputArgs(GoogleCloudDialogflowCxV3TextInputArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3TextInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3TextInputArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3TextInputArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3TextInputArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3TextInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder text(Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowCxV3TextInputArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
