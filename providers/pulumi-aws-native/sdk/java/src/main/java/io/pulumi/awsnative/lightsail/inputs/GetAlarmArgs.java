// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAlarmArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAlarmArgs Empty = new GetAlarmArgs();

    @InputImport(name="alarmName", required=true)
    private final String alarmName;

    public String getAlarmName() {
        return this.alarmName;
    }

    public GetAlarmArgs(String alarmName) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
    }

    private GetAlarmArgs() {
        this.alarmName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
        }

        public Builder setAlarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public GetAlarmArgs build() {
            return new GetAlarmArgs(alarmName);
        }
    }
}