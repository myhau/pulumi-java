// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserPoolDeviceConfiguration {
    /**
     * Whether a challenge is required on a new device. Only applicable to a new device.
     * 
     */
    private final @Nullable Boolean challengeRequiredOnNewDevice;
    /**
     * Whether a device is only remembered on user prompt. `false` equates to "Always" remember, `true` is "User Opt In," and not using a `device_configuration` block is "No."
     * 
     */
    private final @Nullable Boolean deviceOnlyRememberedOnUserPrompt;

    @OutputCustomType.Constructor({"challengeRequiredOnNewDevice","deviceOnlyRememberedOnUserPrompt"})
    private UserPoolDeviceConfiguration(
        @Nullable Boolean challengeRequiredOnNewDevice,
        @Nullable Boolean deviceOnlyRememberedOnUserPrompt) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * Whether a challenge is required on a new device. Only applicable to a new device.
     * 
     */
    public Optional<Boolean> getChallengeRequiredOnNewDevice() {
        return Optional.ofNullable(this.challengeRequiredOnNewDevice);
    }
    /**
     * Whether a device is only remembered on user prompt. `false` equates to "Always" remember, `true` is "User Opt In," and not using a `device_configuration` block is "No."
     * 
     */
    public Optional<Boolean> getDeviceOnlyRememberedOnUserPrompt() {
        return Optional.ofNullable(this.deviceOnlyRememberedOnUserPrompt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolDeviceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean challengeRequiredOnNewDevice;
        private @Nullable Boolean deviceOnlyRememberedOnUserPrompt;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolDeviceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.challengeRequiredOnNewDevice = defaults.challengeRequiredOnNewDevice;
    	      this.deviceOnlyRememberedOnUserPrompt = defaults.deviceOnlyRememberedOnUserPrompt;
        }

        public Builder setChallengeRequiredOnNewDevice(@Nullable Boolean challengeRequiredOnNewDevice) {
            this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
            return this;
        }

        public Builder setDeviceOnlyRememberedOnUserPrompt(@Nullable Boolean deviceOnlyRememberedOnUserPrompt) {
            this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
            return this;
        }
        public UserPoolDeviceConfiguration build() {
            return new UserPoolDeviceConfiguration(challengeRequiredOnNewDevice, deviceOnlyRememberedOnUserPrompt);
        }
    }
}
