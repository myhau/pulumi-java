// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CryptoKeyResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CryptoHashConfigResponse {
    private final GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;

    @OutputCustomType.Constructor({"cryptoKey"})
    private GooglePrivacyDlpV2CryptoHashConfigResponse(GooglePrivacyDlpV2CryptoKeyResponse cryptoKey) {
        this.cryptoKey = Objects.requireNonNull(cryptoKey);
    }

    public GooglePrivacyDlpV2CryptoKeyResponse getCryptoKey() {
        return this.cryptoKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoHashConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoHashConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKey = defaults.cryptoKey;
        }

        public Builder setCryptoKey(GooglePrivacyDlpV2CryptoKeyResponse cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public GooglePrivacyDlpV2CryptoHashConfigResponse build() {
            return new GooglePrivacyDlpV2CryptoHashConfigResponse(cryptoKey);
        }
    }
}