// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.EntityStatus;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * ISO 8061 timeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    @Import(name="autoDeleteOnIdle")
      private final @Nullable Output<String> autoDeleteOnIdle;

    public Output<String> autoDeleteOnIdle() {
        return this.autoDeleteOnIdle == null ? Codegen.empty() : this.autoDeleteOnIdle;
    }

    /**
     * A value that indicates whether this queue has dead letter support when a message expires.
     * 
     */
    @Import(name="deadLetteringOnMessageExpiration")
      private final @Nullable Output<Boolean> deadLetteringOnMessageExpiration;

    public Output<Boolean> deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration == null ? Codegen.empty() : this.deadLetteringOnMessageExpiration;
    }

    /**
     * ISO 8601 default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    @Import(name="defaultMessageTimeToLive")
      private final @Nullable Output<String> defaultMessageTimeToLive;

    public Output<String> defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive == null ? Codegen.empty() : this.defaultMessageTimeToLive;
    }

    /**
     * ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    @Import(name="duplicateDetectionHistoryTimeWindow")
      private final @Nullable Output<String> duplicateDetectionHistoryTimeWindow;

    public Output<String> duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow == null ? Codegen.empty() : this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Value that indicates whether server-side batched operations are enabled.
     * 
     */
    @Import(name="enableBatchedOperations")
      private final @Nullable Output<Boolean> enableBatchedOperations;

    public Output<Boolean> enableBatchedOperations() {
        return this.enableBatchedOperations == null ? Codegen.empty() : this.enableBatchedOperations;
    }

    /**
     * A value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    @Import(name="enableExpress")
      private final @Nullable Output<Boolean> enableExpress;

    public Output<Boolean> enableExpress() {
        return this.enableExpress == null ? Codegen.empty() : this.enableExpress;
    }

    /**
     * A value that indicates whether the queue is to be partitioned across multiple message brokers.
     * 
     */
    @Import(name="enablePartitioning")
      private final @Nullable Output<Boolean> enablePartitioning;

    public Output<Boolean> enablePartitioning() {
        return this.enablePartitioning == null ? Codegen.empty() : this.enablePartitioning;
    }

    /**
     * Queue/Topic name to forward the Dead Letter message
     * 
     */
    @Import(name="forwardDeadLetteredMessagesTo")
      private final @Nullable Output<String> forwardDeadLetteredMessagesTo;

    public Output<String> forwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo == null ? Codegen.empty() : this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Queue/Topic name to forward the messages
     * 
     */
    @Import(name="forwardTo")
      private final @Nullable Output<String> forwardTo;

    public Output<String> forwardTo() {
        return this.forwardTo == null ? Codegen.empty() : this.forwardTo;
    }

    /**
     * ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     * 
     */
    @Import(name="lockDuration")
      private final @Nullable Output<String> lockDuration;

    public Output<String> lockDuration() {
        return this.lockDuration == null ? Codegen.empty() : this.lockDuration;
    }

    /**
     * The maximum delivery count. A message is automatically deadlettered after this number of deliveries. default value is 10.
     * 
     */
    @Import(name="maxDeliveryCount")
      private final @Nullable Output<Integer> maxDeliveryCount;

    public Output<Integer> maxDeliveryCount() {
        return this.maxDeliveryCount == null ? Codegen.empty() : this.maxDeliveryCount;
    }

    /**
     * The maximum size of the queue in megabytes, which is the size of memory allocated for the queue. Default is 1024.
     * 
     */
    @Import(name="maxSizeInMegabytes")
      private final @Nullable Output<Integer> maxSizeInMegabytes;

    public Output<Integer> maxSizeInMegabytes() {
        return this.maxSizeInMegabytes == null ? Codegen.empty() : this.maxSizeInMegabytes;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The queue name.
     * 
     */
    @Import(name="queueName")
      private final @Nullable Output<String> queueName;

    public Output<String> queueName() {
        return this.queueName == null ? Codegen.empty() : this.queueName;
    }

    /**
     * A value indicating if this queue requires duplicate detection.
     * 
     */
    @Import(name="requiresDuplicateDetection")
      private final @Nullable Output<Boolean> requiresDuplicateDetection;

    public Output<Boolean> requiresDuplicateDetection() {
        return this.requiresDuplicateDetection == null ? Codegen.empty() : this.requiresDuplicateDetection;
    }

    /**
     * A value that indicates whether the queue supports the concept of sessions.
     * 
     */
    @Import(name="requiresSession")
      private final @Nullable Output<Boolean> requiresSession;

    public Output<Boolean> requiresSession() {
        return this.requiresSession == null ? Codegen.empty() : this.requiresSession;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<EntityStatus> status;

    public Output<EntityStatus> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public QueueArgs(
        @Nullable Output<String> autoDeleteOnIdle,
        @Nullable Output<Boolean> deadLetteringOnMessageExpiration,
        @Nullable Output<String> defaultMessageTimeToLive,
        @Nullable Output<String> duplicateDetectionHistoryTimeWindow,
        @Nullable Output<Boolean> enableBatchedOperations,
        @Nullable Output<Boolean> enableExpress,
        @Nullable Output<Boolean> enablePartitioning,
        @Nullable Output<String> forwardDeadLetteredMessagesTo,
        @Nullable Output<String> forwardTo,
        @Nullable Output<String> lockDuration,
        @Nullable Output<Integer> maxDeliveryCount,
        @Nullable Output<Integer> maxSizeInMegabytes,
        Output<String> namespaceName,
        @Nullable Output<String> queueName,
        @Nullable Output<Boolean> requiresDuplicateDetection,
        @Nullable Output<Boolean> requiresSession,
        Output<String> resourceGroupName,
        @Nullable Output<EntityStatus> status) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.enableExpress = enableExpress;
        this.enablePartitioning = enablePartitioning;
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        this.forwardTo = forwardTo;
        this.lockDuration = lockDuration;
        this.maxDeliveryCount = maxDeliveryCount;
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.queueName = queueName;
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        this.requiresSession = requiresSession;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
    }

    private QueueArgs() {
        this.autoDeleteOnIdle = Codegen.empty();
        this.deadLetteringOnMessageExpiration = Codegen.empty();
        this.defaultMessageTimeToLive = Codegen.empty();
        this.duplicateDetectionHistoryTimeWindow = Codegen.empty();
        this.enableBatchedOperations = Codegen.empty();
        this.enableExpress = Codegen.empty();
        this.enablePartitioning = Codegen.empty();
        this.forwardDeadLetteredMessagesTo = Codegen.empty();
        this.forwardTo = Codegen.empty();
        this.lockDuration = Codegen.empty();
        this.maxDeliveryCount = Codegen.empty();
        this.maxSizeInMegabytes = Codegen.empty();
        this.namespaceName = Codegen.empty();
        this.queueName = Codegen.empty();
        this.requiresDuplicateDetection = Codegen.empty();
        this.requiresSession = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoDeleteOnIdle;
        private @Nullable Output<Boolean> deadLetteringOnMessageExpiration;
        private @Nullable Output<String> defaultMessageTimeToLive;
        private @Nullable Output<String> duplicateDetectionHistoryTimeWindow;
        private @Nullable Output<Boolean> enableBatchedOperations;
        private @Nullable Output<Boolean> enableExpress;
        private @Nullable Output<Boolean> enablePartitioning;
        private @Nullable Output<String> forwardDeadLetteredMessagesTo;
        private @Nullable Output<String> forwardTo;
        private @Nullable Output<String> lockDuration;
        private @Nullable Output<Integer> maxDeliveryCount;
        private @Nullable Output<Integer> maxSizeInMegabytes;
        private Output<String> namespaceName;
        private @Nullable Output<String> queueName;
        private @Nullable Output<Boolean> requiresDuplicateDetection;
        private @Nullable Output<Boolean> requiresSession;
        private Output<String> resourceGroupName;
        private @Nullable Output<EntityStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.deadLetteringOnMessageExpiration = defaults.deadLetteringOnMessageExpiration;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.forwardDeadLetteredMessagesTo = defaults.forwardDeadLetteredMessagesTo;
    	      this.forwardTo = defaults.forwardTo;
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.namespaceName = defaults.namespaceName;
    	      this.queueName = defaults.queueName;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.requiresSession = defaults.requiresSession;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
        }

        public Builder autoDeleteOnIdle(@Nullable Output<String> autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }
        public Builder autoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = Codegen.ofNullable(autoDeleteOnIdle);
            return this;
        }
        public Builder deadLetteringOnMessageExpiration(@Nullable Output<Boolean> deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            return this;
        }
        public Builder deadLetteringOnMessageExpiration(@Nullable Boolean deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = Codegen.ofNullable(deadLetteringOnMessageExpiration);
            return this;
        }
        public Builder defaultMessageTimeToLive(@Nullable Output<String> defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }
        public Builder defaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = Codegen.ofNullable(defaultMessageTimeToLive);
            return this;
        }
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable Output<String> duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = Codegen.ofNullable(duplicateDetectionHistoryTimeWindow);
            return this;
        }
        public Builder enableBatchedOperations(@Nullable Output<Boolean> enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }
        public Builder enableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = Codegen.ofNullable(enableBatchedOperations);
            return this;
        }
        public Builder enableExpress(@Nullable Output<Boolean> enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }
        public Builder enableExpress(@Nullable Boolean enableExpress) {
            this.enableExpress = Codegen.ofNullable(enableExpress);
            return this;
        }
        public Builder enablePartitioning(@Nullable Output<Boolean> enablePartitioning) {
            this.enablePartitioning = enablePartitioning;
            return this;
        }
        public Builder enablePartitioning(@Nullable Boolean enablePartitioning) {
            this.enablePartitioning = Codegen.ofNullable(enablePartitioning);
            return this;
        }
        public Builder forwardDeadLetteredMessagesTo(@Nullable Output<String> forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            return this;
        }
        public Builder forwardDeadLetteredMessagesTo(@Nullable String forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = Codegen.ofNullable(forwardDeadLetteredMessagesTo);
            return this;
        }
        public Builder forwardTo(@Nullable Output<String> forwardTo) {
            this.forwardTo = forwardTo;
            return this;
        }
        public Builder forwardTo(@Nullable String forwardTo) {
            this.forwardTo = Codegen.ofNullable(forwardTo);
            return this;
        }
        public Builder lockDuration(@Nullable Output<String> lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Builder lockDuration(@Nullable String lockDuration) {
            this.lockDuration = Codegen.ofNullable(lockDuration);
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Output<Integer> maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = Codegen.ofNullable(maxDeliveryCount);
            return this;
        }
        public Builder maxSizeInMegabytes(@Nullable Output<Integer> maxSizeInMegabytes) {
            this.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }
        public Builder maxSizeInMegabytes(@Nullable Integer maxSizeInMegabytes) {
            this.maxSizeInMegabytes = Codegen.ofNullable(maxSizeInMegabytes);
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder queueName(@Nullable Output<String> queueName) {
            this.queueName = queueName;
            return this;
        }
        public Builder queueName(@Nullable String queueName) {
            this.queueName = Codegen.ofNullable(queueName);
            return this;
        }
        public Builder requiresDuplicateDetection(@Nullable Output<Boolean> requiresDuplicateDetection) {
            this.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }
        public Builder requiresDuplicateDetection(@Nullable Boolean requiresDuplicateDetection) {
            this.requiresDuplicateDetection = Codegen.ofNullable(requiresDuplicateDetection);
            return this;
        }
        public Builder requiresSession(@Nullable Output<Boolean> requiresSession) {
            this.requiresSession = requiresSession;
            return this;
        }
        public Builder requiresSession(@Nullable Boolean requiresSession) {
            this.requiresSession = Codegen.ofNullable(requiresSession);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder status(@Nullable Output<EntityStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable EntityStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public QueueArgs build() {
            return new QueueArgs(autoDeleteOnIdle, deadLetteringOnMessageExpiration, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, enableExpress, enablePartitioning, forwardDeadLetteredMessagesTo, forwardTo, lockDuration, maxDeliveryCount, maxSizeInMegabytes, namespaceName, queueName, requiresDuplicateDetection, requiresSession, resourceGroupName, status);
        }
    }
}
