// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudtasks.v2beta3.outputs.AppEngineHttpQueueResponse;
import com.pulumi.googlenative.cloudtasks.v2beta3.outputs.QueueStatsResponse;
import com.pulumi.googlenative.cloudtasks.v2beta3.outputs.RateLimitsResponse;
import com.pulumi.googlenative.cloudtasks.v2beta3.outputs.RetryConfigResponse;
import com.pulumi.googlenative.cloudtasks.v2beta3.outputs.StackdriverLoggingConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQueueResult {
    /**
     * @return AppEngineHttpQueue settings apply only to App Engine tasks in this queue. Http tasks are not affected by this proto.
     * 
     */
    private final AppEngineHttpQueueResponse appEngineHttpQueue;
    /**
     * @return Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    private final String name;
    /**
     * @return The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    private final String purgeTime;
    /**
     * @return Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts. However they control task attempts in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc). The queue&#39;s actual dispatch rate is the result of: * Number of tasks in the queue * User-specified throttling: rate_limits, retry_config, and the queue&#39;s state. * System throttling due to `429` (Too Many Requests) or `503` (Service Unavailable) responses from the worker, high error rates, or to smooth sudden large traffic spikes.
     * 
     */
    private final RateLimitsResponse rateLimits;
    /**
     * @return Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    private final RetryConfigResponse retryConfig;
    /**
     * @return Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this field is unset, then no logs are written.
     * 
     */
    private final StackdriverLoggingConfigResponse stackdriverLoggingConfig;
    /**
     * @return The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    private final String state;
    /**
     * @return The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
     * 
     */
    private final QueueStatsResponse stats;
    /**
     * @return The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    private final String taskTtl;
    /**
     * @return The task tombstone time to live (TTL). After a task is deleted or executed, the task&#39;s tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can&#39;t be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    private final String tombstoneTtl;
    /**
     * @return Immutable. The type of a queue (push or pull). `Queue.type` is an immutable property of the queue that is set at the queue creation time. When left unspecified, the default value of `PUSH` is selected.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetQueueResult(
        @CustomType.Parameter("appEngineHttpQueue") AppEngineHttpQueueResponse appEngineHttpQueue,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("purgeTime") String purgeTime,
        @CustomType.Parameter("rateLimits") RateLimitsResponse rateLimits,
        @CustomType.Parameter("retryConfig") RetryConfigResponse retryConfig,
        @CustomType.Parameter("stackdriverLoggingConfig") StackdriverLoggingConfigResponse stackdriverLoggingConfig,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stats") QueueStatsResponse stats,
        @CustomType.Parameter("taskTtl") String taskTtl,
        @CustomType.Parameter("tombstoneTtl") String tombstoneTtl,
        @CustomType.Parameter("type") String type) {
        this.appEngineHttpQueue = appEngineHttpQueue;
        this.name = name;
        this.purgeTime = purgeTime;
        this.rateLimits = rateLimits;
        this.retryConfig = retryConfig;
        this.stackdriverLoggingConfig = stackdriverLoggingConfig;
        this.state = state;
        this.stats = stats;
        this.taskTtl = taskTtl;
        this.tombstoneTtl = tombstoneTtl;
        this.type = type;
    }

    /**
     * @return AppEngineHttpQueue settings apply only to App Engine tasks in this queue. Http tasks are not affected by this proto.
     * 
     */
    public AppEngineHttpQueueResponse appEngineHttpQueue() {
        return this.appEngineHttpQueue;
    }
    /**
     * @return Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    public String purgeTime() {
        return this.purgeTime;
    }
    /**
     * @return Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts. However they control task attempts in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc). The queue&#39;s actual dispatch rate is the result of: * Number of tasks in the queue * User-specified throttling: rate_limits, retry_config, and the queue&#39;s state. * System throttling due to `429` (Too Many Requests) or `503` (Service Unavailable) responses from the worker, high error rates, or to smooth sudden large traffic spikes.
     * 
     */
    public RateLimitsResponse rateLimits() {
        return this.rateLimits;
    }
    /**
     * @return Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    public RetryConfigResponse retryConfig() {
        return this.retryConfig;
    }
    /**
     * @return Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this field is unset, then no logs are written.
     * 
     */
    public StackdriverLoggingConfigResponse stackdriverLoggingConfig() {
        return this.stackdriverLoggingConfig;
    }
    /**
     * @return The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
     * 
     */
    public QueueStatsResponse stats() {
        return this.stats;
    }
    /**
     * @return The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    public String taskTtl() {
        return this.taskTtl;
    }
    /**
     * @return The task tombstone time to live (TTL). After a task is deleted or executed, the task&#39;s tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can&#39;t be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    public String tombstoneTtl() {
        return this.tombstoneTtl;
    }
    /**
     * @return Immutable. The type of a queue (push or pull). `Queue.type` is an immutable property of the queue that is set at the queue creation time. When left unspecified, the default value of `PUSH` is selected.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineHttpQueueResponse appEngineHttpQueue;
        private String name;
        private String purgeTime;
        private RateLimitsResponse rateLimits;
        private RetryConfigResponse retryConfig;
        private StackdriverLoggingConfigResponse stackdriverLoggingConfig;
        private String state;
        private QueueStatsResponse stats;
        private String taskTtl;
        private String tombstoneTtl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpQueue = defaults.appEngineHttpQueue;
    	      this.name = defaults.name;
    	      this.purgeTime = defaults.purgeTime;
    	      this.rateLimits = defaults.rateLimits;
    	      this.retryConfig = defaults.retryConfig;
    	      this.stackdriverLoggingConfig = defaults.stackdriverLoggingConfig;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
    	      this.taskTtl = defaults.taskTtl;
    	      this.tombstoneTtl = defaults.tombstoneTtl;
    	      this.type = defaults.type;
        }

        public Builder appEngineHttpQueue(AppEngineHttpQueueResponse appEngineHttpQueue) {
            this.appEngineHttpQueue = Objects.requireNonNull(appEngineHttpQueue);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder purgeTime(String purgeTime) {
            this.purgeTime = Objects.requireNonNull(purgeTime);
            return this;
        }
        public Builder rateLimits(RateLimitsResponse rateLimits) {
            this.rateLimits = Objects.requireNonNull(rateLimits);
            return this;
        }
        public Builder retryConfig(RetryConfigResponse retryConfig) {
            this.retryConfig = Objects.requireNonNull(retryConfig);
            return this;
        }
        public Builder stackdriverLoggingConfig(StackdriverLoggingConfigResponse stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = Objects.requireNonNull(stackdriverLoggingConfig);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stats(QueueStatsResponse stats) {
            this.stats = Objects.requireNonNull(stats);
            return this;
        }
        public Builder taskTtl(String taskTtl) {
            this.taskTtl = Objects.requireNonNull(taskTtl);
            return this;
        }
        public Builder tombstoneTtl(String tombstoneTtl) {
            this.tombstoneTtl = Objects.requireNonNull(tombstoneTtl);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetQueueResult build() {
            return new GetQueueResult(appEngineHttpQueue, name, purgeTime, rateLimits, retryConfig, stackdriverLoggingConfig, state, stats, taskTtl, tombstoneTtl, type);
        }
    }
}
