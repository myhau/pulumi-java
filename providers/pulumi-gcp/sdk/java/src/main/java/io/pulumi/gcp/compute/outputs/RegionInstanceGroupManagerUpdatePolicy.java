// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionInstanceGroupManagerUpdatePolicy {
    /**
     * - The instance redistribution policy for regional managed instance groups. Valid values are: `"PROACTIVE"`, `"NONE"`. If `PROACTIVE` (default), the group attempts to maintain an even distribution of VM instances across zones in the region. If `NONE`, proactive redistribution is disabled.
     * 
     */
    private final @Nullable String instanceRedistributionType;
    /**
     * , The maximum number of instances that can be created above the specified targetSize during the update process. Conflicts with `max_surge_percent`. It has to be either 0 or at least equal to the number of zones.  If fixed values are used, at least one of `max_unavailable_fixed` or `max_surge_fixed` must be greater than 0.
     * 
     */
    private final @Nullable Integer maxSurgeFixed;
    /**
     * , The maximum number of instances(calculated as percentage) that can be created above the specified targetSize during the update process. Conflicts with `max_surge_fixed`. Percent value is only allowed for regional managed instance groups with size at least 10.
     * 
     */
    private final @Nullable Integer maxSurgePercent;
    /**
     * , The maximum number of instances that can be unavailable during the update process. Conflicts with `max_unavailable_percent`. It has to be either 0 or at least equal to the number of zones. If fixed values are used, at least one of `max_unavailable_fixed` or `max_surge_fixed` must be greater than 0.
     * 
     */
    private final @Nullable Integer maxUnavailableFixed;
    /**
     * , The maximum number of instances(calculated as percentage) that can be unavailable during the update process. Conflicts with `max_unavailable_fixed`. Percent value is only allowed for regional managed instance groups with size at least 10.
     * 
     */
    private final @Nullable Integer maxUnavailablePercent;
    /**
     * ), Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600]
     * 
     */
    private final @Nullable Integer minReadySec;
    /**
     * - Minimal action to be taken on an instance. You can specify either `RESTART` to restart existing instances or `REPLACE` to delete and create new instances from the target template. If you specify a `RESTART`, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    private final String minimalAction;
    /**
     * , The instance replacement method for managed instance groups. Valid values are: "RECREATE", "SUBSTITUTE". If SUBSTITUTE (default), the group replaces VM instances with new instances that have randomly generated names. If RECREATE, instance names are preserved.  You must also set max_unavailable_fixed or max_unavailable_percent to be greater than 0.
     * ***
     * 
     */
    private final @Nullable String replacementMethod;
    /**
     * - The type of update process. You can specify either `PROACTIVE` so that the instance group manager proactively executes actions in order to bring instances to their target versions or `OPPORTUNISTIC` so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"instanceRedistributionType","maxSurgeFixed","maxSurgePercent","maxUnavailableFixed","maxUnavailablePercent","minReadySec","minimalAction","replacementMethod","type"})
    private RegionInstanceGroupManagerUpdatePolicy(
        @Nullable String instanceRedistributionType,
        @Nullable Integer maxSurgeFixed,
        @Nullable Integer maxSurgePercent,
        @Nullable Integer maxUnavailableFixed,
        @Nullable Integer maxUnavailablePercent,
        @Nullable Integer minReadySec,
        String minimalAction,
        @Nullable String replacementMethod,
        String type) {
        this.instanceRedistributionType = instanceRedistributionType;
        this.maxSurgeFixed = maxSurgeFixed;
        this.maxSurgePercent = maxSurgePercent;
        this.maxUnavailableFixed = maxUnavailableFixed;
        this.maxUnavailablePercent = maxUnavailablePercent;
        this.minReadySec = minReadySec;
        this.minimalAction = minimalAction;
        this.replacementMethod = replacementMethod;
        this.type = type;
    }

    /**
     * - The instance redistribution policy for regional managed instance groups. Valid values are: `"PROACTIVE"`, `"NONE"`. If `PROACTIVE` (default), the group attempts to maintain an even distribution of VM instances across zones in the region. If `NONE`, proactive redistribution is disabled.
     * 
    */
    public Optional<String> getInstanceRedistributionType() {
        return Optional.ofNullable(this.instanceRedistributionType);
    }
    /**
     * , The maximum number of instances that can be created above the specified targetSize during the update process. Conflicts with `max_surge_percent`. It has to be either 0 or at least equal to the number of zones.  If fixed values are used, at least one of `max_unavailable_fixed` or `max_surge_fixed` must be greater than 0.
     * 
    */
    public Optional<Integer> getMaxSurgeFixed() {
        return Optional.ofNullable(this.maxSurgeFixed);
    }
    /**
     * , The maximum number of instances(calculated as percentage) that can be created above the specified targetSize during the update process. Conflicts with `max_surge_fixed`. Percent value is only allowed for regional managed instance groups with size at least 10.
     * 
    */
    public Optional<Integer> getMaxSurgePercent() {
        return Optional.ofNullable(this.maxSurgePercent);
    }
    /**
     * , The maximum number of instances that can be unavailable during the update process. Conflicts with `max_unavailable_percent`. It has to be either 0 or at least equal to the number of zones. If fixed values are used, at least one of `max_unavailable_fixed` or `max_surge_fixed` must be greater than 0.
     * 
    */
    public Optional<Integer> getMaxUnavailableFixed() {
        return Optional.ofNullable(this.maxUnavailableFixed);
    }
    /**
     * , The maximum number of instances(calculated as percentage) that can be unavailable during the update process. Conflicts with `max_unavailable_fixed`. Percent value is only allowed for regional managed instance groups with size at least 10.
     * 
    */
    public Optional<Integer> getMaxUnavailablePercent() {
        return Optional.ofNullable(this.maxUnavailablePercent);
    }
    /**
     * ), Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600]
     * 
    */
    public Optional<Integer> getMinReadySec() {
        return Optional.ofNullable(this.minReadySec);
    }
    /**
     * - Minimal action to be taken on an instance. You can specify either `RESTART` to restart existing instances or `REPLACE` to delete and create new instances from the target template. If you specify a `RESTART`, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
    */
    public String getMinimalAction() {
        return this.minimalAction;
    }
    /**
     * , The instance replacement method for managed instance groups. Valid values are: "RECREATE", "SUBSTITUTE". If SUBSTITUTE (default), the group replaces VM instances with new instances that have randomly generated names. If RECREATE, instance names are preserved.  You must also set max_unavailable_fixed or max_unavailable_percent to be greater than 0.
     * ***
     * 
    */
    public Optional<String> getReplacementMethod() {
        return Optional.ofNullable(this.replacementMethod);
    }
    /**
     * - The type of update process. You can specify either `PROACTIVE` so that the instance group manager proactively executes actions in order to bring instances to their target versions or `OPPORTUNISTIC` so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerUpdatePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceRedistributionType;
        private @Nullable Integer maxSurgeFixed;
        private @Nullable Integer maxSurgePercent;
        private @Nullable Integer maxUnavailableFixed;
        private @Nullable Integer maxUnavailablePercent;
        private @Nullable Integer minReadySec;
        private String minimalAction;
        private @Nullable String replacementMethod;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerUpdatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceRedistributionType = defaults.instanceRedistributionType;
    	      this.maxSurgeFixed = defaults.maxSurgeFixed;
    	      this.maxSurgePercent = defaults.maxSurgePercent;
    	      this.maxUnavailableFixed = defaults.maxUnavailableFixed;
    	      this.maxUnavailablePercent = defaults.maxUnavailablePercent;
    	      this.minReadySec = defaults.minReadySec;
    	      this.minimalAction = defaults.minimalAction;
    	      this.replacementMethod = defaults.replacementMethod;
    	      this.type = defaults.type;
        }

        public Builder setInstanceRedistributionType(@Nullable String instanceRedistributionType) {
            this.instanceRedistributionType = instanceRedistributionType;
            return this;
        }

        public Builder setMaxSurgeFixed(@Nullable Integer maxSurgeFixed) {
            this.maxSurgeFixed = maxSurgeFixed;
            return this;
        }

        public Builder setMaxSurgePercent(@Nullable Integer maxSurgePercent) {
            this.maxSurgePercent = maxSurgePercent;
            return this;
        }

        public Builder setMaxUnavailableFixed(@Nullable Integer maxUnavailableFixed) {
            this.maxUnavailableFixed = maxUnavailableFixed;
            return this;
        }

        public Builder setMaxUnavailablePercent(@Nullable Integer maxUnavailablePercent) {
            this.maxUnavailablePercent = maxUnavailablePercent;
            return this;
        }

        public Builder setMinReadySec(@Nullable Integer minReadySec) {
            this.minReadySec = minReadySec;
            return this;
        }

        public Builder setMinimalAction(String minimalAction) {
            this.minimalAction = Objects.requireNonNull(minimalAction);
            return this;
        }

        public Builder setReplacementMethod(@Nullable String replacementMethod) {
            this.replacementMethod = replacementMethod;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RegionInstanceGroupManagerUpdatePolicy build() {
            return new RegionInstanceGroupManagerUpdatePolicy(instanceRedistributionType, maxSurgeFixed, maxSurgePercent, maxUnavailableFixed, maxUnavailablePercent, minReadySec, minimalAction, replacementMethod, type);
        }
    }
}
