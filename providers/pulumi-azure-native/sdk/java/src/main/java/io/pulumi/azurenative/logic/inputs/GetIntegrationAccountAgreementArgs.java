// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountAgreementArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountAgreementArgs Empty = new GetIntegrationAccountAgreementArgs();

    /**
     * The integration account agreement name.
     * 
     */
    @Import(name="agreementName", required=true)
      private final String agreementName;

    public String agreementName() {
        return this.agreementName;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
      private final String integrationAccountName;

    public String integrationAccountName() {
        return this.integrationAccountName;
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

    public GetIntegrationAccountAgreementArgs(
        String agreementName,
        String integrationAccountName,
        String resourceGroupName) {
        this.agreementName = Objects.requireNonNull(agreementName, "expected parameter 'agreementName' to be non-null");
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIntegrationAccountAgreementArgs() {
        this.agreementName = null;
        this.integrationAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agreementName;
        private String integrationAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountAgreementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreementName = defaults.agreementName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder agreementName(String agreementName) {
            this.agreementName = Objects.requireNonNull(agreementName);
            return this;
        }
        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetIntegrationAccountAgreementArgs build() {
            return new GetIntegrationAccountAgreementArgs(agreementName, integrationAccountName, resourceGroupName);
        }
    }
}
