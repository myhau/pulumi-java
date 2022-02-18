// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeysZoneSigningKeyDigest {
    /**
     * The base-16 encoded bytes of this digest. Suitable for use in a DS resource record.
     * 
     */
    private final @Nullable String digest;
    /**
     * Specifies the algorithm used to calculate this digest. Possible values are `sha1`, `sha256` and `sha384`
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"digest","type"})
    private GetKeysZoneSigningKeyDigest(
        @Nullable String digest,
        @Nullable String type) {
        this.digest = digest;
        this.type = type;
    }

    /**
     * The base-16 encoded bytes of this digest. Suitable for use in a DS resource record.
     * 
     */
    public Optional<String> getDigest() {
        return Optional.ofNullable(this.digest);
    }
    /**
     * Specifies the algorithm used to calculate this digest. Possible values are `sha1`, `sha256` and `sha384`
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysZoneSigningKeyDigest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeysZoneSigningKeyDigest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.type = defaults.type;
        }

        public Builder setDigest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public GetKeysZoneSigningKeyDigest build() {
            return new GetKeysZoneSigningKeyDigest(digest, type);
        }
    }
}
