// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VaultNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultNotificationArgs Empty = new VaultNotificationArgs();

    /**
     * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    @InputImport(name="events", required=true)
      private final Input<List<String>> events;

    public Input<List<String>> getEvents() {
        return this.events;
    }

    /**
     * The SNS Topic ARN.
     * 
     */
    @InputImport(name="snsTopic", required=true)
      private final Input<String> snsTopic;

    public Input<String> getSnsTopic() {
        return this.snsTopic;
    }

    public VaultNotificationArgs(
        Input<List<String>> events,
        Input<String> snsTopic) {
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.snsTopic = Objects.requireNonNull(snsTopic, "expected parameter 'snsTopic' to be non-null");
    }

    private VaultNotificationArgs() {
        this.events = Input.empty();
        this.snsTopic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> events;
        private Input<String> snsTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.snsTopic = defaults.snsTopic;
        }

        public Builder setEvents(Input<List<String>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setEvents(List<String> events) {
            this.events = Input.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder setSnsTopic(Input<String> snsTopic) {
            this.snsTopic = Objects.requireNonNull(snsTopic);
            return this;
        }

        public Builder setSnsTopic(String snsTopic) {
            this.snsTopic = Input.of(Objects.requireNonNull(snsTopic));
            return this;
        }
        public VaultNotificationArgs build() {
            return new VaultNotificationArgs(events, snsTopic);
        }
    }
}
