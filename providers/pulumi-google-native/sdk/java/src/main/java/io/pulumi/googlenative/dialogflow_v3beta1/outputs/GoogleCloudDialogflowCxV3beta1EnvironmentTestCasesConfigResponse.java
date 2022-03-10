// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse {
    /**
     * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
     * 
     */
    private final Boolean enableContinuousRun;
    /**
     * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
     * 
     */
    private final Boolean enablePredeploymentRun;
    /**
     * A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
     * 
     */
    private final List<String> testCases;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse(
        @OutputCustomType.Parameter("enableContinuousRun") Boolean enableContinuousRun,
        @OutputCustomType.Parameter("enablePredeploymentRun") Boolean enablePredeploymentRun,
        @OutputCustomType.Parameter("testCases") List<String> testCases) {
        this.enableContinuousRun = enableContinuousRun;
        this.enablePredeploymentRun = enablePredeploymentRun;
        this.testCases = testCases;
    }

    /**
     * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to true, run once a day.
     * 
    */
    public Boolean getEnableContinuousRun() {
        return this.enableContinuousRun;
    }
    /**
     * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the environment. Default false.
     * 
    */
    public Boolean getEnablePredeploymentRun() {
        return this.enablePredeploymentRun;
    }
    /**
     * A list of test case names to run. They should be under the same agent. Format of each test case name: `projects//locations/ /agents//testCases/`
     * 
    */
    public List<String> getTestCases() {
        return this.testCases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableContinuousRun;
        private Boolean enablePredeploymentRun;
        private List<String> testCases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableContinuousRun = defaults.enableContinuousRun;
    	      this.enablePredeploymentRun = defaults.enablePredeploymentRun;
    	      this.testCases = defaults.testCases;
        }

        public Builder setEnableContinuousRun(Boolean enableContinuousRun) {
            this.enableContinuousRun = Objects.requireNonNull(enableContinuousRun);
            return this;
        }

        public Builder setEnablePredeploymentRun(Boolean enablePredeploymentRun) {
            this.enablePredeploymentRun = Objects.requireNonNull(enablePredeploymentRun);
            return this;
        }

        public Builder setTestCases(List<String> testCases) {
            this.testCases = Objects.requireNonNull(testCases);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigResponse(enableContinuousRun, enablePredeploymentRun, testCases);
        }
    }
}
