// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsFileSystemSelfManagedActiveDirectory {
    /**
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     * 
     */
    private final List<String> dnsIps;
    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    private final String domainName;
    /**
     * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    private final @Nullable String fileSystemAdministratorsGroup;
    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    private final @Nullable String organizationalUnitDistinguishedName;
    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    private final String password;
    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"dnsIps","domainName","fileSystemAdministratorsGroup","organizationalUnitDistinguishedName","password","username"})
    private WindowsFileSystemSelfManagedActiveDirectory(
        List<String> dnsIps,
        String domainName,
        @Nullable String fileSystemAdministratorsGroup,
        @Nullable String organizationalUnitDistinguishedName,
        String password,
        String username) {
        this.dnsIps = Objects.requireNonNull(dnsIps);
        this.domainName = Objects.requireNonNull(domainName);
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     * 
     */
    public List<String> getDnsIps() {
        return this.dnsIps;
    }
    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    public Optional<String> getFileSystemAdministratorsGroup() {
        return Optional.ofNullable(this.fileSystemAdministratorsGroup);
    }
    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    public Optional<String> getOrganizationalUnitDistinguishedName() {
        return Optional.ofNullable(this.organizationalUnitDistinguishedName);
    }
    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFileSystemSelfManagedActiveDirectory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dnsIps;
        private String domainName;
        private @Nullable String fileSystemAdministratorsGroup;
        private @Nullable String organizationalUnitDistinguishedName;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFileSystemSelfManagedActiveDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsIps = defaults.dnsIps;
    	      this.domainName = defaults.domainName;
    	      this.fileSystemAdministratorsGroup = defaults.fileSystemAdministratorsGroup;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setDnsIps(List<String> dnsIps) {
            this.dnsIps = Objects.requireNonNull(dnsIps);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setFileSystemAdministratorsGroup(@Nullable String fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public WindowsFileSystemSelfManagedActiveDirectory build() {
            return new WindowsFileSystemSelfManagedActiveDirectory(dnsIps, domainName, fileSystemAdministratorsGroup, organizationalUnitDistinguishedName, password, username);
        }
    }
}
