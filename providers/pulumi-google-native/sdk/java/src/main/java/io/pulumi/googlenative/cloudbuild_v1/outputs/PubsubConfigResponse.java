// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PubsubConfigResponse {
    private final String serviceAccountEmail;
    private final String state;
    private final String subscription;
    private final String topic;

    @OutputCustomType.Constructor({"serviceAccountEmail","state","subscription","topic"})
    private PubsubConfigResponse(
        String serviceAccountEmail,
        String state,
        String subscription,
        String topic) {
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
        this.state = Objects.requireNonNull(state);
        this.subscription = Objects.requireNonNull(subscription);
        this.topic = Objects.requireNonNull(topic);
    }

    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }
    public String getState() {
        return this.state;
    }
    public String getSubscription() {
        return this.subscription;
    }
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceAccountEmail;
        private String state;
        private String subscription;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSubscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public PubsubConfigResponse build() {
            return new PubsubConfigResponse(serviceAccountEmail, state, subscription, topic);
        }
    }
}