// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing.v1.inputs.FileReferenceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A test of an iOS application that implements one or more game loop scenarios. This test type accepts an archived application (.ipa file) and a list of integer scenarios that will be executed on the app sequentially.
 * 
 */
public final class IosTestLoopArgs extends com.pulumi.resources.ResourceArgs {

    public static final IosTestLoopArgs Empty = new IosTestLoopArgs();

    /**
     * The .ipa of the application to test.
     * 
     */
    @Import(name="appIpa", required=true)
    private Output<FileReferenceArgs> appIpa;

    /**
     * @return The .ipa of the application to test.
     * 
     */
    public Output<FileReferenceArgs> appIpa() {
        return this.appIpa;
    }

    /**
     * The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
     * 
     */
    @Import(name="scenarios")
    private @Nullable Output<List<Integer>> scenarios;

    /**
     * @return The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
     * 
     */
    public Optional<Output<List<Integer>>> scenarios() {
        return Optional.ofNullable(this.scenarios);
    }

    private IosTestLoopArgs() {}

    private IosTestLoopArgs(IosTestLoopArgs $) {
        this.appIpa = $.appIpa;
        this.scenarios = $.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IosTestLoopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosTestLoopArgs $;

        public Builder() {
            $ = new IosTestLoopArgs();
        }

        public Builder(IosTestLoopArgs defaults) {
            $ = new IosTestLoopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appIpa The .ipa of the application to test.
         * 
         * @return builder
         * 
         */
        public Builder appIpa(Output<FileReferenceArgs> appIpa) {
            $.appIpa = appIpa;
            return this;
        }

        /**
         * @param appIpa The .ipa of the application to test.
         * 
         * @return builder
         * 
         */
        public Builder appIpa(FileReferenceArgs appIpa) {
            return appIpa(Output.of(appIpa));
        }

        /**
         * @param scenarios The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder scenarios(@Nullable Output<List<Integer>> scenarios) {
            $.scenarios = scenarios;
            return this;
        }

        /**
         * @param scenarios The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder scenarios(List<Integer> scenarios) {
            return scenarios(Output.of(scenarios));
        }

        /**
         * @param scenarios The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder scenarios(Integer... scenarios) {
            return scenarios(List.of(scenarios));
        }

        public IosTestLoopArgs build() {
            $.appIpa = Objects.requireNonNull($.appIpa, "expected parameter 'appIpa' to be non-null");
            return $;
        }
    }

}
