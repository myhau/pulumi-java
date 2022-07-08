// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configurations for a test case.
 * 
 */
public final class GoogleCloudDialogflowCxV3TestConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TestConfigArgs Empty = new GoogleCloudDialogflowCxV3TestConfigArgs();

    /**
     * Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
     * 
     */
    @Import(name="flow")
    private @Nullable Output<String> flow;

    /**
     * @return Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
     * 
     */
    public Optional<Output<String>> flow() {
        return Optional.ofNullable(this.flow);
    }

    /**
     * The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
     * 
     */
    @Import(name="page")
    private @Nullable Output<String> page;

    /**
     * @return The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
     * 
     */
    public Optional<Output<String>> page() {
        return Optional.ofNullable(this.page);
    }

    /**
     * Session parameters to be compared when calculating differences.
     * 
     */
    @Import(name="trackingParameters")
    private @Nullable Output<List<String>> trackingParameters;

    /**
     * @return Session parameters to be compared when calculating differences.
     * 
     */
    public Optional<Output<List<String>>> trackingParameters() {
        return Optional.ofNullable(this.trackingParameters);
    }

    private GoogleCloudDialogflowCxV3TestConfigArgs() {}

    private GoogleCloudDialogflowCxV3TestConfigArgs(GoogleCloudDialogflowCxV3TestConfigArgs $) {
        this.flow = $.flow;
        this.page = $.page;
        this.trackingParameters = $.trackingParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3TestConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3TestConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3TestConfigArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3TestConfigArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3TestConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flow Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
         * 
         * @return builder
         * 
         */
        public Builder flow(@Nullable Output<String> flow) {
            $.flow = flow;
            return this;
        }

        /**
         * @param flow Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
         * 
         * @return builder
         * 
         */
        public Builder flow(String flow) {
            return flow(Output.of(flow));
        }

        /**
         * @param page The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
         * 
         * @return builder
         * 
         */
        public Builder page(@Nullable Output<String> page) {
            $.page = page;
            return this;
        }

        /**
         * @param page The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
         * 
         * @return builder
         * 
         */
        public Builder page(String page) {
            return page(Output.of(page));
        }

        /**
         * @param trackingParameters Session parameters to be compared when calculating differences.
         * 
         * @return builder
         * 
         */
        public Builder trackingParameters(@Nullable Output<List<String>> trackingParameters) {
            $.trackingParameters = trackingParameters;
            return this;
        }

        /**
         * @param trackingParameters Session parameters to be compared when calculating differences.
         * 
         * @return builder
         * 
         */
        public Builder trackingParameters(List<String> trackingParameters) {
            return trackingParameters(Output.of(trackingParameters));
        }

        /**
         * @param trackingParameters Session parameters to be compared when calculating differences.
         * 
         * @return builder
         * 
         */
        public Builder trackingParameters(String... trackingParameters) {
            return trackingParameters(List.of(trackingParameters));
        }

        public GoogleCloudDialogflowCxV3TestConfigArgs build() {
            return $;
        }
    }

}
