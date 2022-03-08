// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.ScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListVirtualMachineApplicableSchedulesResult {
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The auto-shutdown schedule, if one has been set at the lab or lab resource level.
     * 
     */
    private final @Nullable ScheduleResponse labVmsShutdown;
    /**
     * The auto-startup schedule, if one has been set at the lab or lab resource level.
     * 
     */
    private final @Nullable ScheduleResponse labVmsStartup;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","labVmsShutdown","labVmsStartup","location","name","tags","type"})
    private ListVirtualMachineApplicableSchedulesResult(
        String id,
        @Nullable ScheduleResponse labVmsShutdown,
        @Nullable ScheduleResponse labVmsStartup,
        @Nullable String location,
        String name,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = id;
        this.labVmsShutdown = labVmsShutdown;
        this.labVmsStartup = labVmsStartup;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The auto-shutdown schedule, if one has been set at the lab or lab resource level.
     * 
    */
    public Optional<ScheduleResponse> getLabVmsShutdown() {
        return Optional.ofNullable(this.labVmsShutdown);
    }
    /**
     * The auto-startup schedule, if one has been set at the lab or lab resource level.
     * 
    */
    public Optional<ScheduleResponse> getLabVmsStartup() {
        return Optional.ofNullable(this.labVmsStartup);
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListVirtualMachineApplicableSchedulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ScheduleResponse labVmsShutdown;
        private @Nullable ScheduleResponse labVmsStartup;
        private @Nullable String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListVirtualMachineApplicableSchedulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labVmsShutdown = defaults.labVmsShutdown;
    	      this.labVmsStartup = defaults.labVmsStartup;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLabVmsShutdown(@Nullable ScheduleResponse labVmsShutdown) {
            this.labVmsShutdown = labVmsShutdown;
            return this;
        }

        public Builder setLabVmsStartup(@Nullable ScheduleResponse labVmsStartup) {
            this.labVmsStartup = labVmsStartup;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListVirtualMachineApplicableSchedulesResult build() {
            return new ListVirtualMachineApplicableSchedulesResult(id, labVmsShutdown, labVmsStartup, location, name, tags, type);
        }
    }
}
