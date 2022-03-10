// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AwsAccessKeyResponse {
    /**
     * AWS access key ID.
     * 
     */
    private final String accessKeyId;
    /**
     * AWS secret access key. This field is not returned in RPC responses.
     * 
     */
    private final String secretAccessKey;

    @OutputCustomType.Constructor
    private AwsAccessKeyResponse(
        @OutputCustomType.Parameter("accessKeyId") String accessKeyId,
        @OutputCustomType.Parameter("secretAccessKey") String secretAccessKey) {
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * AWS access key ID.
     * 
    */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }
    /**
     * AWS secret access key. This field is not returned in RPC responses.
     * 
    */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsAccessKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKeyId;
        private String secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsAccessKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder setAccessKeyId(String accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder setSecretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }
        public AwsAccessKeyResponse build() {
            return new AwsAccessKeyResponse(accessKeyId, secretAccessKey);
        }
    }
}
