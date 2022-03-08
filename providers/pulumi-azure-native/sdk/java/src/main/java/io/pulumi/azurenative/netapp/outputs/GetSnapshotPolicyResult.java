// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.azurenative.netapp.outputs.DailyScheduleResponse;
import io.pulumi.azurenative.netapp.outputs.HourlyScheduleResponse;
import io.pulumi.azurenative.netapp.outputs.MonthlyScheduleResponse;
import io.pulumi.azurenative.netapp.outputs.WeeklyScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSnapshotPolicyResult {
    /**
     * Schedule for daily snapshots
     * 
     */
    private final @Nullable DailyScheduleResponse dailySchedule;
    /**
     * The property to decide policy is enabled or not
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Schedule for hourly snapshots
     * 
     */
    private final @Nullable HourlyScheduleResponse hourlySchedule;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Schedule for monthly snapshots
     * 
     */
    private final @Nullable MonthlyScheduleResponse monthlySchedule;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Schedule for weekly snapshots
     * 
     */
    private final @Nullable WeeklyScheduleResponse weeklySchedule;

    @OutputCustomType.Constructor({"dailySchedule","enabled","hourlySchedule","id","location","monthlySchedule","name","provisioningState","tags","type","weeklySchedule"})
    private GetSnapshotPolicyResult(
        @Nullable DailyScheduleResponse dailySchedule,
        @Nullable Boolean enabled,
        @Nullable HourlyScheduleResponse hourlySchedule,
        String id,
        String location,
        @Nullable MonthlyScheduleResponse monthlySchedule,
        String name,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable WeeklyScheduleResponse weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.enabled = enabled;
        this.hourlySchedule = hourlySchedule;
        this.id = id;
        this.location = location;
        this.monthlySchedule = monthlySchedule;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.weeklySchedule = weeklySchedule;
    }

    /**
     * Schedule for daily snapshots
     * 
    */
    public Optional<DailyScheduleResponse> getDailySchedule() {
        return Optional.ofNullable(this.dailySchedule);
    }
    /**
     * The property to decide policy is enabled or not
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Schedule for hourly snapshots
     * 
    */
    public Optional<HourlyScheduleResponse> getHourlySchedule() {
        return Optional.ofNullable(this.hourlySchedule);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Schedule for monthly snapshots
     * 
    */
    public Optional<MonthlyScheduleResponse> getMonthlySchedule() {
        return Optional.ofNullable(this.monthlySchedule);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Schedule for weekly snapshots
     * 
    */
    public Optional<WeeklyScheduleResponse> getWeeklySchedule() {
        return Optional.ofNullable(this.weeklySchedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DailyScheduleResponse dailySchedule;
        private @Nullable Boolean enabled;
        private @Nullable HourlyScheduleResponse hourlySchedule;
        private String id;
        private String location;
        private @Nullable MonthlyScheduleResponse monthlySchedule;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable WeeklyScheduleResponse weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.enabled = defaults.enabled;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.monthlySchedule = defaults.monthlySchedule;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder setDailySchedule(@Nullable DailyScheduleResponse dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setHourlySchedule(@Nullable HourlyScheduleResponse hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMonthlySchedule(@Nullable MonthlyScheduleResponse monthlySchedule) {
            this.monthlySchedule = monthlySchedule;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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

        public Builder setWeeklySchedule(@Nullable WeeklyScheduleResponse weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }
        public GetSnapshotPolicyResult build() {
            return new GetSnapshotPolicyResult(dailySchedule, enabled, hourlySchedule, id, location, monthlySchedule, name, provisioningState, tags, type, weeklySchedule);
        }
    }
}
