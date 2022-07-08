// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigateway.v1.outputs.ApigatewayAuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApigatewayAuditConfigResponse {
    /**
     * @return The configuration for logging of each type of permission.
     * 
     */
    private final List<ApigatewayAuditLogConfigResponse> auditLogConfigs;
    /**
     * @return Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private ApigatewayAuditConfigResponse(
        @CustomType.Parameter("auditLogConfigs") List<ApigatewayAuditLogConfigResponse> auditLogConfigs,
        @CustomType.Parameter("service") String service) {
        this.auditLogConfigs = auditLogConfigs;
        this.service = service;
    }

    /**
     * @return The configuration for logging of each type of permission.
     * 
     */
    public List<ApigatewayAuditLogConfigResponse> auditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * @return Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayAuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApigatewayAuditLogConfigResponse> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayAuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(List<ApigatewayAuditLogConfigResponse> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(ApigatewayAuditLogConfigResponse... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public ApigatewayAuditConfigResponse build() {
            return new ApigatewayAuditConfigResponse(auditLogConfigs, service);
        }
    }
}
