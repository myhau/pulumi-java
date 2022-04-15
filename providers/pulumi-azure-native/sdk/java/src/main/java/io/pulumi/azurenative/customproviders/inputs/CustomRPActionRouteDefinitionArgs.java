// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.inputs;

import io.pulumi.azurenative.customproviders.enums.ActionRouting;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The route definition for an action implemented by the custom resource provider.
 * 
 */
public final class CustomRPActionRouteDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRPActionRouteDefinitionArgs Empty = new CustomRPActionRouteDefinitionArgs();

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. 'https://testendpoint/') or can specify to route via a path (e.g. 'https://testendpoint/{requestPath}')
     * 
     */
    @Import(name="endpoint", required=true)
      private final Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}')
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The routing types that are supported for action requests.
     * 
     */
    @Import(name="routingType")
      private final @Nullable Output<Either<String,ActionRouting>> routingType;

    public Output<Either<String,ActionRouting>> routingType() {
        return this.routingType == null ? Codegen.empty() : this.routingType;
    }

    public CustomRPActionRouteDefinitionArgs(
        Output<String> endpoint,
        Output<String> name,
        @Nullable Output<Either<String,ActionRouting>> routingType) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routingType = routingType;
    }

    private CustomRPActionRouteDefinitionArgs() {
        this.endpoint = Codegen.empty();
        this.name = Codegen.empty();
        this.routingType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPActionRouteDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpoint;
        private Output<String> name;
        private @Nullable Output<Either<String,ActionRouting>> routingType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPActionRouteDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
    	      this.routingType = defaults.routingType;
        }

        public Builder endpoint(Output<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder routingType(@Nullable Output<Either<String,ActionRouting>> routingType) {
            this.routingType = routingType;
            return this;
        }
        public Builder routingType(@Nullable Either<String,ActionRouting> routingType) {
            this.routingType = Codegen.ofNullable(routingType);
            return this;
        }        public CustomRPActionRouteDefinitionArgs build() {
            return new CustomRPActionRouteDefinitionArgs(endpoint, name, routingType);
        }
    }
}
