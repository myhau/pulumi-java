// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.aws.connect.outputs.QuickConnectQuickConnectConfigPhoneConfig;
import io.pulumi.aws.connect.outputs.QuickConnectQuickConnectConfigQueueConfig;
import io.pulumi.aws.connect.outputs.QuickConnectQuickConnectConfigUserConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class QuickConnectQuickConnectConfig {
    /**
     * Specifies the phone configuration of the Quick Connect. This is required only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    private final @Nullable List<QuickConnectQuickConnectConfigPhoneConfig> phoneConfigs;
    /**
     * Specifies the queue configuration of the Quick Connect. This is required only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    private final @Nullable List<QuickConnectQuickConnectConfigQueueConfig> queueConfigs;
    /**
     * Specifies the configuration type of the quick connect. valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    private final String quickConnectType;
    /**
     * Specifies the user configuration of the Quick Connect. This is required only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    private final @Nullable List<QuickConnectQuickConnectConfigUserConfig> userConfigs;

    @OutputCustomType.Constructor({"phoneConfigs","queueConfigs","quickConnectType","userConfigs"})
    private QuickConnectQuickConnectConfig(
        @Nullable List<QuickConnectQuickConnectConfigPhoneConfig> phoneConfigs,
        @Nullable List<QuickConnectQuickConnectConfigQueueConfig> queueConfigs,
        String quickConnectType,
        @Nullable List<QuickConnectQuickConnectConfigUserConfig> userConfigs) {
        this.phoneConfigs = phoneConfigs;
        this.queueConfigs = queueConfigs;
        this.quickConnectType = Objects.requireNonNull(quickConnectType);
        this.userConfigs = userConfigs;
    }

    /**
     * Specifies the phone configuration of the Quick Connect. This is required only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    public List<QuickConnectQuickConnectConfigPhoneConfig> getPhoneConfigs() {
        return this.phoneConfigs == null ? List.of() : this.phoneConfigs;
    }
    /**
     * Specifies the queue configuration of the Quick Connect. This is required only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    public List<QuickConnectQuickConnectConfigQueueConfig> getQueueConfigs() {
        return this.queueConfigs == null ? List.of() : this.queueConfigs;
    }
    /**
     * Specifies the configuration type of the quick connect. valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    public String getQuickConnectType() {
        return this.quickConnectType;
    }
    /**
     * Specifies the user configuration of the Quick Connect. This is required only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    public List<QuickConnectQuickConnectConfigUserConfig> getUserConfigs() {
        return this.userConfigs == null ? List.of() : this.userConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<QuickConnectQuickConnectConfigPhoneConfig> phoneConfigs;
        private @Nullable List<QuickConnectQuickConnectConfigQueueConfig> queueConfigs;
        private String quickConnectType;
        private @Nullable List<QuickConnectQuickConnectConfigUserConfig> userConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneConfigs = defaults.phoneConfigs;
    	      this.queueConfigs = defaults.queueConfigs;
    	      this.quickConnectType = defaults.quickConnectType;
    	      this.userConfigs = defaults.userConfigs;
        }

        public Builder setPhoneConfigs(@Nullable List<QuickConnectQuickConnectConfigPhoneConfig> phoneConfigs) {
            this.phoneConfigs = phoneConfigs;
            return this;
        }

        public Builder setQueueConfigs(@Nullable List<QuickConnectQuickConnectConfigQueueConfig> queueConfigs) {
            this.queueConfigs = queueConfigs;
            return this;
        }

        public Builder setQuickConnectType(String quickConnectType) {
            this.quickConnectType = Objects.requireNonNull(quickConnectType);
            return this;
        }

        public Builder setUserConfigs(@Nullable List<QuickConnectQuickConnectConfigUserConfig> userConfigs) {
            this.userConfigs = userConfigs;
            return this;
        }
        public QuickConnectQuickConnectConfig build() {
            return new QuickConnectQuickConnectConfig(phoneConfigs, queueConfigs, quickConnectType, userConfigs);
        }
    }
}
