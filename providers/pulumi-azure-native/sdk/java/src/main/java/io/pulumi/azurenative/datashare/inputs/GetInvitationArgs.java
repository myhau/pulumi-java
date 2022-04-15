// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInvitationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInvitationArgs Empty = new GetInvitationArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the invitation.
     * 
     */
    @Import(name="invitationName", required=true)
      private final String invitationName;

    public String invitationName() {
        return this.invitationName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
      private final String shareName;

    public String shareName() {
        return this.shareName;
    }

    public GetInvitationArgs(
        String accountName,
        String invitationName,
        String resourceGroupName,
        String shareName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.invitationName = Objects.requireNonNull(invitationName, "expected parameter 'invitationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private GetInvitationArgs() {
        this.accountName = null;
        this.invitationName = null;
        this.resourceGroupName = null;
        this.shareName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String invitationName;
        private String resourceGroupName;
        private String shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvitationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.invitationName = defaults.invitationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder invitationName(String invitationName) {
            this.invitationName = Objects.requireNonNull(invitationName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }        public GetInvitationArgs build() {
            return new GetInvitationArgs(accountName, invitationName, resourceGroupName, shareName);
        }
    }
}
