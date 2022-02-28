// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ProjectEnvironmentRegistryCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentRegistryCredentialArgs Empty = new ProjectEnvironmentRegistryCredentialArgs();

    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     * 
     */
    @InputImport(name="credential", required=true)
      private final Input<String> credential;

    public Input<String> getCredential() {
        return this.credential;
    }

    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     * 
     */
    @InputImport(name="credentialProvider", required=true)
      private final Input<String> credentialProvider;

    public Input<String> getCredentialProvider() {
        return this.credentialProvider;
    }

    public ProjectEnvironmentRegistryCredentialArgs(
        Input<String> credential,
        Input<String> credentialProvider) {
        this.credential = Objects.requireNonNull(credential, "expected parameter 'credential' to be non-null");
        this.credentialProvider = Objects.requireNonNull(credentialProvider, "expected parameter 'credentialProvider' to be non-null");
    }

    private ProjectEnvironmentRegistryCredentialArgs() {
        this.credential = Input.empty();
        this.credentialProvider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentRegistryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> credential;
        private Input<String> credentialProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentRegistryCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.credentialProvider = defaults.credentialProvider;
        }

        public Builder setCredential(Input<String> credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setCredential(String credential) {
            this.credential = Input.of(Objects.requireNonNull(credential));
            return this;
        }

        public Builder setCredentialProvider(Input<String> credentialProvider) {
            this.credentialProvider = Objects.requireNonNull(credentialProvider);
            return this;
        }

        public Builder setCredentialProvider(String credentialProvider) {
            this.credentialProvider = Input.of(Objects.requireNonNull(credentialProvider));
            return this;
        }
        public ProjectEnvironmentRegistryCredentialArgs build() {
            return new ProjectEnvironmentRegistryCredentialArgs(credential, credentialProvider);
        }
    }
}
