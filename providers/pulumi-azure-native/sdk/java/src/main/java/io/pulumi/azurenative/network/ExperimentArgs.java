// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.State;
import io.pulumi.azurenative.network.inputs.ExperimentEndpointArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExperimentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,State>> enabledState;

    public Input<Either<String,State>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    @InputImport(name="endpointA")
    private final @Nullable Input<ExperimentEndpointArgs> endpointA;

    public Input<ExperimentEndpointArgs> getEndpointA() {
        return this.endpointA == null ? Input.empty() : this.endpointA;
    }

    @InputImport(name="endpointB")
    private final @Nullable Input<ExperimentEndpointArgs> endpointB;

    public Input<ExperimentEndpointArgs> getEndpointB() {
        return this.endpointB == null ? Input.empty() : this.endpointB;
    }

    @InputImport(name="experimentName")
    private final @Nullable Input<String> experimentName;

    public Input<String> getExperimentName() {
        return this.experimentName == null ? Input.empty() : this.experimentName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="profileName", required=true)
    private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ExperimentArgs(
        @Nullable Input<String> description,
        @Nullable Input<Either<String,State>> enabledState,
        @Nullable Input<ExperimentEndpointArgs> endpointA,
        @Nullable Input<ExperimentEndpointArgs> endpointB,
        @Nullable Input<String> experimentName,
        @Nullable Input<String> location,
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.enabledState = enabledState;
        this.endpointA = endpointA;
        this.endpointB = endpointB;
        this.experimentName = experimentName;
        this.location = location;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ExperimentArgs() {
        this.description = Input.empty();
        this.enabledState = Input.empty();
        this.endpointA = Input.empty();
        this.endpointB = Input.empty();
        this.experimentName = Input.empty();
        this.location = Input.empty();
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,State>> enabledState;
        private @Nullable Input<ExperimentEndpointArgs> endpointA;
        private @Nullable Input<ExperimentEndpointArgs> endpointB;
        private @Nullable Input<String> experimentName;
        private @Nullable Input<String> location;
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabledState = defaults.enabledState;
    	      this.endpointA = defaults.endpointA;
    	      this.endpointB = defaults.endpointB;
    	      this.experimentName = defaults.experimentName;
    	      this.location = defaults.location;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,State>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,State> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setEndpointA(@Nullable Input<ExperimentEndpointArgs> endpointA) {
            this.endpointA = endpointA;
            return this;
        }

        public Builder setEndpointA(@Nullable ExperimentEndpointArgs endpointA) {
            this.endpointA = Input.ofNullable(endpointA);
            return this;
        }

        public Builder setEndpointB(@Nullable Input<ExperimentEndpointArgs> endpointB) {
            this.endpointB = endpointB;
            return this;
        }

        public Builder setEndpointB(@Nullable ExperimentEndpointArgs endpointB) {
            this.endpointB = Input.ofNullable(endpointB);
            return this;
        }

        public Builder setExperimentName(@Nullable Input<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = Input.ofNullable(experimentName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProfileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ExperimentArgs build() {
            return new ExperimentArgs(description, enabledState, endpointA, endpointB, experimentName, location, profileName, resourceGroupName, tags);
        }
    }
}