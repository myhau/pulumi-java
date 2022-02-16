// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.TransitGatewayRegistrationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:networkmanager:TransitGatewayRegistration")
public class TransitGatewayRegistration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    @OutputExport(name="transitGatewayArn", type=String.class, parameters={})
    private Output<String> transitGatewayArn;

    public Output<String> getTransitGatewayArn() {
        return this.transitGatewayArn;
    }

    public TransitGatewayRegistration(String name, TransitGatewayRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:TransitGatewayRegistration", name, args == null ? TransitGatewayRegistrationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitGatewayRegistration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:TransitGatewayRegistration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TransitGatewayRegistration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayRegistration(name, id, options);
    }
}