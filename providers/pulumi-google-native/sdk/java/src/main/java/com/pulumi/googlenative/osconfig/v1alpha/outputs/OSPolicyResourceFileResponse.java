// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.OSPolicyResourceFileGcsResponse;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.OSPolicyResourceFileRemoteResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceFileResponse {
    /**
     * @return Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    private final Boolean allowInsecure;
    /**
     * @return A Cloud Storage object.
     * 
     */
    private final OSPolicyResourceFileGcsResponse gcs;
    /**
     * @return A local path within the VM to use.
     * 
     */
    private final String localPath;
    /**
     * @return A generic remote file.
     * 
     */
    private final OSPolicyResourceFileRemoteResponse remote;

    @CustomType.Constructor
    private OSPolicyResourceFileResponse(
        @CustomType.Parameter("allowInsecure") Boolean allowInsecure,
        @CustomType.Parameter("gcs") OSPolicyResourceFileGcsResponse gcs,
        @CustomType.Parameter("localPath") String localPath,
        @CustomType.Parameter("remote") OSPolicyResourceFileRemoteResponse remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    /**
     * @return Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    public Boolean allowInsecure() {
        return this.allowInsecure;
    }
    /**
     * @return A Cloud Storage object.
     * 
     */
    public OSPolicyResourceFileGcsResponse gcs() {
        return this.gcs;
    }
    /**
     * @return A local path within the VM to use.
     * 
     */
    public String localPath() {
        return this.localPath;
    }
    /**
     * @return A generic remote file.
     * 
     */
    public OSPolicyResourceFileRemoteResponse remote() {
        return this.remote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowInsecure;
        private OSPolicyResourceFileGcsResponse gcs;
        private String localPath;
        private OSPolicyResourceFileRemoteResponse remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(Boolean allowInsecure) {
            this.allowInsecure = Objects.requireNonNull(allowInsecure);
            return this;
        }
        public Builder gcs(OSPolicyResourceFileGcsResponse gcs) {
            this.gcs = Objects.requireNonNull(gcs);
            return this;
        }
        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public Builder remote(OSPolicyResourceFileRemoteResponse remote) {
            this.remote = Objects.requireNonNull(remote);
            return this;
        }        public OSPolicyResourceFileResponse build() {
            return new OSPolicyResourceFileResponse(allowInsecure, gcs, localPath, remote);
        }
    }
}
