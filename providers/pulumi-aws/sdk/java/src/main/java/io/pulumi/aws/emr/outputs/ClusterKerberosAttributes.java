// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterKerberosAttributes {
    /**
     * Active Directory password for `ad_domain_join_user`. This provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String adDomainJoinPassword;
    /**
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String adDomainJoinUser;
    /**
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String crossRealmTrustPrincipalPassword;
    /**
     * Password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
     * 
     */
    private final String kdcAdminPassword;
    /**
     * Name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
     * 
     */
    private final String realm;

    @OutputCustomType.Constructor({"adDomainJoinPassword","adDomainJoinUser","crossRealmTrustPrincipalPassword","kdcAdminPassword","realm"})
    private ClusterKerberosAttributes(
        @Nullable String adDomainJoinPassword,
        @Nullable String adDomainJoinUser,
        @Nullable String crossRealmTrustPrincipalPassword,
        String kdcAdminPassword,
        String realm) {
        this.adDomainJoinPassword = adDomainJoinPassword;
        this.adDomainJoinUser = adDomainJoinUser;
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
        this.kdcAdminPassword = Objects.requireNonNull(kdcAdminPassword);
        this.realm = Objects.requireNonNull(realm);
    }

    /**
     * Active Directory password for `ad_domain_join_user`. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> getAdDomainJoinPassword() {
        return Optional.ofNullable(this.adDomainJoinPassword);
    }
    /**
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> getAdDomainJoinUser() {
        return Optional.ofNullable(this.adDomainJoinUser);
    }
    /**
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> getCrossRealmTrustPrincipalPassword() {
        return Optional.ofNullable(this.crossRealmTrustPrincipalPassword);
    }
    /**
     * Password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
     * 
     */
    public String getKdcAdminPassword() {
        return this.kdcAdminPassword;
    }
    /**
     * Name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
     * 
     */
    public String getRealm() {
        return this.realm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKerberosAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adDomainJoinPassword;
        private @Nullable String adDomainJoinUser;
        private @Nullable String crossRealmTrustPrincipalPassword;
        private String kdcAdminPassword;
        private String realm;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKerberosAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adDomainJoinPassword = defaults.adDomainJoinPassword;
    	      this.adDomainJoinUser = defaults.adDomainJoinUser;
    	      this.crossRealmTrustPrincipalPassword = defaults.crossRealmTrustPrincipalPassword;
    	      this.kdcAdminPassword = defaults.kdcAdminPassword;
    	      this.realm = defaults.realm;
        }

        public Builder setAdDomainJoinPassword(@Nullable String adDomainJoinPassword) {
            this.adDomainJoinPassword = adDomainJoinPassword;
            return this;
        }

        public Builder setAdDomainJoinUser(@Nullable String adDomainJoinUser) {
            this.adDomainJoinUser = adDomainJoinUser;
            return this;
        }

        public Builder setCrossRealmTrustPrincipalPassword(@Nullable String crossRealmTrustPrincipalPassword) {
            this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
            return this;
        }

        public Builder setKdcAdminPassword(String kdcAdminPassword) {
            this.kdcAdminPassword = Objects.requireNonNull(kdcAdminPassword);
            return this;
        }

        public Builder setRealm(String realm) {
            this.realm = Objects.requireNonNull(realm);
            return this;
        }
        public ClusterKerberosAttributes build() {
            return new ClusterKerberosAttributes(adDomainJoinPassword, adDomainJoinUser, crossRealmTrustPrincipalPassword, kdcAdminPassword, realm);
        }
    }
}
