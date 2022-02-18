// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentRecurringScheduleWeeklyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleWeeklyGetArgs Empty = new PatchDeploymentRecurringScheduleWeeklyGetArgs();

    /**
     * A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @InputImport(name="dayOfWeek", required=true)
    private final Input<String> dayOfWeek;

    public Input<String> getDayOfWeek() {
        return this.dayOfWeek;
    }

    public PatchDeploymentRecurringScheduleWeeklyGetArgs(Input<String> dayOfWeek) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
    }

    private PatchDeploymentRecurringScheduleWeeklyGetArgs() {
        this.dayOfWeek = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleWeeklyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dayOfWeek;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleWeeklyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        public Builder setDayOfWeek(Input<String> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Input.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }

        public PatchDeploymentRecurringScheduleWeeklyGetArgs build() {
            return new PatchDeploymentRecurringScheduleWeeklyGetArgs(dayOfWeek);
        }
    }
}
