// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.redis.v1.inputs.WeeklyMaintenanceWindowArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Maintenance policy for an instance.
 * 
 */
public final class MaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenancePolicyArgs Empty = new MaintenancePolicyArgs();

    /**
     * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
     * 
     */
    @Import(name="weeklyMaintenanceWindow")
    private @Nullable Output<List<WeeklyMaintenanceWindowArgs>> weeklyMaintenanceWindow;

    /**
     * @return Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
     * 
     */
    public Optional<Output<List<WeeklyMaintenanceWindowArgs>>> weeklyMaintenanceWindow() {
        return Optional.ofNullable(this.weeklyMaintenanceWindow);
    }

    private MaintenancePolicyArgs() {}

    private MaintenancePolicyArgs(MaintenancePolicyArgs $) {
        this.description = $.description;
        this.weeklyMaintenanceWindow = $.weeklyMaintenanceWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenancePolicyArgs $;

        public Builder() {
            $ = new MaintenancePolicyArgs();
        }

        public Builder(MaintenancePolicyArgs defaults) {
            $ = new MaintenancePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param weeklyMaintenanceWindow Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceWindow(@Nullable Output<List<WeeklyMaintenanceWindowArgs>> weeklyMaintenanceWindow) {
            $.weeklyMaintenanceWindow = weeklyMaintenanceWindow;
            return this;
        }

        /**
         * @param weeklyMaintenanceWindow Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceWindow(List<WeeklyMaintenanceWindowArgs> weeklyMaintenanceWindow) {
            return weeklyMaintenanceWindow(Output.of(weeklyMaintenanceWindow));
        }

        /**
         * @param weeklyMaintenanceWindow Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
         * 
         * @return builder
         * 
         */
        public Builder weeklyMaintenanceWindow(WeeklyMaintenanceWindowArgs... weeklyMaintenanceWindow) {
            return weeklyMaintenanceWindow(List.of(weeklyMaintenanceWindow));
        }

        public MaintenancePolicyArgs build() {
            return $;
        }
    }

}
