// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EndpointDeploymentConfigAutoRollbackConfigurationAlarm {
    /**
     * The name of a CloudWatch alarm in your account.
     * 
     */
    private final String alarmName;

    @OutputCustomType.Constructor({"alarmName"})
    private EndpointDeploymentConfigAutoRollbackConfigurationAlarm(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * The name of a CloudWatch alarm in your account.
     * 
    */
    public String getAlarmName() {
        return this.alarmName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
        }

        public Builder setAlarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public EndpointDeploymentConfigAutoRollbackConfigurationAlarm build() {
            return new EndpointDeploymentConfigAutoRollbackConfigurationAlarm(alarmName);
        }
    }
}