// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyDefinitionResult {
    /**
     * The policy definition description.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name of the policy definition.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The ID of the policy definition.
     * 
     */
    private final String id;
    /**
     * The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of the policy definition.
     * 
     */
    private final String name;
    /**
     * The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    private final @Nullable Map<String,ParameterDefinitionsValueResponse> parameters;
    /**
     * The policy rule.
     * 
     */
    private final @Nullable Object policyRule;
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    private final @Nullable String policyType;
    /**
     * The type of the resource (Microsoft.Authorization/policyDefinitions).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPolicyDefinitionResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metadata") @Nullable Object metadata,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterDefinitionsValueResponse> parameters,
        @CustomType.Parameter("policyRule") @Nullable Object policyRule,
        @CustomType.Parameter("policyType") @Nullable String policyType,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.metadata = metadata;
        this.mode = mode;
        this.name = name;
        this.parameters = parameters;
        this.policyRule = policyRule;
        this.policyType = policyType;
        this.type = type;
    }

    /**
     * The policy definition description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name of the policy definition.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The ID of the policy definition.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
    */
    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
    */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of the policy definition.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
    */
    public Map<String,ParameterDefinitionsValueResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The policy rule.
     * 
    */
    public Optional<Object> policyRule() {
        return Optional.ofNullable(this.policyRule);
    }
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
    */
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }
    /**
     * The type of the resource (Microsoft.Authorization/policyDefinitions).
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private @Nullable Object metadata;
        private @Nullable String mode;
        private String name;
        private @Nullable Map<String,ParameterDefinitionsValueResponse> parameters;
        private @Nullable Object policyRule;
        private @Nullable String policyType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policyRule = defaults.policyRule;
    	      this.policyType = defaults.policyType;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterDefinitionsValueResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder policyRule(@Nullable Object policyRule) {
            this.policyRule = policyRule;
            return this;
        }
        public Builder policyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPolicyDefinitionResult build() {
            return new GetPolicyDefinitionResult(description, displayName, id, metadata, mode, name, parameters, policyRule, policyType, type);
        }
    }
}
