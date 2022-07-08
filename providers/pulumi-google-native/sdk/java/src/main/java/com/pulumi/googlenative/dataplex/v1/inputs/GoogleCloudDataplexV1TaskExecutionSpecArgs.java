// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execution related settings, like retry and service_account.
 * 
 */
public final class GoogleCloudDataplexV1TaskExecutionSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1TaskExecutionSpecArgs Empty = new GoogleCloudDataplexV1TaskExecutionSpecArgs();

    /**
     * Optional. The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument.
     * 
     */
    @Import(name="args")
    private @Nullable Output<Map<String,String>> args;

    /**
     * @return Optional. The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument.
     * 
     */
    public Optional<Output<Map<String,String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. The maximum duration after which the job execution is expired.
     * 
     */
    @Import(name="maxJobExecutionLifetime")
    private @Nullable Output<String> maxJobExecutionLifetime;

    /**
     * @return Optional. The maximum duration after which the job execution is expired.
     * 
     */
    public Optional<Output<String>> maxJobExecutionLifetime() {
        return Optional.ofNullable(this.maxJobExecutionLifetime);
    }

    /**
     * Optional. The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the executionspec.service_account must belong to this same project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Optional. The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the executionspec.service_account must belong to this same project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private Output<String> serviceAccount;

    /**
     * @return Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }

    private GoogleCloudDataplexV1TaskExecutionSpecArgs() {}

    private GoogleCloudDataplexV1TaskExecutionSpecArgs(GoogleCloudDataplexV1TaskExecutionSpecArgs $) {
        this.args = $.args;
        this.maxJobExecutionLifetime = $.maxJobExecutionLifetime;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1TaskExecutionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1TaskExecutionSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1TaskExecutionSpecArgs();
        }

        public Builder(GoogleCloudDataplexV1TaskExecutionSpecArgs defaults) {
            $ = new GoogleCloudDataplexV1TaskExecutionSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Optional. The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<Map<String,String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional. The arguments to pass to the task. The args can use placeholders of the format ${placeholder} as part of key/value string. These will be interpolated before passing the args to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional args, set the key as TASK_ARGS. The value should be a comma-separated string of all the positional arguments. To use a delimiter other than comma, refer to https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being present in the args, then TASK_ARGS will be passed as the last argument.
         * 
         * @return builder
         * 
         */
        public Builder args(Map<String,String> args) {
            return args(Output.of(args));
        }

        /**
         * @param maxJobExecutionLifetime Optional. The maximum duration after which the job execution is expired.
         * 
         * @return builder
         * 
         */
        public Builder maxJobExecutionLifetime(@Nullable Output<String> maxJobExecutionLifetime) {
            $.maxJobExecutionLifetime = maxJobExecutionLifetime;
            return this;
        }

        /**
         * @param maxJobExecutionLifetime Optional. The maximum duration after which the job execution is expired.
         * 
         * @return builder
         * 
         */
        public Builder maxJobExecutionLifetime(String maxJobExecutionLifetime) {
            return maxJobExecutionLifetime(Output.of(maxJobExecutionLifetime));
        }

        /**
         * @param project Optional. The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the executionspec.service_account must belong to this same project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Optional. The project in which jobs are run. By default, the project containing the Lake is used. If a project is provided, the executionspec.service_account must belong to this same project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceAccount Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Service account to use to execute a task. If not provided, the default Compute service account for the project is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public GoogleCloudDataplexV1TaskExecutionSpecArgs build() {
            $.serviceAccount = Objects.requireNonNull($.serviceAccount, "expected parameter 'serviceAccount' to be non-null");
            return $;
        }
    }

}
