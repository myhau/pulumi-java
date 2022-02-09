// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.customerinsights.enums.CardinalityTypes;
import io.pulumi.azurenative.customerinsights.inputs.PropertyDefinitionArgs;
import io.pulumi.azurenative.customerinsights.inputs.RelationshipTypeMappingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RelationshipArgs extends io.pulumi.resources.ResourceArgs {

    public static final RelationshipArgs Empty = new RelationshipArgs();

    @InputImport(name="cardinality")
    private final @Nullable Input<CardinalityTypes> cardinality;

    public Input<CardinalityTypes> getCardinality() {
        return this.cardinality == null ? Input.empty() : this.cardinality;
    }

    @InputImport(name="description")
    private final @Nullable Input<Map<String,String>> description;

    public Input<Map<String,String>> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<Map<String,String>> displayName;

    public Input<Map<String,String>> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="expiryDateTimeUtc")
    private final @Nullable Input<String> expiryDateTimeUtc;

    public Input<String> getExpiryDateTimeUtc() {
        return this.expiryDateTimeUtc == null ? Input.empty() : this.expiryDateTimeUtc;
    }

    @InputImport(name="fields")
    private final @Nullable Input<List<PropertyDefinitionArgs>> fields;

    public Input<List<PropertyDefinitionArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    @InputImport(name="hubName", required=true)
    private final Input<String> hubName;

    public Input<String> getHubName() {
        return this.hubName;
    }

    @InputImport(name="lookupMappings")
    private final @Nullable Input<List<RelationshipTypeMappingArgs>> lookupMappings;

    public Input<List<RelationshipTypeMappingArgs>> getLookupMappings() {
        return this.lookupMappings == null ? Input.empty() : this.lookupMappings;
    }

    @InputImport(name="profileType", required=true)
    private final Input<String> profileType;

    public Input<String> getProfileType() {
        return this.profileType;
    }

    @InputImport(name="relatedProfileType", required=true)
    private final Input<String> relatedProfileType;

    public Input<String> getRelatedProfileType() {
        return this.relatedProfileType;
    }

    @InputImport(name="relationshipName")
    private final @Nullable Input<String> relationshipName;

    public Input<String> getRelationshipName() {
        return this.relationshipName == null ? Input.empty() : this.relationshipName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public RelationshipArgs(
        @Nullable Input<CardinalityTypes> cardinality,
        @Nullable Input<Map<String,String>> description,
        @Nullable Input<Map<String,String>> displayName,
        @Nullable Input<String> expiryDateTimeUtc,
        @Nullable Input<List<PropertyDefinitionArgs>> fields,
        Input<String> hubName,
        @Nullable Input<List<RelationshipTypeMappingArgs>> lookupMappings,
        Input<String> profileType,
        Input<String> relatedProfileType,
        @Nullable Input<String> relationshipName,
        Input<String> resourceGroupName) {
        this.cardinality = cardinality;
        this.description = description;
        this.displayName = displayName;
        this.expiryDateTimeUtc = expiryDateTimeUtc;
        this.fields = fields;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.lookupMappings = lookupMappings;
        this.profileType = Objects.requireNonNull(profileType, "expected parameter 'profileType' to be non-null");
        this.relatedProfileType = Objects.requireNonNull(relatedProfileType, "expected parameter 'relatedProfileType' to be non-null");
        this.relationshipName = relationshipName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private RelationshipArgs() {
        this.cardinality = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.expiryDateTimeUtc = Input.empty();
        this.fields = Input.empty();
        this.hubName = Input.empty();
        this.lookupMappings = Input.empty();
        this.profileType = Input.empty();
        this.relatedProfileType = Input.empty();
        this.relationshipName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CardinalityTypes> cardinality;
        private @Nullable Input<Map<String,String>> description;
        private @Nullable Input<Map<String,String>> displayName;
        private @Nullable Input<String> expiryDateTimeUtc;
        private @Nullable Input<List<PropertyDefinitionArgs>> fields;
        private Input<String> hubName;
        private @Nullable Input<List<RelationshipTypeMappingArgs>> lookupMappings;
        private Input<String> profileType;
        private Input<String> relatedProfileType;
        private @Nullable Input<String> relationshipName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.expiryDateTimeUtc = defaults.expiryDateTimeUtc;
    	      this.fields = defaults.fields;
    	      this.hubName = defaults.hubName;
    	      this.lookupMappings = defaults.lookupMappings;
    	      this.profileType = defaults.profileType;
    	      this.relatedProfileType = defaults.relatedProfileType;
    	      this.relationshipName = defaults.relationshipName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCardinality(@Nullable Input<CardinalityTypes> cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        public Builder setCardinality(@Nullable CardinalityTypes cardinality) {
            this.cardinality = Input.ofNullable(cardinality);
            return this;
        }

        public Builder setDescription(@Nullable Input<Map<String,String>> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setExpiryDateTimeUtc(@Nullable Input<String> expiryDateTimeUtc) {
            this.expiryDateTimeUtc = expiryDateTimeUtc;
            return this;
        }

        public Builder setExpiryDateTimeUtc(@Nullable String expiryDateTimeUtc) {
            this.expiryDateTimeUtc = Input.ofNullable(expiryDateTimeUtc);
            return this;
        }

        public Builder setFields(@Nullable Input<List<PropertyDefinitionArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<PropertyDefinitionArgs> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public Builder setHubName(Input<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Input.of(Objects.requireNonNull(hubName));
            return this;
        }

        public Builder setLookupMappings(@Nullable Input<List<RelationshipTypeMappingArgs>> lookupMappings) {
            this.lookupMappings = lookupMappings;
            return this;
        }

        public Builder setLookupMappings(@Nullable List<RelationshipTypeMappingArgs> lookupMappings) {
            this.lookupMappings = Input.ofNullable(lookupMappings);
            return this;
        }

        public Builder setProfileType(Input<String> profileType) {
            this.profileType = Objects.requireNonNull(profileType);
            return this;
        }

        public Builder setProfileType(String profileType) {
            this.profileType = Input.of(Objects.requireNonNull(profileType));
            return this;
        }

        public Builder setRelatedProfileType(Input<String> relatedProfileType) {
            this.relatedProfileType = Objects.requireNonNull(relatedProfileType);
            return this;
        }

        public Builder setRelatedProfileType(String relatedProfileType) {
            this.relatedProfileType = Input.of(Objects.requireNonNull(relatedProfileType));
            return this;
        }

        public Builder setRelationshipName(@Nullable Input<String> relationshipName) {
            this.relationshipName = relationshipName;
            return this;
        }

        public Builder setRelationshipName(@Nullable String relationshipName) {
            this.relationshipName = Input.ofNullable(relationshipName);
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

        public RelationshipArgs build() {
            return new RelationshipArgs(cardinality, description, displayName, expiryDateTimeUtc, fields, hubName, lookupMappings, profileType, relatedProfileType, relationshipName, resourceGroupName);
        }
    }
}