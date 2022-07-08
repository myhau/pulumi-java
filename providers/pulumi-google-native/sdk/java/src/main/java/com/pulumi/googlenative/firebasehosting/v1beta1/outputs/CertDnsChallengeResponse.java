// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertDnsChallengeResponse {
    /**
     * @return The domain name upon which the DNS challenge must be satisfied.
     * 
     */
    private final String domainName;
    /**
     * @return The value that must be present as a TXT record on the domain name to satisfy the challenge.
     * 
     */
    private final String token;

    @CustomType.Constructor
    private CertDnsChallengeResponse(
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("token") String token) {
        this.domainName = domainName;
        this.token = token;
    }

    /**
     * @return The domain name upon which the DNS challenge must be satisfied.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The value that must be present as a TXT record on the domain name to satisfy the challenge.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertDnsChallengeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(CertDnsChallengeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.token = defaults.token;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public CertDnsChallengeResponse build() {
            return new CertDnsChallengeResponse(domainName, token);
        }
    }
}
