// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI alias.
 * 
 */
public final class KpiAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiAliasArgs Empty = new KpiAliasArgs();

    /**
     * KPI alias name.
     * 
     */
    @Import(name="aliasName", required=true)
      private final Output<String> aliasName;

    public Output<String> aliasName() {
        return this.aliasName;
    }

    /**
     * The expression.
     * 
     */
    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    public KpiAliasArgs(
        Output<String> aliasName,
        Output<String> expression) {
        this.aliasName = Objects.requireNonNull(aliasName, "expected parameter 'aliasName' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private KpiAliasArgs() {
        this.aliasName = Codegen.empty();
        this.expression = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> aliasName;
        private Output<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
    	      this.expression = defaults.expression;
        }

        public Builder aliasName(Output<String> aliasName) {
            this.aliasName = Objects.requireNonNull(aliasName);
            return this;
        }
        public Builder aliasName(String aliasName) {
            this.aliasName = Output.of(Objects.requireNonNull(aliasName));
            return this;
        }
        public Builder expression(Output<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Output.of(Objects.requireNonNull(expression));
            return this;
        }        public KpiAliasArgs build() {
            return new KpiAliasArgs(aliasName, expression);
        }
    }
}
