// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionCountGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionNoneGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleOverrideActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleOverrideActionGetArgs Empty = new WebAclRuleOverrideActionGetArgs();

    /**
     * Override the rule action setting to count (i.e., only count matches). Configured as an empty block `{}`.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<WebAclRuleOverrideActionCountGetArgs> count;

    public Input<WebAclRuleOverrideActionCountGetArgs> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Don't override the rule action setting. Configured as an empty block `{}`.
     * 
     */
    @InputImport(name="none")
      private final @Nullable Input<WebAclRuleOverrideActionNoneGetArgs> none;

    public Input<WebAclRuleOverrideActionNoneGetArgs> getNone() {
        return this.none == null ? Input.empty() : this.none;
    }

    public WebAclRuleOverrideActionGetArgs(
        @Nullable Input<WebAclRuleOverrideActionCountGetArgs> count,
        @Nullable Input<WebAclRuleOverrideActionNoneGetArgs> none) {
        this.count = count;
        this.none = none;
    }

    private WebAclRuleOverrideActionGetArgs() {
        this.count = Input.empty();
        this.none = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleOverrideActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleOverrideActionCountGetArgs> count;
        private @Nullable Input<WebAclRuleOverrideActionNoneGetArgs> none;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleOverrideActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.none = defaults.none;
        }

        public Builder setCount(@Nullable Input<WebAclRuleOverrideActionCountGetArgs> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable WebAclRuleOverrideActionCountGetArgs count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setNone(@Nullable Input<WebAclRuleOverrideActionNoneGetArgs> none) {
            this.none = none;
            return this;
        }

        public Builder setNone(@Nullable WebAclRuleOverrideActionNoneGetArgs none) {
            this.none = Input.ofNullable(none);
            return this;
        }
        public WebAclRuleOverrideActionGetArgs build() {
            return new WebAclRuleOverrideActionGetArgs(count, none);
        }
    }
}
