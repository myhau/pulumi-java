// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigateway.GatewayIamMemberArgs;
import io.pulumi.gcp.apigateway.inputs.GatewayIamMemberState;
import io.pulumi.gcp.apigateway.outputs.GatewayIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:apigateway/gatewayIamMember:GatewayIamMember")
public class GatewayIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=GatewayIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ GatewayIamMemberCondition> condition;

    public Output</* @Nullable */ GatewayIamMemberCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="gateway", type=String.class, parameters={})
    private Output<String> gateway;

    public Output<String> getGateway() {
        return this.gateway;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public GatewayIamMember(String name, GatewayIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/gatewayIamMember:GatewayIamMember", name, args == null ? GatewayIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GatewayIamMember(String name, Input<String> id, @Nullable GatewayIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/gatewayIamMember:GatewayIamMember", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static GatewayIamMember get(String name, Input<String> id, @Nullable GatewayIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayIamMember(name, id, state, options);
    }
}