// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs Empty = new RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs();

    /**
     * A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
     * 
     */
    @InputImport(name="allEffective")
    private final @Nullable Input<Boolean> allEffective;

    public Input<Boolean> getAllEffective() {
        return this.allEffective == null ? Input.empty() : this.allEffective;
    }

    public RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs(@Nullable Input<Boolean> allEffective) {
        this.allEffective = allEffective;
    }

    private RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs() {
        this.allEffective = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allEffective;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allEffective = defaults.allEffective;
        }

        public Builder setAllEffective(@Nullable Input<Boolean> allEffective) {
            this.allEffective = allEffective;
            return this;
        }

        public Builder setAllEffective(@Nullable Boolean allEffective) {
            this.allEffective = Input.ofNullable(allEffective);
            return this;
        }

        public RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs build() {
            return new RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs(allEffective);
        }
    }
}
