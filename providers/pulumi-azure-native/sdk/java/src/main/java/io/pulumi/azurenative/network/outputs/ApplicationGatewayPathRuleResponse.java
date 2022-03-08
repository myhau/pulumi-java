// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayPathRuleResponse {
    /**
     * Backend address pool resource of URL path map path rule.
     * 
     */
    private final @Nullable SubResourceResponse backendAddressPool;
    /**
     * Backend http settings resource of URL path map path rule.
     * 
     */
    private final @Nullable SubResourceResponse backendHttpSettings;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Reference to the FirewallPolicy resource.
     * 
     */
    private final @Nullable SubResourceResponse firewallPolicy;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the path rule that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Path rules of URL path map.
     * 
     */
    private final @Nullable List<String> paths;
    /**
     * The provisioning state of the path rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * Redirect configuration resource of URL path map path rule.
     * 
     */
    private final @Nullable SubResourceResponse redirectConfiguration;
    /**
     * Rewrite rule set resource of URL path map path rule.
     * 
     */
    private final @Nullable SubResourceResponse rewriteRuleSet;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"backendAddressPool","backendHttpSettings","etag","firewallPolicy","id","name","paths","provisioningState","redirectConfiguration","rewriteRuleSet","type"})
    private ApplicationGatewayPathRuleResponse(
        @Nullable SubResourceResponse backendAddressPool,
        @Nullable SubResourceResponse backendHttpSettings,
        String etag,
        @Nullable SubResourceResponse firewallPolicy,
        @Nullable String id,
        @Nullable String name,
        @Nullable List<String> paths,
        String provisioningState,
        @Nullable SubResourceResponse redirectConfiguration,
        @Nullable SubResourceResponse rewriteRuleSet,
        String type) {
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.etag = etag;
        this.firewallPolicy = firewallPolicy;
        this.id = id;
        this.name = name;
        this.paths = paths;
        this.provisioningState = provisioningState;
        this.redirectConfiguration = redirectConfiguration;
        this.rewriteRuleSet = rewriteRuleSet;
        this.type = type;
    }

    /**
     * Backend address pool resource of URL path map path rule.
     * 
    */
    public Optional<SubResourceResponse> getBackendAddressPool() {
        return Optional.ofNullable(this.backendAddressPool);
    }
    /**
     * Backend http settings resource of URL path map path rule.
     * 
    */
    public Optional<SubResourceResponse> getBackendHttpSettings() {
        return Optional.ofNullable(this.backendHttpSettings);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Reference to the FirewallPolicy resource.
     * 
    */
    public Optional<SubResourceResponse> getFirewallPolicy() {
        return Optional.ofNullable(this.firewallPolicy);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the path rule that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Path rules of URL path map.
     * 
    */
    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * The provisioning state of the path rule resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Redirect configuration resource of URL path map path rule.
     * 
    */
    public Optional<SubResourceResponse> getRedirectConfiguration() {
        return Optional.ofNullable(this.redirectConfiguration);
    }
    /**
     * Rewrite rule set resource of URL path map path rule.
     * 
    */
    public Optional<SubResourceResponse> getRewriteRuleSet() {
        return Optional.ofNullable(this.rewriteRuleSet);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPathRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable SubResourceResponse backendHttpSettings;
        private String etag;
        private @Nullable SubResourceResponse firewallPolicy;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<String> paths;
        private String provisioningState;
        private @Nullable SubResourceResponse redirectConfiguration;
        private @Nullable SubResourceResponse rewriteRuleSet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayPathRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.etag = defaults.etag;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.paths = defaults.paths;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redirectConfiguration = defaults.redirectConfiguration;
    	      this.rewriteRuleSet = defaults.rewriteRuleSet;
    	      this.type = defaults.type;
        }

        public Builder setBackendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder setBackendHttpSettings(@Nullable SubResourceResponse backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFirewallPolicy(@Nullable SubResourceResponse firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPaths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedirectConfiguration(@Nullable SubResourceResponse redirectConfiguration) {
            this.redirectConfiguration = redirectConfiguration;
            return this;
        }

        public Builder setRewriteRuleSet(@Nullable SubResourceResponse rewriteRuleSet) {
            this.rewriteRuleSet = rewriteRuleSet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayPathRuleResponse build() {
            return new ApplicationGatewayPathRuleResponse(backendAddressPool, backendHttpSettings, etag, firewallPolicy, id, name, paths, provisioningState, redirectConfiguration, rewriteRuleSet, type);
        }
    }
}
