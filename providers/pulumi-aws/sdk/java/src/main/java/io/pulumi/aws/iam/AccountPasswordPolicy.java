// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.AccountPasswordPolicyArgs;
import io.pulumi.aws.iam.inputs.AccountPasswordPolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import javax.annotation.Nullable;

/**
 * > **Note:** There is only a single policy allowed per AWS account. An existing policy will be lost when using this resource as an effect of this limitation.
 * 
 * Manages Password Policy for the AWS Account.
 * See more about [Account Password Policy](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_account-policy.html)
 * in the official AWS docs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM Account Password Policy can be imported using the word `iam-account-password-policy`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/accountPasswordPolicy:AccountPasswordPolicy strict iam-account-password-policy
 * ```
 * 
 */
@ResourceType(type="aws:iam/accountPasswordPolicy:AccountPasswordPolicy")
public class AccountPasswordPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Whether to allow users to change their own password
     * 
     */
    @OutputExport(name="allowUsersToChangePassword", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowUsersToChangePassword;

    /**
     * @return Whether to allow users to change their own password
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }
    /**
     * Indicates whether passwords in the account expire. Returns `true` if `max_password_age` contains a value greater than `0`. Returns `false` if it is `0` or _not present_.
     * 
     */
    @OutputExport(name="expirePasswords", type=Boolean.class, parameters={})
    private Output<Boolean> expirePasswords;

    /**
     * @return Indicates whether passwords in the account expire. Returns `true` if `max_password_age` contains a value greater than `0`. Returns `false` if it is `0` or _not present_.
     * 
     */
    public Output<Boolean> getExpirePasswords() {
        return this.expirePasswords;
    }
    /**
     * Whether users are prevented from setting a new password after their password has expired (i.e., require administrator reset)
     * 
     */
    @OutputExport(name="hardExpiry", type=Boolean.class, parameters={})
    private Output<Boolean> hardExpiry;

    /**
     * @return Whether users are prevented from setting a new password after their password has expired (i.e., require administrator reset)
     * 
     */
    public Output<Boolean> getHardExpiry() {
        return this.hardExpiry;
    }
    /**
     * The number of days that an user password is valid.
     * 
     */
    @OutputExport(name="maxPasswordAge", type=Integer.class, parameters={})
    private Output<Integer> maxPasswordAge;

    /**
     * @return The number of days that an user password is valid.
     * 
     */
    public Output<Integer> getMaxPasswordAge() {
        return this.maxPasswordAge;
    }
    /**
     * Minimum length to require for user passwords.
     * 
     */
    @OutputExport(name="minimumPasswordLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minimumPasswordLength;

    /**
     * @return Minimum length to require for user passwords.
     * 
     */
    public Output</* @Nullable */ Integer> getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }
    /**
     * The number of previous passwords that users are prevented from reusing.
     * 
     */
    @OutputExport(name="passwordReusePrevention", type=Integer.class, parameters={})
    private Output<Integer> passwordReusePrevention;

    /**
     * @return The number of previous passwords that users are prevented from reusing.
     * 
     */
    public Output<Integer> getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }
    /**
     * Whether to require lowercase characters for user passwords.
     * 
     */
    @OutputExport(name="requireLowercaseCharacters", type=Boolean.class, parameters={})
    private Output<Boolean> requireLowercaseCharacters;

    /**
     * @return Whether to require lowercase characters for user passwords.
     * 
     */
    public Output<Boolean> getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }
    /**
     * Whether to require numbers for user passwords.
     * 
     */
    @OutputExport(name="requireNumbers", type=Boolean.class, parameters={})
    private Output<Boolean> requireNumbers;

    /**
     * @return Whether to require numbers for user passwords.
     * 
     */
    public Output<Boolean> getRequireNumbers() {
        return this.requireNumbers;
    }
    /**
     * Whether to require symbols for user passwords.
     * 
     */
    @OutputExport(name="requireSymbols", type=Boolean.class, parameters={})
    private Output<Boolean> requireSymbols;

    /**
     * @return Whether to require symbols for user passwords.
     * 
     */
    public Output<Boolean> getRequireSymbols() {
        return this.requireSymbols;
    }
    /**
     * Whether to require uppercase characters for user passwords.
     * 
     */
    @OutputExport(name="requireUppercaseCharacters", type=Boolean.class, parameters={})
    private Output<Boolean> requireUppercaseCharacters;

    /**
     * @return Whether to require uppercase characters for user passwords.
     * 
     */
    public Output<Boolean> getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountPasswordPolicy(String name) {
        this(name, AccountPasswordPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountPasswordPolicy(String name, @Nullable AccountPasswordPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountPasswordPolicy(String name, @Nullable AccountPasswordPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/accountPasswordPolicy:AccountPasswordPolicy", name, args == null ? AccountPasswordPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccountPasswordPolicy(String name, Input<String> id, @Nullable AccountPasswordPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/accountPasswordPolicy:AccountPasswordPolicy", name, state, makeResourceOptions(options, id));
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
    public static AccountPasswordPolicy get(String name, Input<String> id, @Nullable AccountPasswordPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccountPasswordPolicy(name, id, state, options);
    }
}
