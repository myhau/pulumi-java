// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs();

    /**
     * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
     * 
     */
    @InputImport(name="notificationArn")
      private final @Nullable Input<String> notificationArn;

    public Input<String> getNotificationArn() {
        return this.notificationArn == null ? Input.empty() : this.notificationArn;
    }

    /**
     * The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
     * 
     */
    @InputImport(name="notificationEvents")
      private final @Nullable Input<List<String>> notificationEvents;

    public Input<List<String>> getNotificationEvents() {
        return this.notificationEvents == null ? Input.empty() : this.notificationEvents;
    }

    /**
     * When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
     * 
     */
    @InputImport(name="notificationType")
      private final @Nullable Input<String> notificationType;

    public Input<String> getNotificationType() {
        return this.notificationType == null ? Input.empty() : this.notificationType;
    }

    public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs(
        @Nullable Input<String> notificationArn,
        @Nullable Input<List<String>> notificationEvents,
        @Nullable Input<String> notificationType) {
        this.notificationArn = notificationArn;
        this.notificationEvents = notificationEvents;
        this.notificationType = notificationType;
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs() {
        this.notificationArn = Input.empty();
        this.notificationEvents = Input.empty();
        this.notificationType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> notificationArn;
        private @Nullable Input<List<String>> notificationEvents;
        private @Nullable Input<String> notificationType;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationArn = defaults.notificationArn;
    	      this.notificationEvents = defaults.notificationEvents;
    	      this.notificationType = defaults.notificationType;
        }

        public Builder setNotificationArn(@Nullable Input<String> notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }

        public Builder setNotificationArn(@Nullable String notificationArn) {
            this.notificationArn = Input.ofNullable(notificationArn);
            return this;
        }

        public Builder setNotificationEvents(@Nullable Input<List<String>> notificationEvents) {
            this.notificationEvents = notificationEvents;
            return this;
        }

        public Builder setNotificationEvents(@Nullable List<String> notificationEvents) {
            this.notificationEvents = Input.ofNullable(notificationEvents);
            return this;
        }

        public Builder setNotificationType(@Nullable Input<String> notificationType) {
            this.notificationType = notificationType;
            return this;
        }

        public Builder setNotificationType(@Nullable String notificationType) {
            this.notificationType = Input.ofNullable(notificationType);
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigGetArgs(notificationArn, notificationEvents, notificationType);
        }
    }
}
