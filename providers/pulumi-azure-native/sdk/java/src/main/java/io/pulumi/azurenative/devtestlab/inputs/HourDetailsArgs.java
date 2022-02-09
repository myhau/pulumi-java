// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HourDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final HourDetailsArgs Empty = new HourDetailsArgs();

    @InputImport(name="minute")
    private final @Nullable Input<Integer> minute;

    public Input<Integer> getMinute() {
        return this.minute == null ? Input.empty() : this.minute;
    }

    public HourDetailsArgs(@Nullable Input<Integer> minute) {
        this.minute = minute;
    }

    private HourDetailsArgs() {
        this.minute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HourDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minute;

        public Builder() {
    	      // Empty
        }

        public Builder(HourDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minute = defaults.minute;
        }

        public Builder setMinute(@Nullable Input<Integer> minute) {
            this.minute = minute;
            return this;
        }

        public Builder setMinute(@Nullable Integer minute) {
            this.minute = Input.ofNullable(minute);
            return this;
        }

        public HourDetailsArgs build() {
            return new HourDetailsArgs(minute);
        }
    }
}