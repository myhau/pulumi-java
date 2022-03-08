// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GitRepoVolumeSource {
    /**
     * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    private final @Nullable String directory;
    /**
     * Repository URL
     * 
     */
    private final String repository;
    /**
     * Commit hash for the specified revision.
     * 
     */
    private final @Nullable String revision;

    @OutputCustomType.Constructor({"directory","repository","revision"})
    private GitRepoVolumeSource(
        @Nullable String directory,
        String repository,
        @Nullable String revision) {
        this.directory = directory;
        this.repository = repository;
        this.revision = revision;
    }

    /**
     * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
    */
    public Optional<String> getDirectory() {
        return Optional.ofNullable(this.directory);
    }
    /**
     * Repository URL
     * 
    */
    public String getRepository() {
        return this.repository;
    }
    /**
     * Commit hash for the specified revision.
     * 
    */
    public Optional<String> getRevision() {
        return Optional.ofNullable(this.revision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String directory;
        private String repository;
        private @Nullable String revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directory = defaults.directory;
    	      this.repository = defaults.repository;
    	      this.revision = defaults.revision;
        }

        public Builder setDirectory(@Nullable String directory) {
            this.directory = directory;
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = revision;
            return this;
        }
        public GitRepoVolumeSource build() {
            return new GitRepoVolumeSource(directory, repository, revision);
        }
    }
}
