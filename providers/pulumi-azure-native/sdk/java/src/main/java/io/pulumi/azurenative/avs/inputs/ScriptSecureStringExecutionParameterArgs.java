// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * a plain text value execution parameter
 * 
 */
public final class ScriptSecureStringExecutionParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScriptSecureStringExecutionParameterArgs Empty = new ScriptSecureStringExecutionParameterArgs();

    /**
     * The parameter name
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * A secure value for the passed parameter, not to be stored in logs
     * 
     */
    @Import(name="secureValue")
      private final @Nullable Output<String> secureValue;

    public Output<String> secureValue() {
        return this.secureValue == null ? Codegen.empty() : this.secureValue;
    }

    /**
     * The type of execution parameter
     * Expected value is 'SecureValue'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ScriptSecureStringExecutionParameterArgs(
        Output<String> name,
        @Nullable Output<String> secureValue,
        Output<String> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secureValue = secureValue;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ScriptSecureStringExecutionParameterArgs() {
        this.name = Codegen.empty();
        this.secureValue = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptSecureStringExecutionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<String> secureValue;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptSecureStringExecutionParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secureValue = defaults.secureValue;
    	      this.type = defaults.type;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder secureValue(@Nullable Output<String> secureValue) {
            this.secureValue = secureValue;
            return this;
        }
        public Builder secureValue(@Nullable String secureValue) {
            this.secureValue = Codegen.ofNullable(secureValue);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ScriptSecureStringExecutionParameterArgs build() {
            return new ScriptSecureStringExecutionParameterArgs(name, secureValue, type);
        }
    }
}
