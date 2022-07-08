// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.inputs.StandardRolloutPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for blue-green upgrade.
 * 
 */
public final class BlueGreenSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlueGreenSettingsArgs Empty = new BlueGreenSettingsArgs();

    /**
     * Time needed after draining entire blue pool. After this period, blue pool will be cleaned up.
     * 
     */
    @Import(name="nodePoolSoakDuration")
    private @Nullable Output<String> nodePoolSoakDuration;

    /**
     * @return Time needed after draining entire blue pool. After this period, blue pool will be cleaned up.
     * 
     */
    public Optional<Output<String>> nodePoolSoakDuration() {
        return Optional.ofNullable(this.nodePoolSoakDuration);
    }

    /**
     * Standard policy for the blue-green upgrade.
     * 
     */
    @Import(name="standardRolloutPolicy")
    private @Nullable Output<StandardRolloutPolicyArgs> standardRolloutPolicy;

    /**
     * @return Standard policy for the blue-green upgrade.
     * 
     */
    public Optional<Output<StandardRolloutPolicyArgs>> standardRolloutPolicy() {
        return Optional.ofNullable(this.standardRolloutPolicy);
    }

    private BlueGreenSettingsArgs() {}

    private BlueGreenSettingsArgs(BlueGreenSettingsArgs $) {
        this.nodePoolSoakDuration = $.nodePoolSoakDuration;
        this.standardRolloutPolicy = $.standardRolloutPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlueGreenSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlueGreenSettingsArgs $;

        public Builder() {
            $ = new BlueGreenSettingsArgs();
        }

        public Builder(BlueGreenSettingsArgs defaults) {
            $ = new BlueGreenSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodePoolSoakDuration Time needed after draining entire blue pool. After this period, blue pool will be cleaned up.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolSoakDuration(@Nullable Output<String> nodePoolSoakDuration) {
            $.nodePoolSoakDuration = nodePoolSoakDuration;
            return this;
        }

        /**
         * @param nodePoolSoakDuration Time needed after draining entire blue pool. After this period, blue pool will be cleaned up.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolSoakDuration(String nodePoolSoakDuration) {
            return nodePoolSoakDuration(Output.of(nodePoolSoakDuration));
        }

        /**
         * @param standardRolloutPolicy Standard policy for the blue-green upgrade.
         * 
         * @return builder
         * 
         */
        public Builder standardRolloutPolicy(@Nullable Output<StandardRolloutPolicyArgs> standardRolloutPolicy) {
            $.standardRolloutPolicy = standardRolloutPolicy;
            return this;
        }

        /**
         * @param standardRolloutPolicy Standard policy for the blue-green upgrade.
         * 
         * @return builder
         * 
         */
        public Builder standardRolloutPolicy(StandardRolloutPolicyArgs standardRolloutPolicy) {
            return standardRolloutPolicy(Output.of(standardRolloutPolicy));
        }

        public BlueGreenSettingsArgs build() {
            return $;
        }
    }

}
