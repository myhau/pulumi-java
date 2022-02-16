// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.SubnetRouteTableAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:SubnetRouteTableAssociation")
public class SubnetRouteTableAssociation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="routeTableId", type=String.class, parameters={})
    private Output<String> routeTableId;

    public Output<String> getRouteTableId() {
        return this.routeTableId;
    }
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    public SubnetRouteTableAssociation(String name, SubnetRouteTableAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:SubnetRouteTableAssociation", name, args == null ? SubnetRouteTableAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetRouteTableAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:SubnetRouteTableAssociation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SubnetRouteTableAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetRouteTableAssociation(name, id, options);
    }
}