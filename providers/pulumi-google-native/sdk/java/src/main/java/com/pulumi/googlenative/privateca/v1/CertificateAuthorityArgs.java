// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca.v1.enums.CertificateAuthorityType;
import com.pulumi.googlenative.privateca.v1.inputs.CertificateConfigArgs;
import com.pulumi.googlenative.privateca.v1.inputs.KeyVersionSpecArgs;
import com.pulumi.googlenative.privateca.v1.inputs.SubordinateConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    @Import(name="caPoolId", required=true)
    private Output<String> caPoolId;

    public Output<String> caPoolId() {
        return this.caPoolId;
    }

    /**
     * Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    @Import(name="certificateAuthorityId", required=true)
    private Output<String> certificateAuthorityId;

    /**
     * @return Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    public Output<String> certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    @Import(name="config", required=true)
    private Output<CertificateConfigArgs> config;

    /**
     * @return Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    public Output<CertificateConfigArgs> config() {
        return this.config;
    }

    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    @Import(name="gcsBucket")
    private @Nullable Output<String> gcsBucket;

    /**
     * @return Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    public Optional<Output<String>> gcsBucket() {
        return Optional.ofNullable(this.gcsBucket);
    }

    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    @Import(name="keySpec", required=true)
    private Output<KeyVersionSpecArgs> keySpec;

    /**
     * @return Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    public Output<KeyVersionSpecArgs> keySpec() {
        return this.keySpec;
    }

    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Immutable. The desired lifetime of the CA certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate.
     * 
     */
    @Import(name="lifetime", required=true)
    private Output<String> lifetime;

    /**
     * @return Immutable. The desired lifetime of the CA certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate.
     * 
     */
    public Output<String> lifetime() {
        return this.lifetime;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    @Import(name="subordinateConfig")
    private @Nullable Output<SubordinateConfigArgs> subordinateConfig;

    /**
     * @return Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    public Optional<Output<SubordinateConfigArgs>> subordinateConfig() {
        return Optional.ofNullable(this.subordinateConfig);
    }

    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
     */
    @Import(name="type", required=true)
    private Output<CertificateAuthorityType> type;

    /**
     * @return Immutable. The Type of this CertificateAuthority.
     * 
     */
    public Output<CertificateAuthorityType> type() {
        return this.type;
    }

    private CertificateAuthorityArgs() {}

    private CertificateAuthorityArgs(CertificateAuthorityArgs $) {
        this.caPoolId = $.caPoolId;
        this.certificateAuthorityId = $.certificateAuthorityId;
        this.config = $.config;
        this.gcsBucket = $.gcsBucket;
        this.keySpec = $.keySpec;
        this.labels = $.labels;
        this.lifetime = $.lifetime;
        this.location = $.location;
        this.project = $.project;
        this.requestId = $.requestId;
        this.subordinateConfig = $.subordinateConfig;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityArgs $;

        public Builder() {
            $ = new CertificateAuthorityArgs();
        }

        public Builder(CertificateAuthorityArgs defaults) {
            $ = new CertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        public Builder caPoolId(Output<String> caPoolId) {
            $.caPoolId = caPoolId;
            return this;
        }

        public Builder caPoolId(String caPoolId) {
            return caPoolId(Output.of(caPoolId));
        }

        /**
         * @param certificateAuthorityId Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityId(Output<String> certificateAuthorityId) {
            $.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        /**
         * @param certificateAuthorityId Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            return certificateAuthorityId(Output.of(certificateAuthorityId));
        }

        /**
         * @param config Immutable. The config used to create a self-signed X.509 certificate or CSR.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<CertificateConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Immutable. The config used to create a self-signed X.509 certificate or CSR.
         * 
         * @return builder
         * 
         */
        public Builder config(CertificateConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param gcsBucket Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
         * 
         * @return builder
         * 
         */
        public Builder gcsBucket(@Nullable Output<String> gcsBucket) {
            $.gcsBucket = gcsBucket;
            return this;
        }

        /**
         * @param gcsBucket Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
         * 
         * @return builder
         * 
         */
        public Builder gcsBucket(String gcsBucket) {
            return gcsBucket(Output.of(gcsBucket));
        }

        /**
         * @param keySpec Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
         * 
         * @return builder
         * 
         */
        public Builder keySpec(Output<KeyVersionSpecArgs> keySpec) {
            $.keySpec = keySpec;
            return this;
        }

        /**
         * @param keySpec Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
         * 
         * @return builder
         * 
         */
        public Builder keySpec(KeyVersionSpecArgs keySpec) {
            return keySpec(Output.of(keySpec));
        }

        /**
         * @param labels Optional. Labels with user-defined metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Labels with user-defined metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param lifetime Immutable. The desired lifetime of the CA certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate.
         * 
         * @return builder
         * 
         */
        public Builder lifetime(Output<String> lifetime) {
            $.lifetime = lifetime;
            return this;
        }

        /**
         * @param lifetime Immutable. The desired lifetime of the CA certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate.
         * 
         * @return builder
         * 
         */
        public Builder lifetime(String lifetime) {
            return lifetime(Output.of(lifetime));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param subordinateConfig Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
         * 
         * @return builder
         * 
         */
        public Builder subordinateConfig(@Nullable Output<SubordinateConfigArgs> subordinateConfig) {
            $.subordinateConfig = subordinateConfig;
            return this;
        }

        /**
         * @param subordinateConfig Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
         * 
         * @return builder
         * 
         */
        public Builder subordinateConfig(SubordinateConfigArgs subordinateConfig) {
            return subordinateConfig(Output.of(subordinateConfig));
        }

        /**
         * @param type Immutable. The Type of this CertificateAuthority.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<CertificateAuthorityType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Immutable. The Type of this CertificateAuthority.
         * 
         * @return builder
         * 
         */
        public Builder type(CertificateAuthorityType type) {
            return type(Output.of(type));
        }

        public CertificateAuthorityArgs build() {
            $.caPoolId = Objects.requireNonNull($.caPoolId, "expected parameter 'caPoolId' to be non-null");
            $.certificateAuthorityId = Objects.requireNonNull($.certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.keySpec = Objects.requireNonNull($.keySpec, "expected parameter 'keySpec' to be non-null");
            $.lifetime = Objects.requireNonNull($.lifetime, "expected parameter 'lifetime' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
