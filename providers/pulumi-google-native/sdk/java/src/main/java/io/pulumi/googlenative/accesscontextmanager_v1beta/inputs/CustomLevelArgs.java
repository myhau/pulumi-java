// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.ExprArgs;
import java.util.Objects;


public final class CustomLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomLevelArgs Empty = new CustomLevelArgs();

    @InputImport(name="expr", required=true)
    private final Input<ExprArgs> expr;

    public Input<ExprArgs> getExpr() {
        return this.expr;
    }

    public CustomLevelArgs(Input<ExprArgs> expr) {
        this.expr = Objects.requireNonNull(expr, "expected parameter 'expr' to be non-null");
    }

    private CustomLevelArgs() {
        this.expr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ExprArgs> expr;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder setExpr(Input<ExprArgs> expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }

        public Builder setExpr(ExprArgs expr) {
            this.expr = Input.of(Objects.requireNonNull(expr));
            return this;
        }

        public CustomLevelArgs build() {
            return new CustomLevelArgs(expr);
        }
    }
}