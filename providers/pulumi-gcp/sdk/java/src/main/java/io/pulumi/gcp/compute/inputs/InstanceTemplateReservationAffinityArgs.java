// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinitySpecificReservationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateReservationAffinityArgs Empty = new InstanceTemplateReservationAffinityArgs();

    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
     */
    @InputImport(name="specificReservation")
    private final @Nullable Input<InstanceTemplateReservationAffinitySpecificReservationArgs> specificReservation;

    public Input<InstanceTemplateReservationAffinitySpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Input.empty() : this.specificReservation;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public InstanceTemplateReservationAffinityArgs(
        @Nullable Input<InstanceTemplateReservationAffinitySpecificReservationArgs> specificReservation,
        Input<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceTemplateReservationAffinityArgs() {
        this.specificReservation = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceTemplateReservationAffinitySpecificReservationArgs> specificReservation;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder setSpecificReservation(@Nullable Input<InstanceTemplateReservationAffinitySpecificReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder setSpecificReservation(@Nullable InstanceTemplateReservationAffinitySpecificReservationArgs specificReservation) {
            this.specificReservation = Input.ofNullable(specificReservation);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public InstanceTemplateReservationAffinityArgs build() {
            return new InstanceTemplateReservationAffinityArgs(specificReservation, type);
        }
    }
}
