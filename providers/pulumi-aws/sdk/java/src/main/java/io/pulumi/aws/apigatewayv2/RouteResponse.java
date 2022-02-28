// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.RouteResponseArgs;
import io.pulumi.aws.apigatewayv2.inputs.RouteResponseState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 route response.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_route_response` can be imported by using the API identifier, route identifier and route response identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/routeResponse:RouteResponse example aabbccddee/1122334/998877
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/routeResponse:RouteResponse")
public class RouteResponse extends io.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @OutputExport(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    @OutputExport(name="modelSelectionExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> modelSelectionExpression;

    /**
     * @return The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    public Output</* @Nullable */ String> getModelSelectionExpression() {
        return this.modelSelectionExpression;
    }
    /**
     * The response models for the route response.
     * 
     */
    @OutputExport(name="responseModels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseModels;

    /**
     * @return The response models for the route response.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getResponseModels() {
        return this.responseModels;
    }
    /**
     * The identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    @OutputExport(name="routeId", type=String.class, parameters={})
    private Output<String> routeId;

    /**
     * @return The identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    public Output<String> getRouteId() {
        return this.routeId;
    }
    /**
     * The route response key.
     * 
     */
    @OutputExport(name="routeResponseKey", type=String.class, parameters={})
    private Output<String> routeResponseKey;

    /**
     * @return The route response key.
     * 
     */
    public Output<String> getRouteResponseKey() {
        return this.routeResponseKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteResponse(String name) {
        this(name, RouteResponseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteResponse(String name, RouteResponseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteResponse(String name, RouteResponseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/routeResponse:RouteResponse", name, args == null ? RouteResponseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RouteResponse(String name, Input<String> id, @Nullable RouteResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/routeResponse:RouteResponse", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RouteResponse get(String name, Input<String> id, @Nullable RouteResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteResponse(name, id, state, options);
    }
}
