// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayCustomErrorResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Http listener of an application gateway.
 * 
 */
public final class ApplicationGatewayHttpListenerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayHttpListenerResponse Empty = new ApplicationGatewayHttpListenerResponse();

    /**
     * Custom error configurations of the HTTP listener.
     * 
     */
    @Import(name="customErrorConfigurations")
      private final @Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations;

    public List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations() {
        return this.customErrorConfigurations == null ? List.of() : this.customErrorConfigurations;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Reference to the FirewallPolicy resource.
     * 
     */
    @Import(name="firewallPolicy")
      private final @Nullable SubResourceResponse firewallPolicy;

    public Optional<SubResourceResponse> firewallPolicy() {
        return this.firewallPolicy == null ? Optional.empty() : Optional.ofNullable(this.firewallPolicy);
    }

    /**
     * Frontend IP configuration resource of an application gateway.
     * 
     */
    @Import(name="frontendIPConfiguration")
      private final @Nullable SubResourceResponse frontendIPConfiguration;

    public Optional<SubResourceResponse> frontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Optional.empty() : Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * Frontend port resource of an application gateway.
     * 
     */
    @Import(name="frontendPort")
      private final @Nullable SubResourceResponse frontendPort;

    public Optional<SubResourceResponse> frontendPort() {
        return this.frontendPort == null ? Optional.empty() : Optional.ofNullable(this.frontendPort);
    }

    /**
     * Host name of HTTP listener.
     * 
     */
    @Import(name="hostName")
      private final @Nullable String hostName;

    public Optional<String> hostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    /**
     * List of Host names for HTTP Listener that allows special wildcard characters as well.
     * 
     */
    @Import(name="hostNames")
      private final @Nullable List<String> hostNames;

    public List<String> hostNames() {
        return this.hostNames == null ? List.of() : this.hostNames;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the HTTP listener that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Protocol of the HTTP listener.
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> protocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * The provisioning state of the HTTP listener resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     * 
     */
    @Import(name="requireServerNameIndication")
      private final @Nullable Boolean requireServerNameIndication;

    public Optional<Boolean> requireServerNameIndication() {
        return this.requireServerNameIndication == null ? Optional.empty() : Optional.ofNullable(this.requireServerNameIndication);
    }

    /**
     * SSL certificate resource of an application gateway.
     * 
     */
    @Import(name="sslCertificate")
      private final @Nullable SubResourceResponse sslCertificate;

    public Optional<SubResourceResponse> sslCertificate() {
        return this.sslCertificate == null ? Optional.empty() : Optional.ofNullable(this.sslCertificate);
    }

    /**
     * SSL profile resource of the application gateway.
     * 
     */
    @Import(name="sslProfile")
      private final @Nullable SubResourceResponse sslProfile;

    public Optional<SubResourceResponse> sslProfile() {
        return this.sslProfile == null ? Optional.empty() : Optional.ofNullable(this.sslProfile);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ApplicationGatewayHttpListenerResponse(
        @Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations,
        String etag,
        @Nullable SubResourceResponse firewallPolicy,
        @Nullable SubResourceResponse frontendIPConfiguration,
        @Nullable SubResourceResponse frontendPort,
        @Nullable String hostName,
        @Nullable List<String> hostNames,
        @Nullable String id,
        @Nullable String name,
        @Nullable String protocol,
        String provisioningState,
        @Nullable Boolean requireServerNameIndication,
        @Nullable SubResourceResponse sslCertificate,
        @Nullable SubResourceResponse sslProfile,
        String type) {
        this.customErrorConfigurations = customErrorConfigurations;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.firewallPolicy = firewallPolicy;
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = frontendPort;
        this.hostName = hostName;
        this.hostNames = hostNames;
        this.id = id;
        this.name = name;
        this.protocol = protocol;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.requireServerNameIndication = requireServerNameIndication;
        this.sslCertificate = sslCertificate;
        this.sslProfile = sslProfile;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayHttpListenerResponse() {
        this.customErrorConfigurations = List.of();
        this.etag = null;
        this.firewallPolicy = null;
        this.frontendIPConfiguration = null;
        this.frontendPort = null;
        this.hostName = null;
        this.hostNames = List.of();
        this.id = null;
        this.name = null;
        this.protocol = null;
        this.provisioningState = null;
        this.requireServerNameIndication = null;
        this.sslCertificate = null;
        this.sslProfile = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayHttpListenerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations;
        private String etag;
        private @Nullable SubResourceResponse firewallPolicy;
        private @Nullable SubResourceResponse frontendIPConfiguration;
        private @Nullable SubResourceResponse frontendPort;
        private @Nullable String hostName;
        private @Nullable List<String> hostNames;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String protocol;
        private String provisioningState;
        private @Nullable Boolean requireServerNameIndication;
        private @Nullable SubResourceResponse sslCertificate;
        private @Nullable SubResourceResponse sslProfile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayHttpListenerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customErrorConfigurations = defaults.customErrorConfigurations;
    	      this.etag = defaults.etag;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.hostName = defaults.hostName;
    	      this.hostNames = defaults.hostNames;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requireServerNameIndication = defaults.requireServerNameIndication;
    	      this.sslCertificate = defaults.sslCertificate;
    	      this.sslProfile = defaults.sslProfile;
    	      this.type = defaults.type;
        }

        public Builder customErrorConfigurations(@Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations) {
            this.customErrorConfigurations = customErrorConfigurations;
            return this;
        }
        public Builder customErrorConfigurations(ApplicationGatewayCustomErrorResponse... customErrorConfigurations) {
            return customErrorConfigurations(List.of(customErrorConfigurations));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder firewallPolicy(@Nullable SubResourceResponse firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }
        public Builder frontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }
        public Builder frontendPort(@Nullable SubResourceResponse frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder hostNames(@Nullable List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder requireServerNameIndication(@Nullable Boolean requireServerNameIndication) {
            this.requireServerNameIndication = requireServerNameIndication;
            return this;
        }
        public Builder sslCertificate(@Nullable SubResourceResponse sslCertificate) {
            this.sslCertificate = sslCertificate;
            return this;
        }
        public Builder sslProfile(@Nullable SubResourceResponse sslProfile) {
            this.sslProfile = sslProfile;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ApplicationGatewayHttpListenerResponse build() {
            return new ApplicationGatewayHttpListenerResponse(customErrorConfigurations, etag, firewallPolicy, frontendIPConfiguration, frontendPort, hostName, hostNames, id, name, protocol, provisioningState, requireServerNameIndication, sslCertificate, sslProfile, type);
        }
    }
}
