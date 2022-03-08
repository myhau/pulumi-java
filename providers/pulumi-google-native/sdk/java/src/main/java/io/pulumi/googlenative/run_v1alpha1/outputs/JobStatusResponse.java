// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.InstanceStatusResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.JobConditionResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobStatusResponse {
    /**
     * Optional. The number of actively running instances. +optional
     * 
     */
    private final Integer active;
    /**
     * Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    private final String completionTime;
    /**
     * Optional. The latest available observations of a job's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    private final List<JobConditionResponse> conditions;
    /**
     * Optional. The number of instances which reached phase Failed. +optional
     * 
     */
    private final Integer failed;
    /**
     * Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
     * 
     */
    private final String imageDigest;
    /**
     * Optional. Status of completed, failed, and running instances. +optional
     * 
     */
    private final List<InstanceStatusResponse> instances;
    /**
     * Optional. The 'generation' of the job that was last processed by the controller.
     * 
     */
    private final Integer observedGeneration;
    /**
     * Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    private final String startTime;
    /**
     * Optional. The number of instances which reached phase Succeeded. +optional
     * 
     */
    private final Integer succeeded;

    @OutputCustomType.Constructor({"active","completionTime","conditions","failed","imageDigest","instances","observedGeneration","startTime","succeeded"})
    private JobStatusResponse(
        Integer active,
        String completionTime,
        List<JobConditionResponse> conditions,
        Integer failed,
        String imageDigest,
        List<InstanceStatusResponse> instances,
        Integer observedGeneration,
        String startTime,
        Integer succeeded) {
        this.active = active;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.imageDigest = imageDigest;
        this.instances = instances;
        this.observedGeneration = observedGeneration;
        this.startTime = startTime;
        this.succeeded = succeeded;
    }

    /**
     * Optional. The number of actively running instances. +optional
     * 
    */
    public Integer getActive() {
        return this.active;
    }
    /**
     * Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
    */
    public String getCompletionTime() {
        return this.completionTime;
    }
    /**
     * Optional. The latest available observations of a job's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
    */
    public List<JobConditionResponse> getConditions() {
        return this.conditions;
    }
    /**
     * Optional. The number of instances which reached phase Failed. +optional
     * 
    */
    public Integer getFailed() {
        return this.failed;
    }
    /**
     * Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
     * 
    */
    public String getImageDigest() {
        return this.imageDigest;
    }
    /**
     * Optional. Status of completed, failed, and running instances. +optional
     * 
    */
    public List<InstanceStatusResponse> getInstances() {
        return this.instances;
    }
    /**
     * Optional. The 'generation' of the job that was last processed by the controller.
     * 
    */
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }
    /**
     * Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Optional. The number of instances which reached phase Succeeded. +optional
     * 
    */
    public Integer getSucceeded() {
        return this.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer active;
        private String completionTime;
        private List<JobConditionResponse> conditions;
        private Integer failed;
        private String imageDigest;
        private List<InstanceStatusResponse> instances;
        private Integer observedGeneration;
        private String startTime;
        private Integer succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.imageDigest = defaults.imageDigest;
    	      this.instances = defaults.instances;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder setActive(Integer active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }

        public Builder setCompletionTime(String completionTime) {
            this.completionTime = Objects.requireNonNull(completionTime);
            return this;
        }

        public Builder setConditions(List<JobConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setFailed(Integer failed) {
            this.failed = Objects.requireNonNull(failed);
            return this;
        }

        public Builder setImageDigest(String imageDigest) {
            this.imageDigest = Objects.requireNonNull(imageDigest);
            return this;
        }

        public Builder setInstances(List<InstanceStatusResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setSucceeded(Integer succeeded) {
            this.succeeded = Objects.requireNonNull(succeeded);
            return this;
        }
        public JobStatusResponse build() {
            return new JobStatusResponse(active, completionTime, conditions, failed, imageDigest, instances, observedGeneration, startTime, succeeded);
        }
    }
}
