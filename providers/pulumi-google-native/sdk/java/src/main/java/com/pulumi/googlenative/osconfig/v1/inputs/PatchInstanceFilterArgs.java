// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1.inputs.PatchInstanceFilterGroupLabelArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A filter to target VM instances for patching. The targeted VMs must meet all criteria specified. So if both labels and zones are specified, the patch job targets only VMs with those labels and in those zones.
 * 
 */
public final class PatchInstanceFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchInstanceFilterArgs Empty = new PatchInstanceFilterArgs();

    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Boolean> all;

    /**
     * @return Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * 
     */
    @Import(name="groupLabels")
    private @Nullable Output<List<PatchInstanceFilterGroupLabelArgs>> groupLabels;

    /**
     * @return Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * 
     */
    public Optional<Output<List<PatchInstanceFilterGroupLabelArgs>>> groupLabels() {
        return Optional.ofNullable(this.groupLabels);
    }

    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix=&#34;prod-&#34;.
     * 
     */
    @Import(name="instanceNamePrefixes")
    private @Nullable Output<List<String>> instanceNamePrefixes;

    /**
     * @return Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix=&#34;prod-&#34;.
     * 
     */
    public Optional<Output<List<String>>> instanceNamePrefixes() {
        return Optional.ofNullable(this.instanceNamePrefixes);
    }

    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<String>> instances;

    /**
     * @return Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
     * 
     */
    public Optional<Output<List<String>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private PatchInstanceFilterArgs() {}

    private PatchInstanceFilterArgs(PatchInstanceFilterArgs $) {
        this.all = $.all;
        this.groupLabels = $.groupLabels;
        this.instanceNamePrefixes = $.instanceNamePrefixes;
        this.instances = $.instances;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchInstanceFilterArgs $;

        public Builder() {
            $ = new PatchInstanceFilterArgs();
        }

        public Builder(PatchInstanceFilterArgs defaults) {
            $ = new PatchInstanceFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all Target all VM instances in the project. If true, no other criteria is permitted.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all Target all VM instances in the project. If true, no other criteria is permitted.
         * 
         * @return builder
         * 
         */
        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        /**
         * @param groupLabels Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
         * 
         * @return builder
         * 
         */
        public Builder groupLabels(@Nullable Output<List<PatchInstanceFilterGroupLabelArgs>> groupLabels) {
            $.groupLabels = groupLabels;
            return this;
        }

        /**
         * @param groupLabels Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
         * 
         * @return builder
         * 
         */
        public Builder groupLabels(List<PatchInstanceFilterGroupLabelArgs> groupLabels) {
            return groupLabels(Output.of(groupLabels));
        }

        /**
         * @param groupLabels Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
         * 
         * @return builder
         * 
         */
        public Builder groupLabels(PatchInstanceFilterGroupLabelArgs... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }

        /**
         * @param instanceNamePrefixes Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix=&#34;prod-&#34;.
         * 
         * @return builder
         * 
         */
        public Builder instanceNamePrefixes(@Nullable Output<List<String>> instanceNamePrefixes) {
            $.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        /**
         * @param instanceNamePrefixes Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix=&#34;prod-&#34;.
         * 
         * @return builder
         * 
         */
        public Builder instanceNamePrefixes(List<String> instanceNamePrefixes) {
            return instanceNamePrefixes(Output.of(instanceNamePrefixes));
        }

        /**
         * @param instanceNamePrefixes Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix=&#34;prod-&#34;.
         * 
         * @return builder
         * 
         */
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }

        /**
         * @param instances Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<List<String>> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
         * 
         * @return builder
         * 
         */
        public Builder instances(List<String> instances) {
            return instances(Output.of(instances));
        }

        /**
         * @param instances Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
         * 
         * @return builder
         * 
         */
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param zones Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public PatchInstanceFilterArgs build() {
            return $;
        }
    }

}
