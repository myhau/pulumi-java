// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.ImageRecipeEbsInstanceBlockDeviceSpecification;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageRecipeInstanceBlockDeviceMapping {
    private final @Nullable String deviceName;
    private final @Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs;
    private final @Nullable String noDevice;
    private final @Nullable String virtualName;

    @OutputCustomType.Constructor({"deviceName","ebs","noDevice","virtualName"})
    private ImageRecipeInstanceBlockDeviceMapping(
        @Nullable String deviceName,
        @Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs,
        @Nullable String noDevice,
        @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    public Optional<ImageRecipeEbsInstanceBlockDeviceSpecification> getEbs() {
        return Optional.ofNullable(this.ebs);
    }
    public Optional<String> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeInstanceBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeInstanceBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setEbs(@Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setNoDevice(@Nullable String noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public ImageRecipeInstanceBlockDeviceMapping build() {
            return new ImageRecipeInstanceBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}