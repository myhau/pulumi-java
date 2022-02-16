// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.osconfig.PatchDeploymentArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentState;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentInstanceFilter;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentOneTimeSchedule;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfig;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentRecurringSchedule;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentRollout;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:osconfig/patchDeployment:PatchDeployment")
public class PatchDeployment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="duration", type=String.class, parameters={})
    private Output</* @Nullable */ String> duration;

    public Output</* @Nullable */ String> getDuration() {
        return this.duration;
    }
    @OutputExport(name="instanceFilter", type=PatchDeploymentInstanceFilter.class, parameters={})
    private Output<PatchDeploymentInstanceFilter> instanceFilter;

    public Output<PatchDeploymentInstanceFilter> getInstanceFilter() {
        return this.instanceFilter;
    }
    @OutputExport(name="lastExecuteTime", type=String.class, parameters={})
    private Output<String> lastExecuteTime;

    public Output<String> getLastExecuteTime() {
        return this.lastExecuteTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="oneTimeSchedule", type=PatchDeploymentOneTimeSchedule.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentOneTimeSchedule> oneTimeSchedule;

    public Output</* @Nullable */ PatchDeploymentOneTimeSchedule> getOneTimeSchedule() {
        return this.oneTimeSchedule;
    }
    @OutputExport(name="patchConfig", type=PatchDeploymentPatchConfig.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentPatchConfig> patchConfig;

    public Output</* @Nullable */ PatchDeploymentPatchConfig> getPatchConfig() {
        return this.patchConfig;
    }
    @OutputExport(name="patchDeploymentId", type=String.class, parameters={})
    private Output<String> patchDeploymentId;

    public Output<String> getPatchDeploymentId() {
        return this.patchDeploymentId;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="recurringSchedule", type=PatchDeploymentRecurringSchedule.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentRecurringSchedule> recurringSchedule;

    public Output</* @Nullable */ PatchDeploymentRecurringSchedule> getRecurringSchedule() {
        return this.recurringSchedule;
    }
    @OutputExport(name="rollout", type=PatchDeploymentRollout.class, parameters={})
    private Output</* @Nullable */ PatchDeploymentRollout> rollout;

    public Output</* @Nullable */ PatchDeploymentRollout> getRollout() {
        return this.rollout;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public PatchDeployment(String name, PatchDeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/patchDeployment:PatchDeployment", name, args == null ? PatchDeploymentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PatchDeployment(String name, Input<String> id, @Nullable PatchDeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/patchDeployment:PatchDeployment", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PatchDeployment get(String name, Input<String> id, @Nullable PatchDeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PatchDeployment(name, id, state, options);
    }
}