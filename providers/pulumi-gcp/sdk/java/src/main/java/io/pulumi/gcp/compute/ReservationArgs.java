// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @InputImport(name="shareSettings")
    private final @Nullable Input<ReservationShareSettingsArgs> shareSettings;

    public Input<ReservationShareSettingsArgs> getShareSettings() {
        return this.shareSettings == null ? Input.empty() : this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @InputImport(name="specificReservation", required=true)
    private final Input<ReservationSpecificReservationArgs> specificReservation;

    public Input<ReservationSpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation;
    }

    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @InputImport(name="specificReservationRequired")
    private final @Nullable Input<Boolean> specificReservationRequired;

    public Input<Boolean> getSpecificReservationRequired() {
        return this.specificReservationRequired == null ? Input.empty() : this.specificReservationRequired;
    }

    /**
     * The zone where the reservation is made.
     * 
     */
    @InputImport(name="zone", required=true)
    private final Input<String> zone;

    public Input<String> getZone() {
        return this.zone;
    }

    public ReservationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<ReservationShareSettingsArgs> shareSettings,
        Input<ReservationSpecificReservationArgs> specificReservation,
        @Nullable Input<Boolean> specificReservationRequired,
        Input<String> zone) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.shareSettings = shareSettings;
        this.specificReservation = Objects.requireNonNull(specificReservation, "expected parameter 'specificReservation' to be non-null");
        this.specificReservationRequired = specificReservationRequired;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private ReservationArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.shareSettings = Input.empty();
        this.specificReservation = Input.empty();
        this.specificReservationRequired = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<ReservationShareSettingsArgs> shareSettings;
        private Input<ReservationSpecificReservationArgs> specificReservation;
        private @Nullable Input<Boolean> specificReservationRequired;
        private Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setShareSettings(@Nullable Input<ReservationShareSettingsArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }

        public Builder setShareSettings(@Nullable ReservationShareSettingsArgs shareSettings) {
            this.shareSettings = Input.ofNullable(shareSettings);
            return this;
        }

        public Builder setSpecificReservation(Input<ReservationSpecificReservationArgs> specificReservation) {
            this.specificReservation = Objects.requireNonNull(specificReservation);
            return this;
        }

        public Builder setSpecificReservation(ReservationSpecificReservationArgs specificReservation) {
            this.specificReservation = Input.of(Objects.requireNonNull(specificReservation));
            return this;
        }

        public Builder setSpecificReservationRequired(@Nullable Input<Boolean> specificReservationRequired) {
            this.specificReservationRequired = specificReservationRequired;
            return this;
        }

        public Builder setSpecificReservationRequired(@Nullable Boolean specificReservationRequired) {
            this.specificReservationRequired = Input.ofNullable(specificReservationRequired);
            return this;
        }

        public Builder setZone(Input<String> zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Input.of(Objects.requireNonNull(zone));
            return this;
        }

        public ReservationArgs build() {
            return new ReservationArgs(description, name, project, shareSettings, specificReservation, specificReservationRequired, zone);
        }
    }
}
