// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultReferenceResponse {
    private final String id;
    private final String url;

    @OutputCustomType.Constructor({"id","url"})
    private KeyVaultReferenceResponse(
        String id,
        String url) {
        this.id = Objects.requireNonNull(id);
        this.url = Objects.requireNonNull(url);
    }

    public String getId() {
        return this.id;
    }
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.url = defaults.url;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public KeyVaultReferenceResponse build() {
            return new KeyVaultReferenceResponse(id, url);
        }
    }
}