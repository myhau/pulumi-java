// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.msk.ClusterArgs;
import io.pulumi.aws.msk.inputs.ClusterState;
import io.pulumi.aws.msk.outputs.ClusterBrokerNodeGroupInfo;
import io.pulumi.aws.msk.outputs.ClusterClientAuthentication;
import io.pulumi.aws.msk.outputs.ClusterConfigurationInfo;
import io.pulumi.aws.msk.outputs.ClusterEncryptionInfo;
import io.pulumi.aws.msk.outputs.ClusterLoggingInfo;
import io.pulumi.aws.msk.outputs.ClusterOpenMonitoring;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages AWS Managed Streaming for Kafka cluster
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MSK clusters can be imported using the cluster `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:msk/cluster:Cluster example arn:aws:kafka:us-west-2:123456789012:cluster/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     * 
     */
    @OutputExport(name="bootstrapBrokers", type=String.class, parameters={})
    private Output<String> bootstrapBrokers;

    /**
     * @return Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     * 
     */
    public Output<String> getBootstrapBrokers() {
        return this.bootstrapBrokers;
    }
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @OutputExport(name="bootstrapBrokersSaslIam", type=String.class, parameters={})
    private Output<String> bootstrapBrokersSaslIam;

    /**
     * @return One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    public Output<String> getBootstrapBrokersSaslIam() {
        return this.bootstrapBrokersSaslIam;
    }
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @OutputExport(name="bootstrapBrokersSaslScram", type=String.class, parameters={})
    private Output<String> bootstrapBrokersSaslScram;

    /**
     * @return One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    public Output<String> getBootstrapBrokersSaslScram() {
        return this.bootstrapBrokersSaslScram;
    }
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @OutputExport(name="bootstrapBrokersTls", type=String.class, parameters={})
    private Output<String> bootstrapBrokersTls;

    /**
     * @return One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    public Output<String> getBootstrapBrokersTls() {
        return this.bootstrapBrokersTls;
    }
    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     * 
     */
    @OutputExport(name="brokerNodeGroupInfo", type=ClusterBrokerNodeGroupInfo.class, parameters={})
    private Output<ClusterBrokerNodeGroupInfo> brokerNodeGroupInfo;

    /**
     * @return Configuration block for the broker nodes of the Kafka cluster.
     * 
     */
    public Output<ClusterBrokerNodeGroupInfo> getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo;
    }
    /**
     * Configuration block for specifying a client authentication. See below.
     * 
     */
    @OutputExport(name="clientAuthentication", type=ClusterClientAuthentication.class, parameters={})
    private Output</* @Nullable */ ClusterClientAuthentication> clientAuthentication;

    /**
     * @return Configuration block for specifying a client authentication. See below.
     * 
     */
    public Output</* @Nullable */ ClusterClientAuthentication> getClientAuthentication() {
        return this.clientAuthentication;
    }
    /**
     * Name of the MSK cluster.
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of the MSK cluster.
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     * 
     */
    @OutputExport(name="configurationInfo", type=ClusterConfigurationInfo.class, parameters={})
    private Output</* @Nullable */ ClusterConfigurationInfo> configurationInfo;

    /**
     * @return Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     * 
     */
    public Output</* @Nullable */ ClusterConfigurationInfo> getConfigurationInfo() {
        return this.configurationInfo;
    }
    /**
     * Current version of the MSK Cluster used for updates, e.g., `K13V1IB3VIYZZH`
     * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
     * 
     */
    @OutputExport(name="currentVersion", type=String.class, parameters={})
    private Output<String> currentVersion;

    /**
     * @return Current version of the MSK Cluster used for updates, e.g., `K13V1IB3VIYZZH`
     * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
     * 
     */
    public Output<String> getCurrentVersion() {
        return this.currentVersion;
    }
    /**
     * Configuration block for specifying encryption. See below.
     * 
     */
    @OutputExport(name="encryptionInfo", type=ClusterEncryptionInfo.class, parameters={})
    private Output</* @Nullable */ ClusterEncryptionInfo> encryptionInfo;

    /**
     * @return Configuration block for specifying encryption. See below.
     * 
     */
    public Output</* @Nullable */ ClusterEncryptionInfo> getEncryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     * 
     */
    @OutputExport(name="enhancedMonitoring", type=String.class, parameters={})
    private Output</* @Nullable */ String> enhancedMonitoring;

    /**
     * @return Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     * 
     */
    public Output</* @Nullable */ String> getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }
    /**
     * Specify the desired Kafka software version.
     * 
     */
    @OutputExport(name="kafkaVersion", type=String.class, parameters={})
    private Output<String> kafkaVersion;

    /**
     * @return Specify the desired Kafka software version.
     * 
     */
    public Output<String> getKafkaVersion() {
        return this.kafkaVersion;
    }
    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     * 
     */
    @OutputExport(name="loggingInfo", type=ClusterLoggingInfo.class, parameters={})
    private Output</* @Nullable */ ClusterLoggingInfo> loggingInfo;

    /**
     * @return Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     * 
     */
    public Output</* @Nullable */ ClusterLoggingInfo> getLoggingInfo() {
        return this.loggingInfo;
    }
    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     * 
     */
    @OutputExport(name="numberOfBrokerNodes", type=Integer.class, parameters={})
    private Output<Integer> numberOfBrokerNodes;

    /**
     * @return The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     * 
     */
    public Output<Integer> getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }
    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     * 
     */
    @OutputExport(name="openMonitoring", type=ClusterOpenMonitoring.class, parameters={})
    private Output</* @Nullable */ ClusterOpenMonitoring> openMonitoring;

    /**
     * @return Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     * 
     */
    public Output</* @Nullable */ ClusterOpenMonitoring> getOpenMonitoring() {
        return this.openMonitoring;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    @OutputExport(name="zookeeperConnectString", type=String.class, parameters={})
    private Output<String> zookeeperConnectString;

    /**
     * @return A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    public Output<String> getZookeeperConnectString() {
        return this.zookeeperConnectString;
    }
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster via TLS. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    @OutputExport(name="zookeeperConnectStringTls", type=String.class, parameters={})
    private Output<String> zookeeperConnectStringTls;

    /**
     * @return A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster via TLS. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    public Output<String> getZookeeperConnectStringTls() {
        return this.zookeeperConnectStringTls;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Input<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
