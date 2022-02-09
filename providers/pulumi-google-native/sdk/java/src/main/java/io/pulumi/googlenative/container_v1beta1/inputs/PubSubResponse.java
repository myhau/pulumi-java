// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.FilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class PubSubResponse extends io.pulumi.resources.InvokeArgs {

    public static final PubSubResponse Empty = new PubSubResponse();

    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @InputImport(name="filter", required=true)
    private final FilterResponse filter;

    public FilterResponse getFilter() {
        return this.filter;
    }

    @InputImport(name="topic", required=true)
    private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public PubSubResponse(
        Boolean enabled,
        FilterResponse filter,
        String topic) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private PubSubResponse() {
        this.enabled = null;
        this.filter = null;
        this.topic = null;
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

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setFilter(FilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public PubSubResponse build() {
            return new PubSubResponse(enabled, filter, topic);
        }
    }
}