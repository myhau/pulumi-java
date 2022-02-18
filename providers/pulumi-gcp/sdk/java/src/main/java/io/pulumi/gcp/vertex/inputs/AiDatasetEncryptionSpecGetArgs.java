// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiDatasetEncryptionSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiDatasetEncryptionSpecGetArgs Empty = new AiDatasetEncryptionSpecGetArgs();

    /**
     * Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource.
     * Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the resource is created.
     * 
     */
    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    public AiDatasetEncryptionSpecGetArgs(@Nullable Input<String> kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    private AiDatasetEncryptionSpecGetArgs() {
        this.kmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiDatasetEncryptionSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AiDatasetEncryptionSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public AiDatasetEncryptionSpecGetArgs build() {
            return new AiDatasetEncryptionSpecGetArgs(kmsKeyName);
        }
    }
}
