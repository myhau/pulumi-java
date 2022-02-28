// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.secretsmanager.SecretRotationArgs;
import io.pulumi.aws.secretsmanager.inputs.SecretRotationState;
import io.pulumi.aws.secretsmanager.outputs.SecretRotationRotationRules;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Secrets Manager secret rotation. To manage a secret, see the `aws.secretsmanager.Secret` resource. To manage a secret value, see the `aws.secretsmanager.SecretVersion` resource.
 * 
 * ## Example Usage
 * ### Rotation Configuration
 * 
 * To enable automatic secret rotation, the Secrets Manager service requires usage of a Lambda function. The [Rotate Secrets section in the Secrets Manager User Guide](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html) provides additional information about deploying a prebuilt Lambda functions for supported credential rotation (e.g., RDS) or deploying a custom Lambda function.
 * 
 * > **NOTE:** Configuring rotation causes the secret to rotate once as soon as you enable rotation. Before you do this, you must ensure that all of your applications that use the credentials stored in the secret are updated to retrieve the secret from AWS Secrets Manager. The old credentials might no longer be usable after the initial rotation and any applications that you fail to update will break as soon as the old credentials are no longer valid.
 * 
 * > **NOTE:** If you cancel a rotation that is in progress (by removing the `rotation` configuration), it can leave the VersionStage labels in an unexpected state. Depending on what step of the rotation was in progress, you might need to remove the staging label AWSPENDING from the partially created version, specified by the SecretVersionId response value. You should also evaluate the partially rotated new version to see if it should be deleted, which you can do by removing all staging labels from the new version's VersionStage field.
 * 
 * ## Import
 * 
 * `aws_secretsmanager_secret_rotation` can be imported by using the secret Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:secretsmanager/secretRotation:SecretRotation example arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456
 * ```
 * 
 */
@ResourceType(type="aws:secretsmanager/secretRotation:SecretRotation")
public class SecretRotation extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether automatic rotation is enabled for this secret.
     * 
     */
    @OutputExport(name="rotationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> rotationEnabled;

    /**
     * @return Specifies whether automatic rotation is enabled for this secret.
     * 
     */
    public Output<Boolean> getRotationEnabled() {
        return this.rotationEnabled;
    }
    /**
     * Specifies the ARN of the Lambda function that can rotate the secret.
     * 
     */
    @OutputExport(name="rotationLambdaArn", type=String.class, parameters={})
    private Output<String> rotationLambdaArn;

    /**
     * @return Specifies the ARN of the Lambda function that can rotate the secret.
     * 
     */
    public Output<String> getRotationLambdaArn() {
        return this.rotationLambdaArn;
    }
    /**
     * A structure that defines the rotation configuration for this secret. Defined below.
     * 
     */
    @OutputExport(name="rotationRules", type=SecretRotationRotationRules.class, parameters={})
    private Output<SecretRotationRotationRules> rotationRules;

    /**
     * @return A structure that defines the rotation configuration for this secret. Defined below.
     * 
     */
    public Output<SecretRotationRotationRules> getRotationRules() {
        return this.rotationRules;
    }
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @OutputExport(name="secretId", type=String.class, parameters={})
    private Output<String> secretId;

    /**
     * @return Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    public Output<String> getSecretId() {
        return this.secretId;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretRotation(String name) {
        this(name, SecretRotationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretRotation(String name, SecretRotationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretRotation(String name, SecretRotationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secretRotation:SecretRotation", name, args == null ? SecretRotationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecretRotation(String name, Input<String> id, @Nullable SecretRotationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secretRotation:SecretRotation", name, state, makeResourceOptions(options, id));
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
    public static SecretRotation get(String name, Input<String> id, @Nullable SecretRotationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretRotation(name, id, state, options);
    }
}
