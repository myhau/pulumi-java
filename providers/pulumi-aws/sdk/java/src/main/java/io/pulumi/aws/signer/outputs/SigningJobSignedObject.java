// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.SigningJobSignedObjectS3;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SigningJobSignedObject {
    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    private final @Nullable List<SigningJobSignedObjectS3> s3s;

    @OutputCustomType.Constructor({"s3s"})
    private SigningJobSignedObject(@Nullable List<SigningJobSignedObjectS3> s3s) {
        this.s3s = s3s;
    }

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    public List<SigningJobSignedObjectS3> getS3s() {
        return this.s3s == null ? List.of() : this.s3s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSignedObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SigningJobSignedObjectS3> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSignedObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder setS3s(@Nullable List<SigningJobSignedObjectS3> s3s) {
            this.s3s = s3s;
            return this;
        }
        public SigningJobSignedObject build() {
            return new SigningJobSignedObject(s3s);
        }
    }
}
