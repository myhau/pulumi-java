// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventArchiveState extends io.pulumi.resources.ResourceArgs {

    public static final EventArchiveState Empty = new EventArchiveState();

    /**
     * The Amazon Resource Name (ARN) of the event archive.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of the new event archive.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Instructs the new event archive to only capture events matched by this pattern. By default, it attempts to archive every event received in the `event_source_arn`.
     * 
     */
    @InputImport(name="eventPattern")
      private final @Nullable Input<String> eventPattern;

    public Input<String> getEventPattern() {
        return this.eventPattern == null ? Input.empty() : this.eventPattern;
    }

    /**
     * Event bus source ARN from where these events should be archived.
     * 
     */
    @InputImport(name="eventSourceArn")
      private final @Nullable Input<String> eventSourceArn;

    public Input<String> getEventSourceArn() {
        return this.eventSourceArn == null ? Input.empty() : this.eventSourceArn;
    }

    /**
     * The name of the new event archive. The archive name cannot exceed 48 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The maximum number of days to retain events in the new event archive. By default, it archives indefinitely.
     * 
     */
    @InputImport(name="retentionDays")
      private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
    }

    public EventArchiveState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> eventPattern,
        @Nullable Input<String> eventSourceArn,
        @Nullable Input<String> name,
        @Nullable Input<Integer> retentionDays) {
        this.arn = arn;
        this.description = description;
        this.eventPattern = eventPattern;
        this.eventSourceArn = eventSourceArn;
        this.name = name;
        this.retentionDays = retentionDays;
    }

    private EventArchiveState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.eventPattern = Input.empty();
        this.eventSourceArn = Input.empty();
        this.name = Input.empty();
        this.retentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventArchiveState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> eventPattern;
        private @Nullable Input<String> eventSourceArn;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventArchiveState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.eventPattern = defaults.eventPattern;
    	      this.eventSourceArn = defaults.eventSourceArn;
    	      this.name = defaults.name;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEventPattern(@Nullable Input<String> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }

        public Builder setEventPattern(@Nullable String eventPattern) {
            this.eventPattern = Input.ofNullable(eventPattern);
            return this;
        }

        public Builder setEventSourceArn(@Nullable Input<String> eventSourceArn) {
            this.eventSourceArn = eventSourceArn;
            return this;
        }

        public Builder setEventSourceArn(@Nullable String eventSourceArn) {
            this.eventSourceArn = Input.ofNullable(eventSourceArn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRetentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
            return this;
        }
        public EventArchiveState build() {
            return new EventArchiveState(arn, description, eventPattern, eventSourceArn, name, retentionDays);
        }
    }
}
