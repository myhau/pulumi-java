// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * User property.
 * 
 */
public final class UserPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserPropertyResponse Empty = new UserPropertyResponse();

    /**
     * User property name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * User property value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="value", required=true)
      private final Object value;

    public Object value() {
        return this.value;
    }

    public UserPropertyResponse(
        String name,
        Object value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private UserPropertyResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public UserPropertyResponse build() {
            return new UserPropertyResponse(name, value);
        }
    }
}
