// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class IamAuditConfigAuditLogConfig {
    /**
     * Identities that do not cause logging for this type of permission.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    private final @Nullable List<String> exemptedMembers;
    /**
     * Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
     * 
     */
    private final String logType;

    @OutputCustomType.Constructor({"exemptedMembers","logType"})
    private IamAuditConfigAuditLogConfig(
        @Nullable List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = Objects.requireNonNull(logType);
    }

    /**
     * Identities that do not cause logging for this type of permission.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    public List<String> getExemptedMembers() {
        return this.exemptedMembers == null ? List.of() : this.exemptedMembers;
    }
    /**
     * Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
     * 
     */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigAuditLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigAuditLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public IamAuditConfigAuditLogConfig build() {
            return new IamAuditConfigAuditLogConfig(exemptedMembers, logType);
        }
    }
}
