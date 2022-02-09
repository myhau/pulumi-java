// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iap_v1.IdentityAwareProxyClientArgs;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:iap/v1:IdentityAwareProxyClient")
public class IdentityAwareProxyClient extends io.pulumi.resources.CustomResource {
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }

    public IdentityAwareProxyClient(String name, IdentityAwareProxyClientArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iap/v1:IdentityAwareProxyClient", name, args == null ? IdentityAwareProxyClientArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityAwareProxyClient(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iap/v1:IdentityAwareProxyClient", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IdentityAwareProxyClient get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityAwareProxyClient(name, id, options);
    }
}