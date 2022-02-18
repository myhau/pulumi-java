// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs Empty = new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs();

    /**
     * AWS Key ID.
     * 
     */
    @InputImport(name="accessKeyId", required=true)
    private final Input<String> accessKeyId;

    public Input<String> getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * AWS Secret Access Key.
     * 
     */
    @InputImport(name="secretAccessKey", required=true)
    private final Input<String> secretAccessKey;

    public Input<String> getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs(
        Input<String> accessKeyId,
        Input<String> secretAccessKey) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.secretAccessKey = Objects.requireNonNull(secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
    }

    private TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs() {
        this.accessKeyId = Input.empty();
        this.secretAccessKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessKeyId;
        private Input<String> secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder setAccessKeyId(Input<String> accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder setAccessKeyId(String accessKeyId) {
            this.accessKeyId = Input.of(Objects.requireNonNull(accessKeyId));
            return this;
        }

        public Builder setSecretAccessKey(Input<String> secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }

        public Builder setSecretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Input.of(Objects.requireNonNull(secretAccessKey));
            return this;
        }

        public TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs build() {
            return new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs(accessKeyId, secretAccessKey);
        }
    }
}
