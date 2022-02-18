// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.activedirectory.DomainTrustArgs;
import io.pulumi.gcp.activedirectory.inputs.DomainTrustState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Adds a trust between Active Directory domains
 * 
 * To get more information about DomainTrust, see:
 * 
 * * [API documentation](https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains/attachTrust)
 * * How-to Guides
 *     * [Active Directory Trust](https://cloud.google.com/managed-microsoft-ad/docs/create-one-way-trust)
 * 
 * > **Warning:** All arguments including `trust_handshake_secret` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DomainTrust can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:activedirectory/domainTrust:DomainTrust default projects/{{project}}/locations/global/domains/{{domain}}/{{target_domain_name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:activedirectory/domainTrust:DomainTrust default {{project}}/{{domain}}/{{target_domain_name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:activedirectory/domainTrust:DomainTrust default {{domain}}/{{target_domain_name}}
 * ```
 * 
 */
@ResourceType(type="gcp:activedirectory/domainTrust:DomainTrust")
public class DomainTrust extends io.pulumi.resources.CustomResource {
    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @OutputExport(name="selectiveAuthentication", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> selectiveAuthentication;

    /**
     * @return Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    public Output</* @Nullable */ Boolean> getSelectiveAuthentication() {
        return this.selectiveAuthentication;
    }
    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @OutputExport(name="targetDnsIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> targetDnsIpAddresses;

    /**
     * @return The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    public Output<List<String>> getTargetDnsIpAddresses() {
        return this.targetDnsIpAddresses;
    }
    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @OutputExport(name="targetDomainName", type=String.class, parameters={})
    private Output<String> targetDomainName;

    /**
     * @return The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    public Output<String> getTargetDomainName() {
        return this.targetDomainName;
    }
    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    @OutputExport(name="trustDirection", type=String.class, parameters={})
    private Output<String> trustDirection;

    /**
     * @return The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    public Output<String> getTrustDirection() {
        return this.trustDirection;
    }
    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @OutputExport(name="trustHandshakeSecret", type=String.class, parameters={})
    private Output<String> trustHandshakeSecret;

    /**
     * @return The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> getTrustHandshakeSecret() {
        return this.trustHandshakeSecret;
    }
    /**
     * The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    @OutputExport(name="trustType", type=String.class, parameters={})
    private Output<String> trustType;

    /**
     * @return The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    public Output<String> getTrustType() {
        return this.trustType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainTrust(String name, DomainTrustArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:activedirectory/domainTrust:DomainTrust", name, args == null ? DomainTrustArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainTrust(String name, Input<String> id, @Nullable DomainTrustState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:activedirectory/domainTrust:DomainTrust", name, state, makeResourceOptions(options, id));
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
    public static DomainTrust get(String name, Input<String> id, @Nullable DomainTrustState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainTrust(name, id, state, options);
    }
}
