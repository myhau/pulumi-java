// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.ResourceQuotaArgs;
import io.pulumi.kubernetes.core_v1.outputs.ResourceQuotaSpec;
import io.pulumi.kubernetes.core_v1.outputs.ResourceQuotaStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:core/v1:ResourceQuota")
public class ResourceQuota extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="spec", type=ResourceQuotaSpec.class, parameters={})
    private Output</* @Nullable */ ResourceQuotaSpec> spec;

    public Output</* @Nullable */ ResourceQuotaSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=ResourceQuotaStatus.class, parameters={})
    private Output</* @Nullable */ ResourceQuotaStatus> status;

    public Output</* @Nullable */ ResourceQuotaStatus> getStatus() {
        return this.status;
    }

    public ResourceQuota(String name, @Nullable ResourceQuotaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ResourceQuota", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ResourceQuota(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ResourceQuota", name, null, makeResourceOptions(options, id));
    }

    private static ResourceQuotaArgs makeArgs(@Nullable ResourceQuotaArgs args) {
        var builder = args == null ? ResourceQuotaArgs.builder() : ResourceQuotaArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("ResourceQuota")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ResourceQuota get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceQuota(name, id, options);
    }
}