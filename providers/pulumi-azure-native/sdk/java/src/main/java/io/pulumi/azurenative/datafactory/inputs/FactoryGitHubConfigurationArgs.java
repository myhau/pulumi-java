// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.GitHubClientSecretArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Factory's GitHub repo information.
 * 
 */
public final class FactoryGitHubConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FactoryGitHubConfigurationArgs Empty = new FactoryGitHubConfigurationArgs();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * GitHub bring your own app client id.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * GitHub bring your own app client secret information.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<GitHubClientSecretArgs> clientSecret;

    public Output<GitHubClientSecretArgs> clientSecret() {
        return this.clientSecret == null ? Codegen.empty() : this.clientSecret;
    }

    /**
     * Collaboration branch.
     * 
     */
    @Import(name="collaborationBranch", required=true)
      private final Output<String> collaborationBranch;

    public Output<String> collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    @Import(name="hostName")
      private final @Nullable Output<String> hostName;

    public Output<String> hostName() {
        return this.hostName == null ? Codegen.empty() : this.hostName;
    }

    /**
     * Last commit id.
     * 
     */
    @Import(name="lastCommitId")
      private final @Nullable Output<String> lastCommitId;

    public Output<String> lastCommitId() {
        return this.lastCommitId == null ? Codegen.empty() : this.lastCommitId;
    }

    /**
     * Repository name.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @Import(name="rootFolder", required=true)
      private final Output<String> rootFolder;

    public Output<String> rootFolder() {
        return this.rootFolder;
    }

    /**
     * Type of repo configuration.
     * Expected value is 'FactoryGitHubConfiguration'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public FactoryGitHubConfigurationArgs(
        Output<String> accountName,
        @Nullable Output<String> clientId,
        @Nullable Output<GitHubClientSecretArgs> clientSecret,
        Output<String> collaborationBranch,
        @Nullable Output<String> hostName,
        @Nullable Output<String> lastCommitId,
        Output<String> repositoryName,
        Output<String> rootFolder,
        Output<String> type) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.collaborationBranch = Objects.requireNonNull(collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
        this.hostName = hostName;
        this.lastCommitId = lastCommitId;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.rootFolder = Objects.requireNonNull(rootFolder, "expected parameter 'rootFolder' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FactoryGitHubConfigurationArgs() {
        this.accountName = Codegen.empty();
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.collaborationBranch = Codegen.empty();
        this.hostName = Codegen.empty();
        this.lastCommitId = Codegen.empty();
        this.repositoryName = Codegen.empty();
        this.rootFolder = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryGitHubConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> clientId;
        private @Nullable Output<GitHubClientSecretArgs> clientSecret;
        private Output<String> collaborationBranch;
        private @Nullable Output<String> hostName;
        private @Nullable Output<String> lastCommitId;
        private Output<String> repositoryName;
        private Output<String> rootFolder;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryGitHubConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.hostName = defaults.hostName;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.type = defaults.type;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Output<GitHubClientSecretArgs> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable GitHubClientSecretArgs clientSecret) {
            this.clientSecret = Codegen.ofNullable(clientSecret);
            return this;
        }
        public Builder collaborationBranch(Output<String> collaborationBranch) {
            this.collaborationBranch = Objects.requireNonNull(collaborationBranch);
            return this;
        }
        public Builder collaborationBranch(String collaborationBranch) {
            this.collaborationBranch = Output.of(Objects.requireNonNull(collaborationBranch));
            return this;
        }
        public Builder hostName(@Nullable Output<String> hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = Codegen.ofNullable(hostName);
            return this;
        }
        public Builder lastCommitId(@Nullable Output<String> lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }
        public Builder lastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = Codegen.ofNullable(lastCommitId);
            return this;
        }
        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }
        public Builder rootFolder(Output<String> rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Output.of(Objects.requireNonNull(rootFolder));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FactoryGitHubConfigurationArgs build() {
            return new FactoryGitHubConfigurationArgs(accountName, clientId, clientSecret, collaborationBranch, hostName, lastCommitId, repositoryName, rootFolder, type);
        }
    }
}
