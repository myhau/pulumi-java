// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.orbital.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * Contact Name
     * 
     */
    @Import(name="contactName")
      private final @Nullable Output<String> contactName;

    public Output<String> contactName() {
        return this.contactName == null ? Codegen.empty() : this.contactName;
    }

    /**
     * The reference to the contact profile resource.
     * 
     */
    @Import(name="contactProfile", required=true)
      private final Output<ResourceReferenceArgs> contactProfile;

    public Output<ResourceReferenceArgs> contactProfile() {
        return this.contactProfile;
    }

    /**
     * Azure Ground Station name.
     * 
     */
    @Import(name="groundStationName", required=true)
      private final Output<String> groundStationName;

    public Output<String> groundStationName() {
        return this.groundStationName;
    }

    /**
     * Reservation end time of a contact.
     * 
     */
    @Import(name="reservationEndTime", required=true)
      private final Output<String> reservationEndTime;

    public Output<String> reservationEndTime() {
        return this.reservationEndTime;
    }

    /**
     * Reservation start time of a contact.
     * 
     */
    @Import(name="reservationStartTime", required=true)
      private final Output<String> reservationStartTime;

    public Output<String> reservationStartTime() {
        return this.reservationStartTime;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Spacecraft ID
     * 
     */
    @Import(name="spacecraftName", required=true)
      private final Output<String> spacecraftName;

    public Output<String> spacecraftName() {
        return this.spacecraftName;
    }

    public ContactArgs(
        @Nullable Output<String> contactName,
        Output<ResourceReferenceArgs> contactProfile,
        Output<String> groundStationName,
        Output<String> reservationEndTime,
        Output<String> reservationStartTime,
        Output<String> resourceGroupName,
        Output<String> spacecraftName) {
        this.contactName = contactName;
        this.contactProfile = Objects.requireNonNull(contactProfile, "expected parameter 'contactProfile' to be non-null");
        this.groundStationName = Objects.requireNonNull(groundStationName, "expected parameter 'groundStationName' to be non-null");
        this.reservationEndTime = Objects.requireNonNull(reservationEndTime, "expected parameter 'reservationEndTime' to be non-null");
        this.reservationStartTime = Objects.requireNonNull(reservationStartTime, "expected parameter 'reservationStartTime' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.spacecraftName = Objects.requireNonNull(spacecraftName, "expected parameter 'spacecraftName' to be non-null");
    }

    private ContactArgs() {
        this.contactName = Codegen.empty();
        this.contactProfile = Codegen.empty();
        this.groundStationName = Codegen.empty();
        this.reservationEndTime = Codegen.empty();
        this.reservationStartTime = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.spacecraftName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contactName;
        private Output<ResourceReferenceArgs> contactProfile;
        private Output<String> groundStationName;
        private Output<String> reservationEndTime;
        private Output<String> reservationStartTime;
        private Output<String> resourceGroupName;
        private Output<String> spacecraftName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.contactProfile = defaults.contactProfile;
    	      this.groundStationName = defaults.groundStationName;
    	      this.reservationEndTime = defaults.reservationEndTime;
    	      this.reservationStartTime = defaults.reservationStartTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.spacecraftName = defaults.spacecraftName;
        }

        public Builder contactName(@Nullable Output<String> contactName) {
            this.contactName = contactName;
            return this;
        }
        public Builder contactName(@Nullable String contactName) {
            this.contactName = Codegen.ofNullable(contactName);
            return this;
        }
        public Builder contactProfile(Output<ResourceReferenceArgs> contactProfile) {
            this.contactProfile = Objects.requireNonNull(contactProfile);
            return this;
        }
        public Builder contactProfile(ResourceReferenceArgs contactProfile) {
            this.contactProfile = Output.of(Objects.requireNonNull(contactProfile));
            return this;
        }
        public Builder groundStationName(Output<String> groundStationName) {
            this.groundStationName = Objects.requireNonNull(groundStationName);
            return this;
        }
        public Builder groundStationName(String groundStationName) {
            this.groundStationName = Output.of(Objects.requireNonNull(groundStationName));
            return this;
        }
        public Builder reservationEndTime(Output<String> reservationEndTime) {
            this.reservationEndTime = Objects.requireNonNull(reservationEndTime);
            return this;
        }
        public Builder reservationEndTime(String reservationEndTime) {
            this.reservationEndTime = Output.of(Objects.requireNonNull(reservationEndTime));
            return this;
        }
        public Builder reservationStartTime(Output<String> reservationStartTime) {
            this.reservationStartTime = Objects.requireNonNull(reservationStartTime);
            return this;
        }
        public Builder reservationStartTime(String reservationStartTime) {
            this.reservationStartTime = Output.of(Objects.requireNonNull(reservationStartTime));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder spacecraftName(Output<String> spacecraftName) {
            this.spacecraftName = Objects.requireNonNull(spacecraftName);
            return this;
        }
        public Builder spacecraftName(String spacecraftName) {
            this.spacecraftName = Output.of(Objects.requireNonNull(spacecraftName));
            return this;
        }        public ContactArgs build() {
            return new ContactArgs(contactName, contactProfile, groundStationName, reservationEndTime, reservationStartTime, resourceGroupName, spacecraftName);
        }
    }
}
