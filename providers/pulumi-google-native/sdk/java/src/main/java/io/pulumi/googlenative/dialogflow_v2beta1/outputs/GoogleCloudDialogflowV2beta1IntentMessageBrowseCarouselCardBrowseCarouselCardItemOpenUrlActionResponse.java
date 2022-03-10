// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse {
    /**
     * URL
     * 
     */
    private final String url;
    /**
     * Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
     * 
     */
    private final String urlTypeHint;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse(
        @OutputCustomType.Parameter("url") String url,
        @OutputCustomType.Parameter("urlTypeHint") String urlTypeHint) {
        this.url = url;
        this.urlTypeHint = urlTypeHint;
    }

    /**
     * URL
     * 
    */
    public String getUrl() {
        return this.url;
    }
    /**
     * Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser.
     * 
    */
    public String getUrlTypeHint() {
        return this.urlTypeHint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;
        private String urlTypeHint;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
    	      this.urlTypeHint = defaults.urlTypeHint;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrlTypeHint(String urlTypeHint) {
            this.urlTypeHint = Objects.requireNonNull(urlTypeHint);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionResponse(url, urlTypeHint);
        }
    }
}
