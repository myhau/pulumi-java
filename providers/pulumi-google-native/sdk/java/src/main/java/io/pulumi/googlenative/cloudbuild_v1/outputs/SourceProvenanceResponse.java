// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.RepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceManifestResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SourceProvenanceResponse {
    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
     * 
     */
    private final Map<String,String> fileHashes;
    /**
     * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
     * 
     */
    private final RepoSourceResponse resolvedRepoSource;
    /**
     * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
     * 
     */
    private final StorageSourceResponse resolvedStorageSource;
    /**
     * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
     * 
     */
    private final StorageSourceManifestResponse resolvedStorageSourceManifest;

    @OutputCustomType.Constructor({"fileHashes","resolvedRepoSource","resolvedStorageSource","resolvedStorageSourceManifest"})
    private SourceProvenanceResponse(
        Map<String,String> fileHashes,
        RepoSourceResponse resolvedRepoSource,
        StorageSourceResponse resolvedStorageSource,
        StorageSourceManifestResponse resolvedStorageSourceManifest) {
        this.fileHashes = fileHashes;
        this.resolvedRepoSource = resolvedRepoSource;
        this.resolvedStorageSource = resolvedStorageSource;
        this.resolvedStorageSourceManifest = resolvedStorageSourceManifest;
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
     * 
    */
    public Map<String,String> getFileHashes() {
        return this.fileHashes;
    }
    /**
     * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
     * 
    */
    public RepoSourceResponse getResolvedRepoSource() {
        return this.resolvedRepoSource;
    }
    /**
     * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
     * 
    */
    public StorageSourceResponse getResolvedStorageSource() {
        return this.resolvedStorageSource;
    }
    /**
     * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
     * 
    */
    public StorageSourceManifestResponse getResolvedStorageSourceManifest() {
        return this.resolvedStorageSourceManifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fileHashes;
        private RepoSourceResponse resolvedRepoSource;
        private StorageSourceResponse resolvedStorageSource;
        private StorageSourceManifestResponse resolvedStorageSourceManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileHashes = defaults.fileHashes;
    	      this.resolvedRepoSource = defaults.resolvedRepoSource;
    	      this.resolvedStorageSource = defaults.resolvedStorageSource;
    	      this.resolvedStorageSourceManifest = defaults.resolvedStorageSourceManifest;
        }

        public Builder setFileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }

        public Builder setResolvedRepoSource(RepoSourceResponse resolvedRepoSource) {
            this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource);
            return this;
        }

        public Builder setResolvedStorageSource(StorageSourceResponse resolvedStorageSource) {
            this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource);
            return this;
        }

        public Builder setResolvedStorageSourceManifest(StorageSourceManifestResponse resolvedStorageSourceManifest) {
            this.resolvedStorageSourceManifest = Objects.requireNonNull(resolvedStorageSourceManifest);
            return this;
        }
        public SourceProvenanceResponse build() {
            return new SourceProvenanceResponse(fileHashes, resolvedRepoSource, resolvedStorageSource, resolvedStorageSourceManifest);
        }
    }
}
