// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExportConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExportConfigurationArgs Empty = new GetExportConfigurationArgs();

    /**
     * The Continuous Export configuration ID. This is unique within a Application Insights component.
     * 
     */
    @Import(name="exportId", required=true)
      private final String exportId;

    public String exportId() {
        return this.exportId;
    }

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
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    public GetExportConfigurationArgs(
        String exportId,
        String resourceGroupName,
        String resourceName) {
        this.exportId = Objects.requireNonNull(exportId, "expected parameter 'exportId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetExportConfigurationArgs() {
        this.exportId = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exportId;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportId = defaults.exportId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder exportId(String exportId) {
            this.exportId = Objects.requireNonNull(exportId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetExportConfigurationArgs build() {
            return new GetExportConfigurationArgs(exportId, resourceGroupName, resourceName);
        }
    }
}
