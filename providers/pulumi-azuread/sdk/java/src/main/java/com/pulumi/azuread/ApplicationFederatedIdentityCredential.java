// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.azuread.ApplicationFederatedIdentityCredentialArgs;
import com.pulumi.azuread.Utilities;
import com.pulumi.azuread.inputs.ApplicationFederatedIdentityCredentialState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Federated Identity Credentials can be imported using the object ID of the associated application and the ID of the federated identity credential, e.g.
 * 
 * ```sh
 *  $ pulumi import azuread:index/applicationFederatedIdentityCredential:ApplicationFederatedIdentityCredential test 00000000-0000-0000-0000-000000000000/federatedIdentityCredential/11111111-1111-1111-1111-111111111111
 * ```
 * 
 *  -&gt; This ID format is unique to Terraform and is composed of the application&#39;s object ID, the string &#34;federatedIdentityCredential&#34; and the credential ID in the format `{ObjectId}/federatedIdentityCredential/{CredentialId}`.
 * 
 */
@ResourceType(type="azuread:index/applicationFederatedIdentityCredential:ApplicationFederatedIdentityCredential")
public class ApplicationFederatedIdentityCredential extends com.pulumi.resources.CustomResource {
    /**
     * The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
     * 
     */
    @Export(name="applicationObjectId", type=String.class, parameters={})
    private Output<String> applicationObjectId;

    /**
     * @return The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
     * 
     */
    public Output<String> applicationObjectId() {
        return this.applicationObjectId;
    }
    /**
     * List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
     * 
     */
    @Export(name="audiences", type=List.class, parameters={String.class})
    private Output<List<String>> audiences;

    /**
     * @return List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
     * 
     */
    public Output<List<String>> audiences() {
        return this.audiences;
    }
    /**
     * A UUID used to uniquely identify this federated identity credential.
     * 
     */
    @Export(name="credentialId", type=String.class, parameters={})
    private Output<String> credentialId;

    /**
     * @return A UUID used to uniquely identify this federated identity credential.
     * 
     */
    public Output<String> credentialId() {
        return this.credentialId;
    }
    /**
     * A description for the federated identity credential.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the federated identity credential.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A unique display name for the federated identity credential. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A unique display name for the federated identity credential. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
     * 
     */
    @Export(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    /**
     * @return The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
     * 
     */
    @Export(name="subject", type=String.class, parameters={})
    private Output<String> subject;

    /**
     * @return The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
     * 
     */
    public Output<String> subject() {
        return this.subject;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationFederatedIdentityCredential(String name) {
        this(name, ApplicationFederatedIdentityCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationFederatedIdentityCredential(String name, ApplicationFederatedIdentityCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationFederatedIdentityCredential(String name, ApplicationFederatedIdentityCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azuread:index/applicationFederatedIdentityCredential:ApplicationFederatedIdentityCredential", name, args == null ? ApplicationFederatedIdentityCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationFederatedIdentityCredential(String name, Output<String> id, @Nullable ApplicationFederatedIdentityCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azuread:index/applicationFederatedIdentityCredential:ApplicationFederatedIdentityCredential", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ApplicationFederatedIdentityCredential get(String name, Output<String> id, @Nullable ApplicationFederatedIdentityCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationFederatedIdentityCredential(name, id, state, options);
    }
}
