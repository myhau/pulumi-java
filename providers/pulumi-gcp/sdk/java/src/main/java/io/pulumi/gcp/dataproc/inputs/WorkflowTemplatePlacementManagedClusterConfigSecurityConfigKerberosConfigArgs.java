// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs();

    @InputImport(name="crossRealmTrustAdminServer")
    private final @Nullable Input<String> crossRealmTrustAdminServer;

    public Input<String> getCrossRealmTrustAdminServer() {
        return this.crossRealmTrustAdminServer == null ? Input.empty() : this.crossRealmTrustAdminServer;
    }

    @InputImport(name="crossRealmTrustKdc")
    private final @Nullable Input<String> crossRealmTrustKdc;

    public Input<String> getCrossRealmTrustKdc() {
        return this.crossRealmTrustKdc == null ? Input.empty() : this.crossRealmTrustKdc;
    }

    @InputImport(name="crossRealmTrustRealm")
    private final @Nullable Input<String> crossRealmTrustRealm;

    public Input<String> getCrossRealmTrustRealm() {
        return this.crossRealmTrustRealm == null ? Input.empty() : this.crossRealmTrustRealm;
    }

    @InputImport(name="crossRealmTrustSharedPassword")
    private final @Nullable Input<String> crossRealmTrustSharedPassword;

    public Input<String> getCrossRealmTrustSharedPassword() {
        return this.crossRealmTrustSharedPassword == null ? Input.empty() : this.crossRealmTrustSharedPassword;
    }

    @InputImport(name="enableKerberos")
    private final @Nullable Input<Boolean> enableKerberos;

    public Input<Boolean> getEnableKerberos() {
        return this.enableKerberos == null ? Input.empty() : this.enableKerberos;
    }

    @InputImport(name="kdcDbKey")
    private final @Nullable Input<String> kdcDbKey;

    public Input<String> getKdcDbKey() {
        return this.kdcDbKey == null ? Input.empty() : this.kdcDbKey;
    }

    @InputImport(name="keyPassword")
    private final @Nullable Input<String> keyPassword;

    public Input<String> getKeyPassword() {
        return this.keyPassword == null ? Input.empty() : this.keyPassword;
    }

    @InputImport(name="keystore")
    private final @Nullable Input<String> keystore;

    public Input<String> getKeystore() {
        return this.keystore == null ? Input.empty() : this.keystore;
    }

    @InputImport(name="keystorePassword")
    private final @Nullable Input<String> keystorePassword;

    public Input<String> getKeystorePassword() {
        return this.keystorePassword == null ? Input.empty() : this.keystorePassword;
    }

    @InputImport(name="kmsKey")
    private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    @InputImport(name="realm")
    private final @Nullable Input<String> realm;

    public Input<String> getRealm() {
        return this.realm == null ? Input.empty() : this.realm;
    }

    @InputImport(name="rootPrincipalPassword")
    private final @Nullable Input<String> rootPrincipalPassword;

    public Input<String> getRootPrincipalPassword() {
        return this.rootPrincipalPassword == null ? Input.empty() : this.rootPrincipalPassword;
    }

    @InputImport(name="tgtLifetimeHours")
    private final @Nullable Input<Integer> tgtLifetimeHours;

    public Input<Integer> getTgtLifetimeHours() {
        return this.tgtLifetimeHours == null ? Input.empty() : this.tgtLifetimeHours;
    }

    @InputImport(name="truststore")
    private final @Nullable Input<String> truststore;

    public Input<String> getTruststore() {
        return this.truststore == null ? Input.empty() : this.truststore;
    }

    @InputImport(name="truststorePassword")
    private final @Nullable Input<String> truststorePassword;

    public Input<String> getTruststorePassword() {
        return this.truststorePassword == null ? Input.empty() : this.truststorePassword;
    }

    public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs(
        @Nullable Input<String> crossRealmTrustAdminServer,
        @Nullable Input<String> crossRealmTrustKdc,
        @Nullable Input<String> crossRealmTrustRealm,
        @Nullable Input<String> crossRealmTrustSharedPassword,
        @Nullable Input<Boolean> enableKerberos,
        @Nullable Input<String> kdcDbKey,
        @Nullable Input<String> keyPassword,
        @Nullable Input<String> keystore,
        @Nullable Input<String> keystorePassword,
        @Nullable Input<String> kmsKey,
        @Nullable Input<String> realm,
        @Nullable Input<String> rootPrincipalPassword,
        @Nullable Input<Integer> tgtLifetimeHours,
        @Nullable Input<String> truststore,
        @Nullable Input<String> truststorePassword) {
        this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = crossRealmTrustKdc;
        this.crossRealmTrustRealm = crossRealmTrustRealm;
        this.crossRealmTrustSharedPassword = crossRealmTrustSharedPassword;
        this.enableKerberos = enableKerberos;
        this.kdcDbKey = kdcDbKey;
        this.keyPassword = keyPassword;
        this.keystore = keystore;
        this.keystorePassword = keystorePassword;
        this.kmsKey = kmsKey;
        this.realm = realm;
        this.rootPrincipalPassword = rootPrincipalPassword;
        this.tgtLifetimeHours = tgtLifetimeHours;
        this.truststore = truststore;
        this.truststorePassword = truststorePassword;
    }

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs() {
        this.crossRealmTrustAdminServer = Input.empty();
        this.crossRealmTrustKdc = Input.empty();
        this.crossRealmTrustRealm = Input.empty();
        this.crossRealmTrustSharedPassword = Input.empty();
        this.enableKerberos = Input.empty();
        this.kdcDbKey = Input.empty();
        this.keyPassword = Input.empty();
        this.keystore = Input.empty();
        this.keystorePassword = Input.empty();
        this.kmsKey = Input.empty();
        this.realm = Input.empty();
        this.rootPrincipalPassword = Input.empty();
        this.tgtLifetimeHours = Input.empty();
        this.truststore = Input.empty();
        this.truststorePassword = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> crossRealmTrustAdminServer;
        private @Nullable Input<String> crossRealmTrustKdc;
        private @Nullable Input<String> crossRealmTrustRealm;
        private @Nullable Input<String> crossRealmTrustSharedPassword;
        private @Nullable Input<Boolean> enableKerberos;
        private @Nullable Input<String> kdcDbKey;
        private @Nullable Input<String> keyPassword;
        private @Nullable Input<String> keystore;
        private @Nullable Input<String> keystorePassword;
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<String> realm;
        private @Nullable Input<String> rootPrincipalPassword;
        private @Nullable Input<Integer> tgtLifetimeHours;
        private @Nullable Input<String> truststore;
        private @Nullable Input<String> truststorePassword;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPassword = defaults.crossRealmTrustSharedPassword;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKey = defaults.kdcDbKey;
    	      this.keyPassword = defaults.keyPassword;
    	      this.keystore = defaults.keystore;
    	      this.keystorePassword = defaults.keystorePassword;
    	      this.kmsKey = defaults.kmsKey;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPassword = defaults.rootPrincipalPassword;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststore = defaults.truststore;
    	      this.truststorePassword = defaults.truststorePassword;
        }

        public Builder setCrossRealmTrustAdminServer(@Nullable Input<String> crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }

        public Builder setCrossRealmTrustAdminServer(@Nullable String crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = Input.ofNullable(crossRealmTrustAdminServer);
            return this;
        }

        public Builder setCrossRealmTrustKdc(@Nullable Input<String> crossRealmTrustKdc) {
            this.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }

        public Builder setCrossRealmTrustKdc(@Nullable String crossRealmTrustKdc) {
            this.crossRealmTrustKdc = Input.ofNullable(crossRealmTrustKdc);
            return this;
        }

        public Builder setCrossRealmTrustRealm(@Nullable Input<String> crossRealmTrustRealm) {
            this.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }

        public Builder setCrossRealmTrustRealm(@Nullable String crossRealmTrustRealm) {
            this.crossRealmTrustRealm = Input.ofNullable(crossRealmTrustRealm);
            return this;
        }

        public Builder setCrossRealmTrustSharedPassword(@Nullable Input<String> crossRealmTrustSharedPassword) {
            this.crossRealmTrustSharedPassword = crossRealmTrustSharedPassword;
            return this;
        }

        public Builder setCrossRealmTrustSharedPassword(@Nullable String crossRealmTrustSharedPassword) {
            this.crossRealmTrustSharedPassword = Input.ofNullable(crossRealmTrustSharedPassword);
            return this;
        }

        public Builder setEnableKerberos(@Nullable Input<Boolean> enableKerberos) {
            this.enableKerberos = enableKerberos;
            return this;
        }

        public Builder setEnableKerberos(@Nullable Boolean enableKerberos) {
            this.enableKerberos = Input.ofNullable(enableKerberos);
            return this;
        }

        public Builder setKdcDbKey(@Nullable Input<String> kdcDbKey) {
            this.kdcDbKey = kdcDbKey;
            return this;
        }

        public Builder setKdcDbKey(@Nullable String kdcDbKey) {
            this.kdcDbKey = Input.ofNullable(kdcDbKey);
            return this;
        }

        public Builder setKeyPassword(@Nullable Input<String> keyPassword) {
            this.keyPassword = keyPassword;
            return this;
        }

        public Builder setKeyPassword(@Nullable String keyPassword) {
            this.keyPassword = Input.ofNullable(keyPassword);
            return this;
        }

        public Builder setKeystore(@Nullable Input<String> keystore) {
            this.keystore = keystore;
            return this;
        }

        public Builder setKeystore(@Nullable String keystore) {
            this.keystore = Input.ofNullable(keystore);
            return this;
        }

        public Builder setKeystorePassword(@Nullable Input<String> keystorePassword) {
            this.keystorePassword = keystorePassword;
            return this;
        }

        public Builder setKeystorePassword(@Nullable String keystorePassword) {
            this.keystorePassword = Input.ofNullable(keystorePassword);
            return this;
        }

        public Builder setKmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder setRealm(@Nullable Input<String> realm) {
            this.realm = realm;
            return this;
        }

        public Builder setRealm(@Nullable String realm) {
            this.realm = Input.ofNullable(realm);
            return this;
        }

        public Builder setRootPrincipalPassword(@Nullable Input<String> rootPrincipalPassword) {
            this.rootPrincipalPassword = rootPrincipalPassword;
            return this;
        }

        public Builder setRootPrincipalPassword(@Nullable String rootPrincipalPassword) {
            this.rootPrincipalPassword = Input.ofNullable(rootPrincipalPassword);
            return this;
        }

        public Builder setTgtLifetimeHours(@Nullable Input<Integer> tgtLifetimeHours) {
            this.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }

        public Builder setTgtLifetimeHours(@Nullable Integer tgtLifetimeHours) {
            this.tgtLifetimeHours = Input.ofNullable(tgtLifetimeHours);
            return this;
        }

        public Builder setTruststore(@Nullable Input<String> truststore) {
            this.truststore = truststore;
            return this;
        }

        public Builder setTruststore(@Nullable String truststore) {
            this.truststore = Input.ofNullable(truststore);
            return this;
        }

        public Builder setTruststorePassword(@Nullable Input<String> truststorePassword) {
            this.truststorePassword = truststorePassword;
            return this;
        }

        public Builder setTruststorePassword(@Nullable String truststorePassword) {
            this.truststorePassword = Input.ofNullable(truststorePassword);
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs(crossRealmTrustAdminServer, crossRealmTrustKdc, crossRealmTrustRealm, crossRealmTrustSharedPassword, enableKerberos, kdcDbKey, keyPassword, keystore, keystorePassword, kmsKey, realm, rootPrincipalPassword, tgtLifetimeHours, truststore, truststorePassword);
        }
    }
}