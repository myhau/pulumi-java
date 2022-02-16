// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.CapacityReservationFleetArgs;
import io.pulumi.awsnative.ec2.enums.CapacityReservationFleetInstanceMatchCriteria;
import io.pulumi.awsnative.ec2.enums.CapacityReservationFleetTenancy;
import io.pulumi.awsnative.ec2.outputs.CapacityReservationFleetInstanceTypeSpecification;
import io.pulumi.awsnative.ec2.outputs.CapacityReservationFleetTagSpecification;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:CapacityReservationFleet")
public class CapacityReservationFleet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allocationStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> allocationStrategy;

    public Output</* @Nullable */ String> getAllocationStrategy() {
        return this.allocationStrategy;
    }
    @OutputExport(name="capacityReservationFleetId", type=String.class, parameters={})
    private Output<String> capacityReservationFleetId;

    public Output<String> getCapacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }
    @OutputExport(name="endDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> endDate;

    public Output</* @Nullable */ String> getEndDate() {
        return this.endDate;
    }
    @OutputExport(name="instanceMatchCriteria", type=CapacityReservationFleetInstanceMatchCriteria.class, parameters={})
    private Output</* @Nullable */ CapacityReservationFleetInstanceMatchCriteria> instanceMatchCriteria;

    public Output</* @Nullable */ CapacityReservationFleetInstanceMatchCriteria> getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }
    @OutputExport(name="instanceTypeSpecifications", type=List.class, parameters={CapacityReservationFleetInstanceTypeSpecification.class})
    private Output</* @Nullable */ List<CapacityReservationFleetInstanceTypeSpecification>> instanceTypeSpecifications;

    public Output</* @Nullable */ List<CapacityReservationFleetInstanceTypeSpecification>> getInstanceTypeSpecifications() {
        return this.instanceTypeSpecifications;
    }
    @OutputExport(name="noRemoveEndDate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noRemoveEndDate;

    public Output</* @Nullable */ Boolean> getNoRemoveEndDate() {
        return this.noRemoveEndDate;
    }
    @OutputExport(name="removeEndDate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> removeEndDate;

    public Output</* @Nullable */ Boolean> getRemoveEndDate() {
        return this.removeEndDate;
    }
    @OutputExport(name="tagSpecifications", type=List.class, parameters={CapacityReservationFleetTagSpecification.class})
    private Output</* @Nullable */ List<CapacityReservationFleetTagSpecification>> tagSpecifications;

    public Output</* @Nullable */ List<CapacityReservationFleetTagSpecification>> getTagSpecifications() {
        return this.tagSpecifications;
    }
    @OutputExport(name="tenancy", type=CapacityReservationFleetTenancy.class, parameters={})
    private Output</* @Nullable */ CapacityReservationFleetTenancy> tenancy;

    public Output</* @Nullable */ CapacityReservationFleetTenancy> getTenancy() {
        return this.tenancy;
    }
    @OutputExport(name="totalTargetCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> totalTargetCapacity;

    public Output</* @Nullable */ Integer> getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public CapacityReservationFleet(String name, @Nullable CapacityReservationFleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:CapacityReservationFleet", name, args == null ? CapacityReservationFleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CapacityReservationFleet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:CapacityReservationFleet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CapacityReservationFleet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityReservationFleet(name, id, options);
    }
}