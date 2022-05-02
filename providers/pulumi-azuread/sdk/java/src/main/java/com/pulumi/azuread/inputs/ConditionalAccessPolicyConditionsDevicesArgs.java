// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.azuread.inputs.ConditionalAccessPolicyConditionsDevicesFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConditionalAccessPolicyConditionsDevicesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionalAccessPolicyConditionsDevicesArgs Empty = new ConditionalAccessPolicyConditionsDevicesArgs();

    /**
     * A `filter` block as described below. A `filter` block can be added to an existing policy, but removing the `filter` block forces a new resource to be created.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<ConditionalAccessPolicyConditionsDevicesFilterArgs> filter;

    /**
     * @return A `filter` block as described below. A `filter` block can be added to an existing policy, but removing the `filter` block forces a new resource to be created.
     * 
     */
    public Optional<Output<ConditionalAccessPolicyConditionsDevicesFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    private ConditionalAccessPolicyConditionsDevicesArgs() {}

    private ConditionalAccessPolicyConditionsDevicesArgs(ConditionalAccessPolicyConditionsDevicesArgs $) {
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionalAccessPolicyConditionsDevicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionalAccessPolicyConditionsDevicesArgs $;

        public Builder() {
            $ = new ConditionalAccessPolicyConditionsDevicesArgs();
        }

        public Builder(ConditionalAccessPolicyConditionsDevicesArgs defaults) {
            $ = new ConditionalAccessPolicyConditionsDevicesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A `filter` block as described below. A `filter` block can be added to an existing policy, but removing the `filter` block forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<ConditionalAccessPolicyConditionsDevicesFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A `filter` block as described below. A `filter` block can be added to an existing policy, but removing the `filter` block forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filter(ConditionalAccessPolicyConditionsDevicesFilterArgs filter) {
            return filter(Output.of(filter));
        }

        public ConditionalAccessPolicyConditionsDevicesArgs build() {
            return $;
        }
    }

}
