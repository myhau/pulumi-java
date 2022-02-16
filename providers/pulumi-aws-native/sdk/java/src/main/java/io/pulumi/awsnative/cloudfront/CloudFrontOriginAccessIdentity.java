// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.CloudFrontOriginAccessIdentityArgs;
import io.pulumi.awsnative.cloudfront.outputs.CloudFrontOriginAccessIdentityConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:cloudfront:CloudFrontOriginAccessIdentity")
public class CloudFrontOriginAccessIdentity extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cloudFrontOriginAccessIdentityConfig", type=CloudFrontOriginAccessIdentityConfig.class, parameters={})
    private Output<CloudFrontOriginAccessIdentityConfig> cloudFrontOriginAccessIdentityConfig;

    public Output<CloudFrontOriginAccessIdentityConfig> getCloudFrontOriginAccessIdentityConfig() {
        return this.cloudFrontOriginAccessIdentityConfig;
    }
    @OutputExport(name="s3CanonicalUserId", type=String.class, parameters={})
    private Output<String> s3CanonicalUserId;

    public Output<String> getS3CanonicalUserId() {
        return this.s3CanonicalUserId;
    }

    public CloudFrontOriginAccessIdentity(String name, CloudFrontOriginAccessIdentityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:CloudFrontOriginAccessIdentity", name, args == null ? CloudFrontOriginAccessIdentityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CloudFrontOriginAccessIdentity(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:CloudFrontOriginAccessIdentity", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CloudFrontOriginAccessIdentity get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CloudFrontOriginAccessIdentity(name, id, options);
    }
}