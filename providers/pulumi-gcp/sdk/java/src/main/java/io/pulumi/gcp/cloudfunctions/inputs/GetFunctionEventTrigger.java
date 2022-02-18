// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.GetFunctionEventTriggerFailurePolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetFunctionEventTrigger extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionEventTrigger Empty = new GetFunctionEventTrigger();

    /**
     * The type of event to observe. For example: `"google.storage.object.finalize"`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/)
     * for a full reference of accepted triggers.
     * 
     */
    @InputImport(name="eventType", required=true)
    private final String eventType;

    public String getEventType() {
        return this.eventType;
    }

    /**
     * Policy for failed executions. Structure is documented below.
     * 
     */
    @InputImport(name="failurePolicies", required=true)
    private final List<GetFunctionEventTriggerFailurePolicy> failurePolicies;

    public List<GetFunctionEventTriggerFailurePolicy> getFailurePolicies() {
        return this.failurePolicies;
    }

    /**
     * The name of the resource whose events are being observed, for example, `"myBucket"`
     * 
     */
    @InputImport(name="resource", required=true)
    private final String resource;

    public String getResource() {
        return this.resource;
    }

    public GetFunctionEventTrigger(
        String eventType,
        List<GetFunctionEventTriggerFailurePolicy> failurePolicies,
        String resource) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.failurePolicies = Objects.requireNonNull(failurePolicies, "expected parameter 'failurePolicies' to be non-null");
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private GetFunctionEventTrigger() {
        this.eventType = null;
        this.failurePolicies = List.of();
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionEventTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventType;
        private List<GetFunctionEventTriggerFailurePolicy> failurePolicies;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionEventTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.failurePolicies = defaults.failurePolicies;
    	      this.resource = defaults.resource;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder setFailurePolicies(List<GetFunctionEventTriggerFailurePolicy> failurePolicies) {
            this.failurePolicies = Objects.requireNonNull(failurePolicies);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public GetFunctionEventTrigger build() {
            return new GetFunctionEventTrigger(eventType, failurePolicies, resource);
        }
    }
}
