// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.TerminateNotificationProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledEventsProfileResponse {
    /**
     * Specifies Terminate Scheduled Event related configurations.
     * 
     */
    private final @Nullable TerminateNotificationProfileResponse terminateNotificationProfile;

    @CustomType.Constructor
    private ScheduledEventsProfileResponse(@CustomType.Parameter("terminateNotificationProfile") @Nullable TerminateNotificationProfileResponse terminateNotificationProfile) {
        this.terminateNotificationProfile = terminateNotificationProfile;
    }

    /**
     * Specifies Terminate Scheduled Event related configurations.
     * 
    */
    public Optional<TerminateNotificationProfileResponse> terminateNotificationProfile() {
        return Optional.ofNullable(this.terminateNotificationProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledEventsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TerminateNotificationProfileResponse terminateNotificationProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledEventsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.terminateNotificationProfile = defaults.terminateNotificationProfile;
        }

        public Builder terminateNotificationProfile(@Nullable TerminateNotificationProfileResponse terminateNotificationProfile) {
            this.terminateNotificationProfile = terminateNotificationProfile;
            return this;
        }        public ScheduledEventsProfileResponse build() {
            return new ScheduledEventsProfileResponse(terminateNotificationProfile);
        }
    }
}
