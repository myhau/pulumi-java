// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVariableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVariableArgs Empty = new GetVariableArgs();

    @InputImport(name="automationAccountName", required=true)
    private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="variableName", required=true)
    private final String variableName;

    public String getVariableName() {
        return this.variableName;
    }

    public GetVariableArgs(
        String automationAccountName,
        String resourceGroupName,
        String variableName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
    }

    private GetVariableArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
        this.variableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;
        private String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.variableName = defaults.variableName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVariableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public GetVariableArgs build() {
            return new GetVariableArgs(automationAccountName, resourceGroupName, variableName);
        }
    }
}