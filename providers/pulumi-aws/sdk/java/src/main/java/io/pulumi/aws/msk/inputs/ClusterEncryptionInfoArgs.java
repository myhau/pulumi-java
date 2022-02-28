// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEncryptionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionInfoArgs Empty = new ClusterEncryptionInfoArgs();

    /**
     * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
     * 
     */
    @InputImport(name="encryptionAtRestKmsKeyArn")
      private final @Nullable Input<String> encryptionAtRestKmsKeyArn;

    public Input<String> getEncryptionAtRestKmsKeyArn() {
        return this.encryptionAtRestKmsKeyArn == null ? Input.empty() : this.encryptionAtRestKmsKeyArn;
    }

    /**
     * Configuration block to specify encryption in transit. See below.
     * 
     */
    @InputImport(name="encryptionInTransit")
      private final @Nullable Input<ClusterEncryptionInfoEncryptionInTransitArgs> encryptionInTransit;

    public Input<ClusterEncryptionInfoEncryptionInTransitArgs> getEncryptionInTransit() {
        return this.encryptionInTransit == null ? Input.empty() : this.encryptionInTransit;
    }

    public ClusterEncryptionInfoArgs(
        @Nullable Input<String> encryptionAtRestKmsKeyArn,
        @Nullable Input<ClusterEncryptionInfoEncryptionInTransitArgs> encryptionInTransit) {
        this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
        this.encryptionInTransit = encryptionInTransit;
    }

    private ClusterEncryptionInfoArgs() {
        this.encryptionAtRestKmsKeyArn = Input.empty();
        this.encryptionInTransit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encryptionAtRestKmsKeyArn;
        private @Nullable Input<ClusterEncryptionInfoEncryptionInTransitArgs> encryptionInTransit;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAtRestKmsKeyArn = defaults.encryptionAtRestKmsKeyArn;
    	      this.encryptionInTransit = defaults.encryptionInTransit;
        }

        public Builder setEncryptionAtRestKmsKeyArn(@Nullable Input<String> encryptionAtRestKmsKeyArn) {
            this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
            return this;
        }

        public Builder setEncryptionAtRestKmsKeyArn(@Nullable String encryptionAtRestKmsKeyArn) {
            this.encryptionAtRestKmsKeyArn = Input.ofNullable(encryptionAtRestKmsKeyArn);
            return this;
        }

        public Builder setEncryptionInTransit(@Nullable Input<ClusterEncryptionInfoEncryptionInTransitArgs> encryptionInTransit) {
            this.encryptionInTransit = encryptionInTransit;
            return this;
        }

        public Builder setEncryptionInTransit(@Nullable ClusterEncryptionInfoEncryptionInTransitArgs encryptionInTransit) {
            this.encryptionInTransit = Input.ofNullable(encryptionInTransit);
            return this;
        }
        public ClusterEncryptionInfoArgs build() {
            return new ClusterEncryptionInfoArgs(encryptionAtRestKmsKeyArn, encryptionInTransit);
        }
    }
}
