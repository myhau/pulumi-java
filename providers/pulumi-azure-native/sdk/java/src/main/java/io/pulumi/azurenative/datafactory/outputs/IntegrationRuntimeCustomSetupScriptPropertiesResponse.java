// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeCustomSetupScriptPropertiesResponse {
    /**
     * The URI of the Azure blob container that contains the custom setup script.
     * 
     */
    private final @Nullable String blobContainerUri;
    /**
     * The SAS token of the Azure blob container.
     * 
     */
    private final @Nullable SecureStringResponse sasToken;

    @CustomType.Constructor
    private IntegrationRuntimeCustomSetupScriptPropertiesResponse(
        @CustomType.Parameter("blobContainerUri") @Nullable String blobContainerUri,
        @CustomType.Parameter("sasToken") @Nullable SecureStringResponse sasToken) {
        this.blobContainerUri = blobContainerUri;
        this.sasToken = sasToken;
    }

    /**
     * The URI of the Azure blob container that contains the custom setup script.
     * 
    */
    public Optional<String> blobContainerUri() {
        return Optional.ofNullable(this.blobContainerUri);
    }
    /**
     * The SAS token of the Azure blob container.
     * 
    */
    public Optional<SecureStringResponse> sasToken() {
        return Optional.ofNullable(this.sasToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeCustomSetupScriptPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobContainerUri;
        private @Nullable SecureStringResponse sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeCustomSetupScriptPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerUri = defaults.blobContainerUri;
    	      this.sasToken = defaults.sasToken;
        }

        public Builder blobContainerUri(@Nullable String blobContainerUri) {
            this.blobContainerUri = blobContainerUri;
            return this;
        }
        public Builder sasToken(@Nullable SecureStringResponse sasToken) {
            this.sasToken = sasToken;
            return this;
        }        public IntegrationRuntimeCustomSetupScriptPropertiesResponse build() {
            return new IntegrationRuntimeCustomSetupScriptPropertiesResponse(blobContainerUri, sasToken);
        }
    }
}
