// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.domains.v1.RegistrationArgs;
import com.pulumi.googlenative.domains.v1.outputs.ContactSettingsResponse;
import com.pulumi.googlenative.domains.v1.outputs.DnsSettingsResponse;
import com.pulumi.googlenative.domains.v1.outputs.ManagementSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Registers a new domain name and creates a corresponding `Registration` resource. Call `RetrieveRegisterParameters` first to check availability of the domain name and determine parameters like price that are needed to build a call to this method. A successful call creates a `Registration` resource in state `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2 minutes, indicating that the domain was successfully registered. If the resource ends up in state `REGISTRATION_FAILED`, it indicates that the domain was not registered successfully, and you can safely delete the resource and retry registration.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:domains/v1:Registration")
public class Registration extends com.pulumi.resources.CustomResource {
    /**
     * Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    @Export(name="contactSettings", type=ContactSettingsResponse.class, parameters={})
    private Output<ContactSettingsResponse> contactSettings;

    /**
     * @return Settings for contact information linked to the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureContactSettings` method.
     * 
     */
    public Output<ContactSettingsResponse> contactSettings() {
        return this.contactSettings;
    }
    /**
     * The creation timestamp of the `Registration` resource.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of the `Registration` resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    @Export(name="dnsSettings", type=DnsSettingsResponse.class, parameters={})
    private Output<DnsSettingsResponse> dnsSettings;

    /**
     * @return Settings controlling the DNS configuration of the `Registration`. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureDnsSettings` method.
     * 
     */
    public Output<DnsSettingsResponse> dnsSettings() {
        return this.dnsSettings;
    }
    /**
     * Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The expiration timestamp of the `Registration`.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The expiration timestamp of the `Registration`.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * The set of issues with the `Registration` that require attention.
     * 
     */
    @Export(name="issues", type=List.class, parameters={String.class})
    private Output<List<String>> issues;

    /**
     * @return The set of issues with the `Registration` that require attention.
     * 
     */
    public Output<List<String>> issues() {
        return this.issues;
    }
    /**
     * Set of labels associated with the `Registration`.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Set of labels associated with the `Registration`.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    @Export(name="managementSettings", type=ManagementSettingsResponse.class, parameters={})
    private Output<ManagementSettingsResponse> managementSettings;

    /**
     * @return Settings for management of the `Registration`, including renewal, billing, and transfer. You cannot update these with the `UpdateRegistration` method. To update these settings, use the `ConfigureManagementSettings` method.
     * 
     */
    public Output<ManagementSettingsResponse> managementSettings() {
        return this.managementSettings;
    }
    /**
     * Name of the `Registration` resource, in the format `projects/*{@literal /}locations/*{@literal /}registrations/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the `Registration` resource, in the format `projects/*{@literal /}locations/*{@literal /}registrations/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
     * 
     */
    @Export(name="pendingContactSettings", type=ContactSettingsResponse.class, parameters={})
    private Output<ContactSettingsResponse> pendingContactSettings;

    /**
     * @return Pending contact settings for the `Registration`. Updates to the `contact_settings` field that change its `registrant_contact` or `privacy` fields require email confirmation by the `registrant_contact` before taking effect. This field is set only if there are pending updates to the `contact_settings` that have not been confirmed. To confirm the changes, the `registrant_contact` must follow the instructions in the email they receive.
     * 
     */
    public Output<ContactSettingsResponse> pendingContactSettings() {
        return this.pendingContactSettings;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The reason the domain registration failed. Only set for domains in REGISTRATION_FAILED state.
     * 
     */
    @Export(name="registerFailureReason", type=String.class, parameters={})
    private Output<String> registerFailureReason;

    /**
     * @return The reason the domain registration failed. Only set for domains in REGISTRATION_FAILED state.
     * 
     */
    public Output<String> registerFailureReason() {
        return this.registerFailureReason;
    }
    /**
     * The state of the `Registration`
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the `Registration`
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Set of options for the `contact_settings.privacy` field that this `Registration` supports.
     * 
     */
    @Export(name="supportedPrivacy", type=List.class, parameters={String.class})
    private Output<List<String>> supportedPrivacy;

    /**
     * @return Set of options for the `contact_settings.privacy` field that this `Registration` supports.
     * 
     */
    public Output<List<String>> supportedPrivacy() {
        return this.supportedPrivacy;
    }
    /**
     * The reason the domain transfer failed. Only set for domains in TRANSFER_FAILED state.
     * 
     */
    @Export(name="transferFailureReason", type=String.class, parameters={})
    private Output<String> transferFailureReason;

    /**
     * @return The reason the domain transfer failed. Only set for domains in TRANSFER_FAILED state.
     * 
     */
    public Output<String> transferFailureReason() {
        return this.transferFailureReason;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Registration(String name) {
        this(name, RegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Registration(String name, RegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Registration(String name, RegistrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:domains/v1:Registration", name, args == null ? RegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Registration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:domains/v1:Registration", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Registration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Registration(name, id, options);
    }
}
