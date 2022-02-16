// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasLambdaCodeHook;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class BotAliasCodeHookSpecification extends io.pulumi.resources.InvokeArgs {

    public static final BotAliasCodeHookSpecification Empty = new BotAliasCodeHookSpecification();

    @InputImport(name="lambdaCodeHook", required=true)
    private final BotAliasLambdaCodeHook lambdaCodeHook;

    public BotAliasLambdaCodeHook getLambdaCodeHook() {
        return this.lambdaCodeHook;
    }

    public BotAliasCodeHookSpecification(BotAliasLambdaCodeHook lambdaCodeHook) {
        this.lambdaCodeHook = Objects.requireNonNull(lambdaCodeHook, "expected parameter 'lambdaCodeHook' to be non-null");
    }

    private BotAliasCodeHookSpecification() {
        this.lambdaCodeHook = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasCodeHookSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasLambdaCodeHook lambdaCodeHook;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasCodeHookSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaCodeHook = defaults.lambdaCodeHook;
        }

        public Builder setLambdaCodeHook(BotAliasLambdaCodeHook lambdaCodeHook) {
            this.lambdaCodeHook = Objects.requireNonNull(lambdaCodeHook);
            return this;
        }

        public BotAliasCodeHookSpecification build() {
            return new BotAliasCodeHookSpecification(lambdaCodeHook);
        }
    }
}