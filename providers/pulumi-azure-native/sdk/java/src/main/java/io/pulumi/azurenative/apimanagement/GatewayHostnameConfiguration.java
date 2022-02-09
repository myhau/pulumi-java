// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.GatewayHostnameConfigurationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:apimanagement:GatewayHostnameConfiguration")
public class GatewayHostnameConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="certificateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateId;

    public Output</* @Nullable */ String> getCertificateId() {
        return this.certificateId;
    }
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
    }
    @OutputExport(name="http2Enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> http2Enabled;

    public Output</* @Nullable */ Boolean> getHttp2Enabled() {
        return this.http2Enabled;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="negotiateClientCertificate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> negotiateClientCertificate;

    public Output</* @Nullable */ Boolean> getNegotiateClientCertificate() {
        return this.negotiateClientCertificate;
    }
    @OutputExport(name="tls10Enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tls10Enabled;

    public Output</* @Nullable */ Boolean> getTls10Enabled() {
        return this.tls10Enabled;
    }
    @OutputExport(name="tls11Enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tls11Enabled;

    public Output</* @Nullable */ Boolean> getTls11Enabled() {
        return this.tls11Enabled;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public GatewayHostnameConfiguration(String name, GatewayHostnameConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayHostnameConfiguration", name, args == null ? GatewayHostnameConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GatewayHostnameConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayHostnameConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:GatewayHostnameConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static GatewayHostnameConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayHostnameConfiguration(name, id, options);
    }
}