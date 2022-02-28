// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseArgs Empty = new IntegrationResponseArgs();

    /**
     * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
     * 
     */
    @InputImport(name="contentHandling")
      private final @Nullable Input<String> contentHandling;

    public Input<String> getContentHandling() {
        return this.contentHandling == null ? Input.empty() : this.contentHandling;
    }

    /**
     * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @InputImport(name="httpMethod", required=true)
      private final Input<String> httpMethod;

    public Input<String> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * The API resource ID
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * A map of response parameters that can be read from the backend response.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
     * 
     */
    @InputImport(name="responseParameters")
      private final @Nullable Input<Map<String,String>> responseParameters;

    public Input<Map<String,String>> getResponseParameters() {
        return this.responseParameters == null ? Input.empty() : this.responseParameters;
    }

    /**
     * A map specifying the templates used to transform the integration response body
     * 
     */
    @InputImport(name="responseTemplates")
      private final @Nullable Input<Map<String,String>> responseTemplates;

    public Input<Map<String,String>> getResponseTemplates() {
        return this.responseTemplates == null ? Input.empty() : this.responseTemplates;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @InputImport(name="restApi", required=true)
      private final Input<String> restApi;

    public Input<String> getRestApi() {
        return this.restApi;
    }

    /**
     * Specifies the regular expression pattern used to choose
     * an integration response based on the response from the backend. Omit configuring this to make the integration the default one.
     * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
     * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
     * 
     */
    @InputImport(name="selectionPattern")
      private final @Nullable Input<String> selectionPattern;

    public Input<String> getSelectionPattern() {
        return this.selectionPattern == null ? Input.empty() : this.selectionPattern;
    }

    /**
     * The HTTP status code
     * 
     */
    @InputImport(name="statusCode", required=true)
      private final Input<String> statusCode;

    public Input<String> getStatusCode() {
        return this.statusCode;
    }

    public IntegrationResponseArgs(
        @Nullable Input<String> contentHandling,
        Input<String> httpMethod,
        Input<String> resourceId,
        @Nullable Input<Map<String,String>> responseParameters,
        @Nullable Input<Map<String,String>> responseTemplates,
        Input<String> restApi,
        @Nullable Input<String> selectionPattern,
        Input<String> statusCode) {
        this.contentHandling = contentHandling;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.responseParameters = responseParameters;
        this.responseTemplates = responseTemplates;
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.selectionPattern = selectionPattern;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private IntegrationResponseArgs() {
        this.contentHandling = Input.empty();
        this.httpMethod = Input.empty();
        this.resourceId = Input.empty();
        this.responseParameters = Input.empty();
        this.responseTemplates = Input.empty();
        this.restApi = Input.empty();
        this.selectionPattern = Input.empty();
        this.statusCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentHandling;
        private Input<String> httpMethod;
        private Input<String> resourceId;
        private @Nullable Input<Map<String,String>> responseParameters;
        private @Nullable Input<Map<String,String>> responseTemplates;
        private Input<String> restApi;
        private @Nullable Input<String> selectionPattern;
        private Input<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHandling = defaults.contentHandling;
    	      this.httpMethod = defaults.httpMethod;
    	      this.resourceId = defaults.resourceId;
    	      this.responseParameters = defaults.responseParameters;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.restApi = defaults.restApi;
    	      this.selectionPattern = defaults.selectionPattern;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setContentHandling(@Nullable Input<String> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }

        public Builder setContentHandling(@Nullable String contentHandling) {
            this.contentHandling = Input.ofNullable(contentHandling);
            return this;
        }

        public Builder setHttpMethod(Input<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Input.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setResponseParameters(@Nullable Input<Map<String,String>> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }

        public Builder setResponseParameters(@Nullable Map<String,String> responseParameters) {
            this.responseParameters = Input.ofNullable(responseParameters);
            return this;
        }

        public Builder setResponseTemplates(@Nullable Input<Map<String,String>> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }

        public Builder setResponseTemplates(@Nullable Map<String,String> responseTemplates) {
            this.responseTemplates = Input.ofNullable(responseTemplates);
            return this;
        }

        public Builder setRestApi(Input<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }

        public Builder setSelectionPattern(@Nullable Input<String> selectionPattern) {
            this.selectionPattern = selectionPattern;
            return this;
        }

        public Builder setSelectionPattern(@Nullable String selectionPattern) {
            this.selectionPattern = Input.ofNullable(selectionPattern);
            return this;
        }

        public Builder setStatusCode(Input<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Input.of(Objects.requireNonNull(statusCode));
            return this;
        }
        public IntegrationResponseArgs build() {
            return new IntegrationResponseArgs(contentHandling, httpMethod, resourceId, responseParameters, responseTemplates, restApi, selectionPattern, statusCode);
        }
    }
}
