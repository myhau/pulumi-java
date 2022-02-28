// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcDhcpOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcDhcpOptionsArgs Empty = new VpcDhcpOptionsArgs();

    /**
     * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
     * 
     */
    @InputImport(name="domainNameServers")
      private final @Nullable Input<List<String>> domainNameServers;

    public Input<List<String>> getDomainNameServers() {
        return this.domainNameServers == null ? Input.empty() : this.domainNameServers;
    }

    /**
     * List of NETBIOS name servers.
     * 
     */
    @InputImport(name="netbiosNameServers")
      private final @Nullable Input<List<String>> netbiosNameServers;

    public Input<List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers == null ? Input.empty() : this.netbiosNameServers;
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    @InputImport(name="netbiosNodeType")
      private final @Nullable Input<String> netbiosNodeType;

    public Input<String> getNetbiosNodeType() {
        return this.netbiosNodeType == null ? Input.empty() : this.netbiosNodeType;
    }

    /**
     * List of NTP servers to configure.
     * 
     */
    @InputImport(name="ntpServers")
      private final @Nullable Input<List<String>> ntpServers;

    public Input<List<String>> getNtpServers() {
        return this.ntpServers == null ? Input.empty() : this.ntpServers;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public VpcDhcpOptionsArgs(
        @Nullable Input<String> domainName,
        @Nullable Input<List<String>> domainNameServers,
        @Nullable Input<List<String>> netbiosNameServers,
        @Nullable Input<String> netbiosNodeType,
        @Nullable Input<List<String>> ntpServers,
        @Nullable Input<Map<String,String>> tags) {
        this.domainName = domainName;
        this.domainNameServers = domainNameServers;
        this.netbiosNameServers = netbiosNameServers;
        this.netbiosNodeType = netbiosNodeType;
        this.ntpServers = ntpServers;
        this.tags = tags;
    }

    private VpcDhcpOptionsArgs() {
        this.domainName = Input.empty();
        this.domainNameServers = Input.empty();
        this.netbiosNameServers = Input.empty();
        this.netbiosNodeType = Input.empty();
        this.ntpServers = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcDhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private @Nullable Input<List<String>> domainNameServers;
        private @Nullable Input<List<String>> netbiosNameServers;
        private @Nullable Input<String> netbiosNodeType;
        private @Nullable Input<List<String>> ntpServers;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcDhcpOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ntpServers = defaults.ntpServers;
    	      this.tags = defaults.tags;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setDomainNameServers(@Nullable Input<List<String>> domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }

        public Builder setDomainNameServers(@Nullable List<String> domainNameServers) {
            this.domainNameServers = Input.ofNullable(domainNameServers);
            return this;
        }

        public Builder setNetbiosNameServers(@Nullable Input<List<String>> netbiosNameServers) {
            this.netbiosNameServers = netbiosNameServers;
            return this;
        }

        public Builder setNetbiosNameServers(@Nullable List<String> netbiosNameServers) {
            this.netbiosNameServers = Input.ofNullable(netbiosNameServers);
            return this;
        }

        public Builder setNetbiosNodeType(@Nullable Input<String> netbiosNodeType) {
            this.netbiosNodeType = netbiosNodeType;
            return this;
        }

        public Builder setNetbiosNodeType(@Nullable String netbiosNodeType) {
            this.netbiosNodeType = Input.ofNullable(netbiosNodeType);
            return this;
        }

        public Builder setNtpServers(@Nullable Input<List<String>> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }

        public Builder setNtpServers(@Nullable List<String> ntpServers) {
            this.ntpServers = Input.ofNullable(ntpServers);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public VpcDhcpOptionsArgs build() {
            return new VpcDhcpOptionsArgs(domainName, domainNameServers, netbiosNameServers, netbiosNodeType, ntpServers, tags);
        }
    }
}
