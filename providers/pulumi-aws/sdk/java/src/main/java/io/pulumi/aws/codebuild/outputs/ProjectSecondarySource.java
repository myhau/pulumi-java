// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.aws.codebuild.outputs.ProjectSecondarySourceAuth;
import io.pulumi.aws.codebuild.outputs.ProjectSecondarySourceBuildStatusConfig;
import io.pulumi.aws.codebuild.outputs.ProjectSecondarySourceGitSubmodulesConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectSecondarySource {
    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    private final @Nullable ProjectSecondarySourceAuth auth;
    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    private final @Nullable ProjectSecondarySourceBuildStatusConfig buildStatusConfig;
    /**
     * Build specification to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    private final @Nullable String buildspec;
    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    private final @Nullable Integer gitCloneDepth;
    /**
     * Configuration block. Detailed below.
     * 
     */
    private final @Nullable ProjectSecondarySourceGitSubmodulesConfig gitSubmodulesConfig;
    /**
     * Ignore SSL warnings when connecting to source control.
     * 
     */
    private final @Nullable Boolean insecureSsl;
    /**
     * Location of the source code from git or s3.
     * 
     */
    private final @Nullable String location;
    /**
     * Whether to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    private final @Nullable Boolean reportBuildStatus;
    /**
     * An identifier for a source in the build project.
     * 
     */
    private final String sourceIdentifier;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"auth","buildStatusConfig","buildspec","gitCloneDepth","gitSubmodulesConfig","insecureSsl","location","reportBuildStatus","sourceIdentifier","type"})
    private ProjectSecondarySource(
        @Nullable ProjectSecondarySourceAuth auth,
        @Nullable ProjectSecondarySourceBuildStatusConfig buildStatusConfig,
        @Nullable String buildspec,
        @Nullable Integer gitCloneDepth,
        @Nullable ProjectSecondarySourceGitSubmodulesConfig gitSubmodulesConfig,
        @Nullable Boolean insecureSsl,
        @Nullable String location,
        @Nullable Boolean reportBuildStatus,
        String sourceIdentifier,
        String type) {
        this.auth = auth;
        this.buildStatusConfig = buildStatusConfig;
        this.buildspec = buildspec;
        this.gitCloneDepth = gitCloneDepth;
        this.gitSubmodulesConfig = gitSubmodulesConfig;
        this.insecureSsl = insecureSsl;
        this.location = location;
        this.reportBuildStatus = reportBuildStatus;
        this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Optional<ProjectSecondarySourceAuth> getAuth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    public Optional<ProjectSecondarySourceBuildStatusConfig> getBuildStatusConfig() {
        return Optional.ofNullable(this.buildStatusConfig);
    }
    /**
     * Build specification to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    public Optional<String> getBuildspec() {
        return Optional.ofNullable(this.buildspec);
    }
    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    public Optional<Integer> getGitCloneDepth() {
        return Optional.ofNullable(this.gitCloneDepth);
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    public Optional<ProjectSecondarySourceGitSubmodulesConfig> getGitSubmodulesConfig() {
        return Optional.ofNullable(this.gitSubmodulesConfig);
    }
    /**
     * Ignore SSL warnings when connecting to source control.
     * 
     */
    public Optional<Boolean> getInsecureSsl() {
        return Optional.ofNullable(this.insecureSsl);
    }
    /**
     * Location of the source code from git or s3.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Whether to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    public Optional<Boolean> getReportBuildStatus() {
        return Optional.ofNullable(this.reportBuildStatus);
    }
    /**
     * An identifier for a source in the build project.
     * 
     */
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ProjectSecondarySourceAuth auth;
        private @Nullable ProjectSecondarySourceBuildStatusConfig buildStatusConfig;
        private @Nullable String buildspec;
        private @Nullable Integer gitCloneDepth;
        private @Nullable ProjectSecondarySourceGitSubmodulesConfig gitSubmodulesConfig;
        private @Nullable Boolean insecureSsl;
        private @Nullable String location;
        private @Nullable Boolean reportBuildStatus;
        private String sourceIdentifier;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.buildStatusConfig = defaults.buildStatusConfig;
    	      this.buildspec = defaults.buildspec;
    	      this.gitCloneDepth = defaults.gitCloneDepth;
    	      this.gitSubmodulesConfig = defaults.gitSubmodulesConfig;
    	      this.insecureSsl = defaults.insecureSsl;
    	      this.location = defaults.location;
    	      this.reportBuildStatus = defaults.reportBuildStatus;
    	      this.sourceIdentifier = defaults.sourceIdentifier;
    	      this.type = defaults.type;
        }

        public Builder setAuth(@Nullable ProjectSecondarySourceAuth auth) {
            this.auth = auth;
            return this;
        }

        public Builder setBuildStatusConfig(@Nullable ProjectSecondarySourceBuildStatusConfig buildStatusConfig) {
            this.buildStatusConfig = buildStatusConfig;
            return this;
        }

        public Builder setBuildspec(@Nullable String buildspec) {
            this.buildspec = buildspec;
            return this;
        }

        public Builder setGitCloneDepth(@Nullable Integer gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }

        public Builder setGitSubmodulesConfig(@Nullable ProjectSecondarySourceGitSubmodulesConfig gitSubmodulesConfig) {
            this.gitSubmodulesConfig = gitSubmodulesConfig;
            return this;
        }

        public Builder setInsecureSsl(@Nullable Boolean insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setReportBuildStatus(@Nullable Boolean reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }

        public Builder setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectSecondarySource build() {
            return new ProjectSecondarySource(auth, buildStatusConfig, buildspec, gitCloneDepth, gitSubmodulesConfig, insecureSsl, location, reportBuildStatus, sourceIdentifier, type);
        }
    }
}
