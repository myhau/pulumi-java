// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectoryWorkspaceAccessProperties {
    /**
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeAndroid;
    /**
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeChromeos;
    /**
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeIos;
    /**
     * Indicates whether users can use Linux clients to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeLinux;
    /**
     * Indicates whether users can use macOS clients to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeOsx;
    /**
     * Indicates whether users can access their WorkSpaces through a web browser.
     * 
     */
    private final @Nullable String deviceTypeWeb;
    /**
     * Indicates whether users can use Windows clients to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeWindows;
    /**
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * 
     */
    private final @Nullable String deviceTypeZeroclient;

    @OutputCustomType.Constructor({"deviceTypeAndroid","deviceTypeChromeos","deviceTypeIos","deviceTypeLinux","deviceTypeOsx","deviceTypeWeb","deviceTypeWindows","deviceTypeZeroclient"})
    private DirectoryWorkspaceAccessProperties(
        @Nullable String deviceTypeAndroid,
        @Nullable String deviceTypeChromeos,
        @Nullable String deviceTypeIos,
        @Nullable String deviceTypeLinux,
        @Nullable String deviceTypeOsx,
        @Nullable String deviceTypeWeb,
        @Nullable String deviceTypeWindows,
        @Nullable String deviceTypeZeroclient) {
        this.deviceTypeAndroid = deviceTypeAndroid;
        this.deviceTypeChromeos = deviceTypeChromeos;
        this.deviceTypeIos = deviceTypeIos;
        this.deviceTypeLinux = deviceTypeLinux;
        this.deviceTypeOsx = deviceTypeOsx;
        this.deviceTypeWeb = deviceTypeWeb;
        this.deviceTypeWindows = deviceTypeWindows;
        this.deviceTypeZeroclient = deviceTypeZeroclient;
    }

    /**
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeAndroid() {
        return Optional.ofNullable(this.deviceTypeAndroid);
    }
    /**
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeChromeos() {
        return Optional.ofNullable(this.deviceTypeChromeos);
    }
    /**
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeIos() {
        return Optional.ofNullable(this.deviceTypeIos);
    }
    /**
     * Indicates whether users can use Linux clients to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeLinux() {
        return Optional.ofNullable(this.deviceTypeLinux);
    }
    /**
     * Indicates whether users can use macOS clients to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeOsx() {
        return Optional.ofNullable(this.deviceTypeOsx);
    }
    /**
     * Indicates whether users can access their WorkSpaces through a web browser.
     * 
     */
    public Optional<String> getDeviceTypeWeb() {
        return Optional.ofNullable(this.deviceTypeWeb);
    }
    /**
     * Indicates whether users can use Windows clients to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeWindows() {
        return Optional.ofNullable(this.deviceTypeWindows);
    }
    /**
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * 
     */
    public Optional<String> getDeviceTypeZeroclient() {
        return Optional.ofNullable(this.deviceTypeZeroclient);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryWorkspaceAccessProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceTypeAndroid;
        private @Nullable String deviceTypeChromeos;
        private @Nullable String deviceTypeIos;
        private @Nullable String deviceTypeLinux;
        private @Nullable String deviceTypeOsx;
        private @Nullable String deviceTypeWeb;
        private @Nullable String deviceTypeWindows;
        private @Nullable String deviceTypeZeroclient;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryWorkspaceAccessProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceTypeAndroid = defaults.deviceTypeAndroid;
    	      this.deviceTypeChromeos = defaults.deviceTypeChromeos;
    	      this.deviceTypeIos = defaults.deviceTypeIos;
    	      this.deviceTypeLinux = defaults.deviceTypeLinux;
    	      this.deviceTypeOsx = defaults.deviceTypeOsx;
    	      this.deviceTypeWeb = defaults.deviceTypeWeb;
    	      this.deviceTypeWindows = defaults.deviceTypeWindows;
    	      this.deviceTypeZeroclient = defaults.deviceTypeZeroclient;
        }

        public Builder setDeviceTypeAndroid(@Nullable String deviceTypeAndroid) {
            this.deviceTypeAndroid = deviceTypeAndroid;
            return this;
        }

        public Builder setDeviceTypeChromeos(@Nullable String deviceTypeChromeos) {
            this.deviceTypeChromeos = deviceTypeChromeos;
            return this;
        }

        public Builder setDeviceTypeIos(@Nullable String deviceTypeIos) {
            this.deviceTypeIos = deviceTypeIos;
            return this;
        }

        public Builder setDeviceTypeLinux(@Nullable String deviceTypeLinux) {
            this.deviceTypeLinux = deviceTypeLinux;
            return this;
        }

        public Builder setDeviceTypeOsx(@Nullable String deviceTypeOsx) {
            this.deviceTypeOsx = deviceTypeOsx;
            return this;
        }

        public Builder setDeviceTypeWeb(@Nullable String deviceTypeWeb) {
            this.deviceTypeWeb = deviceTypeWeb;
            return this;
        }

        public Builder setDeviceTypeWindows(@Nullable String deviceTypeWindows) {
            this.deviceTypeWindows = deviceTypeWindows;
            return this;
        }

        public Builder setDeviceTypeZeroclient(@Nullable String deviceTypeZeroclient) {
            this.deviceTypeZeroclient = deviceTypeZeroclient;
            return this;
        }
        public DirectoryWorkspaceAccessProperties build() {
            return new DirectoryWorkspaceAccessProperties(deviceTypeAndroid, deviceTypeChromeos, deviceTypeIos, deviceTypeLinux, deviceTypeOsx, deviceTypeWeb, deviceTypeWindows, deviceTypeZeroclient);
        }
    }
}
