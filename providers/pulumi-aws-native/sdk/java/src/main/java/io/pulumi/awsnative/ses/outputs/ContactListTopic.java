// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContactListTopic {
    private final String defaultSubscriptionStatus;
    /**
     * The description of the topic.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name of the topic.
     * 
     */
    private final String displayName;
    /**
     * The name of the topic.
     * 
     */
    private final String topicName;

    @OutputCustomType.Constructor({"defaultSubscriptionStatus","description","displayName","topicName"})
    private ContactListTopic(
        String defaultSubscriptionStatus,
        @Nullable String description,
        String displayName,
        String topicName) {
        this.defaultSubscriptionStatus = defaultSubscriptionStatus;
        this.description = description;
        this.displayName = displayName;
        this.topicName = topicName;
    }

    public String getDefaultSubscriptionStatus() {
        return this.defaultSubscriptionStatus;
    }
    /**
     * The description of the topic.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name of the topic.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The name of the topic.
     * 
    */
    public String getTopicName() {
        return this.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactListTopic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultSubscriptionStatus;
        private @Nullable String description;
        private String displayName;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactListTopic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSubscriptionStatus = defaults.defaultSubscriptionStatus;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.topicName = defaults.topicName;
        }

        public Builder setDefaultSubscriptionStatus(String defaultSubscriptionStatus) {
            this.defaultSubscriptionStatus = Objects.requireNonNull(defaultSubscriptionStatus);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public ContactListTopic build() {
            return new ContactListTopic(defaultSubscriptionStatus, description, displayName, topicName);
        }
    }
}
