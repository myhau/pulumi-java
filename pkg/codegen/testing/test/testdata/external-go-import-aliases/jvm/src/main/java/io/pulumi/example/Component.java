// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.aws.ec2.Instance;
import io.pulumi.aws.ec2.outputs.InstanceLaunchTemplate;
import io.pulumi.aws.s3.Bucket;
import io.pulumi.aws.s3.outputs.BucketWebsite;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.example.ComponentArgs;
import io.pulumi.example.Utilities;
import io.pulumi.googlenative.dns_v1.Policy;
import io.pulumi.googlenative.dns_v1.outputs.DnsKeySpecResponse;
import io.pulumi.googlenative.iam_v1.Key;
import io.pulumi.googlenative.iam_v1.outputs.AuditConfigResponse;
import javax.annotation.Nullable;

@ResourceType(type="example::Component")
public class Component extends io.pulumi.resources.CustomResource {
    @OutputExport(name="resourceLocalAlias", type=Instance.class, parameters={})
    private Output<Instance> resourceLocalAlias;

    public Output<Instance> getResourceLocalAlias() {
        return this.resourceLocalAlias;
    }
    @OutputExport(name="resourceLocalInsteadOfRemoteAlias", type=Key.class, parameters={})
    private Output<Key> resourceLocalInsteadOfRemoteAlias;

    public Output<Key> getResourceLocalInsteadOfRemoteAlias() {
        return this.resourceLocalInsteadOfRemoteAlias;
    }
    @OutputExport(name="resourceNoAlias", type=Bucket.class, parameters={})
    private Output<Bucket> resourceNoAlias;

    public Output<Bucket> getResourceNoAlias() {
        return this.resourceNoAlias;
    }
    @OutputExport(name="resourceRemoteAlias", type=Policy.class, parameters={})
    private Output<Policy> resourceRemoteAlias;

    public Output<Policy> getResourceRemoteAlias() {
        return this.resourceRemoteAlias;
    }
    @OutputExport(name="typeLocalAlias", type=InstanceLaunchTemplate.class, parameters={})
    private Output<InstanceLaunchTemplate> typeLocalAlias;

    public Output<InstanceLaunchTemplate> getTypeLocalAlias() {
        return this.typeLocalAlias;
    }
    @OutputExport(name="typeLocalInsteadOfRemoteAlias", type=AuditConfigResponse.class, parameters={})
    private Output<AuditConfigResponse> typeLocalInsteadOfRemoteAlias;

    public Output<AuditConfigResponse> getTypeLocalInsteadOfRemoteAlias() {
        return this.typeLocalInsteadOfRemoteAlias;
    }
    @OutputExport(name="typeNoAlias", type=BucketWebsite.class, parameters={})
    private Output<BucketWebsite> typeNoAlias;

    public Output<BucketWebsite> getTypeNoAlias() {
        return this.typeNoAlias;
    }
    @OutputExport(name="typeRemoteAlias", type=DnsKeySpecResponse.class, parameters={})
    private Output<DnsKeySpecResponse> typeRemoteAlias;

    public Output<DnsKeySpecResponse> getTypeRemoteAlias() {
        return this.typeRemoteAlias;
    }

    public Component(String name, ComponentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Component(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Component", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Component get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Component(name, id, options);
    }
}