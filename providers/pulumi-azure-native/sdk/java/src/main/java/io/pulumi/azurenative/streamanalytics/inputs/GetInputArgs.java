// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInputArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInputArgs Empty = new GetInputArgs();

    /**
     * The name of the input.
     * 
     */
    @Import(name="inputName", required=true)
      private final String inputName;

    public String inputName() {
        return this.inputName;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @Import(name="jobName", required=true)
      private final String jobName;

    public String jobName() {
        return this.jobName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetInputArgs(
        String inputName,
        String jobName,
        String resourceGroupName) {
        this.inputName = Objects.requireNonNull(inputName, "expected parameter 'inputName' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetInputArgs() {
        this.inputName = null;
        this.jobName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputName;
        private String jobName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder inputName(String inputName) {
            this.inputName = Objects.requireNonNull(inputName);
            return this;
        }
        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetInputArgs build() {
            return new GetInputArgs(inputName, jobName, resourceGroupName);
        }
    }
}
