// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.azuread.inputs.ConditionalAccessPolicyConditionsArgs;
import com.pulumi.azuread.inputs.ConditionalAccessPolicyGrantControlsArgs;
import com.pulumi.azuread.inputs.ConditionalAccessPolicySessionControlsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConditionalAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionalAccessPolicyArgs Empty = new ConditionalAccessPolicyArgs();

    /**
     * A `conditions` block as documented below, which specifies the rules that must be met for the policy to apply.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<ConditionalAccessPolicyConditionsArgs> conditions;

    /**
     * @return A `conditions` block as documented below, which specifies the rules that must be met for the policy to apply.
     * 
     */
    public Output<ConditionalAccessPolicyConditionsArgs> conditions() {
        return this.conditions;
    }

    /**
     * The friendly name for this Conditional Access Policy.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The friendly name for this Conditional Access Policy.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A `grant_controls` block as documented below, which specifies the grant controls that must be fulfilled to pass the policy.
     * 
     */
    @Import(name="grantControls", required=true)
    private Output<ConditionalAccessPolicyGrantControlsArgs> grantControls;

    /**
     * @return A `grant_controls` block as documented below, which specifies the grant controls that must be fulfilled to pass the policy.
     * 
     */
    public Output<ConditionalAccessPolicyGrantControlsArgs> grantControls() {
        return this.grantControls;
    }

    /**
     * A `session_controls` block as documented below, which specifies the session controls that are enforced after sign-in.
     * 
     */
    @Import(name="sessionControls")
    private @Nullable Output<ConditionalAccessPolicySessionControlsArgs> sessionControls;

    /**
     * @return A `session_controls` block as documented below, which specifies the session controls that are enforced after sign-in.
     * 
     */
    public Optional<Output<ConditionalAccessPolicySessionControlsArgs>> sessionControls() {
        return Optional.ofNullable(this.sessionControls);
    }

    /**
     * Specifies the state of the policy object. Possible values are: `enabled`, `disabled` and `enabledForReportingButNotEnforced`
     * 
     */
    @Import(name="state", required=true)
    private Output<String> state;

    /**
     * @return Specifies the state of the policy object. Possible values are: `enabled`, `disabled` and `enabledForReportingButNotEnforced`
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    private ConditionalAccessPolicyArgs() {}

    private ConditionalAccessPolicyArgs(ConditionalAccessPolicyArgs $) {
        this.conditions = $.conditions;
        this.displayName = $.displayName;
        this.grantControls = $.grantControls;
        this.sessionControls = $.sessionControls;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionalAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionalAccessPolicyArgs $;

        public Builder() {
            $ = new ConditionalAccessPolicyArgs();
        }

        public Builder(ConditionalAccessPolicyArgs defaults) {
            $ = new ConditionalAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions A `conditions` block as documented below, which specifies the rules that must be met for the policy to apply.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<ConditionalAccessPolicyConditionsArgs> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions A `conditions` block as documented below, which specifies the rules that must be met for the policy to apply.
         * 
         * @return builder
         * 
         */
        public Builder conditions(ConditionalAccessPolicyConditionsArgs conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param displayName The friendly name for this Conditional Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The friendly name for this Conditional Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param grantControls A `grant_controls` block as documented below, which specifies the grant controls that must be fulfilled to pass the policy.
         * 
         * @return builder
         * 
         */
        public Builder grantControls(Output<ConditionalAccessPolicyGrantControlsArgs> grantControls) {
            $.grantControls = grantControls;
            return this;
        }

        /**
         * @param grantControls A `grant_controls` block as documented below, which specifies the grant controls that must be fulfilled to pass the policy.
         * 
         * @return builder
         * 
         */
        public Builder grantControls(ConditionalAccessPolicyGrantControlsArgs grantControls) {
            return grantControls(Output.of(grantControls));
        }

        /**
         * @param sessionControls A `session_controls` block as documented below, which specifies the session controls that are enforced after sign-in.
         * 
         * @return builder
         * 
         */
        public Builder sessionControls(@Nullable Output<ConditionalAccessPolicySessionControlsArgs> sessionControls) {
            $.sessionControls = sessionControls;
            return this;
        }

        /**
         * @param sessionControls A `session_controls` block as documented below, which specifies the session controls that are enforced after sign-in.
         * 
         * @return builder
         * 
         */
        public Builder sessionControls(ConditionalAccessPolicySessionControlsArgs sessionControls) {
            return sessionControls(Output.of(sessionControls));
        }

        /**
         * @param state Specifies the state of the policy object. Possible values are: `enabled`, `disabled` and `enabledForReportingButNotEnforced`
         * 
         * @return builder
         * 
         */
        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Specifies the state of the policy object. Possible values are: `enabled`, `disabled` and `enabledForReportingButNotEnforced`
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public ConditionalAccessPolicyArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.grantControls = Objects.requireNonNull($.grantControls, "expected parameter 'grantControls' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
