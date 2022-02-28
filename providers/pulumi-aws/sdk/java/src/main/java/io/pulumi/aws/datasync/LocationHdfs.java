// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.datasync.LocationHdfsArgs;
import io.pulumi.aws.datasync.inputs.LocationHdfsState;
import io.pulumi.aws.datasync.outputs.LocationHdfsNameNode;
import io.pulumi.aws.datasync.outputs.LocationHdfsQopConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Hdfs Location within AWS DataSync.
 * 
 * > **NOTE:** The DataSync Agents must be available before creating this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_datasync_location_hdfs` can be imported by using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:datasync/locationHdfs:LocationHdfs example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/locationHdfs:LocationHdfs")
public class LocationHdfs extends io.pulumi.resources.CustomResource {
    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @OutputExport(name="agentArns", type=List.class, parameters={String.class})
    private Output<List<String>> agentArns;

    /**
     * @return A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    public Output<List<String>> getAgentArns() {
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
     * The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    @OutputExport(name="authenticationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> authenticationType;

    /**
     * @return The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    public Output</* @Nullable */ String> getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    @OutputExport(name="blockSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> blockSize;

    /**
     * @return The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    public Output</* @Nullable */ Integer> getBlockSize() {
        return this.blockSize;
    }
    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @OutputExport(name="kerberosKeytab", type=String.class, parameters={})
    private Output</* @Nullable */ String> kerberosKeytab;

    /**
     * @return The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output</* @Nullable */ String> getKerberosKeytab() {
        return this.kerberosKeytab;
    }
    /**
     * The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @OutputExport(name="kerberosKrb5Conf", type=String.class, parameters={})
    private Output</* @Nullable */ String> kerberosKrb5Conf;

    /**
     * @return The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output</* @Nullable */ String> getKerberosKrb5Conf() {
        return this.kerberosKrb5Conf;
    }
    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @OutputExport(name="kerberosPrincipal", type=String.class, parameters={})
    private Output</* @Nullable */ String> kerberosPrincipal;

    /**
     * @return The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output</* @Nullable */ String> getKerberosPrincipal() {
        return this.kerberosPrincipal;
    }
    /**
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * 
     */
    @OutputExport(name="kmsKeyProviderUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyProviderUri;

    /**
     * @return The URI of the HDFS cluster's Key Management Server (KMS).
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyProviderUri() {
        return this.kmsKeyProviderUri;
    }
    /**
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    @OutputExport(name="nameNodes", type=List.class, parameters={LocationHdfsNameNode.class})
    private Output<List<LocationHdfsNameNode>> nameNodes;

    /**
     * @return The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    public Output<List<LocationHdfsNameNode>> getNameNodes() {
        return this.nameNodes;
    }
    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If QopConfiguration isn't specified, RpcProtection and DataTransferProtection default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    @OutputExport(name="qopConfiguration", type=LocationHdfsQopConfiguration.class, parameters={})
    private Output</* @Nullable */ LocationHdfsQopConfiguration> qopConfiguration;

    /**
     * @return The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If QopConfiguration isn't specified, RpcProtection and DataTransferProtection default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    public Output</* @Nullable */ LocationHdfsQopConfiguration> getQopConfiguration() {
        return this.qopConfiguration;
    }
    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    @OutputExport(name="replicationFactor", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> replicationFactor;

    /**
     * @return The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    public Output</* @Nullable */ Integer> getReplicationFactor() {
        return this.replicationFactor;
    }
    /**
     * The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @OutputExport(name="simpleUser", type=String.class, parameters={})
    private Output</* @Nullable */ String> simpleUser;

    /**
     * @return The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output</* @Nullable */ String> getSimpleUser() {
        return this.simpleUser;
    }
    /**
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn't specified, it will default to /.
     * 
     */
    @OutputExport(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn't specified, it will default to /.
     * 
     */
    public Output</* @Nullable */ String> getSubdirectory() {
        return this.subdirectory;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
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
    public LocationHdfs(String name) {
        this(name, LocationHdfsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationHdfs(String name, LocationHdfsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationHdfs(String name, LocationHdfsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationHdfs:LocationHdfs", name, args == null ? LocationHdfsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocationHdfs(String name, Input<String> id, @Nullable LocationHdfsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationHdfs:LocationHdfs", name, state, makeResourceOptions(options, id));
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
    public static LocationHdfs get(String name, Input<String> id, @Nullable LocationHdfsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocationHdfs(name, id, state, options);
    }
}
