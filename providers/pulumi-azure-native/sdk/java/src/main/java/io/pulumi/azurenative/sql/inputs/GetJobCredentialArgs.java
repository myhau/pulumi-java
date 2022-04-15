// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobCredentialArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobCredentialArgs Empty = new GetJobCredentialArgs();

    /**
     * The name of the credential.
     * 
     */
    @Import(name="credentialName", required=true)
      private final String credentialName;

    public String credentialName() {
        return this.credentialName;
    }

    /**
     * The name of the job agent.
     * 
     */
    @Import(name="jobAgentName", required=true)
      private final String jobAgentName;

    public String jobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String serverName() {
        return this.serverName;
    }

    public GetJobCredentialArgs(
        String credentialName,
        String jobAgentName,
        String resourceGroupName,
        String serverName) {
        this.credentialName = Objects.requireNonNull(credentialName, "expected parameter 'credentialName' to be non-null");
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetJobCredentialArgs() {
        this.credentialName = null;
        this.jobAgentName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String credentialName;
        private String jobAgentName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialName = defaults.credentialName;
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder credentialName(String credentialName) {
            this.credentialName = Objects.requireNonNull(credentialName);
            return this;
        }
        public Builder jobAgentName(String jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }        public GetJobCredentialArgs build() {
            return new GetJobCredentialArgs(credentialName, jobAgentName, resourceGroupName, serverName);
        }
    }
}
