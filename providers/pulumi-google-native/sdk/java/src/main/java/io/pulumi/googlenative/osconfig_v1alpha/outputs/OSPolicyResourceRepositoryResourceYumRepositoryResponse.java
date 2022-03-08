// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceRepositoryResourceYumRepositoryResponse {
    /**
     * The location of the repository directory.
     * 
     */
    private final String baseUrl;
    /**
     * The display name of the repository.
     * 
     */
    private final String displayName;
    /**
     * URIs of GPG keys.
     * 
     */
    private final List<String> gpgKeys;

    @OutputCustomType.Constructor({"baseUrl","displayName","gpgKeys"})
    private OSPolicyResourceRepositoryResourceYumRepositoryResponse(
        String baseUrl,
        String displayName,
        List<String> gpgKeys) {
        this.baseUrl = baseUrl;
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
    }

    /**
     * The location of the repository directory.
     * 
    */
    public String getBaseUrl() {
        return this.baseUrl;
    }
    /**
     * The display name of the repository.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * URIs of GPG keys.
     * 
    */
    public List<String> getGpgKeys() {
        return this.gpgKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceYumRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private String displayName;
        private List<String> gpgKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceYumRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGpgKeys(List<String> gpgKeys) {
            this.gpgKeys = Objects.requireNonNull(gpgKeys);
            return this;
        }
        public OSPolicyResourceRepositoryResourceYumRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceYumRepositoryResponse(baseUrl, displayName, gpgKeys);
        }
    }
}
