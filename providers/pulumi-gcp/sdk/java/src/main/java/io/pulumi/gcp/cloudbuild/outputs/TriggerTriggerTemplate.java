// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerTriggerTemplate {
    /**
     * Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final @Nullable String branchName;
    /**
     * Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    private final @Nullable String commitSha;
    /**
     * Working directory to use when running this step's container.
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step's execution.
     * 
     */
    private final @Nullable String dir;
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private final @Nullable Boolean invertRegex;
    /**
     * ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    private final @Nullable String projectId;
    /**
     * Name of the Cloud Source Repository.
     * 
     */
    private final @Nullable String repoName;
    /**
     * Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final @Nullable String tagName;

    @OutputCustomType.Constructor({"branchName","commitSha","dir","invertRegex","projectId","repoName","tagName"})
    private TriggerTriggerTemplate(
        @Nullable String branchName,
        @Nullable String commitSha,
        @Nullable String dir,
        @Nullable Boolean invertRegex,
        @Nullable String projectId,
        @Nullable String repoName,
        @Nullable String tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.projectId = projectId;
        this.repoName = repoName;
        this.tagName = tagName;
    }

    /**
     * Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public Optional<String> getBranchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    public Optional<String> getCommitSha() {
        return Optional.ofNullable(this.commitSha);
    }
    /**
     * Working directory to use when running this step's container.
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step's execution.
     * 
     */
    public Optional<String> getDir() {
        return Optional.ofNullable(this.dir);
    }
    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Optional<Boolean> getInvertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }
    /**
     * ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * Name of the Cloud Source Repository.
     * 
     */
    public Optional<String> getRepoName() {
        return Optional.ofNullable(this.repoName);
    }
    /**
     * Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public Optional<String> getTagName() {
        return Optional.ofNullable(this.tagName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTriggerTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String commitSha;
        private @Nullable String dir;
        private @Nullable Boolean invertRegex;
        private @Nullable String projectId;
        private @Nullable String repoName;
        private @Nullable String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTriggerTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.projectId = defaults.projectId;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        public Builder setBranchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setCommitSha(@Nullable String commitSha) {
            this.commitSha = commitSha;
            return this;
        }

        public Builder setDir(@Nullable String dir) {
            this.dir = dir;
            return this;
        }

        public Builder setInvertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setRepoName(@Nullable String repoName) {
            this.repoName = repoName;
            return this;
        }

        public Builder setTagName(@Nullable String tagName) {
            this.tagName = tagName;
            return this;
        }

        public TriggerTriggerTemplate build() {
            return new TriggerTriggerTemplate(branchName, commitSha, dir, invertRegex, projectId, repoName, tagName);
        }
    }
}
