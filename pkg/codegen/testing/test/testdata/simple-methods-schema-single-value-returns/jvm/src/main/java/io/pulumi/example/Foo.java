// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.example.FooArgs;
import io.pulumi.example.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="example::Foo")
public class Foo extends io.pulumi.resources.ComponentResource {
    public Foo(String name, @Nullable FooArgs args, @Nullable io.pulumi.resources.ComponentResourceOptions options) {
        super("example::Foo", name, args == null ? FooArgs.Empty : args, makeResourceOptions(options, Input.empty()), true);
    }

    private static io.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.ComponentResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.ComponentResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}