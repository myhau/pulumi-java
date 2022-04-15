// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties to access the artifacts using an Azure Storage SAS URI.
 * 
 */
public final class SasAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SasAuthenticationResponse Empty = new SasAuthenticationResponse();

    /**
     * The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    @Import(name="sasUri", required=true)
      private final String sasUri;

    public String sasUri() {
        return this.sasUri;
    }

    /**
     * The authentication type
     * Expected value is 'Sas'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SasAuthenticationResponse(
        String sasUri,
        String type) {
        this.sasUri = Objects.requireNonNull(sasUri, "expected parameter 'sasUri' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SasAuthenticationResponse() {
        this.sasUri = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sasUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SasAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
    	      this.type = defaults.type;
        }

        public Builder sasUri(String sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SasAuthenticationResponse build() {
            return new SasAuthenticationResponse(sasUri, type);
        }
    }
}
