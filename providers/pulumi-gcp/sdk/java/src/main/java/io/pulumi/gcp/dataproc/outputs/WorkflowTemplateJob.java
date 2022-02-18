// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobHadoopJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobHiveJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPigJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPrestoJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPysparkJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobScheduling;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkRJob;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkSqlJob;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplateJob {
    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    private final @Nullable WorkflowTemplateJobHadoopJob hadoopJob;
    /**
     * Optional. Job is a Hive job.
     * 
     */
    private final @Nullable WorkflowTemplateJobHiveJob hiveJob;
    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * Optional. Job is a Pig job.
     * 
     */
    private final @Nullable WorkflowTemplateJobPigJob pigJob;
    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    private final @Nullable List<String> prerequisiteStepIds;
    /**
     * Optional. Job is a Presto job.
     * 
     */
    private final @Nullable WorkflowTemplateJobPrestoJob prestoJob;
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    private final @Nullable WorkflowTemplateJobPysparkJob pysparkJob;
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    private final @Nullable WorkflowTemplateJobScheduling scheduling;
    /**
     * Optional. Job is a Spark job.
     * 
     */
    private final @Nullable WorkflowTemplateJobSparkJob sparkJob;
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    private final @Nullable WorkflowTemplateJobSparkRJob sparkRJob;
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    private final @Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob;
    /**
     * Required. The step id. The id must be unique among all jobs within the template. The step id is used as prefix for job id, as job `goog-dataproc-workflow-step-id` label, and in field from other steps. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    private final String stepId;

    @OutputCustomType.Constructor({"hadoopJob","hiveJob","labels","pigJob","prerequisiteStepIds","prestoJob","pysparkJob","scheduling","sparkJob","sparkRJob","sparkSqlJob","stepId"})
    private WorkflowTemplateJob(
        @Nullable WorkflowTemplateJobHadoopJob hadoopJob,
        @Nullable WorkflowTemplateJobHiveJob hiveJob,
        @Nullable Map<String,String> labels,
        @Nullable WorkflowTemplateJobPigJob pigJob,
        @Nullable List<String> prerequisiteStepIds,
        @Nullable WorkflowTemplateJobPrestoJob prestoJob,
        @Nullable WorkflowTemplateJobPysparkJob pysparkJob,
        @Nullable WorkflowTemplateJobScheduling scheduling,
        @Nullable WorkflowTemplateJobSparkJob sparkJob,
        @Nullable WorkflowTemplateJobSparkRJob sparkRJob,
        @Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob,
        String stepId) {
        this.hadoopJob = hadoopJob;
        this.hiveJob = hiveJob;
        this.labels = labels;
        this.pigJob = pigJob;
        this.prerequisiteStepIds = prerequisiteStepIds;
        this.prestoJob = prestoJob;
        this.pysparkJob = pysparkJob;
        this.scheduling = scheduling;
        this.sparkJob = sparkJob;
        this.sparkRJob = sparkRJob;
        this.sparkSqlJob = sparkSqlJob;
        this.stepId = Objects.requireNonNull(stepId);
    }

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    public Optional<WorkflowTemplateJobHadoopJob> getHadoopJob() {
        return Optional.ofNullable(this.hadoopJob);
    }
    /**
     * Optional. Job is a Hive job.
     * 
     */
    public Optional<WorkflowTemplateJobHiveJob> getHiveJob() {
        return Optional.ofNullable(this.hiveJob);
    }
    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * Optional. Job is a Pig job.
     * 
     */
    public Optional<WorkflowTemplateJobPigJob> getPigJob() {
        return Optional.ofNullable(this.pigJob);
    }
    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    public List<String> getPrerequisiteStepIds() {
        return this.prerequisiteStepIds == null ? List.of() : this.prerequisiteStepIds;
    }
    /**
     * Optional. Job is a Presto job.
     * 
     */
    public Optional<WorkflowTemplateJobPrestoJob> getPrestoJob() {
        return Optional.ofNullable(this.prestoJob);
    }
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    public Optional<WorkflowTemplateJobPysparkJob> getPysparkJob() {
        return Optional.ofNullable(this.pysparkJob);
    }
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    public Optional<WorkflowTemplateJobScheduling> getScheduling() {
        return Optional.ofNullable(this.scheduling);
    }
    /**
     * Optional. Job is a Spark job.
     * 
     */
    public Optional<WorkflowTemplateJobSparkJob> getSparkJob() {
        return Optional.ofNullable(this.sparkJob);
    }
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    public Optional<WorkflowTemplateJobSparkRJob> getSparkRJob() {
        return Optional.ofNullable(this.sparkRJob);
    }
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    public Optional<WorkflowTemplateJobSparkSqlJob> getSparkSqlJob() {
        return Optional.ofNullable(this.sparkSqlJob);
    }
    /**
     * Required. The step id. The id must be unique among all jobs within the template. The step id is used as prefix for job id, as job `goog-dataproc-workflow-step-id` label, and in field from other steps. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    public String getStepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplateJobHadoopJob hadoopJob;
        private @Nullable WorkflowTemplateJobHiveJob hiveJob;
        private @Nullable Map<String,String> labels;
        private @Nullable WorkflowTemplateJobPigJob pigJob;
        private @Nullable List<String> prerequisiteStepIds;
        private @Nullable WorkflowTemplateJobPrestoJob prestoJob;
        private @Nullable WorkflowTemplateJobPysparkJob pysparkJob;
        private @Nullable WorkflowTemplateJobScheduling scheduling;
        private @Nullable WorkflowTemplateJobSparkJob sparkJob;
        private @Nullable WorkflowTemplateJobSparkRJob sparkRJob;
        private @Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder setHadoopJob(@Nullable WorkflowTemplateJobHadoopJob hadoopJob) {
            this.hadoopJob = hadoopJob;
            return this;
        }

        public Builder setHiveJob(@Nullable WorkflowTemplateJobHiveJob hiveJob) {
            this.hiveJob = hiveJob;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setPigJob(@Nullable WorkflowTemplateJobPigJob pigJob) {
            this.pigJob = pigJob;
            return this;
        }

        public Builder setPrerequisiteStepIds(@Nullable List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = prerequisiteStepIds;
            return this;
        }

        public Builder setPrestoJob(@Nullable WorkflowTemplateJobPrestoJob prestoJob) {
            this.prestoJob = prestoJob;
            return this;
        }

        public Builder setPysparkJob(@Nullable WorkflowTemplateJobPysparkJob pysparkJob) {
            this.pysparkJob = pysparkJob;
            return this;
        }

        public Builder setScheduling(@Nullable WorkflowTemplateJobScheduling scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setSparkJob(@Nullable WorkflowTemplateJobSparkJob sparkJob) {
            this.sparkJob = sparkJob;
            return this;
        }

        public Builder setSparkRJob(@Nullable WorkflowTemplateJobSparkRJob sparkRJob) {
            this.sparkRJob = sparkRJob;
            return this;
        }

        public Builder setSparkSqlJob(@Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob) {
            this.sparkSqlJob = sparkSqlJob;
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public WorkflowTemplateJob build() {
            return new WorkflowTemplateJob(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
