// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.cloudtrail;

import io.pulumi.aws.cloudtrail.Trail;
import io.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailArgs Empty = new TrailArgs();

    @InputImport(name="advancedEventSelectors")
    private final @Nullable Input<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors;

    public Input<List<TrailAdvancedEventSelectorArgs>> getAdvancedEventSelectors() {
        return this.advancedEventSelectors == null ? Input.empty() : this.advancedEventSelectors;
    }

    @InputImport(name="trail")
    private final @Nullable Input<Trail> trail;

    public Input<Trail> getTrail() {
        return this.trail == null ? Input.empty() : this.trail;
    }

    public TrailArgs(
        @Nullable Input<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors,
        @Nullable Input<Trail> trail) {
        this.advancedEventSelectors = advancedEventSelectors;
        this.trail = trail;
    }

    private TrailArgs() {
        this.advancedEventSelectors = Input.empty();
        this.trail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors;
        private @Nullable Input<Trail> trail;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedEventSelectors = defaults.advancedEventSelectors;
    	      this.trail = defaults.trail;
        }

        public Builder setAdvancedEventSelectors(@Nullable Input<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors) {
            this.advancedEventSelectors = advancedEventSelectors;
            return this;
        }

        public Builder setAdvancedEventSelectors(@Nullable List<TrailAdvancedEventSelectorArgs> advancedEventSelectors) {
            this.advancedEventSelectors = Input.ofNullable(advancedEventSelectors);
            return this;
        }

        public Builder setTrail(@Nullable Input<Trail> trail) {
            this.trail = trail;
            return this;
        }

        public Builder setTrail(@Nullable Trail trail) {
            this.trail = Input.ofNullable(trail);
            return this;
        }

        public TrailArgs build() {
            return new TrailArgs(advancedEventSelectors, trail);
        }
    }
}