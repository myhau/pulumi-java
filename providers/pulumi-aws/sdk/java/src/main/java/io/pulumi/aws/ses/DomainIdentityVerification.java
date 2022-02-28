// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.DomainIdentityVerificationArgs;
import io.pulumi.aws.ses.inputs.DomainIdentityVerificationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a successful verification of an SES domain identity.
 * 
 * Most commonly, this resource is used together with `aws.route53.Record` and
 * `aws.ses.DomainIdentity` to request an SES domain identity,
 * deploy the required DNS verification records, and wait for verification to complete.
 * 
 * > **WARNING:** This resource implements a part of the verification workflow. It does not represent a real-world entity in AWS, therefore changing or deleting this resource on its own has no immediate effect.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ses/domainIdentityVerification:DomainIdentityVerification")
public class DomainIdentityVerification extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the domain identity.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the domain identity.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The domain name of the SES domain identity to verify.
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain name of the SES domain identity to verify.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainIdentityVerification(String name) {
        this(name, DomainIdentityVerificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainIdentityVerification(String name, DomainIdentityVerificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainIdentityVerification(String name, DomainIdentityVerificationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/domainIdentityVerification:DomainIdentityVerification", name, args == null ? DomainIdentityVerificationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainIdentityVerification(String name, Input<String> id, @Nullable DomainIdentityVerificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/domainIdentityVerification:DomainIdentityVerification", name, state, makeResourceOptions(options, id));
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
    public static DomainIdentityVerification get(String name, Input<String> id, @Nullable DomainIdentityVerificationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainIdentityVerification(name, id, state, options);
    }
}
