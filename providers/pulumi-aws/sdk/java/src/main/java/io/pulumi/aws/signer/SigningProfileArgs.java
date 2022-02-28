// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer;

import io.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileArgs Empty = new SigningProfileArgs();

    /**
     * A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @InputImport(name="platformId", required=true)
      private final Input<String> platformId;

    public Input<String> getPlatformId() {
        return this.platformId;
    }

    /**
     * The validity period for a signing job.
     * 
     */
    @InputImport(name="signatureValidityPeriod")
      private final @Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    public Input<SigningProfileSignatureValidityPeriodArgs> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod == null ? Input.empty() : this.signatureValidityPeriod;
    }

    /**
     * A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SigningProfileArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        Input<String> platformId,
        @Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod,
        @Nullable Input<Map<String,String>> tags) {
        this.name = name;
        this.namePrefix = namePrefix;
        this.platformId = Objects.requireNonNull(platformId, "expected parameter 'platformId' to be non-null");
        this.signatureValidityPeriod = signatureValidityPeriod;
        this.tags = tags;
    }

    private SigningProfileArgs() {
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.platformId = Input.empty();
        this.signatureValidityPeriod = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private Input<String> platformId;
        private @Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.platformId = defaults.platformId;
    	      this.signatureValidityPeriod = defaults.signatureValidityPeriod;
    	      this.tags = defaults.tags;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setPlatformId(Input<String> platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }

        public Builder setPlatformId(String platformId) {
            this.platformId = Input.of(Objects.requireNonNull(platformId));
            return this;
        }

        public Builder setSignatureValidityPeriod(@Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            this.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }

        public Builder setSignatureValidityPeriod(@Nullable SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            this.signatureValidityPeriod = Input.ofNullable(signatureValidityPeriod);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SigningProfileArgs build() {
            return new SigningProfileArgs(name, namePrefix, platformId, signatureValidityPeriod, tags);
        }
    }
}
