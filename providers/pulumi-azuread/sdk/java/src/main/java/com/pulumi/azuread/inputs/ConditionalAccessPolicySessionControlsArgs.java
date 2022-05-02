// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConditionalAccessPolicySessionControlsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionalAccessPolicySessionControlsArgs Empty = new ConditionalAccessPolicySessionControlsArgs();

    /**
     * Whether or not application enforced restrictions are enabled. Defaults to `false`.
     * 
     */
    @Import(name="applicationEnforcedRestrictionsEnabled")
    private @Nullable Output<Boolean> applicationEnforcedRestrictionsEnabled;

    /**
     * @return Whether or not application enforced restrictions are enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> applicationEnforcedRestrictionsEnabled() {
        return Optional.ofNullable(this.applicationEnforcedRestrictionsEnabled);
    }

    /**
     * Enables cloud app security and specifies the cloud app security policy to use. Possible values are: `blockDownloads`, `mcasConfigured`, `monitorOnly` or `unknownFutureValue`.
     * 
     */
    @Import(name="cloudAppSecurityPolicy")
    private @Nullable Output<String> cloudAppSecurityPolicy;

    /**
     * @return Enables cloud app security and specifies the cloud app security policy to use. Possible values are: `blockDownloads`, `mcasConfigured`, `monitorOnly` or `unknownFutureValue`.
     * 
     */
    public Optional<Output<String>> cloudAppSecurityPolicy() {
        return Optional.ofNullable(this.cloudAppSecurityPolicy);
    }

    /**
     * Session control to define whether to persist cookies or not. Possible values are: `always` or `never`.
     * 
     */
    @Import(name="persistentBrowserMode")
    private @Nullable Output<String> persistentBrowserMode;

    /**
     * @return Session control to define whether to persist cookies or not. Possible values are: `always` or `never`.
     * 
     */
    public Optional<Output<String>> persistentBrowserMode() {
        return Optional.ofNullable(this.persistentBrowserMode);
    }

    /**
     * Number of days or hours to enforce sign-in frequency. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
     * 
     */
    @Import(name="signInFrequency")
    private @Nullable Output<Integer> signInFrequency;

    /**
     * @return Number of days or hours to enforce sign-in frequency. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> signInFrequency() {
        return Optional.ofNullable(this.signInFrequency);
    }

    /**
     * The time period to enforce sign-in frequency. Possible values are: `hours` or `days`. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
     * 
     */
    @Import(name="signInFrequencyPeriod")
    private @Nullable Output<String> signInFrequencyPeriod;

    /**
     * @return The time period to enforce sign-in frequency. Possible values are: `hours` or `days`. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> signInFrequencyPeriod() {
        return Optional.ofNullable(this.signInFrequencyPeriod);
    }

    private ConditionalAccessPolicySessionControlsArgs() {}

    private ConditionalAccessPolicySessionControlsArgs(ConditionalAccessPolicySessionControlsArgs $) {
        this.applicationEnforcedRestrictionsEnabled = $.applicationEnforcedRestrictionsEnabled;
        this.cloudAppSecurityPolicy = $.cloudAppSecurityPolicy;
        this.persistentBrowserMode = $.persistentBrowserMode;
        this.signInFrequency = $.signInFrequency;
        this.signInFrequencyPeriod = $.signInFrequencyPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionalAccessPolicySessionControlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionalAccessPolicySessionControlsArgs $;

        public Builder() {
            $ = new ConditionalAccessPolicySessionControlsArgs();
        }

        public Builder(ConditionalAccessPolicySessionControlsArgs defaults) {
            $ = new ConditionalAccessPolicySessionControlsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationEnforcedRestrictionsEnabled Whether or not application enforced restrictions are enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder applicationEnforcedRestrictionsEnabled(@Nullable Output<Boolean> applicationEnforcedRestrictionsEnabled) {
            $.applicationEnforcedRestrictionsEnabled = applicationEnforcedRestrictionsEnabled;
            return this;
        }

        /**
         * @param applicationEnforcedRestrictionsEnabled Whether or not application enforced restrictions are enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder applicationEnforcedRestrictionsEnabled(Boolean applicationEnforcedRestrictionsEnabled) {
            return applicationEnforcedRestrictionsEnabled(Output.of(applicationEnforcedRestrictionsEnabled));
        }

        /**
         * @param cloudAppSecurityPolicy Enables cloud app security and specifies the cloud app security policy to use. Possible values are: `blockDownloads`, `mcasConfigured`, `monitorOnly` or `unknownFutureValue`.
         * 
         * @return builder
         * 
         */
        public Builder cloudAppSecurityPolicy(@Nullable Output<String> cloudAppSecurityPolicy) {
            $.cloudAppSecurityPolicy = cloudAppSecurityPolicy;
            return this;
        }

        /**
         * @param cloudAppSecurityPolicy Enables cloud app security and specifies the cloud app security policy to use. Possible values are: `blockDownloads`, `mcasConfigured`, `monitorOnly` or `unknownFutureValue`.
         * 
         * @return builder
         * 
         */
        public Builder cloudAppSecurityPolicy(String cloudAppSecurityPolicy) {
            return cloudAppSecurityPolicy(Output.of(cloudAppSecurityPolicy));
        }

        /**
         * @param persistentBrowserMode Session control to define whether to persist cookies or not. Possible values are: `always` or `never`.
         * 
         * @return builder
         * 
         */
        public Builder persistentBrowserMode(@Nullable Output<String> persistentBrowserMode) {
            $.persistentBrowserMode = persistentBrowserMode;
            return this;
        }

        /**
         * @param persistentBrowserMode Session control to define whether to persist cookies or not. Possible values are: `always` or `never`.
         * 
         * @return builder
         * 
         */
        public Builder persistentBrowserMode(String persistentBrowserMode) {
            return persistentBrowserMode(Output.of(persistentBrowserMode));
        }

        /**
         * @param signInFrequency Number of days or hours to enforce sign-in frequency. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signInFrequency(@Nullable Output<Integer> signInFrequency) {
            $.signInFrequency = signInFrequency;
            return this;
        }

        /**
         * @param signInFrequency Number of days or hours to enforce sign-in frequency. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signInFrequency(Integer signInFrequency) {
            return signInFrequency(Output.of(signInFrequency));
        }

        /**
         * @param signInFrequencyPeriod The time period to enforce sign-in frequency. Possible values are: `hours` or `days`. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signInFrequencyPeriod(@Nullable Output<String> signInFrequencyPeriod) {
            $.signInFrequencyPeriod = signInFrequencyPeriod;
            return this;
        }

        /**
         * @param signInFrequencyPeriod The time period to enforce sign-in frequency. Possible values are: `hours` or `days`. Required when `sign_in_frequency_period` is specified. Due to an API issue, removing this property forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signInFrequencyPeriod(String signInFrequencyPeriod) {
            return signInFrequencyPeriod(Output.of(signInFrequencyPeriod));
        }

        public ConditionalAccessPolicySessionControlsArgs build() {
            return $;
        }
    }

}
