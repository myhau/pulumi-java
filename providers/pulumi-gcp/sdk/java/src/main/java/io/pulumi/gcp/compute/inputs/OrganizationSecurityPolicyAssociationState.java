// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyAssociationState Empty = new OrganizationSecurityPolicyAssociationState();

    /**
     * The resource that the security policy is attached to.
     * 
     */
    @InputImport(name="attachmentId")
    private final @Nullable Input<String> attachmentId;

    public Input<String> getAttachmentId() {
        return this.attachmentId == null ? Input.empty() : this.attachmentId;
    }

    /**
     * The display name of the security policy of the association.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name for an association.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The security policy ID of the association.
     * 
     */
    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    public OrganizationSecurityPolicyAssociationState(
        @Nullable Input<String> attachmentId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> policyId) {
        this.attachmentId = attachmentId;
        this.displayName = displayName;
        this.name = name;
        this.policyId = policyId;
    }

    private OrganizationSecurityPolicyAssociationState() {
        this.attachmentId = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.policyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attachmentId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> policyId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.policyId = defaults.policyId;
        }

        public Builder setAttachmentId(@Nullable Input<String> attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }

        public Builder setAttachmentId(@Nullable String attachmentId) {
            this.attachmentId = Input.ofNullable(attachmentId);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
            return this;
        }

        public OrganizationSecurityPolicyAssociationState build() {
            return new OrganizationSecurityPolicyAssociationState(attachmentId, displayName, name, policyId);
        }
    }
}
