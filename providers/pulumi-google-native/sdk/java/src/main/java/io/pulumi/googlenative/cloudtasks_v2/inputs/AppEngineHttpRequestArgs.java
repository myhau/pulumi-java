// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2.enums.AppEngineHttpRequestHttpMethod;
import io.pulumi.googlenative.cloudtasks_v2.inputs.AppEngineRoutingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppEngineHttpRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineHttpRequestArgs Empty = new AppEngineHttpRequestArgs();

    @InputImport(name="appEngineRouting")
    private final @Nullable Input<AppEngineRoutingArgs> appEngineRouting;

    public Input<AppEngineRoutingArgs> getAppEngineRouting() {
        return this.appEngineRouting == null ? Input.empty() : this.appEngineRouting;
    }

    @InputImport(name="body")
    private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    @InputImport(name="headers")
    private final @Nullable Input<Map<String,String>> headers;

    public Input<Map<String,String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    @InputImport(name="httpMethod")
    private final @Nullable Input<AppEngineHttpRequestHttpMethod> httpMethod;

    public Input<AppEngineHttpRequestHttpMethod> getHttpMethod() {
        return this.httpMethod == null ? Input.empty() : this.httpMethod;
    }

    @InputImport(name="relativeUri")
    private final @Nullable Input<String> relativeUri;

    public Input<String> getRelativeUri() {
        return this.relativeUri == null ? Input.empty() : this.relativeUri;
    }

    public AppEngineHttpRequestArgs(
        @Nullable Input<AppEngineRoutingArgs> appEngineRouting,
        @Nullable Input<String> body,
        @Nullable Input<Map<String,String>> headers,
        @Nullable Input<AppEngineHttpRequestHttpMethod> httpMethod,
        @Nullable Input<String> relativeUri) {
        this.appEngineRouting = appEngineRouting;
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.relativeUri = relativeUri;
    }

    private AppEngineHttpRequestArgs() {
        this.appEngineRouting = Input.empty();
        this.body = Input.empty();
        this.headers = Input.empty();
        this.httpMethod = Input.empty();
        this.relativeUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineRoutingArgs> appEngineRouting;
        private @Nullable Input<String> body;
        private @Nullable Input<Map<String,String>> headers;
        private @Nullable Input<AppEngineHttpRequestHttpMethod> httpMethod;
        private @Nullable Input<String> relativeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.relativeUri = defaults.relativeUri;
        }

        public Builder setAppEngineRouting(@Nullable Input<AppEngineRoutingArgs> appEngineRouting) {
            this.appEngineRouting = appEngineRouting;
            return this;
        }

        public Builder setAppEngineRouting(@Nullable AppEngineRoutingArgs appEngineRouting) {
            this.appEngineRouting = Input.ofNullable(appEngineRouting);
            return this;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setHttpMethod(@Nullable Input<AppEngineHttpRequestHttpMethod> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setHttpMethod(@Nullable AppEngineHttpRequestHttpMethod httpMethod) {
            this.httpMethod = Input.ofNullable(httpMethod);
            return this;
        }

        public Builder setRelativeUri(@Nullable Input<String> relativeUri) {
            this.relativeUri = relativeUri;
            return this;
        }

        public Builder setRelativeUri(@Nullable String relativeUri) {
            this.relativeUri = Input.ofNullable(relativeUri);
            return this;
        }

        public AppEngineHttpRequestArgs build() {
            return new AppEngineHttpRequestArgs(appEngineRouting, body, headers, httpMethod, relativeUri);
        }
    }
}