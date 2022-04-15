// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.netapp.inputs.DailyScheduleArgs;
import io.pulumi.azurenative.netapp.inputs.HourlyScheduleArgs;
import io.pulumi.azurenative.netapp.inputs.MonthlyScheduleArgs;
import io.pulumi.azurenative.netapp.inputs.WeeklyScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotPolicyArgs Empty = new SnapshotPolicyArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Schedule for daily snapshots
     * 
     */
    @Import(name="dailySchedule")
      private final @Nullable Output<DailyScheduleArgs> dailySchedule;

    public Output<DailyScheduleArgs> dailySchedule() {
        return this.dailySchedule == null ? Codegen.empty() : this.dailySchedule;
    }

    /**
     * The property to decide policy is enabled or not
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Schedule for hourly snapshots
     * 
     */
    @Import(name="hourlySchedule")
      private final @Nullable Output<HourlyScheduleArgs> hourlySchedule;

    public Output<HourlyScheduleArgs> hourlySchedule() {
        return this.hourlySchedule == null ? Codegen.empty() : this.hourlySchedule;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Schedule for monthly snapshots
     * 
     */
    @Import(name="monthlySchedule")
      private final @Nullable Output<MonthlyScheduleArgs> monthlySchedule;

    public Output<MonthlyScheduleArgs> monthlySchedule() {
        return this.monthlySchedule == null ? Codegen.empty() : this.monthlySchedule;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the snapshot policy
     * 
     */
    @Import(name="snapshotPolicyName")
      private final @Nullable Output<String> snapshotPolicyName;

    public Output<String> snapshotPolicyName() {
        return this.snapshotPolicyName == null ? Codegen.empty() : this.snapshotPolicyName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Schedule for weekly snapshots
     * 
     */
    @Import(name="weeklySchedule")
      private final @Nullable Output<WeeklyScheduleArgs> weeklySchedule;

    public Output<WeeklyScheduleArgs> weeklySchedule() {
        return this.weeklySchedule == null ? Codegen.empty() : this.weeklySchedule;
    }

    public SnapshotPolicyArgs(
        Output<String> accountName,
        @Nullable Output<DailyScheduleArgs> dailySchedule,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<HourlyScheduleArgs> hourlySchedule,
        @Nullable Output<String> location,
        @Nullable Output<MonthlyScheduleArgs> monthlySchedule,
        Output<String> resourceGroupName,
        @Nullable Output<String> snapshotPolicyName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<WeeklyScheduleArgs> weeklySchedule) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dailySchedule = dailySchedule;
        this.enabled = enabled;
        this.hourlySchedule = hourlySchedule;
        this.location = location;
        this.monthlySchedule = monthlySchedule;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.snapshotPolicyName = snapshotPolicyName;
        this.tags = tags;
        this.weeklySchedule = weeklySchedule;
    }

    private SnapshotPolicyArgs() {
        this.accountName = Codegen.empty();
        this.dailySchedule = Codegen.empty();
        this.enabled = Codegen.empty();
        this.hourlySchedule = Codegen.empty();
        this.location = Codegen.empty();
        this.monthlySchedule = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.snapshotPolicyName = Codegen.empty();
        this.tags = Codegen.empty();
        this.weeklySchedule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<DailyScheduleArgs> dailySchedule;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<HourlyScheduleArgs> hourlySchedule;
        private @Nullable Output<String> location;
        private @Nullable Output<MonthlyScheduleArgs> monthlySchedule;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> snapshotPolicyName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<WeeklyScheduleArgs> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.enabled = defaults.enabled;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.location = defaults.location;
    	      this.monthlySchedule = defaults.monthlySchedule;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.snapshotPolicyName = defaults.snapshotPolicyName;
    	      this.tags = defaults.tags;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder dailySchedule(@Nullable Output<DailyScheduleArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }
        public Builder dailySchedule(@Nullable DailyScheduleArgs dailySchedule) {
            this.dailySchedule = Codegen.ofNullable(dailySchedule);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder hourlySchedule(@Nullable Output<HourlyScheduleArgs> hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }
        public Builder hourlySchedule(@Nullable HourlyScheduleArgs hourlySchedule) {
            this.hourlySchedule = Codegen.ofNullable(hourlySchedule);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder monthlySchedule(@Nullable Output<MonthlyScheduleArgs> monthlySchedule) {
            this.monthlySchedule = monthlySchedule;
            return this;
        }
        public Builder monthlySchedule(@Nullable MonthlyScheduleArgs monthlySchedule) {
            this.monthlySchedule = Codegen.ofNullable(monthlySchedule);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder snapshotPolicyName(@Nullable Output<String> snapshotPolicyName) {
            this.snapshotPolicyName = snapshotPolicyName;
            return this;
        }
        public Builder snapshotPolicyName(@Nullable String snapshotPolicyName) {
            this.snapshotPolicyName = Codegen.ofNullable(snapshotPolicyName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder weeklySchedule(@Nullable Output<WeeklyScheduleArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }
        public Builder weeklySchedule(@Nullable WeeklyScheduleArgs weeklySchedule) {
            this.weeklySchedule = Codegen.ofNullable(weeklySchedule);
            return this;
        }        public SnapshotPolicyArgs build() {
            return new SnapshotPolicyArgs(accountName, dailySchedule, enabled, hourlySchedule, location, monthlySchedule, resourceGroupName, snapshotPolicyName, tags, weeklySchedule);
        }
    }
}
