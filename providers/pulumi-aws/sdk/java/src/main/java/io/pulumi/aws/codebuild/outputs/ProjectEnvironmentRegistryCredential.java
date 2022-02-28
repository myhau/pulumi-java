// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ProjectEnvironmentRegistryCredential {
    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     * 
     */
    private final String credential;
    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     * 
     */
    private final String credentialProvider;

    @OutputCustomType.Constructor({"credential","credentialProvider"})
    private ProjectEnvironmentRegistryCredential(
        String credential,
        String credentialProvider) {
        this.credential = Objects.requireNonNull(credential);
        this.credentialProvider = Objects.requireNonNull(credentialProvider);
    }

    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     * 
     */
    public String getCredential() {
        return this.credential;
    }
    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     * 
     */
    public String getCredentialProvider() {
        return this.credentialProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentRegistryCredential defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String credential;
        private String credentialProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentRegistryCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.credentialProvider = defaults.credentialProvider;
        }

        public Builder setCredential(String credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setCredentialProvider(String credentialProvider) {
            this.credentialProvider = Objects.requireNonNull(credentialProvider);
            return this;
        }
        public ProjectEnvironmentRegistryCredential build() {
            return new ProjectEnvironmentRegistryCredential(credential, credentialProvider);
        }
    }
}
