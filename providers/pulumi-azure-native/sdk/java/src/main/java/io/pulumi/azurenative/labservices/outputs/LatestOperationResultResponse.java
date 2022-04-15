// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LatestOperationResultResponse {
    /**
     * Error code on failure.
     * 
     */
    private final String errorCode;
    /**
     * The error message.
     * 
     */
    private final String errorMessage;
    /**
     * The HttpMethod - PUT/POST/DELETE for the operation.
     * 
     */
    private final String httpMethod;
    /**
     * The URL to use to check long-running operation status
     * 
     */
    private final String operationUrl;
    /**
     * Request URI of the operation.
     * 
     */
    private final String requestUri;
    /**
     * The current status of the operation.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private LatestOperationResultResponse(
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("httpMethod") String httpMethod,
        @CustomType.Parameter("operationUrl") String operationUrl,
        @CustomType.Parameter("requestUri") String requestUri,
        @CustomType.Parameter("status") String status) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpMethod = httpMethod;
        this.operationUrl = operationUrl;
        this.requestUri = requestUri;
        this.status = status;
    }

    /**
     * Error code on failure.
     * 
    */
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * The error message.
     * 
    */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * The HttpMethod - PUT/POST/DELETE for the operation.
     * 
    */
    public String httpMethod() {
        return this.httpMethod;
    }
    /**
     * The URL to use to check long-running operation status
     * 
    */
    public String operationUrl() {
        return this.operationUrl;
    }
    /**
     * Request URI of the operation.
     * 
    */
    public String requestUri() {
        return this.requestUri;
    }
    /**
     * The current status of the operation.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatestOperationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String errorMessage;
        private String httpMethod;
        private String operationUrl;
        private String requestUri;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(LatestOperationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.httpMethod = defaults.httpMethod;
    	      this.operationUrl = defaults.operationUrl;
    	      this.requestUri = defaults.requestUri;
    	      this.status = defaults.status;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder operationUrl(String operationUrl) {
            this.operationUrl = Objects.requireNonNull(operationUrl);
            return this;
        }
        public Builder requestUri(String requestUri) {
            this.requestUri = Objects.requireNonNull(requestUri);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public LatestOperationResultResponse build() {
            return new LatestOperationResultResponse(errorCode, errorMessage, httpMethod, operationUrl, requestUri, status);
        }
    }
}
