// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyAssociationResponse {
    /**
     * The resource that the security policy is attached to.
     * 
     */
    private final String attachmentId;
    /**
     * The display name of the security policy of the association.
     * 
     */
    private final String displayName;
    /**
     * The name for an association.
     * 
     */
    private final String name;
    /**
     * The security policy ID of the association.
     * 
     */
    private final String securityPolicyId;

    @OutputCustomType.Constructor
    private SecurityPolicyAssociationResponse(
        @OutputCustomType.Parameter("attachmentId") String attachmentId,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("securityPolicyId") String securityPolicyId) {
        this.attachmentId = attachmentId;
        this.displayName = displayName;
        this.name = name;
        this.securityPolicyId = securityPolicyId;
    }

    /**
     * The resource that the security policy is attached to.
     * 
    */
    public String getAttachmentId() {
        return this.attachmentId;
    }
    /**
     * The display name of the security policy of the association.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The name for an association.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The security policy ID of the association.
     * 
    */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachmentId;
        private String displayName;
        private String name;
        private String securityPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAssociationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        public Builder setAttachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = Objects.requireNonNull(securityPolicyId);
            return this;
        }
        public SecurityPolicyAssociationResponse build() {
            return new SecurityPolicyAssociationResponse(attachmentId, displayName, name, securityPolicyId);
        }
    }
}
