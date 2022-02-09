// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ContainerStateResponse;
import io.pulumi.azurenative.containerinstance.inputs.EventResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class InitContainerPropertiesDefinitionResponseInstanceView extends io.pulumi.resources.InvokeArgs {

    public static final InitContainerPropertiesDefinitionResponseInstanceView Empty = new InitContainerPropertiesDefinitionResponseInstanceView();

    @InputImport(name="currentState", required=true)
    private final ContainerStateResponse currentState;

    public ContainerStateResponse getCurrentState() {
        return this.currentState;
    }

    @InputImport(name="events", required=true)
    private final List<EventResponse> events;

    public List<EventResponse> getEvents() {
        return this.events;
    }

    @InputImport(name="previousState", required=true)
    private final ContainerStateResponse previousState;

    public ContainerStateResponse getPreviousState() {
        return this.previousState;
    }

    @InputImport(name="restartCount", required=true)
    private final Integer restartCount;

    public Integer getRestartCount() {
        return this.restartCount;
    }

    public InitContainerPropertiesDefinitionResponseInstanceView(
        ContainerStateResponse currentState,
        List<EventResponse> events,
        ContainerStateResponse previousState,
        Integer restartCount) {
        this.currentState = Objects.requireNonNull(currentState, "expected parameter 'currentState' to be non-null");
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.previousState = Objects.requireNonNull(previousState, "expected parameter 'previousState' to be non-null");
        this.restartCount = Objects.requireNonNull(restartCount, "expected parameter 'restartCount' to be non-null");
    }

    private InitContainerPropertiesDefinitionResponseInstanceView() {
        this.currentState = null;
        this.events = List.of();
        this.previousState = null;
        this.restartCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitContainerPropertiesDefinitionResponseInstanceView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStateResponse currentState;
        private List<EventResponse> events;
        private ContainerStateResponse previousState;
        private Integer restartCount;

        public Builder() {
    	      // Empty
        }

        public Builder(InitContainerPropertiesDefinitionResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentState = defaults.currentState;
    	      this.events = defaults.events;
    	      this.previousState = defaults.previousState;
    	      this.restartCount = defaults.restartCount;
        }

        public Builder setCurrentState(ContainerStateResponse currentState) {
            this.currentState = Objects.requireNonNull(currentState);
            return this;
        }

        public Builder setEvents(List<EventResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setPreviousState(ContainerStateResponse previousState) {
            this.previousState = Objects.requireNonNull(previousState);
            return this;
        }

        public Builder setRestartCount(Integer restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }

        public InitContainerPropertiesDefinitionResponseInstanceView build() {
            return new InitContainerPropertiesDefinitionResponseInstanceView(currentState, events, previousState, restartCount);
        }
    }
}