// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Git integration settings
 * 
 */
public final class WorkspaceRepositoryConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceRepositoryConfigurationArgs Empty = new WorkspaceRepositoryConfigurationArgs();

    /**
     * Account name
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * Collaboration branch
     * 
     */
    @Import(name="collaborationBranch")
      private final @Nullable Output<String> collaborationBranch;

    public Output<String> collaborationBranch() {
        return this.collaborationBranch == null ? Codegen.empty() : this.collaborationBranch;
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
     * The last commit ID
     * 
     */
    @Import(name="lastCommitId")
      private final @Nullable Output<String> lastCommitId;

    public Output<String> lastCommitId() {
        return this.lastCommitId == null ? Codegen.empty() : this.lastCommitId;
    }

    /**
     * VSTS project name
     * 
     */
    @Import(name="projectName")
      private final @Nullable Output<String> projectName;

    public Output<String> projectName() {
        return this.projectName == null ? Codegen.empty() : this.projectName;
    }

    /**
     * Repository name
     * 
     */
    @Import(name="repositoryName")
      private final @Nullable Output<String> repositoryName;

    public Output<String> repositoryName() {
        return this.repositoryName == null ? Codegen.empty() : this.repositoryName;
    }

    /**
     * Root folder to use in the repository
     * 
     */
    @Import(name="rootFolder")
      private final @Nullable Output<String> rootFolder;

    public Output<String> rootFolder() {
        return this.rootFolder == null ? Codegen.empty() : this.rootFolder;
    }

    /**
     * The VSTS tenant ID
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public WorkspaceRepositoryConfigurationArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<String> collaborationBranch,
        @Nullable Output<String> hostName,
        @Nullable Output<String> lastCommitId,
        @Nullable Output<String> projectName,
        @Nullable Output<String> repositoryName,
        @Nullable Output<String> rootFolder,
        @Nullable Output<String> tenantId,
        @Nullable Output<String> type) {
        this.accountName = accountName;
        this.collaborationBranch = collaborationBranch;
        this.hostName = hostName;
        this.lastCommitId = lastCommitId;
        this.projectName = projectName;
        this.repositoryName = repositoryName;
        this.rootFolder = rootFolder;
        this.tenantId = tenantId;
        this.type = type;
    }

    private WorkspaceRepositoryConfigurationArgs() {
        this.accountName = Codegen.empty();
        this.collaborationBranch = Codegen.empty();
        this.hostName = Codegen.empty();
        this.lastCommitId = Codegen.empty();
        this.projectName = Codegen.empty();
        this.repositoryName = Codegen.empty();
        this.rootFolder = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceRepositoryConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<String> collaborationBranch;
        private @Nullable Output<String> hostName;
        private @Nullable Output<String> lastCommitId;
        private @Nullable Output<String> projectName;
        private @Nullable Output<String> repositoryName;
        private @Nullable Output<String> rootFolder;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceRepositoryConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.hostName = defaults.hostName;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder collaborationBranch(@Nullable Output<String> collaborationBranch) {
            this.collaborationBranch = collaborationBranch;
            return this;
        }
        public Builder collaborationBranch(@Nullable String collaborationBranch) {
            this.collaborationBranch = Codegen.ofNullable(collaborationBranch);
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
        public Builder projectName(@Nullable Output<String> projectName) {
            this.projectName = projectName;
            return this;
        }
        public Builder projectName(@Nullable String projectName) {
            this.projectName = Codegen.ofNullable(projectName);
            return this;
        }
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Codegen.ofNullable(repositoryName);
            return this;
        }
        public Builder rootFolder(@Nullable Output<String> rootFolder) {
            this.rootFolder = rootFolder;
            return this;
        }
        public Builder rootFolder(@Nullable String rootFolder) {
            this.rootFolder = Codegen.ofNullable(rootFolder);
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public WorkspaceRepositoryConfigurationArgs build() {
            return new WorkspaceRepositoryConfigurationArgs(accountName, collaborationBranch, hostName, lastCommitId, projectName, repositoryName, rootFolder, tenantId, type);
        }
    }
}
