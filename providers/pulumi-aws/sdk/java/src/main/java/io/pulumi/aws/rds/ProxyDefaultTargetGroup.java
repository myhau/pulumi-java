// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.ProxyDefaultTargetGroupArgs;
import io.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupState;
import io.pulumi.aws.rds.outputs.ProxyDefaultTargetGroupConnectionPoolConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an RDS DB proxy default target group resource.
 * 
 * The `aws.rds.ProxyDefaultTargetGroup` behaves differently from normal resources, in that the provider does not _create_ or _destroy_ this resource, since it implicitly exists as part of an RDS DB Proxy. On the provider resource creation it is automatically imported and on resource destruction, the provider performs no actions in RDS.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DB proxy default target groups can be imported using the `db_proxy_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup example example
 * ```
 * 
 */
@ResourceType(type="aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup")
public class ProxyDefaultTargetGroup extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    @OutputExport(name="connectionPoolConfig", type=ProxyDefaultTargetGroupConnectionPoolConfig.class, parameters={})
    private Output<ProxyDefaultTargetGroupConnectionPoolConfig> connectionPoolConfig;

    /**
     * @return The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    public Output<ProxyDefaultTargetGroupConnectionPoolConfig> getConnectionPoolConfig() {
        return this.connectionPoolConfig;
    }
    /**
     * Name of the RDS DB Proxy.
     * 
     */
    @OutputExport(name="dbProxyName", type=String.class, parameters={})
    private Output<String> dbProxyName;

    /**
     * @return Name of the RDS DB Proxy.
     * 
     */
    public Output<String> getDbProxyName() {
        return this.dbProxyName;
    }
    /**
     * The name of the default target group.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the default target group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProxyDefaultTargetGroup(String name) {
        this(name, ProxyDefaultTargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProxyDefaultTargetGroup(String name, ProxyDefaultTargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProxyDefaultTargetGroup(String name, ProxyDefaultTargetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup", name, args == null ? ProxyDefaultTargetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProxyDefaultTargetGroup(String name, Input<String> id, @Nullable ProxyDefaultTargetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup", name, state, makeResourceOptions(options, id));
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
    public static ProxyDefaultTargetGroup get(String name, Input<String> id, @Nullable ProxyDefaultTargetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProxyDefaultTargetGroup(name, id, state, options);
    }
}
