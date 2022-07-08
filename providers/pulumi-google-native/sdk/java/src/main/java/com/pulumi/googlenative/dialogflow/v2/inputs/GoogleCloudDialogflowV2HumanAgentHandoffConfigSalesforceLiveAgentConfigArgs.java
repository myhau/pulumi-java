// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to Salesforce Live Agent.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs();

    /**
     * Live Agent chat button ID.
     * 
     */
    @Import(name="buttonId", required=true)
    private Output<String> buttonId;

    /**
     * @return Live Agent chat button ID.
     * 
     */
    public Output<String> buttonId() {
        return this.buttonId;
    }

    /**
     * Live Agent deployment ID.
     * 
     */
    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    /**
     * @return Live Agent deployment ID.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    /**
     * Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
     */
    @Import(name="endpointDomain", required=true)
    private Output<String> endpointDomain;

    /**
     * @return Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
     */
    public Output<String> endpointDomain() {
        return this.endpointDomain;
    }

    /**
     * The organization ID of the Salesforce account.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return The organization ID of the Salesforce account.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs() {}

    private GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs(GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs $) {
        this.buttonId = $.buttonId;
        this.deploymentId = $.deploymentId;
        this.endpointDomain = $.endpointDomain;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buttonId Live Agent chat button ID.
         * 
         * @return builder
         * 
         */
        public Builder buttonId(Output<String> buttonId) {
            $.buttonId = buttonId;
            return this;
        }

        /**
         * @param buttonId Live Agent chat button ID.
         * 
         * @return builder
         * 
         */
        public Builder buttonId(String buttonId) {
            return buttonId(Output.of(buttonId));
        }

        /**
         * @param deploymentId Live Agent deployment ID.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId Live Agent deployment ID.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        /**
         * @param endpointDomain Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(Output<String> endpointDomain) {
            $.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * @param endpointDomain Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(String endpointDomain) {
            return endpointDomain(Output.of(endpointDomain));
        }

        /**
         * @param organizationId The organization ID of the Salesforce account.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID of the Salesforce account.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs build() {
            $.buttonId = Objects.requireNonNull($.buttonId, "expected parameter 'buttonId' to be non-null");
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            $.endpointDomain = Objects.requireNonNull($.endpointDomain, "expected parameter 'endpointDomain' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
