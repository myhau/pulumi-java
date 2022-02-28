// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.CapacityReservationArgs;
import io.pulumi.aws.ec2.inputs.CapacityReservationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an EC2 Capacity Reservation. This allows you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Capacity Reservations can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/capacityReservation:CapacityReservation web cr-0123456789abcdef0
 * ```
 * 
 */
@ResourceType(type="aws:ec2/capacityReservation:CapacityReservation")
public class CapacityReservation extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Capacity Reservation.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Capacity Reservation.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Availability Zone in which to create the Capacity Reservation.
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create the Capacity Reservation.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     * 
     */
    @OutputExport(name="ebsOptimized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ebsOptimized;

    /**
     * @return Indicates whether the Capacity Reservation supports EBS-optimized instances.
     * 
     */
    public Output</* @Nullable */ Boolean> getEbsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @OutputExport(name="endDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> endDate;

    /**
     * @return The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    public Output</* @Nullable */ String> getEndDate() {
        return this.endDate;
    }
    /**
     * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
     * 
     */
    @OutputExport(name="endDateType", type=String.class, parameters={})
    private Output</* @Nullable */ String> endDateType;

    /**
     * @return Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
     * 
     */
    public Output</* @Nullable */ String> getEndDateType() {
        return this.endDateType;
    }
    /**
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * 
     */
    @OutputExport(name="ephemeralStorage", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ephemeralStorage;

    /**
     * @return Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * 
     */
    public Output</* @Nullable */ Boolean> getEphemeralStorage() {
        return this.ephemeralStorage;
    }
    /**
     * The number of instances for which to reserve capacity.
     * 
     */
    @OutputExport(name="instanceCount", type=Integer.class, parameters={})
    private Output<Integer> instanceCount;

    /**
     * @return The number of instances for which to reserve capacity.
     * 
     */
    public Output<Integer> getInstanceCount() {
        return this.instanceCount;
    }
    /**
     * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
     * 
     */
    @OutputExport(name="instanceMatchCriteria", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceMatchCriteria;

    /**
     * @return Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
     * 
     */
    public Output</* @Nullable */ String> getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }
    /**
     * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
     * 
     */
    @OutputExport(name="instancePlatform", type=String.class, parameters={})
    private Output<String> instancePlatform;

    /**
     * @return The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
     * 
     */
    public Output<String> getInstancePlatform() {
        return this.instancePlatform;
    }
    /**
     * The instance type for which to reserve capacity.
     * 
     */
    @OutputExport(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The instance type for which to reserve capacity.
     * 
     */
    public Output<String> getInstanceType() {
        return this.instanceType;
    }
    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     * 
     */
    @OutputExport(name="outpostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> outpostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     * 
     */
    public Output</* @Nullable */ String> getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * The ID of the AWS account that owns the Capacity Reservation.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the Capacity Reservation.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
     * 
     */
    @OutputExport(name="tenancy", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenancy;

    /**
     * @return Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
     * 
     */
    public Output</* @Nullable */ String> getTenancy() {
        return this.tenancy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityReservation(String name) {
        this(name, CapacityReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityReservation(String name, CapacityReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityReservation(String name, CapacityReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/capacityReservation:CapacityReservation", name, args == null ? CapacityReservationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CapacityReservation(String name, Input<String> id, @Nullable CapacityReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/capacityReservation:CapacityReservation", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CapacityReservation get(String name, Input<String> id, @Nullable CapacityReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityReservation(name, id, state, options);
    }
}
