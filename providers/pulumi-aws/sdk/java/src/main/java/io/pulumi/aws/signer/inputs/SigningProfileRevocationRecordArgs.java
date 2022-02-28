// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileRevocationRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileRevocationRecordArgs Empty = new SigningProfileRevocationRecordArgs();

    @InputImport(name="revocationEffectiveFrom")
      private final @Nullable Input<String> revocationEffectiveFrom;

    public Input<String> getRevocationEffectiveFrom() {
        return this.revocationEffectiveFrom == null ? Input.empty() : this.revocationEffectiveFrom;
    }

    @InputImport(name="revokedAt")
      private final @Nullable Input<String> revokedAt;

    public Input<String> getRevokedAt() {
        return this.revokedAt == null ? Input.empty() : this.revokedAt;
    }

    @InputImport(name="revokedBy")
      private final @Nullable Input<String> revokedBy;

    public Input<String> getRevokedBy() {
        return this.revokedBy == null ? Input.empty() : this.revokedBy;
    }

    public SigningProfileRevocationRecordArgs(
        @Nullable Input<String> revocationEffectiveFrom,
        @Nullable Input<String> revokedAt,
        @Nullable Input<String> revokedBy) {
        this.revocationEffectiveFrom = revocationEffectiveFrom;
        this.revokedAt = revokedAt;
        this.revokedBy = revokedBy;
    }

    private SigningProfileRevocationRecordArgs() {
        this.revocationEffectiveFrom = Input.empty();
        this.revokedAt = Input.empty();
        this.revokedBy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileRevocationRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> revocationEffectiveFrom;
        private @Nullable Input<String> revokedAt;
        private @Nullable Input<String> revokedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileRevocationRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationEffectiveFrom = defaults.revocationEffectiveFrom;
    	      this.revokedAt = defaults.revokedAt;
    	      this.revokedBy = defaults.revokedBy;
        }

        public Builder setRevocationEffectiveFrom(@Nullable Input<String> revocationEffectiveFrom) {
            this.revocationEffectiveFrom = revocationEffectiveFrom;
            return this;
        }

        public Builder setRevocationEffectiveFrom(@Nullable String revocationEffectiveFrom) {
            this.revocationEffectiveFrom = Input.ofNullable(revocationEffectiveFrom);
            return this;
        }

        public Builder setRevokedAt(@Nullable Input<String> revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }

        public Builder setRevokedAt(@Nullable String revokedAt) {
            this.revokedAt = Input.ofNullable(revokedAt);
            return this;
        }

        public Builder setRevokedBy(@Nullable Input<String> revokedBy) {
            this.revokedBy = revokedBy;
            return this;
        }

        public Builder setRevokedBy(@Nullable String revokedBy) {
            this.revokedBy = Input.ofNullable(revokedBy);
            return this;
        }
        public SigningProfileRevocationRecordArgs build() {
            return new SigningProfileRevocationRecordArgs(revocationEffectiveFrom, revokedAt, revokedBy);
        }
    }
}
