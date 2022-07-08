// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.eventarc.v1.outputs.DestinationResponse;
import com.pulumi.googlenative.eventarc.v1.outputs.EventFilterResponse;
import com.pulumi.googlenative.eventarc.v1.outputs.TransportResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTriggerResult {
    /**
     * @return Optional. The name of the channel associated with the trigger in `projects/{project}/locations/{location}/channels/{channel}` format. You must provide a channel to receive events from Eventarc SaaS partners.
     * 
     */
    private final String channel;
    /**
     * @return The reason(s) why a trigger is in FAILED state.
     * 
     */
    private final Map<String,String> conditions;
    /**
     * @return The creation time.
     * 
     */
    private final String createTime;
    /**
     * @return Destination specifies where the events should be sent to.
     * 
     */
    private final DestinationResponse destination;
    /**
     * @return This checksum is computed by the server based on the value of other fields, and might be sent only on create requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * @return null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    private final List<EventFilterResponse> eventFilters;
    /**
     * @return Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    private final String name;
    /**
     * @return Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    private final TransportResponse transport;
    /**
     * @return Server-assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    private final String uid;
    /**
     * @return The last-modified time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetTriggerResult(
        @CustomType.Parameter("channel") String channel,
        @CustomType.Parameter("conditions") Map<String,String> conditions,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("destination") DestinationResponse destination,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("eventFilters") List<EventFilterResponse> eventFilters,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("transport") TransportResponse transport,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.channel = channel;
        this.conditions = conditions;
        this.createTime = createTime;
        this.destination = destination;
        this.etag = etag;
        this.eventFilters = eventFilters;
        this.labels = labels;
        this.name = name;
        this.serviceAccount = serviceAccount;
        this.transport = transport;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * @return Optional. The name of the channel associated with the trigger in `projects/{project}/locations/{location}/channels/{channel}` format. You must provide a channel to receive events from Eventarc SaaS partners.
     * 
     */
    public String channel() {
        return this.channel;
    }
    /**
     * @return The reason(s) why a trigger is in FAILED state.
     * 
     */
    public Map<String,String> conditions() {
        return this.conditions;
    }
    /**
     * @return The creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Destination specifies where the events should be sent to.
     * 
     */
    public DestinationResponse destination() {
        return this.destination;
    }
    /**
     * @return This checksum is computed by the server based on the value of other fields, and might be sent only on create requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    public List<EventFilterResponse> eventFilters() {
        return this.eventFilters;
    }
    /**
     * @return Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    public TransportResponse transport() {
        return this.transport;
    }
    /**
     * @return Server-assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The last-modified time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;
        private Map<String,String> conditions;
        private String createTime;
        private DestinationResponse destination;
        private String etag;
        private List<EventFilterResponse> eventFilters;
        private Map<String,String> labels;
        private String name;
        private String serviceAccount;
        private TransportResponse transport;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.conditions = defaults.conditions;
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.etag = defaults.etag;
    	      this.eventFilters = defaults.eventFilters;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transport = defaults.transport;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public Builder conditions(Map<String,String> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder destination(DestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder eventFilters(List<EventFilterResponse> eventFilters) {
            this.eventFilters = Objects.requireNonNull(eventFilters);
            return this;
        }
        public Builder eventFilters(EventFilterResponse... eventFilters) {
            return eventFilters(List.of(eventFilters));
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder transport(TransportResponse transport) {
            this.transport = Objects.requireNonNull(transport);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetTriggerResult build() {
            return new GetTriggerResult(channel, conditions, createTime, destination, etag, eventFilters, labels, name, serviceAccount, transport, uid, updateTime);
        }
    }
}
