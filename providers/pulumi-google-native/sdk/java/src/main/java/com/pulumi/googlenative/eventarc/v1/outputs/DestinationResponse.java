// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.eventarc.v1.outputs.CloudRunResponse;
import com.pulumi.googlenative.eventarc.v1.outputs.GKEResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DestinationResponse {
    /**
     * @return The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: `projects/{project}/locations/{location}/functions/{function}`
     * 
     */
    private final String cloudFunction;
    /**
     * @return Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
     * 
     */
    private final CloudRunResponse cloudRun;
    /**
     * @return A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    private final GKEResponse gke;
    /**
     * @return The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project}/locations/{location}/workflows/{workflow}`
     * 
     */
    private final String workflow;

    @CustomType.Constructor
    private DestinationResponse(
        @CustomType.Parameter("cloudFunction") String cloudFunction,
        @CustomType.Parameter("cloudRun") CloudRunResponse cloudRun,
        @CustomType.Parameter("gke") GKEResponse gke,
        @CustomType.Parameter("workflow") String workflow) {
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.gke = gke;
        this.workflow = workflow;
    }

    /**
     * @return The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: `projects/{project}/locations/{location}/functions/{function}`
     * 
     */
    public String cloudFunction() {
        return this.cloudFunction;
    }
    /**
     * @return Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
     * 
     */
    public CloudRunResponse cloudRun() {
        return this.cloudRun;
    }
    /**
     * @return A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    public GKEResponse gke() {
        return this.gke;
    }
    /**
     * @return The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project}/locations/{location}/workflows/{workflow}`
     * 
     */
    public String workflow() {
        return this.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudFunction;
        private CloudRunResponse cloudRun;
        private GKEResponse gke;
        private String workflow;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.gke = defaults.gke;
    	      this.workflow = defaults.workflow;
        }

        public Builder cloudFunction(String cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }
        public Builder cloudRun(CloudRunResponse cloudRun) {
            this.cloudRun = Objects.requireNonNull(cloudRun);
            return this;
        }
        public Builder gke(GKEResponse gke) {
            this.gke = Objects.requireNonNull(gke);
            return this;
        }
        public Builder workflow(String workflow) {
            this.workflow = Objects.requireNonNull(workflow);
            return this;
        }        public DestinationResponse build() {
            return new DestinationResponse(cloudFunction, cloudRun, gke, workflow);
        }
    }
}
