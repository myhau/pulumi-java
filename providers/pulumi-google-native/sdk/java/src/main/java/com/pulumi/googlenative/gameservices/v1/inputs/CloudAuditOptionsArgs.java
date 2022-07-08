// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices.v1.enums.CloudAuditOptionsLogName;
import com.pulumi.googlenative.gameservices.v1.inputs.AuthorizationLoggingOptionsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Write a Cloud Audit log
 * 
 */
public final class CloudAuditOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudAuditOptionsArgs Empty = new CloudAuditOptionsArgs();

    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
     */
    @Import(name="authorizationLoggingOptions")
    private @Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;

    /**
     * @return Information used by the Cloud Audit Logging pipeline.
     * 
     */
    public Optional<Output<AuthorizationLoggingOptionsArgs>> authorizationLoggingOptions() {
        return Optional.ofNullable(this.authorizationLoggingOptions);
    }

    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    @Import(name="logName")
    private @Nullable Output<CloudAuditOptionsLogName> logName;

    /**
     * @return The log_name to populate in the Cloud Audit Record.
     * 
     */
    public Optional<Output<CloudAuditOptionsLogName>> logName() {
        return Optional.ofNullable(this.logName);
    }

    private CloudAuditOptionsArgs() {}

    private CloudAuditOptionsArgs(CloudAuditOptionsArgs $) {
        this.authorizationLoggingOptions = $.authorizationLoggingOptions;
        this.logName = $.logName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudAuditOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAuditOptionsArgs $;

        public Builder() {
            $ = new CloudAuditOptionsArgs();
        }

        public Builder(CloudAuditOptionsArgs defaults) {
            $ = new CloudAuditOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationLoggingOptions Information used by the Cloud Audit Logging pipeline.
         * 
         * @return builder
         * 
         */
        public Builder authorizationLoggingOptions(@Nullable Output<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions) {
            $.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }

        /**
         * @param authorizationLoggingOptions Information used by the Cloud Audit Logging pipeline.
         * 
         * @return builder
         * 
         */
        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsArgs authorizationLoggingOptions) {
            return authorizationLoggingOptions(Output.of(authorizationLoggingOptions));
        }

        /**
         * @param logName The log_name to populate in the Cloud Audit Record.
         * 
         * @return builder
         * 
         */
        public Builder logName(@Nullable Output<CloudAuditOptionsLogName> logName) {
            $.logName = logName;
            return this;
        }

        /**
         * @param logName The log_name to populate in the Cloud Audit Record.
         * 
         * @return builder
         * 
         */
        public Builder logName(CloudAuditOptionsLogName logName) {
            return logName(Output.of(logName));
        }

        public CloudAuditOptionsArgs build() {
            return $;
        }
    }

}
