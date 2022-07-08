// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration.v1.enums.ComputeEngineTargetDefaultsDiskType;
import com.pulumi.googlenative.vmmigration.v1.enums.ComputeEngineTargetDefaultsLicenseType;
import com.pulumi.googlenative.vmmigration.v1.inputs.ComputeSchedulingArgs;
import com.pulumi.googlenative.vmmigration.v1.inputs.NetworkInterfaceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ComputeEngineTargetDefaults is a collection of details for creating a VM in a target Compute Engine project.
 * 
 */
public final class ComputeEngineTargetDefaultsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeEngineTargetDefaultsArgs Empty = new ComputeEngineTargetDefaultsArgs();

    /**
     * Additional licenses to assign to the VM.
     * 
     */
    @Import(name="additionalLicenses")
    private @Nullable Output<List<String>> additionalLicenses;

    /**
     * @return Additional licenses to assign to the VM.
     * 
     */
    public Optional<Output<List<String>>> additionalLicenses() {
        return Optional.ofNullable(this.additionalLicenses);
    }

    /**
     * Compute instance scheduling information (if empty default is used).
     * 
     */
    @Import(name="computeScheduling")
    private @Nullable Output<ComputeSchedulingArgs> computeScheduling;

    /**
     * @return Compute instance scheduling information (if empty default is used).
     * 
     */
    public Optional<Output<ComputeSchedulingArgs>> computeScheduling() {
        return Optional.ofNullable(this.computeScheduling);
    }

    /**
     * The disk type to use in the VM.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<ComputeEngineTargetDefaultsDiskType> diskType;

    /**
     * @return The disk type to use in the VM.
     * 
     */
    public Optional<Output<ComputeEngineTargetDefaultsDiskType>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The hostname to assign to the VM.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The hostname to assign to the VM.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * A map of labels to associate with the VM.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A map of labels to associate with the VM.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The license type to use in OS adaptation.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<ComputeEngineTargetDefaultsLicenseType> licenseType;

    /**
     * @return The license type to use in OS adaptation.
     * 
     */
    public Optional<Output<ComputeEngineTargetDefaultsLicenseType>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * The machine type to create the VM with.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return The machine type to create the VM with.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * The machine type series to create the VM with.
     * 
     */
    @Import(name="machineTypeSeries")
    private @Nullable Output<String> machineTypeSeries;

    /**
     * @return The machine type series to create the VM with.
     * 
     */
    public Optional<Output<String>> machineTypeSeries() {
        return Optional.ofNullable(this.machineTypeSeries);
    }

    /**
     * The metadata key/value pairs to assign to the VM.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return The metadata key/value pairs to assign to the VM.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * List of NICs connected to this VM.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return List of NICs connected to this VM.
     * 
     */
    public Optional<Output<List<NetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * A map of network tags to associate with the VM.
     * 
     */
    @Import(name="networkTags")
    private @Nullable Output<List<String>> networkTags;

    /**
     * @return A map of network tags to associate with the VM.
     * 
     */
    public Optional<Output<List<String>>> networkTags() {
        return Optional.ofNullable(this.networkTags);
    }

    /**
     * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    @Import(name="secureBoot")
    private @Nullable Output<Boolean> secureBoot;

    /**
     * @return Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    public Optional<Output<Boolean>> secureBoot() {
        return Optional.ofNullable(this.secureBoot);
    }

    /**
     * The service account to associate the VM with.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The service account to associate the VM with.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
     */
    @Import(name="targetProject")
    private @Nullable Output<String> targetProject;

    /**
     * @return The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
     */
    public Optional<Output<String>> targetProject() {
        return Optional.ofNullable(this.targetProject);
    }

    /**
     * The name of the VM to create.
     * 
     */
    @Import(name="vmName")
    private @Nullable Output<String> vmName;

    /**
     * @return The name of the VM to create.
     * 
     */
    public Optional<Output<String>> vmName() {
        return Optional.ofNullable(this.vmName);
    }

    /**
     * The zone in which to create the VM.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone in which to create the VM.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ComputeEngineTargetDefaultsArgs() {}

    private ComputeEngineTargetDefaultsArgs(ComputeEngineTargetDefaultsArgs $) {
        this.additionalLicenses = $.additionalLicenses;
        this.computeScheduling = $.computeScheduling;
        this.diskType = $.diskType;
        this.hostname = $.hostname;
        this.labels = $.labels;
        this.licenseType = $.licenseType;
        this.machineType = $.machineType;
        this.machineTypeSeries = $.machineTypeSeries;
        this.metadata = $.metadata;
        this.networkInterfaces = $.networkInterfaces;
        this.networkTags = $.networkTags;
        this.secureBoot = $.secureBoot;
        this.serviceAccount = $.serviceAccount;
        this.targetProject = $.targetProject;
        this.vmName = $.vmName;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeEngineTargetDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDefaultsArgs $;

        public Builder() {
            $ = new ComputeEngineTargetDefaultsArgs();
        }

        public Builder(ComputeEngineTargetDefaultsArgs defaults) {
            $ = new ComputeEngineTargetDefaultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalLicenses Additional licenses to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder additionalLicenses(@Nullable Output<List<String>> additionalLicenses) {
            $.additionalLicenses = additionalLicenses;
            return this;
        }

        /**
         * @param additionalLicenses Additional licenses to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder additionalLicenses(List<String> additionalLicenses) {
            return additionalLicenses(Output.of(additionalLicenses));
        }

        /**
         * @param additionalLicenses Additional licenses to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder additionalLicenses(String... additionalLicenses) {
            return additionalLicenses(List.of(additionalLicenses));
        }

        /**
         * @param computeScheduling Compute instance scheduling information (if empty default is used).
         * 
         * @return builder
         * 
         */
        public Builder computeScheduling(@Nullable Output<ComputeSchedulingArgs> computeScheduling) {
            $.computeScheduling = computeScheduling;
            return this;
        }

        /**
         * @param computeScheduling Compute instance scheduling information (if empty default is used).
         * 
         * @return builder
         * 
         */
        public Builder computeScheduling(ComputeSchedulingArgs computeScheduling) {
            return computeScheduling(Output.of(computeScheduling));
        }

        /**
         * @param diskType The disk type to use in the VM.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<ComputeEngineTargetDefaultsDiskType> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The disk type to use in the VM.
         * 
         * @return builder
         * 
         */
        public Builder diskType(ComputeEngineTargetDefaultsDiskType diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param hostname The hostname to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param labels A map of labels to associate with the VM.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A map of labels to associate with the VM.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param licenseType The license type to use in OS adaptation.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<ComputeEngineTargetDefaultsLicenseType> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType The license type to use in OS adaptation.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(ComputeEngineTargetDefaultsLicenseType licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param machineType The machine type to create the VM with.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The machine type to create the VM with.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param machineTypeSeries The machine type series to create the VM with.
         * 
         * @return builder
         * 
         */
        public Builder machineTypeSeries(@Nullable Output<String> machineTypeSeries) {
            $.machineTypeSeries = machineTypeSeries;
            return this;
        }

        /**
         * @param machineTypeSeries The machine type series to create the VM with.
         * 
         * @return builder
         * 
         */
        public Builder machineTypeSeries(String machineTypeSeries) {
            return machineTypeSeries(Output.of(machineTypeSeries));
        }

        /**
         * @param metadata The metadata key/value pairs to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata key/value pairs to assign to the VM.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param networkInterfaces List of NICs connected to this VM.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces List of NICs connected to this VM.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<NetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces List of NICs connected to this VM.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param networkTags A map of network tags to associate with the VM.
         * 
         * @return builder
         * 
         */
        public Builder networkTags(@Nullable Output<List<String>> networkTags) {
            $.networkTags = networkTags;
            return this;
        }

        /**
         * @param networkTags A map of network tags to associate with the VM.
         * 
         * @return builder
         * 
         */
        public Builder networkTags(List<String> networkTags) {
            return networkTags(Output.of(networkTags));
        }

        /**
         * @param networkTags A map of network tags to associate with the VM.
         * 
         * @return builder
         * 
         */
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }

        /**
         * @param secureBoot Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
         * 
         * @return builder
         * 
         */
        public Builder secureBoot(@Nullable Output<Boolean> secureBoot) {
            $.secureBoot = secureBoot;
            return this;
        }

        /**
         * @param secureBoot Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
         * 
         * @return builder
         * 
         */
        public Builder secureBoot(Boolean secureBoot) {
            return secureBoot(Output.of(secureBoot));
        }

        /**
         * @param serviceAccount The service account to associate the VM with.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The service account to associate the VM with.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param targetProject The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
         * 
         * @return builder
         * 
         */
        public Builder targetProject(@Nullable Output<String> targetProject) {
            $.targetProject = targetProject;
            return this;
        }

        /**
         * @param targetProject The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
         * 
         * @return builder
         * 
         */
        public Builder targetProject(String targetProject) {
            return targetProject(Output.of(targetProject));
        }

        /**
         * @param vmName The name of the VM to create.
         * 
         * @return builder
         * 
         */
        public Builder vmName(@Nullable Output<String> vmName) {
            $.vmName = vmName;
            return this;
        }

        /**
         * @param vmName The name of the VM to create.
         * 
         * @return builder
         * 
         */
        public Builder vmName(String vmName) {
            return vmName(Output.of(vmName));
        }

        /**
         * @param zone The zone in which to create the VM.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone in which to create the VM.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ComputeEngineTargetDefaultsArgs build() {
            return $;
        }
    }

}
