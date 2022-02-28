// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.aws.apigatewayv2.outputs.GetApiCorsConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetApiResult {
    /**
     * The URI of the API, of the form `https://{api-id}.execute-api.{region}.amazonaws.com` for HTTP APIs and `wss://{api-id}.execute-api.{region}.amazonaws.com` for WebSocket APIs.
     * 
     */
    private final String apiEndpoint;
    private final String apiId;
    /**
     * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
     * Applicable for WebSocket APIs.
     * 
     */
    private final String apiKeySelectionExpression;
    /**
     * The ARN of the API.
     * 
     */
    private final String arn;
    /**
     * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html).
     * Applicable for HTTP APIs.
     * 
     */
    private final List<GetApiCorsConfiguration> corsConfigurations;
    /**
     * The description of the API.
     * 
     */
    private final String description;
    /**
     * Whether clients can invoke the API by using the default `execute-api` endpoint.
     * 
     */
    private final Boolean disableExecuteApiEndpoint;
    /**
     * The ARN prefix to be used in an `aws.lambda.Permission`'s `source_arn` attribute
     * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
     * 
     */
    private final String executionArn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the API.
     * 
     */
    private final String name;
    /**
     * The API protocol.
     * 
     */
    private final String protocolType;
    /**
     * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
     * 
     */
    private final String routeSelectionExpression;
    /**
     * A map of resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * A version identifier for the API.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"apiEndpoint","apiId","apiKeySelectionExpression","arn","corsConfigurations","description","disableExecuteApiEndpoint","executionArn","id","name","protocolType","routeSelectionExpression","tags","version"})
    private GetApiResult(
        String apiEndpoint,
        String apiId,
        String apiKeySelectionExpression,
        String arn,
        List<GetApiCorsConfiguration> corsConfigurations,
        String description,
        Boolean disableExecuteApiEndpoint,
        String executionArn,
        String id,
        String name,
        String protocolType,
        String routeSelectionExpression,
        Map<String,String> tags,
        String version) {
        this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
        this.apiId = Objects.requireNonNull(apiId);
        this.apiKeySelectionExpression = Objects.requireNonNull(apiKeySelectionExpression);
        this.arn = Objects.requireNonNull(arn);
        this.corsConfigurations = Objects.requireNonNull(corsConfigurations);
        this.description = Objects.requireNonNull(description);
        this.disableExecuteApiEndpoint = Objects.requireNonNull(disableExecuteApiEndpoint);
        this.executionArn = Objects.requireNonNull(executionArn);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.protocolType = Objects.requireNonNull(protocolType);
        this.routeSelectionExpression = Objects.requireNonNull(routeSelectionExpression);
        this.tags = Objects.requireNonNull(tags);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The URI of the API, of the form `https://{api-id}.execute-api.{region}.amazonaws.com` for HTTP APIs and `wss://{api-id}.execute-api.{region}.amazonaws.com` for WebSocket APIs.
     * 
     */
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }
    public String getApiId() {
        return this.apiId;
    }
    /**
     * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
     * Applicable for WebSocket APIs.
     * 
     */
    public String getApiKeySelectionExpression() {
        return this.apiKeySelectionExpression;
    }
    /**
     * The ARN of the API.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html).
     * Applicable for HTTP APIs.
     * 
     */
    public List<GetApiCorsConfiguration> getCorsConfigurations() {
        return this.corsConfigurations;
    }
    /**
     * The description of the API.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether clients can invoke the API by using the default `execute-api` endpoint.
     * 
     */
    public Boolean getDisableExecuteApiEndpoint() {
        return this.disableExecuteApiEndpoint;
    }
    /**
     * The ARN prefix to be used in an `aws.lambda.Permission`'s `source_arn` attribute
     * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
     * 
     */
    public String getExecutionArn() {
        return this.executionArn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the API.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The API protocol.
     * 
     */
    public String getProtocolType() {
        return this.protocolType;
    }
    /**
     * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
     * 
     */
    public String getRouteSelectionExpression() {
        return this.routeSelectionExpression;
    }
    /**
     * A map of resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * A version identifier for the API.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiEndpoint;
        private String apiId;
        private String apiKeySelectionExpression;
        private String arn;
        private List<GetApiCorsConfiguration> corsConfigurations;
        private String description;
        private Boolean disableExecuteApiEndpoint;
        private String executionArn;
        private String id;
        private String name;
        private String protocolType;
        private String routeSelectionExpression;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.apiId = defaults.apiId;
    	      this.apiKeySelectionExpression = defaults.apiKeySelectionExpression;
    	      this.arn = defaults.arn;
    	      this.corsConfigurations = defaults.corsConfigurations;
    	      this.description = defaults.description;
    	      this.disableExecuteApiEndpoint = defaults.disableExecuteApiEndpoint;
    	      this.executionArn = defaults.executionArn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protocolType = defaults.protocolType;
    	      this.routeSelectionExpression = defaults.routeSelectionExpression;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiKeySelectionExpression(String apiKeySelectionExpression) {
            this.apiKeySelectionExpression = Objects.requireNonNull(apiKeySelectionExpression);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCorsConfigurations(List<GetApiCorsConfiguration> corsConfigurations) {
            this.corsConfigurations = Objects.requireNonNull(corsConfigurations);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisableExecuteApiEndpoint(Boolean disableExecuteApiEndpoint) {
            this.disableExecuteApiEndpoint = Objects.requireNonNull(disableExecuteApiEndpoint);
            return this;
        }

        public Builder setExecutionArn(String executionArn) {
            this.executionArn = Objects.requireNonNull(executionArn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }

        public Builder setRouteSelectionExpression(String routeSelectionExpression) {
            this.routeSelectionExpression = Objects.requireNonNull(routeSelectionExpression);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetApiResult build() {
            return new GetApiResult(apiEndpoint, apiId, apiKeySelectionExpression, arn, corsConfigurations, description, disableExecuteApiEndpoint, executionArn, id, name, protocolType, routeSelectionExpression, tags, version);
        }
    }
}
