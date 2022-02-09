// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppHybridConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppHybridConnection")
public class WebAppHybridConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    @OutputExport(name="relayArmUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayArmUri;

    public Output</* @Nullable */ String> getRelayArmUri() {
        return this.relayArmUri;
    }
    @OutputExport(name="relayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayName;

    public Output</* @Nullable */ String> getRelayName() {
        return this.relayName;
    }
    @OutputExport(name="sendKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyName;

    public Output</* @Nullable */ String> getSendKeyName() {
        return this.sendKeyName;
    }
    @OutputExport(name="sendKeyValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyValue;

    public Output</* @Nullable */ String> getSendKeyValue() {
        return this.sendKeyValue;
    }
    @OutputExport(name="serviceBusNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusNamespace;

    public Output</* @Nullable */ String> getServiceBusNamespace() {
        return this.serviceBusNamespace;
    }
    @OutputExport(name="serviceBusSuffix", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusSuffix;

    public Output</* @Nullable */ String> getServiceBusSuffix() {
        return this.serviceBusSuffix;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebAppHybridConnection(String name, WebAppHybridConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHybridConnection", name, args == null ? WebAppHybridConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppHybridConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHybridConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppHybridConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppHybridConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppHybridConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHybridConnection(name, id, options);
    }
}