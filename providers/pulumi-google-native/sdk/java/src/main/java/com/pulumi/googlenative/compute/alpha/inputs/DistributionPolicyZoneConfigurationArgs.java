// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionPolicyZoneConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionPolicyZoneConfigurationArgs Empty = new DistributionPolicyZoneConfigurationArgs();

    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private DistributionPolicyZoneConfigurationArgs() {}

    private DistributionPolicyZoneConfigurationArgs(DistributionPolicyZoneConfigurationArgs $) {
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionPolicyZoneConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionPolicyZoneConfigurationArgs $;

        public Builder() {
            $ = new DistributionPolicyZoneConfigurationArgs();
        }

        public Builder(DistributionPolicyZoneConfigurationArgs defaults) {
            $ = new DistributionPolicyZoneConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zone The URL of the zone. The zone must exist in the region where the managed instance group is located.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The URL of the zone. The zone must exist in the region where the managed instance group is located.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public DistributionPolicyZoneConfigurationArgs build() {
            return $;
        }
    }

}
