// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterParameterGroupParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterParameterGroupParameterArgs Empty = new ClusterParameterGroupParameterArgs();

    /**
     * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    @InputImport(name="applyMethod")
      private final @Nullable Input<String> applyMethod;

    public Input<String> getApplyMethod() {
        return this.applyMethod == null ? Input.empty() : this.applyMethod;
    }

    /**
     * The name of the documentDB parameter.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The value of the documentDB parameter.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ClusterParameterGroupParameterArgs(
        @Nullable Input<String> applyMethod,
        Input<String> name,
        Input<String> value) {
        this.applyMethod = applyMethod;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ClusterParameterGroupParameterArgs() {
        this.applyMethod = Input.empty();
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterParameterGroupParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applyMethod;
        private Input<String> name;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterParameterGroupParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyMethod = defaults.applyMethod;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setApplyMethod(@Nullable Input<String> applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }

        public Builder setApplyMethod(@Nullable String applyMethod) {
            this.applyMethod = Input.ofNullable(applyMethod);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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
        public ClusterParameterGroupParameterArgs build() {
            return new ClusterParameterGroupParameterArgs(applyMethod, name, value);
        }
    }
}
