// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAzureCliScriptArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAzureCliScriptArgs Empty = new GetAzureCliScriptArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment script.
     * 
     */
    @Import(name="scriptName", required=true)
      private final String scriptName;

    public String scriptName() {
        return this.scriptName;
    }

    public GetAzureCliScriptArgs(
        String resourceGroupName,
        String scriptName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptName = Objects.requireNonNull(scriptName, "expected parameter 'scriptName' to be non-null");
    }

    private GetAzureCliScriptArgs() {
        this.resourceGroupName = null;
        this.scriptName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCliScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String scriptName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAzureCliScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptName = defaults.scriptName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder scriptName(String scriptName) {
            this.scriptName = Objects.requireNonNull(scriptName);
            return this;
        }        public GetAzureCliScriptArgs build() {
            return new GetAzureCliScriptArgs(resourceGroupName, scriptName);
        }
    }
}
