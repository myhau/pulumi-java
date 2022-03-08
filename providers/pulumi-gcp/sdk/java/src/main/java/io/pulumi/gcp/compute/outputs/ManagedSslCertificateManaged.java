// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedSslCertificateManaged {
    /**
     * Domains for which a managed SSL certificate will be valid.  Currently,
     * there can be up to 100 domains in this list.
     * 
     */
    private final List<String> domains;

    @OutputCustomType.Constructor({"domains"})
    private ManagedSslCertificateManaged(List<String> domains) {
        this.domains = domains;
    }

    /**
     * Domains for which a managed SSL certificate will be valid.  Currently,
     * there can be up to 100 domains in this list.
     * 
    */
    public List<String> getDomains() {
        return this.domains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedSslCertificateManaged defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> domains;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedSslCertificateManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
        }

        public Builder setDomains(List<String> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }
        public ManagedSslCertificateManaged build() {
            return new ManagedSslCertificateManaged(domains);
        }
    }
}
