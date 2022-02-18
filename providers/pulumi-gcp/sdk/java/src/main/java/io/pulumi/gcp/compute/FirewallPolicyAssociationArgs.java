// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyAssociationArgs Empty = new FirewallPolicyAssociationArgs();

    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @InputImport(name="attachmentTarget", required=true)
    private final Input<String> attachmentTarget;

    public Input<String> getAttachmentTarget() {
        return this.attachmentTarget;
    }

    /**
     * The firewall policy ID of the association.
     * 
     */
    @InputImport(name="firewallPolicy", required=true)
    private final Input<String> firewallPolicy;

    public Input<String> getFirewallPolicy() {
        return this.firewallPolicy;
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

    public FirewallPolicyAssociationArgs(
        Input<String> attachmentTarget,
        Input<String> firewallPolicy,
        @Nullable Input<String> name) {
        this.attachmentTarget = Objects.requireNonNull(attachmentTarget, "expected parameter 'attachmentTarget' to be non-null");
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
        this.name = name;
    }

    private FirewallPolicyAssociationArgs() {
        this.attachmentTarget = Input.empty();
        this.firewallPolicy = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attachmentTarget;
        private Input<String> firewallPolicy;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentTarget = defaults.attachmentTarget;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.name = defaults.name;
        }

        public Builder setAttachmentTarget(Input<String> attachmentTarget) {
            this.attachmentTarget = Objects.requireNonNull(attachmentTarget);
            return this;
        }

        public Builder setAttachmentTarget(String attachmentTarget) {
            this.attachmentTarget = Input.of(Objects.requireNonNull(attachmentTarget));
            return this;
        }

        public Builder setFirewallPolicy(Input<String> firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }

        public Builder setFirewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Input.of(Objects.requireNonNull(firewallPolicy));
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

        public FirewallPolicyAssociationArgs build() {
            return new FirewallPolicyAssociationArgs(attachmentTarget, firewallPolicy, name);
        }
    }
}
