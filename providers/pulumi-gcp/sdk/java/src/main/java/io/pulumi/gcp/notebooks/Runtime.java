// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.RuntimeArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeState;
import io.pulumi.gcp.notebooks.outputs.RuntimeAccessConfig;
import io.pulumi.gcp.notebooks.outputs.RuntimeMetric;
import io.pulumi.gcp.notebooks.outputs.RuntimeSoftwareConfig;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachine;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:notebooks/runtime:Runtime")
public class Runtime extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessConfig", type=RuntimeAccessConfig.class, parameters={})
    private Output</* @Nullable */ RuntimeAccessConfig> accessConfig;

    public Output</* @Nullable */ RuntimeAccessConfig> getAccessConfig() {
        return this.accessConfig;
    }
    @OutputExport(name="healthState", type=String.class, parameters={})
    private Output<String> healthState;

    public Output<String> getHealthState() {
        return this.healthState;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="metrics", type=List.class, parameters={RuntimeMetric.class})
    private Output<List<RuntimeMetric>> metrics;

    public Output<List<RuntimeMetric>> getMetrics() {
        return this.metrics;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="softwareConfig", type=RuntimeSoftwareConfig.class, parameters={})
    private Output<RuntimeSoftwareConfig> softwareConfig;

    public Output<RuntimeSoftwareConfig> getSoftwareConfig() {
        return this.softwareConfig;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="virtualMachine", type=RuntimeVirtualMachine.class, parameters={})
    private Output</* @Nullable */ RuntimeVirtualMachine> virtualMachine;

    public Output</* @Nullable */ RuntimeVirtualMachine> getVirtualMachine() {
        return this.virtualMachine;
    }

    public Runtime(String name, RuntimeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/runtime:Runtime", name, args == null ? RuntimeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Runtime(String name, Input<String> id, @Nullable RuntimeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/runtime:Runtime", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Runtime get(String name, Input<String> id, @Nullable RuntimeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Runtime(name, id, state, options);
    }
}