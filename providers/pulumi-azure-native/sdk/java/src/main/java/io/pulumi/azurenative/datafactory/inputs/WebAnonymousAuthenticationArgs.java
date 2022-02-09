// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class WebAnonymousAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAnonymousAuthenticationArgs Empty = new WebAnonymousAuthenticationArgs();

    @InputImport(name="authenticationType", required=true)
    private final Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType;
    }

    @InputImport(name="url", required=true)
    private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    public WebAnonymousAuthenticationArgs(
        Input<String> authenticationType,
        Input<Object> url) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private WebAnonymousAuthenticationArgs() {
        this.authenticationType = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAnonymousAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authenticationType;
        private Input<Object> url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAnonymousAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.url = defaults.url;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setUrl(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public WebAnonymousAuthenticationArgs build() {
            return new WebAnonymousAuthenticationArgs(authenticationType, url);
        }
    }
}