// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OsDiskImageResponse {
    /**
     * OS operating system type.
     * 
     */
    private final String operatingSystem;
    /**
     * SAS key for source blob.
     * 
     */
    private final String sourceBlobSasUri;

    @CustomType.Constructor
    private OsDiskImageResponse(
        @CustomType.Parameter("operatingSystem") String operatingSystem,
        @CustomType.Parameter("sourceBlobSasUri") String sourceBlobSasUri) {
        this.operatingSystem = operatingSystem;
        this.sourceBlobSasUri = sourceBlobSasUri;
    }

    /**
     * OS operating system type.
     * 
    */
    public String operatingSystem() {
        return this.operatingSystem;
    }
    /**
     * SAS key for source blob.
     * 
    */
    public String sourceBlobSasUri() {
        return this.sourceBlobSasUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operatingSystem;
        private String sourceBlobSasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsDiskImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.sourceBlobSasUri = defaults.sourceBlobSasUri;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }
        public Builder sourceBlobSasUri(String sourceBlobSasUri) {
            this.sourceBlobSasUri = Objects.requireNonNull(sourceBlobSasUri);
            return this;
        }        public OsDiskImageResponse build() {
            return new OsDiskImageResponse(operatingSystem, sourceBlobSasUri);
        }
    }
}
