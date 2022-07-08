// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Actions on Google action to open a given url.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs();

    /**
     * URL
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
     * 
     */
    @Import(name="urlTypeHint")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> urlTypeHint;

    /**
     * @return Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint>> urlTypeHint() {
        return Optional.ofNullable(this.urlTypeHint);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs $) {
        this.url = $.url;
        this.urlTypeHint = $.urlTypeHint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param url URL
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param urlTypeHint Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
         * 
         * @return builder
         * 
         */
        public Builder urlTypeHint(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint> urlTypeHint) {
            $.urlTypeHint = urlTypeHint;
            return this;
        }

        /**
         * @param urlTypeHint Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
         * 
         * @return builder
         * 
         */
        public Builder urlTypeHint(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionUrlTypeHint urlTypeHint) {
            return urlTypeHint(Output.of(urlTypeHint));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
