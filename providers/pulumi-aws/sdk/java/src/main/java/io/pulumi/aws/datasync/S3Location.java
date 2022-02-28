// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.datasync.S3LocationArgs;
import io.pulumi.aws.datasync.inputs.S3LocationState;
import io.pulumi.aws.datasync.outputs.S3LocationS3Config;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an S3 Location within AWS DataSync.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_datasync_location_s3` can be imported by using the DataSync Task Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:datasync/s3Location:S3Location example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/s3Location:S3Location")
public class S3Location extends io.pulumi.resources.CustomResource {
    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @OutputExport(name="agentArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> agentArns;

    /**
     * @return A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    public Output</* @Nullable */ List<String>> getAgentArns() {
        return this.agentArns;
    }
    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    @OutputExport(name="s3BucketArn", type=String.class, parameters={})
    private Output<String> s3BucketArn;

    /**
     * @return Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    public Output<String> getS3BucketArn() {
        return this.s3BucketArn;
    }
    /**
     * Configuration block containing information for connecting to S3.
     * 
     */
    @OutputExport(name="s3Config", type=S3LocationS3Config.class, parameters={})
    private Output<S3LocationS3Config> s3Config;

    /**
     * @return Configuration block containing information for connecting to S3.
     * 
     */
    public Output<S3LocationS3Config> getS3Config() {
        return this.s3Config;
    }
    /**
     * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    @OutputExport(name="s3StorageClass", type=String.class, parameters={})
    private Output<String> s3StorageClass;

    /**
     * @return The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    public Output<String> getS3StorageClass() {
        return this.s3StorageClass;
    }
    /**
     * Prefix to perform actions as source or destination.
     * 
     */
    @OutputExport(name="subdirectory", type=String.class, parameters={})
    private Output<String> subdirectory;

    /**
     * @return Prefix to perform actions as source or destination.
     * 
     */
    public Output<String> getSubdirectory() {
        return this.subdirectory;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    @OutputExport(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public S3Location(String name) {
        this(name, S3LocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public S3Location(String name, S3LocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public S3Location(String name, S3LocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/s3Location:S3Location", name, args == null ? S3LocationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private S3Location(String name, Input<String> id, @Nullable S3LocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/s3Location:S3Location", name, state, makeResourceOptions(options, id));
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
    public static S3Location get(String name, Input<String> id, @Nullable S3LocationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new S3Location(name, id, state, options);
    }
}
