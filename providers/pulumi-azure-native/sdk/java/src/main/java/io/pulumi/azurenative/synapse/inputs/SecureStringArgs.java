// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Azure Synapse secure string definition. The string value will be masked with asterisks '*' during Get or List API calls.
 * 
 */
public final class SecureStringArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecureStringArgs Empty = new SecureStringArgs();

    /**
     * Type of the secret.
     * Expected value is 'SecureString'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Value of secure string.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public SecureStringArgs(
        Output<String> type,
        Output<String> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SecureStringArgs() {
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureStringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public SecureStringArgs build() {
            return new SecureStringArgs(type, value);
        }
    }
}
