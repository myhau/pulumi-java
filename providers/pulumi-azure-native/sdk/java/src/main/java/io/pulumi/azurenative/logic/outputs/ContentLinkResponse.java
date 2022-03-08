// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ContentHashResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentLinkResponse {
    /**
     * The content hash.
     * 
     */
    private final ContentHashResponse contentHash;
    /**
     * The content size.
     * 
     */
    private final Double contentSize;
    /**
     * The content version.
     * 
     */
    private final String contentVersion;
    /**
     * The metadata.
     * 
     */
    private final Object metadata;
    /**
     * The content link URI.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"contentHash","contentSize","contentVersion","metadata","uri"})
    private ContentLinkResponse(
        ContentHashResponse contentHash,
        Double contentSize,
        String contentVersion,
        Object metadata,
        @Nullable String uri) {
        this.contentHash = contentHash;
        this.contentSize = contentSize;
        this.contentVersion = contentVersion;
        this.metadata = metadata;
        this.uri = uri;
    }

    /**
     * The content hash.
     * 
    */
    public ContentHashResponse getContentHash() {
        return this.contentHash;
    }
    /**
     * The content size.
     * 
    */
    public Double getContentSize() {
        return this.contentSize;
    }
    /**
     * The content version.
     * 
    */
    public String getContentVersion() {
        return this.contentVersion;
    }
    /**
     * The metadata.
     * 
    */
    public Object getMetadata() {
        return this.metadata;
    }
    /**
     * The content link URI.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentHashResponse contentHash;
        private Double contentSize;
        private String contentVersion;
        private Object metadata;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.contentSize = defaults.contentSize;
    	      this.contentVersion = defaults.contentVersion;
    	      this.metadata = defaults.metadata;
    	      this.uri = defaults.uri;
        }

        public Builder setContentHash(ContentHashResponse contentHash) {
            this.contentHash = Objects.requireNonNull(contentHash);
            return this;
        }

        public Builder setContentSize(Double contentSize) {
            this.contentSize = Objects.requireNonNull(contentSize);
            return this;
        }

        public Builder setContentVersion(String contentVersion) {
            this.contentVersion = Objects.requireNonNull(contentVersion);
            return this;
        }

        public Builder setMetadata(Object metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public ContentLinkResponse build() {
            return new ContentLinkResponse(contentHash, contentSize, contentVersion, metadata, uri);
        }
    }
}
