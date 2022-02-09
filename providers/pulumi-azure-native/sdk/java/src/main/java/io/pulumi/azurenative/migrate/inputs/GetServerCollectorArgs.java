// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerCollectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerCollectorArgs Empty = new GetServerCollectorArgs();

    @InputImport(name="projectName", required=true)
    private final String projectName;

    public String getProjectName() {
        return this.projectName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serverCollectorName", required=true)
    private final String serverCollectorName;

    public String getServerCollectorName() {
        return this.serverCollectorName;
    }

    public GetServerCollectorArgs(
        String projectName,
        String resourceGroupName,
        String serverCollectorName) {
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverCollectorName = Objects.requireNonNull(serverCollectorName, "expected parameter 'serverCollectorName' to be non-null");
    }

    private GetServerCollectorArgs() {
        this.projectName = null;
        this.resourceGroupName = null;
        this.serverCollectorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectName;
        private String resourceGroupName;
        private String serverCollectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectName = defaults.projectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverCollectorName = defaults.serverCollectorName;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServerCollectorName(String serverCollectorName) {
            this.serverCollectorName = Objects.requireNonNull(serverCollectorName);
            return this;
        }

        public GetServerCollectorArgs build() {
            return new GetServerCollectorArgs(projectName, resourceGroupName, serverCollectorName);
        }
    }
}