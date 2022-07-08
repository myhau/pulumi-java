// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies Kerberos related configuration.
 * 
 */
public final class KerberosConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final KerberosConfigArgs Empty = new KerberosConfigArgs();

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustAdminServer")
    private @Nullable Output<String> crossRealmTrustAdminServer;

    /**
     * @return Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<Output<String>> crossRealmTrustAdminServer() {
        return Optional.ofNullable(this.crossRealmTrustAdminServer);
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustKdc")
    private @Nullable Output<String> crossRealmTrustKdc;

    /**
     * @return Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<Output<String>> crossRealmTrustKdc() {
        return Optional.ofNullable(this.crossRealmTrustKdc);
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    @Import(name="crossRealmTrustRealm")
    private @Nullable Output<String> crossRealmTrustRealm;

    /**
     * @return Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    public Optional<Output<String>> crossRealmTrustRealm() {
        return Optional.ofNullable(this.crossRealmTrustRealm);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustSharedPasswordUri")
    private @Nullable Output<String> crossRealmTrustSharedPasswordUri;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    public Optional<Output<String>> crossRealmTrustSharedPasswordUri() {
        return Optional.ofNullable(this.crossRealmTrustSharedPasswordUri);
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    @Import(name="enableKerberos")
    private @Nullable Output<Boolean> enableKerberos;

    /**
     * @return Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    public Optional<Output<Boolean>> enableKerberos() {
        return Optional.ofNullable(this.enableKerberos);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    @Import(name="kdcDbKeyUri")
    private @Nullable Output<String> kdcDbKeyUri;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    public Optional<Output<String>> kdcDbKeyUri() {
        return Optional.ofNullable(this.kdcDbKeyUri);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keyPasswordUri")
    private @Nullable Output<String> keyPasswordUri;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<Output<String>> keyPasswordUri() {
        return Optional.ofNullable(this.keyPasswordUri);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keystorePasswordUri")
    private @Nullable Output<String> keystorePasswordUri;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<Output<String>> keystorePasswordUri() {
        return Optional.ofNullable(this.keystorePasswordUri);
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="keystoreUri")
    private @Nullable Output<String> keystoreUri;

    /**
     * @return Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<Output<String>> keystoreUri() {
        return Optional.ofNullable(this.keystoreUri);
    }

    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    @Import(name="kmsKeyUri")
    private @Nullable Output<String> kmsKeyUri;

    /**
     * @return Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    public Optional<Output<String>> kmsKeyUri() {
        return Optional.ofNullable(this.kmsKeyUri);
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    @Import(name="realm")
    private @Nullable Output<String> realm;

    /**
     * @return Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    public Optional<Output<String>> realm() {
        return Optional.ofNullable(this.realm);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    @Import(name="rootPrincipalPasswordUri")
    private @Nullable Output<String> rootPrincipalPasswordUri;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    public Optional<Output<String>> rootPrincipalPasswordUri() {
        return Optional.ofNullable(this.rootPrincipalPasswordUri);
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    @Import(name="tgtLifetimeHours")
    private @Nullable Output<Integer> tgtLifetimeHours;

    /**
     * @return Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    public Optional<Output<Integer>> tgtLifetimeHours() {
        return Optional.ofNullable(this.tgtLifetimeHours);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="truststorePasswordUri")
    private @Nullable Output<String> truststorePasswordUri;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<Output<String>> truststorePasswordUri() {
        return Optional.ofNullable(this.truststorePasswordUri);
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="truststoreUri")
    private @Nullable Output<String> truststoreUri;

    /**
     * @return Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<Output<String>> truststoreUri() {
        return Optional.ofNullable(this.truststoreUri);
    }

    private KerberosConfigArgs() {}

    private KerberosConfigArgs(KerberosConfigArgs $) {
        this.crossRealmTrustAdminServer = $.crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = $.crossRealmTrustKdc;
        this.crossRealmTrustRealm = $.crossRealmTrustRealm;
        this.crossRealmTrustSharedPasswordUri = $.crossRealmTrustSharedPasswordUri;
        this.enableKerberos = $.enableKerberos;
        this.kdcDbKeyUri = $.kdcDbKeyUri;
        this.keyPasswordUri = $.keyPasswordUri;
        this.keystorePasswordUri = $.keystorePasswordUri;
        this.keystoreUri = $.keystoreUri;
        this.kmsKeyUri = $.kmsKeyUri;
        this.realm = $.realm;
        this.rootPrincipalPasswordUri = $.rootPrincipalPasswordUri;
        this.tgtLifetimeHours = $.tgtLifetimeHours;
        this.truststorePasswordUri = $.truststorePasswordUri;
        this.truststoreUri = $.truststoreUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KerberosConfigArgs $;

        public Builder() {
            $ = new KerberosConfigArgs();
        }

        public Builder(KerberosConfigArgs defaults) {
            $ = new KerberosConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossRealmTrustAdminServer Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustAdminServer(@Nullable Output<String> crossRealmTrustAdminServer) {
            $.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }

        /**
         * @param crossRealmTrustAdminServer Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustAdminServer(String crossRealmTrustAdminServer) {
            return crossRealmTrustAdminServer(Output.of(crossRealmTrustAdminServer));
        }

        /**
         * @param crossRealmTrustKdc Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustKdc(@Nullable Output<String> crossRealmTrustKdc) {
            $.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }

        /**
         * @param crossRealmTrustKdc Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustKdc(String crossRealmTrustKdc) {
            return crossRealmTrustKdc(Output.of(crossRealmTrustKdc));
        }

        /**
         * @param crossRealmTrustRealm Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustRealm(@Nullable Output<String> crossRealmTrustRealm) {
            $.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }

        /**
         * @param crossRealmTrustRealm Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustRealm(String crossRealmTrustRealm) {
            return crossRealmTrustRealm(Output.of(crossRealmTrustRealm));
        }

        /**
         * @param crossRealmTrustSharedPasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustSharedPasswordUri(@Nullable Output<String> crossRealmTrustSharedPasswordUri) {
            $.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
            return this;
        }

        /**
         * @param crossRealmTrustSharedPasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustSharedPasswordUri(String crossRealmTrustSharedPasswordUri) {
            return crossRealmTrustSharedPasswordUri(Output.of(crossRealmTrustSharedPasswordUri));
        }

        /**
         * @param enableKerberos Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableKerberos(@Nullable Output<Boolean> enableKerberos) {
            $.enableKerberos = enableKerberos;
            return this;
        }

        /**
         * @param enableKerberos Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableKerberos(Boolean enableKerberos) {
            return enableKerberos(Output.of(enableKerberos));
        }

        /**
         * @param kdcDbKeyUri Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
         * 
         * @return builder
         * 
         */
        public Builder kdcDbKeyUri(@Nullable Output<String> kdcDbKeyUri) {
            $.kdcDbKeyUri = kdcDbKeyUri;
            return this;
        }

        /**
         * @param kdcDbKeyUri Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
         * 
         * @return builder
         * 
         */
        public Builder kdcDbKeyUri(String kdcDbKeyUri) {
            return kdcDbKeyUri(Output.of(kdcDbKeyUri));
        }

        /**
         * @param keyPasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keyPasswordUri(@Nullable Output<String> keyPasswordUri) {
            $.keyPasswordUri = keyPasswordUri;
            return this;
        }

        /**
         * @param keyPasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keyPasswordUri(String keyPasswordUri) {
            return keyPasswordUri(Output.of(keyPasswordUri));
        }

        /**
         * @param keystorePasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keystorePasswordUri(@Nullable Output<String> keystorePasswordUri) {
            $.keystorePasswordUri = keystorePasswordUri;
            return this;
        }

        /**
         * @param keystorePasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keystorePasswordUri(String keystorePasswordUri) {
            return keystorePasswordUri(Output.of(keystorePasswordUri));
        }

        /**
         * @param keystoreUri Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder keystoreUri(@Nullable Output<String> keystoreUri) {
            $.keystoreUri = keystoreUri;
            return this;
        }

        /**
         * @param keystoreUri Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder keystoreUri(String keystoreUri) {
            return keystoreUri(Output.of(keystoreUri));
        }

        /**
         * @param kmsKeyUri Optional. The uri of the KMS key used to encrypt various sensitive files.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyUri(@Nullable Output<String> kmsKeyUri) {
            $.kmsKeyUri = kmsKeyUri;
            return this;
        }

        /**
         * @param kmsKeyUri Optional. The uri of the KMS key used to encrypt various sensitive files.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyUri(String kmsKeyUri) {
            return kmsKeyUri(Output.of(kmsKeyUri));
        }

        /**
         * @param realm Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
         * 
         * @return builder
         * 
         */
        public Builder realm(@Nullable Output<String> realm) {
            $.realm = realm;
            return this;
        }

        /**
         * @param realm Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
         * 
         * @return builder
         * 
         */
        public Builder realm(String realm) {
            return realm(Output.of(realm));
        }

        /**
         * @param rootPrincipalPasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
         * 
         * @return builder
         * 
         */
        public Builder rootPrincipalPasswordUri(@Nullable Output<String> rootPrincipalPasswordUri) {
            $.rootPrincipalPasswordUri = rootPrincipalPasswordUri;
            return this;
        }

        /**
         * @param rootPrincipalPasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
         * 
         * @return builder
         * 
         */
        public Builder rootPrincipalPasswordUri(String rootPrincipalPasswordUri) {
            return rootPrincipalPasswordUri(Output.of(rootPrincipalPasswordUri));
        }

        /**
         * @param tgtLifetimeHours Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
         * 
         * @return builder
         * 
         */
        public Builder tgtLifetimeHours(@Nullable Output<Integer> tgtLifetimeHours) {
            $.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }

        /**
         * @param tgtLifetimeHours Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
         * 
         * @return builder
         * 
         */
        public Builder tgtLifetimeHours(Integer tgtLifetimeHours) {
            return tgtLifetimeHours(Output.of(tgtLifetimeHours));
        }

        /**
         * @param truststorePasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder truststorePasswordUri(@Nullable Output<String> truststorePasswordUri) {
            $.truststorePasswordUri = truststorePasswordUri;
            return this;
        }

        /**
         * @param truststorePasswordUri Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder truststorePasswordUri(String truststorePasswordUri) {
            return truststorePasswordUri(Output.of(truststorePasswordUri));
        }

        /**
         * @param truststoreUri Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder truststoreUri(@Nullable Output<String> truststoreUri) {
            $.truststoreUri = truststoreUri;
            return this;
        }

        /**
         * @param truststoreUri Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder truststoreUri(String truststoreUri) {
            return truststoreUri(Output.of(truststoreUri));
        }

        public KerberosConfigArgs build() {
            return $;
        }
    }

}
