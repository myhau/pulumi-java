// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LatestOperationResultResponse {
    private final String errorCode;
    private final String errorMessage;
    private final String httpMethod;
    private final String operationUrl;
    private final String requestUri;
    private final String status;

    @OutputCustomType.Constructor({"errorCode","errorMessage","httpMethod","operationUrl","requestUri","status"})
    private LatestOperationResultResponse(
        String errorCode,
        String errorMessage,
        String httpMethod,
        String operationUrl,
        String requestUri,
        String status) {
        this.errorCode = Objects.requireNonNull(errorCode);
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.httpMethod = Objects.requireNonNull(httpMethod);
        this.operationUrl = Objects.requireNonNull(operationUrl);
        this.requestUri = Objects.requireNonNull(requestUri);
        this.status = Objects.requireNonNull(status);
    }

    public String getErrorCode() {
        return this.errorCode;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }
    public String getOperationUrl() {
        return this.operationUrl;
    }
    public String getRequestUri() {
        return this.requestUri;
    }
    public String getStatus() {
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

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setOperationUrl(String operationUrl) {
            this.operationUrl = Objects.requireNonNull(operationUrl);
            return this;
        }

        public Builder setRequestUri(String requestUri) {
            this.requestUri = Objects.requireNonNull(requestUri);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public LatestOperationResultResponse build() {
            return new LatestOperationResultResponse(errorCode, errorMessage, httpMethod, operationUrl, requestUri, status);
        }
    }
}