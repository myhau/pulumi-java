// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEncryptionAtRestOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEncryptionAtRestOptionsArgs Empty = new DomainEncryptionAtRestOptionsArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    public DomainEncryptionAtRestOptionsArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> kmsKeyId) {
        this.enabled = enabled;
        this.kmsKeyId = kmsKeyId;
    }

    private DomainEncryptionAtRestOptionsArgs() {
        this.enabled = Input.empty();
        this.kmsKeyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEncryptionAtRestOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEncryptionAtRestOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public DomainEncryptionAtRestOptionsArgs build() {
            return new DomainEncryptionAtRestOptionsArgs(enabled, kmsKeyId);
        }
    }
}