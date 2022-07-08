// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.certificatemanager.v1.CertificateArgs;
import com.pulumi.googlenative.certificatemanager.v1.outputs.ManagedCertificateResponse;
import com.pulumi.googlenative.certificatemanager.v1.outputs.SelfManagedCertificateResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Certificate in a given project and location.
 * 
 */
@ResourceType(type="google-native:certificatemanager/v1:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * Required. A user-provided name of the certificate.
     * 
     */
    @Export(name="certificateId", type=String.class, parameters={})
    private Output<String> certificateId;

    /**
     * @return Required. A user-provided name of the certificate.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * The creation timestamp of a Certificate.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of a Certificate.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * One or more paragraphs of text description of a certificate.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return One or more paragraphs of text description of a certificate.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The expiry timestamp of a Certificate.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The expiry timestamp of a Certificate.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Set of labels associated with a Certificate.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Set of labels associated with a Certificate.
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
     * If set, contains configuration and state of a managed certificate.
     * 
     */
    @Export(name="managed", type=ManagedCertificateResponse.class, parameters={})
    private Output<ManagedCertificateResponse> managed;

    /**
     * @return If set, contains configuration and state of a managed certificate.
     * 
     */
    public Output<ManagedCertificateResponse> managed() {
        return this.managed;
    }
    /**
     * A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The PEM-encoded certificate chain.
     * 
     */
    @Export(name="pemCertificate", type=String.class, parameters={})
    private Output<String> pemCertificate;

    /**
     * @return The PEM-encoded certificate chain.
     * 
     */
    public Output<String> pemCertificate() {
        return this.pemCertificate;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The list of Subject Alternative Names of dnsName type defined in the certificate (see RFC 5280 4.2.1.6). Managed certificates that haven&#39;t been provisioned yet have this field populated with a value of the managed.domains field.
     * 
     */
    @Export(name="sanDnsnames", type=List.class, parameters={String.class})
    private Output<List<String>> sanDnsnames;

    /**
     * @return The list of Subject Alternative Names of dnsName type defined in the certificate (see RFC 5280 4.2.1.6). Managed certificates that haven&#39;t been provisioned yet have this field populated with a value of the managed.domains field.
     * 
     */
    public Output<List<String>> sanDnsnames() {
        return this.sanDnsnames;
    }
    /**
     * Immutable. The scope of the certificate.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Immutable. The scope of the certificate.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * If set, defines data of a self-managed certificate.
     * 
     */
    @Export(name="selfManaged", type=SelfManagedCertificateResponse.class, parameters={})
    private Output<SelfManagedCertificateResponse> selfManaged;

    /**
     * @return If set, defines data of a self-managed certificate.
     * 
     */
    public Output<SelfManagedCertificateResponse> selfManaged() {
        return this.selfManaged;
    }
    /**
     * The last update timestamp of a Certificate.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of a Certificate.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:certificatemanager/v1:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:certificatemanager/v1:Certificate", name, null, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}
