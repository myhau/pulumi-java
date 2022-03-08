// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.ActiveDirectoryPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFilesIdentityBasedAuthenticationResponse {
    /**
     * Required if choose AD.
     * 
     */
    private final @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;
    /**
     * Indicates the directory service used.
     * 
     */
    private final String directoryServiceOptions;

    @OutputCustomType.Constructor({"activeDirectoryProperties","directoryServiceOptions"})
    private AzureFilesIdentityBasedAuthenticationResponse(
        @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties,
        String directoryServiceOptions) {
        this.activeDirectoryProperties = activeDirectoryProperties;
        this.directoryServiceOptions = directoryServiceOptions;
    }

    /**
     * Required if choose AD.
     * 
    */
    public Optional<ActiveDirectoryPropertiesResponse> getActiveDirectoryProperties() {
        return Optional.ofNullable(this.activeDirectoryProperties);
    }
    /**
     * Indicates the directory service used.
     * 
    */
    public String getDirectoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;
        private String directoryServiceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryProperties = defaults.activeDirectoryProperties;
    	      this.directoryServiceOptions = defaults.directoryServiceOptions;
        }

        public Builder setActiveDirectoryProperties(@Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties) {
            this.activeDirectoryProperties = activeDirectoryProperties;
            return this;
        }

        public Builder setDirectoryServiceOptions(String directoryServiceOptions) {
            this.directoryServiceOptions = Objects.requireNonNull(directoryServiceOptions);
            return this;
        }
        public AzureFilesIdentityBasedAuthenticationResponse build() {
            return new AzureFilesIdentityBasedAuthenticationResponse(activeDirectoryProperties, directoryServiceOptions);
        }
    }
}
