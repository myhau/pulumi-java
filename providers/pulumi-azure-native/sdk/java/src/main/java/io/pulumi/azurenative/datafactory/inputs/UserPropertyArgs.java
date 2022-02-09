// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class UserPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPropertyArgs Empty = new UserPropertyArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="value", required=true)
    private final Input<Object> value;

    public Input<Object> getValue() {
        return this.value;
    }

    public UserPropertyArgs(
        Input<String> name,
        Input<Object> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private UserPropertyArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValue(Input<Object> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public UserPropertyArgs build() {
            return new UserPropertyArgs(name, value);
        }
    }
}