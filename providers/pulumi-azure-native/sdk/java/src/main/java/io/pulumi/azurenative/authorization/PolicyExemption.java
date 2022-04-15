// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.PolicyExemptionArgs;
import io.pulumi.azurenative.authorization.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The policy exemption.
 * API Version: 2020-07-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:PolicyExemption DemoExpensiveVM /subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/resourceGroups/demoCluster/providers/Microsoft.Authorization/policyExemptions/DemoExpensiveVM 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:PolicyExemption")
public class PolicyExemption extends io.pulumi.resources.CustomResource {
    /**
     * The description of the policy exemption.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the policy exemption.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The display name of the policy exemption.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the policy exemption.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     */
    @Export(name="exemptionCategory", type=String.class, parameters={})
    private Output<String> exemptionCategory;

    /**
     * @return The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     */
    public Output<String> exemptionCategory() {
        return this.exemptionCategory;
    }
    /**
     * The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
     * 
     */
    @Export(name="expiresOn", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiresOn;

    /**
     * @return The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
     * 
     */
    public Output</* @Nullable */ String> expiresOn() {
        return this.expiresOn;
    }
    /**
     * The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Output</* @Nullable */ Object> metadata() {
        return this.metadata;
    }
    /**
     * The name of the policy exemption.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy exemption.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the policy assignment that is being exempted.
     * 
     */
    @Export(name="policyAssignmentId", type=String.class, parameters={})
    private Output<String> policyAssignmentId;

    /**
     * @return The ID of the policy assignment that is being exempted.
     * 
     */
    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }
    /**
     * The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     */
    @Export(name="policyDefinitionReferenceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> policyDefinitionReferenceIds;

    /**
     * @return The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     * 
     */
    public Output</* @Nullable */ List<String>> policyDefinitionReferenceIds() {
        return this.policyDefinitionReferenceIds;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource (Microsoft.Authorization/policyExemptions).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource (Microsoft.Authorization/policyExemptions).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyExemption(String name) {
        this(name, PolicyExemptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyExemption(String name, PolicyExemptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyExemption(String name, PolicyExemptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyExemption", name, args == null ? PolicyExemptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyExemption(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyExemption", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20200701preview:PolicyExemption").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PolicyExemption get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyExemption(name, id, options);
    }
}
