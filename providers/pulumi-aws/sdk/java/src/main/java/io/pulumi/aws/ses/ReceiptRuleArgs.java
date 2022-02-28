// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleArgs Empty = new ReceiptRuleArgs();

    /**
     * A list of Add Header Action blocks. Documented below.
     * 
     */
    @InputImport(name="addHeaderActions")
      private final @Nullable Input<List<ReceiptRuleAddHeaderActionArgs>> addHeaderActions;

    public Input<List<ReceiptRuleAddHeaderActionArgs>> getAddHeaderActions() {
        return this.addHeaderActions == null ? Input.empty() : this.addHeaderActions;
    }

    /**
     * The name of the rule to place this rule after
     * 
     */
    @InputImport(name="after")
      private final @Nullable Input<String> after;

    public Input<String> getAfter() {
        return this.after == null ? Input.empty() : this.after;
    }

    /**
     * A list of Bounce Action blocks. Documented below.
     * 
     */
    @InputImport(name="bounceActions")
      private final @Nullable Input<List<ReceiptRuleBounceActionArgs>> bounceActions;

    public Input<List<ReceiptRuleBounceActionArgs>> getBounceActions() {
        return this.bounceActions == null ? Input.empty() : this.bounceActions;
    }

    /**
     * If true, the rule will be enabled
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * A list of Lambda Action blocks. Documented below.
     * 
     */
    @InputImport(name="lambdaActions")
      private final @Nullable Input<List<ReceiptRuleLambdaActionArgs>> lambdaActions;

    public Input<List<ReceiptRuleLambdaActionArgs>> getLambdaActions() {
        return this.lambdaActions == null ? Input.empty() : this.lambdaActions;
    }

    /**
     * The name of the rule
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of email addresses
     * 
     */
    @InputImport(name="recipients")
      private final @Nullable Input<List<String>> recipients;

    public Input<List<String>> getRecipients() {
        return this.recipients == null ? Input.empty() : this.recipients;
    }

    /**
     * The name of the rule set
     * 
     */
    @InputImport(name="ruleSetName", required=true)
      private final Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * A list of S3 Action blocks. Documented below.
     * 
     */
    @InputImport(name="s3Actions")
      private final @Nullable Input<List<ReceiptRuleS3ActionArgs>> s3Actions;

    public Input<List<ReceiptRuleS3ActionArgs>> getS3Actions() {
        return this.s3Actions == null ? Input.empty() : this.s3Actions;
    }

    /**
     * If true, incoming emails will be scanned for spam and viruses
     * 
     */
    @InputImport(name="scanEnabled")
      private final @Nullable Input<Boolean> scanEnabled;

    public Input<Boolean> getScanEnabled() {
        return this.scanEnabled == null ? Input.empty() : this.scanEnabled;
    }

    /**
     * A list of SNS Action blocks. Documented below.
     * 
     */
    @InputImport(name="snsActions")
      private final @Nullable Input<List<ReceiptRuleSnsActionArgs>> snsActions;

    public Input<List<ReceiptRuleSnsActionArgs>> getSnsActions() {
        return this.snsActions == null ? Input.empty() : this.snsActions;
    }

    /**
     * A list of Stop Action blocks. Documented below.
     * 
     */
    @InputImport(name="stopActions")
      private final @Nullable Input<List<ReceiptRuleStopActionArgs>> stopActions;

    public Input<List<ReceiptRuleStopActionArgs>> getStopActions() {
        return this.stopActions == null ? Input.empty() : this.stopActions;
    }

    /**
     * `Require` or `Optional`
     * 
     */
    @InputImport(name="tlsPolicy")
      private final @Nullable Input<String> tlsPolicy;

    public Input<String> getTlsPolicy() {
        return this.tlsPolicy == null ? Input.empty() : this.tlsPolicy;
    }

    /**
     * A list of WorkMail Action blocks. Documented below.
     * 
     */
    @InputImport(name="workmailActions")
      private final @Nullable Input<List<ReceiptRuleWorkmailActionArgs>> workmailActions;

    public Input<List<ReceiptRuleWorkmailActionArgs>> getWorkmailActions() {
        return this.workmailActions == null ? Input.empty() : this.workmailActions;
    }

    public ReceiptRuleArgs(
        @Nullable Input<List<ReceiptRuleAddHeaderActionArgs>> addHeaderActions,
        @Nullable Input<String> after,
        @Nullable Input<List<ReceiptRuleBounceActionArgs>> bounceActions,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<ReceiptRuleLambdaActionArgs>> lambdaActions,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> recipients,
        Input<String> ruleSetName,
        @Nullable Input<List<ReceiptRuleS3ActionArgs>> s3Actions,
        @Nullable Input<Boolean> scanEnabled,
        @Nullable Input<List<ReceiptRuleSnsActionArgs>> snsActions,
        @Nullable Input<List<ReceiptRuleStopActionArgs>> stopActions,
        @Nullable Input<String> tlsPolicy,
        @Nullable Input<List<ReceiptRuleWorkmailActionArgs>> workmailActions) {
        this.addHeaderActions = addHeaderActions;
        this.after = after;
        this.bounceActions = bounceActions;
        this.enabled = enabled;
        this.lambdaActions = lambdaActions;
        this.name = name;
        this.recipients = recipients;
        this.ruleSetName = Objects.requireNonNull(ruleSetName, "expected parameter 'ruleSetName' to be non-null");
        this.s3Actions = s3Actions;
        this.scanEnabled = scanEnabled;
        this.snsActions = snsActions;
        this.stopActions = stopActions;
        this.tlsPolicy = tlsPolicy;
        this.workmailActions = workmailActions;
    }

    private ReceiptRuleArgs() {
        this.addHeaderActions = Input.empty();
        this.after = Input.empty();
        this.bounceActions = Input.empty();
        this.enabled = Input.empty();
        this.lambdaActions = Input.empty();
        this.name = Input.empty();
        this.recipients = Input.empty();
        this.ruleSetName = Input.empty();
        this.s3Actions = Input.empty();
        this.scanEnabled = Input.empty();
        this.snsActions = Input.empty();
        this.stopActions = Input.empty();
        this.tlsPolicy = Input.empty();
        this.workmailActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ReceiptRuleAddHeaderActionArgs>> addHeaderActions;
        private @Nullable Input<String> after;
        private @Nullable Input<List<ReceiptRuleBounceActionArgs>> bounceActions;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<ReceiptRuleLambdaActionArgs>> lambdaActions;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> recipients;
        private Input<String> ruleSetName;
        private @Nullable Input<List<ReceiptRuleS3ActionArgs>> s3Actions;
        private @Nullable Input<Boolean> scanEnabled;
        private @Nullable Input<List<ReceiptRuleSnsActionArgs>> snsActions;
        private @Nullable Input<List<ReceiptRuleStopActionArgs>> stopActions;
        private @Nullable Input<String> tlsPolicy;
        private @Nullable Input<List<ReceiptRuleWorkmailActionArgs>> workmailActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addHeaderActions = defaults.addHeaderActions;
    	      this.after = defaults.after;
    	      this.bounceActions = defaults.bounceActions;
    	      this.enabled = defaults.enabled;
    	      this.lambdaActions = defaults.lambdaActions;
    	      this.name = defaults.name;
    	      this.recipients = defaults.recipients;
    	      this.ruleSetName = defaults.ruleSetName;
    	      this.s3Actions = defaults.s3Actions;
    	      this.scanEnabled = defaults.scanEnabled;
    	      this.snsActions = defaults.snsActions;
    	      this.stopActions = defaults.stopActions;
    	      this.tlsPolicy = defaults.tlsPolicy;
    	      this.workmailActions = defaults.workmailActions;
        }

        public Builder setAddHeaderActions(@Nullable Input<List<ReceiptRuleAddHeaderActionArgs>> addHeaderActions) {
            this.addHeaderActions = addHeaderActions;
            return this;
        }

        public Builder setAddHeaderActions(@Nullable List<ReceiptRuleAddHeaderActionArgs> addHeaderActions) {
            this.addHeaderActions = Input.ofNullable(addHeaderActions);
            return this;
        }

        public Builder setAfter(@Nullable Input<String> after) {
            this.after = after;
            return this;
        }

        public Builder setAfter(@Nullable String after) {
            this.after = Input.ofNullable(after);
            return this;
        }

        public Builder setBounceActions(@Nullable Input<List<ReceiptRuleBounceActionArgs>> bounceActions) {
            this.bounceActions = bounceActions;
            return this;
        }

        public Builder setBounceActions(@Nullable List<ReceiptRuleBounceActionArgs> bounceActions) {
            this.bounceActions = Input.ofNullable(bounceActions);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLambdaActions(@Nullable Input<List<ReceiptRuleLambdaActionArgs>> lambdaActions) {
            this.lambdaActions = lambdaActions;
            return this;
        }

        public Builder setLambdaActions(@Nullable List<ReceiptRuleLambdaActionArgs> lambdaActions) {
            this.lambdaActions = Input.ofNullable(lambdaActions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRecipients(@Nullable Input<List<String>> recipients) {
            this.recipients = recipients;
            return this;
        }

        public Builder setRecipients(@Nullable List<String> recipients) {
            this.recipients = Input.ofNullable(recipients);
            return this;
        }

        public Builder setRuleSetName(Input<String> ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }

        public Builder setRuleSetName(String ruleSetName) {
            this.ruleSetName = Input.of(Objects.requireNonNull(ruleSetName));
            return this;
        }

        public Builder setS3Actions(@Nullable Input<List<ReceiptRuleS3ActionArgs>> s3Actions) {
            this.s3Actions = s3Actions;
            return this;
        }

        public Builder setS3Actions(@Nullable List<ReceiptRuleS3ActionArgs> s3Actions) {
            this.s3Actions = Input.ofNullable(s3Actions);
            return this;
        }

        public Builder setScanEnabled(@Nullable Input<Boolean> scanEnabled) {
            this.scanEnabled = scanEnabled;
            return this;
        }

        public Builder setScanEnabled(@Nullable Boolean scanEnabled) {
            this.scanEnabled = Input.ofNullable(scanEnabled);
            return this;
        }

        public Builder setSnsActions(@Nullable Input<List<ReceiptRuleSnsActionArgs>> snsActions) {
            this.snsActions = snsActions;
            return this;
        }

        public Builder setSnsActions(@Nullable List<ReceiptRuleSnsActionArgs> snsActions) {
            this.snsActions = Input.ofNullable(snsActions);
            return this;
        }

        public Builder setStopActions(@Nullable Input<List<ReceiptRuleStopActionArgs>> stopActions) {
            this.stopActions = stopActions;
            return this;
        }

        public Builder setStopActions(@Nullable List<ReceiptRuleStopActionArgs> stopActions) {
            this.stopActions = Input.ofNullable(stopActions);
            return this;
        }

        public Builder setTlsPolicy(@Nullable Input<String> tlsPolicy) {
            this.tlsPolicy = tlsPolicy;
            return this;
        }

        public Builder setTlsPolicy(@Nullable String tlsPolicy) {
            this.tlsPolicy = Input.ofNullable(tlsPolicy);
            return this;
        }

        public Builder setWorkmailActions(@Nullable Input<List<ReceiptRuleWorkmailActionArgs>> workmailActions) {
            this.workmailActions = workmailActions;
            return this;
        }

        public Builder setWorkmailActions(@Nullable List<ReceiptRuleWorkmailActionArgs> workmailActions) {
            this.workmailActions = Input.ofNullable(workmailActions);
            return this;
        }
        public ReceiptRuleArgs build() {
            return new ReceiptRuleArgs(addHeaderActions, after, bounceActions, enabled, lambdaActions, name, recipients, ruleSetName, s3Actions, scanEnabled, snsActions, stopActions, tlsPolicy, workmailActions);
        }
    }
}
