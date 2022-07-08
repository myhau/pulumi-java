// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.GoogleIamV1AuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleIamV1AuditConfigResponse {
    /**
     * @return The configuration for logging of each type of permission.
     * 
     */
    private final List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs;
    /**
     * @return Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private GoogleIamV1AuditConfigResponse(
        @CustomType.Parameter("auditLogConfigs") List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs,
        @CustomType.Parameter("service") String service) {
        this.auditLogConfigs = auditLogConfigs;
        this.service = service;
    }

    /**
     * @return The configuration for logging of each type of permission.
     * 
     */
    public List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs() {
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

    public static Builder builder(GoogleIamV1AuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleIamV1AuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(GoogleIamV1AuditLogConfigResponse... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GoogleIamV1AuditConfigResponse build() {
            return new GoogleIamV1AuditConfigResponse(auditLogConfigs, service);
        }
    }
}
