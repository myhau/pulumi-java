// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectSignedUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetObjectSignedUrlArgs Empty = new GetObjectSignedUrlArgs();

    /**
     * The name of the bucket to read the object from
     * 
     */
    @InputImport(name="bucket", required=true)
    private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * The [MD5 digest](https://cloud.google.com/storage/docs/hashes-etags#_MD5) value in Base64.
     * Typically retrieved from `google_storage_bucket_object.object.md5hash` attribute.
     * If you provide this in the datasource, the client (e.g. browser, curl) must provide the `Content-MD5` HTTP header with this same value in its request.
     * 
     */
    @InputImport(name="contentMd5")
    private final @Nullable String contentMd5;

    public Optional<String> getContentMd5() {
        return this.contentMd5 == null ? Optional.empty() : Optional.ofNullable(this.contentMd5);
    }

    /**
     * If you specify this in the datasource, the client must provide the `Content-Type` HTTP header with the same value in its request.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * What Google service account credentials json should be used to sign the URL.
     * This data source checks the following locations for credentials, in order of preference: data source `credentials` attribute, provider `credentials` attribute and finally the GOOGLE_APPLICATION_CREDENTIALS environment variable.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable String credentials;

    public Optional<String> getCredentials() {
        return this.credentials == null ? Optional.empty() : Optional.ofNullable(this.credentials);
    }

    /**
     * For how long shall the signed URL be valid (defaults to 1 hour - i.e. `1h`).
     * See [here](https://golang.org/pkg/time/#ParseDuration) for info on valid duration formats.
     * 
     */
    @InputImport(name="duration")
    private final @Nullable String duration;

    public Optional<String> getDuration() {
        return this.duration == null ? Optional.empty() : Optional.ofNullable(this.duration);
    }

    /**
     * As needed. The server checks to make sure that the client provides matching values in requests using the signed URL.
     * Any header starting with `x-goog-` is accepted but see the [Google Docs](https://cloud.google.com/storage/docs/xml-api/reference-headers) for list of headers that are supported by Google.
     * 
     */
    @InputImport(name="extensionHeaders")
    private final @Nullable Map<String,String> extensionHeaders;

    public Map<String,String> getExtensionHeaders() {
        return this.extensionHeaders == null ? Map.of() : this.extensionHeaders;
    }

    /**
     * What HTTP Method will the signed URL allow (defaults to `GET`)
     * 
     */
    @InputImport(name="httpMethod")
    private final @Nullable String httpMethod;

    public Optional<String> getHttpMethod() {
        return this.httpMethod == null ? Optional.empty() : Optional.ofNullable(this.httpMethod);
    }

    /**
     * The full path to the object inside the bucket
     * 
     */
    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    public GetObjectSignedUrlArgs(
        String bucket,
        @Nullable String contentMd5,
        @Nullable String contentType,
        @Nullable String credentials,
        @Nullable String duration,
        @Nullable Map<String,String> extensionHeaders,
        @Nullable String httpMethod,
        String path) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.contentMd5 = contentMd5;
        this.contentType = contentType;
        this.credentials = credentials;
        this.duration = duration;
        this.extensionHeaders = extensionHeaders;
        this.httpMethod = httpMethod;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private GetObjectSignedUrlArgs() {
        this.bucket = null;
        this.contentMd5 = null;
        this.contentType = null;
        this.credentials = null;
        this.duration = null;
        this.extensionHeaders = Map.of();
        this.httpMethod = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectSignedUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String contentMd5;
        private @Nullable String contentType;
        private @Nullable String credentials;
        private @Nullable String duration;
        private @Nullable Map<String,String> extensionHeaders;
        private @Nullable String httpMethod;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectSignedUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.contentMd5 = defaults.contentMd5;
    	      this.contentType = defaults.contentType;
    	      this.credentials = defaults.credentials;
    	      this.duration = defaults.duration;
    	      this.extensionHeaders = defaults.extensionHeaders;
    	      this.httpMethod = defaults.httpMethod;
    	      this.path = defaults.path;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setContentMd5(@Nullable String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCredentials(@Nullable String credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setExtensionHeaders(@Nullable Map<String,String> extensionHeaders) {
            this.extensionHeaders = extensionHeaders;
            return this;
        }

        public Builder setHttpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public GetObjectSignedUrlArgs build() {
            return new GetObjectSignedUrlArgs(bucket, contentMd5, contentType, credentials, duration, extensionHeaders, httpMethod, path);
        }
    }
}
