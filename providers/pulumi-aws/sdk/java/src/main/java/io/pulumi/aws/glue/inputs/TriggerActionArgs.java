// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.TriggerActionNotificationPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerActionArgs Empty = new TriggerActionArgs();

    /**
     * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
     * 
     */
    @InputImport(name="arguments")
      private final @Nullable Input<Map<String,String>> arguments;

    public Input<Map<String,String>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    @InputImport(name="crawlerName")
      private final @Nullable Input<String> crawlerName;

    public Input<String> getCrawlerName() {
        return this.crawlerName == null ? Input.empty() : this.crawlerName;
    }

    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    @InputImport(name="jobName")
      private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    /**
     * Specifies configuration properties of a job run notification. See Notification Property details below.
     * 
     */
    @InputImport(name="notificationProperty")
      private final @Nullable Input<TriggerActionNotificationPropertyArgs> notificationProperty;

    public Input<TriggerActionNotificationPropertyArgs> getNotificationProperty() {
        return this.notificationProperty == null ? Input.empty() : this.notificationProperty;
    }

    /**
     * The name of the Security Configuration structure to be used with this action.
     * 
     */
    @InputImport(name="securityConfiguration")
      private final @Nullable Input<String> securityConfiguration;

    public Input<String> getSecurityConfiguration() {
        return this.securityConfiguration == null ? Input.empty() : this.securityConfiguration;
    }

    /**
     * The job run timeout in minutes. It overrides the timeout value of the job.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public TriggerActionArgs(
        @Nullable Input<Map<String,String>> arguments,
        @Nullable Input<String> crawlerName,
        @Nullable Input<String> jobName,
        @Nullable Input<TriggerActionNotificationPropertyArgs> notificationProperty,
        @Nullable Input<String> securityConfiguration,
        @Nullable Input<Integer> timeout) {
        this.arguments = arguments;
        this.crawlerName = crawlerName;
        this.jobName = jobName;
        this.notificationProperty = notificationProperty;
        this.securityConfiguration = securityConfiguration;
        this.timeout = timeout;
    }

    private TriggerActionArgs() {
        this.arguments = Input.empty();
        this.crawlerName = Input.empty();
        this.jobName = Input.empty();
        this.notificationProperty = Input.empty();
        this.securityConfiguration = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> arguments;
        private @Nullable Input<String> crawlerName;
        private @Nullable Input<String> jobName;
        private @Nullable Input<TriggerActionNotificationPropertyArgs> notificationProperty;
        private @Nullable Input<String> securityConfiguration;
        private @Nullable Input<Integer> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.crawlerName = defaults.crawlerName;
    	      this.jobName = defaults.jobName;
    	      this.notificationProperty = defaults.notificationProperty;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.timeout = defaults.timeout;
        }

        public Builder setArguments(@Nullable Input<Map<String,String>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable Map<String,String> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setCrawlerName(@Nullable Input<String> crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }

        public Builder setCrawlerName(@Nullable String crawlerName) {
            this.crawlerName = Input.ofNullable(crawlerName);
            return this;
        }

        public Builder setJobName(@Nullable Input<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setJobName(@Nullable String jobName) {
            this.jobName = Input.ofNullable(jobName);
            return this;
        }

        public Builder setNotificationProperty(@Nullable Input<TriggerActionNotificationPropertyArgs> notificationProperty) {
            this.notificationProperty = notificationProperty;
            return this;
        }

        public Builder setNotificationProperty(@Nullable TriggerActionNotificationPropertyArgs notificationProperty) {
            this.notificationProperty = Input.ofNullable(notificationProperty);
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable Input<String> securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = Input.ofNullable(securityConfiguration);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public TriggerActionArgs build() {
            return new TriggerActionArgs(arguments, crawlerName, jobName, notificationProperty, securityConfiguration, timeout);
        }
    }
}
