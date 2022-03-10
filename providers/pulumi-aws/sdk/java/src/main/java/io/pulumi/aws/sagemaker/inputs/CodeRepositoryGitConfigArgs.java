// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CodeRepositoryGitConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeRepositoryGitConfigArgs Empty = new CodeRepositoryGitConfigArgs();

    /**
     * The default branch for the Git repository.
     * 
     */
    @InputImport(name="branch")
      private final @Nullable Input<String> branch;

    public Input<String> getBranch() {
        return this.branch == null ? Input.empty() : this.branch;
    }

    /**
     * The URL where the Git repository is located.
     * 
     */
    @InputImport(name="repositoryUrl", required=true)
      private final Input<String> repositoryUrl;

    public Input<String> getRepositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{"username": UserName, "password": Password}`
     * 
     */
    @InputImport(name="secretArn")
      private final @Nullable Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn == null ? Input.empty() : this.secretArn;
    }

    public CodeRepositoryGitConfigArgs(
        @Nullable Input<String> branch,
        Input<String> repositoryUrl,
        @Nullable Input<String> secretArn) {
        this.branch = branch;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
        this.secretArn = secretArn;
    }

    private CodeRepositoryGitConfigArgs() {
        this.branch = Input.empty();
        this.repositoryUrl = Input.empty();
        this.secretArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeRepositoryGitConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branch;
        private Input<String> repositoryUrl;
        private @Nullable Input<String> secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeRepositoryGitConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder setBranch(@Nullable Input<String> branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = Input.ofNullable(branch);
            return this;
        }

        public Builder setRepositoryUrl(Input<String> repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Input.of(Objects.requireNonNull(repositoryUrl));
            return this;
        }

        public Builder setSecretArn(@Nullable Input<String> secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public Builder setSecretArn(@Nullable String secretArn) {
            this.secretArn = Input.ofNullable(secretArn);
            return this;
        }
        public CodeRepositoryGitConfigArgs build() {
            return new CodeRepositoryGitConfigArgs(branch, repositoryUrl, secretArn);
        }
    }
}