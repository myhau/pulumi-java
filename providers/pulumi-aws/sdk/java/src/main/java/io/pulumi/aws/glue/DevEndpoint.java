// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.DevEndpointArgs;
import io.pulumi.aws.glue.inputs.DevEndpointState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Glue Development Endpoint resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * A Glue Development Endpoint can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/devEndpoint:DevEndpoint example foo
 * ```
 * 
 */
@ResourceType(type="aws:glue/devEndpoint:DevEndpoint")
public class DevEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * A map of arguments used to configure the endpoint.
     * 
     */
    @OutputExport(name="arguments", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> arguments;

    /**
     * @return A map of arguments used to configure the endpoint.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getArguments() {
        return this.arguments;
    }
    /**
     * The ARN of the endpoint.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the endpoint.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The AWS availability zone where this endpoint is located.
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The AWS availability zone where this endpoint is located.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
     * 
     */
    @OutputExport(name="extraJarsS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> extraJarsS3Path;

    /**
     * @return Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
     * 
     */
    public Output</* @Nullable */ String> getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }
    /**
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
     * 
     */
    @OutputExport(name="extraPythonLibsS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> extraPythonLibsS3Path;

    /**
     * @return Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
     * 
     */
    public Output</* @Nullable */ String> getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }
    /**
     * The reason for a current failure in this endpoint.
     * 
     */
    @OutputExport(name="failureReason", type=String.class, parameters={})
    private Output<String> failureReason;

    /**
     * @return The reason for a current failure in this endpoint.
     * 
     */
    public Output<String> getFailureReason() {
        return this.failureReason;
    }
    /**
     * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
     * 
     */
    @OutputExport(name="glueVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> glueVersion;

    /**
     * @return -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
     * 
     */
    public Output</* @Nullable */ String> getGlueVersion() {
        return this.glueVersion;
    }
    /**
     * The name of this endpoint. It must be unique in your account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this endpoint. It must be unique in your account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `worker_type`.
     * 
     */
    @OutputExport(name="numberOfNodes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfNodes;

    /**
     * @return The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `worker_type`.
     * 
     */
    public Output</* @Nullable */ Integer> getNumberOfNodes() {
        return this.numberOfNodes;
    }
    /**
     * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
     * 
     */
    @OutputExport(name="numberOfWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfWorkers;

    /**
     * @return The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
     * 
     */
    public Output</* @Nullable */ Integer> getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    /**
     * A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
     * 
     */
    @OutputExport(name="privateAddress", type=String.class, parameters={})
    private Output<String> privateAddress;

    /**
     * @return A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
     * 
     */
    public Output<String> getPrivateAddress() {
        return this.privateAddress;
    }
    /**
     * The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
     * 
     */
    @OutputExport(name="publicAddress", type=String.class, parameters={})
    private Output<String> publicAddress;

    /**
     * @return The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
     * 
     */
    public Output<String> getPublicAddress() {
        return this.publicAddress;
    }
    /**
     * The public key to be used by this endpoint for authentication.
     * 
     */
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return The public key to be used by this endpoint for authentication.
     * 
     */
    public Output</* @Nullable */ String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * A list of public keys to be used by this endpoint for authentication.
     * 
     */
    @OutputExport(name="publicKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> publicKeys;

    /**
     * @return A list of public keys to be used by this endpoint for authentication.
     * 
     */
    public Output</* @Nullable */ List<String>> getPublicKeys() {
        return this.publicKeys;
    }
    /**
     * The IAM role for this endpoint.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The IAM role for this endpoint.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * The name of the Security Configuration structure to be used with this endpoint.
     * 
     */
    @OutputExport(name="securityConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityConfiguration;

    /**
     * @return The name of the Security Configuration structure to be used with this endpoint.
     * 
     */
    public Output</* @Nullable */ String> getSecurityConfiguration() {
        return this.securityConfiguration;
    }
    /**
     * Security group IDs for the security groups to be used by this endpoint.
     * 
     */
    @OutputExport(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return Security group IDs for the security groups to be used by this endpoint.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The current status of this endpoint.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current status of this endpoint.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The subnet ID for the new endpoint to use.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The subnet ID for the new endpoint to use.
     * 
     */
    public Output</* @Nullable */ String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * he ID of the VPC used by this endpoint.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return he ID of the VPC used by this endpoint.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    @OutputExport(name="workerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> workerType;

    /**
     * @return The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    public Output</* @Nullable */ String> getWorkerType() {
        return this.workerType;
    }
    /**
     * The YARN endpoint address used by this endpoint.
     * 
     */
    @OutputExport(name="yarnEndpointAddress", type=String.class, parameters={})
    private Output<String> yarnEndpointAddress;

    /**
     * @return The YARN endpoint address used by this endpoint.
     * 
     */
    public Output<String> getYarnEndpointAddress() {
        return this.yarnEndpointAddress;
    }
    /**
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * 
     */
    @OutputExport(name="zeppelinRemoteSparkInterpreterPort", type=Integer.class, parameters={})
    private Output<Integer> zeppelinRemoteSparkInterpreterPort;

    /**
     * @return The Apache Zeppelin port for the remote Apache Spark interpreter.
     * 
     */
    public Output<Integer> getZeppelinRemoteSparkInterpreterPort() {
        return this.zeppelinRemoteSparkInterpreterPort;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevEndpoint(String name) {
        this(name, DevEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevEndpoint(String name, DevEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevEndpoint(String name, DevEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/devEndpoint:DevEndpoint", name, args == null ? DevEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DevEndpoint(String name, Input<String> id, @Nullable DevEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/devEndpoint:DevEndpoint", name, state, makeResourceOptions(options, id));
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
    public static DevEndpoint get(String name, Input<String> id, @Nullable DevEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DevEndpoint(name, id, state, options);
    }
}
