// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AuditLogConfigResponse {
    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    private final List<String> exemptedMembers;
    /**
     * The log type that this config enables.
     * 
     */
    private final String logType;

    @OutputCustomType.Constructor({"exemptedMembers","logType"})
    private AuditLogConfigResponse(
        List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
    */
    public List<String> getExemptedMembers() {
        return this.exemptedMembers;
    }
    /**
     * The log type that this config enables.
     * 
    */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public AuditLogConfigResponse build() {
            return new AuditLogConfigResponse(exemptedMembers, logType);
        }
    }
}
