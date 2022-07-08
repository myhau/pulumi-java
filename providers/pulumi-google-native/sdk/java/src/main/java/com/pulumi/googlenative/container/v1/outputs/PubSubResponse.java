// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1.outputs.FilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PubSubResponse {
    /**
     * @return Enable notifications for Pub/Sub.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Allows filtering to one or more specific event types. If no filter is specified, or if a filter is specified with no event types, all event types will be sent
     * 
     */
    private final FilterResponse filter;
    /**
     * @return The desired Pub/Sub topic to which notifications will be sent by GKE. Format is `projects/{project}/topics/{topic}`.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private PubSubResponse(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("filter") FilterResponse filter,
        @CustomType.Parameter("topic") String topic) {
        this.enabled = enabled;
        this.filter = filter;
        this.topic = topic;
    }

    /**
     * @return Enable notifications for Pub/Sub.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Allows filtering to one or more specific event types. If no filter is specified, or if a filter is specified with no event types, all event types will be sent
     * 
     */
    public FilterResponse filter() {
        return this.filter;
    }
    /**
     * @return The desired Pub/Sub topic to which notifications will be sent by GKE. Format is `projects/{project}/topics/{topic}`.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubSubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private FilterResponse filter;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubSubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.filter = defaults.filter;
    	      this.topic = defaults.topic;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder filter(FilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public PubSubResponse build() {
            return new PubSubResponse(enabled, filter, topic);
        }
    }
}
