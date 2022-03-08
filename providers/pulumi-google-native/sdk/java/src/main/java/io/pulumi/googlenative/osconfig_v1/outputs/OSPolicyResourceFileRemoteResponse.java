// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceFileRemoteResponse {
    /**
     * SHA256 checksum of the remote file.
     * 
     */
    private final String sha256Checksum;
    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol}://{location}`.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"sha256Checksum","uri"})
    private OSPolicyResourceFileRemoteResponse(
        String sha256Checksum,
        String uri) {
        this.sha256Checksum = sha256Checksum;
        this.uri = uri;
    }

    /**
     * SHA256 checksum of the remote file.
     * 
    */
    public String getSha256Checksum() {
        return this.sha256Checksum;
    }
    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol}://{location}`.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileRemoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sha256Checksum;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileRemoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder setSha256Checksum(String sha256Checksum) {
            this.sha256Checksum = Objects.requireNonNull(sha256Checksum);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public OSPolicyResourceFileRemoteResponse build() {
            return new OSPolicyResourceFileRemoteResponse(sha256Checksum, uri);
        }
    }
}
