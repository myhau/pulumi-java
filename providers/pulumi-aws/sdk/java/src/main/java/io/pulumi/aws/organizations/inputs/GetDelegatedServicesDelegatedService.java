// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDelegatedServicesDelegatedService extends io.pulumi.resources.InvokeArgs {

    public static final GetDelegatedServicesDelegatedService Empty = new GetDelegatedServicesDelegatedService();

    /**
     * The date that the account became a delegated administrator for this service.
     * 
     */
    @InputImport(name="delegationEnabledDate", required=true)
      private final String delegationEnabledDate;

    public String getDelegationEnabledDate() {
        return this.delegationEnabledDate;
    }

    /**
     * The name of an AWS service that can request an operation for the specified service.
     * 
     */
    @InputImport(name="servicePrincipal", required=true)
      private final String servicePrincipal;

    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    public GetDelegatedServicesDelegatedService(
        String delegationEnabledDate,
        String servicePrincipal) {
        this.delegationEnabledDate = Objects.requireNonNull(delegationEnabledDate, "expected parameter 'delegationEnabledDate' to be non-null");
        this.servicePrincipal = Objects.requireNonNull(servicePrincipal, "expected parameter 'servicePrincipal' to be non-null");
    }

    private GetDelegatedServicesDelegatedService() {
        this.delegationEnabledDate = null;
        this.servicePrincipal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDelegatedServicesDelegatedService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delegationEnabledDate;
        private String servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDelegatedServicesDelegatedService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegationEnabledDate = defaults.delegationEnabledDate;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder setDelegationEnabledDate(String delegationEnabledDate) {
            this.delegationEnabledDate = Objects.requireNonNull(delegationEnabledDate);
            return this;
        }

        public Builder setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = Objects.requireNonNull(servicePrincipal);
            return this;
        }
        public GetDelegatedServicesDelegatedService build() {
            return new GetDelegatedServicesDelegatedService(delegationEnabledDate, servicePrincipal);
        }
    }
}
