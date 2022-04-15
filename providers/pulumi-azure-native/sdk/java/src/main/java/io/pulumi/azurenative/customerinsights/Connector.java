// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.ConnectorArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The connector resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customerinsights:Connector sdkTestHub/testConnector /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/sdkTestHub/connectors/testConnector 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:Connector")
public class Connector extends io.pulumi.resources.CustomResource {
    /**
     * ID of the connector.
     * 
     */
    @Export(name="connectorId", type=Integer.class, parameters={})
    private Output<Integer> connectorId;

    /**
     * @return ID of the connector.
     * 
     */
    public Output<Integer> connectorId() {
        return this.connectorId;
    }
    /**
     * Name of the connector.
     * 
     */
    @Export(name="connectorName", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectorName;

    /**
     * @return Name of the connector.
     * 
     */
    public Output</* @Nullable */ String> connectorName() {
        return this.connectorName;
    }
    /**
     * The connector properties.
     * 
     */
    @Export(name="connectorProperties", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> connectorProperties;

    /**
     * @return The connector properties.
     * 
     */
    public Output<Map<String,Object>> connectorProperties() {
        return this.connectorProperties;
    }
    /**
     * Type of connector.
     * 
     */
    @Export(name="connectorType", type=String.class, parameters={})
    private Output<String> connectorType;

    /**
     * @return Type of connector.
     * 
     */
    public Output<String> connectorType() {
        return this.connectorType;
    }
    /**
     * The created time.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The created time.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Description of the connector.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the connector.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Display name of the connector.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of the connector.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * If this is an internal connector.
     * 
     */
    @Export(name="isInternal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isInternal;

    /**
     * @return If this is an internal connector.
     * 
     */
    public Output</* @Nullable */ Boolean> isInternal() {
        return this.isInternal;
    }
    /**
     * The last modified time.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The last modified time.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * State of connector.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of connector.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The hub name.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, ConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Connector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170101:Connector").build()),
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170426:Connector").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, options);
    }
}
