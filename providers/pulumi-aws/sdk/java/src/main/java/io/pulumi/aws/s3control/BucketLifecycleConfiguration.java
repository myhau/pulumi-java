// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3control.BucketLifecycleConfigurationArgs;
import io.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationState;
import io.pulumi.aws.s3control.outputs.BucketLifecycleConfigurationRule;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Control Bucket Lifecycle Configuration.
 * 
 * > **NOTE:** Each S3 Control Bucket can only have one Lifecycle Configuration. Using multiple of this resource against the same S3 Control Bucket will result in perpetual differences each provider run.
 * 
 * > This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Bucket Lifecycle Configurations in an AWS Partition, see the `aws.s3.Bucket` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 Control Bucket Lifecycle Configurations can be imported using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3control/bucketLifecycleConfiguration:BucketLifecycleConfiguration example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-12345678/bucket/example
 * ```
 * 
 */
@ResourceType(type="aws:s3control/bucketLifecycleConfiguration:BucketLifecycleConfiguration")
public class BucketLifecycleConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the bucket.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Amazon Resource Name (ARN) of the bucket.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Configuration block(s) containing lifecycle rules for the bucket.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={BucketLifecycleConfigurationRule.class})
    private Output<List<BucketLifecycleConfigurationRule>> rules;

    /**
     * @return Configuration block(s) containing lifecycle rules for the bucket.
     * 
     */
    public Output<List<BucketLifecycleConfigurationRule>> getRules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketLifecycleConfiguration(String name) {
        this(name, BucketLifecycleConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketLifecycleConfiguration(String name, BucketLifecycleConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketLifecycleConfiguration(String name, BucketLifecycleConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/bucketLifecycleConfiguration:BucketLifecycleConfiguration", name, args == null ? BucketLifecycleConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BucketLifecycleConfiguration(String name, Input<String> id, @Nullable BucketLifecycleConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/bucketLifecycleConfiguration:BucketLifecycleConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketLifecycleConfiguration get(String name, Input<String> id, @Nullable BucketLifecycleConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketLifecycleConfiguration(name, id, state, options);
    }
}
