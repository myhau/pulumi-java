// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for Cloud Armor.
 * 
 */
public final class SecurityPolicyCloudArmorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyCloudArmorConfigArgs Empty = new SecurityPolicyCloudArmorConfigArgs();

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    @Import(name="enableMl")
    private @Nullable Output<Boolean> enableMl;

    /**
     * @return If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    public Optional<Output<Boolean>> enableMl() {
        return Optional.ofNullable(this.enableMl);
    }

    private SecurityPolicyCloudArmorConfigArgs() {}

    private SecurityPolicyCloudArmorConfigArgs(SecurityPolicyCloudArmorConfigArgs $) {
        this.enableMl = $.enableMl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyCloudArmorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyCloudArmorConfigArgs $;

        public Builder() {
            $ = new SecurityPolicyCloudArmorConfigArgs();
        }

        public Builder(SecurityPolicyCloudArmorConfigArgs defaults) {
            $ = new SecurityPolicyCloudArmorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableMl If set to true, enables Cloud Armor Machine Learning.
         * 
         * @return builder
         * 
         */
        public Builder enableMl(@Nullable Output<Boolean> enableMl) {
            $.enableMl = enableMl;
            return this;
        }

        /**
         * @param enableMl If set to true, enables Cloud Armor Machine Learning.
         * 
         * @return builder
         * 
         */
        public Builder enableMl(Boolean enableMl) {
            return enableMl(Output.of(enableMl));
        }

        public SecurityPolicyCloudArmorConfigArgs build() {
            return $;
        }
    }

}
