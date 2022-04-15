// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.AzureFileVolumeResponse;
import io.pulumi.azurenative.containerinstance.inputs.GitRepoVolumeResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the volume.
 * 
 */
public final class VolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeResponse Empty = new VolumeResponse();

    /**
     * The Azure File volume.
     * 
     */
    @Import(name="azureFile")
      private final @Nullable AzureFileVolumeResponse azureFile;

    public Optional<AzureFileVolumeResponse> azureFile() {
        return this.azureFile == null ? Optional.empty() : Optional.ofNullable(this.azureFile);
    }

    /**
     * The empty directory volume.
     * 
     */
    @Import(name="emptyDir")
      private final @Nullable Object emptyDir;

    public Optional<Object> emptyDir() {
        return this.emptyDir == null ? Optional.empty() : Optional.ofNullable(this.emptyDir);
    }

    /**
     * The git repo volume.
     * 
     */
    @Import(name="gitRepo")
      private final @Nullable GitRepoVolumeResponse gitRepo;

    public Optional<GitRepoVolumeResponse> gitRepo() {
        return this.gitRepo == null ? Optional.empty() : Optional.ofNullable(this.gitRepo);
    }

    /**
     * The name of the volume.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The secret volume.
     * 
     */
    @Import(name="secret")
      private final @Nullable Map<String,String> secret;

    public Map<String,String> secret() {
        return this.secret == null ? Map.of() : this.secret;
    }

    public VolumeResponse(
        @Nullable AzureFileVolumeResponse azureFile,
        @Nullable Object emptyDir,
        @Nullable GitRepoVolumeResponse gitRepo,
        String name,
        @Nullable Map<String,String> secret) {
        this.azureFile = azureFile;
        this.emptyDir = emptyDir;
        this.gitRepo = gitRepo;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secret = secret;
    }

    private VolumeResponse() {
        this.azureFile = null;
        this.emptyDir = null;
        this.gitRepo = null;
        this.name = null;
        this.secret = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFileVolumeResponse azureFile;
        private @Nullable Object emptyDir;
        private @Nullable GitRepoVolumeResponse gitRepo;
        private String name;
        private @Nullable Map<String,String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFile = defaults.azureFile;
    	      this.emptyDir = defaults.emptyDir;
    	      this.gitRepo = defaults.gitRepo;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder azureFile(@Nullable AzureFileVolumeResponse azureFile) {
            this.azureFile = azureFile;
            return this;
        }
        public Builder emptyDir(@Nullable Object emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }
        public Builder gitRepo(@Nullable GitRepoVolumeResponse gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secret(@Nullable Map<String,String> secret) {
            this.secret = secret;
            return this;
        }        public VolumeResponse build() {
            return new VolumeResponse(azureFile, emptyDir, gitRepo, name, secret);
        }
    }
}
