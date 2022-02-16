// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ReservationArgs;
import io.pulumi.gcp.compute.inputs.ReservationState;
import io.pulumi.gcp.compute.outputs.ReservationShareSettings;
import io.pulumi.gcp.compute.outputs.ReservationSpecificReservation;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/reservation:Reservation")
public class Reservation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="commitment", type=String.class, parameters={})
    private Output<String> commitment;

    public Output<String> getCommitment() {
        return this.commitment;
    }
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="shareSettings", type=ReservationShareSettings.class, parameters={})
    private Output<ReservationShareSettings> shareSettings;

    public Output<ReservationShareSettings> getShareSettings() {
        return this.shareSettings;
    }
    @OutputExport(name="specificReservation", type=ReservationSpecificReservation.class, parameters={})
    private Output<ReservationSpecificReservation> specificReservation;

    public Output<ReservationSpecificReservation> getSpecificReservation() {
        return this.specificReservation;
    }
    @OutputExport(name="specificReservationRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> specificReservationRequired;

    public Output</* @Nullable */ Boolean> getSpecificReservationRequired() {
        return this.specificReservationRequired;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    public Output<String> getZone() {
        return this.zone;
    }

    public Reservation(String name, ReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/reservation:Reservation", name, args == null ? ReservationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Reservation(String name, Input<String> id, @Nullable ReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/reservation:Reservation", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Reservation get(String name, Input<String> id, @Nullable ReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, state, options);
    }
}