// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSourceResponse {
    /**
     * @return Collection of cryptographic digests for the contents of the artifact specified by invocation.configSource.uri.
     * 
     */
    private final Map<String,String> digest;
    /**
     * @return String identifying the entry point into the build.
     * 
     */
    private final String entryPoint;
    /**
     * @return URI indicating the identity of the source of the config.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSourceResponse(
        @CustomType.Parameter("digest") Map<String,String> digest,
        @CustomType.Parameter("entryPoint") String entryPoint,
        @CustomType.Parameter("uri") String uri) {
        this.digest = digest;
        this.entryPoint = entryPoint;
        this.uri = uri;
    }

    /**
     * @return Collection of cryptographic digests for the contents of the artifact specified by invocation.configSource.uri.
     * 
     */
    public Map<String,String> digest() {
        return this.digest;
    }
    /**
     * @return String identifying the entry point into the build.
     * 
     */
    public String entryPoint() {
        return this.entryPoint;
    }
    /**
     * @return URI indicating the identity of the source of the config.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String entryPoint;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.entryPoint = defaults.entryPoint;
    	      this.uri = defaults.uri;
        }

        public Builder digest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder entryPoint(String entryPoint) {
            this.entryPoint = Objects.requireNonNull(entryPoint);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSourceResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSourceResponse(digest, entryPoint, uri);
        }
    }
}
