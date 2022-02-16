// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kinesisfirehose.DeliveryStreamArgs;
import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamType;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamAmazonopensearchserviceDestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamElasticsearchDestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamEncryptionConfigurationInput;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamExtendedS3DestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamHttpEndpointDestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamKinesisStreamSourceConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamRedshiftDestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamSplunkDestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:kinesisfirehose:DeliveryStream")
public class DeliveryStream extends io.pulumi.resources.CustomResource {
    @OutputExport(name="amazonopensearchserviceDestinationConfiguration", type=DeliveryStreamAmazonopensearchserviceDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamAmazonopensearchserviceDestinationConfiguration> amazonopensearchserviceDestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamAmazonopensearchserviceDestinationConfiguration> getAmazonopensearchserviceDestinationConfiguration() {
        return this.amazonopensearchserviceDestinationConfiguration;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="deliveryStreamEncryptionConfigurationInput", type=DeliveryStreamEncryptionConfigurationInput.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamEncryptionConfigurationInput> deliveryStreamEncryptionConfigurationInput;

    public Output</* @Nullable */ DeliveryStreamEncryptionConfigurationInput> getDeliveryStreamEncryptionConfigurationInput() {
        return this.deliveryStreamEncryptionConfigurationInput;
    }
    @OutputExport(name="deliveryStreamName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryStreamName;

    public Output</* @Nullable */ String> getDeliveryStreamName() {
        return this.deliveryStreamName;
    }
    @OutputExport(name="deliveryStreamType", type=DeliveryStreamType.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamType> deliveryStreamType;

    public Output</* @Nullable */ DeliveryStreamType> getDeliveryStreamType() {
        return this.deliveryStreamType;
    }
    @OutputExport(name="elasticsearchDestinationConfiguration", type=DeliveryStreamElasticsearchDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamElasticsearchDestinationConfiguration> elasticsearchDestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamElasticsearchDestinationConfiguration> getElasticsearchDestinationConfiguration() {
        return this.elasticsearchDestinationConfiguration;
    }
    @OutputExport(name="extendedS3DestinationConfiguration", type=DeliveryStreamExtendedS3DestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamExtendedS3DestinationConfiguration> extendedS3DestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamExtendedS3DestinationConfiguration> getExtendedS3DestinationConfiguration() {
        return this.extendedS3DestinationConfiguration;
    }
    @OutputExport(name="httpEndpointDestinationConfiguration", type=DeliveryStreamHttpEndpointDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamHttpEndpointDestinationConfiguration> httpEndpointDestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamHttpEndpointDestinationConfiguration> getHttpEndpointDestinationConfiguration() {
        return this.httpEndpointDestinationConfiguration;
    }
    @OutputExport(name="kinesisStreamSourceConfiguration", type=DeliveryStreamKinesisStreamSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamKinesisStreamSourceConfiguration> kinesisStreamSourceConfiguration;

    public Output</* @Nullable */ DeliveryStreamKinesisStreamSourceConfiguration> getKinesisStreamSourceConfiguration() {
        return this.kinesisStreamSourceConfiguration;
    }
    @OutputExport(name="redshiftDestinationConfiguration", type=DeliveryStreamRedshiftDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamRedshiftDestinationConfiguration> redshiftDestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamRedshiftDestinationConfiguration> getRedshiftDestinationConfiguration() {
        return this.redshiftDestinationConfiguration;
    }
    @OutputExport(name="s3DestinationConfiguration", type=DeliveryStreamS3DestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamS3DestinationConfiguration> s3DestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamS3DestinationConfiguration> getS3DestinationConfiguration() {
        return this.s3DestinationConfiguration;
    }
    @OutputExport(name="splunkDestinationConfiguration", type=DeliveryStreamSplunkDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamSplunkDestinationConfiguration> splunkDestinationConfiguration;

    public Output</* @Nullable */ DeliveryStreamSplunkDestinationConfiguration> getSplunkDestinationConfiguration() {
        return this.splunkDestinationConfiguration;
    }
    @OutputExport(name="tags", type=List.class, parameters={DeliveryStreamTag.class})
    private Output</* @Nullable */ List<DeliveryStreamTag>> tags;

    public Output</* @Nullable */ List<DeliveryStreamTag>> getTags() {
        return this.tags;
    }

    public DeliveryStream(String name, @Nullable DeliveryStreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesisfirehose:DeliveryStream", name, args == null ? DeliveryStreamArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DeliveryStream(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesisfirehose:DeliveryStream", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DeliveryStream get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeliveryStream(name, id, options);
    }
}