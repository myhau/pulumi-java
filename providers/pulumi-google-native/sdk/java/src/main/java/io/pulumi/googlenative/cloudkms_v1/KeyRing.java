// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudkms_v1.KeyRingArgs;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:cloudkms/v1:KeyRing")
public class KeyRing extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public KeyRing(String name, KeyRingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:KeyRing", name, args == null ? KeyRingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private KeyRing(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:KeyRing", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static KeyRing get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyRing(name, id, options);
    }
}