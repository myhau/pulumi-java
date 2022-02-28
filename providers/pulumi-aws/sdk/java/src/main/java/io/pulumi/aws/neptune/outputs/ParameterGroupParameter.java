// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterGroupParameter {
    /**
     * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    private final @Nullable String applyMethod;
    /**
     * The name of the Neptune parameter.
     * 
     */
    private final String name;
    /**
     * The value of the Neptune parameter.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"applyMethod","name","value"})
    private ParameterGroupParameter(
        @Nullable String applyMethod,
        String name,
        String value) {
        this.applyMethod = applyMethod;
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    public Optional<String> getApplyMethod() {
        return Optional.ofNullable(this.applyMethod);
    }
    /**
     * The name of the Neptune parameter.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The value of the Neptune parameter.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applyMethod;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyMethod = defaults.applyMethod;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setApplyMethod(@Nullable String applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ParameterGroupParameter build() {
            return new ParameterGroupParameter(applyMethod, name, value);
        }
    }
}
