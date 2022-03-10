// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.TlsContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServerTlsSettingsResponse {
    /**
     * Configures the mechanism to obtain security certificates and identity information.
     * 
     */
    private final TlsContextResponse proxyTlsContext;
    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     * 
     */
    private final List<String> subjectAltNames;
    /**
     * Indicates whether connections should be secured using TLS. The value of this field determines how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    private final String tlsMode;

    @OutputCustomType.Constructor
    private ServerTlsSettingsResponse(
        @OutputCustomType.Parameter("proxyTlsContext") TlsContextResponse proxyTlsContext,
        @OutputCustomType.Parameter("subjectAltNames") List<String> subjectAltNames,
        @OutputCustomType.Parameter("tlsMode") String tlsMode) {
        this.proxyTlsContext = proxyTlsContext;
        this.subjectAltNames = subjectAltNames;
        this.tlsMode = tlsMode;
    }

    /**
     * Configures the mechanism to obtain security certificates and identity information.
     * 
    */
    public TlsContextResponse getProxyTlsContext() {
        return this.proxyTlsContext;
    }
    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     * 
    */
    public List<String> getSubjectAltNames() {
        return this.subjectAltNames;
    }
    /**
     * Indicates whether connections should be secured using TLS. The value of this field determines how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
    */
    public String getTlsMode() {
        return this.tlsMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTlsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsContextResponse proxyTlsContext;
        private List<String> subjectAltNames;
        private String tlsMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerTlsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyTlsContext = defaults.proxyTlsContext;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.tlsMode = defaults.tlsMode;
        }

        public Builder setProxyTlsContext(TlsContextResponse proxyTlsContext) {
            this.proxyTlsContext = Objects.requireNonNull(proxyTlsContext);
            return this;
        }

        public Builder setSubjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }

        public Builder setTlsMode(String tlsMode) {
            this.tlsMode = Objects.requireNonNull(tlsMode);
            return this;
        }
        public ServerTlsSettingsResponse build() {
            return new ServerTlsSettingsResponse(proxyTlsContext, subjectAltNames, tlsMode);
        }
    }
}
