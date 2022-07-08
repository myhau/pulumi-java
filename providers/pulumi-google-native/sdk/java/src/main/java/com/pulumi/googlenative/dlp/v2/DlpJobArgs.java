// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2InspectJobConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2RiskAnalysisJobConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DlpJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final DlpJobArgs Empty = new DlpJobArgs();

    /**
     * An inspection job scans a storage repository for InfoTypes.
     * 
     */
    @Import(name="inspectJob")
    private @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;

    /**
     * @return An inspection job scans a storage repository for InfoTypes.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2InspectJobConfigArgs>> inspectJob() {
        return Optional.ofNullable(this.inspectJob);
    }

    /**
     * The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * Deprecated. This field has no effect.
     * 
     * @deprecated
     * Deprecated. This field has no effect.
     * 
     */
    @Deprecated /* Deprecated. This field has no effect. */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Deprecated. This field has no effect.
     * 
     * @deprecated
     * Deprecated. This field has no effect.
     * 
     */
    @Deprecated /* Deprecated. This field has no effect. */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A risk analysis job calculates re-identification risk metrics for a BigQuery table.
     * 
     */
    @Import(name="riskJob")
    private @Nullable Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> riskJob;

    /**
     * @return A risk analysis job calculates re-identification risk metrics for a BigQuery table.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs>> riskJob() {
        return Optional.ofNullable(this.riskJob);
    }

    private DlpJobArgs() {}

    private DlpJobArgs(DlpJobArgs $) {
        this.inspectJob = $.inspectJob;
        this.jobId = $.jobId;
        this.location = $.location;
        this.project = $.project;
        this.riskJob = $.riskJob;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DlpJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DlpJobArgs $;

        public Builder() {
            $ = new DlpJobArgs();
        }

        public Builder(DlpJobArgs defaults) {
            $ = new DlpJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inspectJob An inspection job scans a storage repository for InfoTypes.
         * 
         * @return builder
         * 
         */
        public Builder inspectJob(@Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob) {
            $.inspectJob = inspectJob;
            return this;
        }

        /**
         * @param inspectJob An inspection job scans a storage repository for InfoTypes.
         * 
         * @return builder
         * 
         */
        public Builder inspectJob(GooglePrivacyDlpV2InspectJobConfigArgs inspectJob) {
            return inspectJob(Output.of(inspectJob));
        }

        /**
         * @param jobId The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param location Deprecated. This field has no effect.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. This field has no effect.
         * 
         */
        @Deprecated /* Deprecated. This field has no effect. */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Deprecated. This field has no effect.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. This field has no effect.
         * 
         */
        @Deprecated /* Deprecated. This field has no effect. */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param riskJob A risk analysis job calculates re-identification risk metrics for a BigQuery table.
         * 
         * @return builder
         * 
         */
        public Builder riskJob(@Nullable Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> riskJob) {
            $.riskJob = riskJob;
            return this;
        }

        /**
         * @param riskJob A risk analysis job calculates re-identification risk metrics for a BigQuery table.
         * 
         * @return builder
         * 
         */
        public Builder riskJob(GooglePrivacyDlpV2RiskAnalysisJobConfigArgs riskJob) {
            return riskJob(Output.of(riskJob));
        }

        public DlpJobArgs build() {
            return $;
        }
    }

}
