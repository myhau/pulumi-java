// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.athena.DatabaseArgs;
import io.pulumi.aws.athena.inputs.DatabaseState;
import io.pulumi.aws.athena.outputs.DatabaseEncryptionConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Athena database.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:athena/database:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * Name of s3 bucket to save the results of the query execution.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Name of s3 bucket to save the results of the query execution.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryption_configuration` block is documented below.
     * 
     */
    @OutputExport(name="encryptionConfiguration", type=DatabaseEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ DatabaseEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryption_configuration` block is documented below.
     * 
     */
    public Output</* @Nullable */ DatabaseEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    @OutputExport(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * Name of the database to create.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the database to create.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable DatabaseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/database:Database", name, state, makeResourceOptions(options, id));
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
    public static Database get(String name, Input<String> id, @Nullable DatabaseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
