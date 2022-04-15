// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeContainerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVolumeContainerArgs Empty = new GetVolumeContainerArgs();

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
      private final String managerName;

    public String managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the volume container.
     * 
     */
    @Import(name="volumeContainerName", required=true)
      private final String volumeContainerName;

    public String volumeContainerName() {
        return this.volumeContainerName;
    }

    public GetVolumeContainerArgs(
        String deviceName,
        String managerName,
        String resourceGroupName,
        String volumeContainerName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.volumeContainerName = Objects.requireNonNull(volumeContainerName, "expected parameter 'volumeContainerName' to be non-null");
    }

    private GetVolumeContainerArgs() {
        this.deviceName = null;
        this.managerName = null;
        this.resourceGroupName = null;
        this.volumeContainerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String managerName;
        private String resourceGroupName;
        private String volumeContainerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeContainerName = defaults.volumeContainerName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder managerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder volumeContainerName(String volumeContainerName) {
            this.volumeContainerName = Objects.requireNonNull(volumeContainerName);
            return this;
        }        public GetVolumeContainerArgs build() {
            return new GetVolumeContainerArgs(deviceName, managerName, resourceGroupName, volumeContainerName);
        }
    }
}
