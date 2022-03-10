// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventBusPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventBusPolicyArgs Empty = new EventBusPolicyArgs();

    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @InputImport(name="eventBusName")
      private final @Nullable Input<String> eventBusName;

    public Input<String> getEventBusName() {
        return this.eventBusName == null ? Input.empty() : this.eventBusName;
    }

    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public EventBusPolicyArgs(
        @Nullable Input<String> eventBusName,
        Input<String> policy) {
        this.eventBusName = eventBusName;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private EventBusPolicyArgs() {
        this.eventBusName = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventBusPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eventBusName;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(EventBusPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBusName = defaults.eventBusName;
    	      this.policy = defaults.policy;
        }

        public Builder setEventBusName(@Nullable Input<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }

        public Builder setEventBusName(@Nullable String eventBusName) {
            this.eventBusName = Input.ofNullable(eventBusName);
            return this;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }
        public EventBusPolicyArgs build() {
            return new EventBusPolicyArgs(eventBusName, policy);
        }
    }
}