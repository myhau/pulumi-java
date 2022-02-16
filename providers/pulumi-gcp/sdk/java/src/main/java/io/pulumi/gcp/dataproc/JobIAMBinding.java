// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.JobIAMBindingArgs;
import io.pulumi.gcp.dataproc.inputs.JobIAMBindingState;
import io.pulumi.gcp.dataproc.outputs.JobIAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:dataproc/jobIAMBinding:JobIAMBinding")
public class JobIAMBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=JobIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ JobIAMBindingCondition> condition;

    public Output</* @Nullable */ JobIAMBindingCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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

    public JobIAMBinding(String name, JobIAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMBinding:JobIAMBinding", name, args == null ? JobIAMBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobIAMBinding(String name, Input<String> id, @Nullable JobIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMBinding:JobIAMBinding", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static JobIAMBinding get(String name, Input<String> id, @Nullable JobIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobIAMBinding(name, id, state, options);
    }
}