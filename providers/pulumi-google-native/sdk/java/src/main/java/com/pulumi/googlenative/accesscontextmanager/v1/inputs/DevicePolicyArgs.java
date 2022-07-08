// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager.v1.enums.DevicePolicyAllowedDeviceManagementLevelsItem;
import com.pulumi.googlenative.accesscontextmanager.v1.enums.DevicePolicyAllowedEncryptionStatusesItem;
import com.pulumi.googlenative.accesscontextmanager.v1.inputs.OsConstraintArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * `DevicePolicy` specifies device specific restrictions necessary to acquire a given access level. A `DevicePolicy` specifies requirements for requests from devices to be granted access levels, it does not do any enforcement on the device. `DevicePolicy` acts as an AND over all specified fields, and each repeated field is an OR over its elements. Any unset fields are ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will be true for requests originating from encrypted Linux desktops and encrypted Windows desktops.
 * 
 */
public final class DevicePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePolicyArgs Empty = new DevicePolicyArgs();

    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
     */
    @Import(name="allowedDeviceManagementLevels")
    private @Nullable Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels;

    /**
     * @return Allowed device management levels, an empty list allows all management levels.
     * 
     */
    public Optional<Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>>> allowedDeviceManagementLevels() {
        return Optional.ofNullable(this.allowedDeviceManagementLevels);
    }

    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    @Import(name="allowedEncryptionStatuses")
    private @Nullable Output<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses;

    /**
     * @return Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    public Optional<Output<List<DevicePolicyAllowedEncryptionStatusesItem>>> allowedEncryptionStatuses() {
        return Optional.ofNullable(this.allowedEncryptionStatuses);
    }

    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    @Import(name="osConstraints")
    private @Nullable Output<List<OsConstraintArgs>> osConstraints;

    /**
     * @return Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    public Optional<Output<List<OsConstraintArgs>>> osConstraints() {
        return Optional.ofNullable(this.osConstraints);
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval")
    private @Nullable Output<Boolean> requireAdminApproval;

    /**
     * @return Whether the device needs to be approved by the customer admin.
     * 
     */
    public Optional<Output<Boolean>> requireAdminApproval() {
        return Optional.ofNullable(this.requireAdminApproval);
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned")
    private @Nullable Output<Boolean> requireCorpOwned;

    /**
     * @return Whether the device needs to be corp owned.
     * 
     */
    public Optional<Output<Boolean>> requireCorpOwned() {
        return Optional.ofNullable(this.requireCorpOwned);
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    @Import(name="requireScreenlock")
    private @Nullable Output<Boolean> requireScreenlock;

    /**
     * @return Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requireScreenlock() {
        return Optional.ofNullable(this.requireScreenlock);
    }

    private DevicePolicyArgs() {}

    private DevicePolicyArgs(DevicePolicyArgs $) {
        this.allowedDeviceManagementLevels = $.allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = $.allowedEncryptionStatuses;
        this.osConstraints = $.osConstraints;
        this.requireAdminApproval = $.requireAdminApproval;
        this.requireCorpOwned = $.requireCorpOwned;
        this.requireScreenlock = $.requireScreenlock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePolicyArgs $;

        public Builder() {
            $ = new DevicePolicyArgs();
        }

        public Builder(DevicePolicyArgs defaults) {
            $ = new DevicePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedDeviceManagementLevels Allowed device management levels, an empty list allows all management levels.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(@Nullable Output<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels) {
            $.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }

        /**
         * @param allowedDeviceManagementLevels Allowed device management levels, an empty list allows all management levels.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(List<DevicePolicyAllowedDeviceManagementLevelsItem> allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(Output.of(allowedDeviceManagementLevels));
        }

        /**
         * @param allowedDeviceManagementLevels Allowed device management levels, an empty list allows all management levels.
         * 
         * @return builder
         * 
         */
        public Builder allowedDeviceManagementLevels(DevicePolicyAllowedDeviceManagementLevelsItem... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }

        /**
         * @param allowedEncryptionStatuses Allowed encryptions statuses, an empty list allows all statuses.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(@Nullable Output<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses) {
            $.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }

        /**
         * @param allowedEncryptionStatuses Allowed encryptions statuses, an empty list allows all statuses.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(List<DevicePolicyAllowedEncryptionStatusesItem> allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(Output.of(allowedEncryptionStatuses));
        }

        /**
         * @param allowedEncryptionStatuses Allowed encryptions statuses, an empty list allows all statuses.
         * 
         * @return builder
         * 
         */
        public Builder allowedEncryptionStatuses(DevicePolicyAllowedEncryptionStatusesItem... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }

        /**
         * @param osConstraints Allowed OS versions, an empty list allows all types and all versions.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(@Nullable Output<List<OsConstraintArgs>> osConstraints) {
            $.osConstraints = osConstraints;
            return this;
        }

        /**
         * @param osConstraints Allowed OS versions, an empty list allows all types and all versions.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(List<OsConstraintArgs> osConstraints) {
            return osConstraints(Output.of(osConstraints));
        }

        /**
         * @param osConstraints Allowed OS versions, an empty list allows all types and all versions.
         * 
         * @return builder
         * 
         */
        public Builder osConstraints(OsConstraintArgs... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }

        /**
         * @param requireAdminApproval Whether the device needs to be approved by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder requireAdminApproval(@Nullable Output<Boolean> requireAdminApproval) {
            $.requireAdminApproval = requireAdminApproval;
            return this;
        }

        /**
         * @param requireAdminApproval Whether the device needs to be approved by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder requireAdminApproval(Boolean requireAdminApproval) {
            return requireAdminApproval(Output.of(requireAdminApproval));
        }

        /**
         * @param requireCorpOwned Whether the device needs to be corp owned.
         * 
         * @return builder
         * 
         */
        public Builder requireCorpOwned(@Nullable Output<Boolean> requireCorpOwned) {
            $.requireCorpOwned = requireCorpOwned;
            return this;
        }

        /**
         * @param requireCorpOwned Whether the device needs to be corp owned.
         * 
         * @return builder
         * 
         */
        public Builder requireCorpOwned(Boolean requireCorpOwned) {
            return requireCorpOwned(Output.of(requireCorpOwned));
        }

        /**
         * @param requireScreenlock Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireScreenlock(@Nullable Output<Boolean> requireScreenlock) {
            $.requireScreenlock = requireScreenlock;
            return this;
        }

        /**
         * @param requireScreenlock Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireScreenlock(Boolean requireScreenlock) {
            return requireScreenlock(Output.of(requireScreenlock));
        }

        public DevicePolicyArgs build() {
            return $;
        }
    }

}
