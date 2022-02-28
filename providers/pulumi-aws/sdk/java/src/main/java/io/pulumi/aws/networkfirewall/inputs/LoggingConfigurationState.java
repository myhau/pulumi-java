// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggingConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationState Empty = new LoggingConfigurationState();

    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     * 
     */
    @InputImport(name="firewallArn")
      private final @Nullable Input<String> firewallArn;

    public Input<String> getFirewallArn() {
        return this.firewallArn == null ? Input.empty() : this.firewallArn;
    }

    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * 
     */
    @InputImport(name="loggingConfiguration")
      private final @Nullable Input<LoggingConfigurationLoggingConfigurationGetArgs> loggingConfiguration;

    public Input<LoggingConfigurationLoggingConfigurationGetArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Input.empty() : this.loggingConfiguration;
    }

    public LoggingConfigurationState(
        @Nullable Input<String> firewallArn,
        @Nullable Input<LoggingConfigurationLoggingConfigurationGetArgs> loggingConfiguration) {
        this.firewallArn = firewallArn;
        this.loggingConfiguration = loggingConfiguration;
    }

    private LoggingConfigurationState() {
        this.firewallArn = Input.empty();
        this.loggingConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> firewallArn;
        private @Nullable Input<LoggingConfigurationLoggingConfigurationGetArgs> loggingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallArn = defaults.firewallArn;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
        }

        public Builder setFirewallArn(@Nullable Input<String> firewallArn) {
            this.firewallArn = firewallArn;
            return this;
        }

        public Builder setFirewallArn(@Nullable String firewallArn) {
            this.firewallArn = Input.ofNullable(firewallArn);
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable Input<LoggingConfigurationLoggingConfigurationGetArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable LoggingConfigurationLoggingConfigurationGetArgs loggingConfiguration) {
            this.loggingConfiguration = Input.ofNullable(loggingConfiguration);
            return this;
        }
        public LoggingConfigurationState build() {
            return new LoggingConfigurationState(firewallArn, loggingConfiguration);
        }
    }
}
