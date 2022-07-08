// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for continuous tests.
 * 
 */
public final class GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs Empty = new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs();

    /**
     * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
     * 
     */
    @Import(name="enableContinuousRun")
    private @Nullable Output<Boolean> enableContinuousRun;

    /**
     * @return Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
     * 
     */
    public Optional<Output<Boolean>> enableContinuousRun() {
        return Optional.ofNullable(this.enableContinuousRun);
    }

    /**
     * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
     * 
     */
    @Import(name="enablePredeploymentRun")
    private @Nullable Output<Boolean> enablePredeploymentRun;

    /**
     * @return Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
     * 
     */
    public Optional<Output<Boolean>> enablePredeploymentRun() {
        return Optional.ofNullable(this.enablePredeploymentRun);
    }

    /**
     * A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
     * 
     */
    @Import(name="testCases")
    private @Nullable Output<List<String>> testCases;

    /**
     * @return A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
     * 
     */
    public Optional<Output<List<String>>> testCases() {
        return Optional.ofNullable(this.testCases);
    }

    private GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs() {}

    private GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs $) {
        this.enableContinuousRun = $.enableContinuousRun;
        this.enablePredeploymentRun = $.enablePredeploymentRun;
        this.testCases = $.testCases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableContinuousRun Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
         * 
         * @return builder
         * 
         */
        public Builder enableContinuousRun(@Nullable Output<Boolean> enableContinuousRun) {
            $.enableContinuousRun = enableContinuousRun;
            return this;
        }

        /**
         * @param enableContinuousRun Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
         * 
         * @return builder
         * 
         */
        public Builder enableContinuousRun(Boolean enableContinuousRun) {
            return enableContinuousRun(Output.of(enableContinuousRun));
        }

        /**
         * @param enablePredeploymentRun Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
         * 
         * @return builder
         * 
         */
        public Builder enablePredeploymentRun(@Nullable Output<Boolean> enablePredeploymentRun) {
            $.enablePredeploymentRun = enablePredeploymentRun;
            return this;
        }

        /**
         * @param enablePredeploymentRun Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
         * 
         * @return builder
         * 
         */
        public Builder enablePredeploymentRun(Boolean enablePredeploymentRun) {
            return enablePredeploymentRun(Output.of(enablePredeploymentRun));
        }

        /**
         * @param testCases A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
         * 
         * @return builder
         * 
         */
        public Builder testCases(@Nullable Output<List<String>> testCases) {
            $.testCases = testCases;
            return this;
        }

        /**
         * @param testCases A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
         * 
         * @return builder
         * 
         */
        public Builder testCases(List<String> testCases) {
            return testCases(Output.of(testCases));
        }

        /**
         * @param testCases A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
         * 
         * @return builder
         * 
         */
        public Builder testCases(String... testCases) {
            return testCases(List.of(testCases));
        }

        public GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs build() {
            return $;
        }
    }

}
