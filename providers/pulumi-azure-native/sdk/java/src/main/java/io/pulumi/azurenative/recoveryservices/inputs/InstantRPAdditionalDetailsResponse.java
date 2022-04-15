// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstantRPAdditionalDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstantRPAdditionalDetailsResponse Empty = new InstantRPAdditionalDetailsResponse();

    @Import(name="azureBackupRGNamePrefix")
      private final @Nullable String azureBackupRGNamePrefix;

    public Optional<String> azureBackupRGNamePrefix() {
        return this.azureBackupRGNamePrefix == null ? Optional.empty() : Optional.ofNullable(this.azureBackupRGNamePrefix);
    }

    @Import(name="azureBackupRGNameSuffix")
      private final @Nullable String azureBackupRGNameSuffix;

    public Optional<String> azureBackupRGNameSuffix() {
        return this.azureBackupRGNameSuffix == null ? Optional.empty() : Optional.ofNullable(this.azureBackupRGNameSuffix);
    }

    public InstantRPAdditionalDetailsResponse(
        @Nullable String azureBackupRGNamePrefix,
        @Nullable String azureBackupRGNameSuffix) {
        this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
        this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
    }

    private InstantRPAdditionalDetailsResponse() {
        this.azureBackupRGNamePrefix = null;
        this.azureBackupRGNameSuffix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstantRPAdditionalDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureBackupRGNamePrefix;
        private @Nullable String azureBackupRGNameSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(InstantRPAdditionalDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBackupRGNamePrefix = defaults.azureBackupRGNamePrefix;
    	      this.azureBackupRGNameSuffix = defaults.azureBackupRGNameSuffix;
        }

        public Builder azureBackupRGNamePrefix(@Nullable String azureBackupRGNamePrefix) {
            this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
            return this;
        }
        public Builder azureBackupRGNameSuffix(@Nullable String azureBackupRGNameSuffix) {
            this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
            return this;
        }        public InstantRPAdditionalDetailsResponse build() {
            return new InstantRPAdditionalDetailsResponse(azureBackupRGNamePrefix, azureBackupRGNameSuffix);
        }
    }
}
