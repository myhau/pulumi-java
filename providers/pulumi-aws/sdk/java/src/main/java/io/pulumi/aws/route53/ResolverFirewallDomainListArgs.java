// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverFirewallDomainListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverFirewallDomainListArgs Empty = new ResolverFirewallDomainListArgs();

    /**
     * A array of domains for the firewall domain list.
     * 
     */
    @InputImport(name="domains")
      private final @Nullable Input<List<String>> domains;

    public Input<List<String>> getDomains() {
        return this.domains == null ? Input.empty() : this.domains;
    }

    /**
     * A name that lets you identify the domain list, to manage and use it.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ResolverFirewallDomainListArgs(
        @Nullable Input<List<String>> domains,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.domains = domains;
        this.name = name;
        this.tags = tags;
    }

    private ResolverFirewallDomainListArgs() {
        this.domains = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverFirewallDomainListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> domains;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverFirewallDomainListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setDomains(@Nullable Input<List<String>> domains) {
            this.domains = domains;
            return this;
        }

        public Builder setDomains(@Nullable List<String> domains) {
            this.domains = Input.ofNullable(domains);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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
        public ResolverFirewallDomainListArgs build() {
            return new ResolverFirewallDomainListArgs(domains, name, tags);
        }
    }
}
