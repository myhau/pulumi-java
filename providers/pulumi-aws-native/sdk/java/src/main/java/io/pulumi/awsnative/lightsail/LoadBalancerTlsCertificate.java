// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.LoadBalancerTlsCertificateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:lightsail:LoadBalancerTlsCertificate")
public class LoadBalancerTlsCertificate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="certificateAlternativeNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> certificateAlternativeNames;

    public Output</* @Nullable */ List<String>> getCertificateAlternativeNames() {
        return this.certificateAlternativeNames;
    }
    @OutputExport(name="certificateDomainName", type=String.class, parameters={})
    private Output<String> certificateDomainName;

    public Output<String> getCertificateDomainName() {
        return this.certificateDomainName;
    }
    @OutputExport(name="certificateName", type=String.class, parameters={})
    private Output<String> certificateName;

    public Output<String> getCertificateName() {
        return this.certificateName;
    }
    @OutputExport(name="isAttached", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isAttached;

    public Output</* @Nullable */ Boolean> getIsAttached() {
        return this.isAttached;
    }
    @OutputExport(name="loadBalancerName", type=String.class, parameters={})
    private Output<String> loadBalancerName;

    public Output<String> getLoadBalancerName() {
        return this.loadBalancerName;
    }
    @OutputExport(name="loadBalancerTlsCertificateArn", type=String.class, parameters={})
    private Output<String> loadBalancerTlsCertificateArn;

    public Output<String> getLoadBalancerTlsCertificateArn() {
        return this.loadBalancerTlsCertificateArn;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    public LoadBalancerTlsCertificate(String name, LoadBalancerTlsCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:LoadBalancerTlsCertificate", name, args == null ? LoadBalancerTlsCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LoadBalancerTlsCertificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:LoadBalancerTlsCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static LoadBalancerTlsCertificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerTlsCertificate(name, id, options);
    }
}