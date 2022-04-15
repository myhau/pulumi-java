// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the import pipeline source.
 * 
 */
public final class ImportPipelineSourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImportPipelineSourcePropertiesResponse Empty = new ImportPipelineSourcePropertiesResponse();

    /**
     * They key vault secret uri to obtain the source storage SAS token.
     * 
     */
    @Import(name="keyVaultUri", required=true)
      private final String keyVaultUri;

    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The type of source for the import pipeline.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The source uri of the import pipeline.
     * When 'AzureStorageBlob': "https://accountName.blob.core.windows.net/containerName/blobName"
     * When 'AzureStorageBlobContainer': "https://accountName.blob.core.windows.net/containerName"
     * 
     */
    @Import(name="uri")
      private final @Nullable String uri;

    public Optional<String> uri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public ImportPipelineSourcePropertiesResponse(
        String keyVaultUri,
        @Nullable String type,
        @Nullable String uri) {
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
        this.type = type == null ? "AzureStorageBlobContainer" : type;
        this.uri = uri;
    }

    private ImportPipelineSourcePropertiesResponse() {
        this.keyVaultUri = null;
        this.type = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportPipelineSourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyVaultUri;
        private @Nullable String type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportPipelineSourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder keyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public ImportPipelineSourcePropertiesResponse build() {
            return new ImportPipelineSourcePropertiesResponse(keyVaultUri, type, uri);
        }
    }
}
