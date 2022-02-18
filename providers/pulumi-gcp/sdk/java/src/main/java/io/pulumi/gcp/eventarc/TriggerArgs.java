// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerTransportArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @InputImport(name="destination", required=true)
    private final Input<TriggerDestinationArgs> destination;

    public Input<TriggerDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location", required=true)
    private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @InputImport(name="matchingCriterias", required=true)
    private final Input<List<TriggerMatchingCriteriaArgs>> matchingCriterias;

    public Input<List<TriggerMatchingCriteriaArgs>> getMatchingCriterias() {
        return this.matchingCriterias;
    }

    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @InputImport(name="transports")
    private final @Nullable Input<List<TriggerTransportArgs>> transports;

    public Input<List<TriggerTransportArgs>> getTransports() {
        return this.transports == null ? Input.empty() : this.transports;
    }

    public TriggerArgs(
        Input<TriggerDestinationArgs> destination,
        @Nullable Input<Map<String,String>> labels,
        Input<String> location,
        Input<List<TriggerMatchingCriteriaArgs>> matchingCriterias,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<List<TriggerTransportArgs>> transports) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.matchingCriterias = Objects.requireNonNull(matchingCriterias, "expected parameter 'matchingCriterias' to be non-null");
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.transports = transports;
    }

    private TriggerArgs() {
        this.destination = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.matchingCriterias = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serviceAccount = Input.empty();
        this.transports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<TriggerDestinationArgs> destination;
        private @Nullable Input<Map<String,String>> labels;
        private Input<String> location;
        private Input<List<TriggerMatchingCriteriaArgs>> matchingCriterias;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<List<TriggerTransportArgs>> transports;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.matchingCriterias = defaults.matchingCriterias;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transports = defaults.transports;
        }

        public Builder setDestination(Input<TriggerDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(TriggerDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setMatchingCriterias(Input<List<TriggerMatchingCriteriaArgs>> matchingCriterias) {
            this.matchingCriterias = Objects.requireNonNull(matchingCriterias);
            return this;
        }

        public Builder setMatchingCriterias(List<TriggerMatchingCriteriaArgs> matchingCriterias) {
            this.matchingCriterias = Input.of(Objects.requireNonNull(matchingCriterias));
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setTransports(@Nullable Input<List<TriggerTransportArgs>> transports) {
            this.transports = transports;
            return this;
        }

        public Builder setTransports(@Nullable List<TriggerTransportArgs> transports) {
            this.transports = Input.ofNullable(transports);
            return this;
        }

        public TriggerArgs build() {
            return new TriggerArgs(destination, labels, location, matchingCriterias, name, project, serviceAccount, transports);
        }
    }
}
