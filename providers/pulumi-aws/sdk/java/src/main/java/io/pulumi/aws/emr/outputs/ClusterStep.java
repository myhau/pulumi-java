// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.ClusterStepHadoopJarStep;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterStep {
    /**
     * Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    private final String actionOnFailure;
    /**
     * JAR file used for the step. See below.
     * 
     */
    private final ClusterStepHadoopJarStep hadoopJarStep;
    /**
     * Name of the step.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"actionOnFailure","hadoopJarStep","name"})
    private ClusterStep(
        String actionOnFailure,
        ClusterStepHadoopJarStep hadoopJarStep,
        String name) {
        this.actionOnFailure = Objects.requireNonNull(actionOnFailure);
        this.hadoopJarStep = Objects.requireNonNull(hadoopJarStep);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    public String getActionOnFailure() {
        return this.actionOnFailure;
    }
    /**
     * JAR file used for the step. See below.
     * 
     */
    public ClusterStepHadoopJarStep getHadoopJarStep() {
        return this.hadoopJarStep;
    }
    /**
     * Name of the step.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionOnFailure;
        private ClusterStepHadoopJarStep hadoopJarStep;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnFailure = defaults.actionOnFailure;
    	      this.hadoopJarStep = defaults.hadoopJarStep;
    	      this.name = defaults.name;
        }

        public Builder setActionOnFailure(String actionOnFailure) {
            this.actionOnFailure = Objects.requireNonNull(actionOnFailure);
            return this;
        }

        public Builder setHadoopJarStep(ClusterStepHadoopJarStep hadoopJarStep) {
            this.hadoopJarStep = Objects.requireNonNull(hadoopJarStep);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ClusterStep build() {
            return new ClusterStep(actionOnFailure, hadoopJarStep, name);
        }
    }
}
