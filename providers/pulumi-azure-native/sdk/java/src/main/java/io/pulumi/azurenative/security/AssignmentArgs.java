// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.AssignedComponentItemArgs;
import io.pulumi.azurenative.security.inputs.AssignedStandardItemArgs;
import io.pulumi.azurenative.security.inputs.AssignmentPropertiesAdditionalDataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    @InputImport(name="additionalData")
    private final @Nullable Input<AssignmentPropertiesAdditionalDataArgs> additionalData;

    public Input<AssignmentPropertiesAdditionalDataArgs> getAdditionalData() {
        return this.additionalData == null ? Input.empty() : this.additionalData;
    }

    @InputImport(name="assignedComponent")
    private final @Nullable Input<AssignedComponentItemArgs> assignedComponent;

    public Input<AssignedComponentItemArgs> getAssignedComponent() {
        return this.assignedComponent == null ? Input.empty() : this.assignedComponent;
    }

    @InputImport(name="assignedStandard")
    private final @Nullable Input<AssignedStandardItemArgs> assignedStandard;

    public Input<AssignedStandardItemArgs> getAssignedStandard() {
        return this.assignedStandard == null ? Input.empty() : this.assignedStandard;
    }

    @InputImport(name="assignmentId")
    private final @Nullable Input<String> assignmentId;

    public Input<String> getAssignmentId() {
        return this.assignmentId == null ? Input.empty() : this.assignmentId;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="effect")
    private final @Nullable Input<String> effect;

    public Input<String> getEffect() {
        return this.effect == null ? Input.empty() : this.effect;
    }

    @InputImport(name="expiresOn")
    private final @Nullable Input<String> expiresOn;

    public Input<String> getExpiresOn() {
        return this.expiresOn == null ? Input.empty() : this.expiresOn;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Object> metadata;

    public Input<Object> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="scope")
    private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AssignmentArgs(
        @Nullable Input<AssignmentPropertiesAdditionalDataArgs> additionalData,
        @Nullable Input<AssignedComponentItemArgs> assignedComponent,
        @Nullable Input<AssignedStandardItemArgs> assignedStandard,
        @Nullable Input<String> assignmentId,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> effect,
        @Nullable Input<String> expiresOn,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<Object> metadata,
        Input<String> resourceGroupName,
        @Nullable Input<String> scope,
        @Nullable Input<Map<String,String>> tags) {
        this.additionalData = additionalData;
        this.assignedComponent = assignedComponent;
        this.assignedStandard = assignedStandard;
        this.assignmentId = assignmentId;
        this.description = description;
        this.displayName = displayName;
        this.effect = effect;
        this.expiresOn = expiresOn;
        this.kind = kind;
        this.location = location;
        this.metadata = metadata;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.tags = tags;
    }

    private AssignmentArgs() {
        this.additionalData = Input.empty();
        this.assignedComponent = Input.empty();
        this.assignedStandard = Input.empty();
        this.assignmentId = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.effect = Input.empty();
        this.expiresOn = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scope = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AssignmentPropertiesAdditionalDataArgs> additionalData;
        private @Nullable Input<AssignedComponentItemArgs> assignedComponent;
        private @Nullable Input<AssignedStandardItemArgs> assignedStandard;
        private @Nullable Input<String> assignmentId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> effect;
        private @Nullable Input<String> expiresOn;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> metadata;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scope;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalData = defaults.additionalData;
    	      this.assignedComponent = defaults.assignedComponent;
    	      this.assignedStandard = defaults.assignedStandard;
    	      this.assignmentId = defaults.assignmentId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.effect = defaults.effect;
    	      this.expiresOn = defaults.expiresOn;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        public Builder setAdditionalData(@Nullable Input<AssignmentPropertiesAdditionalDataArgs> additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        public Builder setAdditionalData(@Nullable AssignmentPropertiesAdditionalDataArgs additionalData) {
            this.additionalData = Input.ofNullable(additionalData);
            return this;
        }

        public Builder setAssignedComponent(@Nullable Input<AssignedComponentItemArgs> assignedComponent) {
            this.assignedComponent = assignedComponent;
            return this;
        }

        public Builder setAssignedComponent(@Nullable AssignedComponentItemArgs assignedComponent) {
            this.assignedComponent = Input.ofNullable(assignedComponent);
            return this;
        }

        public Builder setAssignedStandard(@Nullable Input<AssignedStandardItemArgs> assignedStandard) {
            this.assignedStandard = assignedStandard;
            return this;
        }

        public Builder setAssignedStandard(@Nullable AssignedStandardItemArgs assignedStandard) {
            this.assignedStandard = Input.ofNullable(assignedStandard);
            return this;
        }

        public Builder setAssignmentId(@Nullable Input<String> assignmentId) {
            this.assignmentId = assignmentId;
            return this;
        }

        public Builder setAssignmentId(@Nullable String assignmentId) {
            this.assignmentId = Input.ofNullable(assignmentId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEffect(@Nullable Input<String> effect) {
            this.effect = effect;
            return this;
        }

        public Builder setEffect(@Nullable String effect) {
            this.effect = Input.ofNullable(effect);
            return this;
        }

        public Builder setExpiresOn(@Nullable Input<String> expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }

        public Builder setExpiresOn(@Nullable String expiresOn) {
            this.expiresOn = Input.ofNullable(expiresOn);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setMetadata(@Nullable Input<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = Input.ofNullable(metadata);
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

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
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

        public AssignmentArgs build() {
            return new AssignmentArgs(additionalData, assignedComponent, assignedStandard, assignmentId, description, displayName, effect, expiresOn, kind, location, metadata, resourceGroupName, scope, tags);
        }
    }
}