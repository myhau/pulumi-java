// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class DatasetDeltaTimeSessionWindowConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetDeltaTimeSessionWindowConfigurationArgs Empty = new DatasetDeltaTimeSessionWindowConfigurationArgs();

    @InputImport(name="timeoutInMinutes", required=true)
    private final Input<Integer> timeoutInMinutes;

    public Input<Integer> getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public DatasetDeltaTimeSessionWindowConfigurationArgs(Input<Integer> timeoutInMinutes) {
        this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes, "expected parameter 'timeoutInMinutes' to be non-null");
    }

    private DatasetDeltaTimeSessionWindowConfigurationArgs() {
        this.timeoutInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDeltaTimeSessionWindowConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> timeoutInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDeltaTimeSessionWindowConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeoutInMinutes = defaults.timeoutInMinutes;
        }

        public Builder setTimeoutInMinutes(Input<Integer> timeoutInMinutes) {
            this.timeoutInMinutes = Objects.requireNonNull(timeoutInMinutes);
            return this;
        }

        public Builder setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = Input.of(Objects.requireNonNull(timeoutInMinutes));
            return this;
        }

        public DatasetDeltaTimeSessionWindowConfigurationArgs build() {
            return new DatasetDeltaTimeSessionWindowConfigurationArgs(timeoutInMinutes);
        }
    }
}