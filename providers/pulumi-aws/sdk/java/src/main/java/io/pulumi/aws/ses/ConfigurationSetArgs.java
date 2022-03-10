// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetArgs Empty = new ConfigurationSetArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="deliveryOptions")
      private final @Nullable Input<ConfigurationSetDeliveryOptionsArgs> deliveryOptions;

    public Input<ConfigurationSetDeliveryOptionsArgs> getDeliveryOptions() {
        return this.deliveryOptions == null ? Input.empty() : this.deliveryOptions;
    }

    /**
     * Name of the configuration set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    @InputImport(name="reputationMetricsEnabled")
      private final @Nullable Input<Boolean> reputationMetricsEnabled;

    public Input<Boolean> getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled == null ? Input.empty() : this.reputationMetricsEnabled;
    }

    /**
     * Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    @InputImport(name="sendingEnabled")
      private final @Nullable Input<Boolean> sendingEnabled;

    public Input<Boolean> getSendingEnabled() {
        return this.sendingEnabled == null ? Input.empty() : this.sendingEnabled;
    }

    public ConfigurationSetArgs(
        @Nullable Input<ConfigurationSetDeliveryOptionsArgs> deliveryOptions,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> reputationMetricsEnabled,
        @Nullable Input<Boolean> sendingEnabled) {
        this.deliveryOptions = deliveryOptions;
        this.name = name;
        this.reputationMetricsEnabled = reputationMetricsEnabled;
        this.sendingEnabled = sendingEnabled;
    }

    private ConfigurationSetArgs() {
        this.deliveryOptions = Input.empty();
        this.name = Input.empty();
        this.reputationMetricsEnabled = Input.empty();
        this.sendingEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigurationSetDeliveryOptionsArgs> deliveryOptions;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> reputationMetricsEnabled;
        private @Nullable Input<Boolean> sendingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryOptions = defaults.deliveryOptions;
    	      this.name = defaults.name;
    	      this.reputationMetricsEnabled = defaults.reputationMetricsEnabled;
    	      this.sendingEnabled = defaults.sendingEnabled;
        }

        public Builder setDeliveryOptions(@Nullable Input<ConfigurationSetDeliveryOptionsArgs> deliveryOptions) {
            this.deliveryOptions = deliveryOptions;
            return this;
        }

        public Builder setDeliveryOptions(@Nullable ConfigurationSetDeliveryOptionsArgs deliveryOptions) {
            this.deliveryOptions = Input.ofNullable(deliveryOptions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setReputationMetricsEnabled(@Nullable Input<Boolean> reputationMetricsEnabled) {
            this.reputationMetricsEnabled = reputationMetricsEnabled;
            return this;
        }

        public Builder setReputationMetricsEnabled(@Nullable Boolean reputationMetricsEnabled) {
            this.reputationMetricsEnabled = Input.ofNullable(reputationMetricsEnabled);
            return this;
        }

        public Builder setSendingEnabled(@Nullable Input<Boolean> sendingEnabled) {
            this.sendingEnabled = sendingEnabled;
            return this;
        }

        public Builder setSendingEnabled(@Nullable Boolean sendingEnabled) {
            this.sendingEnabled = Input.ofNullable(sendingEnabled);
            return this;
        }
        public ConfigurationSetArgs build() {
            return new ConfigurationSetArgs(deliveryOptions, name, reputationMetricsEnabled, sendingEnabled);
        }
    }
}