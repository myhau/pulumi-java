// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement.v1.inputs.SystemParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Define a system parameter rule mapping system parameter definitions to methods.
 * 
 */
public final class SystemParameterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemParameterRuleArgs Empty = new SystemParameterRuleArgs();

    /**
     * Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<SystemParameterArgs>> parameters;

    /**
     * @return Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
     * 
     */
    public Optional<Output<List<SystemParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Selects the methods to which this rule applies. Use &#39;*&#39; to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Selects the methods to which this rule applies. Use &#39;*&#39; to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private SystemParameterRuleArgs() {}

    private SystemParameterRuleArgs(SystemParameterRuleArgs $) {
        this.parameters = $.parameters;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemParameterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemParameterRuleArgs $;

        public Builder() {
            $ = new SystemParameterRuleArgs();
        }

        public Builder(SystemParameterRuleArgs defaults) {
            $ = new SystemParameterRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameters Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<SystemParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<SystemParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(SystemParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param selector Selects the methods to which this rule applies. Use &#39;*&#39; to indicate all methods in all APIs. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selects the methods to which this rule applies. Use &#39;*&#39; to indicate all methods in all APIs. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public SystemParameterRuleArgs build() {
            return $;
        }
    }

}
