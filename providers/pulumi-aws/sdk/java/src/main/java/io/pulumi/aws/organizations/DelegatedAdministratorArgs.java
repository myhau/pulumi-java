// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DelegatedAdministratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelegatedAdministratorArgs Empty = new DelegatedAdministratorArgs();

    /**
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * 
     */
    @InputImport(name="accountId", required=true)
      private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    /**
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * 
     */
    @InputImport(name="servicePrincipal", required=true)
      private final Input<String> servicePrincipal;

    public Input<String> getServicePrincipal() {
        return this.servicePrincipal;
    }

    public DelegatedAdministratorArgs(
        Input<String> accountId,
        Input<String> servicePrincipal) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.servicePrincipal = Objects.requireNonNull(servicePrincipal, "expected parameter 'servicePrincipal' to be non-null");
    }

    private DelegatedAdministratorArgs() {
        this.accountId = Input.empty();
        this.servicePrincipal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelegatedAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private Input<String> servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(DelegatedAdministratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setServicePrincipal(Input<String> servicePrincipal) {
            this.servicePrincipal = Objects.requireNonNull(servicePrincipal);
            return this;
        }

        public Builder setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = Input.of(Objects.requireNonNull(servicePrincipal));
            return this;
        }
        public DelegatedAdministratorArgs build() {
            return new DelegatedAdministratorArgs(accountId, servicePrincipal);
        }
    }
}
