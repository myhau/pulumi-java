// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ids.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ids.v1.inputs.AuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { &#34;audit_configs&#34;: [ { &#34;service&#34;: &#34;allServices&#34;, &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; }, { &#34;log_type&#34;: &#34;ADMIN_READ&#34; } ] }, { &#34;service&#34;: &#34;sampleservice.googleapis.com&#34;, &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34; }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34;, &#34;exempted_members&#34;: [ &#34;user:aliya@example.com&#34; ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts `jose@example.com` from DATA_READ logging, and `aliya@example.com` from DATA_WRITE logging.
 * 
 */
public final class AuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuditConfigArgs Empty = new AuditConfigArgs();

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    @Import(name="auditLogConfigs")
    private @Nullable Output<List<AuditLogConfigArgs>> auditLogConfigs;

    /**
     * @return The configuration for logging of each type of permission.
     * 
     */
    public Optional<Output<List<AuditLogConfigArgs>>> auditLogConfigs() {
        return Optional.ofNullable(this.auditLogConfigs);
    }

    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private AuditConfigArgs() {}

    private AuditConfigArgs(AuditConfigArgs $) {
        this.auditLogConfigs = $.auditLogConfigs;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuditConfigArgs $;

        public Builder() {
            $ = new AuditConfigArgs();
        }

        public Builder(AuditConfigArgs defaults) {
            $ = new AuditConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(@Nullable Output<List<AuditLogConfigArgs>> auditLogConfigs) {
            $.auditLogConfigs = auditLogConfigs;
            return this;
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(List<AuditLogConfigArgs> auditLogConfigs) {
            return auditLogConfigs(Output.of(auditLogConfigs));
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(AuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }

        /**
         * @param service Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public AuditConfigArgs build() {
            return $;
        }
    }

}
