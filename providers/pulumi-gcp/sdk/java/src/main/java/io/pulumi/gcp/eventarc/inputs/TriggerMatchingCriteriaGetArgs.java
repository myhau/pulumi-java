// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TriggerMatchingCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerMatchingCriteriaGetArgs Empty = new TriggerMatchingCriteriaGetArgs();

    /**
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
     * 
     */
    @InputImport(name="attribute", required=true)
    private final Input<String> attribute;

    public Input<String> getAttribute() {
        return this.attribute;
    }

    /**
     * Required. The value for the attribute.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public TriggerMatchingCriteriaGetArgs(
        Input<String> attribute,
        Input<String> value) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TriggerMatchingCriteriaGetArgs() {
        this.attribute = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerMatchingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attribute;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerMatchingCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.value = defaults.value;
        }

        public Builder setAttribute(Input<String> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Input.of(Objects.requireNonNull(attribute));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public TriggerMatchingCriteriaGetArgs build() {
            return new TriggerMatchingCriteriaGetArgs(attribute, value);
        }
    }
}
