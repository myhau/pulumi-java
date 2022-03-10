// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EventDestinationCloudwatchDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventDestinationCloudwatchDestinationGetArgs Empty = new EventDestinationCloudwatchDestinationGetArgs();

    /**
     * The default value for the event
     * 
     */
    @InputImport(name="defaultValue", required=true)
      private final Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * The name for the dimension
     * 
     */
    @InputImport(name="dimensionName", required=true)
      private final Input<String> dimensionName;

    public Input<String> getDimensionName() {
        return this.dimensionName;
    }

    /**
     * The source for the value. May be any of `"messageTag"`, `"emailHeader"` or `"linkTag"`.
     * 
     */
    @InputImport(name="valueSource", required=true)
      private final Input<String> valueSource;

    public Input<String> getValueSource() {
        return this.valueSource;
    }

    public EventDestinationCloudwatchDestinationGetArgs(
        Input<String> defaultValue,
        Input<String> dimensionName,
        Input<String> valueSource) {
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.dimensionName = Objects.requireNonNull(dimensionName, "expected parameter 'dimensionName' to be non-null");
        this.valueSource = Objects.requireNonNull(valueSource, "expected parameter 'valueSource' to be non-null");
    }

    private EventDestinationCloudwatchDestinationGetArgs() {
        this.defaultValue = Input.empty();
        this.dimensionName = Input.empty();
        this.valueSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationCloudwatchDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> defaultValue;
        private Input<String> dimensionName;
        private Input<String> valueSource;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationCloudwatchDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.dimensionName = defaults.dimensionName;
    	      this.valueSource = defaults.valueSource;
        }

        public Builder setDefaultValue(Input<String> defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = Input.of(Objects.requireNonNull(defaultValue));
            return this;
        }

        public Builder setDimensionName(Input<String> dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }

        public Builder setDimensionName(String dimensionName) {
            this.dimensionName = Input.of(Objects.requireNonNull(dimensionName));
            return this;
        }

        public Builder setValueSource(Input<String> valueSource) {
            this.valueSource = Objects.requireNonNull(valueSource);
            return this;
        }

        public Builder setValueSource(String valueSource) {
            this.valueSource = Input.of(Objects.requireNonNull(valueSource));
            return this;
        }
        public EventDestinationCloudwatchDestinationGetArgs build() {
            return new EventDestinationCloudwatchDestinationGetArgs(defaultValue, dimensionName, valueSource);
        }
    }
}