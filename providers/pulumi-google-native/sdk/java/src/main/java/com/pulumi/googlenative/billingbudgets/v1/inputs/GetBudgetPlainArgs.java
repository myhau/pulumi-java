// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBudgetPlainArgs Empty = new GetBudgetPlainArgs();

    @Import(name="billingAccountId", required=true)
    private String billingAccountId;

    public String billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="budgetId", required=true)
    private String budgetId;

    public String budgetId() {
        return this.budgetId;
    }

    private GetBudgetPlainArgs() {}

    private GetBudgetPlainArgs(GetBudgetPlainArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.budgetId = $.budgetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBudgetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBudgetPlainArgs $;

        public Builder() {
            $ = new GetBudgetPlainArgs();
        }

        public Builder(GetBudgetPlainArgs defaults) {
            $ = new GetBudgetPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountId(String billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public Builder budgetId(String budgetId) {
            $.budgetId = budgetId;
            return this;
        }

        public GetBudgetPlainArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            $.budgetId = Objects.requireNonNull($.budgetId, "expected parameter 'budgetId' to be non-null");
            return $;
        }
    }

}
