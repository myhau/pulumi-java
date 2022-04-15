// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExperimentEndpointResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExperimentResult {
    /**
     * The description of the details or intents of the Experiment
     * 
     */
    private final @Nullable String description;
    /**
     * The state of the Experiment
     * 
     */
    private final @Nullable String enabledState;
    /**
     * The endpoint A of an experiment
     * 
     */
    private final @Nullable ExperimentEndpointResponse endpointA;
    /**
     * The endpoint B of an experiment
     * 
     */
    private final @Nullable ExperimentEndpointResponse endpointB;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource status.
     * 
     */
    private final String resourceState;
    /**
     * The uri to the Script used in the Experiment
     * 
     */
    private final String scriptFileUri;
    /**
     * The description of Experiment status from the server side
     * 
     */
    private final String status;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetExperimentResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabledState") @Nullable String enabledState,
        @CustomType.Parameter("endpointA") @Nullable ExperimentEndpointResponse endpointA,
        @CustomType.Parameter("endpointB") @Nullable ExperimentEndpointResponse endpointB,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("scriptFileUri") String scriptFileUri,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.enabledState = enabledState;
        this.endpointA = endpointA;
        this.endpointB = endpointB;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceState = resourceState;
        this.scriptFileUri = scriptFileUri;
        this.status = status;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The description of the details or intents of the Experiment
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The state of the Experiment
     * 
    */
    public Optional<String> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * The endpoint A of an experiment
     * 
    */
    public Optional<ExperimentEndpointResponse> endpointA() {
        return Optional.ofNullable(this.endpointA);
    }
    /**
     * The endpoint B of an experiment
     * 
    */
    public Optional<ExperimentEndpointResponse> endpointB() {
        return Optional.ofNullable(this.endpointB);
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Resource status.
     * 
    */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * The uri to the Script used in the Experiment
     * 
    */
    public String scriptFileUri() {
        return this.scriptFileUri;
    }
    /**
     * The description of Experiment status from the server side
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String enabledState;
        private @Nullable ExperimentEndpointResponse endpointA;
        private @Nullable ExperimentEndpointResponse endpointB;
        private String id;
        private @Nullable String location;
        private String name;
        private String resourceState;
        private String scriptFileUri;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabledState = defaults.enabledState;
    	      this.endpointA = defaults.endpointA;
    	      this.endpointB = defaults.endpointB;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.scriptFileUri = defaults.scriptFileUri;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder endpointA(@Nullable ExperimentEndpointResponse endpointA) {
            this.endpointA = endpointA;
            return this;
        }
        public Builder endpointB(@Nullable ExperimentEndpointResponse endpointB) {
            this.endpointB = endpointB;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder scriptFileUri(String scriptFileUri) {
            this.scriptFileUri = Objects.requireNonNull(scriptFileUri);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetExperimentResult build() {
            return new GetExperimentResult(description, enabledState, endpointA, endpointB, id, location, name, resourceState, scriptFileUri, status, tags, type);
        }
    }
}
