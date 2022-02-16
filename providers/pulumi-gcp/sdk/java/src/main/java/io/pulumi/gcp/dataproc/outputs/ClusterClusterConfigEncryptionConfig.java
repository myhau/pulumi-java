// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterClusterConfigEncryptionConfig {
    private final String kmsKeyName;

    @OutputCustomType.Constructor({"kmsKeyName"})
    private ClusterClusterConfigEncryptionConfig(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
    }

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public ClusterClusterConfigEncryptionConfig build() {
            return new ClusterClusterConfigEncryptionConfig(kmsKeyName);
        }
    }
}