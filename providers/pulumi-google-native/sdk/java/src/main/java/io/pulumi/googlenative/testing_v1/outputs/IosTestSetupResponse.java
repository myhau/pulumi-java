// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import io.pulumi.googlenative.testing_v1.outputs.IosDeviceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class IosTestSetupResponse {
    /**
     * iOS apps to install in addition to those being directly tested.
     * 
     */
    private final List<FileReferenceResponse> additionalIpas;
    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    private final String networkProfile;
    /**
     * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (such as /private/var/mobile/Media) or within an accessible directory inside the app's filesystem (such as /Documents) by specifying the bundle ID.
     * 
     */
    private final List<IosDeviceFileResponse> pullDirectories;
    /**
     * List of files to push to the device before starting the test.
     * 
     */
    private final List<IosDeviceFileResponse> pushFiles;

    @OutputCustomType.Constructor
    private IosTestSetupResponse(
        @OutputCustomType.Parameter("additionalIpas") List<FileReferenceResponse> additionalIpas,
        @OutputCustomType.Parameter("networkProfile") String networkProfile,
        @OutputCustomType.Parameter("pullDirectories") List<IosDeviceFileResponse> pullDirectories,
        @OutputCustomType.Parameter("pushFiles") List<IosDeviceFileResponse> pushFiles) {
        this.additionalIpas = additionalIpas;
        this.networkProfile = networkProfile;
        this.pullDirectories = pullDirectories;
        this.pushFiles = pushFiles;
    }

    /**
     * iOS apps to install in addition to those being directly tested.
     * 
    */
    public List<FileReferenceResponse> getAdditionalIpas() {
        return this.additionalIpas;
    }
    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
    */
    public String getNetworkProfile() {
        return this.networkProfile;
    }
    /**
     * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (such as /private/var/mobile/Media) or within an accessible directory inside the app's filesystem (such as /Documents) by specifying the bundle ID.
     * 
    */
    public List<IosDeviceFileResponse> getPullDirectories() {
        return this.pullDirectories;
    }
    /**
     * List of files to push to the device before starting the test.
     * 
    */
    public List<IosDeviceFileResponse> getPushFiles() {
        return this.pushFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileReferenceResponse> additionalIpas;
        private String networkProfile;
        private List<IosDeviceFileResponse> pullDirectories;
        private List<IosDeviceFileResponse> pushFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIpas = defaults.additionalIpas;
    	      this.networkProfile = defaults.networkProfile;
    	      this.pullDirectories = defaults.pullDirectories;
    	      this.pushFiles = defaults.pushFiles;
        }

        public Builder setAdditionalIpas(List<FileReferenceResponse> additionalIpas) {
            this.additionalIpas = Objects.requireNonNull(additionalIpas);
            return this;
        }

        public Builder setNetworkProfile(String networkProfile) {
            this.networkProfile = Objects.requireNonNull(networkProfile);
            return this;
        }

        public Builder setPullDirectories(List<IosDeviceFileResponse> pullDirectories) {
            this.pullDirectories = Objects.requireNonNull(pullDirectories);
            return this;
        }

        public Builder setPushFiles(List<IosDeviceFileResponse> pushFiles) {
            this.pushFiles = Objects.requireNonNull(pushFiles);
            return this;
        }
        public IosTestSetupResponse build() {
            return new IosTestSetupResponse(additionalIpas, networkProfile, pullDirectories, pushFiles);
        }
    }
}
