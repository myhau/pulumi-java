// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.privateca.v1.CertificateArgs;
import com.pulumi.googlenative.privateca.v1.outputs.CertificateConfigResponse;
import com.pulumi.googlenative.privateca.v1.outputs.CertificateDescriptionResponse;
import com.pulumi.googlenative.privateca.v1.outputs.RevocationDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Create a new Certificate in a given Project, Location from a particular CaPool.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:privateca/v1:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    @Export(name="caPoolId", type=String.class, parameters={})
    private Output<String> caPoolId;

    public Output<String> caPoolId() {
        return this.caPoolId;
    }
    /**
     * A structured description of the issued X.509 certificate.
     * 
     */
    @Export(name="certificateDescription", type=CertificateDescriptionResponse.class, parameters={})
    private Output<CertificateDescriptionResponse> certificateDescription;

    /**
     * @return A structured description of the issued X.509 certificate.
     * 
     */
    public Output<CertificateDescriptionResponse> certificateDescription() {
        return this.certificateDescription;
    }
    /**
     * Optional. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`. This field is required when using a CertificateAuthority in the Enterprise CertificateAuthority.Tier, but is optional and its value is ignored otherwise.
     * 
     */
    @Export(name="certificateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateId;

    /**
     * @return Optional. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`. This field is required when using a CertificateAuthority in the Enterprise CertificateAuthority.Tier, but is optional and its value is ignored otherwise.
     * 
     */
    public Output<Optional<String>> certificateId() {
        return Codegen.optional(this.certificateId);
    }
    /**
     * Immutable. The resource name for a CertificateTemplate used to issue this certificate, in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified, the caller must have the necessary permission to use this template. If this is omitted, no template will be used. This template must be in the same location as the Certificate.
     * 
     */
    @Export(name="certificateTemplate", type=String.class, parameters={})
    private Output<String> certificateTemplate;

    /**
     * @return Immutable. The resource name for a CertificateTemplate used to issue this certificate, in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified, the caller must have the necessary permission to use this template. If this is omitted, no template will be used. This template must be in the same location as the Certificate.
     * 
     */
    public Output<String> certificateTemplate() {
        return this.certificateTemplate;
    }
    /**
     * Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    @Export(name="config", type=CertificateConfigResponse.class, parameters={})
    private Output<CertificateConfigResponse> config;

    /**
     * @return Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    public Output<CertificateConfigResponse> config() {
        return this.config;
    }
    /**
     * The time at which this Certificate was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this Certificate was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The resource name of the issuing CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    @Export(name="issuerCertificateAuthority", type=String.class, parameters={})
    private Output<String> issuerCertificateAuthority;

    /**
     * @return The resource name of the issuing CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    public Output<String> issuerCertificateAuthority() {
        return this.issuerCertificateAuthority;
    }
    /**
     * Optional. The resource ID of the CertificateAuthority that should issue the certificate. This optional field will ignore the load-balancing scheme of the Pool and directly issue the certificate from the CA with the specified ID, contained in the same CaPool referenced by `parent`. Per-CA quota rules apply. If left empty, a CertificateAuthority will be chosen from the CaPool by the service. For example, to issue a Certificate from a Certificate Authority with resource name &#34;projects/my-project/locations/us-central1/caPools/my-pool/certificateAuthorities/my-ca&#34;, you can set the parent to &#34;projects/my-project/locations/us-central1/caPools/my-pool&#34; and the issuing_certificate_authority_id to &#34;my-ca&#34;.
     * 
     */
    @Export(name="issuingCertificateAuthorityId", type=String.class, parameters={})
    private Output</* @Nullable */ String> issuingCertificateAuthorityId;

    /**
     * @return Optional. The resource ID of the CertificateAuthority that should issue the certificate. This optional field will ignore the load-balancing scheme of the Pool and directly issue the certificate from the CA with the specified ID, contained in the same CaPool referenced by `parent`. Per-CA quota rules apply. If left empty, a CertificateAuthority will be chosen from the CaPool by the service. For example, to issue a Certificate from a Certificate Authority with resource name &#34;projects/my-project/locations/us-central1/caPools/my-pool/certificateAuthorities/my-ca&#34;, you can set the parent to &#34;projects/my-project/locations/us-central1/caPools/my-pool&#34; and the issuing_certificate_authority_id to &#34;my-ca&#34;.
     * 
     */
    public Output<Optional<String>> issuingCertificateAuthorityId() {
        return Codegen.optional(this.issuingCertificateAuthorityId);
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Immutable. The desired lifetime of a certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    @Export(name="lifetime", type=String.class, parameters={})
    private Output<String> lifetime;

    /**
     * @return Immutable. The desired lifetime of a certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    public Output<String> lifetime() {
        return this.lifetime;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name for this Certificate in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificates/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this Certificate in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificates/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The pem-encoded, signed X.509 certificate.
     * 
     */
    @Export(name="pemCertificate", type=String.class, parameters={})
    private Output<String> pemCertificate;

    /**
     * @return The pem-encoded, signed X.509 certificate.
     * 
     */
    public Output<String> pemCertificate() {
        return this.pemCertificate;
    }
    /**
     * The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
     * 
     */
    @Export(name="pemCertificateChain", type=List.class, parameters={String.class})
    private Output<List<String>> pemCertificateChain;

    /**
     * @return The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
     * 
     */
    public Output<List<String>> pemCertificateChain() {
        return this.pemCertificateChain;
    }
    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @Export(name="pemCsr", type=String.class, parameters={})
    private Output<String> pemCsr;

    /**
     * @return Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    public Output<String> pemCsr() {
        return this.pemCsr;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * 
     */
    @Export(name="revocationDetails", type=RevocationDetailsResponse.class, parameters={})
    private Output<RevocationDetailsResponse> revocationDetails;

    /**
     * @return Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * 
     */
    public Output<RevocationDetailsResponse> revocationDetails() {
        return this.revocationDetails;
    }
    /**
     * Immutable. Specifies how the Certificate&#39;s identity fields are to be decided. If this is omitted, the `DEFAULT` subject mode will be used.
     * 
     */
    @Export(name="subjectMode", type=String.class, parameters={})
    private Output<String> subjectMode;

    /**
     * @return Immutable. Specifies how the Certificate&#39;s identity fields are to be decided. If this is omitted, the `DEFAULT` subject mode will be used.
     * 
     */
    public Output<String> subjectMode() {
        return this.subjectMode;
    }
    /**
     * The time at which this Certificate was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this Certificate was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Optional. If this is true, no Certificate resource will be persisted regardless of the CaPool&#39;s tier, and the returned Certificate will not contain the pem_certificate field.
     * 
     */
    @Export(name="validateOnly", type=String.class, parameters={})
    private Output</* @Nullable */ String> validateOnly;

    /**
     * @return Optional. If this is true, no Certificate resource will be persisted regardless of the CaPool&#39;s tier, and the returned Certificate will not contain the pem_certificate field.
     * 
     */
    public Output<Optional<String>> validateOnly() {
        return Codegen.optional(this.validateOnly);
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
        super("google-native:privateca/v1:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:Certificate", name, null, makeResourceOptions(options, id));
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
