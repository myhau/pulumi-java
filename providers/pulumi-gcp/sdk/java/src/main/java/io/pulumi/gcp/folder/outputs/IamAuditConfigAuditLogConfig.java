// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class IamAuditConfigAuditLogConfig {
    private final @Nullable List<String> exemptedMembers;
    private final String logType;

    @OutputCustomType.Constructor({"exemptedMembers","logType"})
    private IamAuditConfigAuditLogConfig(
        @Nullable List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    public List<String> getExemptedMembers() {
        return this.exemptedMembers == null ? List.of() : this.exemptedMembers;
    }
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
