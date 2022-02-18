// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionPerInstanceConfigState extends io.pulumi.resources.ResourceArgs {

    public static final RegionPerInstanceConfigState Empty = new RegionPerInstanceConfigState();

    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @InputImport(name="minimalAction")
    private final @Nullable Input<String> minimalAction;

    public Input<String> getMinimalAction() {
        return this.minimalAction == null ? Input.empty() : this.minimalAction;
    }

    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @InputImport(name="mostDisruptiveAllowedAction")
    private final @Nullable Input<String> mostDisruptiveAllowedAction;

    public Input<String> getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction == null ? Input.empty() : this.mostDisruptiveAllowedAction;
    }

    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="preservedState")
    private final @Nullable Input<RegionPerInstanceConfigPreservedStateGetArgs> preservedState;

    public Input<RegionPerInstanceConfigPreservedStateGetArgs> getPreservedState() {
        return this.preservedState == null ? Input.empty() : this.preservedState;
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
     * Region where the containing instance group manager is located
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The region instance group manager this instance config is part of.
     * 
     */
    @InputImport(name="regionInstanceGroupManager")
    private final @Nullable Input<String> regionInstanceGroupManager;

    public Input<String> getRegionInstanceGroupManager() {
        return this.regionInstanceGroupManager == null ? Input.empty() : this.regionInstanceGroupManager;
    }

    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @InputImport(name="removeInstanceStateOnDestroy")
    private final @Nullable Input<Boolean> removeInstanceStateOnDestroy;

    public Input<Boolean> getRemoveInstanceStateOnDestroy() {
        return this.removeInstanceStateOnDestroy == null ? Input.empty() : this.removeInstanceStateOnDestroy;
    }

    public RegionPerInstanceConfigState(
        @Nullable Input<String> minimalAction,
        @Nullable Input<String> mostDisruptiveAllowedAction,
        @Nullable Input<String> name,
        @Nullable Input<RegionPerInstanceConfigPreservedStateGetArgs> preservedState,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> regionInstanceGroupManager,
        @Nullable Input<Boolean> removeInstanceStateOnDestroy) {
        this.minimalAction = minimalAction;
        this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
        this.name = name;
        this.preservedState = preservedState;
        this.project = project;
        this.region = region;
        this.regionInstanceGroupManager = regionInstanceGroupManager;
        this.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
    }

    private RegionPerInstanceConfigState() {
        this.minimalAction = Input.empty();
        this.mostDisruptiveAllowedAction = Input.empty();
        this.name = Input.empty();
        this.preservedState = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.regionInstanceGroupManager = Input.empty();
        this.removeInstanceStateOnDestroy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionPerInstanceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> minimalAction;
        private @Nullable Input<String> mostDisruptiveAllowedAction;
        private @Nullable Input<String> name;
        private @Nullable Input<RegionPerInstanceConfigPreservedStateGetArgs> preservedState;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> regionInstanceGroupManager;
        private @Nullable Input<Boolean> removeInstanceStateOnDestroy;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionPerInstanceConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimalAction = defaults.minimalAction;
    	      this.mostDisruptiveAllowedAction = defaults.mostDisruptiveAllowedAction;
    	      this.name = defaults.name;
    	      this.preservedState = defaults.preservedState;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.regionInstanceGroupManager = defaults.regionInstanceGroupManager;
    	      this.removeInstanceStateOnDestroy = defaults.removeInstanceStateOnDestroy;
        }

        public Builder setMinimalAction(@Nullable Input<String> minimalAction) {
            this.minimalAction = minimalAction;
            return this;
        }

        public Builder setMinimalAction(@Nullable String minimalAction) {
            this.minimalAction = Input.ofNullable(minimalAction);
            return this;
        }

        public Builder setMostDisruptiveAllowedAction(@Nullable Input<String> mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }

        public Builder setMostDisruptiveAllowedAction(@Nullable String mostDisruptiveAllowedAction) {
            this.mostDisruptiveAllowedAction = Input.ofNullable(mostDisruptiveAllowedAction);
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

        public Builder setPreservedState(@Nullable Input<RegionPerInstanceConfigPreservedStateGetArgs> preservedState) {
            this.preservedState = preservedState;
            return this;
        }

        public Builder setPreservedState(@Nullable RegionPerInstanceConfigPreservedStateGetArgs preservedState) {
            this.preservedState = Input.ofNullable(preservedState);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRegionInstanceGroupManager(@Nullable Input<String> regionInstanceGroupManager) {
            this.regionInstanceGroupManager = regionInstanceGroupManager;
            return this;
        }

        public Builder setRegionInstanceGroupManager(@Nullable String regionInstanceGroupManager) {
            this.regionInstanceGroupManager = Input.ofNullable(regionInstanceGroupManager);
            return this;
        }

        public Builder setRemoveInstanceStateOnDestroy(@Nullable Input<Boolean> removeInstanceStateOnDestroy) {
            this.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
            return this;
        }

        public Builder setRemoveInstanceStateOnDestroy(@Nullable Boolean removeInstanceStateOnDestroy) {
            this.removeInstanceStateOnDestroy = Input.ofNullable(removeInstanceStateOnDestroy);
            return this;
        }

        public RegionPerInstanceConfigState build() {
            return new RegionPerInstanceConfigState(minimalAction, mostDisruptiveAllowedAction, name, preservedState, project, region, regionInstanceGroupManager, removeInstanceStateOnDestroy);
        }
    }
}
