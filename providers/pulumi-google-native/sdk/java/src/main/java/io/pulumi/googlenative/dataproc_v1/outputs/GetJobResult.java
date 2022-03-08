// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.HadoopJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.HiveJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.JobPlacementResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.JobReferenceResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.JobSchedulingResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.JobStatusResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.PigJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.PrestoJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.PySparkJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkRJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkSqlJobResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.YarnApplicationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetJobResult {
    /**
     * Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    private final Boolean done;
    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    private final String driverControlFilesUri;
    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    private final String driverOutputResourceUri;
    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    private final HadoopJobResponse hadoopJob;
    /**
     * Optional. Job is a Hive job.
     * 
     */
    private final HiveJobResponse hiveJob;
    /**
     * A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    private final String jobUuid;
    /**
     * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Job is a Pig job.
     * 
     */
    private final PigJobResponse pigJob;
    /**
     * Job information, including how, when, and where to run the job.
     * 
     */
    private final JobPlacementResponse placement;
    /**
     * Optional. Job is a Presto job.
     * 
     */
    private final PrestoJobResponse prestoJob;
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    private final PySparkJobResponse pysparkJob;
    /**
     * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    private final JobReferenceResponse reference;
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    private final JobSchedulingResponse scheduling;
    /**
     * Optional. Job is a Spark job.
     * 
     */
    private final SparkJobResponse sparkJob;
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    private final SparkRJobResponse sparkRJob;
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    private final SparkSqlJobResponse sparkSqlJob;
    /**
     * The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    private final JobStatusResponse status;
    /**
     * The previous job status.
     * 
     */
    private final List<JobStatusResponse> statusHistory;
    /**
     * The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    private final List<YarnApplicationResponse> yarnApplications;

    @OutputCustomType.Constructor({"done","driverControlFilesUri","driverOutputResourceUri","hadoopJob","hiveJob","jobUuid","labels","pigJob","placement","prestoJob","pysparkJob","reference","scheduling","sparkJob","sparkRJob","sparkSqlJob","status","statusHistory","yarnApplications"})
    private GetJobResult(
        Boolean done,
        String driverControlFilesUri,
        String driverOutputResourceUri,
        HadoopJobResponse hadoopJob,
        HiveJobResponse hiveJob,
        String jobUuid,
        Map<String,String> labels,
        PigJobResponse pigJob,
        JobPlacementResponse placement,
        PrestoJobResponse prestoJob,
        PySparkJobResponse pysparkJob,
        JobReferenceResponse reference,
        JobSchedulingResponse scheduling,
        SparkJobResponse sparkJob,
        SparkRJobResponse sparkRJob,
        SparkSqlJobResponse sparkSqlJob,
        JobStatusResponse status,
        List<JobStatusResponse> statusHistory,
        List<YarnApplicationResponse> yarnApplications) {
        this.done = done;
        this.driverControlFilesUri = driverControlFilesUri;
        this.driverOutputResourceUri = driverOutputResourceUri;
        this.hadoopJob = hadoopJob;
        this.hiveJob = hiveJob;
        this.jobUuid = jobUuid;
        this.labels = labels;
        this.pigJob = pigJob;
        this.placement = placement;
        this.prestoJob = prestoJob;
        this.pysparkJob = pysparkJob;
        this.reference = reference;
        this.scheduling = scheduling;
        this.sparkJob = sparkJob;
        this.sparkRJob = sparkRJob;
        this.sparkSqlJob = sparkSqlJob;
        this.status = status;
        this.statusHistory = statusHistory;
        this.yarnApplications = yarnApplications;
    }

    /**
     * Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
    */
    public Boolean getDone() {
        return this.done;
    }
    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
    */
    public String getDriverControlFilesUri() {
        return this.driverControlFilesUri;
    }
    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     * 
    */
    public String getDriverOutputResourceUri() {
        return this.driverOutputResourceUri;
    }
    /**
     * Optional. Job is a Hadoop job.
     * 
    */
    public HadoopJobResponse getHadoopJob() {
        return this.hadoopJob;
    }
    /**
     * Optional. Job is a Hive job.
     * 
    */
    public HiveJobResponse getHiveJob() {
        return this.hiveJob;
    }
    /**
     * A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
    */
    public String getJobUuid() {
        return this.jobUuid;
    }
    /**
     * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Job is a Pig job.
     * 
    */
    public PigJobResponse getPigJob() {
        return this.pigJob;
    }
    /**
     * Job information, including how, when, and where to run the job.
     * 
    */
    public JobPlacementResponse getPlacement() {
        return this.placement;
    }
    /**
     * Optional. Job is a Presto job.
     * 
    */
    public PrestoJobResponse getPrestoJob() {
        return this.prestoJob;
    }
    /**
     * Optional. Job is a PySpark job.
     * 
    */
    public PySparkJobResponse getPysparkJob() {
        return this.pysparkJob;
    }
    /**
     * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
    */
    public JobReferenceResponse getReference() {
        return this.reference;
    }
    /**
     * Optional. Job scheduling configuration.
     * 
    */
    public JobSchedulingResponse getScheduling() {
        return this.scheduling;
    }
    /**
     * Optional. Job is a Spark job.
     * 
    */
    public SparkJobResponse getSparkJob() {
        return this.sparkJob;
    }
    /**
     * Optional. Job is a SparkR job.
     * 
    */
    public SparkRJobResponse getSparkRJob() {
        return this.sparkRJob;
    }
    /**
     * Optional. Job is a SparkSql job.
     * 
    */
    public SparkSqlJobResponse getSparkSqlJob() {
        return this.sparkSqlJob;
    }
    /**
     * The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
    */
    public JobStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The previous job status.
     * 
    */
    public List<JobStatusResponse> getStatusHistory() {
        return this.statusHistory;
    }
    /**
     * The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
    */
    public List<YarnApplicationResponse> getYarnApplications() {
        return this.yarnApplications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean done;
        private String driverControlFilesUri;
        private String driverOutputResourceUri;
        private HadoopJobResponse hadoopJob;
        private HiveJobResponse hiveJob;
        private String jobUuid;
        private Map<String,String> labels;
        private PigJobResponse pigJob;
        private JobPlacementResponse placement;
        private PrestoJobResponse prestoJob;
        private PySparkJobResponse pysparkJob;
        private JobReferenceResponse reference;
        private JobSchedulingResponse scheduling;
        private SparkJobResponse sparkJob;
        private SparkRJobResponse sparkRJob;
        private SparkSqlJobResponse sparkSqlJob;
        private JobStatusResponse status;
        private List<JobStatusResponse> statusHistory;
        private List<YarnApplicationResponse> yarnApplications;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.done = defaults.done;
    	      this.driverControlFilesUri = defaults.driverControlFilesUri;
    	      this.driverOutputResourceUri = defaults.driverOutputResourceUri;
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.jobUuid = defaults.jobUuid;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.placement = defaults.placement;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.reference = defaults.reference;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.status = defaults.status;
    	      this.statusHistory = defaults.statusHistory;
    	      this.yarnApplications = defaults.yarnApplications;
        }

        public Builder setDone(Boolean done) {
            this.done = Objects.requireNonNull(done);
            return this;
        }

        public Builder setDriverControlFilesUri(String driverControlFilesUri) {
            this.driverControlFilesUri = Objects.requireNonNull(driverControlFilesUri);
            return this;
        }

        public Builder setDriverOutputResourceUri(String driverOutputResourceUri) {
            this.driverOutputResourceUri = Objects.requireNonNull(driverOutputResourceUri);
            return this;
        }

        public Builder setHadoopJob(HadoopJobResponse hadoopJob) {
            this.hadoopJob = Objects.requireNonNull(hadoopJob);
            return this;
        }

        public Builder setHiveJob(HiveJobResponse hiveJob) {
            this.hiveJob = Objects.requireNonNull(hiveJob);
            return this;
        }

        public Builder setJobUuid(String jobUuid) {
            this.jobUuid = Objects.requireNonNull(jobUuid);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setPigJob(PigJobResponse pigJob) {
            this.pigJob = Objects.requireNonNull(pigJob);
            return this;
        }

        public Builder setPlacement(JobPlacementResponse placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }

        public Builder setPrestoJob(PrestoJobResponse prestoJob) {
            this.prestoJob = Objects.requireNonNull(prestoJob);
            return this;
        }

        public Builder setPysparkJob(PySparkJobResponse pysparkJob) {
            this.pysparkJob = Objects.requireNonNull(pysparkJob);
            return this;
        }

        public Builder setReference(JobReferenceResponse reference) {
            this.reference = Objects.requireNonNull(reference);
            return this;
        }

        public Builder setScheduling(JobSchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder setSparkJob(SparkJobResponse sparkJob) {
            this.sparkJob = Objects.requireNonNull(sparkJob);
            return this;
        }

        public Builder setSparkRJob(SparkRJobResponse sparkRJob) {
            this.sparkRJob = Objects.requireNonNull(sparkRJob);
            return this;
        }

        public Builder setSparkSqlJob(SparkSqlJobResponse sparkSqlJob) {
            this.sparkSqlJob = Objects.requireNonNull(sparkSqlJob);
            return this;
        }

        public Builder setStatus(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusHistory(List<JobStatusResponse> statusHistory) {
            this.statusHistory = Objects.requireNonNull(statusHistory);
            return this;
        }

        public Builder setYarnApplications(List<YarnApplicationResponse> yarnApplications) {
            this.yarnApplications = Objects.requireNonNull(yarnApplications);
            return this;
        }
        public GetJobResult build() {
            return new GetJobResult(done, driverControlFilesUri, driverOutputResourceUri, hadoopJob, hiveJob, jobUuid, labels, pigJob, placement, prestoJob, pysparkJob, reference, scheduling, sparkJob, sparkRJob, sparkSqlJob, status, statusHistory, yarnApplications);
        }
    }
}
